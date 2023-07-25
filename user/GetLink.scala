package com.wsgc.user

import com.wsgc.scenario.User
import com.wsgc.user.persistence.UserUtility
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

/**
  * Test simulation to get links in bulk.
  */
class GetLink extends Simulation {

  private val simulationTitle = "Get Link"

  private val ratePerSecond = User.conf.getLong("usr.getLink.ratePerSecond")
  private val durationInSeconds = User.conf.getLong("usr.getLink.durationInSeconds")

  private val resourcesFilePath = "src/test/resources/data/"

  private val accountsFile = "get_link_accounts.csv"

  before {
    println("deleting users from last test run...")
    UserUtility.deleteUsers(resourcesFilePath + accountsFile)

    println("creating users with profiles...")
    UserUtility.createUsers(resourcesFilePath + accountsFile)

    println("creating links...")
    UserUtility.linkUsers(resourcesFilePath + accountsFile, "preauth")
  }

  after {
    println("deleting users...")
    UserUtility.deleteUsers(resourcesFilePath + accountsFile)
  }

  private val feeder = csv(accountsFile).records

  private val getLink = exec(http(simulationTitle)
    .get("/me/link")
    .queryParamSeq(Seq(("identitytype", "preauth")))
    .check(status.is(200)))

  private val getLinkScenario = scenario(simulationTitle).exec(User.getPasswordGrantChainBuilder(feeder), getLink)

  setUp(
    getLinkScenario.inject(
      constantUsersPerSec(ratePerSecond) during (durationInSeconds seconds))
  )
    .protocols(User.httpProtocol)
    .assertions(
      global.successfulRequests.percent.gte(User.targetRequestSuccessPercentage), // for all requests
      details(simulationTitle).responseTime.mean.lte(User.targetMeanResponseTimeInMilliseconds), // for specific group of requests
      details(simulationTitle).responseTime.max.lte(User.targetMaxResponseTimeInMilliseconds)
    )

}
