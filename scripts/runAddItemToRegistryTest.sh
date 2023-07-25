#!/bin/sh
##############################################################################################################################
##
## Script to run the registry webapp service - add items to registry test
## The tests can be run multiple times
##
##   Usage: runAddItemsToRegistryTests.sh [run_count] [sleep_seconds]
##
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

echo "
     *****************************************************************************************
           ##  Load Test on add items to registry endpoint.
     *****************************************************************************************
     "
for a in `seq 1 "${RUN_COUNT}"`; do
  echo "Sleeping for ${SLEEP_SECONDS} seconds..."
  sleep "${SLEEP_SECONDS}"
  printf "Running performance tests for registry Microservice through Rest\n"

  runTest com.wsgc.ecom_registry_webapp.registry.AddItemsToRegistryEndpointTest "AddItemsToRegistryEndpointTest_Run-${a}" -Dadd-items-to-registry.registry.baseUrl='https://ecommerce-ecom-svc-registry-preprd.services.west.wsgc.com' -Dadd-items-to-registry.testVersion='atOnceUsers' -Dadd-items-to-registry.atOnceUsers=1

  runTest com.wsgc.ecom_registry_webapp.registry.AddItemsToRegistryEndpointTest "AddItemsToRegistryEndpointTest_Run-${a}" -Dadd-items-to-registry.registry.baseUrl='https://ecommerce-ecom-svc-registry-preprd.services.west.wsgc.com' -Dadd-items-to-registry.testVersion='constantUsersPerSec' -Dadd-items-to-registry..constantUsersPerSec=5 -Dadd-items-to-registry.constantDuration=20


done

exit 0