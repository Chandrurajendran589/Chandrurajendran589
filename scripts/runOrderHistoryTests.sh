#!/bin/sh

##############################################################################################################################
##
## Script to run all of the Order History service performance tests
## The tests can be run multiple times
##
##   Usage: runOrderHistoryTests.sh [nsu] [run_count] [sleep_seconds]
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

runTest com.wsgc.wismo.OrderHistoryPerformance "orderHistoryStandardUse" -DorderHistory.ratePerSecond=1 -DorderHistory.durationInSeconds=85
#runTest com.wsgc.wismo.OrderHistoryPerformance "orderHistoryBlackFriday" -DorderHistory.ratePerSecond=5 -DorderHistory.durationInSeconds=85
#runTest com.wsgc.wismo.OrderHistoryPerformance "orderHistorySpikeTest" -DorderHistory.ratePerSecond=15 -DorderHistory.durationInSeconds=85

done

exit 0
