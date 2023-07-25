package com.wsgc.singleusepromotion

import com.wsgc.scenario.ReleaseSingleUsePromotionRest
import io.gatling.core.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import io.gatling.http.Predef.{http, status}

import scala.concurrent.duration._

/**
 * ReleaseSingleUsePromotionViaRestTest is a test to assess the performance of Releasing Single Use Promo Code requests
 * when received via REST or HTTP endpoint.
 */
class ReleaseSingleUsePromotionViaRestTest extends Simulation {

  var simulationTitle = "Release of Single Use Promo Code request through REST Simulation"

  val triggerReleaseSingleUsePromotionRestEndpoint: ChainBuilder = feed(ReleaseSingleUsePromotionRest.dataFeeder)
    .exec(http(simulationTitle).get(ReleaseSingleUsePromotionRest.serviceUri)
    .header("Accept", "application/xml").header("Content-Type", "application/xml")
    .body(StringBody(ReleaseSingleUsePromotionRest.message)).check(status.is(200)))

  val getReleaseSingleUsePromotionRestScenario: ScenarioBuilder = scenario(ReleaseSingleUsePromotionRest.constantLoadScenario)
    .exec(triggerReleaseSingleUsePromotionRestEndpoint)

  ReleaseSingleUsePromotionRest.logger.debug(s"scenario $getReleaseSingleUsePromotionRestScenario")

  setUp(
    getReleaseSingleUsePromotionRestScenario
      .inject(constantUsersPerSec(ReleaseSingleUsePromotionRest.ratePerSecond) during (ReleaseSingleUsePromotionRest.durationInSeconds seconds)))
      .protocols(ReleaseSingleUsePromotionRest.httpProtocol)
      .assertions(
        global.successfulRequests.percent.gte(ReleaseSingleUsePromotionRest.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(ReleaseSingleUsePromotionRest.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(ReleaseSingleUsePromotionRest.targetMaxResponseTimeInMilliseconds)
      )
  }
