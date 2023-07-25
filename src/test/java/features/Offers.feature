@Offers
Feature: Offers

  @P11270-14218 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify correct CT is displayed on modal pop up on station details page with site specific offer when customer is not logged in
    Given reset the app
    Given user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
    Then tap on close

  @P11270-14157 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify correct CT is displayed on modal pop up on station details page with site specific offer when customer is logged in and nectar card is added but not verified
    Given reset the app
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop"Verify your Nectar card to see exclusive offers!" up in station finder for logged in user with non verified nectar
    Then tap on close

  @P11270-14217 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify correct CT is displayed on modal pop up on station details page with site specific offer when customer is logged in but nectar card not added or verified
    Given reset the app
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer2" in login details
    And user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop"Add your Nectar card to see exclusive offers and collect points with every fill!" up in station finder for logged in user with non verified nectar
    Then tap on close

  @P11270-14139 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify user able to see a modal pop up on station details page with site specific offer when user has loyalty added and verified in his account
    Given reset the app
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop up in station finder for logged in user with verified nectar
    Then tap on close

  @P11270-14219 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify user should be able to see a modal pop up on station details page with site specific offer
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
    Then tap on Got It

  @P11270-14143 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify the frequency of the modal pop up on the site station finder detail screen
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
    Then tap on Got It
    When navigate back to "station list" page
    Then user selects a station from the list
    And user should not see the Model popup in station detais
    When navigate back to "station list" page
    Then user selects a station from the list
    And user should not see the Model popup in station detais
    When navigate back to "station list" page
    Then user selects a station from the list
    And user should not see the Model popup in station detais
    When navigate back to "station list" page
    Then user selects a station from the list
    And user should not see the Model popup in station detais
    When navigate back to "station list" page
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
    Then tap on Got It

  @P11270-5061 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Check whether User navigates to Offers screen from tab bar
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    And user taps login button in login screen
    When user taps on Offers
    Then verify user is able to Navigate Offers screen
    And validate offer details in offers screen

  @P11270-13119 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Verify Nectar card when user enters incorrect card id and later enters valid card id on verifying process
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    Then user taps login button in login screen
    When user tap on learn more link in LID screen
    Then user is navigated to add nectar screen
    And enter random nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @P11270-13120 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Ensure that the system to allow user to view the station markers
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    Then user validates cluster displayed in map area
    When user tap on a cluster
    Then map gets zoomed in to display cluster and map pins

  @P11270-15931 @P11270-13122 @AndroidRegression @iOSRegression
  Scenario: LID- Add Nectar Card and verify on Registration flow
    When user is on NLID screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testessoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    When user taps on Offers
    Then verify user is able to Navigate Offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen

  #Do you have a Nectar card screen is removed as part of R4
  @P11270-13124 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Do you have a Nectar card should not be displayed and user navigate to 'Add Nectar Card'
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer2" in login details
    And user taps login button in login screen
    When user taps on Offers
    Then verify user is able to Navigate Offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen

  @P11270-13125 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Accounts - "Add Nectar card" and Verify the Card
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    And validate added nectar card in account
    Then delete added nectar card

  @P11270-13126 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Account :  Account screen UI and Alignment ,Before adding Nectar Card
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user tap on verify later
    And validate Verify later screen
    Then Validate skip click on skip button
    And validate added nectar card in account
    Then delete added nectar card

  @P11270-13132 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Account :  Account- Add nectar Card from account screen ( User enters wrong and then correct card number while verifying nectar card)
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    And validate added nectar card in account
    Then delete added nectar card
    And validate if user sees add nectar card button after deleting nectar

  @P11270-13133 @AndroidRegression @iOSRegression
  Scenario: Offers - Verify the nectar card on existing card number
    Given user is on NLID screen
    When user taps on register button from Login screen
    And user enters "Testessoapp2021+" in the registration details
    And click the check box for accept
    And click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    When user taps on Offers
    And validate offer details in offers screen
    And user check whether find more about nectar link is available in the offers details screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    When user taps on the next button in 'Add Nectar Card' screen without entering the nectar card
    Then user verifies the inline error message for empty nectar card number field
    And enter nectar card value and tap on next button
    And click the continue button under 'Nectar card added successfully' screen
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card


  @P11270-13138 @AndroidRegression @iOSRegression @AppLaunch_Android
  Scenario: Install & Launch :  Install& Launch  Esso app Launch Screen 3 UI and Alignment and animation
    Given reset the app
    And Accept all the cookies
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen

  @P11270-13142 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Sprint 2 Pay outside : Complete the fuelling transaction without verifying nectar card and Verify the Transaction complete screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer2" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user tap on verify later
    And validate Verify later screen
    Then Validate skip click on skip button
    And validate added nectar card in account
    And user taps on More button in tab bar
    When user tap on LID screen
    When user taps on start button in LID
    Then user clicks on continue button in station screen
    And allow location access
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then tap on verify nectar screen from transaction complete screen
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then user taps on done button after finishing fuelling
    And close the thank you screen if displayed
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then delete added nectar card

  @P11270-13143 @AndroidRegression @iOSRegressionv @Offers_Android
  Scenario: Sprint 2 Redemption Offers : CHOOSE AN OPTION OR CONTINUE - by choosing highlighted offer will apply on to the fuelling
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then user taps on Loyalty edit
    And validate redemption offers

  @P11270-13144 @AndroidRegression @iOSRegressionv @Offers_Android
  Scenario: Daisy Phase 2 Esso app :  Add and verify Nectar card from "Payment Details " screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer2" in login details
    And user taps login button in login screen
    When user taps on start button in LID
    When tap on payment method in select your pump screen
    Then validate nectar section in change payment screen
    And tap on add nectar card in change payment screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then user taps on Close button
    Then navigate back to "LID" page
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then delete added nectar card

  @P11270-13149 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Offers- load to card - Terms & Condition pop up by tapping on T&C link
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And validate offers displayed in offer screen
    Then tap on view offers button
    And validate offer details
    Then tap on Terms & conditions link
    And validate Terms & conditions overlay
    Then close the Terms & conditions overlay

  @P11270-13151 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Sprint 2 - Payoutside : Verify Transaction Complete screen for "Added nectar card.. " message
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer2" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate add nectar card button displayed in transaction complete screen

  @P11270-13152 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When  points are accumulated
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on Offers
    Then validate nectar card number and point balance in offers screen

  @P11270-13164 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Daisy Phase 2 Esso App: From Offers screen " Add Nectar Card" and Verify card
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer2" in login details
    And user taps login button in login screen
    When user taps on Offers
    And validate offer details in offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @P11270-13167 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: LID- Nectar Card not verified /Vaulted to the account
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    Then user taps login button in login screen
    When user tap on learn more link in LID screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @P11270-13170 @AndroidRegression @iOSRegressionv @Offers_Android
  Scenario: Esso Daisy Phase 2 : Offers enabled  for Daisy
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    Then tap on your nectar card link in offers screen
    And user should see the digital nectar card

  @P11270-13172 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Esso Daisy Ph2 : Offers screen Verify the Digital Card
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    Then tap on your nectar card link in offers screen
    And user should see the digital nectar card
    Then close the digital nectar card

  @P11270-13174 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Station Finder : "Nectar Points" is selected along with one other filters button  "APPLY 1 FILTER" should be displayed
    Given user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    When user tap on filter icon
    Then select a filter option
    And validate apply filter button

  @P11270-13176 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: LID -Add Nectar card from LID and verify Nectar card get rewards
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    Then user taps login button in login screen
    When user tap on learn more link in LID screen
    Then user is navigated to add nectar screen
    And enter random nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @P11270-13177 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Daisy Ph2 -Sprint 2: Verify the Point balance on offers screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    Then validate nectar card number and point balance in offers screen

  @P11270-13189 @AndroidRegression @iOSRegression @Offers_Android
  Scenario: Offers- Load to card - Latest Offers & coupons Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And validate offers displayed in offer screen

  @P11270-13191 @AndroidRegression @iOSRegression
  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When no points are accumulated 
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer2" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    Then validate point balance as nill in offers screen when user has no points

  @SmokeTest1 @P11270-18334
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link after adding Nectar card from Transaction complete Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
#    And Click on login button
    Then user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate add nectar card button displayed in transaction complete screen
    And tap on the Add Nectar Card button in Transaction complete Screen
    And verify the Add nectar card screen
    Then tap on Add now button in Add Nectar Card Screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Transaction Complete Screen
    And user lands on Verify Card Screen and taps on skip button
    Then verify if the user is in the Transaction Complete Screen with the context to verify the nectar card
    When user kill and relaunch the app
    And close the modal popup
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-15916 @P11270-13134 @iOSRegression @Offers_Android
  Scenario: Offers - Newly added and verify the Nectar card
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on Offers
    And validate offer details in offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest1 @P11270-18335
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link after verifying Nectar card from Transaction complete Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate verify nectar card link displayed in transaction complete screen
    And tap on the Verify Nectar Card link in Transaction complete Screen
    And click the continue button under 'verify your card' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Transaction Complete Screen
    And user lands on Verify Card Screen and taps on skip button
    And verify if the user is in the Transaction Complete Screen
    Then validate verify nectar card link displayed in transaction complete screen

  @SmokeTest1 @P11270-18332
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Offer with Nectar card added
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And validate offer details in offers screen
    Then tap on Verify Nectar button in offers Screen
    And click the continue button under 'verify your card' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Offers Screen
    Then verify if the user is navigated to Offers screen

  @SmokeTest1 @P11270-18331
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Add nectar card in offers screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And verify if the user is navigated to Offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Offers Screen
    Then verify if the user is navigated to Offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest1 @P11270-18330
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Add nectar card in Account screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Account Screen
    Then user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18327
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Add nectar card in Payment Details Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user taps on Payment Method link under 'Select your pump'Screen
    Then verify if the user lands on Payment Details Screen
    And tap on Add Nectar card button in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to verify card screen
    And user lands on Verify Card Screen and taps on skip button
    When user lands on LID screen after successful Login
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18326
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping See your nectar balance in LID
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    Then verify whether 'See your Nectar balance' link is displayed on LID
    And tap on 'See your Nectar balance' Link
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    Then verify the modal popup and click on Ok button before navigating to LID
    And verify whether 'See your Nectar balance' link is displayed on LID

  @SmokeTest @P11270-18321
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Learn More link in LID
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    Then verify whether 'Learn more' link is displayed on LID
    And tap on 'Learn more' Link
    And user tap on Get Started button in the Add Nectar Card screen
    And user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    Then verify the modal popup and click on Ok button before navigating to LID
    And verify whether 'Learn more' link is displayed on LID
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18334
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link after adding Nectar card from Transaction complete Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms the payment
    Then user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate add nectar card button displayed in transaction complete screen
    And tap on the Add Nectar Card button in Transaction complete Screen
    And verify the Add nectar card screen
    Then tap on Add now button in Add Nectar Card Screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Transaction Complete Screen
    And user lands on Verify Card Screen and taps on skip button
    Then verify if the user is in the Transaction Complete Screen with the context to verify the nectar card
    When user kill and relaunch the app
    And close the modal popup
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-15916 @P11270-13134 @iOSRegression
  Scenario: Offers - Newly added and verify the Nectar card
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user taps on Offers
    And validate offer details in offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18335
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link after verifying Nectar card from Transaction complete Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user selects the pump from 'Select your Pump' page and taps on continue button

    And user confirms the payment
    Then user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate verify nectar card link displayed in transaction complete screen
    And tap on the Verify Nectar Card link in Transaction complete Screen
    And click the continue button under 'verify your card' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Transaction Complete Screen
    And user lands on Verify Card Screen and taps on skip button
    And verify if the user is in the Transaction Complete Screen
    Then validate verify nectar card link displayed in transaction complete screen

  @SmokeTest @P11270-18332
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Offer with Nectar card added
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And validate offer details in offers screen
    Then tap on Verify Nectar button in offers Screen
    And click the continue button under 'verify your card' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Offers Screen
    Then verify if the user is navigated to Offers screen

  @SmokeTest @P11270-18331
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Add nectar card in offers screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And verify if the user is navigated to Offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Offers Screen
    Then verify if the user is navigated to Offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18330
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Add nectar card in Account screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Account Screen
    Then user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18327
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Add nectar card in Payment Details Screen
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    When user taps on start button in LID
    And user taps on Payment Method link under 'Select your pump'Screen
    Then verify if the user lands on Payment Details Screen
    And tap on Add Nectar card button in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to verify card screen
    And user lands on Verify Card Screen and taps on skip button
    When user lands on LID screen after successful Login
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @SmokeTest @P11270-18326
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping See your nectar balance in LID
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Challenge2" in login details
    And user taps login button in login screen
    Then verify whether 'See your Nectar balance' link is displayed on LID
    And tap on 'See your Nectar balance' Link
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    Then verify the modal popup and click on Ok button before navigating to LID
    And verify whether 'See your Nectar balance' link is displayed on LID

  @SmokeTest @P11270-18321
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link by tapping Learn More link in LID
    Given user is on NLID screen
    Then user is in login screen
    When I enter "Offer1" in login details
    And user taps login button in login screen
    Then verify whether 'Learn more' link is displayed on LID
    And tap on 'Learn more' Link
    And user tap on Get Started button in the Add Nectar Card screen
    And user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    Then verify the modal popup and click on Ok button before navigating to LID
    And verify whether 'Learn more' link is displayed on LID
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card

  @Smoke_iOS @Offers @Smoke_Android
  Scenario: Offers - Newly added and verify the Nectar card
    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "smokecredentials2" in login details
#    And user taps login button in login screen
    When I enter SSO login details for "LinkedInOffer1"
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    And validate the offers screen before adding the nectar card
    When user taps on 'More about collecting points'link in the offers screen
    Then validate the popup which displays 'How to collect points' in detail and close the popup
    When user taps on 'Get Exclusive offers' in the offers screen
    Then enter nectar card value and tap on next button
    When user clicks on Verify Later button under 'Card Added successfully' alert
    Then user lands on Verify Card Screen and taps on skip button
    And verify if the user is navigated to Verify Offers screen
    When user taps on Verify Nectar card button in the 'Verify Offers' Screen
    And click the continue button under 'verify your card' alert
    Then user is navigated to Verify nectar screen
    When user enters valid nectar details in verify nectar screen
    Then validate offers displayed in offer screen
    And validate nectar card number and point balance in offers screen
    When user taps on fuel icon
    And user taps on start button in LID
    And user is navigated to Select your pump screen
    When user taps on continue button in Select Your Pump Screen
    Then Redemption screen is displayed with Redemption options
    When user selects any of the options and click on continue in the popup
    Then the user is navigated to Confirm payment screen after selecting the redemption option
    When click on Edit link under Redemption Offers in Confirm payment screen
    Then the user is navigated to the Redemption screen
    When user unselects the redemption option
    Then the user is navigated to Confirm payment screen after unselecting the redemption option

  @Smoke_iOS @P11270-22900 @Smoke_Android
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link after adding Nectar card from Transaction complete Screen
    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "smokecredentials2" in login details
#    And user taps login button in login screen
    When I enter SSO login details for "LinkedInOffer1"
    And user taps on More button in tab bar
    And user navigates to Account screen
    Then delete added nectar card if exists
    When user taps on fuel icon
    Then user lands on LID screen after successful Login
    And user taps on start button in LID
    And user is navigated to Select your pump screen
    When user taps on the payment method link
    Then verify if the user lands on Payment Details Screen
    When user selects the frictionless flow card and tap on update button
    And user is navigated to Select your pump screen
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user confirms card payment
    Then user is on setup PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate add nectar card button displayed in transaction complete screen
    And tap on the Add Nectar Card button in Transaction complete Screen
    And verify the Add nectar card screen
    Then tap on Add now button in Add Nectar Card Screen
    Then user is navigated to add nectar screen
    And enter nectar card value and tap on next button
    And click the continue button under 'Card Added successfully' alert
    And verify if the application redirects to the 'Link your account' Screen
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And verify the modal popup and click on Ok button before navigating to Transaction Complete Screen
    And user lands on Verify Card Screen and taps on skip button
    Then verify if the user is in the Transaction Complete Screen with the context to verify the nectar card
    When user kill and relaunch the app
    And close the modal popup
    When user taps on Offers
    Then verify if the user is navigated to Verify Offers screen

  @Smoke_iOS @P11270-22901
  Scenario: Offers - Verify the nectar card
    Given user is on NLID screen
    When user taps on register button from Login screen
    And user enters "Testessoapp2021+" in the registration details
    And click the check box for accept
    And click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    When user taps on Offers
    And validate the offers screen before adding the nectar card
    And user check whether find more about nectar link is available in the offers details screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    When user taps on the next button in 'Add Nectar Card' screen without entering the nectar card
    Then user verifies the inline error message for empty nectar card number field
    And enter nectar card value and tap on next button
    And click the continue button under 'Nectar card added successfully' screen
    Then user is navigated to Verify nectar screen
    Then user enters valid nectar details in verify nectar screen
    Then validate nectar card number and point balance in offers screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card


