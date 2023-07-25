#!/bin/sh

##############################################################################################################################
##
## Script to run promotion eligibility shell performance tests
## The tests can be run multiple times
## By default, the tests wait 3 hours before they run
##
##   Usage: runPromoEligibilityShellTests.sh [nsu] [run_count] [sleep_seconds]
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

  ## promotionEligibilityShell tests

  runTest com.wsgc.pricing.PromotionEligibilityShellTest "PromotionEligibilityShellTest_${a}" -DpromotionEligibilityShell.ratePerSecond=10 -DpromotionEligibilityShell.durationInMinute=1

done

exit 0