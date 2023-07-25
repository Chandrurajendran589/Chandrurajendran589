package com.wsgc.wismo

import com.wsgc.scenario.TrackingDetails
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.StringBody
import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status

import scala.concurrent.duration.DurationInt

/**
  * Performance test that checks the tracking details call.
  */
class TrackingDetailsPerformance extends Simulation {

  val simulationTitle = "Tracking Details"

  val fileName = "tracking_details.csv"

  before {
    println("Simulation is about to start!")
    println("Users per sec = " + TrackingDetails.ratePerSecond)
    println("Test duration = " + TrackingDetails.durationInSeconds)
  }

  after {
    println("Simulation is finished!")
  }

  val feeder = csv(fileName)
  println("Using username: " + TrackingDetails.dpUserName)
  println("Using password: " + TrackingDetails.dpPassword)

  val triggerOrderDetails = feed(feeder).exec(http(simulationTitle).get(TrackingDetails.serviceUrl).queryParam("trackingNumber", "${trackingNumber}")
    .queryParam("carrier", "${carrier}").basicAuth(TrackingDetails.dpUserName, TrackingDetails.dpPassword)
    .body(StringBody("")).check(status.is(200)))

  val orderDetailsScenario = scenario(simulationTitle).exec(triggerOrderDetails)

  setUp(
    orderDetailsScenario
      .inject(constantUsersPerSec(TrackingDetails.ratePerSecond) during TrackingDetails.durationInSeconds.seconds)
  )
    .protocols(TrackingDetails.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(TrackingDetails.targetRequestSuccessPercentage),
      details(simulationTitle).responseTime.mean.lte(TrackingDetails.targetMeanResponseTimeInMilliseconds),
      details(simulationTitle).responseTime.max.lte(TrackingDetails.targetMaxResponseTimeInMilliseconds)
    )

}
