package com.wsgc.wismo

import com.wsgc.scenario.OrderSearch
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.csv
import io.gatling.core.Predef.feed
import io.gatling.core.Predef.StringBody
import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status

import scala.concurrent.duration.DurationInt

/**
  * Performance test that checks the Order Search service.
  */
class OrderSearchPerformance extends Simulation {


  val simulationTitle = "Order Search"

  val fileName = "order_search.csv"

  before {
    println("Simulation is about to start!")
    println("Users per sec = " + OrderSearch.ratePerSecond)
    println("Test duration = " + OrderSearch.durationInSeconds)
  }

  after {
    println("Simulation is finished!")
  }

  val feeder = csv(fileName)
  println("Using username: " + OrderSearch.dpUserName)
  println("Using password: " + OrderSearch.dpPassword)

  val triggerOrderSearch = feed(feeder).exec(http(simulationTitle).get(OrderSearch.serviceUrl).queryParam("orderNumber", "${orderNumber}")
    .queryParam("z0", "${z0}").basicAuth(OrderSearch.dpUserName, OrderSearch.dpPassword)
    .body(StringBody("")).check(status.is(200)))

  val orderSearchScenario = scenario(simulationTitle).exec(triggerOrderSearch)

  setUp(
    orderSearchScenario
      .inject(constantUsersPerSec(OrderSearch.ratePerSecond) during OrderSearch.durationInSeconds.seconds)
  )
    .protocols(OrderSearch.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(OrderSearch.targetRequestSuccessPercentage),
      details(simulationTitle).responseTime.mean.lte(OrderSearch.targetMeanResponseTimeInMilliseconds),
      details(simulationTitle).responseTime.max.lte(OrderSearch.targetMaxResponseTimeInMilliseconds)
    )


}
