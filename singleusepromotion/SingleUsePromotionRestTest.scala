package com.wsgc.singleusepromotion

import com.wsgc.scenario.SingleUsePromotionRest
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

/**
  * SingleUsePromotionRestTest is a REST Client to load test for Single Use Promotion REST endpoints.
  */
class SingleUsePromotionRestTest extends Simulation {

  val simulationTitle = "Single Use Promotion REST Test"

  val batchId = SingleUsePromotionUtility.allocateBatch(SingleUsePromotionRest.effectiveCode, SingleUsePromotionRest.batchSize, SingleUsePromotionRest.batchExpirationTimeInMilliseconds)

  // Sleeping to allocate single use promotion codes
  SingleUsePromotionRest.logger.debug("Sleeping for 10 seconds")
  Thread.sleep(10000)

  val listOfSingleUsePromoCodes = SingleUsePromotionUtility.getListOfSingleUsePromotions(batchId)

  val singleUsePromoFeeder = for (i <- 0 until listOfSingleUsePromoCodes.size()) yield {
    Map("CONCEPT" -> "XX", "PROMO" -> listOfSingleUsePromoCodes.get(i).replaceAll("-", ""))
  }

  val triggerHttp = feed(singleUsePromoFeeder.circular)
    .exec(http("Single Use Promo Code Info endpoint").get(SingleUsePromotionRest.serviceInfoUrl)
      .header("Accept", "application/xml")
      .check(status.is(200)))
    .exec(http("Single Use Promo Code Reservation endpoint")
      .post(SingleUsePromotionRest.serviceReserveUrl)
      .header("Content-Type", "application/xml")
      .header("Accept", "application/xml")
      .body(StringBody(SingleUsePromotionRest.reserveMessage))
      .check(status.is(200))
      .check(regex("(?<=<tns:ReservationCode>)(.*\\n?)(?=</tns:ReservationCode>)").saveAs("RESERVATION_CODE")))
    .exec(http("Single Use Promo Code Release endpoint")
      .post(SingleUsePromotionRest.serviceReleaseUrl)
      .header("Content-Type", "application/xml")
      .header("Accept", "application/xml")
      .body(StringBody(SingleUsePromotionRest.releaseMessage))
      .check(status.is(200)))

  val singleUsePromoScenario = scenario(SingleUsePromotionRest.constantLoadScenario).exec(triggerHttp)

  setUp(
    singleUsePromoScenario
      .inject(constantUsersPerSec(SingleUsePromotionRest.ratePerSecond) during (SingleUsePromotionRest.durationInSeconds seconds)))
    .protocols(SingleUsePromotionRest.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(SingleUsePromotionRest.targetRequestSuccessPercentage),
      global.responseTime.mean.lte(SingleUsePromotionRest.targetMeanResponseTimeInMilliseconds),
      global.responseTime.max.lte(SingleUsePromotionRest.targetMaxResponseTimeInMilliseconds)
    )
}


