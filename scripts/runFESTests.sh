#!/bin/sh

##############################################################################################################################
##
## Script to run Favorite Enterprise Service performance tests
## The tests can be run multiple times
##
##   Usage: runFESTests.sh [nsu] [run_count] [sleep_seconds]
##
##      nsu - optional argument to run against a local maven repository with the "no snapshot updates" maven flag enabled
##      run_count - number of times to run the tests
##      sleep_seconds - number of seconds to delay before each run
##
##############################################################################################################################

source $(dirname "$0")/main.sh

run_get_test() {
    eval "runTest com.wsgc.favorites.enterprise.${className} ${className}_${ratePerSecond}_${durationInSeconds}_${a} -Dfavorite.${propertyPath}.ratePerSecond=${ratePerSecond} -Dfavorite.${propertyPath}.durationInSeconds=${durationInSeconds}"
}

run_post_test() {
    eval "runTest com.wsgc.favorites.enterprise.${className} ${className}_${ratePerSecond}_${durationInSeconds}_${a} -Dfavorite.${propertyPath}.ratePerSecond=${ratePerSecond} -Dfavorite.${propertyPath}.durationInSeconds=${durationInSeconds}"
}

run_all_favorites_tests() {
    className="AddRemoveMultipleMarketAwareFavoritesItems"
    propertyPath="post"
    run_post_test
    
    className="CreateMarketAwareFavoritesLists"
    propertyPath="post"
    run_post_test
    
    className="CreateMarketAwareLogInFavoritesLists"
    propertyPath="post"
    run_post_test
    
    className="CreateMarketAwareSharedLists"
    propertyPath="post"
    run_post_test
    
    className="GetMarketAwareFavoritesLists"
    propertyPath="get"
    run_get_test
    
    className="GetMarketAwareLogInFavoritesLists"
    propertyPath="get"
    run_get_test
    
    className="GetMarketAwareSharedLists"
    propertyPath="get"
    run_get_test
}

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

    ratePerSecond=5
    durationInSeconds=20

    run_all_favorites_tests
done

exit 0