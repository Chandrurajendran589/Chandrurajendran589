
##############################################################################################################################
##
## Functions to run the performance tests using gatling for a test simulation class.
## Usage: Include this script file in a specific test simulation class script
##         source $(dirname $0)/main.sh
## Initialized default values for
## run_count as 1 (number of times to run the tests)
## sleep_seconds as 3 hours (number of seconds to delay before each run as 3 hours)
## By default, the tests wait 3 hours before they run
##
##############################################################################################################################


#Set absolute paths for performance test script files, pom.xml, settings.xml
SCRIPTS_ABS_PATH=$(cd `dirname $0` && pwd)
POMFILE=$SCRIPTS_ABS_PATH/../../../pom.xml
SETTINGSFILE=$SCRIPTS_ABS_PATH/../../../settings.xml

#Set default argument positions for run_count & sleep_seconds arguments
RUN_COUNT_ARG_POS=1
SLEEP_SEC_ARG_POS=2

#Set default values for run_count, sleep seconds,NSU arguments
RUN_COUNT=1
SLEEP_SECONDS=10800
NSU=

if [ "$#" -eq 3 ]; then
  RUN_COUNT_ARG_POS=2
  SLEEP_SEC_ARG_POS=3
fi

if [ "$#" -ge 4  ]; then
  echo "ERROR: Arguments should be maximum of 3. Expected arguments are #nsu_option #run_count #sleep_seconds." 1>&2
  exit 1
fi

if [ "$#" -ne 0 ]; then
  if [ "$1" = "nsu" ]; then
    NSU="-nsu --global-settings ${SETTINGSFILE}"
    RUN_COUNT_ARG_POS=2
    shift
  elif [ "$1" -ge 1 2>/dev/null ]; then
    RUN_COUNT=$1
  else
    echo "ERROR: Argument #1 can be nsu_option argument or #run_count argument. The value should be nsu or a number >= 1." 1>&2
    exit 1
  fi
fi

if [ "$#" -ne 0 ]; then
  if [ "$#" -eq 3 ]; then
    echo "ERROR: Argument #1 is #nsu_option argument. The value should be nsu." 1>&2
    exit 1
  fi

  if [ "$1" -ge 1 2>/dev/null ]; then
    RUN_COUNT=$1
  else
    echo "ERROR: Argument #$RUN_COUNT_ARG_POS is #run_count argument. The value should be a number >= 1." 1>&2
    exit 1
  fi

  if [ "$#" -eq 2 ]; then
    if [ "$2" -ge 0 2>/dev/null ]; then
      SLEEP_SECONDS=$2
    else
      echo "ERROR: Argument #$SLEEP_SEC_ARG_POS is #sleep_seconds argument. The value should be a number >= 0." 1>&2
      exit 1
    fi
  fi
fi

################################################################################
## runTest is a function to run performance tests using gatling-maven-plugin.
##
## The function requires at least two arguments.
## #1 Argument should be the test class name for simulation.
## #2 argument should be the output directory name for performance test results.
## Individual tests can pass more than 2 arguments and the
## arguments are appended in mvn gatling:execute command using "$@".
################################################################################

runTest() {
  TEST_CLASS="$1"
  PREFIX="$2"
  shift; shift;
  echo mvn -f ${POMFILE} ${NSU} gatling:execute -Djsse.enableSNIExtension=false -Dgatling.simulationClass=${TEST_CLASS} -Dgatling.core.outputDirectoryBaseName=${PREFIX} "$@"
  mvn -f ${POMFILE} ${NSU} gatling:execute -Djsse.enableSNIExtension=false -Dgatling.simulationClass=${TEST_CLASS} -Dgatling.core.outputDirectoryBaseName=${PREFIX} "$@" > ${PREFIX}.txt
}

echo Running ${RUN_COUNT} iterations of test. Sleeping ${SLEEP_SECONDS} between each iteration.