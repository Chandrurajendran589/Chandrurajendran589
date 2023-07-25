package com.wsgc.shorttoken

import com.wsgc.scenario.PaymentToken
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol


import scala.concurrent.duration._

/**
  * ShortTokenGetPaymentTokenTest is a performance/stress test for grabbing multiple payment tokens.
  * 
  * 
  * @author kthao
  */
class ShortTokenGetPaymentTokenTest extends Simulation {
  
  
  var simulationTitle = "Short Token: Get Payment Token Simulation"
  var simulationShortTitle = "Short Token: Get Short Token Simulation"
  
                                   
  val triggerShortTokenEndpoint = feed(PaymentToken.shortTokenDataFeeder)
      .exec(http(simulationShortTitle)
      .post(PaymentToken.shortTokenServiceUrl)
      .header("Content-Type", "application/json")
      .body(StringBody(PaymentToken.message)) 
      .check(status.is(200))
      .check(jsonPath("$.shortToken.token").exists.saveAs("token")))
 
  val triggerPaymentTokenEndpoint = exec(
    http(simulationTitle)
      .get("${token}" + PaymentToken.paymentTokenPath)
      .check(status.is(200)))
    
      
  val getPaymentTokenScenario = scenario(PaymentToken.constantLoadScenario)
      .exec(PaymentToken.postClientCredentials, triggerShortTokenEndpoint, triggerPaymentTokenEndpoint)
  
  PaymentToken.logger.debug(s"scenario $getPaymentTokenScenario")
  setUp(
    getPaymentTokenScenario
      .inject(constantUsersPerSec(PaymentToken.ratePerSecond) during (PaymentToken.durationInSeconds seconds)))
      .protocols(PaymentToken.httpProtocol)
      .assertions(
        global.successfulRequests.percent.gte(PaymentToken.targetRequestSuccessPercentage),
        details(simulationTitle).responseTime.mean.lte(PaymentToken.targetMeanResponseTimeInMilliseconds),
        details(simulationTitle).responseTime.max.lte(PaymentToken.targetMaxResponseTimeInMilliseconds)
    )
}

