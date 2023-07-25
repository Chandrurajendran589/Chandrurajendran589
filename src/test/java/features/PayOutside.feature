@PayOutside
Feature: PayOutside

  Background: 
    Given reset the app
    And Click Accept all button in the cookie page
    Given user is on NLID screen


  @P11270-10102 @AndroidRegression @IosRegression @PayOutside1
  Scenario: Verify whether the system is able to send the transaction receipt when check-box for receipt preference is selected by the user
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
    When user taps on More button in tab bar
    And user navigates to Account screen
    Then user should opt for receipts by email checkbox
    And user should validate the receipt checkbox copy text
    When the system displays the confirmation popup
    Then tap on ok button and close receipt checkbox copy text
    When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user taps on done button after finishing fuelling

  @P11270-10103 @AndroidRegression @IosRegression @PayOutside1
  Scenario: Verify whether the system is unable to send the transaction receipt when check-box for receipt preference is not selected by the user
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
   When user taps on More button in tab bar
    And user navigates to Account screen
    Then user should opt out for receipts by email checkbox
    Then user should validate the receipt checkbox copy text for not opting to receive emails
    When the system displays the confirmation popup for not receiving mails
    Then tap on ok button and close receipt checkbox copy text
    When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user taps on done button after finishing fuelling

  @P11270-10123 @AndroidRegression @IosRegression
  Scenario: Verify whether the system displays the copy text msg
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    Then user should opt out for receipts by email checkbox
    Then user should validate the receipt checkbox copy text for not opting to receive emails
    When the system displays the confirmation popup for not receiving mails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-10104 @AndroidRegression @IosRegression @PayOutside1
  Scenario: Verify whether the system is able to make service call and display authorization screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then the system should display the authorization screen
    Then user taps on done button after finishing fuelling

  @P11270-10105 @AndroidRegression @IosRegression @PayOutside1
  Scenario: Verify whether the system is able to display loader while authorization is in progress
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then the system should display the loader when authorization is in progress

  @P11270-10106 @AndroidRegression
  Scenario: Verify whether the system is able to cancel the transaction when the user taps on cancel option
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then the system should display the authorization screen
    When user taps on cancel button in the 'Start fuelling now' page
    Then the system displays the cancellation popup
    And app to dismiss the popup when the user taps on OK button
    And system cancels the transaction and returns to the 'Confirm Payment' Screen

  @P11270-10107 @AndroidRegression @PayOutside1
  Scenario: Verify whether the user is able to see the following elements on the Transaction summary screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then the system should display the authorization screen
    Then user checks the details in the transaction summary screen

  @P11270-10109 @AndroidRegression @PayOutside1
  Scenario: Verify whether the user is able to see the view link in Transaction Details screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then the system should display the authorization screen
    When user checks the Transaction Details in the transaction summary screen
    Then the system displays the view link for receipt

  @P11270-10108 @AndroidRegression @PayOutside1
  Scenario: Verify whether the user is able to view the receipt after clicking view in Transaction Details screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then the system should display the authorization screen
    When user checks the Transaction Details in the transaction summary screen
    And the user should view the receipt after clicking view in Transaction Details screen

  @P11270-13109 @AndroidRegression @IosRegression @PayOutside1
  Scenario: Verify whether the user is able to see the help screen and alignment
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    Then user navigates to Help screen
    And system should display the tutorial screen
    Then user verifies the first screen
    And user taps on next button in the Tutorial screen one of the Help screen
    And user taps on next button in the Tutorial screen two of the Help screen
    Then user verifies the third screen

  @P11270-13190 @AndroidRegression @IosRegression @PayOutside1
  Scenario: Select your Pump Screen while PayOutside
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
   When user taps on fuel icon and start fuelling button
    And user verifies the Select your Pump Screen
    And user selects the pump from 'Select your Pump' page and taps on continue button

  @P11270-13110 @P11270-13114 @AndroidRegression @IosRegression @PayOut11
  Scenario: Add nectar card from Payment details screen after adding nectar card
   Then user is in login screen
    When I enter "menu1" in login details
    And user taps login button in login screen
   When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen
    When user taps on fuel icon and start fuelling button
    And user selects the payment method under 'Select your pump' page
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user tap on verify later
    Then user verify the payment details screen with Nectar card

  @P11270-13139 @AndroidRegression @iOSRegression @PayOut11
  Scenario: From LID add nectar card and verify the nectar card
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen

  @P11270-13140 @AndroidRegression @IosRegression @PayOut11
  Scenario: Add and verify nectar card from Payment details screen
    Then user is in login screen
    When I enter "menu1" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen
    When user taps on fuel icon and start fuelling button
    And user selects the payment method under 'Select your pump' page
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen

  @P11270-13141 @AndroidRegression @IosRegression @PayOut11
  Scenario: Complete the Fuelling transaction with Nectar card is verified and verify the Transaction complete screen
    Then user is in login screen
    When I enter "menu1" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen
    When user taps on fuel icon and start fuelling button
    And user verifies the Select your Pump Screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    And the system should display the loader when authorization is in progress
    Then user verify the Start fuelling now screen
    And user verify the Transaction Complete screen
    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    And user enters valid nectar details in verify nectar screen
    And user verify the Transaction Complete screen
    Then user tap done in the Transaction Complete screen

  @P11270-13142 @AndroidRegression @IosRegression @PayOut11
  Scenario: Complete the fuelling transaction without verifying nectar card and Verify the Transaction complete screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen
    And user adds a nectar card and taps verify later
    When user taps on fuel icon and start fuelling button
    And user verifies the Select your Pump Screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    And the system should display the loader when authorization is in progress
    Then user verify the Start fuelling now screen
    And user verify the Transaction Complete screen
    Then user verifies the Verify Nectar card link in the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verifies the Transaction Details screen from Transaction complete screen

  @P11270-13179 @P11270-13178 @AndroidRegression @IosRegression @PayOut11
  Scenario: Transaction Complete Screen Displays Verify your Nectar card to get exclusive Esso rewards when Card is not verified
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen
    And user adds a nectar card and taps verify later
    When user taps on fuel icon and start fuelling button
    And user verifies the Select your Pump Screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    And the system should display the loader when authorization is in progress
    Then user verify the Start fuelling now screen
    And user verify the Transaction Complete screen
    Then user verifies the Verify Nectar card link in the Transaction Complete screen

  @P11270-13180 @AndroidRegression @IosRegression @PayOut11
  Scenario: Complete the Fuelling transaction and verify the Transaction Details screen
   Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
   When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen

  @P11270-13181 @AndroidRegression @IosRegression @PayOut11
  Scenario: Transaction Complete Screen navigating to Add Nectar Card when card is not added
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on More button in tab bar
    And user navigates to Account screen
    And user validate and delete the nectar card in Account screen
    When user taps on fuel icon and start fuelling button
    And user verifies the Select your Pump Screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    And the system should display the loader when authorization is in progress
    Then user verify the Start fuelling now screen
    And user verify the Transaction Complete screen
    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
    Then user is navigated to add nectar screen

  @P11270-13182 @AndroidRegression @IosRegression @PayOut11
  Scenario: View "Transaction Details" Screen When Loyalty discounted for fuelling
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen
    Then user verify the Loyalty discounted for fuelling

  @P11270-13183 @AndroidRegression @IosRegression @PayOut11
  Scenario: View "Transaction Complete" Screen Points redemption applied for fuelling
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen
    Then user verify the Loyalty discounted for fuelling

  @P11270-13184 @AndroidRegression @IosRegression @PayOut11
  Scenario: Contextual Tips - Maximum fueling amount selection
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen
    Then user verify the Loyalty discounted for fuelling

  @P11270-13185 @AndroidRegression @IosRegression @PayOut11
  Scenario: Contextual Tips - Maximum fueling amount selection
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen
    Then user verify the Loyalty discounted for fuelling

  @P11270-13186 @AndroidRegression @IosRegression @PayOut11
  Scenario: Complete the fuelling transaction with Nectar card verified  and without selecting the redeem points
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
     And user selects the payment method under 'Select your pump' page
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen
    Then user verify the Loyalty discounted for fuelling

  @P11270-13187 @AndroidRegression @IosRegression @PayOut11
  Scenario: Redemption Offers - "Save on fuel with points "  offers Screen
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user verify the Authorising your payment screen
    Then user verify the Start fuelling now screen
    Then user verify the Transaction Complete screen
    And user taps on the Transaction Details screen
    Then user verify the Transaction Details screen
    Then user verify the Loyalty discounted for fuelling

  @P11270-13190 @AndroidRegression @IosRegression @PayOut11
  Scenario: Select your Pump Screen while Pay Out side
Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
   When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    And verify below are the elements
      | Maximum fueling amount: |
      | Change Payment Details  |

  @P11270-13192 @AndroidRegression @IosRegression
  Scenario: Sprint 2 Pay outside :  "Confirm Payment screen - by choosing highlighted offer
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen


  @P11270-13193 @AndroidRegression @IosRegression
  Scenario: CHOOSE AN OPTION OR CONTINUE section
    Then user is in login screen
    When I enter "menu" in login details
    And user taps login button in login screen
	When user taps on fuel icon and start fuelling button
    And verify the Select Your Pump Screen
    And user taps on continue button in Select Your Pump Screen
    Then user verify the confirms the payment screen