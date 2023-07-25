#!/bin/sh

##############################################################################################################################
##
## Script to run Inventory Micro Service performance tests.
##
##   Usage: runInventoryServiceRestTest.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
## General parameters:
##	inventoryService.serviceHost: The hostname of the local or Kubernetes environment to test.
##  inventoryService.testVersion: Possible values - 'atOnceUsers', 'rampUsers', or 'constantUsersPerSec'
##
## At once load test - parameters:
##  inventoryService.testVersion='atOnceUsers'
##  inventoryService.atOnceUsers default - 5
##
## Variable Load test - parameters:
##  inventoryService.testVersion='rampUsers'
##  inventoryService.rampUsers default - 10
##  inventoryService.rampDuration default - 10 seconds
##
## Constant Load test - parameters:
##  inventoryService.testVersion='constantUsersPerSec'
##  inventoryService.ConstantUsersPerSec default - 10 // Number of users to add per sec
##  inventoryService.ConstantDuration default - 60 seconds // How long to keep adding user to the queue
##
## Throttling - parameters:
##  inventoryService.throttleRps default - 5  // max requests per second to send
##  inventoryService.throttleInDuration default - 10 seconds // how fast to get to the max rps
##  inventoryService.throttleHoldDuration default - 300 seconds (5 minutes) // how long to hold the throttle
##
## Note:
##	The product_group_data file might need to be updated based on the environment this test is run against.
##  The selected product group has more than 2500 SKUs and processing this group might take longer time initially.
##############################################################################################################################

source $(dirname "$0")/main.sh

echo "
*********************************************************************************************************************************************************
      Note:
      ##	The product_group_data file might need to be updated based on the environment this test is run against.
      ##  The selected product group has more than 2500 SKUs and processing this group might take longer time initially.
*********************************************************************************************************************************************************
"

for a in `seq 1 "${RUN_COUNT}"`; do
  echo "Sleeping for ${SLEEP_SECONDS} seconds..."
  sleep "${SLEEP_SECONDS}"
  printf "Running performance tests for Inventory Micro Service through Rest\n"

  printf "Running Inventory Micro Service Rest Test with TestVersion - atOnceUsers\n"
  runTest com.wsgc.inventory.services.InventoryServiceRestTest "InventoryServiceRestTest_atOnceUsers_${a}" -DinventoryService.serviceHost=https://ecommercemana-inventory-service-100ecommercemanatah3268.services.west.nonprod.wsgc.com -DinventoryService.testVersion=atOnceUsers -DinventoryService.atOnceUsers=10

  printf "Running Inventory Micro Service Rest Test with TestVersion - rampUsers\n"
  runTest com.wsgc.inventory.services.InventoryServiceRestTest "InventoryServiceRestTest_rampUsers_${a}" -DinventoryService.serviceHost=https://ecommercemana-inventory-service-100ecommercemanatah3268.services.west.nonprod.wsgc.com -DinventoryService.testVersion=rampUsers -DinventoryService.rampUsers=5 -DinventoryService.rampDuration=20 -DinventoryService.throttleRps=5 -DinventoryService.throttleInDuration=10 -DinventoryService.throttleHoldDuration=300

  printf "Running Inventory Micro Service Rest Test with TestVersion - constantUsersPerSec\n"
  runTest com.wsgc.inventory.services.InventoryServiceRestTest "InventoryServiceRestTest_constantUsersPerSec_${a}" -DinventoryService.serviceHost=https://ecommercemana-inventory-service-100ecommercemanatah3268.services.west.nonprod.wsgc.com -DinventoryService.testVersion=constantUsersPerSec -DinventoryService.constantUsersPerSec=5 -DinventoryService.constantDuration=20 -DinventoryService.throttleRps=5 -DinventoryService.throttleInDuration=10 -DinventoryService.throttleHoldDuration=300

  printf "Test execution completed. Generated reports can be found in 'target' directory.\n"

done

exit 0
