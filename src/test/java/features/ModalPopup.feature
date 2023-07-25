@ModalPopup
Feature:ModalPopup

  Background:
    Given user is on NLID screen

  @P11270-15770 @AndroidRegression @IosRegression
  Scenario: Verify the system should allow the user to view the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Verify the Title of the Modal popup
    Then Verify the View details is button displayed
    And Verify Close icon is displayed on modal popup screen

  @P11270-15771 @AndroidRegression @IosRegression
  Scenario: Verify the system should allow the user to close the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Search the Station in the Search box
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Click on Close button in Modal popup

  @P11270-15772 @AndroidRegression @IosRegression
  Scenario: Verify the system should allow the user to view the offers in the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Click on View button on popup window
    Then Verify the terms and Conditions link
    And Verify the Load to Card button should display
    And Verify the Close icon is displayed on popup screen

  @P11270-15773 @AndroidRegression @IosRegression
  Scenario: Verify the system should view the TC in the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Click on View button on popup window
    And Click on the Close button in terms and condition page

  @P11270-15774 @AndroidRegression @IosRegression
  Scenario: Verify the system should allow the user to load the offers in the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Search the Station in the Search box
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Click on View button on popup window
    And Click on Load to Card button
    Then Click on Close button
    And Click on Back button
    Then Click on fuel tab
    And Verify that tick mark is displayed on the offers


  @P11270-15775 @AndroidRegression @IosRegression
  Scenario: Verify the system should view the TC in the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Search the Station in the Search box
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Click on View button on popup window
    Then Click on the Terms and Condition link on the popup
    And Click on the Close button

  @P11270-15776 @AndroidRegression @IosRegression
  Scenario: Verify the system should close the TC in the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Click on View button on popup window
    Then Click on the Terms and Condition link on the popup
    And Click on the Close button

  @P11270-15777 @AndroidRegression @IosRegression
  Scenario: Verify the system should not see the used offers in the modal pop-up
    Given click on the login link in present in dashboard
    When Enter the UserName
    And Enter the Password
    Then Click on logIn button
    And Click on Stations tab
    Then Click on ListStations
    And Click on the First station displayed in the list
    And Verify that User offer popup should not displayed



