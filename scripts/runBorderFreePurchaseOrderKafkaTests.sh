#!/bin/sh

##############################################################################################################################
##
## Script to run BorderFree Purchase Order create request to Sterling through Kafka based performance tests
## The tests can be run multiple times
##
##   Usage: runBorderFreePurchaseOrderKafkaTests.sh [nsu] [run_count] [sleep_seconds]
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
  printf "Running performance tests for BorderFree Purchase Order create request to Sterling through Kafka\n"

  runTest com.wsgc.borderfree.BorderFreePurchaseOrderViaKafkaTest "BorderFreePurchaseOrderKafkaTest_RPS-3_Dur-60_${a}" -DborderFreePurchaseOrderKafka.ratePerSecond=3 -DborderFreePurchaseOrderKafka.durationInSeconds=60
  runTest com.wsgc.borderfree.BorderFreePurchaseOrderViaKafkaTest "BorderFreePurchaseOrderKafkaTest_RPS-5_Dur-1800_${a}" -DborderFreePurchaseOrderKafka.ratePerSecond=5 -DborderFreePurchaseOrderKafka.durationInSeconds=1800
  runTest com.wsgc.borderfree.BorderFreePurchaseOrderViaKafkaTest "BorderFreePurchaseOrderKafkaTest_RPS-10_Dur-1800_${a}" -DborderFreePurchaseOrderKafka.ratePerSecond=10 -DborderFreePurchaseOrderKafka.durationInSeconds=1800
  runTest com.wsgc.borderfree.BorderFreePurchaseOrderViaKafkaTest "BorderFreePurchaseOrderKafkaTest_RPS-15_Dur-1800_${a}" -DborderFreePurchaseOrderKafka.ratePerSecond=15 -DborderFreePurchaseOrderKafka.durationInSeconds=1800

  printf "Test execution completed. Generated report can be found in 'target' directory.\n"

done

exit 0