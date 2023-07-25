package com.wsgc.wismo

import com.wsgc.scenario.OrderDetails
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.StringBody
import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status

import scala.concurrent.duration.DurationInt

/**
  * Performance test that checks the order ditails call.
  */
class OrderDetailsPerformance extends Simulation {

  val simulationTitle = "Order Details"

  val fileName = "order_details.csv"

  before {
    println("Simulation is about to start!")
    println("Users per sec = " + OrderDetails.ratePerSecond)
    println("Test duration = " + OrderDetails.durationInSeconds)
  }

  after {
    println("Simulation is finished!")
  }

  val feeder = csv(fileName)
  println("Using username: " + OrderDetails.dpUserName)
  println("Using password: " + OrderDetails.dpPassword)

  val triggerOrderDetails = feed(feeder).exec(http(simulationTitle).get(OrderDetails.serviceUrl).queryParam("orderNumber", "${orderNumber}")
    .queryParam("postalCode", "${postalCode}").basicAuth(OrderDetails.dpUserName, OrderDetails.dpPassword)
    .body(StringBody("")).check(status.is(200)))

  val orderDetailsScenario = scenario(simulationTitle).exec(triggerOrderDetails)

  setUp(
    orderDetailsScenario
      .inject(constantUsersPerSec(OrderDetails.ratePerSecond) during OrderDetails.durationInSeconds.seconds)
  )
    .protocols(OrderDetails.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(OrderDetails.targetRequestSuccessPercentage),
      details(simulationTitle).responseTime.mean.lte(OrderDetails.targetMeanResponseTimeInMilliseconds),
      details(simulationTitle).responseTime.max.lte(OrderDetails.targetMaxResponseTimeInMilliseconds)
    )

}
