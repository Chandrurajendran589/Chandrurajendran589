#!/bin/sh

##########################################################
# Generate group_feeder content
##########################################################

if [ "$#" -ne 1 ]; then
    echo "Usage: $0 file_path_to_assortment_catalog_zip"
    echo "Usage: $0 /Users/work/svn/illyn/sites/ws/assortment/catalogdata/assortment-wcm-build-20180904-31.zip"
    exit 1
fi

# Check to see if the user entered zip file exists or not
ZIPFILEPATH=$1
COUNT=`ls -1 $ZIPFILEPATH 2>/dev/null | wc -l`
echo "$COUNT"
if [ ${COUNT} -eq 0 ]; then  
	echo "Zip file does not exist"
	exit 1
fi

BASEDIR=$(dirname "${ZIPFILEPATH}")
NAME=$(basename "$ZIPFILEPATH" ".zip")
UNZIPDIR="$BASEDIR/$NAME"

# Delete the un-archived folder if it already exists
if [ -d "$UNZIPDIR" ]; then
	echo "Directory $UNZIPDIR already exists. Performing delete and unzip"
	rm -rf "$UNZIPDIR"
fi

# Unzip the zip file
unzip $ZIPFILEPATH -d "$BASEDIR/$NAME"

# Create group_feeder csv file
SCRIPTDIRECTORY="$(dirname $0)/../resources/data"
echo "group-id" > "$SCRIPTDIRECTORY/group_feeder.csv"
grep "base/group" "$BASEDIR/$NAME/groups.js" | sed -e 's/^.*"base\/group", "//g' | sed -e 's/".*$//g' | sort -R >> $SCRIPTDIRECTORY/group_feeder.csv
