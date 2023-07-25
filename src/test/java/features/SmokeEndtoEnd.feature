@SmokeTestEndtoEnd

Feature: Smoke test cases for end to end

  @P11270-22880 @Smoke_iOS1 @Smoke_Android
  Scenario: Smoke Test - Verify the App Install and Launch of the Esso App
#    Given reset the app
    Given Install and launch the Esso app
#    Then Verify the Cookie page elements
#    And Click Accept all button in the cookie page
    Then verify that User is able to see Welcome screen
    When user tap on next button
    Then Verify elements present in second screen
    When user tap on next button
    Then Validate third screen
    And User click on get Started Button
    And user navigated to NLID Screen
    And Verify the Element displayed in NLID screen

  @P11270-22881 @Smoke_iOS11 @Smoke_Android
  Scenario: Check whether the SSO and Manual Logins are accessible
    When user taps on Twitter icon in the NLID
    Then user verifies whether the app navigated to Twitter login screen
    And user navigates back to NLID from Twitter
    When user taps on Facebook icon in the NLID
    Then user verifies whether the app navigated to Facebook login screen
    When user navigates back to NLID from Facebook
    And user taps on Linkedin icon in the NLID
    Then user verifies whether the app navigated to Linkedin login screen
    When user navigates back to NLID from Linkedin
    And user taps on Login button in NLID
    And User taps on Login button in Login screen without entering the values
    Then Verify the inline error message during login
    And Verify the inline error message for password
    When user enters invalid email id in the Login screen
    And user taps on Login Icon in Login screen
    Then user verifies the inline error message of the invalid email address
    When Enter valid mail and tap done
    Then Verify the inline error message for password
    When Enter the wrong password and tap login
    Then Verify the popup content
    And clicks on ok button in the popup content

  @P11270-22882 @Smoke_iOS11 @Smoke_Android
  Scenario: Check the Forgot Password flow from Login Screen
    When user taps on Login button in NLID
    And user taps on Forgot password link in login screen in NLID
    And user taps on Cancel in the Login Screen
    And user taps on Forgot password link in login screen in NLID
    And user enters invalid email id
    And user taps on send button in Forgot Password Screen
    Then Verify the inability to send the mail
    And User enters the "smokecredentials1" valid mail id and taps send button
    Then Verify the mail is sent

  @P11270-22883 @Smoke_iOS11 @Smoke_Android
  Scenario: Check the behaviour and content of the all the tabs in NLID except Help and Station Finder
    Then verify user is on non logged in Dashboard
    And user able to view Fuel, Station, Offers
    And History,More
    When user taps on Offers
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on History
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on More button alone
#    Then verify the following content in tab bar
#      | Tell a Friend |
#      | Account |
#      | Settings |
#      | Products and Information |
#      | Help |
    When user taps on Tell a Friend
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on More button alone
    And user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information
    And verify the Tab bar at the bottom of App UI screen
    And user taps on More button alone
    And user navigates to Account screen
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page

  @P11270-22884 @Smoke_iOS11 @Smoke_Android
  Scenario: Check the options in Help screen from NLID
    When user taps on More button in tab bar
    Then user navigates to Help screen
    When User click on the Esso App Feedback
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on More button alone
    And user navigates to Help screen
    Then validate the Call text as Speak to a customer representative and Normal call rates apply.
    When User click on the call link
    Then verify if user click on call its navigating to dial pad screen
    When User click on the Frequently asked Question link
    Then Validate the header of Frequently asked Question title "Frequently Asked Questions"
    And Validate all the Frequently Asked Question Header
      | How the app works |
      | Payments & Billing |
      | Safety and Security |
      | Loyalty Points |
      | Benefits of Using the Esso App |
      | Technical |
      | Communications & Data Privacy |
    When user tabs on back button
    Then User click on the Esso App Tutorial Link and verify next screens
    When User click on the get started button
    Then validate user on Help page
    And user verifies the Youtube links
    And user verifies the Version in the help screen
    And validate the Email title as Send us your questions or thoughts
    Given User click on the Email link
    Then validate the email page

  @P11270-22892 @Smoke_iOS11 @Smoke_Android
  Scenario: Check whether the user is able to use the filter icon for selecting the available services and facilities
    When user taps on Station Finder
#    Then the system navigates to the Esso Station Finder Screen
    When user verifies the location permission on tapping Station Finder
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen
    And Verify the app display icons next to all available services and facilities
    When taps on any of the services and facilities
    Then verify if a tick mark is displayed next to the selected services
    And verify the change in Apply Filter button
    When user clicks on Apply filter buttton
    Then the system navigates to the Esso Station Finder Screen

  @P11270-22909 @Smoke_iOS11 @Smoke_Android
  Scenario: Verify for guest user the updated URL to be displayed when user is tapping on FAQs link in more option
    And user taps on More button in tab bar
    Then user navigates to Help screen
    And User click on the Frequently asked Question link
    When tap on loyalty point links in FAQ
    Then tap on Will I still earn Nectar Points if I use the app
    And tap on FAQ hyperlink in nectar card description

  @P11270-22885 @Smoke_iOS11 @Smoke_Android
  Scenario: Check whether the Ascii characters are accepted in the Manual Registration screen
    When user is on NLID screen
    When user taps on Register screen
    Then user enter the "AsciiCharacters32to61" in Registration fields and verify the values
    And user enter the "AsciiCharacters62to91" in Registration fields and verify the values
    And user enter the "AsciiCharacters92to121" in Registration fields and verify the values
    And user enter the "AsciiCharacters122to126" in Registration fields and verify the values

  @P11270-22886 @P11270-22887 @P11270-22894 @Smoke_iOS11 @Smoke_Android
  Scenario: Verify the contextual registration screen
    Given user is on NLID screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "praveenkumar.balasubramani+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on the continue button in registration screen
    And validate the OS Native password pop up
    When user clicks the Not now button
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Resend confirmation email link
    Then the system should display the confirmation popup
    And app to dismiss the popup when the user taps on OK button
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user verifies the thirty percent in indicator
    And user taps on 'Resend Email' link below the 'Open Inbox’ link
    And user verifies the confirmation pop up message
    Then user tap on OK button from the confirmation popup
    Then user verifies the circular indicator in the LID
    And user tap on the Start Fueling icon
    Then system should display verification pop up
    And user tap on ok button
    And user clicks on more icon
    Then user clicks on Account
    And user clicks a Add card in Account screen
    And Enter pin
    Then user verifies the popup and clicks on ok button
    And user enters the card details in Billing Screen except fingerprint checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    Then user verifies the success set Default payment popup
    And user verifies the account page
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


  @P11270-22888 @Smoke_iOS11 @Smoke_Android
  Scenario: Check whether the user is able to Save password for the registered user and validate the saved password getting displayed
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user tries to login back from the Account screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on the continue button in registration screen
    And validate the OS Native password pop up
    When user clicks the save password button
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps LogOut button in Account screen
    When user taps on Login button in NLID
    When user taps on email tab
    And user checks the suggestions on the keyboard
    And user clicks the mail suggestion from the keyboard
    Then user validates the password getting displayed

  @P11270-22904 @Smoke_iOS11 @Smoke_Android
  Scenario: Check the profile completion after adding Mobile, Email Preferences and Location Services
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user tries to login back from the Account screen
    When user is in login screen
   And I enter "smokecredentials1" in login details
    And user taps login button in login screen
    And user verifies the thirty percent in indicator
    And user taps on the complete profile
    And user taps on Add Mobile Number
    And user enters the mobile number
    Then user clicks done icon on the screen
    And user confirms the verification pop up
    And User taps on "CONTINUE" button in the mobile number added successfully screen
    Then user clicks on Completed Add Mobile number Icon
    And user verifies the Add Mobile Number confirmation pop up with message
    And user accepts the pop up message
    When user taps on the Email Preferences in Complete your profile screen
    And user verifies the Email Preferences screen
    And user taps on the accept email preferences
    And User taps on Continue button in the email preferences screen
    Then user verifies whether the email preferences task is completed
    And User taps on Continue button in the email preferences set successfully screen
    Then user taps on location services and confirm whether it is completed

  @P11270-22902 @Smoke_iOS11 @Smoke_Android
  Scenario:Check the profile completion content and complete MFA
    And user taps on the complete profile
    And user verifies the "Completes your profile" screen
    Then user verifies the completed Accept privacy and Terms task
    And user verifies the completed Set First Name and Last Name task
    And user verifies the completed Notifications task
    When user navigates to the top of the screen in Complete your profile screen
    Then user taps on maximum fueling amount
    Then user clicks on Set Maximum Amount button
    And user sets the fueling amount and clicks ok button
    And user clicks on continue button in maximum fueling screen
    Then user verifies the progress bar in the Complete your Profile screen
    Then user verifies "Maximum Fueling Amount" task is completed
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen
    Then user verifies Email settings in the Complete your profile screen
    Then user verifies Payment and Loyalty in the Complete your profile screen

  @P11270-22903 @Smoke_iOS11 @Smoke_Android
  Scenario: Check the profile completion after adding payment, Nectar and MFA
    And user clicks on more icon
    Then user clicks on Account
    And user clicks a Add card in Account screen
    And Enter pin
    Then user verifies the popup and clicks on ok button
    And user enters the card details in Billing Screen except fingerprint checkbox
    Then user clicks on continue button in Card screen
    Then user verifies the success set Default payment popup
    And user verifies the account page
    Then user should verify the card last four digit
    Then user clicks on Add nectar card
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    And user verifies the account page
    And user navigated to NLID Screen
    And user taps on the complete profile
    Then user taps on add payment method
    Then user verifies the task whether the task is completed
    Then user verifies whether the task is completed
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button

  @P11270-22891 @Smoke_iOS1 @Smoke_Android
  Scenario: Check whether the user is able to navigate to the Station details screen from LID
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    Then verify whether the system displays Search button as a part of keyboard
    When user enters search term in station finder
    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    When user clicks on Save Station button
    Then verify if the Station is saved
    When user clicks on the Saved Station
    Then verify if the Station is unsaved
    When user taps on back button in Station Details screen
    Then the system navigates to the Esso Finder Screen

  @P11270-22899 @Smoke_iOS1 @Smoke_Android
  Scenario: Offers - Newly added and verify the Nectar card
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    And validate the offers screen before adding the nectar card
    When user taps on 'More about collecting points'link in the offers screen
    Then validate the popup which displays 'How to collect points' in detail and close the popup
    When user taps on 'Get Exclusive offers' in the offers screen
    Then enter nectar card value and tap on next button
    When user clicks on Verify Later button under 'Card Added successfully' alert
    Then user lands on Verify Card Screen and taps on skip button
    And verify if the user is navigated to Verify Offers screen
    When user taps on Verify Nectar card button in the 'Verify Offers' Screen
    And click the continue button under 'verify your card' alert
    Then user is navigated to Verify nectar screen
    When user enters valid nectar details in verify nectar screen
    Then validate offers displayed in offer screen
    And validate nectar card number and point balance in offers screen

  @P11270-22900 @P11270-22895 @Smoke_iOS1 @Smoke_Android
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link after adding Nectar card from Transaction complete Screen
    And user taps on More button in tab bar
    And user navigates to Account screen
    Then delete added nectar card if exists
    When user taps on fuel icon
    Then user lands on LID screen after successful Login
    And user taps on start button in LID
    And user is navigated to Select your pump screen
    When user taps on the payment method link
    Then verify if the user lands on Payment Details Screen
    When user selects the frictionless flow card and tap on update button
    And user is navigated to Select your pump screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate add nectar card button displayed in transaction complete screen
    And tap on the Add Nectar Card button in Transaction complete Screen
    And verify the Add nectar card screen
    Then tap on Add now button in Add Nectar Card Screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Transaction Complete Screen
    And user lands on Verify Card Screen and taps on skip button
    Then verify if the user is in the Transaction Complete Screen with the context to verify the nectar card
    When Tap on Transaction Details link in Transaction Complete Screen
    Then  Verify all the fields are present in Transaction Details screen
    When user tap on back button in the transaction Details screen
    Then verify if the user is in the Transaction Complete Screen
    When user taps on done button after finishing fuelling
    And Verify if the thank you screen is displayed
    When user kill and relaunch the app
    And close the modal popup
    When user taps on Offers
    Then verify if the user is navigated to Verify Offers screen

  @P11270-22901 @Smoke_iOS1 @Smoke_Android
  Scenario: Offers - Verify the nectar card
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    And validate the offers screen before adding the nectar card
    And user check whether find more about nectar link is available in the offers details screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    When user taps on the next button in 'Add Nectar Card' screen without entering the nectar card
    Then user verifies the inline error message for empty nectar card number field
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen

  @P11270-22893 @Smoke_iOS1 @Smoke_Android
  Scenario: Check whether the user navigates to Add Payment Method screen with a pop up saying'Card added successfully' as per current functionality
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
    And tap on ok button for default method if displayed

  @Smoke_iOS1 @Smoke_Android @P11270-22898 @Smoke_iOS1 @Smoke_Android
  Scenario: Complete the Fuelling transaction with paypal and verify the Transaction Details screen
    And user taps on fuel icon and start fuelling button
    And user taps on "CONTINUE" button in Allow Location screen
    Then verify the Select Your Pump Screen
    #Then user select the PayPal in payment screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    When user taps on "Pay with Paypal" button from confirm payment screen
#    And user taps on continue button
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed
    And Now fuelling displayed
    And user verify the Transaction Complete screen
    When user taps on Transaction Details Link in the Transaction Complete Screen
    Then user verify the Transaction Details screen
    And validate the details in the Transaction Details screen
    When user tap on back button in the transaction Details screen
    Then verify if the user is navigated to the Transaction Complete Screen
    Then user tap done in the Transaction Complete screen
    Then user verifies is Navigated to Thank you Screen
    Then user verifies the Thank you screen

  @P11270-22905 @Smoke_iOS1 @Smoke_Android
  Scenario: Verify the updated password rules
    And user clicks on more icon
    Then user clicks on Account
    When user taps on edit usr pwd
    And Verify the change password screen
    And user enters New Password
    Then user verifies the updated password rules

  @Smoke_iOS1 @Smoke_paypal_masked_email @Smoke_Android
  Scenario: Verify the paypal email id is masked
    And user clicks on more icon
    Then user clicks on Account
    Then user verifies paypal email id with masked

  @P11270-22908 @Smoke_iOS1 @Smoke_Android
  Scenario: Navigating to the Help Page and verifying all the components after login
    And user taps on More button in tab bar
    And user taps on Help icon
    Then validate the Help page options

  @P11270-22907 @Smoke_iOS1 @Smoke_Android
  Scenario: Check whether System to display tab bar only in landing screen of following features
    Then verify the Tab bar at the bottom of App UI screen
    And user navigates to Fuel Finder screen and Verify
    And verify the Tab bar at the bottom of App UI screen
    And user taps on More button alone
    Then user verifies whether landed on the Extended Tab bar
    And verify the Tab bar at the bottom of App UI screen
    When user taps on Tell a Friend
    Then verify the Tab bar at the bottom of App UI screen
    And verify system navigating to Refer a Friend screen
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information
    And user verifies the back button in the top left corner
    And verify the Tab bar at the bottom of App UI screen
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Account screen
    Then user verifies the back button in the top left corner
    And verify the Tab bar at the bottom of App UI screen
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Help screen
    Then verify the Tab bar at the bottom of App UI screen
    And user verifies the back button in the top left corner
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar

  @P11270-22910 @Smoke_iOS1 @Smoke_Android
  Scenario: To verify that system to display a prompt, when user has given feedback or blank feedback
    And user taps on More button in tab bar
    Then user navigates to Help screen
    When User click on the Esso App Feedback
    And User taps on Give Us more feedback
    And user give stars for First Statement
    And user give stars for Second Statement
    And user give stars for Third Statement
    And user give stars for Fourth Statement
    And click on the SEND FEEDBACK button
    Then verify the prompt message as "Thanks for your feedback."
    When Tap on OK button
    Then verify promt id getting closed and user navigated back to Help Screen

  @P11270-22911 @Smoke_iOS1 @Smoke_Android
  Scenario: Verify History screen shows list of fuelling transactions
    And user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    When user taps on any of the Transaction infos from list
    Then user should navigate to transaction details screen

  @P11270-22906 @Smoke_iOS1 @Smoke_Android
  Scenario: Validate the FAQ screen when the user is logged in
    And user taps on More button in tab bar
    And user taps on Help icon
    And User click on the Frequently asked Question link
    Then Validate the header of Frequently asked Question title "Frequently Asked Questions"
    And Validate all the Frequently Asked Question Header
      | How the app works |
      | Payments & Billing |
      | Safety and Security |
      | Loyalty Points |
      | Benefits of Using the Esso App |
      | Technical |
      | Communications & Data Privacy |
    When user tabs on back button
    Then validate the Help page options

  @P11270-22897 @Smoke_iOS1 @Smoke_Android
  Scenario: Verify whether the user is navigated to NLID when Forgot Password is tapped during fuelling flow
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

  @P11270-22896 @Smoke_iOS1 @Smoke_Android
  Scenario: Check whether the System displays the CT msg  when user taps on the Edit Link in the Payment method section and also Validate the Forgot password Link when user enters a wrong password
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user tries to login back from the Account screen
    When user is in login screen
    And I enter "smokecredentials1" in login details
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

  @P11270-22889 @Smoke_iOS1 @Smoke_Android
  Scenario: Check whether the user is able perform fuelling with 3DS passphrase Card and User should be navigate to Thank you screen after tapping on send my receipts button
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user tries to login back from the Account screen
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
    Then Click on Add Debit or Credit Card
    And verify elements displayed in Add Card Screen
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

  @P11270-22890 @Smoke_iOS1 @Smoke_Android
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
#    Then Click on Add Debit or Credit Card
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