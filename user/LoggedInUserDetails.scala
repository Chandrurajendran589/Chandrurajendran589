package com.wsgc.user

import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import com.wsgc.scenario.{Oauth, User}
import com.wsgc.user.persistence.UserUtility

class LoggedInUserDetails extends Simulation {

  val simulationTitle = "User: Logged In User Details"
  val ratePerSecond = User.conf.getLong("usr.userDetails.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.userDetails.durationInSeconds")
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

  val getLoggedInUserDetails = exec(http(simulationTitle)
    .get("/me")
    .check(status.is(200)))

  val userLookupScenario = scenario(simulationTitle).exec(User.login, getLoggedInUserDetails)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    userLookupScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )
}
