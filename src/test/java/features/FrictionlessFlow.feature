@Frictionless @Frick
Feature: FrictionlessFlow
Background:
	Given user is on NLID screen

	@P11270-12883 @AndroidRegression @Frick
	Scenario: system to display search as an icon
    Then user is in login screen
	When I enter "Challenge2" in login details
	And user taps login button in login screen
	And user on More button in tab bar
	And user navigate to account screen
	And enter the Add card button
	And user enter card Name
	And user enter card number
	And user enter card exp date
	And enter security code
	And  user enter postcode
	And user able to see the search icon

@P11270-12866 @AndroidRegression @Frick_Android
Scenario: Check weather system to display the logo of the card
	Then user is in login screen
	When I enter "FrictEssoPsword" in login details
	And user taps login button in login screen
	And user on More button in tab bar
	And user navigate to account screen
	And verify the card number
	And verify tick mark in payment method
	Then verify card logo

@P11270-12875 @AndroidRegression @Frick
  Scenario: Check weather System to display ‘Edit’ button if card is added
    Then user is in login screen
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    And user on More button in tab bar
    And user navigate to account screen
    And verify the card number
    And verify tick mark in payment method
    And user enter the edit button
    And user able to see the edit payment method

@11270-12905 @AndroidRegression @Frick
  Scenario: Check whether the system to navigate the user to Enter PIN and user should see following details for Enter PIN screen
    Then user is in login screen
    When enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    When user taps on fuel icon and start fuelling button
    Then user select pumb and tap on continue button
    And user enter the confirms the payment button
    And user able to see the cancel button
    And user enter the Enter PIN number
    Then user able to see the screen label for Enter your Esso PIN to Authorize Payment
    Then user enter PIN for unlock the app for fueling
    Then Tap the continue button
    Then user able to see the Forgot password Screen

@11270-12912 @AndroidRegression @Frick @IosRegression
	Scenario: Validate invalid password popup error message "Due to security reasons you need to login again.Button: OK"
	Then user is in login screen
	When I enter "FrictEssoPswordchk" in login details
	And  user taps login button in login screen
	When user taps on fuel icon and start fuelling button
	Then user select pumb and tap on continue button
	And  user enter the confirms the payment button
	And  user should enter wrong PIN three times
	And  user should verify navigate to Enter password Screen
	When user enter invalid password in enter password screen
	Then user able to see invalid password popup message

@11270-12913 @AndroidRegression @Frick @IosRegression
	Scenario: Check whether system to navigate user back to Account screen tapping on ‘Cancel’ button
	Then     user is in login screen
	When     I enter "FrictEssoPswordchk" in login details
	And      user taps login button in login screen
	When     user taps on fuel icon and start fuelling button
	Then     user select pumb and tap on continue button
	And      user enter the confirms the payment button
#	And      user able to see the cancel button
	And      user should enter wrong PIN three times
	And      user should verify navigate to Enter password Screen
	And      user tap the cancel button
  @11270-12913 @AndroidRegression @Frick
  Scenario: Check whether system to navigate user back to Account screen tapping on ‘Cancel’ button
    Then user is in login screen
    When I enter "FrictEssoPswordchk" in login details
    And user taps login button in login screen
    When user taps on fuel icon and start fuelling button
    Then user select pumb and tap on continue button
    And user enter the confirms the payment button
    And user able to see the cancel button
    And user should enter wrong PIN three times
    And user should verify navigate to Enter password Screen
    And user tap the cancel button

	@11270-12840 @AndroidRegression
	Scenario: Check weather system to display the Text Esso PIN on Accounts screen
	When      user taps on register button from Login screen
	Then      user should be navigated to Manual Register screen
	Then      enter the firstName
	Then      enter the secondName
	Then      enter the emailAddress
	Then      enter the password
	Then      enter the confirm password
	Then      click the Accept checkBox
	Then      click the check box for accept
	When      click on continue button from register screen
	When      user tap on Skip button
	Then      the system should display Skip warning popup
	When      user tap on Skip anyway
	Then      app to dismiss the popup and navigate the user to LID after review
	And      user on More button in tab bar
	And      user navigate to account screen
	Then      user able to see the Esso PIN on Account Screen
  @11270-12840 @AndroidRegression
  Scenario: Check weather system to display the Text Esso PIN on Accounts screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter the firstName
    Then enter the secondName
    Then enter the emailAddress
    Then enter the password
    Then enter the confirm password
    Then click the Accept checkBox
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user on More button in tab bar
    And user navigate to account screen
    Then user able to see the Esso PIN on Account Screen

	@11270-12823 @AndroidRegression
	Scenario: Check whether the User should see the following details for the‘Forgot Password’ Screen title: ‘Forgot Password’ ii. ‘Back’ buttoniii. CT
	screen label: In order to reset your password, an email will be sent to your address: (User email address) ‘SEND’ button
	When user tab on register button from login screen
	Then user should be navigated to Manual Register screen
	Then enter the firstName
	Then enter the secondName
	Then enter the emailAddress
	Then enter the password
	Then enter the confirm password
	Then click the Accept checkBox
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user on More button in tab bar
	And user navigate to account screen
	Then user able to see the Esso PIN on Account Screen
	Then enter the edit button
	Then click the Forgot your password link
	Then user able to see the back button
	Then user able to verify the forgot text and email address
	Then user able to see the send button

  @11270-12915 @AndroidRegression @Frick
  Scenario: whether the system to navigate the user to Enter Password screen and
    the user should see the following details for the Enter password screen
    Then user is in login screen
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    When user taps on fuel icon and start fuelling button
    Then user select pumb and tap on continue button
    And user enter the confirms the payment button
    Then user click forgot button
    And user able to see the cancel button
    And user able see the Enter password text
    And user able to see esso app password text
    And user able to view the password

	@11270-12914 @AndroidRegression @Frick @IosRegression
	Scenario: Check whether system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Then user is in login screen
		When I enter "FrictEssoPsword" in login details
		And  user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		Then user click forgot button
		And user able to see the Forgot password Screen

@P11270-12789 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the details of icons greyed out after entering the card number
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user enters the card number
	And user checks for verifies the logo color

@P11270-12786 @AndroidRegression @IosRegression
	Scenario: Check Whether System to show inline error message when user leaves the field blank and clicks on continue
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user click card details in Credit debit screen
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for card number field

	@P11270-12789 @iOSRegression
	Scenario:Check whether the system displays icons for cards of all app supported credit cards will be displayed here.
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
		When user enters the unsupported card number in the Card number field
		Then verify whether the logo of the cards are greyed out
		When user enters the first four digits of a valid card number in the Add number field
		Then verify whether the logo of the entered card is active


@P11270-12791 @AndroidRegression @IosRegression
	Scenario: Check Whether system allows the user to enter set the pin in numeric field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad

@P11270-12792 @AndroidRegression @IosRegression
	Scenario: Check Whether the system displays the Set up pin screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad

@P11270-12793 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the dot for completed pin in Payment Method
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin for first
	Then user verifies the first pin displayed as dot

	@P11270-12793  @iOSRegression
	Scenario: Check Whether System displays the dot for completed pin in Payment Method
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
		Then user verifies the entered pin as dot

	@P11270-12795 @iOSRegression
	Scenario: Check System to display the following prompt when the card is successfully added a. Title: Message,Copy Text Message Card added successfully. Buttons:OK b. System to navigate user back to the account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "praveenkumar.balasubramani+" Email address
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
		Then enter "5544 3300 0000 0011" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then validate success screen for added card
		And verify if the user is navigated to Add nectar screen

	@P11270-12795 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the card added success message
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
#	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
#	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details in Billing Screen except fingerprint checkbox
	Then user clicks on continue button in Card screen
	Then user verifies the completed popup message for card added
	And user clicks on ok button in card added message

@P11270-12796 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the set pin screen through Account
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user clicks on esso pin edit
	And user sets the pin number
	Then user clicks on continue
#	Then user enters the esso password
#	And user clicks on continue button in password screen
	Then user verifies the set new pin screen

	@P11270-12797 @iOSRegression
	Scenario: Check Whether System displays the unsupported card message in Billing details screen while entering wrong card number
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		Then Verify user is navigated to Add Payment Method screen
		And Tap on Add Debit or Credit card details
		When user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then tap on ok button and close location copy text
		When user enters invalid card number and other valid card details
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then user verifies the inline error msg for the invalid card


@P11270-12797 @AndroidRegression
	Scenario: Check Whether System displays the unsupported card message in Billing details screen while entering wrong card number
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters wrong card number in Billing Details screen
	Then user clicks on continue button in Card screen
	Then user verifies the popup message for entering wrong card number and clicks ok button

	@P11270-12798 @iOSRegression
	Scenario: Check Whether System displays the entered card number in the Card number field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		And user enters the maximum digit card number in the Card Number field
		Then verify whether the entered card number is displayed

@P11270-12798 @AndroidRegression
	Scenario: Check Whether System displays the entered card number in the Card number field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card number
	Then user verifies the entered card number

@P11270-12811 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Add payment in profile completion screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user verifies the Add Payment Method in Complete Profile screen

@P11270-12812 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays set up pin through Account screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user clicks on more icon
	Then user clicks on Account
	And user clicks on esso link in Account
	Then user verifies the Set Esso link screen
	And user clicks on Continue without entering PIN
	Then user verifies the inline error message

@P11270-12813 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the set up pin through Account screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user clicks on more icon
	Then user clicks on Account
	And user clicks on esso link in Account
	Then user verifies the set up pin back link and screen title

	@P11270-12813  @IosRegression @Frick
	Scenario: Check whether User to see the following details for Set Up PIN screen a. Screen Title: Set up PIN b. Cancel button c. CT: Set the Esso PIN to unlock the app for fuelling
	Then user is in login screen
	When I enter "Challenge2" in login details
	And user taps login button in login screen
	Then verify whether the system displays 'Add a payment method to pay at the pump'link in LID
	When user taps on More button in tab bar
	When user navigates to Account screen
	And user verifies the Esso PIN under User Profile in Account Screen
	And user clicks the link to set up Esso Pin under User Profile section
	When user is on setup PIN screen
	Then user verifies the set up pin back link and screen title

	@P11270-12814 @iOSRegression
	Scenario: Check Whether System displays the Name on Card in Billing Details Screen
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
		And user enters the maximum characters in Card Name field
		Then verify whether the entered card name is displayed

	@P11270-12814 @AndroidRegression
	Scenario: Check Whether System displays the Name on Card in Billing Details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on Name on card in Billing Details Screen
	And user enters thirty characters in the Name on card field
	Then user verifies the entered characters in the field

@P11270-12815 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the united kingdom in Billing details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details except city name
	Then user verifies the united kingdom text in Billing Details screen

	@P11270-12815 @iOSRegression
	Scenario: Check Whether System displays the united kingdom in Billing details screen
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
		And user scrolls to Country name under Billing Details Section
		Then user verifies the Country name as 'United Kingdom' by default


	@P11270-12816 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error message for city in Credit Debit Card Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user enters the card details except city name
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for city name

@P11270-12817 @AndroidRegression @IosRegression
	Scenario: Check Whether System the email sent popup in forgot your password screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	Then user verifies the Set Up pin screen with numeric keypad
	And user taps on forgot password in PIN
	Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
	And user taps on forget password link
	Then user clicks on send button to re login
	Then user verifies the popup message for relogin the Application

@P11270-12818 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the Add card link in Account screen
	When user clicks on Login Icon
	Then user enters the valid credentials with card added
	Then user taps on Login Icon in Login screen
	And user clicks on more icon
	Then user clicks on Account
	And user verifies for the payment method
	Then user clicks on Add card link after adding card number

@P11270-12819 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon for the post code
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the postcode field as input field
	And user enters the five number in post code
	Then user verifies the search icon enables next to post code
	And user clicks on search icon
	Then user verifies the search post code look up screen

@P11270-12820 @AndroidRegression @IosRegression
	Scenario: Check Whether system ables to clear the Pin input field by clicking clear in keypad
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot

@P11270-12821 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the post code screen for search icon
#	When user taps on register button from Login screen
#	Then user should be navigated to Manual Register screen
#	Then enter First Name
#	Then enter Last Name
#	Then enter Email address as "Shruthi.s1"
#	Then enter password
#	And confirm password
#	Then click the check box for accept
#	When click on continue button from register screen
#	When user tap on Skip button
#	Then the system should display Skip warning popup
#	When user tap on Skip anyway
##	Then app to dismiss the popup and navigate the user to LID after review
	When user clicks on Login Icon
	Then user enters the valid credentials with card added
	Then user taps on Login Icon in Login screen
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the five number in post code
	Then user verifies the search icon enables next to post code
	And user clicks on search icon
	Then user verifies the search post code look up screen

@P11270-12822 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the message for card add and delete
	When user clicks on Login Icon
	Then user enters the valid credentials with card added
	Then user taps on Login Icon in Login screen
	And user clicks on more icon
	Then user clicks on Account
	And user verifies for the payment method
	Then user verifies the last digits of card number and tick mark for the added card number
	And user taps on edit link in the added card
	Then user verifies the cancel and delete option in the screen
	When user taps on Delete Card button in Edit Payment Screen
	Then Verify system should display the prompt message

@P11270-12823 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Forgot your password in forgot your pin screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	And user taps on forgot password in PIN
	Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
	And user taps on forget password link
	Then user verifies the forgot password and back button and In order to reset your password, an email will be sent to your address and send button

@P11270-12824 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays user able to enter maximum of fifty characters
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on City field
	Then user enters maximum of fifty characters above fifty user will not be able to enter

	@P11270-12824 @iOSRegression
	Scenario: Check Whether System displays user able to enter maximum of fifty characters
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on City field
		Then user enters maximum of fifty characters above fifty user will not be able to enter

	@P11270-12825 @iOSRegression @Frick
	Scenario: Check Whether System to allow User to add maximum of 5 cards
		Then user is in login screen
		When I enter "MaxFiveCardAdd" in login details
		And user taps login button in login screen
		When user adds five cards from the add card link in the Account Screen
		And validates if the system disables the Add card link after adding a maximum of five cards

	@P11270-12826 @iOSRegression
	Scenario: Check Whether System displays the default input text for the City field under Billing Details section as'City'
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the City field under Billing Details Section

@P11270-12826 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Billing Section with i icon in Credit Debit card screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	Then user clicks on i icon and verifies the pop up message
	And user clicks on ok button

	@P11270-12827 @iOSRegression
	Scenario: Check Whether System to allow User to add maximum of 5 cards
		Then user is in login screen
		When I enter "MaxFiveCardAdd" in login details
		And user taps login button in login screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls to Add card link
		And validates if the system disables the Add card link after adding a maximum of five cards

	@P11270-12828 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Esso pin edit in Account screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	Then user verifies the edit esso pin link

	#Mail verification Done,PIN has been set and card has already been added
@P11270-12828 @IosRegression @Frick
Scenario: Check Whether System displays the Esso pin edit in Account screen
	Then user is in login screen
	When I enter "Challenge2" in login details
	And user taps login button in login screen
	When user taps on More button in tab bar
	When user navigates to Account screen
	And user verifies the Esso PIN under User Profile in Account Screen
	Then verify whether the system displays the edit link near Esso PIN

@P11270-12829 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the list of address in postcode lookup screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the search icon is enabled
	And user enters the postcode in the billing Details screen
	Then user clicks on enabled search icon
	Then user verifies the screen with screen title and back icon and search clear icons

@P11270-12830 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the tick mark for the selected address in postcode lookup screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the search icon is enabled
	And user enters the postcode in the billing Details screen
	Then user clicks on enabled search icon
	Then user verifies the screen with screen title and back icon and search clear icons
	And user clicks any one address in the below
	Then user verifies the tick mark in the selected Address

	@P11270-12829 @iOSRegresssion
	Scenario: Check whether the system displays ‘select’ button as ‘Disabled’ until, user has made any selection from the search results
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies if the select button as disabled until user has made any selection


	@P11270-12830 @iOSRegresssion
	Scenario: Check Whether System displays the tick mark for the selected address in postcode lookup screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address

	@P11270-12831 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Esso Pin added successfull message
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user clicks on more icon
	Then user clicks on Account
	And user clicks on esso pin in Account screen
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button

@P11270-12832 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the list of address in postcode lookup screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the search icon is enabled
	And user enters the postcode in the billing Details screen
	Then user clicks on enabled search icon
	Then user verifies the screen with screen title and back icon and search clear icons
	And user verifies the list of address in postcode lookup screen

@P11270-12833 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the entered text in postcode lookup screen is cleared by clicking clear icon
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the search icon is enabled
	And user enters the postcode in the billing Details screen
	Then user clicks on enabled search icon
	Then user verifies the screen with screen title and back icon and search clear icons
	And user clicks on clear icon in the postcode lookup screen

@P11270-12835 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline Error message for Name on the card field in Billing Details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user enters the details except card name
	Then user clicks on continue button in Card screen
	And user verifies the inline error message for name on the card field

@P11270-12837 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the post code Lookup Screen with details
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field

	@P11270-12837 @iOSRegresssion
	Scenario: Check whether the System performs displays the address when user has selected an option and tapped on ‘select’ button.
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address
		When user clicks on select option
		Then check if the address is auto filled in the address fields in billing section


	@P11270-12838 @iOSRegresssion
	Scenario: Check Whether System to disable ‘Search’ option if user has not entered any value in 'Postcode’ field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled

	@P11270-12838 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon for the post code is enabled
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the search icon is enabled
	And user enters the postcode in the billing Details screen
	Then user clicks on enabled search icon
	Then user verifies the screen with screen title and back icon and search clear icons
	And user clicks any one address in the below
	Then user verifies the selected icon is enabled

	@P11270-12839 @iOSRegression
	Scenario: Check Whether System displays the screen with screen title and back icon and search clear icons
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons

@P11270-12839 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the Post code lookup screen with address
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	And user enters the postcode in the billing Details screen
	Then user clicks on enabled search icon
	Then user verifies the screen with screen title and back icon and search clear icons

	#Mail verification Done,PIN has been set and card has already been added
	@P11270-12840 @iOSRegression @Frick @Frick_Android
	Scenario: Check Whether System System to display the Text Esso PIN on Accounts screen.
		Given user is in login screen
		When I enter "Challenge2" in login details
		And user taps login button in login screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user verifies the Esso PIN under User Profile in Account Screen

@P11270-12840 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Account screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user clicks on more icon
	Then user clicks on Account
	Then user verifies the Account screen


	@P11270-12841 @iOSRegression
	Scenario: Check Whether System displays the default input text for the Address Line 1 field under Billing Details section as'Address1'
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Address field Line one under Billing Details Section

@P11270-12841 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the first Address field in Billing Details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user taps on First Address field and verifies keypad
	Then user verifies the default text in the first Address Field

	@P11270-12842 @iOSRegression
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
		And verify whether the system navigates to Start fuelling now screen

	@P11270-12844 @iOSRegression
	Scenario: Check Whether System displays the display info icon
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
		Then user verifies the Billing address i icon in Card details screen

	@P11270-12846 @iOSRegression
	Scenario: Check Whether System displays the copy text next to the i info icon
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
		And tap on ok button and close location copy text
		And user verifies the Billing address i icon in Card details screen
		When user taps on the info icon
		And verify whether the system displays the copy text msg


@P11270-12844 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the checkbox for consent to use the card in Billing Details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details in the Billing details screen
	Then user verifies and clicks the i icon next to consent checkbox
	Then verifies the popup message and clicks ok button


@P11270-12846 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the popup text for Billing details i icon
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	Then user clicks on i icon and verifies the pop up message
	And user clicks on ok button

	@P11270-12847 @AndroidRegression @IosRegression @Frick
	Scenario: Check whether system  performs 3DS verification for COF and wait for the response from 3DS SDK
		When user is in login screen
		And I enter "Regrcredentials3" in login details
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
		When user lands on card verification screen
		And enter valid password and click on submit button


@P11270-12848 @AndroidRegression @IosRegression
	Scenario: Check whether the system displays the Checkbox and the Copy text
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details in the Billing details screen
	Then user verifies the Checkbox for consent

	@P11270-12848 @iOSRegression
	Scenario: Check whether the system displays the Checkbox and the Copy text
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		When user enters the card details in Add card screen
		Then check consent checkbox and verifies the copy text displayed

	@P11270-12849 @iOSRegression @Frick
	Scenario: Check whether system navigates user to next logical screen if authentication is successful
		When user is in login screen
		And I enter "Regrcredentials3" in login details
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
		When user lands on card verification screen
		And enter valid password and click on submit button
		Then user is navigated to start fueling now screen

	@P11270-16259 @iOSRegression @Frick
	Scenario: Check whether System should allow the user to edit the card on file details
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And check whether Edit link is available near the Added card and tap on it
		Then verify whether the card details are prepopulated in the Edit payment screen
		And edit any of the fields under Edit Payment screen
		And user scrolls down to Consent checkbox section
		When tap on continue button in add payment screen
		Then user verifies the updated pop up and clicks on ok buttton


	@P11270-16260 @iOSRegression @Frick
	Scenario: Check Whether the system should display a biometric (Face ID/Touch ID/Fingerprint) checkbox in the 'Edit Payment Method' screen
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And check whether Edit link is available near the Added card and tap on it
		Then verify whether the card details are prepopulated in the Edit payment screen
		And user scrolls down to Consent checkbox section
		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments

	@P11270-16264 @iOSRegression @Frick
	Scenario: Check whether the system should allow the user to select biometric (Face ID/Touch ID/Fingerprint) to authorise the card on file payment
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And Tap on Add Debit or Credit card details
		When user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then tap on ok button and close location copy text
		And user scrolls down to Consent checkbox section
		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
		When user taps on the checkbox to use Touch ID for authorizing payments
		Then verify if the system displays a tickmark on the checkbox and save it


	@P11270-16263 @iOSRegression @Frick
	Scenario: Check Whether the system should display a biometric (Face ID/Touch ID/Fingerprint) checkbox in the 'Add Debitt/Credit card' screen
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And Tap on Add Debit or Credit card details
		When user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then tap on ok button and close location copy text
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments


	@P11270-12851 @iOSRegression
	Scenario: Check Whether System enables the search icon for the postcode after entering the number in post code
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		And user enters the postcode in the billing Details screen
		Then user verifies the search icon is enabled

@P11270-12851 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon for the post code after entering the number in post code
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the postcode field as input field
	And user enters the five number in post code
	Then user verifies the search icon enables next to post code

	@P11270-12852 @iOSRegression
	Scenario:Verify whether the inline error message for postcode field
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
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details except postcode
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for postcode field

	@P11270-12852 @AndroidRegression
	Scenario: Check Whether System displays the inline error message for postcode in Billing details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details except postcode
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for postcode field

@P11270-12853 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the entered numbers in post code field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on postcode field
	Then user verifies the postcode field as input field
	And user enters eight digit number in the post code field
	Then user verifies the entered digits in post code field

	@P11270-12853 @iOSRegression
	Scenario: Check Whether System displays the entered numbers in post code field
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the postcode field as input field
		And user clicks on postcode field
		When user enters the postcode in the billing Details screen
		Then verify whether the entered postcode is alphanumeric and also the postcode length


@P11270-12857 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the date picker with current month and year in Billing Details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks on card number
	And user checks for the keypad
	Then user clicks on the expiry date and month
	And user verifies the expiry month and date screen
	Then user set the expiry month and Date in Billing Details Screen

@P11270-12858 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays i icon in card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user clicks on i icon in security code
	Then user clicks on Got it button in the popup

	@P11270-12859 @iOSRegression
	Scenario: Check Whether System displays the Checkbox for consent and Touch ID authorization in the Billing Details field
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
	And user enters the card details in Add card screen
	And user scrolls down to Consent checkbox section
	Then user verifies the Check box for consent and Authorization

@P11270-12859 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Checkbox for consent in the Billing Details field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details in the Billing details screen
	Then user verifies the Check box for consent and Authorization

@P11270-12861 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Billing address i icon in Card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen

	@P11270-12861 @iOSRegression
	Scenario: Check Whether System displays the Billing address i icon in Card details screen
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
		Then user verifies the Billing address i icon in Card details screen

@P11270-12865 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Billing address in Card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address in the screen

@P11270-12866 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the logo of the card in the Account Screen
	When user clicks on Login Icon
	Then user enters the valid credentials with card added
	And user clicks on Login icon in the Login page
	And user clicks on more icon
	Then user clicks on Account
	And user verifies for the payment method
	Then user verifies the last digits of card number and tick mark for the added card number
	Then user verifies the logo of the added card

@P11270-12867 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the ok button to relogin the Application after entering the wrong password
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	And user taps on forgot password in PIN
	Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
	And user enters the wrong password in enter password field
	Then user clicks on continue icon in Forget password Screen
	And user clicks ok icon in the pop up
	Then user verifies the system navigated to NLID screen

@P11270-12868 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the pop up message of login again while entering password for three times
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	And user taps on forgot password in PIN
	Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
	And user taps on forget password link
	Then user clicks on send button to re login

@P11270-12869 @AndroidRegression @IosRegression
	Scenario: Check Whether System able to enter fifty characters in second Address field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user taps on second Address Field
	Then user enters the fifty characters in second Address Field

@P11270-12871 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error message for Address Field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters card details except address field
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for Address Field

	@P11270-12871 @iOSRegression
	Scenario: Check Whether System displays an inline error message if the Address is not entered and submitted
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
		And user enters card details except address field
		And user clicks on continue button in Card screen
		And user verifies the inline error message for Address Field

@P11270-12872 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the entered text in first Address line Billing details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user taps on First Address field and verifies keypad
	Then user enters the fifty characters in Address field

@P11270-12873 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error messsage for entering wrong pin
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	And user enters wrong pin
	Then user clicks on continue
	Then user verifies the inline error message for entering wrong pin

@P11270-12874 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the keypad for set pin screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin for first
	Then user verifies the first pin displayed as dot

	@P11270-12875 @iOSRegression @Mar18
	Scenario: Check whether System to display ‘Edit’ button if card is added
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
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And verify whether the Edit link is available near the added card

	@P11270-12876 @iOSRegression @Mar18
	Scenario: Check Whether System displays the Address 2 input fields in Card details screen under Billing Details section as'Address2'
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Address field Line two under Billing Details Section


	@P11270-12876 @AndroidRegression
	Scenario: Check Whether System displays the Address 2 input fields in Card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s3"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user taps on the Address field
	Then user verifies the keypad for second address field

@P11270-12877 @AndroidRegression @IosRegression
	Scenario: Check Whether System navigates to Forgot password screen from forgot your password link
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	And user taps on forgot password in PIN
	Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
	And user taps on forget password link
	Then user verifies the forgot password screen

@P11270-12878 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the name on card field text or input field in Credit debit card screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user clicks on Name on card field and enters a name

	@P11270-12878 @iOSRegression @Mar18
	Scenario: Check Whether System displays the name on card field text or input field in Add Debit/Credit card screen
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Card Name under Billing Details Section


	@P11270-12879 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays Enter password screen while clicking Forgot your pin
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks back to the NLID screen
	And user clicks on more icon
	Then user clicks on Account
	Then user click on the edit esso link
	And user taps on forgot password in PIN
	Then user verifies the forgot password screen with enter password btn cancel btn and continue btn

@P11270-12880 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the input field for postcode and i icon in card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user clicks on postcode field
	Then user verifies the postcode field as input field

	@P11270-12881 @iOSRegression
	Scenario: Check Whether System displays a popup when the consent checkbox is not clicked in the Add Debit/Credit Card Screen
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
	And user enters the card details in Add card screen
	And user scrolls down to Consent checkbox section
	Then user clicks on continue button in Card screen
	And user verifies the popup message for checkbox
	And user clicks on ok in the popup message

	@P11270-12881 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the message without clicking checkbox in the Billing Details Screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details in the Billing details screen
	Then user clicks on continue button in Card screen
	Then user verifies the popup message for checkbox
	And user clicks on ok in the popup message

	@P11270-12882 @iOSRegression
	Scenario: Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
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
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		Then user verifies and clicks the i icon next to consent checkbox

@P11270-12882 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user verifies the entered pin as dot
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user verifies the Billing address i icon in Card details screen
	And user enters the card details in the Billing details screen
	Then user verifies and clicks the i icon next to consent checkbox
	Then verifies the Consent icon popup message and clicks ok button

@P11270-12883 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon in card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user taps on search icon
	Then user verifies the search icon and click ok button

@P11270-12886 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the Credit/Debit card Screen while clicking the Add card in Account screen
	When user clicks on Login Icon
	Then user enters the valid credentials
	Then user taps on Login Icon in Login screen
	And user closes the pop up of nectar card
	And user clicks on more icon
	Then user clicks on Account
	And user clicks on Add card link
	Then user verifies the card details screen

@P11270-12904 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the password screen while entering wrong pin
	When user clicks on Login Icon
	Then user enters the valid credentials
	Then user taps on Login Icon in Login screen
	And user clicks on start fueling icon
	Then user clicks on continue button in pump screen
	And user clicks on pay with paypal in payment screen
	Then user clicks on continue Button in fueling screen
	And  user enter the confirms the payment button
	And  user should enter wrong PIN three times
	And  user should verify navigate to Enter password Screen


@P11270-12906 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays Visa and MasterCard while clicking i icon
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user clicks on i icon in security code
	Then user verifies the Visa and MasterCard in pop up


@P11270-12907 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error messgae for Security code in card details screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user enters the card details except security code
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for security code

@P11270-12909 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the confirmation for the transaction
	When user clicks on Login Icon
	Then user enters the valid credentials
	Then user taps on Login Icon in Login screen
	And user clicks on start fueling icon
	Then user clicks on continue button in pump screen
	And user clicks on pay with paypal in payment screen
	Then user clicks on continue Button in fueling screen

@P11270-12911 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error message for expiry date in Credit Debit card screen
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	And user enters the card details except security code
#	Then user enters the card details except expiry date
	Then user clicks on continue button in Card screen
	Then user verifies the inline error message for expiry date

@P11270-12919 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the native picker while clicking the Expiry month and date
	When user taps on register button from Login screen
	Then user should be navigated to Manual Register screen
	Then enter First Name
	Then enter Last Name
	Then enter Email address as "Shruthi.s1"
	Then enter password
	And confirm password
	Then click the check box for accept
	When click on continue button from register screen
	When user tap on Skip button
	Then the system should display Skip warning popup
	When user tap on Skip anyway
	Then app to dismiss the popup and navigate the user to LID after review
	And user taps on the complete profile
	Then user taps on add payment method
	And user clicks on Add credit or debit card
	Then user verifies the Set Up pin screen with numeric keypad
	And user sets the pin number
	Then user clicks on continue
	Then user verifies the popup and clicks on ok button
	Then user clicks on card number
	And user checks for the keypad
	Then user clicks on the expiry date and month
	And user verifies the expiry month and date screen


@P11270-12857-iOS @IosRegression
	Scenario: Inability of the system to display past month and year as expiry date in the picker
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		And Verify Success message and close the popup clicking on Ok button
#		Then user verifies the popup and clicks on ok button
		And click on Card Exp Date field in Add Card screen
		Then Verify tha Current Data and Current months are displayed

	@P11270-12789 @AndroidRegression @IosRegression @one
	Scenario: Check Whether System displays the details of icons greyed out after entering the card number
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
#		Then Click on Add Card
		And user clicks a Add card in Account screen
		And Enter pin
    	Then user verifies the popup and clicks on ok button
		And user enters the card number
		And user checks for verifies the logo color

	@P11270-12812 @IosRegression @m1 @chan @chan51mar18
	Scenario: Check weather System to validate the PIN
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		When user able to see the text of set up Esso PIN
		Then user tap on Setup Esso PIN link
		Then user able to see the title Set up PIN
		Then user verify the back button
		Then user should verify the text set the Esso PIN to unlock the app for fuelling
		Then user tap on continue button
		Then user verify the inline error message

	@P11270-12823 @AndroidRegression @IosRegression @M2
	Scenario: Check whether the icons of all app supported credit cards are displayed on Add Payment Method screen. Current supported cards are Visa, Mastercard
		Given click on the login link in present in dashboard
#		When User Should Enter the Username
#		And User Should Enter the password
#		Then User Click on login button
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
#		And User Tap Edit button
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
		Then user should verify the CT label and clicks on send button

	@P11270-12822 @AndroidRegression @IosRegression @M3 @chan @chan51mar18 @Frick
	Scenario: Check weather System to display CT as prompt when user tap on the ‘Edit’ Message: Are you sure you want to delete this card?, Button: CANCEL, DELETE
		Given click on the login link in present in dashboard
#		When User Should Enter the Username
#		And User Should Enter the password
#		Then User Click on login button
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And user click the payment edit button
    	And user should verify the last four digit of card number
		And  user tap on Delete Card button
		And user should verify the CT "Are you sure you want to delete this card?"
    	And user should verify cancel and delete button

	@P11270-12796 @AndroidRegression @IosRegression  @chan @chan51mar18 @Frick
	Scenario: Check weather User should be able to Set the PIN
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
		Then user should verify the CT label and clicks on send button

	@P11270-12840 @AndroidRegression @IosRegression @M5 @chan @chan51mar18
	Scenario: Check weather System to display the Text Esso PIN on Accounts screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		When user able to see the text of set up Esso PIN

	@P11270-12818 @AndroidRegression @IosRegression @M6 @chan @chan51mar18 @Frictionlessfeatureregression
	Scenario: Check weather System to allow user to add card on file link active.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user should verify the Add Card link
		And user clicks a Add card in Account screen
#		Then Click on Add Card


	@P11270-12816  @IosRegression @CRiOS1pending @city @chan51mar18
	Scenario: System to show inline error message when user does not enter ‘City’ and taps on Done : ”Please enter city”
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
#		Then Click on Add Card
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
#		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on done Button
		Then Tap on Add Payment Done button
		Then Click on the Done button
		And tap on done Button
		Then user should verify the inliner error "Please enter city"


#Prerequisite:user should already visited 5 times the modal pop up
	@P11270-12316 @iOSRegression @Frick
	Scenario: Verify Logged in user should able to see a modal pop up when loyalty is on-boarded
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		Then verify if a modal pop with the Nectar logo and Static firework image is displayed
		When user tap on View Details Button in the Modal popup in LID
		Then verify whether the user is navigated to the modal expands to give offer details

#Prerequisite:user should already visited 5 times the modal pop up
	@P11270-12436 @iOSRegression @Frick
	Scenario: Verify Logged in user every visit counted after 5 time visiting the modal pop up
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		Then verify if a modal pop with the Nectar logo and Static firework image is displayed

	@P11270-12792  @IosRegression @CRiOS1 @M9 @Frictionlessfeatureregression
	Scenario: Check weather System navigates user to ‘Set Up PIN’ screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
#		Then Click on Add Card
		And user clicks a Add card in Account screen
		Then user should verify the system navigate to setup PIN screen


#NEW ONE

	@P11270-12831  @IosRegression
	Scenario: Check weather System to display CT as a prompt Message: Esso PIN added successfully., Button: OK
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
#		Then Click on Add Card
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button

	@P11270-12821  @IosRegression @Frictionlessfeatureregression
	Scenario: System to navigate user to Postcode Lookup screen, when clicked on search icon.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
#		Then Click on Add Card
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
#		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12819  @IosRegression
	Scenario: System to navigate the user to Postcode Lookup’ search screen, if the user has entered the search criteria.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen


	@P11270-12835  @P11270-12834  @IosRegression
	Scenario: System to show inline message when the user leaves the field blank and taps on Done Message: “Please enter name on card”, Type: In-line error message
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
#		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
#	   Then user selects a postcode from the list
		Then user select postcode in the list
		And tap on select
		And tap on done Button
#		And Tap on Done button with scroll
		Then Tap on Add Payment Done button
		Then user should verify the inline error message "Please enter Card Name"
#		Then Verify the inline error message for Card Number
		Then Click on the Done button


	@P11270-12786  @IosRegression
	Scenario: System to show inline message when user leaves the field blank and taps on Done Message:“Please enter card number”
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		And tap on done Button
#		And Tap on Done button with scroll
		Then Tap on Add Payment Done button
		Then Verify the inline error message for Card Number
		Then Click on the Done button

	@P11270-12787  @IosRegression @AndroidRegression @Frictionlessfeatureregression
	Scenario: System to display the entered card number in the format XXXX XXXX XXXX XXXX
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user skip the Fingerprint option
		Then user  navigate to payment screen and enter the card number
#		And Verify card number in valid format

	@P11270-12832  @IosRegression
	Scenario: System to make a service call and get the list address based on the data entered by the user for Postcode Lookup’ screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12791  @IosRegression
	Scenario: Check weather System allow user to enter PIN with possible values for each text/input field is numbers
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		Then user should verifies the Set Up pin screen with numeric keypad

#Tue onwards

	@P11270-12866 @AndroidRegression @IosRegression @M0203 @completed @chan51mar18 @tdyfail1 @Frick
	Scenario: Check weather System to display the logo of the card
		Given click on the login link in present in dashboard
#		When User Should Enter the Username
#		And User Should Enter the password
#		Then User Click on login button
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		When user should verify the four digit of the card number
		Then user should able to see the logo of the card

	@P11270-12865 @P11270-12863  @IosRegression
	Scenario: system to display ‘Billing Details’ as section header
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address in the screen

	@P11270-12861  @IosRegression
	Scenario: system to display ‘Billing Details’ as section header
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address in the screen
 		Then user verifies the Billing address i icon in Card details screen


#		3rd Monward

	@P11270-12886  @IosRegression
	Scenario: Check the weather System to allow the user to add cards as a payment method.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user should verify title text on the payment screen

	@P11270-12833  @IosRegression
	Scenario: System to allow user to edit the data entered in search field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		Then user verifies the Billing address in the screen
		Then user verifies the Billing address i icon in Card details screen
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user tap on that clear the text which is been entered

	@P11270-12883  @IosRegression
	Scenario: System to show inline error message when user does not enter ‘Postcode’ and taps on Done Message : Please enter postcode
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then user able to see and verify the search icon


	@P11270-12851  @IosRegression
	Scenario: System to enable search icon moment user enters the data for ‘Billing Details’
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		Then user verifies the Billing address in the screen
		Then user verifies the Billing address i icon in Card details screen
		And enter the postcode
		Then user should verify search icon should enable after enter the postcode

	@P11270-12852  @IosRegression
	Scenario: System to show inline error message when user does not enter ‘Postcode’ and taps on Done Message : Please enter postcode
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		Then Tap on Add Payment Done button
		Then user should verify the inline error message without enter postcode "Please enter postcode"
		Then Click on the Done button

		#4th monward


	@P11270-12858  @IosRegression
	Scenario: System to close the info overlay as user taps on ‘GOT IT’ button
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
#		Then Click on the Done button
		And Click on i icon in the security field
		Then Click on Got it button on popup screen

	@P11270-12885 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather User should see only the last 4 digits of the card
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		Then user should verify the card last four digit

	@P11270-12884 @AndroidRegression @IosRegression @Frick
	Scenario: Check whether User should see the highlighted card number with tick mark for the default payment card
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		Then user should verify the card last four digit
		Then user should see the highlighted card number with tick mark

	@P11270-12868 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather System to display CTXX as a prompt CTXX[Message: Due to security reason you need to log in again. Button: OK]
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user enters the wrong password in enter password field
		Then user tap on continue button
		Then user verify the security pop text
		Then user verify and click the ok button

	@P11270-12867 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather System to navigate user to NLID tapping on ‘OK’ button from the Prompt.
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user enters the wrong password in enter password field
		Then user tap on continue button
		Then user verify the security pop text
		Then user verify and click the ok button
		Then user verify after tap on ok button navigate to NLID screen

#5th monwa

	@P11270-12873 @AndroidRegression @IosRegression @M5 @chan5h
	Scenario: Check weather System to display CTXX as inline error message ●CTXX[Message: Wrong PIN. 2 Attempts left]
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		When user able to see the text of set up Esso PIN
		Then user tap on Setup Esso PIN link
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And User Tap Edit button
		Then user enter the wrong pin number and click on continue button
		Then user verifies the inline error message for entering wrong pin


	@P11270-12877 @P11270-12902 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
		Then user should verify the CT lable and send button

	@P11270-12901 @AndroidRegression   @androiud @Frick
	Scenario: Check weather system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Edit button
#		Then user enter the wrong pin number and click on continue button
		When user enter the 3rd time wrong pin number and click on continue button
#		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
#		Then user should verify the CT lable and send button
		When user should Tap on Send button
		Then user should able to see the prompt "We have sent you instructions to reset your password. Please check your inbox or spam folder."

	@P11270-12880  @IosRegression @M03213
	Scenario: system to display 'Postcode’ as text/input field i. Default text Postcode.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
#		And enter the postcode
		Then user verify the postcode text in the field


	@P11270-12900 @iOSRegression @Mar18

	@P11270-12901 @AndroidRegression @Frick
	Scenario: Check whether system to send reset password email and user should see a prompt
		Given user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		And user taps on fuel icon and start fuelling button
		And user select pumb and tap on continue button
		And user taps on confirm button in Confirm payment screen
		Then user is navigated to Enter pin screen
		When user taps on Forgot your pin link
		Then Verify user is navigated to Enter Password screen
		When user taps on forget password link
		Then verify user is navigated to Forgot Password screen
		When user taps on send button in Forgot Password Screen
		Then verify the prompt message and tap on Ok button


	@P11270-12849 @AndroidRegression @Frick
	Scenario: Check whether system to navigate user to next logical screen if Touch ID/Fingerprint authentication is successful

		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		And user able to see the cancel button
		And user enter the Enter PIN number
		Then Tap the continue button
		Then verify that user is navigated to next logical screen once authentication is successful


	@P11270-12834 @AndroidRegression @Frick @IosRegression @Frick_Android
	Scenario: System to show inline error messages if user has left the fields blank and taps on ‘Done’

		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user clicks a Add card in Account screen
		And user clicks on continue button in Card screen
		Then Verify the inline error message for Name On Card
		And Verify the inline error message for Card Number
		And Verify the inline error message for Expiry Date
		And Verify the inline error message for Security Code
		And Verify inline error message for post code
		And Verify inline error message for Address1
		And Verify the inline error message for city

	@P11270-12900 @AndroidRegression @Frick
	Scenario: Check whether the system to display Touch ID/Fingerprint prompt on-site check-in screen
		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		And user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		And user able to see the cancel button
		And user able to see the screen label for Enter your Esso PIN to Authorize Payment

	@Smoke @FrictionlessFlow
	Scenario: Check whether user able to complete the fuelling transaction with Frictionless flow card
		When user is in login screen
		And I enter "Challenge2" in login details
		And user taps login button in login screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		When user taps on the payment method link
		Then verify if the user lands on Payment Details Screen
		When user selects the frictionless flow card and tap on update button
		And user is navigated to Select your pump screen
		And user selects the pump from 'Select your Pump' page and taps on continue button
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user land on enter PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		When user lands on authorize payment screen
		Then user is navigated to start fueling now screen
		And then to now fueling
		Then verify if the user is in the Transaction Complete Screen
		When Tap on Transaction Details link in Transaction Complete Screen
		Then  Verify all the fields are present in Transaction Details screen
		When user taps on back button in the transaction Details screen
		Then verify if the user is in the Transaction Complete Screen
		When user taps on done button after finishing fuelling
		And Verify if the thank you screen is displayed

	@P11270-15960 @iOSRegression
	Scenario: Check Whether system marks "Maximum Fueling Amount" as completed
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
		Then user taps on maximum fueling amount
		Then user clicks on Set Maximum Amount button
		And user sets the fueling amount and clicks ok button
		And user clicks on continue button in maximum fueling screen
		Then user verifies "Maximum Fueling Amount" task is completed

	@P11270-15960 @iOSRegression
	Scenario: Check Whether system marks "Maximum Fueling Amount" as completed
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
#		And user taps on the complete profile
		When user taps on add payment method
		When user verify navigate to add payment screen
		And Tap on Add Debit or Credit card details
#		And Tap on Add Debit or Credit card details
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
#		And user enters the card number
		And user enter the valid card number
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		And tap on done Button
		Then user verifies and clicks the i icon next to consent checkbox
#		And Tap on Done button with scroll
		Then Tap on Add Payment Done button
		When user tap done button to navigate verify screen "Payment method added successfully"
		When user tap on payment method added successfully screen continue button
		Then user should verify the "payment method" task is completed
#		Then user should verify the inline error message without enter postcode "Please enter postcode"
#		Then Click on the Done button

	@P11270-12882 @iOSRegression
	Scenario: Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
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
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		Then user verifies and clicks the i icon next to consent checkbox


	@Frictionless
	Scenario: Check when a newly registered user adds a card and verifies the account screen and validate the forgot password screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
		When user taps on add payment method
		When user verify navigate to add payment screen
		And Tap on Add Debit or Credit card details
#		And Tap on Add Debit or Credit card details
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
#		And user enters the card number
		And user enter the valid card number
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		And tap on done Button
		Then user verifies and clicks the i icon next to consent checkbox
#		And Tap on Done button with scroll
		Then Tap on Add Payment Done button
		When user tap done button to navigate verify screen "Payment method added successfully"
		When user tap on payment method added successfully screen continue button
		Then user should verify the "payment method" task is completed

     @Frictionless
    Scenario: Check when a newly registered user adds a card and verifies the account screen and validate the forgot password screen
	    When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
		When user taps on add payment method
		When user verify navigate to add payment screen
		And Tap on Add Debit or Credit card details
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And user enter the valid card number
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		Then user verifies and clicks the i icon next to consent checkbox
		When Tap on Add Payment Done button
     	When user tap done button to navigate verify screen "Payment method added successfully"
    	When user tap on payment method added successfully screen continue button
    	Then user should verify the "payment method" task is completed
		And user lands on LID after tapping back button in Complete profile Screen
	    And user taps on More button in tab bar
     	When user navigates to Account screen
		 And User Tap Edit button
		 And User click the Forgot your PIN link
		 And User able to verify the CT label
		 Then user should verify the cancel button
		 Then user click the Forgot your pwd link
		 Then user should verify the title Forgot pwd
		 Then user verify the back button
		 Then user should verify the CT label and clicks on send button
		 And validate the CT 'Reset your password' and tap on OK button
		 Then user should be navigated to NLID






	@Frictionless
	Scenario: Check whether the System displays the CT msg  when user taps on the Edit Link in the Payment method section and also Validate the Forgot password Link when user enters a wrong password

		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
	@P11270-12822 @Smoke_iOS @Smokenar3  @naresh
	Scenario: Check weather System to display CT as prompt when user tap on the ‘Edit’ Message: Are you sure you want to delete this card?, Button: CANCEL, DELETE
		When user is in login screen
		And I enter "Challenge2" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And user click the payment edit button
		And user should verify the last four digit of card number
		And  user tap on Delete Card button
		And user should verify the CT "Are you sure you want to delete this card?"
		And user should verify cancel and delete button
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT label
#		Then user should verify the cancel button
		Then user enters the wrong password in enter password field
		Then user tap on continue button
		Then user verify the security pop text
		Then user verify and click the ok button
		Then user verify after tap on ok button navigate to NLID screen

	@11270-12883 @AndroidRegression @Frick
	Scenario: system to display search as an icon
		Then user is in login screen
		When I enter "Challenge2" in login details
		And user taps login button in login screen
		And user on More button in tab bar
		And user navigate to account screen
		And enter the Add card button
		And user enter card Name
		And user enter card number
		And user enter card exp date
		And enter security code
		And  user enter postcode
		And user able to see the search icon

	@11270-12866 @AndroidRegression @Frick
	Scenario: Check weather system to display the logo of the card
		Then user is in login screen
		When I enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		And user on More button in tab bar
		And user navigate to account screen
		And verify the card number
		And verify tick mark in payment method
		Then verify card logo

	@11270-12875 @AndroidRegression @Frick
	Scenario: Check weather System to display ‘Edit’ button if card is added
		Then user is in login screen
		When I enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		And user on More button in tab bar
		And user navigate to account screen
		And verify the card number
		And verify tick mark in payment method
		And user enter the edit button
		And user able to see the edit payment method

	@11270-12905 @AndroidRegression @Frick
	Scenario: Check whether the system to navigate the user to Enter PIN and user should see following details for Enter PIN screen
		Then user is in login screen
		When enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And user enter the confirms the payment button
		And user able to see the cancel button
		And user enter the Enter PIN number
		Then user able to see the screen label for Enter your Esso PIN to Authorize Payment
		Then user enter PIN for unlock the app for fueling
		Then Tap the continue button
		Then user able to see the Forgot password Screen

	@11270-12912 @AndroidRegression @Frick @IosRegression
	Scenario: Validate invalid password popup error message "Due to security reasons you need to login again.Button: OK"
		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		And  user should enter wrong PIN three times
		And  user should verify navigate to Enter password Screen
		When user enter invalid password in enter password screen
		Then user able to see invalid password popup message

	@11270-12913 @AndroidRegression @Frick @IosRegression
	Scenario: Check whether system to navigate user back to Account screen tapping on ‘Cancel’ button
		Then     user is in login screen
		When     I enter "FrictEssoPswordchk" in login details
		And      user taps login button in login screen
		When     user taps on fuel icon and start fuelling button
		Then     user select pumb and tap on continue button
		And      user enter the confirms the payment button
#	And      user able to see the cancel button
		And      user should enter wrong PIN three times
		And      user should verify navigate to Enter password Screen
		And      user tap the cancel button
	@11270-12913 @AndroidRegression @Frick
	Scenario: Check whether system to navigate user back to Account screen tapping on ‘Cancel’ button
		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And user enter the confirms the payment button
		And user able to see the cancel button
		And user should enter wrong PIN three times
		And user should verify navigate to Enter password Screen
		And user tap the cancel button

	@11270-12840 @AndroidRegression
	Scenario: Check weather system to display the Text Esso PIN on Accounts screen
		When      user taps on register button from Login screen
		Then      user should be navigated to Manual Register screen
		Then      enter the firstName
		Then      enter the secondName
		Then      enter the emailAddress
		Then      enter the password
		Then      enter the confirm password
		Then      click the Accept checkBox
		Then      click the check box for accept
		When      click on continue button from register screen
		When      user tap on Skip button
		Then      the system should display Skip warning popup
		When      user tap on Skip anyway
		Then      app to dismiss the popup and navigate the user to LID after review
		And      user on More button in tab bar
		And      user navigate to account screen
		Then      user able to see the Esso PIN on Account Screen
	@11270-12840 @AndroidRegression
	Scenario: Check weather system to display the Text Esso PIN on Accounts screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter the firstName
		Then enter the secondName
		Then enter the emailAddress
		Then enter the password
		Then enter the confirm password
		Then click the Accept checkBox
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user on More button in tab bar
		And user navigate to account screen
		Then user able to see the Esso PIN on Account Screen

	@11270-12823 @AndroidRegression
	Scenario: Check whether the User should see the following details for the‘Forgot Password’ Screen title: ‘Forgot Password’ ii. ‘Back’ buttoniii. CT
	screen label: In order to reset your password, an email will be sent to your address: (User email address) ‘SEND’ button
		When user tab on register button from login screen
		Then user should be navigated to Manual Register screen
		Then enter the firstName
		Then enter the secondName
		Then enter the emailAddress
		Then enter the password
		Then enter the confirm password
		Then click the Accept checkBox
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user on More button in tab bar
		And user navigate to account screen
		Then user able to see the Esso PIN on Account Screen
		Then enter the edit button
		Then click the Forgot your password link
		Then user able to see the back button
		Then user able to verify the forgot text and email address
		Then user able to see the send button

	@11270-12915 @AndroidRegression @Frick
	Scenario: whether the system to navigate the user to Enter Password screen and
	the user should see the following details for the Enter password screen
		Then user is in login screen
		When I enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And user enter the confirms the payment button
		Then user click forgot button
		And user able to see the cancel button
		And user able see the Enter password text
		And user able to see esso app password text
		And user able to view the password
	@Smoke_iOS @FrictionlessFlow @Smoke_Android @Smoke_Android1 @naresh1
	Scenario: Check whether user able to complete the fuelling transaction with Frictionless flow card
#		When user is in login screen
#		And I enter "smokecredentials2" in login details
#		And user taps login button in login screen
		When I enter SSO login details for "LinkedInOffer1"
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		When user taps on the payment method link
		Then verify if the user lands on Payment Details Screen
		When user selects the frictionless flow card and tap on update button
		And user is navigated to Select your pump screen
		And user selects the pump from 'Select your Pump' page and taps on continue button
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		When user lands on authorize payment screen
		Then user is navigated to start fueling now screen
		And then to now fueling
		Then verify if the user is in the Transaction Complete Screen
		When Tap on Transaction Details link in Transaction Complete Screen
		Then  Verify all the fields are present in Transaction Details screen
		When user tap on back button in the transaction Details screen
		Then verify if the user is in the Transaction Complete Screen
		When user taps on done button after finishing fuelling
		And Verify if the thank you screen is displayed

	@11270-12914 @AndroidRegression @Frick @IosRegression @Smoke_iOS @naresh
	Scenario: Check whether system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Then user is in login screen
		When I enter "FrictEssoPsword" in login details
		And  user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		Then user click forgot button
		And user able to see the Forgot password Screen

	@P11270-12789 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the details of icons greyed out after entering the card number
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user enters the card number
		And user checks for verifies the logo color

	@P11270-12786 @AndroidRegression @IosRegression
	Scenario: Check Whether System to show inline error message when user leaves the field blank and clicks on continue
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user click card details in Credit debit screen
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for card number field

	@P11270-12789 @iOSRegression
	Scenario:Check whether the system displays icons for cards of all app supported credit cards will be displayed here.
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
		When user enters the unsupported card number in the Card number field
		Then verify whether the logo of the cards are greyed out
		When user enters the first four digits of a valid card number in the Add number field
		Then verify whether the logo of the entered card is active


	@P11270-12791 @AndroidRegression @IosRegression
	Scenario: Check Whether system allows the user to enter set the pin in numeric field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad

	@P11270-12792 @AndroidRegression @IosRegression
	Scenario: Check Whether the system displays the Set up pin screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad

	@P11270-12793 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the dot for completed pin in Payment Method
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin for first
		Then user verifies the first pin displayed as dot

	@P11270-12793  @iOSRegression
	Scenario: Check Whether System displays the dot for completed pin in Payment Method
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
		Then user verifies the entered pin as dot

	@P11270-12795 @iOSRegression
	Scenario: Check System to display the following prompt when the card is successfully added a. Title: Message,Copy Text Message Card added successfully. Buttons:OK b. System to navigate user back to the account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "praveenkumar.balasubramani+" Email address
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
		Then enter "5544 3300 0000 0011" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then validate success screen for added card
		And verify if the user is navigated to Add nectar screen

	@P11270-12795 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the card added success message
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
#	Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
#	Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details in Billing Screen except fingerprint checkbox
		Then user clicks on continue button in Card screen
		Then user verifies the completed popup message for card added
		And user clicks on ok button in card added message

	@P11270-12796 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the set pin screen through Account
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user clicks on esso pin edit
		And user sets the pin number
		Then user clicks on continue
#	Then user enters the esso password
#	And user clicks on continue button in password screen
		Then user verifies the set new pin screen

	@P11270-12797 @iOSRegression
	Scenario: Check Whether System displays the unsupported card message in Billing details screen while entering wrong card number
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		Then Verify user is navigated to Add Payment Method screen
		And Tap on Add Debit or Credit card details
		When user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then tap on ok button and close location copy text
		When user enters invalid card number and other valid card details
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then user verifies the inline error msg for the invalid card


	@P11270-12797 @AndroidRegression
	Scenario: Check Whether System displays the unsupported card message in Billing details screen while entering wrong card number
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters wrong card number in Billing Details screen
		Then user clicks on continue button in Card screen
		Then user verifies the popup message for entering wrong card number and clicks ok button

	@P11270-12798 @iOSRegression
	Scenario: Check Whether System displays the entered card number in the Card number field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		And user enters the maximum digit card number in the Card Number field
		Then verify whether the entered card number is displayed

	@P11270-12798 @AndroidRegression
	Scenario: Check Whether System displays the entered card number in the Card number field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card number
		Then user verifies the entered card number

	@P11270-12811 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Add payment in profile completion screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user verifies the Add Payment Method in Complete Profile screen

	@P11270-12812 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays set up pin through Account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user clicks on more icon
		Then user clicks on Account
		And user clicks on esso link in Account
		Then user verifies the Set Esso link screen
		And user clicks on Continue without entering PIN
		Then user verifies the inline error message

	@P11270-12813 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the set up pin through Account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user clicks on more icon
		Then user clicks on Account
		And user clicks on esso link in Account
		Then user verifies the set up pin back link and screen title

	@P11270-12813  @IosRegression @Frick
	Scenario: Check whether User to see the following details for Set Up PIN screen a. Screen Title: Set up PIN b. Cancel button c. CT: Set the Esso PIN to unlock the app for fuelling
		Then user is in login screen
		When I enter "Challenge2" in login details
		And user taps login button in login screen
		Then verify whether the system displays 'Add a payment method to pay at the pump'link in LID
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user verifies the Esso PIN under User Profile in Account Screen
		And user clicks the link to set up Esso Pin under User Profile section
		When user is on setup PIN screen
		Then user verifies the set up pin back link and screen title

	@P11270-12814 @iOSRegression
	Scenario: Check Whether System displays the Name on Card in Billing Details Screen
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
		And user enters the maximum characters in Card Name field
		Then verify whether the entered card name is displayed

	@P11270-12814 @AndroidRegression
	Scenario: Check Whether System displays the Name on Card in Billing Details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on Name on card in Billing Details Screen
		And user enters thirty characters in the Name on card field
		Then user verifies the entered characters in the field

	@P11270-12815 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the united kingdom in Billing details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details except city name
		Then user verifies the united kingdom text in Billing Details screen

	@P11270-12815 @iOSRegression
	Scenario: Check Whether System displays the united kingdom in Billing details screen
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
		And user scrolls to Country name under Billing Details Section
		Then user verifies the Country name as 'United Kingdom' by default


	@P11270-12816 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error message for city in Credit Debit Card Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user enters the card details except city name
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for city name

	@P11270-12817 @AndroidRegression @IosRegression
	Scenario: Check Whether System the email sent popup in forgot your password screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		Then user verifies the Set Up pin screen with numeric keypad
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
		And user taps on forget password link
		Then user clicks on send button to re login
		Then user verifies the popup message for relogin the Application

	@P11270-12818 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the Add card link in Account screen
		When user clicks on Login Icon
		Then user enters the valid credentials with card added
		Then user taps on Login Icon in Login screen
		And user clicks on more icon
		Then user clicks on Account
		And user verifies for the payment method
		Then user clicks on Add card link after adding card number

	@P11270-12819 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon for the post code
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the postcode field as input field
		And user enters the five number in post code
		Then user verifies the search icon enables next to post code
		And user clicks on search icon
		Then user verifies the search post code look up screen

	@P11270-12820 @AndroidRegression @IosRegression
	Scenario: Check Whether system ables to clear the Pin input field by clicking clear in keypad
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot

	@P11270-12821 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the post code screen for search icon
#	When user taps on register button from Login screen
#	Then user should be navigated to Manual Register screen
#	Then enter First Name
#	Then enter Last Name
#	Then enter Email address as "Shruthi.s1"
#	Then enter password
#	And confirm password
#	Then click the check box for accept
#	When click on continue button from register screen
#	When user tap on Skip button
#	Then the system should display Skip warning popup
#	When user tap on Skip anyway
##	Then app to dismiss the popup and navigate the user to LID after review
		When user clicks on Login Icon
		Then user enters the valid credentials with card added
		Then user taps on Login Icon in Login screen
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the five number in post code
		Then user verifies the search icon enables next to post code
		And user clicks on search icon
		Then user verifies the search post code look up screen

	@P11270-12822 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the message for card add and delete
		When user clicks on Login Icon
		Then user enters the valid credentials with card added
		Then user taps on Login Icon in Login screen
		And user clicks on more icon
		Then user clicks on Account
		And user verifies for the payment method
		Then user verifies the last digits of card number and tick mark for the added card number
		And user taps on edit link in the added card
		Then user verifies the cancel and delete option in the screen
		When user taps on Delete Card button in Edit Payment Screen
		Then Verify system should display the prompt message

	@P11270-12823 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Forgot your password in forgot your pin screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
		And user taps on forget password link
		Then user verifies the forgot password and back button and In order to reset your password, an email will be sent to your address and send button

	@P11270-12824 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays user able to enter maximum of fifty characters
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on City field
		Then user enters maximum of fifty characters above fifty user will not be able to enter

	@P11270-12824 @iOSRegression
	Scenario: Check Whether System displays user able to enter maximum of fifty characters
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on City field
		Then user enters maximum of fifty characters above fifty user will not be able to enter

	@P11270-12825 @iOSRegression @Frick
	Scenario: Check Whether System to allow User to add maximum of 5 cards
		Then user is in login screen
		When I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		When user adds five cards from the add card link in the Account Screen
		And validates if the system disables the Add card link after adding a maximum of five cards

	@P11270-12826 @iOSRegression
	Scenario: Check Whether System displays the default input text for the City field under Billing Details section as'City'
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the City field under Billing Details Section

	@P11270-12826 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Billing Section with i icon in Credit Debit card screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		Then user clicks on i icon and verifies the pop up message
		And user clicks on ok button

	@P11270-12827 @iOSRegression @Frick
	Scenario: Check Whether System to allow User to add maximum of 5 cards
		Then user is in login screen
		When I enter "MaxFiveCardAdd" in login details
		And user taps login button in login screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls to Add card link
		And validates if the system disables the Add card link after adding a maximum of five cards

	@P11270-12828 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Esso pin edit in Account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		Then user verifies the edit esso pin link

	#Mail verification Done,PIN has been set and card has already been added
	@P11270-12828 @IosRegression @Frick
	Scenario: Check Whether System displays the Esso pin edit in Account screen
		Then user is in login screen
		When I enter "Challenge2" in login details
		And user taps login button in login screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user verifies the Esso PIN under User Profile in Account Screen
		Then verify whether the system displays the edit link near Esso PIN

	@P11270-12829 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the list of address in postcode lookup screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons

	@P11270-12830 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the tick mark for the selected address in postcode lookup screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address

	@P11270-12829 @iOSRegresssion
	Scenario: Check whether the system displays ‘select’ button as ‘Disabled’ until, user has made any selection from the search results
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies if the select button as disabled until user has made any selection


	@P11270-12830 @iOSRegresssion
	Scenario: Check Whether System displays the tick mark for the selected address in postcode lookup screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address

	@P11270-12831 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Esso Pin added successfull message
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user clicks on more icon
		Then user clicks on Account
		And user clicks on esso pin in Account screen
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button

	@P11270-12832 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the list of address in postcode lookup screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12833 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the entered text in postcode lookup screen is cleared by clicking clear icon
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks on clear icon in the postcode lookup screen

	@P11270-12835 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline Error message for Name on the card field in Billing Details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user enters the details except card name
		Then user clicks on continue button in Card screen
		And user verifies the inline error message for name on the card field

	@P11270-12837 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the post code Lookup Screen with details
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field

	@P11270-12837 @iOSRegresssion
	Scenario: Check whether the System performs displays the address when user has selected an option and tapped on ‘select’ button.
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address
		When user clicks on select option
		Then check if the address is auto filled in the address fields in billing section


	@P11270-12838 @iOSRegresssion
	Scenario: Check Whether System to disable ‘Search’ option if user has not entered any value in 'Postcode’ field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled

	@P11270-12838 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon for the post code is enabled
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user clicks any one address in the below
		Then user verifies the selected icon is enabled

	@P11270-12839 @iOSRegression
	Scenario: Check Whether System displays the screen with screen title and back icon and search clear icons
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons

	@P11270-12839 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the Post code lookup screen with address
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons

	#Mail verification Done,PIN has been set and card has already been added
	@P11270-12840 @iOSRegression  @Frick
	Scenario: Check Whether System System to display the Text Esso PIN on Accounts screen.
		Given user is in login screen
		When I enter "Challenge2" in login details
		And user taps login button in login screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user verifies the Esso PIN under User Profile in Account Screen

	@P11270-12840 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user clicks on more icon
		Then user clicks on Account
		Then user verifies the Account screen


	@P11270-12841 @iOSRegression
	Scenario: Check Whether System displays the default input text for the Address Line 1 field under Billing Details section as'Address1'
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Address field Line one under Billing Details Section

	@P11270-12841 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the first Address field in Billing Details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user taps on First Address field and verifies keypad
		Then user verifies the default text in the first Address Field

	@P11270-12842 @iOSRegression @Frick_Android
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
		And verify whether the system navigates to Start fuelling now screen

	@P11270-12844 @iOSRegression
	Scenario: Check Whether System displays the display info icon
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
		Then user verifies the Billing address i icon in Card details screen

	@P11270-12846 @iOSRegression
	Scenario: Check Whether System displays the copy text next to the i info icon
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
		And tap on ok button and close location copy text
		And user verifies the Billing address i icon in Card details screen
		When user taps on the info icon
		And verify whether the system displays the copy text msg


	@P11270-12844 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the checkbox for consent to use the card in Billing Details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details in the Billing details screen
		Then user verifies and clicks the i icon next to consent checkbox
		Then verifies the popup message and clicks ok button


	@P11270-12846 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the popup text for Billing details i icon
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		Then user clicks on i icon and verifies the pop up message
		And user clicks on ok button

	@P11270-12847 @AndroidRegression @IosRegression @Frick_Android
	Scenario: Check whether system  performs 3DS verification for COF and wait for the response from 3DS SDK
		When user is in login screen
		And I enter "MaxFiveCardAdd" in login details
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
		When user lands on card verification screen
		And enter valid password and click on submit button


	@P11270-12848 @AndroidRegression @IosRegression
	Scenario: Check whether the system displays the Checkbox and the Copy text
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details in the Billing details screen
		Then user verifies the Checkbox for consent

	@P11270-12848 @iOSRegression
	Scenario: Check whether the system displays the Checkbox and the Copy text
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		When user enters the card details in Add card screen
		Then check consent checkbox and verifies the copy text displayed

	@P11270-12849 @iOSRegression @Frick
	Scenario: Check whether system navigates user to next logical screen if authentication is successful
		When user is in login screen
		And I enter "Regrcredentials3" in login details
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
		When user lands on card verification screen
		And enter valid password and click on submit button
		Then user is navigated to start fueling now screen

	@P11270-16259 @iOSRegression @Frick
	Scenario: Check whether System should allow the user to edit the card on file details
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And check whether Edit link is available near the Added card and tap on it
		Then verify whether the card details are prepopulated in the Edit payment screen
		And edit any of the fields under Edit Payment screen
		And user scrolls down to Consent checkbox section
		When tap on continue button in add payment screen
		Then user verifies the updated pop up and clicks on ok buttton


	@P11270-16260 @iOSRegression @Frick
	Scenario: Check Whether the system should display a biometric (Face ID/Touch ID/Fingerprint) checkbox in the 'Edit Payment Method' screen
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And check whether Edit link is available near the Added card and tap on it
		Then verify whether the card details are prepopulated in the Edit payment screen
		And user scrolls down to Consent checkbox section
		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments

	@P11270-16264 @iOSRegression @Frick
	Scenario: Check whether the system should allow the user to select biometric (Face ID/Touch ID/Fingerprint) to authorise the card on file payment
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And Tap on Add Debit or Credit card details
		When user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then tap on ok button and close location copy text
		And user scrolls down to Consent checkbox section
		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
		When user taps on the checkbox to use Touch ID for authorizing payments
		Then verify if the system displays a tickmark on the checkbox and save it


	@P11270-16263 @iOSRegression @Frick
	Scenario: Check Whether the system should display a biometric (Face ID/Touch ID/Fingerprint) checkbox in the 'Add Debitt/Credit card' screen
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And Tap on Add Debit or Credit card details
		When user is on setup PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then tap on ok button and close location copy text
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments


	@P11270-12851 @iOSRegression
	Scenario: Check Whether System enables the search icon for the postcode after entering the number in post code
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		And user enters the postcode in the billing Details screen
		Then user verifies the search icon is enabled

	@P11270-12851 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon for the post code after entering the number in post code
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the postcode field as input field
		And user enters the five number in post code
		Then user verifies the search icon enables next to post code

	@P11270-12852 @iOSRegression
	Scenario:Verify whether the inline error message for postcode field
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
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details except postcode
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for postcode field

	@P11270-12852 @AndroidRegression
	Scenario: Check Whether System displays the inline error message for postcode in Billing details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details except postcode
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for postcode field

	@P11270-12853 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the entered numbers in post code field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the postcode field as input field
		And user enters eight digit number in the post code field
		Then user verifies the entered digits in post code field

	@P11270-12853 @iOSRegression
	Scenario: Check Whether System displays the entered numbers in post code field
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
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the postcode field as input field
		And user clicks on postcode field
		When user enters the postcode in the billing Details screen
		Then verify whether the entered postcode is alphanumeric and also the postcode length


	@P11270-12857 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the date picker with current month and year in Billing Details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks on card number
		And user checks for the keypad
		Then user clicks on the expiry date and month
		And user verifies the expiry month and date screen
		Then user set the expiry month and Date in Billing Details Screen

	@P11270-12858 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays i icon in card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user clicks on i icon in security code
		Then user clicks on Got it button in the popup

	@P11270-12859 @iOSRegression
	Scenario: Check Whether System displays the Checkbox for consent and Touch ID authorization in the Billing Details field
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
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		Then user verifies the Check box for consent and Authorization

	@P11270-12859 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Checkbox for consent in the Billing Details field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details in the Billing details screen
		Then user verifies the Check box for consent and Authorization

	@P11270-12861 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Billing address i icon in Card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen

	@P11270-12861 @iOSRegression
	Scenario: Check Whether System displays the Billing address i icon in Card details screen
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
		Then user verifies the Billing address i icon in Card details screen

	@P11270-12865 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the Billing address in Card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address in the screen

	@P11270-12866 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the logo of the card in the Account Screen
		When user clicks on Login Icon
		Then user enters the valid credentials with card added
		And user clicks on Login icon in the Login page
		And user clicks on more icon
		Then user clicks on Account
		And user verifies for the payment method
		Then user verifies the last digits of card number and tick mark for the added card number
		Then user verifies the logo of the added card

	@P11270-12867 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the ok button to relogin the Application after entering the wrong password
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
		And user enters the wrong password in enter password field
		Then user clicks on continue icon in Forget password Screen
		And user clicks ok icon in the pop up
		Then user verifies the system navigated to NLID screen

	@P11270-12868 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the pop up message of login again while entering password for three times
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
		And user taps on forget password link
		Then user clicks on send button to re login

	@P11270-12869 @AndroidRegression @IosRegression
	Scenario: Check Whether System able to enter fifty characters in second Address field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user taps on second Address Field
		Then user enters the fifty characters in second Address Field

	@P11270-12871 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error message for Address Field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters card details except address field
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for Address Field

	@P11270-12871 @iOSRegression
	Scenario: Check Whether System displays an inline error message if the Address is not entered and submitted
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
		And user enters card details except address field
		And user clicks on continue button in Card screen
		And user verifies the inline error message for Address Field

	@P11270-12872 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the entered text in first Address line Billing details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user taps on First Address field and verifies keypad
		Then user enters the fifty characters in Address field

	@P11270-12873 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error messsage for entering wrong pin
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		And user enters wrong pin
		Then user clicks on continue
		Then user verifies the inline error message for entering wrong pin

	@P11270-12874 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the keypad for set pin screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin for first
		Then user verifies the first pin displayed as dot

	@P11270-12875 @iOSRegression
	Scenario: Check whether System to display ‘Edit’ button if card is added
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
		And user taps on More button in tab bar
		When user navigates to Account screen
		And user scrolls down to Payment Method section in the Account screen
		And verify whether the Edit link is available near the added card

	@P11270-12876 @iOSRegression
	Scenario: Check Whether System displays the Address 2 input fields in Card details screen under Billing Details section as'Address2'
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Address field Line two under Billing Details Section


	@P11270-12876 @AndroidRegression
	Scenario: Check Whether System displays the Address 2 input fields in Card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s3"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user taps on the Address field
		Then user verifies the keypad for second address field

	@P11270-12877 @AndroidRegression @IosRegression
	Scenario: Check Whether System navigates to Forgot password screen from forgot your password link
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
		And user taps on forget password link
		Then user verifies the forgot password screen

	@P11270-12878 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the name on card field text or input field in Credit debit card screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on Name on card field and enters a name

	@P11270-12878 @iOSRegression
	Scenario: Check Whether System displays the name on card field text or input field in Add Debit/Credit card screen
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
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Card Name under Billing Details Section


	@P11270-12879 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays Enter password screen while clicking Forgot your pin
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks back to the NLID screen
		And user clicks on more icon
		Then user clicks on Account
		Then user click on the edit esso link
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn

	@P11270-12880 @AndroidRegression @IosRegression
	Scenario: Check Whether system displays the input field for postcode and i icon in card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user clicks on postcode field
		Then user verifies the postcode field as input field

	@P11270-12881 @iOSRegression
	Scenario: Check Whether System displays a popup when the consent checkbox is not clicked in the Add Debit/Credit Card Screen
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
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		Then user clicks on continue button in Card screen
		And user verifies the popup message for checkbox
		And user clicks on ok in the popup message

	@P11270-12881 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the message without clicking checkbox in the Billing Details Screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details in the Billing details screen
		Then user clicks on continue button in Card screen
		Then user verifies the popup message for checkbox
		And user clicks on ok in the popup message

	@P11270-12882 @iOSRegression
	Scenario: Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
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
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		Then user verifies and clicks the i icon next to consent checkbox

	@P11270-12882 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address i icon in Card details screen
		And user enters the card details in the Billing details screen
		Then user verifies and clicks the i icon next to consent checkbox
		Then verifies the Consent icon popup message and clicks ok button

	@P11270-12883 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the search icon in card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user taps on search icon
		Then user verifies the search icon and click ok button

	@P11270-12886 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the Credit/Debit card Screen while clicking the Add card in Account screen
		When user clicks on Login Icon
		Then user enters the valid credentials
		Then user taps on Login Icon in Login screen
		And user closes the pop up of nectar card
		And user clicks on more icon
		Then user clicks on Account
		And user clicks on Add card link
		Then user verifies the card details screen

	@P11270-12904 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the password screen while entering wrong pin
		When user clicks on Login Icon
		Then user enters the valid credentials
		Then user taps on Login Icon in Login screen
		And user clicks on start fueling icon
		Then user clicks on continue button in pump screen
		And user clicks on pay with paypal in payment screen
		Then user clicks on continue Button in fueling screen
		And  user enter the confirms the payment button
		And  user should enter wrong PIN three times
		And  user should verify navigate to Enter password Screen


	@P11270-12906 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays Visa and MasterCard while clicking i icon
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user clicks on i icon in security code
		Then user verifies the Visa and MasterCard in pop up


	@P11270-12907 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error messgae for Security code in card details screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user enters the card details except security code
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for security code

	@P11270-12909 @AndroidRegression @IosRegression @Frick
	Scenario: Check Whether System displays the confirmation for the transaction
		When user clicks on Login Icon
		Then user enters the valid credentials
		Then user taps on Login Icon in Login screen
		And user clicks on start fueling icon
		Then user clicks on continue button in pump screen
		And user clicks on pay with paypal in payment screen
		Then user clicks on continue Button in fueling screen

	@P11270-12911 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the inline error message for expiry date in Credit Debit card screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		And user enters the card details except security code
#	Then user enters the card details except expiry date
		Then user clicks on continue button in Card screen
		Then user verifies the inline error message for expiry date

	@P11270-12919 @AndroidRegression @IosRegression
	Scenario: Check Whether System displays the native picker while clicking the Expiry month and date
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the popup and clicks on ok button
		Then user clicks on card number
		And user checks for the keypad
		Then user clicks on the expiry date and month
		And user verifies the expiry month and date screen


	@P11270-12857-iOS @IosRegression
	Scenario: Inability of the system to display past month and year as expiry date in the picker
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		Then user taps on add payment method
		And user clicks on Add credit or debit card
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user clicks on continue
		And Verify Success message and close the popup clicking on Ok button
#		Then user verifies the popup and clicks on ok button
		And click on Card Exp Date field in Add Card screen
		Then Verify tha Current Data and Current months are displayed

	@P11270-12789 @AndroidRegression
	Scenario: Check Whether System displays the details of icons greyed out after entering the card number
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And user enters the card number
		And user checks for verifies the logo color

	@P11270-12812 @IosRegression
	Scenario: Check weather System to validate the PIN
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		When user able to see the text of set up Esso PIN
		Then user tap on Setup Esso PIN link
		Then user able to see the title Set up PIN
		Then user verify the back button
		Then user should verify the text set the Esso PIN to unlock the app for fuelling
		Then user tap on continue button
		Then user verify the inline error message


	@P11270-12822 @AndroidRegression @IosRegression @FrictionlessflowRegression
	@P11270-12822 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather System to display CT as prompt when user tap on the ‘Edit’ Message: Are you sure you want to delete this card?, Button: CANCEL, DELETE
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And user click the payment edit button
		And user should verify the last four digit of card number
		And  user tap on Delete Card button
		And user should verify the CT "Are you sure you want to delete this card?"
		And user should verify cancel and delete button

	@P11270-12796 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather User should be able to Set the PIN
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
		Then user should verify the CT label and clicks on send button

	@P11270-12840 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather System to display the Text Esso PIN on Accounts screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		When user able to see the text of set up Esso PIN

	@P11270-12818 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather System to allow user to add card on file link active.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user should verify the Add Card link
		And user clicks a Add card in Account screen

	@P11270-12816  @IosRegression
	Scenario: System to show inline error message when user does not enter ‘City’ and taps on Done : ”Please enter city”
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
#		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on done Button
		Then Tap on Add Payment Done button
#		Then Click on the Done button
		And tap on done Button
		Then user should verify the inliner error "Please enter city"


#Prerequisite:user should already visited 5 times the modal pop up
	@P11270-12316 @iOSRegression @Frick
	Scenario: Verify Logged in user should able to see a modal pop up when loyalty is on-boarded
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		Then verify if a modal pop with the Nectar logo and Static firework image is displayed
		When user tap on View Details Button in the Modal popup in LID
		Then verify whether the user is navigated to the modal expands to give offer details

#Prerequisite:user should already visited 5 times the modal pop up
	@P11270-12436 @iOSRegression @Frick
	Scenario: Verify Logged in user every visit counted after 5 time visiting the modal pop up
		When user is in login screen
		And I enter "Regrcredentials3" in login details
		And user taps login button in login screen
		Then verify if a modal pop with the Nectar logo and Static firework image is displayed

	@P11270-12792  @IosRegression
	Scenario: Check weather System navigates user to ‘Set Up PIN’ screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		Then user should verify the system navigate to setup PIN screen


#NEW ONE

	@P11270-12831  @IosRegression
	Scenario: Check weather System to display CT as a prompt Message: Esso PIN added successfully., Button: OK
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button

	@P11270-12821  @IosRegression
	Scenario: System to navigate user to Postcode Lookup screen, when clicked on search icon.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12819  @IosRegression
	Scenario: System to navigate the user to Postcode Lookup’ search screen, if the user has entered the search criteria.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen


	@P11270-12835  @P11270-12834  @IosRegression
	Scenario: System to show inline message when the user leaves the field blank and taps on Done Message: “Please enter name on card”, Type: In-line error message
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		Then Tap on Add Payment Done button
		Then user should verify the inline error message "Please enter Card Name"



	@P11270-12786  @IosRegression @FrictionlessflowRegression
	Scenario: System to show inline message when user leaves the field blank and taps on Done Message:“Please enter card number”
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		Then Tap on Add Payment Done button
		Then Verify the inline error message for Card Number

	@P11270-12787  @IosRegression @AndroidRegression @FrictionlessflowRegression
	Scenario: System to display the entered card number in the format XXXX XXXX XXXX XXXX
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user  skip the Fingerprint option
		Then user  navigate to payment screen and enter the card number
#		And Verify card number in valid format

	@P11270-12832  @IosRegression
	Scenario: System to make a service call and get the list address based on the data entered by the user for Postcode Lookup’ screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12791  @IosRegression
	Scenario: Check weather System allow user to   enter PIN with possible values for each text/input field is numbers
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		Then user should verifies the Set Up pin screen with numeric keypad

#Tue onwards

	@P11270-12866 @AndroidRegression @IosRegression @Frick
	Scenario: Check weather System to display the logo of the card
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		When user should verify the four digit of the card number
		Then user should able to see the logo of the card

	@P11270-12865 @P11270-12863  @IosRegression @FrictionlessflowRegression
	Scenario: system to display ‘Billing Details’ as section header
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address in the screen

	@P11270-12861  @IosRegression @FrictionlessflowRegression
	Scenario: system to display ‘Billing Details’ as section header
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user verifies the Billing address in the screen
		Then user verifies the Billing address i icon in Card details screen


#		3rd Monward

	@P11270-12886  @IosRegression @FrictionlessflowRegression
	Scenario: Check the weather System to allow the user to add cards as a payment method.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		Then user should verify title text on the payment screen

	@P11270-12833  @IosRegression @FrictionlessflowRegression
	Scenario: System to allow user to edit the data entered in search field
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		Then user verifies the Billing address in the screen
		Then user verifies the Billing address i icon in Card details screen
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user tap on that clear the text which is been entered

	@P11270-12883  @IosRegression @FrictionlessflowRegression
	Scenario: System to show inline error message when user does not enter ‘Postcode’ and taps on Done Message : Please enter postcode
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then user able to see and verify the search icon


	@P11270-12851  @IosRegression @FrictionlessflowRegression
	Scenario: System to enable search icon moment user enters the data for ‘Billing Details’
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		Then user verifies the Billing address in the screen
		Then user verifies the Billing address i icon in Card details screen
		And enter the postcode
		Then user should verify search icon should enable after enter the postcode

	@P11270-12852  @IosRegression @FrictionlessflowRegression
	Scenario: System to show inline error message when user does not enter ‘Postcode’ and taps on Done Message : Please enter postcode
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		Then Tap on Add Payment Done button
		Then user should verify the inline error message without enter postcode "Please enter postcode"

		#4th monward


	@P11270-12858  @IosRegression @FrictionlessflowRegression
	Scenario: System to close the info overlay as user taps on ‘GOT IT’ button
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And Click on i icon in the security field
		Then Click on Got it button on popup screen

	@P11270-12885 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather User should see only the last 4 digits of the card
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		Then user should verify the card last four digit

	@P11270-12884 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check whether User should see the highlighted card number with tick mark for the default payment card
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		Then user should verify the card last four digit
		Then user should see the highlighted card number with tick mark

	@P11270-12868 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather System to display CTXX as a prompt CTXX[Message: Due to security reason you need to log in again. Button: OK]
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user enters the wrong password in enter password field
		Then user tap on continue button
		Then user verify the security pop text
		Then user verify and click the ok button

	@P11270-12867 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather System to navigate user to NLID tapping on ‘OK’ button from the Prompt.
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user enters the wrong password in enter password field
		Then user tap on continue button
		Then user verify the security pop text
		Then user verify and click the ok button
		Then user verify after tap on ok button navigate to NLID screen

#5th monwa

	@P11270-12873 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather System to display CTXX as inline error message ●CTXX[Message: Wrong PIN. 2 Attempts left]
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		When user able to see the text of set up Esso PIN
		Then user tap on Setup Esso PIN link
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And user click the Edit button
		Then user enter the wrong pin number and click on continue button
		Then user verifies the inline error message for entering wrong pin


	@P11270-12877 @P11270-12902 @AndroidRegression @IosRegression @FrictionlessflowRegression
	Scenario: Check weather system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Given click on the login link in present in dashboard
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
		Then user should verify the CT label and clicks on send button

	@P11270-12901 @AndroidRegression
	Scenario: Check weather system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Given click on the login link in present in dashboard
		When User Should Enter the Username
		And User Should Enter the password
		Then User Click on login button
		And user clicks on more icon in LID Screen
		And Click on Account link
		And User Tap Edit button
#		Then user enter the wrong pin number and click on continue button
		When user enter the 3rd time wrong pin number and click on continue button
#		And User able to verify the CT lable
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
#		Then user should verify the CT lable and send button
		When user should Tap on Send button
		Then user should able to see the prompt "We have sent you instructions to reset your password. Please check your inbox or spam folder."

	@P11270-12880  @IosRegression @M03213
	Scenario: system to display 'Postcode’ as text/input field i. Default text Postcode.
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
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
		And user clicks a Add card in Account screen
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button




	@P11270-12901 @AndroidRegression @Frick
	Scenario: Check whether system to send reset password email and user should see a prompt
		Given user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		And user taps on fuel icon and start fuelling button
		And user select pumb and tap on continue button
		And user taps on confirm button in Confirm payment screen
		Then user is navigated to Enter pin screen
		When user taps on Forgot your pin link
		Then Verify user is navigated to Enter Password screen
		When user taps on forget password link
		Then verify user is navigated to Forgot Password screen
		When user taps on send button in Forgot Password Screen
		Then verify the prompt message and tap on Ok button


	@P11270-12849 @AndroidRegression @Frick_Android
	Scenario: Check whether system to navigate user to next logical screen if Touch ID/Fingerprint authentication is successful

		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		When user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		And user able to see the cancel button
		And user enter the Enter PIN number
		Then Tap the continue button
		Then verify that user is navigated to next logical screen once authentication is successful


	@P11270-12834 @AndroidRegression @Frick @IosRegression
	Scenario: System to show inline error messages if user has left the fields blank and taps on ‘Done’

		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And Click on Add Card
		And user clicks on continue button in Card screen
		Then Verify the inline error message for Name On Card
		And Verify the inline error message for Card Number
		And Verify the inline error message for Expiry Date
		And Verify the inline error message for Security Code
		And Verify inline error message for post code
		And Verify inline error message for Address1
		And Verify the inline error message for city

	@P11270-12900 @AndroidRegression @Frick
	Scenario: Check whether the system to display Touch ID/Fingerprint prompt on-site check-in screen
		Then user is in login screen
		When I enter "FrictEssoPswordchk" in login details
		And  user taps login button in login screen
		And user taps on fuel icon and start fuelling button
		Then user select pumb and tap on continue button
		And  user enter the confirms the payment button
		And user able to see the cancel button
		And user able to see the screen label for Enter your Esso PIN to Authorize Payment

	 @FrictionlessFlow
	Scenario: Check whether user able to complete the fuelling transaction with Frictionless flow card
		When user is in login screen
		And I enter "Challenge2" in login details
		And user taps login button in login screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		When user taps on the payment method link
		Then verify if the user lands on Payment Details Screen
		When user selects the frictionless flow card and tap on update button
		And user is navigated to Select your pump screen
		And user selects the pump from 'Select your Pump' page and taps on continue button
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user land on enter PIN screen
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		When user lands on authorize payment screen
		Then user is navigated to start fueling now screen
		And then to now fueling
		Then verify if the user is in the Transaction Complete Screen
		When Tap on Transaction Details link in Transaction Complete Screen
		Then  Verify all the fields are present in Transaction Details screen
		When user taps on back button in the transaction Details screen
		Then verify if the user is in the Transaction Complete Screen
		When user taps on done button after finishing fuelling
		And Verify if the thank you screen is displayed

	@P11270-15960 @iOSRegression @FrictionlessflowRegression
	Scenario: Check Whether system marks "Maximum Fueling Amount" as completed
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
		Then user taps on maximum fueling amount
		Then user clicks on Set Maximum Amount button
		And user sets the fueling amount and clicks ok button
		And user clicks on continue button in maximum fueling screen
		Then user verifies "Maximum Fueling Amount" task is completed

	@P11270-15960 @iOSRegression
	Scenario: Check Whether system marks "Maximum Fueling Amount" as completed
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
#		And user taps on the complete profile
		When user taps on add payment method
		When user verify navigate to add payment screen
		And Tap on Add Debit or Credit card details
#		And Tap on Add Debit or Credit card details
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
#		And user enters the card number
		And user enter the valid card number
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
#		And tap on done Button
		Then user verifies and clicks the i icon next to consent checkbox
#		And Tap on Done button with scroll
		Then Tap on Add Payment Done button
		When user tap done button to navigate verify screen "Payment method added successfully"
		When user tap on payment method added successfully screen continue button
		Then user should verify the "payment method" task is completed


	@P11270-12882 @iOSRegression
	Scenario: Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
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
		And user enters the card details in Add card screen
		And user scrolls down to Consent checkbox section
		Then user verifies and clicks the i icon next to consent checkbox


	@Frictionless-11270
	Scenario: Check when a newly registered user adds a card and verifies the account screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
		When user taps on add payment method
		When user verify navigate to add payment screen
		And Tap on Add Debit or Credit card details
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And user enter the valid card number
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And tap on done Button
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		Then user verifies and clicks the i icon next to consent checkbox
		Then Tap on Add Payment Done button
		When user tap done button to navigate verify screen "Payment method added successfully"
		When user tap on payment method added successfully screen continue button
		Then user should verify the "payment method" task is completed

	@Frictionless  @Smoke_iOS
	Scenario: Check when a newly registered user adds a card and verifies the account screen and validate the forgot password screen
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "chandru.r+" Email address
		Then enter password
		And confirm password
		Then click the check box for accept
		When click on continue button from register screen
		When user tap on Skip button
		Then the system should display Skip warning popup
		When user tap on Skip anyway
		Then app to dismiss the popup and navigate the user to LID after review
		And user taps on the complete profile
		And user verifies the "Completes your profile" screen
		When user taps on add payment method
		When user verify navigate to add payment screen
		And Tap on Add Debit or Credit card details
		And Enter pin
		Then user verifies the popup and clicks on ok button
		And enter name on the card
		And user enter the valid card number
		And enter Expiry Date
		And tap on done Button
		And enter Security Code
		And enter the postcode
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		And tap on select
		Then user verifies and clicks the i icon next to consent checkbox
		When Tap on Add Payment Done button
		When user tap done button to navigate verify screen "Payment method added successfully"
		When user tap on payment method added successfully screen continue button
		Then user should verify the "payment method" task is completed
		And user lands on LID after tapping back button in Complete profile Screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And User Tap Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT label
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button
		Then user should verify the CT label and clicks on send button
		And validate the CT 'Reset your password' and tap on OK button
		Then user should be navigated to NLID


	@Frictionless @Smoke_iOS
	Scenario: Check whether the System displays the CT msg  when user taps on the Edit Link in the Payment method section and also Validate the Forgot password Link when user enters a wrong password
		Given user is on NLID screen
		And user is in login screen
		When I enter "smokecredentials4" in login details
		And user taps login button in login screen
		And user clicks on more icon in LID Screen
		And Click on Account link
		And user click the payment edit button
		And user should verify the last four digit of card number
		And  user tap on Delete Card button
		And user should verify the CT "Are you sure you want to delete this card?"
		And user should verify cancel and delete button
		And User Tap Esso PIN Edit button
		And User click the Forgot your PIN link
		And User able to verify the CT label
		Then user enters the wrong password in enter password field
		Then user tap on continue button
		Then user verify the security pop text
		Then user verify and click the ok button
		Then user verify after tap on ok button navigate to NLID screen


	@Smoke_iOS @FrictionlessFlow
	Scenario: Verify whether the user is navigated to NLID when Forgot Password is tapped during fuelling flow
		When user is in login screen
		And I enter "smokecredentials2" in login details
		Then verify user is on LID Screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		When user taps on the payment method link
		Then verify if the user lands on Payment Details Screen
		When user selects the frictionless flow card and tap on update button
		And user is navigated to Select your pump screen
		And user selects the pump from 'Select your Pump' page and taps on continue button
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user is on setup PIN screen
		When User click the Forgot your PIN link
		Then User able to verify the CT label
		And user should verify the cancel button
		When user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		And user verify the back button
		And user should verify the CT label and clicks on send button
		When validate the CT 'Reset your password' and tap on OK button
		Then user should be navigated to NLID

