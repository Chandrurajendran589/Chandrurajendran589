#!/bin/sh
##############################################################################################################################
##
## Script to run the Catalog service - Get Catalog skus test
## The tests can be run multiple times
##
##   Usage: runGetCatalogSkusTests.sh [run_count] [sleep_seconds]
##
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

echo "
     *****************************************************************************************
           ##  Load Test on getCatalogSkus endpoint.
     *****************************************************************************************
     "
for a in `seq 1 "${RUN_COUNT}"`; do
  echo "Sleeping for ${SLEEP_SECONDS} seconds..."
  sleep "${SLEEP_SECONDS}"
  printf "Running performance tests for catalog Microservice through Rest\n"

  runTest com.wsgc.catalogwebapp.CatalogSkusEndpointTest "CatalogSkusRestTest_Run-${a}" -DgetCatalogSkus.serviceHost='https://pk-ecommerce-ecom-svc-catalog-preprd.services.west.wsgc.com' -DgetCatalogSkus.setUp.testVersion='atOnceUsers' -DgetCatalogSkus.setUp.atOnceUsers=1

  runTest com.wsgc.catalogwebapp.CatalogSkusEndpointTest "CatalogSkusRestTest_Run-${a}" -DgetCatalogSkus.serviceHost='https://pk-ecommerce-ecom-svc-catalog-preprd.services.west.wsgc.com' -DgetCatalogSkus.setUp.testVersion='constantUsersPerSec' -DgetCatalogSkus.setUp.constantUsersPerSec=5 -DgetCatalogSkus.setUp.constantDuration=20 -DgetCatalogSkus.setUp.throttleRps=5 -DgetCatalogSkus.setUp.throttleInDuration=10 -DgetCatalogSkus.setUp.throttleHoldDuration=300


done

exit 0