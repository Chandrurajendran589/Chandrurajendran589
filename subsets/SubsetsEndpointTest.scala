package com.wsgc.subsets

import io.gatling.core.structure._
import io.gatling.http.Predef._
import org.slf4j.LoggerFactory
import io.gatling.core.Predef._
import scala.concurrent.duration._

/**
 * SubsetsEndpointTest is a test to assess the performance of subsets endpoint.
 *
 * @author nkunta
 */

class SubsetsEndpointTest extends Simulation {

  private val logger = LoggerFactory.getLogger(this.getClass)

  val simulationTitle = "Subsets Endpoint Test"

  val subsetsRequest: ChainBuilder = feed(SubsetsUtil.subsetsDataFeeder)
    .exec(http(simulationTitle)
      .get(SubsetsUtil.subsetsServiceUrl)
      .queryParam("paginate", "count")
      .headers(SubsetsHeader.subsetsHeaders)
      .check(status.is(200)))

  val subsetsScenario: ScenarioBuilder = scenario(simulationTitle).exec(subsetsRequest)
    .pause(SubsetsUtil.pauseDuration)

  if (SubsetsUtil.testVersion == "atOnceUsers") {
    logger.info("Running SubsetsEndpointTest with test version: atOnceUsers")
    setUp(
      subsetsScenario
        .inject(atOnceUsers(SubsetsUtil.atOnceUsers))
        .protocols(SubsetsUtil.subsetsHttpProtocol))
      .assertions(
        global.successfulRequests.percent.gte(SubsetsUtil.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(SubsetsUtil.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(SubsetsUtil.targetMaxResponseTimeInMilliseconds)
      )
  }
  else if (SubsetsUtil.testVersion == "rampUsers") {
    logger.info("Running SubsetsEndpointTest with test version: rampUsers")
    setUp(
      subsetsScenario
        .inject(rampUsers(SubsetsUtil.rampUsers) over (SubsetsUtil.rampDuration seconds))
        .throttle((reachRps(SubsetsUtil.throttleRps) in (SubsetsUtil.throttleInDuration seconds)),
          holdFor(SubsetsUtil.throttleHoldDuration seconds))
        .protocols(SubsetsUtil.subsetsHttpProtocol)
    )
      .assertions(
        global.successfulRequests.percent.gte(SubsetsUtil.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(SubsetsUtil.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(SubsetsUtil.targetMaxResponseTimeInMilliseconds)
      )
  }
  else if (SubsetsUtil.testVersion == "randomizedUsers") {
    logger.info("Running SubsetsEndpointTest with test version: randomizedUsers")
    setUp(
      subsetsScenario
        .inject(rampUsersPerSec(SubsetsUtil.randomizedMinUsers) to (SubsetsUtil.randomizedMaxUsers) during (SubsetsUtil.rampDuration seconds))
        .protocols(SubsetsUtil.subsetsHttpProtocol)
    )
      .assertions(
        global.successfulRequests.percent.gte(SubsetsUtil.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(SubsetsUtil.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(SubsetsUtil.targetMaxResponseTimeInMilliseconds)
      )
  }
  else if (SubsetsUtil.testVersion == "constantUsersPerSec") {
    logger.info("Running SubsetsEndpointTest with test version: constantUsersPerSec")
    setUp(
      subsetsScenario
        .inject(constantUsersPerSec(SubsetsUtil.constantUsersPerSec) during (SubsetsUtil.constantDuration seconds))
        .throttle((reachRps(SubsetsUtil.throttleRps) in (SubsetsUtil.throttleInDuration seconds)),
          holdFor(SubsetsUtil.throttleHoldDuration seconds))
        .protocols(SubsetsUtil.subsetsHttpProtocol)
        .protocols(SubsetsUtil.subsetsHttpProtocol)
    )
      .assertions(
        global.successfulRequests.percent.gte(SubsetsUtil.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(SubsetsUtil.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(SubsetsUtil.targetMaxResponseTimeInMilliseconds)
      )
  }

}
