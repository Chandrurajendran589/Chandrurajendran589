@ManualRegistration1
Feature: Manual Registration

  Background: 
    Given reset the app
    When user is on NLID screen

  @P11270-13238 @AndroidRegression
  Scenario: Verify  system to display updated text from �Sign In� to �Login� in Non Logged in Dashboard
    Then verify user is on non logged in Dashboard
    And user verifies the login button in the NLID

  @P11270-13239 @AndroidRegression
  Scenario: Verify user selects the �Login� option and user allowed to enter there authentication credentials
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    Then user Verify the enter there authentication credentials

  @P11270-13240 @P11270-13241 @AndroidRegression @IosRegression
  Scenario: Verify system to display the updated password rules in registration page
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And enter password
    Then user verifies the updated password rules

  @P11270-13243 @P11270-4830 @AndroidRegression @IosRegression
  Scenario: Verify application display validation message in password field if user enter less than 8 characters
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And user enters a password with less than 8 characters
    Then user verifies the updated password rules
    When click the check box for accept in Register screen
    And click on continue button from register screen
    Then verify the inline error message in the password section

  @P11270-13245 @AndroidRegression @IosRegression
  Scenario: Verify validation is displayed when user enter only uppercase in password field
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And user enters a password with only upper case more than 8 characters
    And click the check box for accept in Register screen
    And click on continue button from register screen
    Then user verifies the validation message

  @P11270-13246 @AndroidRegression @IosRegression
  Scenario: Verify validation is displayed when user enter only lowercase in password field
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And user enters a password with only lower case
    And click the check box for accept in Register screen
    And click on continue button from register screen
    Then user verifies the validation message

  @P11270-13247 @AndroidRegression @IosRegression
  Scenario: Verify system display validation message if user enter password without any number or special characters
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And user enters a password with only upper case more than 8 characters
    And click the check box for accept in Register screen
    And click on continue button from register screen
    Then user verifies the validation message

  # The below TC fails in iOS due to this defect P11270-18609
  @P11270-13248 @AndroidRegression @IosRegression
  Scenario: Verify user should  be able  to see a tick mark corresponding to each validation rule as the rules are achieved
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And enter password
    Then verify the tick marks are present in the Register screen

  @P11270-13249 @P11270-4855 @AndroidRegression @IosRegression
  Scenario: Verify validation message is displayed in confirmation password if password condition is not satisfied
    When user taps on Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And enter password
    And enter a random password in the confirm password field
    And click the check box for accept in Register screen
    And click on continue button from register screen
    Then verify the inline error message in the confirm password

  @P11270-13250 @AndroidRegression @IosRegression
  Scenario: Verify user is able to enter ASCII key in Registration page
    When user taps on Register screen
    Then user enter the "AsciiCharacters32to61" in Registration fields and verify the values
    And user enter the "AsciiCharacters62to91" in Registration fields and verify the values
    And user enter the "AsciiCharacters92to121" in Registration fields and verify the values
    And user enter the "AsciiCharacters122to126" in Registration fields and verify the values
#    Then enter First Name ASCII key
#    Then enter Last Name ASCII key
#    Then enter password ASCII key
#    And enter a random password in the confirm password ASCII key field

  @P11270-13251 @AndroidRegression @IosRegression
  Scenario: Verify user is able to validate update password rules in edit page
    When user is in login screen
    And I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    And user taps on edit usr pwd
    And user enters Current password
    And user enters New Password
    And user enters Confirm New Password
    And user tap on Done button
    Then verify copy text message for password changed
    When user taps on ok button
    Then user verifies the app redirects back to NLID

  @P11270-13252 @AndroidRegression @IosRegression
  Scenario: Verify user is able to validate update password rules in edit page
    When user is in login screen
    And I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    When user taps on edit usr pwd
    And user enters Current password
    And user enters New Password
    Then user verifies the updated password rules

  @P11270-16070 @AndroidRegression @IosRegression
  Scenario: Verify the User able to add mobile number field as part of the User Profile section
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the mobile number header section in account
    Then verify the add mobile number button in account

  @P11270-16071 @AndroidRegression @IosRegression
  Scenario: Verify the User able to navigate add mobile number screen from user profile section
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the add mobile number button in account
    And user taps on Add mobile number button
    Then Verify the title and the label
    Then verify the add mobile number section in the account screen
    Then verify the buttons in the add mobile number screen

  @P11270-16034 @AndroidRegression @IosRegression
  Scenario: Verify user should able to see mobile number filed as part of registration form
    And user taps on Register screen
    Then user verifies country code
    Then user verifies the place holder in the textbox
    And user enters the mobile number in the Register screen
    Then user verifies the place holder is not displayed

  @P11270-16035 @AndroidRegression @IosRegression
  Scenario: Verify app should display country code by default and app should not allow the user to edit the country code
    And user taps on Register screen
    Then user verifies country code
    Then user verifies whether the country code is editable

  @P11270-16036 @AndroidRegression @IosRegression
  Scenario: Verify user able to view and click info icon in the mobile number field
    And user taps on Register screen
    And user taps the info icon in the Mobile number section
    Then user verifies the content in the info popup of Mobile number section
    And user taps on OK button in the info popup of Mobile number section
    Then user lands in the Registration Screen after tapping OK from Mobile Info popup

  @P11270-16037 @AndroidRegression @IosRegression
  Scenario: Verify app should allow the user to enter the mobile number
    And user taps on Register screen
    And user enters the mobile number in the Register screen
    Then user closes the keypad in the mobile section in Registration screen

  @P11270-16042 @AndroidRegression @IosRegression
  Scenario: Verify mobile number format should be displayed with space
    And user taps on Register screen
    Then user verifies the place holder in the textbox
    And user enters the mobile number in the Register screen
    Then user closes the keypad in the mobile section in Registration screen
    Then user verifies the entered mobile number is present with space

  @P11270-16048 @AndroidRegression @IosRegression
  Scenario: Verify the app validate the length of the mobile number
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    And user enters the mobile number in the Register screen less than 10 digits
    Then user closes the keypad in the mobile section in Registration screen
    Then click the check box for accept in Register screen
    When click on continue button from register screen
    Then verify the inline error message for the mobile section in Registration screen

  @P11270-16051 @AndroidRegression @IosRegression
  Scenario: Verify the app should not mandate the user to add a mobile number
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept in Register screen
    When click on continue button from register screen

  # The below TC fails in iOS due to this defect P11270-18609
  @P11270-13242 @AndroidRegression @IosRegression
  Scenario: Verify user enter less than 8 characters in the password field application
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    And user enters a password with only upper case more than 8 characters
    Then validate the first tick mark validation
    Then user verifies the updated password rules

  @P11270-4857 @AndroidRegression @IosRegression
  Scenario: Check whether the system is able to display Accept Privacy Policy and T&C content
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    When click on continue button from register screen without selecting the PP and TC checkbox
    Then verify the content of the PP and TC checkbox

  @P11270-4833 @AndroidRegression @IosRegression
  Scenario: Check whether the system is able to display - Please Accept Privacy Policy and T&C
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    When click on continue button from register screen without selecting the PP and TC checkbox
    Then verify the title of the PP and TC checkbox

  @P11270-4824 @AndroidRegression @IosRegression
  Scenario: Check whether system closes the keyboard prompt upon tapping Done or Return button
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then user taps on Done button

  @P11270-4854 @AndroidRegression @IosRegression
  Scenario: Check whether Inability of the system to allow user to register with same email-id multiple times
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    And user enters the "regressioncredentials1" already registered mail address
    Then enter password
    And confirm password
    Then click the check box for accept in Register screen
    When click on continue button from register screen
    Then verify the multiple registration error popup

  #In iOS, Terms and Condition cannot be verified due to this defect - P11270-18732
  @P11270-4832 @P11270-4856 @AndroidRegression @IosRegression
  Scenario: Check whether the Privacy Policy, Terms and Conditions are getting opened
    And user taps on Register screen
    And confirm password
    Then click the check box for accept in Register screen
    And user taps on Privacy Policy link in the Registration screen
    And user lands in the Privacy Policy screen
    And user navigate back to the Register screen from Privacy policy
    Then user lands in the Register screen
    And user taps on Terms and Conditions link in the Registration screen
    Then user lands in the Register screen

  @P11270-4825 @AndroidRegression @IosRegression
  Scenario: Check whether the system is able validate the email address field once the user navigates to the next field
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    And user enters the "regressioncredentials1" already registered mail address
    Then enter password
    And confirm password
    When click on continue button from register screen without selecting the PP and TC checkbox

  @P11270-4826 @P11270-4853 @AndroidRegression @IosRegression
  Scenario: Check whether the system to validate the email, when user taps on tap button / when the focus is shifted from Email field
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    And user enters the wrong mail format in the Register screen
    Then enter password
    When click on continue button from register screen without selecting the PP and TC checkbox
    Then user verifies the inline error message of the mail id

  @P11270-4852 @AndroidRegression @IosRegression
  Scenario: Check whether system show inline message if the user taps on CONTINUE button without entering info in the following fields
    And user taps on Register screen
    When click on continue button from register screen
    Then user verifies the inline error message of the empty first name
    Then user verifies the inline error message of the empty last name
    Then user verifies the inline error message of the empty email address
    Then user verifies the inline error message of the empty Password

  @P11270-4831 @AndroidRegression @IosRegression
  Scenario: Check whether system should validate the Confirm Password Field
    And user taps on Register screen
    Then enter First Name
    Then enter Last Name
    And user enters the "regressioncredentials1" already registered mail address
    Then enter password
    Then user taps on Done button
    When click on continue button from register screen
    Then user verify the empty confirm password

  @P11270-4851 @P11270-4823 @AndroidRegression @IosRegression
  Scenario: Check whether the user is able to see the below mentioned details for Registration Screen
    And user taps on Register screen
    Then user verifies the back button
    And user verifies the first name checkbox
    And user verifies the last name checkbox
    And user verifies the email checkbox
    And user verifies the Mobile number Textbox
    Then user verifies the show hide toggle button
    Then user verifies the Continue button
    And confirm password
    Then user taps on the Done button
    Then user verifies the checkboxes
    Then user verifies the Esso related content
    Then user verifies the PP and TC related content

  @P11270-16072 @P11270-16076 @AndroidRegression @IosRegression
  Scenario: Verify the User able to view add mobile number field in Add mobile number screen
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the add mobile number button in account
    And user taps on Add mobile number button
    Then Verify the title and the label
    Then verify the add mobile number section in the account screen
    Then verify the buttons in the add mobile number screen
    And user adds the mobile number in the Account screen
    Then user verifies the place holder is not displayed in the Account Screen

  @P11270-16073 @AndroidRegression @IosRegression
  Scenario: Verify that system should display the device verification required pop-up when I change to a new device and attempt to log into the App
    And user taps on Login button in NLID
    When I enter "accountLoginOtherDeviceCredentials" in login details
    And user taps the Login Button alone
    Then user verify the Login Notification Title
    Then user verify the Login Notification content in the Login screen
    Then user verify the OK button and Resend button
    And user tap on OK button in the Login Notification popup
    Then user verifies the Login screen

  @P11270-16074 @AndroidRegression @IosRegression
  Scenario: Verify the User able to enter mobile number in account flow
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the add mobile number button in account
    And user taps on Add mobile number button
    Then Verify the title and the label
    Then verify the add mobile number section in the account screen
    Then verify the buttons in the add mobile number screen
    And user adds the mobile number in the Account screen
    Then user taps done button in the keypad

  @P11270-16075 @AndroidRegression @IosRegression
  Scenario: Verify that system should allow the user to resend the device verification link when I change to a new device and attempt to log into the App
    And user taps on Login button in NLID
    When I enter "accountLoginOtherDeviceCredentials" in login details
    And user taps the Login Button alone
    Then user verify the Login Notification Title
    Then user verify the Login Notification content
    Then user verify the OK button and Resend button
    And user tap on Resend link in the Login Notification popup
    Then user verifies the mail sent popup

  @P11270-16078 @AndroidRegression @IosRegression
  Scenario: Verify the User able to view add mobile number field in Add mobile number screen
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the add mobile number button in account
    And user taps on Add mobile number button
    Then Verify the title and the label
    Then verify the add mobile number section in the account screen
    Then verify the buttons in the add mobile number screen
    And user adds the mobile number less than 10 digits in the Account screen
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the inline error message in the mobile number
    And user adds the mobile number in the Account screen
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the mobile number is added successfully
    And user taps on ok button
    Then user navigate to account screen and verifies the mobile number
    And user taps on edit button Mobile section in the Account screen
    And user taps on delete button in Edit Mobile Number section
    Then user verifies the delete pop msg
    And user taps on delete button in the Delete Mobile popup msg
    Then user verifies the mobile number is deleted successfully
    Then user taps on ok button
    Then user navigate to account screen and verifies the add mobile number section

#  This TC fails in iOS due the login issue - P11270-21459
  @P11270-16079 @AndroidRegression @IosRegression
  Scenario: Verify that system should display the resend email confirmation pop-up
    And user taps on Login button in NLID
    When I enter "accountLoginOtherDeviceCredentials" in login details
    And user taps the Login Button alone
    Then user verify the Login Notification Title
    Then user verify the Login Notification content in the Login screen
    Then user verify the OK button and Resend button
    And user tap on Resend link in the Login Notification popup
    Then user verifies the mail sent popup

  @P11270-16081 @AndroidRegression @IosRegression
  Scenario: Verify the User success prompt after adding the mobile number in account flow
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the add mobile number button in account
    And user taps on Add mobile number button
    Then Verify the title and the label
    Then verify the add mobile number section in the account screen
    Then verify the buttons in the add mobile number screen
    And user adds the mobile number less than 10 digits in the Account screen
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the inline error message in the mobile number
    And user adds the mobile number in the Account screen
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the mobile number is added successfully
    And user taps on ok button
    And user taps on contiue button
    Then user navigate to account screen and verifies the mobile number
    And user taps on edit button Mobile section in the Account screen
    And user taps on delete button in Edit Mobile Number section
    Then user verifies the delete pop msg
    And user taps on delete button in the Delete Mobile popup msg
    Then user verifies the mobile number is deleted successfully
    Then user taps on ok button
    Then user navigate to account screen and verifies the add mobile number section

#    This TC fails in iOS due the login issue - P11270-18189
  @P11270-16089 @AndroidRegression @IosRegression
  Scenario: Verify that system should not display the device verification related login notification for already verified user
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen

  @P11270-16239 @P11270-16240 @AndroidRegression @IosRegression
  Scenario: Verify App should navigate the user to the 'Edit Mobile Number' screen
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on edit button Mobile section in the Account screen
    Then verify the following content in Edit Mobile section
      | Screen title: Edit Mobile Number                      |
      | Screen label: Please update your mobile number below. |
      | Delete mobile Number                                  |
      | Country code �+44(0)�                                 |
      | 'Cancel' as Button                                    |
      | DONE' as a button                                     |
    And user enters the mobile number
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the mobile updated password successfully popup
    And user taps on ok button
    And user verifies the Account title in the account section

  @P11270-16241 @AndroidRegression @IosRegression
  Scenario: Verify App should allow the user to edit the mobile number with following fomate 4 digits <Single space> 6 digits
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on edit button Mobile section in the Account screen
    Then verify the following content in Edit Mobile section
      | Screen title: Edit Mobile Number                      |
      | Screen label: Please update your mobile number below. |
      | Delete mobile Number                                  |
      | Country code �+44(0)�                                 |
      | 'Cancel' as Button                                    |
      | DONE' as a button                                     |
    And user enters the mobile number in the Account screen
    Then user verifies the entered mobile number is present with space in the Account screen

  @P11270-16242 @AndroidRegression @IosRegression
  Scenario: Verify App should validation for the length of the mobile number
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on edit button Mobile section in the Account screen
    Then verify the following content in Edit Mobile section
      | Screen title: Edit Mobile Number                      |
      | Screen label: Please update your mobile number below. |
      | Delete mobile Number                                  |
      | Country code �+44(0)�                                 |
      | 'Cancel' as Button                                    |
      | DONE' as a button                                     |
    And user adds the mobile number less than 10 digits in the Account screen
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the inline error message in the mobile number
    And user taps back in the mobile number field
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the mobile updated password successfully popup

  @P11270-16243 @AndroidRegression @IosRegression
  Scenario: Verify App should do empty validation for the mobile number field
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on edit button Mobile section in the Account screen
    Then verify the following content in Edit Mobile section
      | Screen title: Edit Mobile Number                      |
      | Screen label: Please update your mobile number below. |
      | Delete mobile Number                                  |
      | Country code �+44(0)�                                 |
      | 'Cancel' as Button                                    |
      | DONE' as a button                                     |
    And user remove edit the mobile number
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the inline error message in the edit mobile number screen with no number

  @P11270-16244 @AndroidRegression @IosRegression
  Scenario: Verify App should allow the user to delete the added mobile number and display mobile number deleted successfully pop-up
    Then user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Add mobile number button
    And user adds the mobile number in the Account screen
    Then user taps done button in the keypad
    And user taps on the Done button in the Add Mobile screen
    Then user verifies the mobile number is added successfully
    And user taps on ok button
    Then user navigate to account screen and verifies the mobile number
    And user taps on edit button Mobile section in the Account screen
    And user taps on delete button in Edit Mobile Number section
    Then user verifies the delete pop msg
#    And user taps on cancel button in the Mobile number then the system should close the prompt
#    And user taps on delete button in Edit Mobile Number section
    And user taps on delete button in the Delete Mobile popup msg
    Then user verifies the mobile number is deleted successfully
    Then user taps on ok button
    Then user navigate to account screen and verifies the add mobile number section

  @P11270-16246 @P11270-16247 @AndroidRegression @IosRegression
  Scenario: Verify App should display 'Add Mobile Number' task under user profile section the 'Complete Your Profile' screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "saravanan.murugan+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    Then user verifies the User Profile section in Complete your profile screen
    And user taps on Add Mobile Number
    Then user verifies the mobile number task is not completed

  @P11270-16251 @AndroidRegression @IosRegression
  Scenario: Verify app display an 'Already Completed' pop-up for the 'Add Mobile Number' task
    When user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    Then user taps on Login Icon in Login screen
    And user taps on the complete profile
    And user verifies the "Completes your profile" screen
    Then user clicks on Completed Add Mobile number Icon
    And user verifies the Add Mobile Number confirmation pop up with message
    And user accepts the pop up message
    And user verifies the "Completes your profile" screen

  @P11270-16250 @AndroidRegression @IosRegression
  Scenario: Verify app display the 'Add Mobile Number' task as completed and display a tick mark for the 'Add Mobile Number' task
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "saravanan.murugan+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    Then user clicks on Completed Add Mobile number Icon
    And user enters the mobile number
    Then user clicks done icon on the screen
    And user confirms the verification pop up
    And user taps on contiue button
    And user verifies the 40% profile completion circular indicator
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-16253 @AndroidRegression @IosRegression
  Scenario: Verify app should display a 40% profile completion circular indicator on LID after adding a mobile number
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "saravanan.murugan+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    Then user clicks on Completed Add Mobile number Icon
    And user enters the mobile number
    Then user clicks done icon on the screen
    And user confirms the verification pop up
    And user taps on contiue button
    Then user verifies the 40% profile completion circular indicator
    And user verifies the completion of PP and TC task
    Then user verifies the completion of Set First Name and Last Name task
    And user verifies the completion of Mobile number task
    Then user verifies the completion of Notification task

  @P11270-4827 @AndroidRegression
  Scenario: Check whether the system to validate the email, when user taps on tap button / when the focus is shifted from Email field
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as invalid "saravanan.murugan"
    When click on continue button from register screen
    Then user verifies the inline error message of the invalid email address

  @P11270-4828 @AndroidRegression @IosRegression
  Scenario: Check whether System to validate the password field once the user starts entering in password
    When user taps on register button from Login screen
    And enter the password field
    And click on continue button from register screen without selecting the PP and TC checkbox
    Then verify the inline error message in the password section

  @P11270-4829 @AndroidRegression @IosRegression
  Scenario: Check whether the password character limit is atleast 8 characters
    When user taps on register button from Login screen
    And enter the password less then 8 characters
    And user verifies the updated password rules
    Then verify the tick marks are present in the Register screen

  @P11270-4834 @AndroidRegression @IosRegression
  Scenario: Check whether the System to display checkbox for marketing emails
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    When click on continue button from register screen
    Then verify user display checkbox for marketing emails

  @P11270-4837 @AndroidRegression @IosRegression
  Scenario: Check whether System Set maximum fuelling amountaccount level value from the picker
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Tap on Maximum Fueling Amount edit button
    And Select Maximum Fuelling Amount Amount
    And validate the updated Maximum Fueling Amount value

  @P11270-4838 @AndroidRegression @IosRegression
  Scenario: Check whether System Close the maximum fuelling amount change confirmation prompt
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Tap on Maximum Fueling Amount edit button
    Then Tap on cancel button and validate maximum fuel amount

  @P11270-4841 @P11270-4844 @AndroidRegression @IosRegression
  Scenario: Check whether System Skip setting-up default maximum fuelling amount
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    Then user taps on maximum fueling amount
    And user skips the maximum fueling amount
    And user clicks on continue button in maximum fueling screen
    And user taps on back button in complete your profile button
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user navigate to Maximum Fuelling Amount section in Account screen
    Then validate the updated Maximum Fueling Amount value

  @P11270-4842 @AndroidRegression @IosRegression
  Scenario: "Check whether System should Display updated maximum fuelling amount value for the Pre-auth button
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    And Tap on Maximum Fueling Amount edit button
    Then user validates the title maximum fuelling amount picker
    And Select Maximum Fuelling Amount Amount
    Then validate the updated Maximum Fueling Amount value

  @P11270-4846 @AndroidRegression @IosRegression
  Scenario: Check whether System Skip setting-up default maximum fuelling amount
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Tap on Maximum Fueling Amount edit button
    Then Tap on cancel button and validate maximum fuel amount

  @P11270-4847 @AndroidRegression @IosRegression
  Scenario: Check whether System Skip setting-up default maximum fuelling amount
    Given user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and Verify
    When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    When user taps on the "Maximum fueling amount" link
    Then it should open "Maximum Fueling Amount" pop-up

  @P11270-4848 @AndroidRegression @IosRegression
  Scenario: Check whether System Skip setting-up default maximum fuelling amount
    Given user is in login screen
    When I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    When user taps on the "Maximum fueling amount" link
    Then it should open "Maximum Fueling Amount" pop-up
    When user tap on "CANCEL" button

  @P11270-4858 @AndroidRegression @IosRegression
  Scenario: Check whether the system is able to enroll user email-id for receiving news and exclusive offers, if user has selected the check-box
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    And enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And enter password
    And confirm password
    And click the check box for accept
    Then user selects the receive mails checkbox
    When click on continue button from register screen

  @P11270-4859 @AndroidRegression @IosRegression
  Scenario: Check whether the System not to enroll user for marketing emails, if user has not selected the check-box
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen

  @P11270-4867 @AndroidRegression
  Scenario: "Check whether System not to display Set Pre-auth screen after user log in to the App
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravananmurugan157+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen

  @P11270-13254 @IosRegression @AndroidRegression
  Scenario: Verify for login user the updated URL to be displayed when user is tapping on FAQs link in more option
    When user is in login screen
    And I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    Then user navigates to Help screen
    When User click on the Frequently asked Question link
    And user click on Loyalty points
    And user click on nectar link in loyalty points
    And tap on FAQ link in the nectar section
    Then user verifies the faq link

  @P11270-13253 @IosRegression
  Scenario: Verify for guest user the updated URL to be displayed when user is tapping on FAQs link in more option
    When user taps on More button in tab bar
    Then user navigates to Help screen
    When User click on the Frequently asked Question link
    And user click on Loyalty points
    And user click on nectar link in loyalty points
    And tap on FAQ link in the nectar section
    Then user verifies the faq link

  @P11270-15836 @IosRegression
  Scenario: Verify the app should not display the ‘Do you have a Nectar card' screen from Offers
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    When enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And enter password
    And confirm password
    And click the check box for accept
    And click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    And user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    When user taps on Offers
    Then user validate the empty offers screen
    When user clicks Add Nectar Card from offer screen
    Then user is navigated to add nectar screen

#    The below TC fails in iOS due to the issue - P11270-22287
  @P11270-15837 @IosRegression
  Scenario: Verify the app should display a ‘Sign up' link on the 'Add Nectar Card’ screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    When enter First Name
    And enter Last Name
    And enter "saravananmurugan157+" Email address
    And enter password
    And confirm password
    And click the check box for accept
    And click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    And user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    When user taps on Offers
    Then user validate the empty offers screen
    When user clicks Add Nectar Card from offer screen
    Then User is navigated to Add Nectar Card screen
    And user verifies the Add nectar card screen from offers
    When user clicks on Sign up link in Add Nectar card screen
    Then user verifies the sign up link offers screen

