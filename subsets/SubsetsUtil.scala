package com.wsgc.subsets

import com.typesafe.config.{Config, ConfigFactory}
import io.gatling.core.Predef.{configuration, csv}
import io.gatling.core.feeder.RecordSeqFeederBuilder
import io.gatling.http.Predef.http
import io.gatling.http.protocol.HttpProtocolBuilder
import scala.concurrent.duration.{Duration, MILLISECONDS}

/**
 * Singleton utility containing configuration and common code to be used by the
 * subsets endpoint related tests.
 *
 * @author nkunta
 */
object SubsetsUtil {

  val conf: Config = ConfigFactory.load()

  val testVersion: String = Option(conf.getString("subsets.setup.testVersion")).getOrElse("")

  val pauseDuration: Duration = Duration(conf.getInt("subsets.setup.pauseDuration"), MILLISECONDS)

  val atOnceUsers: Int = conf.getInt("subsets.setup.atOnceUsers")
  val rampUsers: Int = conf.getInt("subsets.setup.rampUsers")
  val randomizedMinUsers: Int = conf.getInt("subsets.setup.randomizedMinUsers")
  val randomizedMaxUsers: Int = conf.getInt("subsets.setup.randomizedMaxUsers")
  val constantUsersPerSec: Int = conf.getInt("subsets.setup.constantUsersPerSec")

  val ratePerSecond: Int = conf.getInt("subsets.setup.ratePerSecond")
  val testDuration: Int = conf.getInt("subsets.setup.durationInSeconds")

  val rampDuration: Int = conf.getInt("subsets.setup.rampDuration")
  val constantDuration: Int = conf.getInt("subsets.setup.constantDuration")

  val throttleRps: Int = conf.getInt("subsets.setup.throttleRps")
  val throttleInDuration: Int = conf.getInt("subsets.setup.throttleInDuration")
  val throttleHoldDuration: Int = conf.getInt("subsets.setup.throttleHoldDuration")

  val targetRequestSuccessPercentage: Int = conf.getInt("subsets.setup.targetRequestSuccessPercentage")
  val targetMeanResponseTimeInMilliseconds: Int = conf.getInt("subsets.setup.targetMeanResponseTimeInMilliseconds")
  val targetMaxResponseTimeInMilliseconds: Int = conf.getInt("subsets.setup.targetMaxResponseTimeInMilliseconds")

  val serviceHost: String = conf.getString("subsets.serviceHost")

  val subsetsServiceUrl: String = serviceHost + "/api/catalog/v1/groups/${path}/subsets/0"

  val subsetsDataFeeder: RecordSeqFeederBuilder[String] = csv(conf.getString("subsets.data.subsetsFeeder")).circular

  val subsetsHttpProtocol: HttpProtocolBuilder = http.baseURL(subsetsServiceUrl)
}
