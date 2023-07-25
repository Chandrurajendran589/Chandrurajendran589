@Help
Feature: Help

  Background: 
    Given user is on NLID screen

  @P11270-13098 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether system displays the Get started icon on third tutorial screens
    Then user is in login screen
    When I enter "regressioncredentials1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user taps on Help icon
    And user taps on Tutorial button in Help screen
    And user taps on next button in the Tutorial screen one of the Help screen
    And user taps on next button in the Tutorial screen two of the Help screen
    And user taps on Get started button in the Help screen
    Then user lands on Help screen in NLID

  @P11270-13101 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether system verifies the third tutorial screen
    Then user is in login screen
    When I enter "regressioncredentials1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user taps on Help icon
    And user taps on Tutorial button in Help screen
    And user taps on next button in the Tutorial screen one of the Help screen
    And user taps on next button in the Tutorial screen two of the Help screen
    Then user verifies the third screen

  @P11270-13103 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether system system verifies the second tutorial screen
    Then user is in login screen
    When I enter "regressioncredentials1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user taps on Help icon
    And user taps on Tutorial button in Help screen
    And user taps on next button in the Tutorial screen one of the Help screen
    Then user verifies the second screen

  @P11270-13104 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether system displays the Get started icon on third tutorial screens
    Then user is in login screen
    When I enter "regressioncredentials1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user taps on Help icon
    And user taps on Tutorial button in Help screen
    Then user verifies the first screen
    And user taps on next button in the Tutorial screen one of the Help screen
    Then user verifies the second screen
    And user taps on next button in the Tutorial screen two of the Help screen
    Then user verifies the third screen
    And user taps on Get started button in the Help screen
    Then user lands on Help screen in NLID

  @P11270-13108 @AndroidRegression @IosRegression @Regression1
  Scenario: Check Whether the system able to Add nectar card
    Then user is in login screen
    When I enter "regressioncredentials1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And navigate to the Nectar card section
    And Delete the Nectar card if it is present
    And Add the Nectar card
    Then Verify the nectar card section in the Account screen

  @P11270-13254 @AndroidRegression
  Scenario: Verify for login user the updated URL to be displayed when user is tapping on FAQs link in more option
    Then user is in login screen
    When I enter "regressioncredentials1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user navigates to Help screen
    When User click on the Esso App Feedback

  @P11270-13253 @AndroidRegression
  Scenario: Verify for guest user the updated URL to be displayed when user is tapping on FAQs link in more option
    And user navigates to Help screen
    When User click on the Esso App Feedback
