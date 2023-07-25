package com.wsgc.user

import com.wsgc.clientdetails.persistence.ClientDetailsDAO
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import com.wsgc.scenario.{Oauth, User}
import com.wsgc.user.persistence.UserUtility

class PasswordResetEmail extends Simulation {

  val simulationTitle = "Email Action: Reset Password"
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

  val ratePerSecond = User.conf.getLong("usr.passwordResetEmail.ratePerSecond")
  val durationInSeconds = User.conf.getLong("usr.passwordResetEmail.durationInSeconds")

  val triggerPasswordResetEmail = feed(User.feeder.random).exec(http(simulationTitle).post("/${email}/emailAction")
    .queryParamSeq(Seq(("emailType", "passwordReset"), ("conceptCode", "PB"))).check(status.is(204)))

  val emailActionForgotPasswordScenario = scenario(simulationTitle).exec(User.clientCredentials, triggerPasswordResetEmail)

  println("ratePerSecond:     " + ratePerSecond)
  println("durationInSeconds: " + durationInSeconds)

  setUp(
    emailActionForgotPasswordScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )

}
