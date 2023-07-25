@Account
Feature: Account

  Background:
    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "smokecredentials2" in login details
#    And user taps login button in login screen
    When I enter SSO login details for "LinkedInOffer1"
    And user taps on More button in tab bar
    When user navigates to Account screen

#  During Login below TC fails in iOS due to the defect - P11270-18189
  @P11270-13105 @P11270-13107 @IosRegression @AndroidRegression
  Scenario: Check whether system to display Nectar card and Delete the card
    Then user verifies the Nectar card section
