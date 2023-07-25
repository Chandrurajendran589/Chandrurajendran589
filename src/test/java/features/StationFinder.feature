@StationFinder

Feature: StationFinder

  Background:

  @P11270-11497 @iOSRegression @AndroidRegression
  Scenario: Check whether Non logged-in user should be able to see icons next to the services & facilities available in the ‘Filter by’ screen.
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities

  @P11270-11498 @iOSRegression
  Scenario: Check whether logged-in user should be able to see icons next to the services & facilities available in the ‘Filter by’ screen.
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities

  @P11270-11499 @iOSRegression
  Scenario: Check whether Non logged in user should see icons next to each service & facilities available in the respective station
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then tap on Got It
    Then verify the app display icons next to all available services and facilities in the respective station

  @P11270-11500 @iOSRegression
  Scenario: Check whether logged in user should see icons next to each service & facilities available in the respective station
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then tap on Got It
    Then verify the app display icons next to all available services and facilities in the respective station

  @P11270-11501 @iOSRegression @StationFinder1
  Scenario: Check whether Non logged in user should see the station distance in miles for each station in the list stations
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user verify the app display the direct distance of the stations from device location

  @P11270-11502 @iOSRegression
  Scenario: Check whether logged in user should see the station distance in miles for each station in the list stations
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user verify the app display the direct distance of the stations from device location

  @P11270-11503 @iOSRegression
  Scenario: Check whether Non logged in user should see the station distance in miles for station in Station Details screen
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then tap on Got It
    Then user verify the app display the direct distance in miles for station in Station Details screen

  @P11270-11504 @iOSRegression
  Scenario: Check whether  logged in user should see the station distance in miles for station in Station Details screen
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then tap on Got It
    Then user verify the app display the direct distance in miles for station in Station Details screen

  @P11270-13227 @iOSRegression
  Scenario: Check whether the system displays the available stations when user navigates to station finder maps in under 3 seconds.
    When user is on NLID screen
    Then user taps on Station Finder
    Then check the map is displayed in the station finder screen

  @P11270-13228 @iOSRegression
  Scenario: Check Verify when user changes the view using the in and out zoom, the map view reloads in 3 seconds or less.
    When user is on NLID screen
    Then user taps on Station Finder
    Then check the map is displayed in the station finder screen
    Then the user changes the view using zoom in and out and views the map

  @P11270-13230 @iOSRegression
  Scenario: Check whether user navigates to station finder maps and experiences a delay equivalent to the large number of stations to be retrieved in the mapped area
    When user is on NLID screen
    Then user taps on Station Finder
    Then check the map is displayed in the station finder screen

  @P11270-13231 @iOSRegression @StationFinder1
  Scenario: Check whether the system displays all fueling station sites in the visible map area matching Station list
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    Then check the stations are displayed in the station finder screen

  @P11270-13232 @iOSRegression
  Scenario: Check Verify system to allow the user to view the station markers
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    Then check whether the user zooms in the view area
    #Then check additional markers are available based on the zoom area

#  @P11270-13233 @iOSRegression
#  Scenario: Check whether the system displays all fueling station sites in the visible map area matching Station list
#    When user is on NLID screen
#    Then user taps on Station Finder
#    Then user clicks on continue button in station screen
#    And allow location access
#    Then check the map is displayed in the station finder screen
#    Then the user changes the view using zoom in and out and views the map
#
#  @P11270-13234 @iOSRegression
#  Scenario: Check whether the system displays the available stations when user navigates to station finder maps in under 3 seconds.
#    Given reset the app
#    When user is on NLID screen
#    Then user taps on Station Finder
#    Then user clicks on continue button in station screen
#    And allow location access
#    Then check the map is displayed in the station finder screen
#    Then Check whether multiple stations are displayed in cluster

  @P11270-13235 @iOSRegression
  Scenario: Verify mobile enabled location are displayed in mobile pay stations.
    When user is on NLID screen
    Then user taps on Station Finder
    When user taps on Mobile pay Stations in Esso Station Finder Screen
    Then check the stations are displayed in the station finder screen

  @P11270-15770 @iOSRegression
  Scenario: Verify the system should allow the user to view the modal pop-up.
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button

  @P11270-15771 @iOSRegression
  Scenario: Verify the system should allow the user to close the modal pop-up.
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button
    Then tap on close

  @P11270-15772 @iOSRegression
  Scenario: Verify the system should allow the user to view the offers in the modal pop-up
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button
    Then user taps on View Details Button
    Then user should see the modal pop with offer details and Terms and Conditions

  @P11270-15773 @iOSRegression
  Scenario: Verify the system should allow the user to close the offers in the modal pop-up
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button
    Then user taps on View Details Button
    Then user should see the modal pop with offer details and Terms and Conditions
    Then tap on close button in offer details modal pop up

  @P11270-15774 @iOSRegression
  Scenario: Verify the system should allow the user to load the offers in the modal pop-up
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button
    Then user taps on View Details Button
    Then user should see the modal pop with offer details and Terms and Conditions
    #And tap on load to card button
    #And user verifies that the offer is loaded

  @P11270-15775 @iOSRegression
  Scenario: Verify the system should view the TC in the modal pop-up
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button
    Then user taps on View Details Button
    And user should see the modal pop with offer details and Terms and Conditions
    When user taps on Terms and Conditions link in the view Details modal pop up
    Then user sees the modal pop up with detailed terms and condition


  @P11270-15776 @iOSRegression
  Scenario: Verify the system should close the TC in the modal pop-up
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    And user should see the copy text displayed on the modal pop and the View Details Button
    Then user taps on View Details Button
    And user should see the modal pop with offer details and Terms and Conditions
    When user taps on Terms and Conditions link in the view Details modal pop up
    Then user sees the modal pop up with detailed terms and condition
    Then user taps on close in terms and condition
    And user taps on close button in view details modal pop up

  @P11270-4927 @iOSRegression
  Scenario: Verify whether System is able to navigate user to Fuel Finder screen when user taps on Find Esso Stations
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    Then the system navigates to the Fuel Finder Screen
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    Then the system navigates to the Fuel Finder Screen

  @P11270-4928 @iOSRegression @StationFinder1
  Scenario: Verify whether System is able to navigate user to Locates your nearest stations screen for displaying help text related to Location services access
    Given reset the app
    When user kill and relaunch the app
    When user is on NLID screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    Then user taps on Station Finder
    When user verify the Location Permission screen


  @P11270-4929 @iOSRegression
  Scenario: Check whether System is able to display Continue button for help text related screen
    Given reset the app
    When user kill and relaunch the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user verifies Continue button is displayed in Allow Location screen

  @P11270-4930 @iOSRegression
  Scenario: Verify whether System is able to display Copy Text, as user taps on Continue button CT8 [Copy Text]
    Given reset the app
    When user kill and relaunch the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents

  @P11270-4931 @iOSRegression
  Scenario: Verify whether System is able to perform below mentioned actions if, user has tapped on Dont Allow button a.Disable the location access for the app
    Given reset the app
    When user is on NLID screen
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "essotestingqa01+"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    Then app to dismiss the popup and navigate the user to LID after review
    Then user navigates back to NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
#    Then system should display the location access for the app

  @P11270-4932 @iOSRegression @StationFinder1
  Scenario: Verify whether System is able to perform below mentioned actions if, user has tapped on Dont Allow / deny button b.Close the prompt
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
#    Then verify whether the system should close the prompt

  @P11270-4933 @P11270-4945 @iOSRegression
  Scenario: Check whether System is able to perform below mentioned actions if, user has tapped on Dont Allow / deny button c.Navigate user back to the Fuel Finder screen
    Given reset the app
    When user kill and relaunch the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    Then verify whether the system navigate back to the fuel finder screen

  @P11270-4934 @P11270-4935 @P11270-4936 @iOSRegression
  Scenario: Check whether System is able to perform below mentioned actions if, user has tapped on Always allow/Only while using the app button a.Enable the location access for the app
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on any of the following using the App button
      |Always Allow         |
      |Allow while Using App|
    Then the system navigates to the Fuel Finder Screen

  @P11270-4941 @iOSRegression
  Scenario: Check whether System able to display Welcome to (Fuel Station Name) when the user is at the Fuel station
    Given reset the app
    When user kill and relaunch the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    Then verify whether the system navigate back to the fuel finder screen

  @P11270-4942 @iOSRegression
    Scenario: Check whether System show results based on entered Postcode on the map view as well as the list view(search field will accept alphabets and numbers)
      Given reset the app
      When user is on NLID screen
      When user taps on register button from Login screen
      Then user should be navigated to Manual Register screen
      Then enter First Name
      Then enter Last Name
      Then enter Email address as "Shruthi.s1"
      Then enter password
      And confirm password
      Then click the check box for accept
      When click on continue button from register screen
      When user tap on Skip button
      Then the system should display Skip warning popup
      When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
      Then user taps on Station Finder
      Then user clicks on continue button in station screen
      And allow location access
      When user taps on no thanks in turn on location pop up
      Then the system navigates to the Fuel Finder Screen
      When user enters search term in station finder
      When user tap on list view
      Then check whether System show results based on entered postcode on the map as well as list view

  @P11270-4943 @P11270-4944 @iOSRegression
    Scenario: Check whether System show results based on entered City on the map view as well as the list view(search field will accept alphabets and numbers)
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    Then the system navigates to the Fuel Finder Screen
    When user enters search term in station finder
    When user tap on list view
    Then check whether System show results based on entered city on the map as well as list view


  @P11270-4946 @iOSRegression
  Scenario: Check whether USER able to tap on Fuel Finder button from Dashboard
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    And user taps login button in login screen
    Then Verify whether the user is able to tap on Station Finder

  @P11270-4948 @iOSRegression @StationFinder1
   Scenario: Check Whether System displays the pop up message for device location off in fuel finder screen
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    Then system should display the copy text msg if the user has not given the location services access

  @P11270-4949 @iOSRegression
  Scenario: Check whether System is able to navigate user to App level settings under Device Settings, as user taps on Settings button
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    And verify whether the system navigate back to the fuel finder screen
    And user clicks on Settings button
    Then verify whether the system is able to navigate to the App level settings under Device Settings

  @P11270-4950 @iOSRegression
  Scenario: Check whether System is able to close the prompt as user taps on Cancel button
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    And verify whether the system navigate back to the fuel finder screen
    And user clicks on Cancel button
    Then the system navigates to the Fuel Finder Screen

  @P11270-4951 @P11270-13157 @iOSRegression
  Scenario: Check whether System is able to display any reference to Nectar in Filters, Services and Facilities
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities
    And verify whether the system displays reference to nectar

  @P11270-4952 @iOSRegression @StationFinder1
  Scenario: Verify the system should allow the user to view the offers in the modal pop-up
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When  user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view

  @P11270-4953 @iOSRegression
  Scenario: Verify whether the system is able to display the following components as part of Station finder
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then Verify whether the system is able to display the following components as part of Station finder
      | Postcode Field |
      | List Stations  |
      | Mobile pay stations, All stations|

  @P11270-4954 @iOSRegression @AndroidRegression
    Scenario: Check Whether System is able to display the components in station
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then user taps on GOT IT button
    Then verify user is in the Station details screen
    Then user verify the components in the station

  @P11270-4955 @iOSRegression
  Scenario: Check whether System is able to display the following components as part of Filter By screen.
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen
  | Filter By                              |
  | Please select the services you require |
  |List of services                        |
  | Button: CANCEL, APPLY                  |

  @P11270-4956 @iOSRegression
  Scenario: Check whether System navigates to extended Map View By default
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    Then whether System navigates to extended Map View By default

  @P11270-4957 @iOSRegression
  Scenario: Check whether System to display phone number in station details screen
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then verify user is in the Station details screen
    Then verify whether System to display phone number in station details screen

  @P11270-4958 @iOSRegression
  Scenario: Check whether System to allow user to make a call when tapping on the phone number
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then tap on Got It
    Then verify user is in the Station details screen
    Then verify whether System to display phone number in station details screen
    When user taps on phone number
    And check whether the System displays prompt with phone number with Call and cancel button
    When user taps on cancel button the system should close the prompt
    And  System to navigate user to device level to make a call to the station when user tap on Call button

  @P11270-4959 @iOSRegression
  Scenario: Check whether System to display Opening Hours details in Station Details screen
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then verify user is in the Station details screen
    And check whether System displays Opening Hours details in Station Details screen

  @P11270-4960 @iOSRegression
  Scenario: Check whether System to display Service and Facilities details in Station Details screen
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then verify the app display icons next to all available services and facilities in the respective station

  @P11270-4961 @iOSRegression
  Scenario: Check whether System is able to display below mentioned details on the  Esso Station FInder screen , if the user has given Location Service access for the app
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on any of the following using the App button
      |Always Allow         |
      |Allow while Using App|
    Then the system navigates to the Fuel Finder Screen
    Then Verify whether the system is able to display the following components as part of Station finder
    | Postcode Field |
    | List Stations  |
    |Filter, Directions, Mobile pay stations, All stations|

  @P11270-4962 @iOSRegression
    Scenario:Check whether System is able to load the Mobile Pay Stations by default if user is navigating to Fuel Finder screen
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    Then user checks that the geolocation permission is on for app

  @P11270-4963 @iOSRegression
  Scenario:Check whether System is able to load all fuel stations if user has toggled the button to All Esso Stations
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    Then user checks that the geolocation permission is on for app
    When user switches toggle button option
    Then System should update results based on the search
    And check that the system loads all Esso Stations button

  @P11270-4964 @iOSRegression
  Scenario:Check whether System to take the USER to the station detail screen for a mobile pay enabled station if USER taps on the icon for mobile pay enabled station
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    Then user checks that the geolocation permission is on for app
    When user taps on Mobile pay Stations in Esso Station Finder Screen
    Then System should update results based on the search
    Then verify user is in the Station details screen

  @P11270-4965 @iOSRegression
  Scenario:Check whether System to take the USER to the station detail screen for a not mobile pay enabled station, if USER taps on the icon for non-mobile pay enabled station.
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    Then user checks that the geolocation permission is on for app
    When user taps on All esso Stations
    Then System should update results based on the search
    Then verify user is in the Station details screen

  @P11270-4966 @iOSRegression
  Scenario: Check whether services available in the Esso station should be displayed in the List View
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify whether services available in the Esso station should be displayed in the List View

  @P11270-4968 @iOSRegression
  Scenario: Check whether service option available under filter
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify whether services available in the Esso station should be displayed in the List View
    Then select a filter option
    And validate apply filter button

  @P11270-4967 @iOSRegression
  Scenario: Check whether System able to display the map view after applying the filter
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user tap on filter icon
    Then Verify whether services available in the Esso station should be displayed in the List View
    Then select a filter option
    And validate apply filter button
    Then user taps on Apply Filter Button
    Then the system navigates to the Fuel Finder Screen

  @P11270-4969 @iOSRegression
  Scenario: Check whether system not able to update the filters for Find Esso Stations screen, if user has tapped on Cancel button
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "Shruthi.s1"
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    When user tap on filter icon
    Then select a filter option
    And validate apply filter button
    When user taps on cancel button in Filter By Screen
    Then the system navigates to the Fuel Finder Screen

   @P11270-4970 @iOSRegression
   Scenario: Check whether System to convert full Map View into split Map View and List View, if user has tapped on List Stations button
     Given reset the app
     When user is on NLID screen
     When user taps on Station Finder
     And user clicks on continue button in station screen
     And allow location access
     When user tap on list view
     Then verify whether system convert full Map View into split Map View and List View if user has tapped on List Stations button

  @P11270-4982 @iOSRegression
    Scenario: Check whether System to display Mobile Pay Stations as selected by default
    Given reset the app
    When user is on NLID screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user tap on list view
    Then the system displays the copy text msg
    And user verfies the copy text msg displayed
    And system displays the current location on the map
    And verify System displays Mobile Pay Stations as selected by default

  @P11270-4983 @iOSRegression
  Scenario: Check whether System to update search results if USER is switching toggle button option
    Given reset the app
    When user is on NLID screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user tap on list view
    Then the system displays the copy text msg
    And user verfies the copy text msg displayed
    And system displays the current location on the map
    And verify System displays Mobile Pay Stations as selected by default
    When user switches toggle button option
    Then System should update results based on the search

  @P11270-4984 @iOSRegression
  Scenario: Check whether System to update search results if USER is switching toggle button option
    Given reset the app
    When user is on NLID screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user tap on list view
    Then the system displays the copy text msg
    And user verfies the copy text msg displayed
    And system displays the current location on the map
    And verify System displays Mobile Pay Stations as selected by default
    When user switches toggle button option
    Then System should update results based on the search
    And check that the system loads all Esso Stations button

  @P11270-4985 @P11270-4986 @iOSRegression
  Scenario: Check whether System to update search results if USER is switching toggle button option
    Given reset the app
    When user is on NLID screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user tap on list view
    Then the system displays the copy text msg
    And user verfies the copy text msg displayed
    And system displays the current location on the map
    And verify System displays Mobile Pay Stations as selected by default
    When user switches toggle button option
    Then System should update results based on the search

  @P11270-4937 @iOSRegression
  Scenario: Check whether System is able to make the service call and load the nearby fueling stations by making a service calls and load the nearby fueling stations
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    And user tap on list view
    Then verify whether the system should be able to make the service call and load the nearby service stations

  @P11270-4938 @iOSRegression
  Scenario: Check whether System should not to display distance and other details for Fuel Finder button if user has not given location access for the app and distance should be calculated from the London location
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    And verify whether the system navigate back to the fuel finder screen
    And verify whether the system should close the prompt
    When user enters search term in station finder
    When user tap on list view
    Then the system displays the copy text msg

  @P11270-4939 @iOSRegression
  Scenario: Check whether System is able to get the consolidated list of all available fueling stations with complete details
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    And user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4972 @iOSRegression
  Scenario: Check whether System is able to navigate user to App level settings under Device Settings, as user taps on Settings button
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    And verify whether the system navigate back to the fuel finder screen
    And user clicks on Settings button
    Then verify whether the system is able to navigate to the App level settings under Device Settings

  @P11270-4971 @iOSRegression
  Scenario: Check whether System to display the copy text msg if user has not given the location services access
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the Location Permission screen
    When user taps on Continue button in Allow Location screen
    Then system displays the popup with the contents
    When user taps on dont allow button
    Then system should display the location access for the app
    Then system should display the copy text msg if the user has not given the location services access

  @P11270-13156 @AndroidRegression @iOSRegression
  Scenario: Verify whether View offer loads  Non load to card offer in the Offers section
    Given user is on NLID screen
    Then user is in login screen
    When I enter "StationOffer3" in login details
    And user taps login button in login screen
    When user lands on LID screen after successful Login
    Then user taps on Offers
    And validate offers displayed in offer screen
    Then tap on view offers button
    And validate offer details
    Then tap on Terms & conditions link
    And validate Terms & conditions overlay
    Then close the Terms & conditions overlay

   @P11270-13163 @iOSRegression
    Scenario: Stations accepting Mobile pay should have Nectar points in the filter options
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
     And user tap on list view
    Then the system displays the copy text msg
    And user verfies the copy text msg displayed
    And system displays the current location on the map
    And verify System displays Mobile Pay Stations as selected by default
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities
    And verify whether the system displays reference to nectar

  @P11270-4973  @iOSRegression
  Scenario: Check whether system to search for given keyword and load the station listing based on keyword entered by the user as user taps on Search button from keyboard
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
   And user taps on search button from Mobile Keyboard
    And user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4974 @iOSRegression
  Scenario: Check whether System to display Search button as a part of keyboard
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    Then verify whether the system displays Search button as a part of keyboard

  @P11270-4976 @iOSRegression
  Scenario: Check whether System to display Search button as enabled once has not entered any keyword for search term field
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    Then user verifies the search icon in the fuel finder screen

  @P11270-4977 @iOSRegression @StationFinder1
  Scenario: Check Whether System displays the navigation from fuel finder screen to NLID screen
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    Then user taps on back button in fuel finder screen
    Then user navigates back to NLID screen


  @P11270-4978 @P11270-4979 @P11270-4980 @iOSRegression
  Scenario: Check whether system to navigate user back to Fuel Finder screen
    Given reset the app
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    And user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    And user taps on search button from Mobile Keyboard
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4981 @iOSRegression @doubt
  Scenario: Check whether system to Get Directions as button , on tapping USER will be navigating to the route map view,Displaying the route to the destination(fuel station)
    Given reset the app
    When user is on NLID screen
    Then user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then user taps on GOT IT button
    Then verify user is in the Station details screen
    When user taps on Get Directions Button
    Then user navigates to the route map view

  @P11270-20573
  Scenario: Verify the app should not display the ‘Open Now' or 'Closed Now’ status on the station details screen.
    When user is on NLID screen
    Then user is in login screen
    When user enters "Offer1" in login details
    Then user taps login button in login screen
    When user taps on Station Finder
    Then user clicks on continue button in station screen
    And allow location access
    When user taps on any of the stations in the Map
    Then verify user is in the Station details screen
    And verify whether the app should not display 'Open now'or 'Closed Now' Status

  @Smoke_iOS @P11270-22891 @Smoke_Android
  Scenario: Check whether the user is able to navigate to the Station details screen from LID
    When user is on NLID screen
#    Then user is in login screen
#    When I enter "smokecredentials2" in login details
#    Then user taps login button in login screen
    When I enter SSO login details for "LinkedInOffer2"
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    Then verify whether the system displays Search button as a part of keyboard
    When user enters search term in station finder
    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    When user clicks on Save Station button
    Then verify if the Station is saved
    When user clicks on the Saved Station
    Then verify if the Station is unsaved
    When user taps on back button in Station Details screen
    Then the system navigates to the Esso Finder Screen

  @Smoke_iOS @P11270-22892 @Smoke_Android
  Scenario: Check whether the user is able to use the filter icon for selecting the available services and facilities
    When user is on NLID screen
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen
    And Verify the app display icons next to all available services and facilities
    When taps on any of the services and facilities
    Then verify if a tick mark is displayed next to the selected services
    And verify the change in Apply Filter button
    When user clicks on Apply filter buttton
    Then the system navigates to the Esso Station Finder Screen


