# encoding: utf-8
@COFChallengeFlow
Feature: COFChallengeFlow

Background:
 Given user is on NLID screen

  @P11270-12785 @AndroidRegression @iOSRegression @FirstRun
  Scenario: Check whether user able to navigate user to the 3DS SDK driven screen and allowing user to enter the password,when user has set-up password at the payment method level
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN

  @P11270-12790 @AndroidRegression @iOSRegression @FirstRun
  Scenario: Check whether user is navigating to start fueling screen when entered password is correct and 3DS SDK response is success
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then user lands on authorize payment screen

  @P11270-12794 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether user able to see  webpage controlled by 3DS SDK, when the user has successfully authenticated the transaction, then 3DS SDK has responded back with the success response (A-Res) and 3DS SDK responded back with Challenge-response
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then user lands on authorize payment screen
    Then validate if user is on 3ds password screen

  @P11270-12799 @AndroidRegression @IosRegression @FirstRun
  Scenario: Dismiss the  Fraud Prevention prompt as per �Requirement 1.e�  if the user has tapped on the button(Fueling Flow)
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    When user lands on authorize payment screen
    Then validate if user is on 3ds password screen

  @P11270-12800 @AndroidRegression @IosRegression @FirstRun
  Scenario: Display the Identify Confirmation prompt as per �Requirement 1.e�  for 5 seconds [Note: 5 seconds should be configurable](Social) > Social Login )
    Then user is in Linked in Login
    When I enter SSO in login details for "LinkedIn"
    And user taps login button in SSO login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed

  @P11270-12801 @AndroidRegression @IosRegression @FirstRun
  Scenario: Dismiss the Identify Confirmation prompt as per �Requirement 1.e�  if the user has tapped on the button(Social) > Social Login )
    When user taps on Linkedin icon in the NLID
    When I enter SSO in login details for "LinkedIn"
    And user taps login button in SSO login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate if user is on 3ds password screen

  @P11270-12803 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether to Navigate the user to the next respective screen.
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to be sure you are you and you own this card, we need to ask you a few questions. Don�t worry! No monies will be charged to your account" should be displayed
    Then validate if user is on 3ds password screen

  @P11270-12804 @AndroidRegression @IosRegression @FirstRun
  Scenario: Display the Identify Confirmation prompt as per �Requirement 1.e�  for 5 seconds [Note: 5 seconds should be configurable](Manual Registration)
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate Confirmation prompt should be displayed only for 5 seconds

  @P11270-12805 @AndroidRegression @IosRegression @FirstRun
  Scenario: Dismiss the Identify Confirmation prompt as per �Requirement 1.e�  if the user has tapped on the button(Manual Registration)
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate Confirmation prompt should be displayed only for 5 seconds
    Then tap on got it button in overlay

  @P11270-12806 @AndroidRegression @IosRegression @FirstRun
  Scenario: System to display �Custom UI� if the challenge flow is issued for the COF onboarding(Manual Registration)
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021++" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed

  @P11270-12807 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether when user is on �Verify your Password� screen and entered password is incorrect then 3DS SDK response is declined and navigate user to the �Transaction Declined� screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don�t worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate if user is on 3ds password screen
    And enter invalid password and click on submit button
    Then validate error message displayed in modirum screen

  @P11270-12808 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether Navigate the user to �Add Payment Method� screen with a pop up saying: Card added successfully. � screen as per current functionality.
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button
    Then validate success screen for added card


  #This is for OTP card
  @P11270-12809 @AndroidRegression @IosRegression @FirstRun
  Scenario: App should perform 3DS verification for Card Onboarding confirmation
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen

  @P11270-12810 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether when user is on �Verify your Password� screen and entered password is incorrect then 3DS SDK response is declined and navigate user to the �Transaction Declined� screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    And enter invalid password and click on submit button
    Then validate error message displayed in modirum screen

  @P11270-12836 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for the payment method on successfully verifying the  PIN, TouchID, FaceId
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen

  @SmokeTest @P11270-15918 @P11270-12845 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether user is navigating to start fueling screen when entered password is correct and 3DS SDK response is success
    When user is in login screen
    And I enter "Offer23" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then user taps on done button after finishing fuelling

  @P11270-12850 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether user able to navigate user to the 3DS SDK driven screen and allowing user to enter the password,when user has set-up password at the payment method level
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    When user lands on authorize payment screen
    And enter valid password and click on submit button

  @P11270-12860 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether user able to see  webpage controlled by 3DS SDK, when user has successfully authenticated the transaction,then 3DS SDK has responded back with the success response (A-Res) and 3DS SDK responded back with Challenge response
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt

  @P11270-12862 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for payment method on successfully verifying the  PIN, TouchID, FaceId
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    
    @P11270-12894 @AndroidRegression @IosRegression @FirstRun
  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for payment method on successfully verifying the  PIN, TouchID, FaceId
    When user Tap on facebook button
    And  user enter the mobile number
    When user enter the password
    And user click on continue button
    And validate the facebook prompt
    Then user is on NLID screen

  @P11270-12870 @AndroidRegression @IosRegression @FirstRun
  Scenario: Display the Identify Confirmation prompt as per ‘Requirement 1.e’  for 5 seconds [Note: 5 seconds should be configurable] (Fueling Flow)
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    When user lands on authorize payment screen


    @P11270-12890 @AndroidRegression @IosRegression @FirstRun
    Scenario: Check whether system able to perform the 3DS SDK verification System to display error message pop up based on the error response from SDK
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number 
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    And tap on cancel button navigate to payment screen
    
    
    @P11270-12895 @AndroidRegression @IosRegression @FirstRun
  Scenario: Display ‘Custom UI’ if the challenge flow is issued for the COF onboarding(Registration (Social) > Social Login )
    Then user is in Linked in Login
    When I enter SSO in login details for "LinkedIn"
    And user taps login button in SSO login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed

@P11270-12897 @AndroidRegression @IosRegression @FirstRun
    Scenario: Check whether User cancels the Challenge Scenario.
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number 
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    And tap on cancel button navigate to payment screen
    
    @P11270-12892 @P11270-12888 @AndroidRegression @IosRegression @FirstRun
    Scenario: Check whether User clicks on DONE again, based on 3DS SDK status, the app will display the challenge flow. (repeat the flow until the user complete the challenge flow or cancels the step or try with another card
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number 
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    And tap on cancel button navigate to payment screen

  @P11270-12918 @iOSRegression @FirstRun
  Scenario: Check whether 3DS SDK will control on which Challenge Flow to display for the user
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "testessoapp2021+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    When user taps on add payment method
    Then Verify user is navigated to Add Payment Method screen
    And Tap on Add Debit or Credit card details
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter "4012-0000-0001-2003-001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    Then validate 3DS passphrase prompt
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button

  @P11270-12887 @AndroidRegression @IosRegression @FirstRun
  Scenario: System to display ‘Custom UI’ if the challenge flow is issued for the COF based fuelling-authorization request(Fueling Flow)
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed

  @Smoke_iOS @P11270-22893
  Scenario: Check whether the user navigates to Add Payment Method screen with a pop up saying'Card added successfully' as per current functionality
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    Then tap on ok button and close location copy text
    Then enter name of the card
    Then enter " 4012-0000-0001-2003-001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then validate if user is on 3ds password screen
    When enter valid password and click on submit button
    Then validate success screen for added card
    Then user kill and relaunch the app
    And user taps on More button in tab bar
    When user navigates to Account screen
    And tap on ok button for default method if displayed

