#!/bin/sh

if [ "$#" -ne 4 ]; then
    echo "Usage: $0 record_count email_prefix password display_name_prefix"
    echo "       $0 100 perf_test Passw0rd 'performance tester'"
    exit 1
fi

RECORD_COUNT=$1
EMAIL_PREFIX=$2
PASSWORD=$3
DISPLAY_NAME_PREFIX=$4

echo email,password,displayName > new_data.csv
for a in `seq 1 ${RECORD_COUNT}`; do
    echo ${EMAIL_PREFIX}${a}@wsgc.com,${PASSWORD},${DISPLAY_NAME_PREFIX}${a} >> new_data.csv
done
exit 0
