@ContextualRegistration
Feature: Contextual Registration

  Background: 
    Given user is on NLID screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "praveenkumar.balasubramani+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen

#  The TCS in this feature fails in iOS due to the defect P11270-18273
  @P11270-11578 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user able view the list of email client installed on the user�s device
    Then App should navigates to Confirm your email address screen

  @P11270-11607 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user able to dismiss the pop-up with the list of available email client installed on the device
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    Then user tap on open inbox
    And see the list of apps installed in device
    Then tap on cancel button from email apps
    And App should navigates to Confirm your email address screen

  @P11270-11616 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user able to view the following details on the 'Confirm your email address' screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen

  @P11270-11645 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user able to view the email resend confirmation pop-up
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Resend confirmation email link
    Then the system should display the confirmation popup
    And app to dismiss the popup when the user taps on OK button

  @P11270-11651 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user able to skip the 'Confirm your email address' screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-11657 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user able to dismiss the 'Skip confirmation' pop-up and display the pop-up with the list of email client
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on verify email
    And see the list of apps installed in device
    Then tap on cancel button from email apps

  @P11270-11666 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the Manual register user should not able to view the �Add Payment Method' and �Maximum Fuelling Amount� �screens as part of the registration flow
    Then App should not navigate user to add payment method or maximum fueling screen

  @P11270-11872 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the while App relaunch form the 'Confirm your email address' screen
    Then App should navigates to Confirm your email address screen
    When user minimize and relaunch the app
    Then App should navigates to Confirm your email address screen

  @P11270-11907 @AndroidRegression @IosRegression @Regression1
  Scenario: Verify the while App kill and relaunch form the 'Confirm your email address' screen and navigate to LID 
    Then App should navigates to Confirm your email address screen
    When user kill and relaunch the app
    Then app to dismiss the popup and navigate the user to LID after review