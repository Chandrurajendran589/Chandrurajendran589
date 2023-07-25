package com.wsgc.shoppingcart

import com.wsgc.dp.chain.PipChains.loadItemsChain
import com.wsgc.dp.util.TestUtility.{conf, randomItemNumber}
import com.wsgc.scenario.ShoppingCartApi
import io.gatling.core.Predef.{Simulation, _}
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef.{bodyString, http}
import io.gatling.http.cookie.CookieJar
import io.gatling.http.request.builder.HttpRequestBuilder
import io.netty.handler.codec.http.cookie.ClientCookieDecoder.LAX.decode
import org.asynchttpclient.uri.Uri

import scala.concurrent.duration.DurationInt

/**
 * Performance tests for the shopping cart - update quantity api.
 *
 * @author phasthalapuram1
 */
class UpdateQuantityApiTest extends Simulation {

  val simulationTitle = "Shopping Cart API: UpdateQuantity"

  before {
    println("Simulation is about to start!")
  }

  after {
    println("Simulation is finished!")
  }

  val triggerUpdateQuantity: HttpRequestBuilder = http(simulationTitle).post(ShoppingCartApi.serviceUrl + ShoppingCartApi.updateQuantity)
    .body(ElFileBody(ShoppingCartApi.updateQuantityRequest)).asJSON
    .check(bodyString.saveAs("updateQuantityResponse"))

  val updateQuantityScenario: ScenarioBuilder = scenario(simulationTitle)
    .exec(_.set("itemTimes", randomItemNumber()).set("itemQuantity", conf.getInt("dp.pip.addItem.itemQuantity")))
    .feed(csv(conf.getString("shoppingCartApi.dataCsv")).circular)
    .exec(loadItemsChain())
    .exitHereIfFailed
    .pause(ShoppingCartApi.pauseDuration)
    .exec(session => {
      val cookies = session.get("gatling.http.cookies").as[CookieJar]
        .get(Uri.create(ShoppingCartApi.serviceUrl))
      println(s"Cookies : \n$cookies")
      session
    })
    .exec(triggerUpdateQuantity)
    .exec(session => {
      val updateResponse = session("updateQuantityResponse").as[String]
      println(s"Update Quantity Response body: \n$updateResponse")
      session
    })

  setUp(
    updateQuantityScenario
      .inject(constantUsersPerSec(ShoppingCartApi.ratePerSecond) during ShoppingCartApi.durationInSeconds.seconds)
      .protocols(ShoppingCartApi.httpProtocol))
    .assertions(
      global.successfulRequests.percent.gte(ShoppingCartApi.targetRequestSuccessPercentage),
      details(simulationTitle).responseTime.mean.lte(ShoppingCartApi.targetMeanResponseTimeInMilliseconds),
      details(simulationTitle).responseTime.max.lte(ShoppingCartApi.targetMaxResponseTimeInMilliseconds)
    )
}
