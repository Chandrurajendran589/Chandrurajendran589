#!/bin/sh

##############################################################################################################################
##
## Script to run the active catalog generation performance tests
## The tests can be run multiple times
##
##   Usage: runActiveCatalogGenerationTest.sh [nsu] [run_count] [sleep_seconds]
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

runTest com.wsgc.catalogwebapp.ActiveCatalogGenerationTest "activeCatalogGenerationTest"

done

exit 0
