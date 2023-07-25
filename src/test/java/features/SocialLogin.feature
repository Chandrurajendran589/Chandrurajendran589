@SocialLogin
Feature:Social Login

  Background:
    Given user is on NLID screen

  @P11270-15737 @iOSRegresssion
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    When user taps on login with facebook
    And the user enters the login details for "facebook"
    And user taps on the login button in the facebook login
    And user taps on terms and conditions checkboxes
    And user taps on "ACCEPT" button
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user click on the edit esso link
    And user taps on forgot password in PIN
    Then user validates the Forgot PIN screen
    When user clicks on send button in Forget password Screen
    Then user verifies the popup for the forgot PIN
    And user clicks ok icon in the pop up
    Then user navigates to Account screen

  @P11270-15739 @iOSRegresssion
  Scenario: Verify if SSO twitter based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    When user logs in with twitter
    And user enters the login details for "twitter"
    And user taps twitter login button
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user click on the edit esso link
    And user taps on forgot password in PIN
    Then user validates the Forgot PIN screen
    When user clicks on send button in Forget password Screen
    Then user verifies the popup for the forgot PIN
    And user clicks ok icon in the pop up
    Then user navigates to Account screen

  @P11270-15740 @iOSRegresssion
  Scenario: Verify if SSO Linked in based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    When user taps on Linkedin icon in the NLID
    And  I enter SSO in login details for "LinkedIn"
    And user taps login button in SSO login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user click on the edit esso link
    And user taps on forgot password in PIN
    Then user validates the Forgot PIN screen
    When user clicks on send button in Forget password Screen
    Then user verifies the popup for the forgot PIN
    And user clicks ok icon in the pop up
    Then user navigates to Account screen

  @P11270-15741 @iOSRegresssion
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    When user taps on login with facebook
    And the user enters the login details for "facebook"
    And user taps on the login button in the facebook login
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    And user taps on forgot password in PIN
    Then user validates the Forgot PIN screen
    When user clicks on send button in Forget password Screen
    Then user verifies the popup for the forgot PIN
    And user clicks ok icon in the pop up
    Then user navigates to Account screen

  @P11270-15743 @iOSRegresssion
  Scenario: Verify if SSO Twitter based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    When user logs in with twitter
    And user enters the login details for "twitter"
    And user taps twitter login button
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    And user taps on forgot password in PIN
    Then user validates the Forgot PIN screen
    When user clicks on send button in Forget password Screen
    Then user verifies the popup for the forgot PIN
    And user clicks ok icon in the pop up
    Then user navigates to Account screen

  @P11270-15744 @iOSRegresssion
  Scenario: Verify if SSO Linked In based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    When user taps on Linkedin icon in the NLID
    And  I enter SSO in login details for "LinkedIn"
    And user taps login button in SSO login screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    And user taps on forgot password in PIN
    Then user validates the Forgot PIN screen
    When user clicks on send button in Forget password Screen
    Then user verifies the popup for the forgot PIN
    And user clicks ok icon in the pop up
    Then user navigates to Account screen
