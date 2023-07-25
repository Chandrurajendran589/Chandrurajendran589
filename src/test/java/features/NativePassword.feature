@NativePassword
Feature: NativePassword

  Background: 
    Given user is on NLID screen

  @P11270-12651 @AndroidRegression
  Scenario: Check whether the user is able to see the save password prompt while logging in with unsaved login credentials
    Then user is in login screen
    When I enter "menu" in login details
    Then user taps login button in NLID
    And validate the OS Native password pop up

  @P11270-12655  @AndroidRegression @IosRegression
  Scenario: Check whether the user is able to Save password for the registered user (Android Specific)
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravanan.murugan+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen

  @P11270-15927 @P11270-12659 @P11270-15838 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is able to see the save password prompt while logging in with unsaved login credentials
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravanan.murugan+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    Then click on continue button from NLID
    And validate the OS Native password pop up

  @P11270-15839 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is able to Save password for the registered user
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


  @P11270-15840 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is not able to Save password for the registered user
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
    When user clicks the Not now button
    Then App should navigates to Confirm your email address screen

  @P11270-15841 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is able to view the saved email address on the keyboard
    When user taps on Login button in NLID
    When user taps on email tab
    And user checks the suggestions on the keyboard
    And user clicks the mail suggestion from the keyboard
    Then user validates the password getting displayed

  @P11270-15842 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is not seen the password for the email id which was deleted already
    When user taps on Login button in NLID
    When user taps on email tab
    Then enter "sujitha+" Email address
    Then user validates the password not getting displayed

  @P11270-15843 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is able to see the save password prompt while logging in with unsaved login credentials
    Then user is in login screen
    When user enter "saravanan+" in login details
    Then user taps login button in NLID
    And validate the OS Native password pop up

  @P11270-15844 @AndroidRegression @IosRegression @NATIVEPASSWORD
  Scenario: Check whether the user is able to Save password for the registered user
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "saravanan.murugan+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on the continue button in registration screen
    And validate the OS Native password pop up
    When user clicks the Not now button
    Then App should navigates to Confirm your email address screen


