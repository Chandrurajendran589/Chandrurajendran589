package com.wsgc.user

import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import com.wsgc.scenario.{Oauth, User}
import com.wsgc.user.persistence.UserUtility

class ConfirmUser extends Simulation {

  val simulationTitle = "Confirm User"
  val dataFile = User.dataDirectory + User.feederFileName

  val ratePerSecond = User.conf.getLong("usr.confirm.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.confirm.durationInSeconds")

  before {
    UserUtility.deleteUsers(dataFile)
    UserUtility.createUsers(dataFile)
  }

  after {
    UserUtility.deleteUsers(dataFile)
    ClientDetailsDAO.deleteClientDetails(Oauth.clientId)
    ClientDetailsDAO.deleteClientDetails(User.userOauthClientId)
  }

  val confirmUser = exec(http(simulationTitle).put("/me/confirm").body(StringBody("""{"confirmUser":true}""")).check(status.is(204)))

  val confirmUserScenario = scenario("Confirm User").exec(User.login, confirmUser)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    confirmUserScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )
}
