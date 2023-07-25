@NonLoggedInDashboard
Feature: NonLoggedInDashboard

  @P11270-4813 @AndroidRegression @IosRegression @Regression1
  Scenario: Check whether System navigate user to manual registration form
    Given user is on NLID screen
    And user taps on Register screen
    Then Verify the Registration screen

  @P11270-4814 @P11270-4816 @P11270-4818 @P11270-4819 @AndroidRegression @IosRegression @Regression1
  Scenario: Check whether System navigates user to login page
    Given user is on NLID screen
    And user taps on Login button in NLID
    And User taps on Login button in Login screen without entering the values
    Then Verify the inline error message during login
    And Enter valid mail and tap done
    Then Verify the inline error message for password
    And Enter the wrong password and tap login
    Then Verify the popup content

  @P11270-4817 @P11270-4820 @P11270-4821 @AndroidRegression @IosRegression @Regression1
  Scenario: Check whether System navigates user to send link
    Given user is on NLID screen
    Then user taps on Login button in NLID
    And user taps on Forgot password link in login screen in NLID
    And user enters invalid email id
    And user taps on send button in Forgot Password Screen
    Then Verify the inability to send the mail
    And user taps on Cancel in the Login Screen
    And user taps on Forgot password link in login screen in NLID
    And User enters valid email id and taps send button
    Then Verify the mail is sent

  @P11270-4815 @AndroidRegression @IosRegression @Regression1
  Scenario: Check whether System navigates user to send link
    Given user is on NLID screen
    And user taps on Twitter icon in the NLID
    Then user verifies whether the app navigated to Twitter login screen
    And user navigates back to NLID from Twitter
    And user taps on Facebook icon in the NLID
    Then user verifies whether the app navigated to Facebook login screen
    And user navigates back to NLID from Facebook
    And user taps on Linkedin icon in the NLID
    Then user verifies whether the app navigated to Linkedin login screen
    And user navigates back to NLID from Linkedin

  @P11270-4822 @AndroidRegression
  Scenario: Check Whether System is able to navigate login screen using device back button
    Given user is on NLID screen
    And user taps on Login button in NLID
    And user taps on Forgot password link in login screen in NLID
    And user taps on Cancel in the Login Screen

  @P11270-13238 @P11270-13239 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether System is able to navigate login screen
    Given user is on NLID screen
    Then user verifies the login button in the NLID
    And user taps on Login button in NLID
#    When I enter "menuLoginVerify" in login details
    When  user enters "regressioncredentials1" in login details
    And user taps login button in login screen

  @P11270-16359 @AndroidRegression
  Scenario: Check Whether System displays the tutorial screen and clicks ok button in the Non logged in dashboard screen
    Given Install and launch the Esso app
    Then Verify the Cookie page elements
    And Click Accept all button in the cookie page
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    Then user navigates back to NLID screen