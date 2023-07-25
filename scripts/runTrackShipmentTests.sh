#!/bin/sh

##############################################################################################################################
##
## Script to run all of the Track Shipment service performance tests
## The tests can be run multiple times
##
##   Usage: runTrackShipmentTests.sh [nsu] [run_count] [sleep_seconds]
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

runTest com.wsgc.wismo.TrackShipmentPerformance "trackShipmentStandardUse" -DtrackShipment.ratePerSecond=1 -DtrackShipment.durationInSeconds=85
#runTest com.wsgc.wismo.TrackShipmentPerformance "trackShipmentBlackFriday" -DtrackShipment.ratePerSecond=5 -DtrackShipment.durationInSeconds=85
#runTest com.wsgc.wismo.TrackShipmentPerformance "trackShipmentSpikeTest" -DtrackShipment.ratePerSecond=15 -DtrackShipment.durationInSeconds=85

done

exit 0
