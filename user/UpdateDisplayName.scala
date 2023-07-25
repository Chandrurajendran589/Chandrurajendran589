package com.wsgc.user

import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import com.wsgc.scenario.{Oauth, User}
import com.wsgc.user.persistence.UserUtility

class UpdateDisplayName extends Simulation {

  val simulationTitle = "User: Update Display Name"
  val ratePerSecond = User.conf.getLong("usr.updateDisplayName.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.updateDisplayName.durationInSeconds")
  val dataFile = User.dataDirectory + User.feederFileName

  before {
    UserUtility.deleteUsers(dataFile)
    UserUtility.createUsers(dataFile)
  }

  after {
    UserUtility.deleteUsers(dataFile)
    ClientDetailsDAO.deleteClientDetails(Oauth.clientId)
    ClientDetailsDAO.deleteClientDetails(User.userOauthClientId)
  }

  val updateDisplayName = feed(User.feeder.random).exec(http(simulationTitle)
    .put("/me/displayname")
    .body(StringBody("""{"displayName": "${displayName}"}"""))
    .check(status.is(204)))

  val updateDisplayNameScenario = scenario(simulationTitle).exec(User.login, updateDisplayName)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    updateDisplayNameScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )
}
