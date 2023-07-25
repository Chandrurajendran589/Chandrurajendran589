#!/bin/sh

##############################################################################################################################
##
## Script to run the product sitemap performance test
## The tests can be run multiple times
##
##   Usage: runProductSitemapTest.sh [nsu] [run_count] [sleep_seconds]
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

runTest com.wsgc.catalogwebapp.ProductSitemapTest "productSitemapTest"

done

exit 0
