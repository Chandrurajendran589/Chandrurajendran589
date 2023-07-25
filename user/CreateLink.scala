package com.wsgc.user

import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import com.wsgc.scenario.{Oauth, User}
import com.wsgc.user.persistence.UserUtility
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

/**
  * Test simulation to create links in bulk.
  */
class CreateLink extends Simulation {

  val simulationTitle = "Create Link"
  val resourcesFilePath = "src/test/resources/data/"
  val accountsFile = "create_link_accounts.csv"

  before {
    UserUtility.deleteUsers(resourcesFilePath + accountsFile)
    UserUtility.createUsers(resourcesFilePath + accountsFile)
  }

  after {
    UserUtility.deleteUsers(resourcesFilePath + accountsFile)
    ClientDetailsDAO.deleteClientDetails(Oauth.clientId)
    ClientDetailsDAO.deleteClientDetails(User.userOauthClientId)
  }

  val ratePerSecond = User.conf.getLong("usr.createLink.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.createLink.durationInSeconds")

  val feeder = csv(accountsFile)

  val createLink = exec(http(simulationTitle)
    .post("/me/link")
    .body(StringBody("""{"identityType": "PREAUTH"}"""))
    .check(status.is(201)))

  val createLinkScenario = scenario(simulationTitle).exec(User.getPasswordGrantChainBuilder(feeder.records), createLink)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    createLinkScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )


}
