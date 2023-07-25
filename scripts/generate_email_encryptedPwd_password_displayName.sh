#!/bin/sh

if [ -z `which bcrypt` ]; then
    echo This script requires bcrypt
    echo Use the following command to install it using npm
    echo "\t npm install -g bcrypt-util"
    exit 1
fi

if [ "$#" -ne 4 ]; then
    echo "Usage: $0 record_count email_prefix password display_name_prefix"
    echo "       $0 100 perf_test Passw0rd 'performance tester'"
    exit 1
fi


RECORD_COUNT=$1
EMAIL_PREFIX=$2
PASSWORD=$3
DISPLAY_NAME_PREFIX=$4
ENCRYPTED_PWD=`bcrypt hash ${PASSWORD} 9`

echo email,encrypted_password,displayName,password > new_data.csv
for a in `seq 1 ${RECORD_COUNT}`; do
    echo ${EMAIL_PREFIX}${a}@wsgc.com,BCRYPT:${ENCRYPTED_PWD},${DISPLAY_NAME_PREFIX}${a},$PASSWORD >> new_data.csv
done
exit 0
