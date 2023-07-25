package com.wsgc.singleusepromotion

import io.gatling.core.scenario.Simulation
import io.gatling.jms.Predef._
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.jms.request.JmsSendRequestBuilder
import com.wsgc.scenario.ReleaseSingleUsePromotionTibco._
import scala.concurrent.duration._

/**
  * ReleaseSingleUsePromotionViaTibcoTest is a test to assess the performance of Releasing Single Use Promo Code requests
  * when received via TIBCO interfacing.
  */

class ReleaseSingleUsePromotionViaTibcoTest extends Simulation {
  val simulationTitle = "Release of Single Use Promo code through Tibco JMS"

  val jmsRequest: JmsSendRequestBuilder = jms(simulationTitle)
    .send
    .queue(queueName)
    .textMessage(message)

  val getConstantLoadScenario: ScenarioBuilder = scenario(constantLoadScenario)
    .feed(singleUsePromoCodeDataFeeder)
    .exec(jmsRequest)

  logger.debug(s"scenario $getConstantLoadScenario")

  setUp(
    getConstantLoadScenario
      .inject(constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds)))
    .protocols(jmsProtocol)
    .assertions(
      global.successfulRequests.percent.gte(targetRequestSuccessPercentage)
      , details(simulationTitle).responseTime.mean.lte(targetMeanResponseTimeInMilliseconds)
      , details(simulationTitle).responseTime.max.lte(targetMaxResponseTimeInMilliseconds)
    )
}
