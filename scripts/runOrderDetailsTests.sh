#!/bin/sh

##############################################################################################################################
##
## Script to run all of the Order Details service performance tests
## The tests can be run multiple times
##
##   Usage: runOrderDetailsTests.sh [nsu] [run_count] [sleep_seconds]
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

runTest com.wsgc.wismo.TrackingDetailsPerformance "trackingDetailsStandardUse" -DtrackingDetails.ratePerSecond=1 -DtrackingDetails.durationInSeconds=85
#runTest com.wsgc.wismo.TrackingDetailsPerformance "trackingDetailsBlackFriday" -DtrackingDetails.ratePerSecond=5 -DtrackingDetails.durationInSeconds=85
#runTest com.wsgc.wismo.TrackingDetailsPerformance "trackingDetailsSpikeTest" -DtrackingDetails.ratePerSecond=15 -DtrackingDetails.durationInSeconds=85

done

exit 0
