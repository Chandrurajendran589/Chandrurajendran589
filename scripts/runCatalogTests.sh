#!/bin/sh

##############################################################################################################################
##
## Script to run Catalog Service performance tests
## The tests can be run multiple times
## By default, the tests wait 3 hours before they run
##
##   Usage: runCatalogTests.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

run_catalog_test() {
    eval "runTest com.wsgc.catalog.${className} ${className}_${ratePerSecond}_${durationInSeconds}_${a} -Dcatalog.${propertyPath}.ratePerSecond=${ratePerSecond} -Dcatalog.${propertyPath}.durationInSeconds=${durationInSeconds} -Dcatalog.${propertyPath}.rampUpTimeInSeconds=${rampUpTimeInSeconds}"
}

run_catalog_tests() {
    className="GetGroupV6"
    propertyPath="get.group"
    run_catalog_test

    className="GetSkuV6"
    propertyPath="get.sku"
    run_catalog_test

    className="GetGroupV5"
    propertyPath="get.group"
    run_catalog_test

    className="GetSkuV5"
    propertyPath="get.sku"
    run_catalog_test
}

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

    ratePerSecond=5
    durationInSeconds=20
    rampUpTimeInSeconds=5

    run_catalog_tests

    ratePerSecond=10
    durationInSeconds=10
    rampUpTimeInSeconds=10

    run_catalog_tests

    ratePerSecond=20
    durationInSeconds=5
    rampUpTimeInSeconds=20

    run_catalog_tests

done

exit 0