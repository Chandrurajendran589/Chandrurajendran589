#!/bin/sh

##############################################################################################################################
##
## Script to run Loyalty to C3 Email Notification through Tibco JMS queue based performance tests
## The tests can be run multiple times
##
##   Usage: runLoyaltyC3EmailNotificationTibcoTests.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

  ##  Loyalty to C3 Email Notifications Dispatch Request Tibco Tests

  runTest com.wsgc.loyalty.LoyaltyC3EmailNotificationViaTibcoTest "LoyaltyC3EmailNotificationTibcoTest_RPS-3_Dur-60_${a}" -DloyaltyC3EmailNotificationTibco.ratePerSecond=3 -DloyaltyC3EmailNotificationTibco.durationInSeconds=60
  runTest com.wsgc.loyalty.LoyaltyC3EmailNotificationViaTibcoTest "LoyaltyC3EmailNotificationTibcoTest_RPS-5_Dur-1800_${a}" -DloyaltyC3EmailNotificationTibco.ratePerSecond=5 -DloyaltyC3EmailNotificationTibco.durationInSeconds=1800

done

exit 0