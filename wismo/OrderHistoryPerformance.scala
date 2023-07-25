package com.wsgc.wismo

import com.wsgc.scenario.OrderHistory
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.StringBody
import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status

import scala.collection.immutable.HashMap
import scala.concurrent.duration.DurationInt

/**
  * Performance test that checks the order history call.
  */
class OrderHistoryPerformance extends Simulation {

  val simulationTitle = "Order History"

  val fileName = "order_history.csv"

  before {
    println("Simulation is about to start!")
    println("Users per sec = " + OrderHistory.ratePerSecond)
    println("Test duration = " + OrderHistory.durationInSeconds)
  }

  after {
    println("Simulation is finished!")
  }

  var urlCookieHeaders = HashMap(
    "Cookie" -> OrderHistory.cookie
  )

  val feeder = csv(fileName)
    println("Using Cookie: " + urlCookieHeaders)

  val triggerOrderHistory = feed(feeder).exec(http(simulationTitle).get(OrderHistory.serviceUrl).queryParam("pageNumber", "${pageNumber}")
    .headers(urlCookieHeaders)
    .body(StringBody("")).check(status.is(200)))

  val orderHistoryScenario = scenario(simulationTitle).exec(triggerOrderHistory)

  setUp(
    orderHistoryScenario
      .inject(constantUsersPerSec(OrderHistory.ratePerSecond) during OrderHistory.durationInSeconds.seconds)
  )
    .protocols(OrderHistory.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(OrderHistory.targetRequestSuccessPercentage),
      details(simulationTitle).responseTime.mean.lte(OrderHistory.targetMeanResponseTimeInMilliseconds),
      details(simulationTitle).responseTime.max.lte(OrderHistory.targetMaxResponseTimeInMilliseconds)
    )

}
