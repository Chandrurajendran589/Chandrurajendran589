#!/bin/sh

##############################################################################################################################
##
## Script to run all of the ADG Feature Redirects performance tests
## The tests can be run multiple times
##
##   Usage: runAdgFeatureRedirectsTest.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
## Note:
##  The redirect url and sku data sheets (data/ecom-adg/sku_feeder.csv, data/ecom-adg/redirect_endpoints.csv)
##     might need to be updated based on the environment this test is run against.
##  The tests dont have assertions at this point so take a look at the results to make sure they are acceptable.
##############################################################################################################################

source $(dirname "$0")/main.sh

echo "
***************************************************************************************************************
Note:
##  The redirect url and sku data sheets (data/ecom-adg/sku_feeder.csv, data/ecom-adg/redirect_endpoints.csv)
##     might need to be updated based on the environment this test is run against.
##  The tests dont have assertions at this point so take a look at the results to make sure they are acceptable.
*****************************************************************************************************************
"

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

    #Run the test
    runTest com.wsgc.ecom_adg.FeatureRedirectsTest "AdgFeatureRedirectsTest_RUN-${a}" -DadgFeatureRedirects.setup.ratePerSecond=5 -DadgFeatureRedirects.setup.durationInSeconds=20 -DadgFeatureRedirects.serviceHost=https://qa.origin-svc.williams-sonoma.com/qa1.williams-sonoma.com

    done

exit 0