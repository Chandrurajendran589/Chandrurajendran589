@RedemptionOption
Feature:RedemptionOption

  Background:
    Given user is on NLID screen

  @P11270-15633 @AndroidRegression @IosRegression
  Scenario: Check whether the icons of all app supported credit cards are displayed on Add Payment Method screen. Current supported cards are Visa, Mastercard
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Start fuelling button
    Then Click on Continue button in Select pump screen
    And Click on reward Edit button in Payment confirmation screen
    Then Verify the Message is displayed
    And Click Ok button on Redemption Popup

