#!/bin/sh

##############################################################################################################################
##
## Script to run SPARC Checkout flow with mixed shipping and Registry performance tests.
##
##   Usage: sudo runDpSinglePageCheckoutShipAndRegistryMixedTests.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
## General parameters:
##	dp.baseUrl: The endpoint to test
##  dp.testVersion: Possible values - 'atOnceUsers', 'rampUsers', or 'constantUsersPerSec'
##	dp.basicAuth.user: default - "Enter User Id here"
##	dp.basicAuth.password: default - "Enter password here"
##  dp.registry.serviceUrl: Registry Service URL
##  dp.registry.numberOfRegistries: Number of registries to be created
##  oauth.oauthHost: Oauth Host URL
##
## At once load test - parameters:
##  dp.testVersion='atOnceUsers'
##  dp.sparc.atOnceUsers default - 1
##
## ConstantLoad test - parameters:
##  dp.testVersion='constantUsersPerSec'
##  dp.sparc.ConstantUsersPerSec default - 5 // Number of users to add per sec
##  dp.sparc.ConstantDuration='200 seconds'  // How long to keep adding user to the queue
##  dp.sparc.throttleRps=50  // max requests per second to send
##  dp.sparc.throttleInDuration='60 seconds' // how fast to get to the max rps
##  dp.sparc.throttleHoldDuration='60 minutes' // how long to hold the throttle
##
## VariableLoad test - parameters:
##  dp.testVersion='rampUsers'
##  dp.sparc.rampUsers=500
##  dp.sparc.rampDuration='3 minutes'
##  dp.sparc.throttleRps=50  // max requests per second to send
##  dp.sparc.throttleInDuration='60 seconds' // how fast to get to the max rps
##  dp.sparc.throttleHoldDuration='60 minutes' // how long to hold the throttle
##
##
## Note:
##	The product-data and promo code data sheets might need to be updated based on the environment this test is run against.
##  The easiest way to get data is to go to this page - https://{site you are trying to test}/admin/tests/find-products/available.html
##  The tests dont have assertions at this point so take a look at the results to make sure they are acceptable.
##############################################################################################################################

source $(dirname "$0")/main.sh

echo "
*********************************************************************************************************************************************************
      Note:
      ##  The product-data and promo codes data sheets might need to be updated based on the environment this test is run against.
      ##  The easiest way to get data is to go to this page - https://{site you are trying to test}/admin/tests/find-products/available.html
      ##  The tests dont have assertions at this point so take a look at the results to make sure they are acceptable.
*********************************************************************************************************************************************************
"

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

## Run the Single page checkout tests
##  At once users test
  runTest com.wsgc.dp.checkout.SinglePageCheckoutShipAndRegistryMixedTest "SinglePageCheckoutShipAndRegistryMixedTest_atOnceUsers-1_Run-${a}" -Ddp.baseUrl='https://www.perf.westelm.com' -Doauth.oauthHost='https://webauth-uat-rk01v.wsgc.com' -Ddp.regsitry.serviceUrl='https://registry-uat1-rk1v.wsgc.com:8443/registry/v3' -Ddp.registry.numberOfRegistries=10 -Ddp.testVersion=atOnceUsers -Ddp.sparc.ship.atOnceUsers=1 -Ddp.sparc.registry.atOnceUsers=1

## 	Constant Load test
  runTest com.wsgc.dp.checkout.SinglePageCheckoutShipAndRegistryMixedTest "SinglePageCheckoutShipAndRegistryMixedTest_constantUsersPerSec-Run-${a}" -Ddp.baseUrl='https://www.perf.westelm.com' -Doauth.oauthHost='https://webauth-uat-rk01v.wsgc.com' -Ddp.regsitry.serviceUrl='https://registry-uat1-rk1v.wsgc.com:8443/registry/v3' -Ddp.registry.numberOfRegistries=10 -Ddp.testVersion='constantUsersPerSec' -Ddp.sparc.ship.constantUsersPerSec=5 -Ddp.sparc.ship.constantDuration=50 -Ddp.sparc.ship.throttleRps=25 -Ddp.sparc.ship.throttleInDuration=60 -Ddp.sparc.ship.throttleHoldDuration=3600 -Ddp.sparc.registry.constantUsersPerSec=5 -Ddp.sparc.registry.constantDuration=50 -Ddp.sparc.registry.throttleRps=25 -Ddp.sparc.registry.throttleInDuration=60 -Ddp.sparc.registry.throttleHoldDuration=3600
  #runTest com.wsgc.dp.checkout.SinglePageCheckoutShipAndRegistryMixedTest "SinglePageCheckoutShipAndRegistryMixedTest_constantUsersPerSec-5-100_Run-${a}" -Ddp.baseUrl='https://regression.westelm.com' -Doauth.oauthHost='https://webauth-qa-rk01v.wsgc.com' -Ddp.regsitry.serviceUrl='https://registry-qa1-rk1v.wsgc.com:8443/registry/v3' -Ddp.registry.numberOfRegistries=10 -Ddp.testVersion='constantUsersPerSec' -Ddp.sparc.constantUsersPerSec=5 -Ddp.sparc.constantDuration=50 -Ddp.sparc.throttleRps=25 -Ddp.sparc.throttleInDuration=60 -Ddp.sparc.throttleHoldDuration=3600

##  Ramp Users Load Test
  #runTest com.wsgc.dp.checkout.SinglePageCheckoutShipAndRegistryMixedTest "SinglePageCheckoutShipAndRegistryMixedTest_rampUsers-20-180_Run-${a}" -Ddp.baseUrl='https://www.perf.westelm.com' -Doauth.oauthHost='https://webauth-uat-rk01v.wsgc.com' -Ddp.regsitry.serviceUrl='https://registry-uat1-rk1v.wsgc.com:8443/registry/v3' -Ddp.registry.numberOfRegistries=10 -Ddp.testVersion='rampUsers' -Ddp.sparc.rampUsers=20 -Ddp.sparc.rampDuration=180 -Ddp.sparc.throttleRps=50 -Ddp.sparc.throttleInDuration=60 -Ddp.sparc.throttleHoldDuration=3600
  #runTest com.wsgc.dp.checkout.SinglePageCheckoutShipAndRegistryMixedTest "SinglePageCheckoutShipAndRegistryMixedTest_rampUsers-20-180_Run-${a}" -Ddp.baseUrl='https://regression.westelm.com' -Doauth.oauthHost='https://webauth-qa-rk01v.wsgc.com' -Ddp.regsitry.serviceUrl='https://registry-qa1-rk1v.wsgc.com:8443/registry/v3' -Ddp.registry.numberOfRegistries=10 -Ddp.testVersion='rampUsers' -Ddp.sparc.rampUsers=20 -Ddp.sparc.rampDuration=180 -Ddp.sparc.throttleRps=50 -Ddp.sparc.throttleInDuration=60 -Ddp.sparc.throttleHoldDuration=3600

done

exit 0
