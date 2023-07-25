#!/bin/sh

##############################################################################################################################
##
## Script to run CRE Visitor Data Publish through Kafka based performance tests
## The tests can be run multiple times
##
##   Usage: runCreVisitorDataKafkaTests.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

for a in `seq 1 "${RUN_COUNT}"`; do
  echo "Sleeping for ${SLEEP_SECONDS} seconds..."
  sleep "${SLEEP_SECONDS}"
  printf "Running performance tests for CRE Visitor Data requests through Kafka\n"

  runTest com.wsgc.cre.CreVisitorDataPublishViaKafkaTest "CreVisitorDataKafkaTest_RPS-3_Dur-60_${a}" -DcreVisitorDataKafka.ratePerSecond=3 -DcreVisitorDataKafka.durationInSeconds=60
  runTest com.wsgc.cre.CreVisitorDataPublishViaKafkaTest "CreVisitorDataKafkaTest_RPS-5_Dur-1800_${a}" -DcreVisitorDataKafka.ratePerSecond=5 -DcreVisitorDataKafka.durationInSeconds=1800
  runTest com.wsgc.cre.CreVisitorDataPublishViaKafkaTest "CreVisitorDataKafkaTest_RPS-10_Dur-1800_${a}" -DcreVisitorDataKafka.ratePerSecond=10 -DcreVisitorDataKafka.durationInSeconds=1800
  runTest com.wsgc.cre.CreVisitorDataPublishViaKafkaTest "CreVisitorDataKafkaTest_RPS-15_Dur-1800_${a}" -DcreVisitorDataKafka.ratePerSecond=15 -DcreVisitorDataKafka.durationInSeconds=1800

  printf "Test execution completed. Generated report can be found in 'target' directory.\n"

done

exit 0