@Menu
Feature: Menu

  @P11270-4987 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display Tab bar at the bottom of App UI
    Given user is on NLID screen
    Then verify the Tab bar at the bottom of App UI screen

  @P11270-4988 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System displays following Tabs for the Global Tab Bar
    Given user is on NLID screen
    Then verify user is on non logged in Dashboard
    Then user able to view Fuel, Station, Offers
    And History,More

  @P11270-4989 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System allows user to Navigate Station finder upon tapping Station tab from the tab bar from logged-in dashboard (First time access)
    Given reset the app
    And Click Accept all button in the cookie page
    Given user is on NLID screen
    And user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and Verify

  @P11270-4990 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System allows user to Navigate to Station finder upon tapping Station tab from the tab bar from logged-in dashboard (Second time onward access)
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and Verify

  @P11270-4992 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System navigate user to Offers upon tapping Offers tab from the tab bar from logged-in dashboard
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    Then user taps on Offers
    And verify user is able to Navigate Offers screen

  @P11270-4993 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System navigate user to History upon tapping Station tab from the tab bar from logged-in dashboard
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    Then user taps on History
    And verify user is able to Navigate History screen

  @P11270-4994 @IosRegression @AndroidRegression @Menu1
  Scenario: Check user is not allowed to access Offers from non logged-in dashboard if accessed from tab bar
    Given user is on NLID screen
    Then user taps on Offers
    And verify user is able to see login popup
    Then user taps on ok button
    And verify system navigating to login page

  @P11270-4995 @IosRegression @AndroidRegression @Menu1
  Scenario: Check user is not allowed to access History from non logged-in dashboard if accessed from tab bar
    Given user is on NLID screen
    Then user taps on History
    And verify user is able to see login popup
    Then user taps on ok button
    And verify system navigating to login page

  @P11270-4996 @P11270-4998 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether extended tab bar is displayed upon tapping More tab icon
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    Then verify the following content in tab bar
      | Tell a Friend            |
      | Account                  |
      | Products and Information |
      | Help                     |

  @P11270-4997 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display tab bar only in landing screen of following features
    Given user is on NLID screen
    Then verify the Tab bar at the bottom of App UI screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    Then verify the Tab bar at the bottom of App UI screen
    When user navigates to Fuel Finder screen and Verify
    Then verify the Tab bar at the bottom of App UI screen
    When user taps on More button in tab bar
    Then verify the Tab bar at the bottom of App UI screen
    Then user taps on Tell a Friend
    Then verify the Tab bar at the bottom of App UI screen
    And verify system navigating to Refer a Friend screen
    Then user tabs on back button
    When user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information
    Then verify the Tab bar at the bottom of App UI screen
    Then user tabs on back button
    And user navigates to Account screen
    Then verify the Tab bar at the bottom of App UI screen
    Then user tabs on back button
    When user navigates to Help screen
    Then verify the Tab bar at the bottom of App UI screen
    Then user tabs on back button

  @P11270-4999 @AndroidRegression @Menu1
  Scenario: Android_ONLY Check that System to display Back button for the features from extended tab bar
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    Then user taps on Tell a Friend
    And verify system navigating to Refer a Friend screen
    Then user tabs on back button
    When user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information
    Then user tabs on back button
    When user navigates to Account screen
    Then user tabs on back button
    When user navigates to Help screen
    Then user tabs on back button

  @P11270-5000 @IosRegression
  Scenario: ONLY_iOS Check that System to navigate user back to extended tab bar
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    Then user taps on Tell a Friend
    Then user verifies the back button in the top left corner
    Then user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Products and Information screen
    Then user verifies the back button in the top left corner
    Then user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Account screen
    Then user verifies the back button in the top left corner
    Then user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Help screen
    Then user verifies the back button in the top left corner
    Then user tabs on back button
    Then user verifies whether landed on the Extended Tab bar

  @P11270-5001 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether user should be able to see Account preference screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    Then user verifies the User Profile section
    Then user verifies the Payment, MFA and Nectar section
    Then user verifies the Device settings section
    Then user verifies the Email settings section
    Then user verifies TC and PP link sections
    Then user verifies the Logout button section
    And user taps the logout button in the Account screen
    Then user lands in the NLID screen after logout

  @P11270-5002 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to allow user to update the First name and Last name
    When user is on NLID screen
    And user is in login screen
    And I enter "menuLoginVerify" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    When user edit name by entering firstname and lastname
    And tap on update button
    Then verify the Updated message is displayed
    And verify navigate back to account screen after tapping ok button
    When user taps on fuel icon and navigate to LID screen
    #And user verifies whether the system landed in LID

  @P11270-5003 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to allow user to enter current password
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    Then user verifies the Current password text box
    Then user tap on Done button
    Then user verifies the inline error message in Current password
    And user enters Current password
    And user Taps on show button and verify the current password typed is shown to the user
    Then user taps on hide button and verify the masked password

  @P11270-5004 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display incorrect password prompt
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters incorrect Current password
    And user enters New Password
    And user enters Confirm New Password
    Then user tap on Done button
    Then user verifies the popup containing current password is wrong
    And Tap on OK button
    Then user verifies the edit password title

  @P11270-5005 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to allow user to enter new password
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters Current password
    And user verifies the New Password textbox in Edit Password
    Then user tap on Done button
    Then user verifies the inline error message in password section Edit Password screen
    And user enters New Password
    Then user verifies the updated password rules in Edit Password screen
    And user enter the "IncorrectPwd" in new password and verify the values
    Then user tap on Done button
    Then user verifies the validation message in the Password section in Edit Password screen
    And user enter the "AsciiCharacters32to61" in new password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters62to91" in new password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters92to121" in new password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters122to126" in new password and verify the values
    Then user tap on Done button

  @P11270-5006 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display Confirm new password field for Edit Password screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters Current password
    And user verifies the New Password textbox in Edit Password
    And user enters New Password
    And user Taps on show button and verify the new password typed is shown to the user
    Then user taps on hide button and verify the masked password in new password
    Then user verifies the Confirm new password text box
    And user enter the "AsciiCharacters32to61" in confirm password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters62to91" in confirm password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters92to121" in confirm password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters122to126" in confirm password and verify the values
    Then user tap on Done button

  #  This TC fails in iOS due to inline error issue - P11270-20981
  @P11270-5007 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether system Perform validation for New password and Confirm new password fields
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters Current password
    And user enters New Password
    And user enters different Confirm New Password
    And user tap on Done button
    Then user verify the error message for password mismatch

  @P11270-5008 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display copy text XX as prompt
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters Current password
    And user enters New Password
    And user enters Confirm New Password
    Then user tap on Done button
    Then verify copy text message for password changed
    And Tap on OK button in the popup
    Then user verifies the app redirects back to NLID

  @P11270-5009 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display Payment Method section in Account
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user veify the display the available payment methods under the payment method section

  @P11270-5010 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display PayPal Account
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Add Pay Pal account in Account screen
    Then user verifies the Paypal page

  @P11270-5012 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to display Maximum Fuelling Amount section in Account
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And Tap the info icon in maximum fueling amount
    And Tap on OK button
    And user validate the maximum fuelling amount section in Account screen
    And user tap Edit in the Maximum Fuelling Amount
    And user validate the picker view of Maximum fuelling amount screen
    And user scroll the picker in Maximum fuelling Amount in Account screen
    And user tap Done button in Picker view
    And user verifies the Account title in the account section

  @P11270-5013 @IosRegression @Menu1
  Scenario: Check whether System to display settings for Location services
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and Verify
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user navigates to Location services in the Account screen
    Then user verifies the Location services section

  @P11270-5015 @AndroidRegression
  Scenario: Check whether System to turn on the location services in Android device
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the status of Location Services
    When location services is switched off
    And user taps on Go To Settings link under Location Services
    Then Verify user allows the Location service enabled

  @P11270-5016 @IosRegression @AndroidRegression @Menu1
  Scenario: Check whether System to turn off the location services
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and enable the location
    And user taps on More button in tab bar
    When user navigates to Account screen to verify the device settings
    And user navigates to Location services in the Account screen
    And user navigates to Device settings to turn off the Location services
    And user taps on location button in Device level setting
    And user taps on Never button in Device level setting
    When user kill and relaunch the app
    And user verify the Location services is disabled

  @P11270-5017 @AndroidRegression
  Scenario: Check whether System to display settings for Notifications in Android device
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Go To Settings link under notifications section

  @P11270-5018 @AndroidRegression
  Scenario: Check whether System to turn on the Notifications in Android device
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Go To Settings link under notifications section
    Then verify the user is navigated to device permission screen
    And Disable the notification access

  @P11270-5019 @IosRegression @AndroidRegression
  Scenario: Check whether System to turn off the Notification
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and enable the location
    And user taps on More button in tab bar
    When user navigates to Account screen to verify the device settings
    And user taps on Go To Settings link under notifications section
    Then verify the user is navigated to device permission screen
    And Disable the notification access
    When user kill and relaunch the app
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Go To Settings link under notifications section
    And enable back the notification services

  #  Locator for Camera Settings is iOS is not working properly
  @P11270-5020 @P11270-5021 @P11270-5022 @IosRegression @AndroidRegression
  Scenario: Check whether System to display settings for Camera Access in Android device
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user navigates to Fuel Finder screen and enable the location
    And user taps on More button in tab bar
    When user navigates to Account screen to verify the device settings
    Then Verify the status of the Camera Access
    And tap on the Go To Settings under camera access
    Then disable the camera access for the user
    When user kill and relaunch the app
    And user taps on More button in tab bar
    Then verify the camera access in Account screen

  @P11270-5023 @IosRegression @AndroidRegression
  Scenario: Check whether System to display Email Settings sections in Account
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should validate the email setting options
    And user should validate the Receipt subscription
    And user should validate the Receipt marketing subscriptions

  @P11270-5024 @IosRegression @AndroidRegression
  Scenario: Check whether System to display receipt subscription checkbox
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt out for receipts by email checkbox
    Then user should validate the receipt checkbox copy text for not opting to receive emails
    Then tap on ok button and close receipt checkbox copy text
    Then user should opt for Offers by email checkbox
    And user should validate the offer checkbox copy text for opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5025 @IosRegression @AndroidRegression
  Scenario: Check whether System to display offers checkbox
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt for Offers by email checkbox
    And user should validate the offer checkbox copy text for opting to receive emails
    Then tap on ok button and close receipt checkbox copy text
    Then user should opt out for Offers by email checkbox
    And user should validate the offer checkbox copy text for not opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  #  In iOS, Terms and Condition cannot be verified due to this defect - P11270-20768
  @P11270-5026 @IosRegression @AndroidRegression
  Scenario: Check whether System to display Terms and Conditions section
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Terms and Conditions link
    Then user verifies the title and taps on Close button
    Then verify navigate back to account screen

  @P11270-5027 @IosRegression @AndroidRegression
  Scenario: Check whether System to display Privacy Policy section
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Privacy Policy link
    Then verify user navigates to Privacy Policy screen
    Then user closes the Privacy Policy screen
    Then verify navigate back to account screen

  @P11270-5028 @IosRegression @AndroidRegression
  Scenario: Check whether System to display display LOG OUT button
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps LogOut button in Account screen
    Then verify user is on non logged in Dashboard

  @P11270-5030 @IosRegression @AndroidRegression
  Scenario: Check the ability of the user to view Transaction history screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user verify the Transaction History screen
    When user taps on any of the Transaction infos from list
    Then user should navigate to transaction details screen
    When user taps on back Arrow from transaction details
    Then user should navigate to Transaction History Screen

  @P11270-5031 @P11270-5032 @IosRegression @AndroidRegression
  Scenario: Check whether System to display Copy Text as prompt, as user taps Email Receipt button
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    When user taps on Select Button
    Then System should display Email Receipt button with Disable state
    When user select any Transaction Checkbox History
    When user taps on Email receipt Button
    Then user should able to see Popup with text as Receipts sent via email
    When user taps on Ok Button
    Then user verify the Transaction History screen

  @P11270-5033 @IosRegression @AndroidRegression
  Scenario: Check whether System to navigate to Transaction Details screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    And transaction for last 90 days
    And the deatils as Date, Time, Transaction Amount
    Then user tap on transaction list
    And user is navigated to transaction details
    And user validate vat receipt view link

  @P11270-5034 @IosRegression @AndroidRegression
  Scenario: Check whether ability of system to display the VAT Receipt link as per following scenarios
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user tap on transaction list
    And user validate vat receipt view link
    Then user tap on view vat receipt and validate

  @P11270-5035 @IosRegression @AndroidRegression
  Scenario: Check whether Ability of user to add a note to the Transaction Details
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user tap on transaction list
    Then user tap on Add note link
    And enter a note and save
    Then validate the entered note

  @P11270-5036 @IosRegression @AndroidRegression
  Scenario: Check whether System navigates user to Tell a Friend screen from menu
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    Then user taps on Tell a Friend
    Then user verifies whether user lands in the Tell a friend screen

  #    In iOS, unable to verify Tell a Friend content
  @P11270-5037 @IosRegression @AndroidRegression
  Scenario: Check whether System to display the updated Copy Text XX as the message along with the link shared
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    Then user taps on Tell a Friend
    Then user verifies whether user lands in the Tell a friend screen
    Then user verifies the Tell a friend screen
    Then user taps on Tell a friend button in Tell a friend screen

  #    Then user verifies the tell a friend content in the display
  #    Then user taps message button in the Tell a friend option
  #    And verify the tell a friend content
  @P11270-5038 @IosRegression @AndroidRegression
  Scenario: Check whether System to display the updated prompt when user opt in for the news and promotions
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt for Offers by email checkbox
    And user should validate the offer checkbox copy text for opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5039 @IosRegression @AndroidRegression
  Scenario: Check whether System to display the updated prompt when user opt out for the news and promotions
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt out for Offers by email checkbox
    And user should validate the offer checkbox copy text for not opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5040 @IosRegression @AndroidRegression
  Scenario: To verify that system will display following details for the Help screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    Then validate the Help page options

  @P11270-5041 @IosRegression @AndroidRegression
  Scenario: To verify that system will navigate to Esso App Tutorial screens
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    Given User click on the Esso App Tutorial Link and verify next screens
    Then User click on the get started button
    Then validate user on Help page

  @P11270-5042 @IosRegression @AndroidRegression
  Scenario: To verify that system will display following topics under FAQ.
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    Given User click on the Frequently asked Question link
    Then Validate the header of Frequently asked Question title "Frequently Asked Questions"
    Then Validate all the Frequently Asked Question Header
      | How the app works              |
      | Payments & Billing             |
      | Safety and Security            |
      | Loyalty Points                 |
      | Benefits of Using the Esso App |
      | Technical                      |
      | Communications & Data Privacy  |

  @P11270-5043 @IosRegression @AndroidRegression
  Scenario: To verify that system will display Email section below FAQ section
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    And validate the Email title as Send us your questions or thoughts
    Given User click on the Email link
    Then validate the email page

  @P11270-5044 @IosRegression @AndroidRegression
  Scenario: To verify that system will display Esso App Feedback section below Call section
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    And validate the Call text as Speak to a customer representative and Normal call rates apply.
    When User click on the call link
    Then verify if user click on call its navigating to dial pad screen

  @P11270-5045 @IosRegression @AndroidRegression
  Scenario: To verify that system will display Esso App Feedback link in Help section
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    When User click on the Esso App Feedback
    Then verify title as "Esso"
    And verify Sub title as "Help us improve"
    Then verify Esso App Feedback screen copy text
    And verify Give Us More Feedback link

  @P11270-5046 @IosRegression @AndroidRegression
  Scenario: To verify that system will display Esso App feedback screen 4
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    When User click on the Esso App Feedback
    Then User taps on Give Us more feedback
    And verify the Esso App feedback screen

  @P11270-5047 @IosRegression @AndroidRegression
  Scenario: To verify that system will display text box below the statement reviews in feedback screen 4
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    When User click on the Esso App Feedback
    Then User taps on Give Us more feedback
    And verify text box the statement reviews
    And user enters maximum characters including Ascii characters in Esso Feedback
    Then user verifies the character count entered in the Textbox feedback

  @P11270-5048 @IosRegression @AndroidRegression
  Scenario: To verify that system will display Copy Text XX as a prompt when user tap on SEND FEEDBACK button
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    When User click on the Esso App Feedback
    Then User taps on Give Us more feedback
    And user give stars for First Statement
    Then click on the SEND FEEDBACK button
    And verify the prompt message as "Thanks for your feedback."
    Then Tap on OK button
    And verify promt id getting closed and user navigated back to Help Screen

  @P11270-5049 @P11270-5050 @P11270-5051 @IosRegression @AndroidRegression
  Scenario: To verify that system to display a prompt, when user has given feedback or blank feedback.
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    When User click on the Esso App Feedback
    Then User taps on Give Us more feedback
    And user give stars for First Statement
    Then user give stars for Second Statement
    And user give stars for Third Statement
    Then user give stars for Fourth Statement
    Then click on the SEND FEEDBACK button
    And verify the prompt message as "Thanks for your feedback."
    Then Tap on OK button
    And verify promt id getting closed and user navigated back to Help Screen

  @P11270-5052 @IosRegression @AndroidRegression
  Scenario: Check whether System to display Products and Information screen in sections
    Given user is on NLID screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information