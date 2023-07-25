package com.wsgc.user

import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import com.wsgc.scenario.{Oauth, User}
import com.wsgc.user.persistence.{UserUtility}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

/**
  * Test simulation to create users in bulk.
  */
class CreateUser extends Simulation {

  val simulationTitle = "User: Create User"
  val ratePerSecond = User.conf.getLong("usr.create.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.create.durationInSeconds")

  val feederFileName = "create_accounts_qa.csv"
  before {
    UserUtility.deleteUsers(User.dataDirectory + feederFileName)
  }

  after {
    UserUtility.deleteUsers(User.dataDirectory + feederFileName)
    ClientDetailsDAO.deleteClientDetails(Oauth.clientId)
    ClientDetailsDAO.deleteClientDetails(User.userOauthClientId)
  }

  val feeder = csv(feederFileName)

  // set up the data feed and create user REST request
  val createUserRequest = feed(feeder)
    .exec(http(simulationTitle)
      .post("")
      .body(StringBody("""{"username": "${email}", "password": "${password}", "displayName": "${displayName}", "authorities": ["ROLE_FULLY_AUTHENTICATED","ROLE_USER"]}"""))
      .check(status.is(201)))

  // glue the auth and user service request into a single scenario
  val createUserScenario = scenario(simulationTitle).exec(User.clientCredentials, createUserRequest)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)
  // run the test and validate against the specified thresholds
  setUp(
    createUserScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )
}
