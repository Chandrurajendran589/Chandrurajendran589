#!/bin/sh

##############################################################################################################################
##
## Script to run BorderFree Purchase Order create request to Sterling through Tibco JMS queue based performance tests
## The tests can be run multiple times
##
##   Usage: runBorderFreePurchaseOrderTibcoTests.sh [nsu] [run_count] [sleep_seconds]
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
  printf "Running performance tests for BorderFree Purchase Order create request to Sterling through Tibco Jms\n"

  runTest com.wsgc.borderfree.BorderFreePurchaseOrderViaTibcoTest "BorderFreePurchaseOrderTibcoTest_RPS-3_Dur-60_${a}" -DborderFreePurchaseOrderTibco.ratePerSecond=3 -DborderFreePurchaseOrderTibco.durationInSeconds=60
  runTest com.wsgc.borderfree.BorderFreePurchaseOrderViaTibcoTest "BorderFreePurchaseOrderTibcoTest_RPS-5_Dur-1800_${a}" -DborderFreePurchaseOrderTibco.ratePerSecond=5 -DborderFreePurchaseOrderTibco.durationInSeconds=1800

  printf "Test execution completed. Generated report can be found in 'target' directory.\n"

done

exit 0