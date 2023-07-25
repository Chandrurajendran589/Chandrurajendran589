#!/bin/sh

##############################################################################################################################
##
## Script to run getPostalCodeCookie endpoint load tests
## The tests can be run multiple times
##
##   Usage: runGetPostalCodeCookieTest.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

echo "
*****************************************************************************************
      ##  Constant Load Test on getPostalCodeCookie endpoint.
*****************************************************************************************
"

for a in `seq 1 "${RUN_COUNT}"`; do
  echo "Sleeping for ${SLEEP_SECONDS} seconds..."
  sleep "${SLEEP_SECONDS}"
  printf "Running performance load tests for getPostalCodeCookie endpoint\n"

  runTest com.wsgc.postalcode.PostalCodeCookieTest "GetPostalCodeCookieTest_RPS-3_Dur-60_${a}" -DgetPostalCodeCookie.ratePerSecond=3 -DgetPostalCodeCookie.durationInSeconds=60
  runTest com.wsgc.postalcode.PostalCodeCookieTest "GetPostalCodeCookieTest_RPS-5_Dur-1800_${a}" -DgetPostalCodeCookie.ratePerSecond=5 -DgetPostalCodeCookie.durationInSeconds=1800
  runTest com.wsgc.postalcode.PostalCodeCookieTest "GetPostalCodeCookieTest_RPS-10_Dur-1800_${a}" -DgetPostalCodeCookie.ratePerSecond=10 -DgetPostalCodeCookie.durationInSeconds=1800
  runTest com.wsgc.postalcode.PostalCodeCookieTest "GetPostalCodeCookieTest_RPS-15_Dur-1800_${a}" -DgetPostalCodeCookie.ratePerSecond=15 -DgetPostalCodeCookie.durationInSeconds=1800

  printf "Test execution completed. Generated report can be found in 'target' directory.\n"

done

exit 0