#!/bin/sh

##############################################################################################################################
##
## Script to run BOPIS pickup inventory check performance tests.
## The tests can be run multiple times.
## By default, the tests wait 3 hours before they run.
##
##   Usage: runTest.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
## BOPIS general parameters: 
##	bopis.baseUrl: 			default - "https://localhost:8461"
##	bopis.userId: 			default - "Enter User Id here"
##	bopis.password: 		default - "Enter password here"
##	bopis.storeCount 		default - 5 // the number of pickup location codes to send in the request
##	
## ConstantLoad test - parameters:
##	bopis.constantLoad.users.perSecond: 			default - 10			// Num. of users to add per sec
##	bopis.constantLoad.users.testDuration: 			default - "2 minutes"	// how long to run the test
##	bopis.constantLoad.throttle.rps: 				default - 15            // max requests per second to send
##	bopis.constantLoad.throttle.duration: 			default - "10 seconds"  // how fast to get to the max rps
##	
## VariableLoad test - parameters:
##	bopis.variableLoad.users.lowerLimitPerSecond: 	default - 1				// min. number of users to created
##	bopis.variableLoad.users.upperLimitPerSecond: 	default - 25			// max. number of users to created
##	bopis.variableLoad.users.testDuration: 			default - "2 minutes"	// how long to run the test
##	bopis.variableLoad.throttle.rps: 				default - 25			// max requests per second to send
##	bopis.variableLoad.throttle.duration: 			default - "10 seconds"	// how fast to get to the max rps
##
## Log file name Bopis<type>LoadTest_SC-x_Dur-y_Run-z:
## 		where 
##		 type - is "Constant" or "Variable" 
##		 x    - number of pickup location codes sent in the request
##		 y    - the length in minutes that the test has run
##		 z    - the number of the test run (see run_count above) 
##
## Note:
##	In order to run these tests, you need to set the following app settings:
##		BOPIS.PERFORMANCE_CHECK/b: false			// This will turn off caching of the responses from Sterling 
##													// as well as Akamai caching (if running against QA machines).
##													// Also pickup locations in a list will not be filtered and 
##													// will be sent to Sterling.
##		BOPIS.INVENTORY_SERVICE_REQUEST_PER_PICKUP_LOCATION:/b // When true, an ATP request will be made per item per pickup 
##															   // location. When false, an ATP request will be made per item.
##	The backend needs to be connected to valid Sterling backend. 
##############################################################################################################################

source $(dirname "$0")/main.sh 

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

## Run the BOPIS tests
## 	Constant Load test
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-1_Dur-2_Run-${a}" -Dbopis.constantLoad.users.perSecond=10 -Dbopis.constantLoad.users.testDuration='2 minutes' -Dbopis.storeCount=1 -Dbopis.constantLoad.throttle.rps=5
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-5_Dur-2_Run-${a}" -Dbopis.constantLoad.users.perSecond=10 -Dbopis.constantLoad.users.testDuration='2 minutes' -Dbopis.storeCount=5 -Dbopis.constantLoad.throttle.rps=5
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-10_Dur-2_Run-${a}" -Dbopis.constantLoad.users.perSecond=10 -Dbopis.constantLoad.users.testDuration='2 minutes' -Dbopis.storeCount=10 -Dbopis.constantLoad.throttle.rps=5
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-20_Dur-2_Run-${a}" -Dbopis.constantLoad.users.perSecond=10 -Dbopis.constantLoad.users.testDuration='2 minutes' -Dbopis.storeCount=20 -Dbopis.constantLoad.throttle.rps=5

runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-1_Dur-5_Run-${a}" -Dbopis.constantLoad.users.perSecond=20 -Dbopis.constantLoad.users.testDuration='5 minutes' -Dbopis.storeCount=1 -Dbopis.constantLoad.throttle.rps=15
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-5_Dur-5_Run-${a}" -Dbopis.constantLoad.users.perSecond=20 -Dbopis.constantLoad.users.testDuration='5 minutes' -Dbopis.storeCount=5 -Dbopis.constantLoad.throttle.rps=15
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-10_Dur-5_Run-${a}" -Dbopis.constantLoad.users.perSecond=20 -Dbopis.constantLoad.users.testDuration='5 minutes' -Dbopis.storeCount=10 -Dbopis.constantLoad.throttle.rps=15
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-20_Dur-5_Run-${a}" -Dbopis.constantLoad.users.perSecond=20 -Dbopis.constantLoad.users.testDuration='5 minutes' -Dbopis.storeCount=20 -Dbopis.constantLoad.throttle.rps=15

runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-1_Dur-10_Run-${a}" -Dbopis.constantLoad.users.perSecond=30 -Dbopis.constantLoad.users.testDuration='10 minutes' -Dbopis.storeCount=1 -Dbopis.constantLoad.throttle.rps=25
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-5_Dur-10_Run-${a}" -Dbopis.constantLoad.users.perSecond=30 -Dbopis.constantLoad.users.testDuration='10 minutes' -Dbopis.storeCount=5 -Dbopis.constantLoad.throttle.rps=25
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-10_Dur-10_Run-${a}" -Dbopis.constantLoad.users.perSecond=30 -Dbopis.constantLoad.users.testDuration='10 minutes' -Dbopis.storeCount=10 -Dbopis.constantLoad.throttle.rps=25
runTest com.wsgc.dp.bopis.BopisConstantLoadTest "BopisConstantLoadTest_SC-20_Dur-10_Run-${a}" -Dbopis.constantLoad.users.perSecond=30 -Dbopis.constantLoad.users.testDuration='10 minutes' -Dbopis.storeCount=20 -Dbopis.constantLoad.throttle.rps=25

##	Variable Load test
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-1_Dur-2_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=15 -Dbopis.variableLoad.users.testDuration='2 minutes' -Dbopis.storeCount=1 -Dbopis.variableLoad.throttle.rps=5
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-5_Dur-2_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=15 -Dbopis.variableLoad.users.testDuration='2 minutes' -Dbopis.storeCount=5 -Dbopis.variableLoad.throttle.rps=5
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-10_Dur-2_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=15 -Dbopis.variableLoad.users.testDuration='2 minutes' -Dbopis.storeCount=10 -Dbopis.variableLoad.throttle.rps=5
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-20_Dur-2_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=15 -Dbopis.variableLoad.users.testDuration='2 minutes' -Dbopis.storeCount=20 -Dbopis.variableLoad.throttle.rps=5

runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-1_Dur-5_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=30 -Dbopis.variableLoad.users.testDuration='5 minutes' -Dbopis.storeCount=1 -Dbopis.variableLoad.throttle.rps=15
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-5_Dur-5_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=30 -Dbopis.variableLoad.users.testDuration='5 minutes' -Dbopis.storeCount=5 -Dbopis.variableLoad.throttle.rps=15
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-10_Dur-5_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=30 -Dbopis.variableLoad.users.testDuration='5 minutes' -Dbopis.storeCount=10 -Dbopis.variableLoad.throttle.rps=15
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-20_Dur-5_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=30 -Dbopis.variableLoad.users.testDuration='5 minutes' -Dbopis.storeCount=20 -Dbopis.variableLoad.throttle.rps=15

runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-1_Dur-10_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=50 -Dbopis.variableLoad.users.testDuration='10 minutes' -Dbopis.storeCount=1 -Dbopis.variableLoad.throttle.rps=25
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-5_Dur-10_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=50 -Dbopis.variableLoad.users.testDuration='10 minutes' -Dbopis.storeCount=5 -Dbopis.variableLoad.throttle.rps=25
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-10_Dur-10_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=50 -Dbopis.variableLoad.users.testDuration='10 minutes' -Dbopis.storeCount=10 -Dbopis.variableLoad.throttle.rps=25
runTest com.wsgc.dp.bopis.BopisVariableLoadTest "BopisVariableLoadTest_SC-20_Dur-10_Run-${a}" -Dbopis.variableLoad.users.lowerLimitPerSecond=5 -Dbopis.variableLoad.users.upperLimitPerSecond=50 -Dbopis.variableLoad.users.testDuration='10 minutes' -Dbopis.storeCount=20 -Dbopis.variableLoad.throttle.rps=25

done

exit 0
