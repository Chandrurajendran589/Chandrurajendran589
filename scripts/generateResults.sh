##########################################################
#You must install jq before running this script
#
#brew install jq
#
#https://stedolan.github.io/jq/
#
# This script generates csv's from your gatling results
##########################################################
for d in ${PWD}/../../../target/gatling/*
do
  globalStatsFilePath="$d/js/global_stats.json"
  csvFileName="$(basename $d | rev | cut -d'_' -f2- | rev).csv"
  chmod a+rwx "$globalStatsFilePath"
  if [ ! -f "$csvFileName" ]; then
    printf "Requests Per Second,Total Requests,Min,50 Pct,75th Pct,95th Pct,99th Pct,Max,Mean,Std Dev\n" >> "$csvFileName"
  fi

  meanNumberOfRequestsPerSecond=`cat $globalStatsFilePath | jq '.meanNumberOfRequestsPerSecond.total'`
  totalRequests=`cat $globalStatsFilePath | jq '.numberOfRequests.total'`
  min=`cat $globalStatsFilePath | jq '.minResponseTime.total'`
  percentiles1=`cat $globalStatsFilePath | jq '.percentiles1.total'`
  percentiles2=`cat $globalStatsFilePath | jq '.percentiles2.total'`
  percentiles3=`cat $globalStatsFilePath | jq '.percentiles3.total'`
  percentiles4=`cat $globalStatsFilePath | jq '.percentiles4.total'`
  mean=`cat $globalStatsFilePath | jq '.meanResponseTime.total'`
  max=`cat $globalStatsFilePath | jq '.maxResponseTime.total'`
  stdDev=`cat $globalStatsFilePath | jq '.standardDeviation.total'`
  printf "$meanNumberOfRequestsPerSecond,$totalRequests,$min,$percentiles1,$percentiles2,$percentiles3,$percentiles4,$max,$mean,$stdDev\n" >> "$csvFileName"
done