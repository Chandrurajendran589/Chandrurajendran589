#!/bin/sh

##############################################################################################################################
##
## Script to run all of the performance tests
## The tests can be run multiple times
## By default, the tests wait 3 hours before they run
##
##   Usage: runTest.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

PAUSE_SECONDS=120

echo "sleeping ${SLEEP_SECONDS}..."
sleep ${SLEEP_SECONDS}

for a in `seq 1 ${RUN_COUNT}`; do

    src/test/scripts/generate_email_encryptedPwd_password_displayName.sh 100 logintest Passw0rd1 'profile tester'
    mv new_data.csv src/test/resources/data
    runTest com.wsgc.oauth.GetClientCredAndCheckToken "GetAndCheckToken_10_10_${a}" -Doauth.ratePerSecond=10 -Doauth.durationInSeconds=10

    echo "Sleeping ${PAUSE_SECONDS}"
    sleep ${PAUSE_SECONDS}

    src/test/scripts/generate_email_encryptedPwd_password_displayName.sh 1000 logintest Passw0rd1 'profile tester'
    mv new_data.csv src/test/resources/data
    runTest com.wsgc.oauth.GetClientCredAndCheckToken "GetAndCheckToken_20_50_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=50

    echo "Sleeping ${PAUSE_SECONDS}"
    sleep ${PAUSE_SECONDS}

    src/test/scripts/generate_email_encryptedPwd_password_displayName.sh 2000 logintest Passw0rd1 'profile tester'
    mv new_data.csv src/test/resources/data
    runTest com.wsgc.oauth.GetClientCredAndCheckToken "GetAndCheckToken_20_100_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=100

    echo "Sleeping ${PAUSE_SECONDS}"
    sleep ${PAUSE_SECONDS}

    src/test/scripts/generate_email_encryptedPwd_password_displayName.sh 18000 logintest Passw0rd1 'profile tester'
    mv new_data.csv src/test/resources/data
    runTest com.wsgc.oauth.GetClientCredAndCheckToken "GetAndCheckToken_20_900_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=900

    echo "Sleeping ${PAUSE_SECONDS}"
    sleep ${PAUSE_SECONDS}

    src/test/scripts/generate_email_encryptedPwd_password_displayName.sh 36000 logintest Passw0rd1 'profile tester'
    mv new_data.csv src/test/resources/data
    runTest com.wsgc.oauth.GetClientCredAndCheckToken "GetAndCheckToken_40_900_${a}" -Doauth.ratePerSecond=40 -Doauth.durationInSeconds=900

    echo "Sleeping ${PAUSE_SECONDS}"
    sleep ${PAUSE_SECONDS}

    src/test/scripts/generate_email_encryptedPwd_password_displayName.sh 45000 logintest Passw0rd1 'profile tester'
    mv new_data.csv src/test/resources/data
    runTest com.wsgc.oauth.GetClientCredAndCheckToken "GetAndCheckToken_50_900_${a}" -Doauth.ratePerSecond=50 -Doauth.durationInSeconds=900
done

exit 0