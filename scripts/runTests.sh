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

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

##  Action Code tests

    runTest com.wsgc.action.CreateActionCodes "CreateActionCodes_5_20_${a}" -Daction.create.ratePerSecond=5 -Daction.create.durationInSeconds=20
    runTest com.wsgc.action.GetActionCodes "GetActionCodes_5_20_${a}" -Daction.get.ratePerSecond=5 -Daction.get.durationInSeconds=20
    runTest com.wsgc.action.PutActionCodes "PutActionCodes_5_20_${a}" -Daction.put.ratePerSecond=5 -Daction.put.durationInSeconds=20

    runTest com.wsgc.action.CreateActionCodes "CreateActionCodes_10_10_${a}" -Daction.create.ratePerSecond=10 -Daction.create.durationInSeconds=10
    runTest com.wsgc.action.GetActionCodes "GetActionCodes_10_10_${a}" -Daction.get.ratePerSecond=10 -Daction.get.durationInSeconds=10
    runTest com.wsgc.action.PutActionCodes "PutActionCodes_10_10_${a}" -Daction.put.ratePerSecond=10 -Daction.put.durationInSeconds=10

    runTest com.wsgc.action.CreateActionCodes "CreateActionCodes_20_5_${a}" -Daction.create.ratePerSecond=20 -Daction.create.durationInSeconds=5
    runTest com.wsgc.action.GetActionCodes "GetActionCodes_20_5_${a}" -Daction.get.ratePerSecond=20 -Daction.get.durationInSeconds=5
    runTest com.wsgc.action.PutActionCodes "PutActionCodes_20_5_${a}" -Daction.put.ratePerSecond=20 -Daction.put.durationInSeconds=5

##  OAuth token tests

    runTest com.wsgc.oauth.CheckToken "CheckToken_5_20_${a}" -Doauth.ratePerSecond=5 -Doauth.durationInSeconds=20
    runTest com.wsgc.oauth.FailLogin "FailLogin_5_20_${a}" -Doauth.ratePerSecond=5 -Doauth.durationInSeconds=20
    runTest com.wsgc.oauth.Login "Login_5_20_${a}" -Doauth.ratePerSecond=5 -Doauth.durationInSeconds=20
    runTest com.wsgc.oauth.RefreshToken "RefreshToken_5_20_${a}" -Doauth.ratePerSecond=5 -Doauth.durationInSeconds=20

    runTest com.wsgc.oauth.CheckToken "CheckToken_10_10_${a}" -Doauth.ratePerSecond=10 -Doauth.durationInSeconds=10
    runTest com.wsgc.oauth.FailLogin "FailLogin_10_10_${a}" -Doauth.ratePerSecond=10 -Doauth.durationInSeconds=10
    runTest com.wsgc.oauth.Login "Login_10_10_${a}" -Doauth.ratePerSecond=10 -Doauth.durationInSeconds=10
    runTest com.wsgc.oauth.RefreshToken "RefreshToken_10_10_${a}" -Doauth.ratePerSecond=10 -Doauth.durationInSeconds=10

    runTest com.wsgc.oauth.CheckToken "CheckToken_20_5_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=5
    runTest com.wsgc.oauth.FailLogin "FailLogin_20_5_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=5
    runTest com.wsgc.oauth.Login "Login_20_5_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=5
    runTest com.wsgc.oauth.RefreshToken "RefreshToken_20_5_${a}" -Doauth.ratePerSecond=20 -Doauth.durationInSeconds=5

##  User tests

    runTest com.wsgc.user.CreateUser "CreateUser_5_20_${a}" -Dusr.create.ratePerSecond=5 -Dusr.create.durationInSeconds=20
    runTest com.wsgc.user.LoggedInUserDetails "LoggedInUserDetails_5_20_${a}" -Dusr.userDetails.ratePerSecond=5 -Dusr.userDetails.durationInSeconds=20
    runTest com.wsgc.user.UpdateDisplayName "UpdateDisplayName_5_20_${a}" -Dusr.updateDisplayName.ratePerSecond=5 -Dusr.updateDisplayName.durationInSeconds=20
    runTest com.wsgc.user.ConfirmUser "ConfirmUser_5_20_${a}" -Dusr.ratePerSecond=5 -Dusr.durationInSeconds=20
    runTest com.wsgc.user.CreateLink "CreateLink_5_20_${a}" -Dusr.createLink.ratePerSecond=5 -Dusr.createLink.durationInSeconds=20
    runTest com.wsgc.user.GetLink "GetLink_5_20_${a}" -Dusr.createLink.ratePerSecond=5 -Dusr.getLink.durationInSeconds=20
    runTest com.wsgc.user.PasswordResetEmail "PasswordResetEmail_5_20_${a}" -Dusr.ratePerSecond=5 -Dusr.durationInSeconds=20
    runTest com.wsgc.user.UpdatePassword "UpdatePassword_5_20_${a}" -Dusr.updatePassword.ratePerSecond=5 -Dusr.updatePassword.durationInSeconds=20
    runTest com.wsgc.user.UpdateUsername "UpdateUsername_5_20_${a}" -Dusr.updateUsername.ratePerSecond=5 -Dusr.updateUsername.durationInSeconds=20

    runTest com.wsgc.user.CreateUser "CreateUser_10_10_${a}" -Dusr.create.ratePerSecond=10 -Dusr.create.durationInSeconds=10
    runTest com.wsgc.user.LoggedInUserDetails "LoggedInUserDetails_10_10_${a}" -Dusr.userDetails.ratePerSecond=10 -Dusr.userDetails.durationInSeconds=10
    runTest com.wsgc.user.UpdateDisplayName "UpdateDisplayName_10_10_${a}" -Dusr.updateDisplayName.ratePerSecond=10 -Dusr.updateDisplayName.durationInSeconds=10
    runTest com.wsgc.user.ConfirmUser "ConfirmUser_10_10_${a}" -Dusr.ratePerSecond=10 -Dusr.durationInSeconds=10
    runTest com.wsgc.user.CreateLink "CreateLink_10_10_${a}" -Dusr.createLink.ratePerSecond=10 -Dusr.createLink.durationInSeconds=10
    runTest com.wsgc.user.GetLink "GetLink_10_10_${a}" -Dusr.createLink.ratePerSecond=5 -Dusr.getLink.durationInSeconds=20
    runTest com.wsgc.user.PasswordResetEmail "PasswordResetEmail_10_10_${a}" -Dusr.ratePerSecond=10 -Dusr.durationInSeconds=10
    runTest com.wsgc.user.UpdatePassword "UpdatePassword_10_10_${a}" -Dusr.updatePassword.ratePerSecond=10 -Dusr.updatePassword.durationInSeconds=10
    runTest com.wsgc.user.UpdateUsername "UpdateUsername_10_10_${a}" -Dusr.updateUsername.ratePerSecond=10 -Dusr.updateUsername.durationInSeconds=10

    runTest com.wsgc.user.CreateUser "CreateUser_20_5_${a}" -Dusr.create.ratePerSecond=20 -Dusr.create.durationInSeconds=5
    runTest com.wsgc.user.LoggedInUserDetails "LoggedInUserDetails_20_5_${a}" -Dusr.userDetails.ratePerSecond=20 -Dusr.userDetails.durationInSeconds=5
    runTest com.wsgc.user.UpdateDisplayName "UpdateDisplayName_20_5_${a}" -Dusr.updateDisplayName.ratePerSecond=20 -Dusr.updateDisplayName.durationInSeconds=5
    runTest com.wsgc.user.ConfirmUser "ConfirmUser_20_5_${a}" -Dusr.ratePerSecond=20 -Dusr.durationInSeconds=5
    runTest com.wsgc.user.CreateLink "CreateLink_20_5_${a}" -Dusr.createLink.ratePerSecond=20 -Dusr.createLink.durationInSeconds=5
    runTest com.wsgc.user.GetLink "GetLink_20_5_${a}" -Dusr.createLink.ratePerSecond=5 -Dusr.getLink.durationInSeconds=20
    runTest com.wsgc.user.PasswordResetEmail "PasswordResetEmail_20_5_${a}" -Dusr.ratePerSecond=20 -Dusr.durationInSeconds=5
    runTest com.wsgc.user.UpdatePassword "UpdatePassword_20_5_${a}" -Dusr.updatePassword.ratePerSecond=20 -Dusr.updatePassword.durationInSeconds=5
    runTest com.wsgc.user.UpdateUsername "UpdateUsername_20_5_${a}" -Dusr.updateUsername.ratePerSecond=20 -Dusr.updateUsername.durationInSeconds=5

##  Profile tests

    runTest com.wsgc.profile.PutProfile "PutProfile_5_20_${a}" -Dprofile.putTestUsersPerSecond=5 -Dprofile.putTestDurationInSeconds=20
    runTest com.wsgc.profile.ReadProfileId "ReadProfileId_5_20_${a}" -Dprofile.getTestUsersPerSecond=5 -Dprofile.getTestDurationInSeconds=20
    runTest com.wsgc.profile.ReadProfileMe "ReadProfileMe_5_20_${a}" -Dprofile.getTestUsersPerSecond=5 -Dprofile.getTestDurationInSeconds=20

    runTest com.wsgc.profile.PutProfile "PutProfile_10_10_${a}" -Dprofile.putTestUsersPerSecond=10 -Dprofile.putTestDurationInSeconds=10
    runTest com.wsgc.profile.ReadProfileId "ReadProfileId_10_10_${a}" -Dprofile.getTestUsersPerSecond=10 -Dprofile.getTestDurationInSeconds=10
    runTest com.wsgc.profile.ReadProfileMe "ReadProfileMe_10_10_${a}" -Dprofile.getTestUsersPerSecond=10 -Dprofile.getTestDurationInSeconds=10

    runTest com.wsgc.profile.PutProfile "PutProfile_20_5_${a}" -Dprofile.putTestUsersPerSecond=20 -Dprofile.putTestDurationInSeconds=5
    runTest com.wsgc.profile.ReadProfileId "ReadProfileId_20_5_${a}" -Dprofile.getTestUsersPerSecond=20 -Dprofile.getTestDurationInSeconds=5
    runTest com.wsgc.profile.ReadProfileMe "ReadProfileMe_20_5_${a}" -Dprofile.getTestUsersPerSecond=20 -Dprofile.getTestDurationInSeconds=5

##  Registry tests

    runTest com.wsgc.registry.CreateRegistries "CreateRegistries_5_20_${a}" -Dregistry.create.ratePerSecond=5 -Dregistry.create.durationInSeconds=20
    runTest com.wsgc.registry.DeleteRegistries "DeleteRegistries_5_20_${a}" -Dregistry.delete.ratePerSecond=5 -Dregistry.delete.durationInSeconds=20
    runTest com.wsgc.registry.GetRegistriesByOwner "GetRegistriesByOwner_5_20_${a}" -Dregistry.get.ratePerSecond=5 -Dregistry.get.durationInSeconds=20
    runTest com.wsgc.registry.UpdateAccessControlAddCoRegistrant "UpdateAccessControlAddCoRegistrant_5_20_${a}" -Dregistry.update.ratePerSecond=5 -Dregistry.durationInSeconds=20
    runTest com.wsgc.registry.UpdateAccessControlDeleteCoRegistrant "UpdateAccessControlDeleteCoRegistrant_5_20_${a}" -Dregistry.update.ratePerSecond=5 -Dregistry.durationInSeconds=20

    runTest com.wsgc.registry.CreateRegistries "CreateRegistries_10_10_${a}" -Dregistry.create.ratePerSecond=10 -Dregistry.create.durationInSeconds=10
    runTest com.wsgc.registry.DeleteRegistries "DeleteRegistries_10_10_${a}" -Dregistry.delete.ratePerSecond=10 -Dregistry.delete.durationInSeconds=10
    runTest com.wsgc.registry.GetRegistriesByOwner "GetRegistriesByOwner_10_10_${a}" -Dregistry.get.ratePerSecond=10 -Dregistry.get.durationInSeconds=10
    runTest com.wsgc.registry.UpdateAccessControlAddCoRegistrant "UpdateAccessControlAddCoRegistrant_10_10_${a}" -Dregistry.update.ratePerSecond=10 -Dregistry.update.durationInSeconds=10
    runTest com.wsgc.registry.UpdateAccessControlDeleteCoRegistrant "UpdateAccessControlDeleteCoRegistrant_10_10_${a}" -Dregistry.update.ratePerSecond=10 -Dregistry.update.durationInSeconds=10

    runTest com.wsgc.registry.CreateRegistries "CreateRegistries_20_5_${a}" -Dregistry.create.ratePerSecond=20 -Dregistry.create.durationInSeconds=5
    runTest com.wsgc.registry.DeleteRegistries "DeleteRegistries_20_5_${a}" -Dregistry.delete.ratePerSecond=20 -Dregistry.delete.durationInSeconds=5
    runTest com.wsgc.registry.GetRegistriesByOwner "GetRegistriesByOwner_20_5_${a}" -Dregistry.get.ratePerSecond=20 -Dregistry.get.durationInSeconds=5
    runTest com.wsgc.registry.UpdateAccessControlAddCoRegistrant "UpdateAccessControlAddCoRegistrant_20_5_${a}" -Dregistry.update.ratePerSecond=20 -Dregistry.update.durationInSeconds=5
    runTest com.wsgc.registry.UpdateAccessControlDeleteCoRegistrant "UpdateAccessControlDeleteCoRegistrant_20_5_${a}" -Dregistry.update.ratePerSecond=20 -Dregistry.update.durationInSeconds=5

## AVS tests

    runTest com.wsgc.avs.AddressVerificationRequestForAVSTest "AddressVerificationRequestForAVSTest_5_20_${a}" -Davs.create.ratePerSecond=5 -Davs.create.durationInSeconds=20
    runTest com.wsgc.avs.AddressVerificationRequestForTrilliumTest "AddressVerificationRequestForTrilliumTest_5_20_${a}" -Davs.create.ratePerSecond=5 -Davs.create.durationInSeconds=20
done

exit 0
