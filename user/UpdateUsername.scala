package com.wsgc.user

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import com.wsgc.user.persistence.UserUtility
import com.wsgc.scenario.{Oauth, User}

import scala.concurrent.duration._

/**
  * Simulation to update usernames in bulk.
  */
class UpdateUsername extends Simulation {

  val simulationTitle = "Update Username"

  val ratePerSecond = User.conf.getLong("usr.updateUsername.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.updateUsername.durationInSeconds")

  val resourcesFilePath = "src/test/resources/data/"

  val accountsBeforeUsernameUpdateFile = "accounts_before_username_update.csv"

  val accountsAfterUsernameUpdateFile = "accounts_after_username_update.csv"

  val accountsBeforeUsernameUpdateFeeder = csv(accountsBeforeUsernameUpdateFile).records

  val accountsAfterUsernameUpdateFeeder = csv(accountsAfterUsernameUpdateFile).records

  before {
    UserUtility.deleteUsers(resourcesFilePath + accountsBeforeUsernameUpdateFile)
    UserUtility.deleteUsers(resourcesFilePath + accountsAfterUsernameUpdateFile)
    UserUtility.createUsers(resourcesFilePath + accountsBeforeUsernameUpdateFile)
  }

  after {
    UserUtility.deleteUsers(resourcesFilePath + accountsBeforeUsernameUpdateFile)
    UserUtility.deleteUsers(resourcesFilePath + accountsAfterUsernameUpdateFile)
    ClientDetailsDAO.deleteClientDetails(Oauth.clientId)
    ClientDetailsDAO.deleteClientDetails(User.userOauthClientId)
  }

  val updateUsername = feed(accountsAfterUsernameUpdateFeeder).exec(http(simulationTitle)
    .put("/me/username")
    .body(StringBody("""{"username": "${email}"}"""))
    .check(status.is(204)))

  val updateUsernameScenario = scenario(simulationTitle).exec(User.getPasswordGrantChainBuilder(accountsBeforeUsernameUpdateFeeder), updateUsername)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    updateUsernameScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )

}
