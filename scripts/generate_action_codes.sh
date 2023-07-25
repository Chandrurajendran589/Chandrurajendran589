#!/bin/sh

if [ "$#" -ne 1 ]; then
    echo "Usage: $0 record_count"
    echo "       $0 100'"
    exit 1
fi

RECORD_COUNT=$1

echo uuid,action,active,expiresInSeconds > new_data.csv
for a in `seq 1 ${RECORD_COUNT}`; do
    UUID=`uuidgen`
    echo ${UUID},reset,true,86400 >> new_data.csv
done
exit 0
