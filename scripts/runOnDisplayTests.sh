#!/bin/sh

##############################################################################################################################
##
## Script to run all of the on-display in store(ODIS) performance tests
## The tests can be run multiple times
## By default, the tests wait 3 hours before they run
##
##   Usage: runTest.sh [nsu] [run_count] [sleep_seconds]
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

##  Run the On-Display in Store tests
##Constant Load test
runTest com.wsgc.dp.odis.DisplayLocationsConstantLoadTest "DisplayLocationsConstantLoadTest_5_20_${a}" -Dodis.constantLoad.users.perSecond=5 -Dodis.constantLoad.users.testDuration='2 minutes' -Dodis.constantLoad.throttle.rps=5
runTest com.wsgc.dp.odis.DisplayLocationsConstantLoadTest "DisplayLocationsConstantLoadTest_5_20_${a}" -Dodis.constantLoad.users.perSecond=10 -Dodis.constantLoad.users.testDuration='4 minutes' -Dodis.constantLoad.throttle.rps=15
runTest com.wsgc.dp.odis.DisplayLocationsConstantLoadTest "DisplayLocationsConstantLoadTest_5_20_${a}" -Dodis.constantLoad.users.perSecond=25 -Dodis.constantLoad.users.testDuration='10 minutes' -Dodis.constantLoad.throttle.rps=25

##Variable Load test
runTest com.wsgc.dp.odis.DisplayLocationsVariableLoadTest "DisplayLocationsVariableLoadTest_5_20_${a}" -Dodis.variableLoad.users.lowerLimitPerSecond=5 -Dodis.variableLoad.users.upperLimitPerSecond=25 -Dodis.variableLoad.users.testDuration='2 minutes' -Dodis.variableLoad.throttle.rps=25
runTest com.wsgc.dp.odis.DisplayLocationsVariableLoadTest "DisplayLocationsVariableLoadTest_5_20_${a}" -Dodis.variableLoad.users.lowerLimitPerSecond=5 -Dodis.variableLoad.users.upperLimitPerSecond=40 -Dodis.variableLoad.users.testDuration='5 minutes' -Dodis.variableLoad.throttle.rps=40
runTest com.wsgc.dp.odis.DisplayLocationsVariableLoadTest "DisplayLocationsVariableLoadTest_5_20_${a}" -Dodis.variableLoad.users.lowerLimitPerSecond=5 -Dodis.variableLoad.users.upperLimitPerSecond=50 -Dodis.variableLoad.users.testDuration='10 minutes' -Dodis.variableLoad.throttle.rps=50

done

exit 0
