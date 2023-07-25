#!/bin/sh

##############################################################################################################################
##
## Script to run Loyalty Offline Enrollment through Kafka topic based performance tests
## The tests can be run multiple times
##
##   Usage: runLoyaltyOfflineEnrollmentKafkaTests.sh [nsu] [run_count] [sleep_seconds]
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
  printf "Running performance tests for Loyalty Offline Enrollment through Kafka\n"

  runTest com.wsgc.loyalty.LoyaltyOfflineEnrollmentViaKafkaTest "LoyaltyOfflineEnrollmentKafkaTest_RPS-3_Dur-60_${a}" -DloyaltyOfflineEnrollmentKafka.ratePerSecond=3 -DloyaltyOfflineEnrollmentKafka.durationInSeconds=60
  runTest com.wsgc.loyalty.LoyaltyOfflineEnrollmentViaKafkaTest "LoyaltyOfflineEnrollmentKafkaTest_RPS-5_Dur-1800_${a}" -DloyaltyOfflineEnrollmentKafka.ratePerSecond=5 -DloyaltyOfflineEnrollmentKafka.durationInSeconds=1800
  runTest com.wsgc.loyalty.LoyaltyOfflineEnrollmentViaKafkaTest "LoyaltyOfflineEnrollmentKafkaTest_RPS-10_Dur-1800_${a}" -DloyaltyOfflineEnrollmentKafka.ratePerSecond=10 -DloyaltyOfflineEnrollmentKafka.durationInSeconds=1800
  runTest com.wsgc.loyalty.LoyaltyOfflineEnrollmentViaKafkaTest "LoyaltyOfflineEnrollmentKafkaTest_RPS-15_Dur-1800_${a}" -DloyaltyOfflineEnrollmentKafka.ratePerSecond=15 -DloyaltyOfflineEnrollmentKafka.durationInSeconds=1800

  printf "Test execution completed. Generated report can be found in 'target' directory.\n"

done

exit 0