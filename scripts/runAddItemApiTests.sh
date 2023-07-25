#!/bin/sh

##############################################################################################################################
##
## Script to run all of the Shopping Cart - AddItem Api performance test
## The tests can be run multiple times
##
##   Usage: runAddItemApiTests.sh [run_count] [sleep_seconds]
##
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

printf "Running performance tests for Shopping cart - add item api test through Rest\n"
runTest com.wsgc.shoppingcart.AddItemApiTest "runAddItemApiTests" -DshoppingCartApi.setup.ratePerSecond=20 -DshoppingCartApi.setup.durationInSeconds=300
done

exit 0
