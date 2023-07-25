package com.wsgc.user

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import com.wsgc.user.persistence.UserUtility
import com.wsgc.scenario.{Oauth, User}

import scala.concurrent.duration._

/**
  * Simulation to update user passwords in bulk.
  */
class UpdatePassword extends Simulation {

  val simulationTitle = "Update Password"

  val ratePerSecond = User.conf.getLong("usr.updatePassword.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.updatePassword.durationInSeconds")

  val resourcesFilePath = "src/test/resources/data/"

  val accountsBeforePasswordUpdateFile = "accounts_before_password_update.csv"

  val accountsAfterPasswordUpdateFile = "accounts_after_password_update.csv"


  val accountsBeforePasswordUpdateFeeder = csv(accountsBeforePasswordUpdateFile).records

  val accountsAfterPasswordUpdateFeeder = csv(accountsAfterPasswordUpdateFile).records

  before {
    UserUtility.deleteUsers(resourcesFilePath + accountsBeforePasswordUpdateFile)
    UserUtility.createUsers(resourcesFilePath + accountsBeforePasswordUpdateFile)
  }

  after {
    UserUtility.deleteUsers(resourcesFilePath + accountsBeforePasswordUpdateFile)
    ClientDetailsDAO.deleteClientDetails(Oauth.clientId)
    ClientDetailsDAO.deleteClientDetails(User.userOauthClientId)
  }

  val updatePassword = feed(accountsAfterPasswordUpdateFeeder).exec(http(simulationTitle)
    .put("/me/password")
    .body(StringBody("""{"password": "${password}" , "resetPassword" : false}"""))
    .check(status.is(204)))

  val updatePasswordScenario = scenario(simulationTitle).exec(User.getPasswordGrantChainBuilder(accountsBeforePasswordUpdateFeeder), updatePassword)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    updatePasswordScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )

}
