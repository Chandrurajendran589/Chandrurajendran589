#!/bin/sh

##############################################################################################################################
##
## Script to run all of the inventory service performance tests
## The tests can be run multiple times
##
##   Usage: runInventoryTests.sh [nsu] [run_count] [sleep_seconds]
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

runTest com.wsgc.inventory.CheckInventoryPerformance "checkInventoryStandardUse" -Dinventory.checkInventory.ratePerSecond=1 -Dinventory.checkInventory.durationInSeconds=85
runTest com.wsgc.inventory.CheckInventoryPerformance "checkInventoryBlackFriday" -Dinventory.checkInventory.ratePerSecond=5 -Dinventory.checkInventory.durationInSeconds=85
runTest com.wsgc.inventory.CheckInventoryPerformance "checkInventorySpikeTest" -Dinventory.checkInventory.ratePerSecond=15 -Dinventory.checkInventory.durationInSeconds=85
##runTest com.wsgc.inventory.CheckInventoryPerformance "checkInventoryFromSettings"
done

exit 0
