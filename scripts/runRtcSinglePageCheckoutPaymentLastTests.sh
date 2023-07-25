#!/bin/sh

##############################################################################################################################
##
## Script to run Single Page Checkout (RTC) performance payment below the DMR section tests.
##
##   Usage: runRtcSinglePageCheckoutPaymentLastTests.sh [nsu] [run_count] [sleep_seconds]
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
  runTest com.wsgc.dp.checkout.SinglePageCheckoutForRtcPaymentLastTest "SinglePageCheckoutForRtcPaymentLastTest_Run-${a}" -Ddp.baseUrl='https://www.qa3.pbteen.com' -Ddp.testVersion='atOnceUsers' -Ddp.sparc.atOnceUsers=1

## 	Constant Load test
#  runTest com.wsgc.dp.checkout.SinglePageCheckoutForRtcPaymentLastTest "SinglePageCheckoutForRtcPaymentLastTest_Run-${a}" -Ddp.baseUrl='https://www.qa3.pbteen.com' -Ddp.testVersion='constantUsersPerSec' -Ddp.sparc.constantUsersPerSec=5 -Ddp.sparc.constantDuration=300 -Ddp.sparc.throttleRps=45 -Ddp.sparc.throttleInDuration=60 -Ddp.sparc.throttleHoldDuration=36000

##  Ramp Users Load Test
#  runTest com.wsgc.dp.checkout.SinglePageCheckoutForRtcPaymentLastTest "SinglePageCheckoutForRtcPaymentLastTest_Run-${a}" -Ddp.testVersion='rampUsers' -Ddp.sparc.rampUsers=500 -Ddp.sparc.rampDuration=180 -Ddp.sparc.throttleRps=50 -Ddp.sparc.throttleInDuration=60 -Ddp.sparc.throttleHoldDuration=3600
  done

exit 0
