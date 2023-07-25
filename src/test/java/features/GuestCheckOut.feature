@Guest_Check_Out
Feature: Guest_Check_Out

  Background:
    Given user is on NLID screen


  @P11270-12104 @AndroidRegression @GCO @GCO_Android
  Scenario: Check whether the user is able to view the location permission popup in Allow loaction screen (Android)
    Given reset the app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Check whether user is able to navigate to the Allow Location screen from the terms and condition screen
    And Tap the continue button in the Allow location screen
    Then Verify whether the user is able to view the location permission popup
    And Tap on Deny button
    Then Verify user is navigated to Scan QR Code screen
    And Tap on turn on location link
    And Tap on Allow Location
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin

  @P11270-12239  @AndroidRegression
  Scenario:  Check whether the user is able to see the notification permission in the thank you screen when the notification permission is denied in the app start up (iOS)
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    And Tap on Send my Reciept button with the checkbox checked
    Then Verify user should see the prompt with message displayed as Receipt Sent Successfully
    And tap on Ok Button
    Then User is navigated to Thank You screen
    When Tap on Remind later link
    Then Verify user should navigate the NLID screen

  @P11270-12237  @AndroidRegression
  Scenario:  Check whether the user is able to see the Thank you screen after tapping the send my receipts button
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    And Tap on Send my Reciept button with the checkbox checked
    Then Verify user should see the prompt with message displayed as Receipt Sent Successfully
    And tap on Ok Button
    Then User is navigated to Thank You screen
    Then Verify user should see all the mandatory details in Thank You screen
    And Tap on Close Button
    Then Verify user should navigate the NLID screen

  @P11270-12234 @AndroidRegression
  Scenario: Check whether system to display copy text when user opts out for the marketing subscription
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    And Tap on Send my Reciept button with the checkbox checked
    Then Verify user should see the prompt with message displayed as Receipt Sent Successfully
    And tap on Ok Button
    Then User is navigated to Thank You screen

  @P11270-12231 @AndroidRegression
  Scenario: Check wehther the user is able to view the popup displayed while tapping cancel button in Send reciept screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    When user Tap on Send my Reciept button with the checkbox checked with out entering the email field
    Then Verify the inline error message for Email Validation
    When user Tap on Send my Reciept button with checkbox checked with entering wrong email id
    Then verify the inline error message for Incorrect Email Format
    When User Tap on skip button
    Then Verify user should see the prompt message and buttons listed below

  @P11270-12220  @AndroidRegression
  Scenario: Check whether the user is able to navigate to Transaction complete screen adn verify all the fields are displayed in the transaction complete screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then Verify user is navigated to Now Fuelling screen
    Then Verify  all the fields and elements in the Transaction complete screen are available

  @P11270-12221  @AndroidRegression
  Scenario: Check whether the user is able to navigate to Transaction details screen when tapped on the 'Transaction Details' link
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
#    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When Tap on Transaction Details link in Transaction Complete Screen
    Then Verify user is navigated to Transaction Details screen
    Then Verify all the fields are present in Transaction Details screen
    When user taps on back Arrow from transaction details
    Then verify user navigates to Transaction Complete screen

  @P11270-12222  @AndroidRegression @GCO
  Scenario: Check whether the user is able to view the Send Reciepts screen from the Transaction details screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    And verify all the fields are present in Send Reciept screen

  @P11270-12091 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario:Check whether the user is able to verify the Terms & Conditions screen for the Guest user
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen

  @P11270-12092 @AndroidRegression @iOSRegression @GCO_iOS
  Scenario:Check whether the user is able to view the Terms and Conditions page
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on Terms And Conditons link
    Then Verify The user should see the Terms and conditions document with the heading Terms and Conditions

  @P11270-12093 @AndroidRegression @iOSRegression @GCO_iOS
  Scenario:Check whether the user is able to view the Terms and Conditions page
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on Privacy Policy link
    Then Verify the user should see the Privacy Policy document with the heading Privacy Policy

  @P11270-12094 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario:Check whether the user is able to view the Logical screen after tapping the "CONTINUE" button
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin

  @P11270-12095 @AndroidRegression @GCO @iOSRegression @GCO_Android
  Scenario:Check whether the user is able to view the NLID screen after tapping the "Cancel" button
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on cancel button
    Then verify whether user is navigated back to NLID screen

  @P11270-12096 @AndroidRegression @GCO @GCO_Android
  Scenario:Check whether the user is able to navigate back to NLID screen in Taping back button (Android Specific)
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on the back button in navigation panel
    Then verify whether user is navigated back to NLID screen

  @P11270-12098 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to view the error message for submitting the Terms and condition screen without accepting the PP and TC
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on continue button
    Then Verify user is able to view the copy text appears in the popup for not selecting the checkbox for accepting PP and TC

  @P11270-12099 @AndroidRegression @GCO @GCO_Android
  Scenario: Check whether the user is able to view the error message for submitting the Terms and condition screen without accepting the PP and TC
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on continue button
    Then Verify user is able to view the copy text appears in the popup for not selecting the checkbox for accepting PP and TC
    And Tap on the back button in navigation panel
    Then Verify user is not navigated to other screens when the prompt is active in front screen

  @P11270-12101 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether user is able to navigate to the Allow Location screen from the terms and condition screen
    Given reset the app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on continue button
    Then Check whether user is able to navigate to the Allow Location screen from the terms and condition screen

  @P11270-12102 @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether user is able to see location permission screen with all the text and buttons expected
    Given reset the app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Veriy the user is able to view the location permission screen with all expected elements

  @P11270-12105 @AndroidRegression @GCO @GCO_Android
  Scenario: Check whether the user is able to see "Scan QR" screen when the loaction is not allowed by default
    Given reset the app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify user is navigated to Scan QR Code screen when you deny the location

  @P11270-12108 @AndroidRegression @GCO_iOS @iOSRegression @GCO_Android
  Scenario: Check whether the user is able to view the Select your Pump variation screen through Site checkin
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin

  @P11270-12109 @AndroidRegression @GCO @GCO_Android
  Scenario: Check whether the user is able to view all elements are displayed in the Select your ppump screen
    Given reset the app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Check whether user is able to navigate to the Allow Location screen from the terms and condition screen
    And Tap the continue button in the Allow location screen
    Then Verify whether the user is able to view the location permission popup
    And Tap on Allow Location
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    Then Veriy the user is able to view the Select your pump screen with all expected elements

  @P11270-12113 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user able to see the maximum fuelling amount as 100 in Your pump
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    Then Verify whether the user is able to view the Maximum Fueling Amount as 100 in your pump

  @P11270-12120 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to update the amount in the picker by scrolling
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Maximum Fueling Amount
    And user sets the fueling amount and clicks ok button

  @P11270-12089 @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to verify he dont see the account details from NLID
    When Tap on More button
    And Tap on Account
    Then Verify the popup message to login into app for seeing the feature

  @P11270-12132  @AndroidRegression @GCO @GCO_Android
  Scenario: Check whether the user is able to verify the elements in Add Payment Method screen (Android Only)
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen

  @P11270-12134  @AndroidRegression @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is navigated to the Add Debit or Credit Card Screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    Then Verify the Add Debit or Credit card screen

  @P11270-12135  @AndroidRegression @GCO_iOS @iOSRegression @GCO_Android
  Scenario: Check whether the user is able to go back to the next logical sceen on tapping the cancel button in Add Debit or Credit Card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And Tap on Cancel button in Add Debit or Credit card screen
    Then Verify user is navigated to Add Payment Method screen

  @P11270-12137  @AndroidRegression  @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And Tap on Done button with scroll
    Then Verify the inline error message for Name On Card
    And enter name on the card
    Then Verify the inline error message for Card Number
    And enter Card Number
    Then Verify the inline error message for Expiry Date
    And enter Expiry Date
    Then Verify the inline error message for Security Code
    And enter Security Code

  @P11270-12138  @AndroidRegression  @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to verify all the Billing details info in the Add Debit/Credit card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And Tap on Done button with scroll
    Then Verify Billing Details
    And Tap on Billing info icon
    Then Verify the Billing pop up
    And tap on Ok Button
    Then Verify inline error message for post code
    And enter the postcode
    Then Verify search icon is present
    Then Verify inline error message for Address1
    And enter data in Address1
    And enter data in Address2
    Then Verify the inline error message for city
    And Enter city

  @P11270-12139  @AndroidRegression  @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to navigate to the Post Code Lookup screen while tapping on the search icon next to the Post code field
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter the postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    And validate the fields displayed in the screen are as expected

  @P11270-12140  @AndroidRegression  @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to edit the post code entered in the Add Debit/Credit card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter the postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    And validate the fields displayed in the screen are as expected
    And tap on clear search
    And enter the postcode after clearing the search text

  @P11270-12141  @AndroidRegression  @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is able to search a new postcode in the post code search screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter the postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    And validate the fields displayed in the screen are as expected
    And tap on clear search
    And enter the postcode after clearing the search text
    Then user selects a postcode from the list
    And tap on select

  @P11270-12142  @AndroidRegression  @GCO_iOS @iOSRegression @GCO_Android
  Scenario: Check whether the user is able to see the error message is displayed for tapping done button without filling the card details in the corresponding fields
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter name on the card
    And enter Expiry Date
#    And tap on Ok Button
    And enter Security Code
    And enter the postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    Then user selects a postcode from the list
    And tap on select
    And Tap on Done button with scroll
    Then Verify the inline error message for Card Number

  @P11270-12143  @AndroidRegression  @GCO @iOSRegression @GCO_iOS @GCO_Android
  Scenario: Check whether the user is navigated to Ready to Fueling screen if all the card details are entered correctly
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter name on the card
    And enter Card Number
    And enter Expiry Date
#    And tap on Ok Button
    And enter Security Code
    And enter the postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    Then user selects a postcode from the list
    And tap on select
    And Tap on Done button with scroll
    Then Verify whether the user is navigated to Ready to Start fuelling Screen

  @P11270-12149  @AndroidRegression  @GCO
  Scenario: Check whether the user is able to view the frictionless response from 3DS modirum when user does fueling with a Frictionless payment card added
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter name on the card
    And enter Card Number
    And enter Expiry Date
    And tap on Ok Button
    And enter Security Code
    And enter postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    Then user selects a postcode from the list
    And tap on select
    And Tap on Done button with scroll
    Then Verify whether the user is navigated to Ready to Start fuelling Screen
    Then Tap on continue button in how to fuel screen
    Then Verify user is navigated to Authorising your payment screen
#    And Verify user is navigated to the Start fuelling now screen

  @P11270-12151  @AndroidRegression  @GCO
  Scenario: Check whether the user is able to view the Start Fueling screen after the payment authentication
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And enter name on the card
    And enter Card Number
    And enter Expiry Date
    And tap on Ok Button
    And enter Security Code
    And enter postcode
    And tap on search icon
    Then verify user is navigated to postcode lookup screen
    Then user selects a postcode from the list
    And tap on select
    And Tap on Done button with scroll
    Then Verify whether the user is navigated to Ready to Start fuelling Screen
    Then Tap on continue button in how to fuel screen
    Then Verify user is navigated to Authorising your payment screen
    And verify the Start fueling screen

  @P11270-12156  @AndroidRegression
  Scenario: Check whether the user is able to navigate to Now Fueling screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Verify user is navigated to Authorising your payment screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then Verify user is navigated to Now Fuelling screen

  @P11270-14814  @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to non logged-in dashboard from add payment method screen (GCO) after 300 seconds of inactivity
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to NLID screen from Add Payment method screen after 300 seconds of in activity

  @P11270-12100  @iOSRegression
  Scenario: Check whether the user is able to view the network connectivity message when user has netowork/server error
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Select terms and Condition chek box
    And Tap on continue button
    Then Verify Sorry there was a connectivity issue while updating your details Please try again message should be displayed

  @P11270-14226  @AndroidRegression
  Scenario: Verify if System navigate the user to logged-in dashboard from the Scan QR-Code screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "NectarScreenTimeout" Login to ESSO
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then user navigated to select pump screen
    And Verify user doesn't navigate to LID untill five minutes

  @P11270-14797  @AndroidRegression @iOSRegression @GCO_iOS
  Scenario: Verify if System navigate the user to logged-in dashboard from the Change Payment Details screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "NectarScreenTimeout" Login to ESSO
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then user navigated to select pump screen
    And Click on Payment method link
    Then Verify Payment details screen
    Then Verify user navigated back to LID screen

  @P11270-15038 @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to non logged-in dashboard from the Geolocation based site check-in screen after 300 seconds of inactivityThen Tap on FUEL AS GUEST  Button in the NLID
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then wait for session timeout five minutes and Tap on FUEL AS GUEST  Button in the NLID

  @P11270-14224  @AndroidRegression @iOSRegression @GCO_iOS
  Scenario: Verify if System navigate the user to logged-in dashboard from the Scan QR-Code screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "NectarScreenTimeout" Login to ESSO
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then user navigated to select pump screen
    Then wait for more than five minutes user should navigate back to LID andc click on Start fueling button again

  @P11270-16021_iOS  @iOSRegression @GCO_iOS
  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Selectpump screen
    Then Click on Add Debit or Credit Card
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on the Skip button in Send receipt screen
    Then Verify that confirmation popup for skip send receipt
    And Verify that thank you screen is displayed
    And Click on Close button in Thank you screen

  @P11270-16020_iOS  @iOSRegression @GCO_iOS
  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Selectpump screen
    Then Click on Add Debit or Credit Card
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Verify that Skip button is displayed in send reciept screen

  @P11270-15040  @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to non logged-in dashboard from Ready to start fuelling screen (GCO) after 300 seconds of inactivity
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then user should wait more than three hundred second click on fuel as guest button

  @P11270-15039  @AndroidRegression @iOSRegression @GCO_iOS
  Scenario: Verify if System navigate the user to logged-in dashboard from Ready to start fuelling screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "TestUser1" Login to ESSO app
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then user navigated to select pump screen
    Then wait for more than five minutes user should navigate back to LID

  @P11270-15033  @AndroidRegression @iOSegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to non logged-in dashboard from Add Payment Method scan card screen (GCO) after 300 seconds of inactivity
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    And user clicks on continue button in select pump screen
    And Click on Add Debit or Credit Card
    And Verify that Card details screen is displayed
    Then wait for more than five minutes user should navigate back to NLID screen

  @P11270-14810  @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to logged-in dashboard from Confirm Payment screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "TestUser1" Login to ESSO app
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then Click on Continue button in Select pumpscreen
    And verify that confirm Payment screen is displayed
    Then wait for more than five minutes user should navigate back to LID screen

  @P11270-14798  @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to logged-in dashboard from the Add Nectar Card screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "TestUser1" Login to ESSO app
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then Click on Continue button in Select pumpscreen
    Then wait for more than five minutes user should navigate back to LID screen

  @P11270-12238  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the NLID screen after Thank you screen if the notification permission is allowed
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter the Card Name and Details
    Then Enter the address of Customer
    Then Click on the Done button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Send receipt button
    And Click on ok button present in the receipt sent Success message screen
    And Click on remind me later button
    Then Verify that User is navigate back to NLID screen

  @P11270-12237_iOS  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to see the Thank you screen after tapping the send my receipts button
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter the Card Name and Details
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on the Done button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Send receipt button
    And Click on ok button present in the receipt sent Success message screen
    And Verify the thank you screen should be displayed
    And Click on Close button in Thank you screen
    Then Verify that User is navigate back to NLID screen

  @P11270-12234_iOS  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to send the receipt successfully for the transaction completed
    Then Tap on FUEL AS GUEST  Button in the NLID
    And verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Send receipt button
    And Click on ok button present in the receipt sent Success message screen
    And Verify the thank you screen should be displayed

  @P11270-12231_iOS  @iOSRegression @GCO_iOS
  Scenario: Check wehther the user is able to view the popup displayed while tapping cancel button in Send reciept screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    And verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter the Card Name and Details
    Then Enter the address of Customer
    Then Click on the Done button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Skip button in send receipt screen
    And Click on Skip button on popup screen with confirmation message
    And Verify the thank you screen should be displayed

  @P11270-12222_iOS  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the Send Reciepts screen from the Transaction details screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    And verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter the Card Name and Details
    Then Enter the address of Customer
    Then Click on the Done button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed

  @P11270-12151_iOS  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the Start Fueling screen after the payment authentication
    Then Tap on FUEL AS GUEST  Button in the NLID
    And verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter the Card Name and Details
    Then Enter the address of Customer
    Then Click on the Done button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Verify the all elements are displayed in Start fueling screen

  @P11270-12148  @AndroidRegression @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to navigate to the Payement Authorising Screen after How to fuel screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    And verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Enter the Card Name and Details
    Then Enter the address of Customer
    Then Click on the Done button
    And Verify that Please wait screen is displayed

  @P11270-12144  @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Check whether the user is able to scan the Debit/Credit card on Add Debit/Credit card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    And verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Click on Continue button in Select pumpscreen
    Then Click on Add Debit or Credit Card
    And Verify user is able  to see the Scan your card link in Add Card screen
    And click on the Scan your card link

  @P11270-12130  @iOSRegression  @GCO @GCO_Android @GCO_iOS @GCO_Android1
  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen

  @P11270-14813  @AndroidRegression @GCO @GCO_Android1
  Scenario: Verify if System navigate the user to non logged-in dashboard from Scan QR-Code camera screen (GCO) after 300 seconds of inactivity
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify user is navigated to Scan QR Code screen when you deny the location
    When Tap on Scan QR Code button
    Then Verify user is navigated to Scan QR Code Camera screen
    And Verify user is navigated to NLID screen from Scan QR Code Camera screen after 300 seconds of in activity

  @P11270-14796  @AndroidRegression @GCO
  Scenario: Verify if System navigate the user to logged-in dashboard from the Add Nectar Card screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "TestUser1" Login to ESSO app
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then Verify user is navigated to Scan QR Code screen when you deny the location
    When Tap on Scan QR Code button
    Then Verify user is navigated to Scan QR Code Camera screen
    And Verify user is navigated to LID screen from Scan QR Code Camera screen after 300 seconds of in activity

  @P11270-12124  @iOSRegression  @GCO_iOS
  Scenario: Check whether the user is able to verify the elements in Select your Payment screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify whether the user is able to view the Select your pump screen displayed with all the elements

  @P11270-12111  @AndroidRegression  @GCO @iOSRegression  @GCO_iOS @GCO_Android1
  Scenario: Check whether the user is able to view all elements are displayed in the Select your ppump screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify the Elements presnt in the Select your pump screen

  @P11270-12128  @iOSRegression  @GCO_iOS
  Scenario: Check whether the user is able to verify the elements in Select your Payment screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify the Elements present in the Select your pump screen
    And Click on Continue button in Select pumpscreen
    Then Verify user is navigated to Add Payment Method screen
    Then Verify the Elements present in the Add Payment Method screen

  @P11270-12109_iOS  @iOSRegression  @GCO_iOS
  Scenario: Check whether the user is able to view all elements are displayed in the Select your pump screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify the Elements present in the Select your pump screen

  @P11270-12239_iOS  @iOSRegression  @GCO_iOS
  Scenario: Check whether the user is able to see the notification permission in the thank you screen when the notification permission is denied in the app start up
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify the Elements present in the Select your pump screen
    And Click on Continue button in Select pumpscreen
    Then Verify user is navigated to Add Payment Method screen
    Then Verify the Elements present in the Add Payment Method screen
    And Click on Add Debit or Credit Card
    Then Verify user is navigated to Add Debit or Credit card screen
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    And Enter email and Click on send receipt
    And Verify Receipt success message
    And Verify that thank you screen is displayed
    When User click on remind me later link in thank you screen
    Then Verify the CT text displayed with Cancel button

  @P11270-14809 @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to logged-in dashboard from the Rewards screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "NectarScreenTimeout" Login to ESSO
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then user navigated to select pump screen
    Then wait for more than five minutes user should navigate back to LID screen

  @P11270-12149_iOS @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the frictionless response from 3DS modirum when user does fueling with a Frictionless payment card added
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify the Elements present in the Select your pump screen
    And Click on Continue button in Select pumpscreen
    Then Verify user is navigated to Add Payment Method screen
    Then Verify the Elements present in the Add Payment Method screen
    And Click on Add Debit or Credit Card
    Then Verify user is navigated to Add Debit or Credit card screen
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed

  @P11270-16020_Android  @AndroidRegression @GCO
  Scenario: Check whether Skip button is re-labelled as Cancel button on GCO Send Receipt screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    And Verify skip button should be displayed on the screen

  @P11270-12110 @AndroidRegression @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the frictionless response from 3DS modirum when user does fueling with a Frictionless payment card added
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify the Elements present in the Select your pump screen

  @P11270-12103  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the location permission popup in Allow loaction screen
    Given Install and launch the Esso app
    Then user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    And Click on Continue button in Allow location screen
    And Verify that elements displayed in Location access page

  @P11270-14800  @AndroidRegression @iOSRegression @GCO_iOS @GCO_Android1
  Scenario: Verify if System navigate the user to logged-in dashboard from the Change Payment Details screen after 300 seconds of inactivity
    Then click on the login link in dashboard
#    When Enter "NectarScreenTimeout" Login to ESSO
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then user navigated to select pump screen
    And Click on Continue button in Select pumpscreen
    And Verify that Confirm Payment screen with all the elements details
    And Click on Change payment link
    And Verify that Payment details screen
    Then Verify user navigated back to LID screen

  @P11270-16021_Android  @AndroidRegression @GCO
  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Tap on Add Debit or Credit card details
    Then Add Card Details
    Then Tap on done button
    Then Tap on continue button in how to fuel screen
    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
    Then verify user navigates to Transaction Complete screen
    When user tap on Done button in Transaction Complete screen
    Then Verify user is navigated to Send Reciept screen
    When User Tap on skip button
    Then Verify user should see the prompt message and buttons listed below
    When user tap on Collect Reciept button
    Then Verify user is navigated to Send Reciept screen
    When User Tap on skip button
    Then Verify user should see the prompt message and buttons listed below
    When user taps on SKIP button in confirmation prompt
    Then User is navigated to Thank You screen

  @P11270-12146  @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to view the Ready for Fueling screen after the payment authentication completed
    Given Install and launch the Esso app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    And Tap on continue button location screen and select allow while using app in select location popup
    Then Verify the Elements present in the Select your pump screen
    And Click on Continue button in Select pumpscreen
    Then Verify user is navigated to Add Payment Method screen
    Then Verify the Elements present in the Add Payment Method screen
    And Click on Add Debit or Credit Card
    Then Verify user is navigated to Add Debit or Credit card screen
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Ready to start Fuelling screen is displayed with How to fuel header
    Then Verify the element displayed in the Ready to start fuel screen

  @P11270-15035  @iOSRegression @GCO_iOS
  Scenario: Verify if System navigate the user to non logged-in dashboard from Ready to start fuelling screen (GCO) after 300 seconds of inactivity
    Given Install and launch the Esso app
    Given user is on NLID screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    And Tap on continue button location screen and select allow while using app in select location popup
    And Click on Continue button in Select pumpscreen
    Then Verify user is navigated to Add Payment Method screen
    Then Verify the Elements present in the Add Payment Method screen
    And Click on Add Debit or Credit Card
    Then Verify user is navigated to Add Debit or Credit card screen
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on Done button in Add Card Screen
    And Verify that Ready to start Fuelling screen is displayed with How to fuel header
    Then Verify the element displayed in the Ready to start fuel screen
    Then verify whether user is navigated back to NLID screen

  @GCOErrorValidation @iOSRegression @GCO_iOS
  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    Then Verify user is navigated to Add Payment Method screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    And Tap on Done button with scroll
    Then Verify the inline error message for Name On Card
    And enter name on the card
    Then Verify the inline error message for Card Number
    And enter Card Number
    Then Verify the inline error message for Expiry Date
    And enter Expiry Date
    Then Verify the inline error message for Security Code
    And enter Security Code
    Then Verify inline error message for post code
    And enter the postcode
    Then Verify search icon is present
    Then Verify inline error message for Address1
    And enter data in Address1
    And enter data in Address2
    Then Verify the inline error message for city
    And Enter city
    Then Click on the Done button
    And Verify that Please wait screen is displayed
    When user lands on card verification screen GCO
    And enter valid password and click on submit button GCO
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Send receipt button
    And Click on ok button present in the receipt sent Success message screen
    And Verify the thank you screen should be displayed
    And Click on Close button in Thank you screen
    Then Verify that User is navigate back to NLID screen

  @P11270-22889 @Smoke_iOS
  Scenario: Check whether the user is able perform fuelling with 3DS passphrase Card and User should be navigate to Thank you screen after tapping on send my receipts button
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify Location page and Select allow while using app button
    Then Verify the Elements present in the Select your pump screen
    When Click on info icon next to max fuelling amount link
    And Tap on Maximum Fueling Amount
    And user sets the fueling amount and clicks ok button
    Then Click on Continue button in Select pumpscreen
#    Then Click on Add Debit or Credit Card
#    And verify elements displayed in Add Card Screen
    Then Tap on Add Debit or Credit card details
    Then Verify user is navigated to Add Debit or Credit card screen
    Then Verify the Add Debit or Credit card screen
    And Enter name Card Name
    And Enter Challenge flow 3DS card Card Name
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on the Done button
    And Verify the ready to start fuelling if displayed click on continue button
    And Verify that Please wait screen is displayed
    When user lands on card verification screen GCO
    And enter valid password and click on submit button GCO
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Send receipt button
    And Click on ok button present in the receipt sent Success message screen
    And Verify the thank you screen should be displayed
    When User click on remind me later link in thank you screen
    Then Verify the CT text displayed with Cancel button
    Then Verify that User is navigate back to NLID screen

  @P11270-22890 @Smoke_iOS
  Scenario: Check whether the user is able perform fuelling with Frictionless Card and User should be navigate to Thank you screen after tapping on send my receipts button
    Then Tap on FUEL AS GUEST  Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify Location page and Select allow while using app button
    Then Verify the Elements present in the Select your pump screen
    When Click on info icon next to max fuelling amount link
    And Tap on Maximum Fueling Amount
    And user sets the fueling amount and clicks ok button
    Then Click on Continue button in Select pumpscreen
    Then Tap on Add Debit or Credit card details
    And verify elements displayed in Add Card Screen
    And Enter name Card Name
    And Enter name Card Number
    And Enter name Card Exp Date
    And Enter name Security Code
    And Enter name PostCode
    And Enter name Address1
    And Enter name AddressSecond
    And Enter name Card City
    Then Click on the Done button
    And Verify the ready to start fuelling if displayed click on continue button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And Transaction Complete screen is displayed for the user
    When Tap on Transaction Details link in Transaction Complete Screen
    Then Verify user is navigated to Transaction Details screen
    Then Verify all the fields are present in Transaction Details screen
    When user taps on back Arrow from transaction details
    Then verify user navigates to Transaction Complete screen
    And Click on done button in transaction complete screen
    Then Verify Send receipt screen is displayed
    And Click on Send receipt button
    And Click on ok button present in the receipt sent Success message screen
    And Verify the thank you screen should be displayed
    And Click on Close button in Thank you screen
    Then Verify that User is navigate back to NLID screen

  @DemoTestCase2 @iOSRegression @GCO_iOSDemoTesCase
  Scenario: User should be able to Perform Fuelling with PayPal account Click on Done button in Transaction Complete screen
    Then click on the login link in dashboard
#    When Enter "TestUser1" Login to ESSO app
#    Then Click on login button
    When I enter "smokecredentials4" in login details
    And user taps login button in login screen
    And Click on start fuel button in LID
    Then Click on Continue button in Select pumpscreen
    And Verify that Confirm Payment screen with all the elements details
    Then Click on Confirm Payment with PayPal
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    Then user taps on done button after finishing fuelling
    And Verify the Use should be navigated to Thank you Screen




