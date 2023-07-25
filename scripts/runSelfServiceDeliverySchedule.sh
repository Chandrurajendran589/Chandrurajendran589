#!/bin/sh

##############################################################################################################################
##
## Script to run all of the Self Service delivery schedule performance tests
## The tests can be run multiple times
##
##   Usage: runSelfServiceDeliverySchedule.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

runTest com.wsgc.deliveryschedule.SelfServiceDeliverySchedulePerformance "SelfServiceDeliverySchedulePerformance" -DdeliverySchedule.ratePerSecond=1  -DdeliverySchedule.durationInSeconds=1 -DdeliverySchedule.targetRequestSuccessPercentage=95 -DdeliverySchedule.targetMeanResponseTimeInMilliseconds=100 -DdeliverySchedule.targetMaxResponseTimeInMilliseconds=2000 -DdeliverySchedule.serviceUrl=https://www.qa10.williams-sonoma.com/self-service/delivery/schedule.html

done

exit 0
