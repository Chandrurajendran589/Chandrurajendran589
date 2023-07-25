package com.wsgc.shorttoken

import com.wsgc.scenario.ShortToken
import io.gatling.core.Predef._
import scala.concurrent.duration._
import io.gatling.http.Predef.http
import io.gatling.http.Predef.status

/**
  * ShortTokenGetShortTokenTest is a performance/stress test for grabbing multiple short tokens.
  * 
  * 
  * author @kthao
  */
class ShortTokenGetShortTokenTest extends Simulation {

  var simulationTitle = "ShortToken: Get Short Token Simulation"

  val triggerShortTokenEndpoint = feed(ShortToken.shortTokenDataFeeder)
    .exec(http(simulationTitle).post(ShortToken.serviceUrl)
    .header("Content-Type", "application/json")
    .body(StringBody(ShortToken.message)).check(status.is(200)))

  val getShortTokenScenario = scenario(ShortToken.constantLoadScenario).exec(ShortToken.postClientCredentials, triggerShortTokenEndpoint)

  ShortToken.logger.debug(s"scenario $getShortTokenScenario")

  setUp(
    getShortTokenScenario
      .inject(constantUsersPerSec(ShortToken.ratePerSecond) during (ShortToken.durationInSeconds seconds)))
      .protocols(ShortToken.httpProtocol)
      .assertions(
        global.successfulRequests.percent.gte(ShortToken.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(ShortToken.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(ShortToken.targetMaxResponseTimeInMilliseconds)
    )
}

