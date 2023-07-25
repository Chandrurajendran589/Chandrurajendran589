package com.wsgc.upsap

import com.wsgc.kafka.KafkaPredef.kafka
import com.wsgc.kafka.KafkaRequestActionBuilder
import com.wsgc.scenario.mdmConsumerUpsapKafka
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import scala.concurrent.duration._

/**
 * MdmConsumerUpsapViaKafkaTest is a test to assess the performance of MDM consumer over Kafka
 * where MDM publishes data and consumed by one of the interface - eCommerce.
 *
 * @author ymalli
 */

class MdmConsumerUpsapViaKafkaTest extends Simulation {

  var simulationTitle = "MDM Consumer to consume UPSAP eligible items via Kafka Simulation"

  val kafkaRequest: KafkaRequestActionBuilder[String, String] = kafka(simulationTitle)
    .send(mdmConsumerUpsapKafka.kafkaTopic,mdmConsumerUpsapKafka.message)

  val getConstantLoadScenario: ScenarioBuilder = scenario(mdmConsumerUpsapKafka.constantLoadScenario)
    .feed(mdmConsumerUpsapKafka.dataFeeder)
    .exec(kafkaRequest)

  mdmConsumerUpsapKafka.logger.debug(s"scenario $getConstantLoadScenario")

  setUp(
    getConstantLoadScenario
      .inject(constantUsersPerSec(mdmConsumerUpsapKafka.ratePerSecond) during (mdmConsumerUpsapKafka.durationInSeconds seconds)))
    .protocols(mdmConsumerUpsapKafka.kafkaConf)
    .assertions(
      global.successfulRequests.percent.gte(mdmConsumerUpsapKafka.targetRequestSuccessPercentage)
      ,details(simulationTitle).responseTime.mean.lte(mdmConsumerUpsapKafka.targetMeanResponseTimeInMilliseconds)
      ,details(simulationTitle).responseTime.max.lte(mdmConsumerUpsapKafka.targetMaxResponseTimeInMilliseconds)
    )

}
