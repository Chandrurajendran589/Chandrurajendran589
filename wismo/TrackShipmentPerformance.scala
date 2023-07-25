package com.wsgc.wismo

import com.wsgc.scenario.TrackShipment
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.StringBody
import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status

import scala.concurrent.duration.DurationInt

/**
  * Performance test that checks the Track Shipment service.
  */
class TrackShipmentPerformance extends Simulation {
  val simulationTitle = "Track Shipment"

  val fileName = "track_shipment.csv"

  before {
    println("Simulation is about to start!")
    println("Users per sec = " + TrackShipment.ratePerSecond)
    println("Test duration = " + TrackShipment.durationInSeconds)
  }

  after {
    println("Simulation is finished!")
  }

  val feeder = csv(fileName)
  println("Using username: " + TrackShipment.dpUserName)
  println("Using password: " + TrackShipment.dpPassword)

  val triggerTrackShipment = feed(feeder).exec(http(simulationTitle).get(TrackShipment.serviceUrl).queryParam("trackingnumber", "${trackingnumber}")
    .basicAuth(TrackShipment.dpUserName, TrackShipment.dpPassword)
    .body(StringBody("")).check(status.is(200)))

  val trackShipmentScenario = scenario(simulationTitle).exec(triggerTrackShipment)

  setUp(
    trackShipmentScenario
      .inject(constantUsersPerSec(TrackShipment.ratePerSecond) during TrackShipment.durationInSeconds.seconds)
  )
    .protocols(TrackShipment.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(TrackShipment.targetRequestSuccessPercentage),
      details(simulationTitle).responseTime.mean.lte(TrackShipment.targetMeanResponseTimeInMilliseconds),
      details(simulationTitle).responseTime.max.lte(TrackShipment.targetMaxResponseTimeInMilliseconds)
    )

}
