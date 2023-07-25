@ProfileCompletion

Feature: ProfileCompletion

  Background:
    Given user is on NLID screen

  @P11270-11951 @AndroidRegression @IosRegression @ProfileCompletion2
  Scenario: Check Whether the system displays email resend confirmation pop-up

    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on 'Resend Email' link below the 'Open Inbox’ link
    And user verifies the confirmation pop up message
    Then user tap on OK button from the confirmation popup
    Then user verifies the circular indicator in the LID

  @P11270-11952 @AndroidRegression @IosRegression @ProfileCompletion2
  Scenario: Check Whether system resends the verification email
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on 'Resend Email' link below the 'Open Inbox’ link
    And user verifies the confirmation pop up message

  @P11270-11954 @AndroidRegression @IosRegression @ProfileCompletion2
  Scenario:Check Whether System verifies the Start Fueling pop up
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
    And user tap on the Start Fueling icon
    Then system should display verification pop up
    And user tap on ok button

  @P11270-11966 @AndroidRegression @IosRegression @ProfileCompletion5
  Scenario: Check Whether the system displays "Complete your profile" Screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    And user verifies the "Completes your profile" screen
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen
    Then user verifies Email settings in the Complete your profile screen
    Then user verifies Payment and Loyalty in the Complete your profile screen

  @P11270-11967 @AndroidRegression @IosRegression @ProfileCompletion2
  Scenario: Check Whether system completes any task on the complete profile list
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    And user taps on Add Mobile Number
    And user enters the mobile number
    Then user clicks done icon on the screen
    And user confirms the verification pop up

  @P11270-11969 @AndroidRegression @IosRegression @ProfileCompletion5
  Scenario: Check Whether System not displays the tick mark on not completed task in list
    When user clicks on Login Icon
    And I enter "regressioncredentials2" in login details
#    Then user enters the valid credentials with card added
    And user taps login button in login screen
    And user taps on the complete profile
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen
    Then user verifies Email settings in the Complete your profile screen
    Then user verifies Payment and Loyalty in the Complete your profile screen
    When user verify without tick mark on the task

  @P11270-11971 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether System displays the Already completed pop up by clicking the completed task in list
    When user clicks on Login Icon
    And I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    And user taps on the complete profile
    Then user clicks on Completed Add Mobile number Icon
    And user verifies the Add Mobile Number confirmation pop up with message
    And user accepts the pop up message

  @P11270-11981 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether the system displays thirty percent on circular indicator
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user verifies the thirty percent in indicator

  @P11270-11982 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether System shows tick mark for default apps completed while registration
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    Then user verifies the completed Accept privacy and Terms task
    And user verifies the completed Set First Name and Last Name task
    And user verifies the completed Notifications task

#     This TC fails in iOS due to Payment card addition issue - P11270-20979
  @P11270-11999 @P11270-12004 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether system completes the Add Payment in Account Screen and navigates back
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user clicks on more icon
    Then user clicks on Account
    And user clicks a Add card in Account screen
    And  user sets the pin number from Account screen
    Then user clicks on continue in Edit button
    Then user clicks on ok button in esso pin successful
    And user enters the card details in Billing Screen except fingerprint checkbox
    Then user clicks on continue button in Card screen
    Then user verifies the completed popup message for card added
    And user clicks on ok button in card added message
#     Then user verifies the success messgae and clicks on Continue
    And user verifies the account page
    Then user clicks on edit in the added payment method
    Then user taps delete in the Edit Payment Method screen
    Then user taps on delete button in the Delete popup msg
    Then app to dismiss the popup when the user taps on OK button
    And user verifies the account page
    And user navigated to NLID Screen
    And user taps on the complete profile
    Then user taps on add payment method
    Then user verifies whether the task is completed

  @P11270-12011 @AndroidRegression @IosRegression @ProfileCompletion5 @Regression1
  Scenario: Check Whether system skips the Nectar verification and navigates back to Account screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user clicks on more icon
    Then user clicks on Account
    Then user clicks on Add nectar card button
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    And user verifies the account page

  @P11270-12014 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether system continues the Nectar verification and navigates back to Offer Screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user clicks on offer icon
    Then user clicks Add Nectar Card from offer screen
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    And user verifies the offer page

  @P11270-12015 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether system completes "Add Nectar" task also circular indicator is increased to ten percent
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#     Then app to dismiss the popup and navigate the user to LID after review
    And user verifies the thirty percent in indicator
    And user taps on the complete profile
    Then user clicks on Add nectar
    And user clicks on the get started icon
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button
    Then user verifies the progress in the LID

  @P11270-12017 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether the system completes "Add Nectar" task
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#   Then app to dismiss the popup and navigate the user to LID after review
    And user verifies the thirty percent in indicator
    And user taps on the complete profile
    Then user clicks on Add nectar
    And user clicks on the get started icon
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button

  @P11270-12035 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether system marks "Maximum Fueling Amount" as completed
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#   Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    And user verifies the "Completes your profile" screen
    Then user taps on maximum fueling amount
    Then user clicks on Set Maximum Amount button
    And user sets the fueling amount and clicks ok button
    And user clicks on continue button in maximum fueling screen
    Then user verifies the progress bar in the Complete your Profile screen
    Then user verifies "Maximum Fueling Amount" task is completed

  @P11270-12082 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether System does not displays the circular indicator
    When user clicks on Login Icon
    When  user enters "regressioncredentials3" in login details
    And user taps login button in login screen
    Then user verifies the circular indicator in the LID

  @P11270-12085 @P11270-11959 @AndroidRegression @IosRegression @ProfileCompletion2 @Regression1
  Scenario: Check Whether System displays the nectar points
    When user clicks on Login Icon
    When  user enters "regressioncredentials3" in login details
    And user taps login button in login screen
    Then user verifies the circular indicator in the LID
    Then user verifies the nectar points in dashboard
    Then user verifies the nectar thumbnails in the LID