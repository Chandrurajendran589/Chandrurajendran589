@SSO
Feature: SSO

  Background:
    Given user is on NLID screen

  @P11270-15740 @AndroidRegression @SSO @Smoke_15740
  Scenario: Verify if SSO Linked in based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    When I enter SSO login details for "LinkedInOffer1"
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And tap on Edit pin from account screen
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then verify the user is navigated to the Account screen

  @P11270-15739 @AndroidRegression @SSO @Smoke_15739
  Scenario: Verify if SSO Twitter based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    Then user is on Twitter Login
    When I enter SSO login details for Twitter
    And user taps login button in Twitter login screen
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And tap on Edit pin from account screen
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then verify the user is navigated to the Account screen

  @P11270-15737 @AndroidRegression @SSO @Smoke_15737
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    Then user is on Facebook Login
    When I enter SSO login details for Facebook
    And user taps login button in Facebook login screen
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And tap on Edit pin from account screen
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then verify the user is navigated to the Account screen


  @P11270-15744 @AndroidRegression @SSO
  Scenario: Verify if SSO Linked In based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    Then user is in Linked in Login
    When I enter SSO login details for "LinkedIn"
    And user taps login button in SSO login screen
    Then verify user is on LID Screen
    When user taps on fuel icon and start fuelling button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    And user enter the confirms the payment button
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button

  @P11270-15743 @AndroidRegression @SSO
  Scenario: Verify if SSO Twitter based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    Then user is on Twitter Login
    When I enter SSO login details for Twitter
    And user taps login button in Twitter login screen
    Then verify user is on LID Screen
    When user taps on fuel icon and start fuelling button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    And user enter the confirms the payment button
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button

  @P11270-15741 @AndroidRegression @SSO
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    Then user is on Facebook Login
    When I enter SSO login details for Facebook
    And user taps login button in Facebook login screen
    Then verify user is on LID Screen
    When user taps on fuel icon and start fuelling button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    And user enter the confirms the payment button
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button


  @P11270-SSO1
  Scenario: Verify the all SSO logins are working fine
    Given user is on NLID Screen
    When user taps on Facebook icon in NLID
    Then user is on Facebook Login Screen
    When I enter SSO login details for Facebook
    And user taps login button in Facebook login screen
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    When user taps on logout button
    Then user is navigated to NLID Screen
    When user taps on Twitter icon in the NLID
    Then user is on Twitter Login screen
    When I enter SSO login details for Twitter
    And user taps login button in Twitter login screen
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    When user taps on logout button
    Then user is navigated to NLID Screen
    When user taps on Linkedin icon in the NLID
    Then user is on Linkedin Login screen
    When I enter SSO login details for Linkedin
    And user taps login button in Linkedin login screen
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    When user taps on logout button
    Then user is navigated to NLID Screen

  @P11270-SSO2
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from Account and Confirm Payment Screen
    Then user is on Facebook Login
    When I enter SSO login details for Facebook
    And user taps login button in Facebook login screen
    Then verify user is on LID Screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And tap on Edit pin from account screen
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then verify the user is navigated to the Account screen
    When user taps on fuel icon and start fuelling button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    And Tap on Confirm Button
    And user enter the confirms the payment button
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button

  @P11270-SSO3
  Scenario: Check whether System to display tab bar only in landing screen of following features For SSO Login
    Given user is on NLID screen
    Then verify the Tab bar at the bottom of App UI screen
    When user taps on Twitter icon in the NLID
    Then user is on Twitter Login screen
    When I enter SSO login details for Twitter
    And user taps login button in Twitter login screen
    Then verify user is on LID Screen
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
    When user navigates to Account screen
    And Verify all the sections in the account screen
    Then verify the Tab bar at the bottom of App UI screen
    Then user tabs on back button
    When user navigates to Help screen
    Then verify the Tab bar at the bottom of App UI screen
    Then user tabs on back button


  @P11270-SSO4
  Scenario: To verify that system to display a prompt, when user has given feedback or blank feedback For SSO Login.
    Given user is on NLID screen
    When user taps on Linkedin icon in the NLID
    Then user is on Linkedin Login screen
    When I enter SSO login details for Linkedin
    And user taps login button in Linkedin login screen
    Then verify user is on LID Screen
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

  @P11270-SSO5
  Scenario: check whethe user is able to complete the fuelling transaction using SSO Login with Challengeflow passphrase card
    When user taps on login with facebook
    And the user enters the login details for "facebook"
    And user taps on the login button in the facebook login
    Then user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
    When user lands on Modirum screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then verify user navigates to Transaction Complete screen
    And Click on done button in transaction complete screen
    Then Verify the thank you screen should be displayed



