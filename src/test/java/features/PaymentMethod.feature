@PaymentMethod
Feature:PaymentMethod

  Background:
    Given user is on NLID screen

  @P11270-10118 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the icons of all app supported credit cards are displayed on Add Payment Method screen. Current supported cards are Visa, Mastercard
    Given click on the login link in present in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Add Card
    And Enter pin
    And Verify Visa card icon is displayed
    And Verify Master card icon is displayed

  @P11270-10117 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the user is able to see the following components in user credit card info.
    Given click on the login link in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Add Card
    And Verify Visa card icon is displayed
    And Verify Master card icon is displayed
    And Verify Card Name text box is displayed
    And Verify Card number text box is displayed
    Then verify Card expire date text box is displayed
    And verify Post code text box is displayed
    Then verify billing address text box is displayed
    And Verify Search button is displayed

  @P11270-10116 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the user is able to see the following components on the Payment Card Method screen
    Given click on the login link in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Add Card
    And Verify that ‘Scan your card’ as a button
    And Verify Search button is displayed
    And Verify User is able to see 'Skip' button


  @P11270-10115 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the System not to display results, if user enters invalid post code and taps on Done.
    Given click on the login link in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Add Card
    And Enter the PostCode in search box
    Then Click on Search button
    And Verify that No Result displayed

  @P11270-10114 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the system should allow user to delete 'Default' 'credit card'.
    Given click on the login link in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Edit card link
    And Click on delete Card button

  @P11270-10113 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the System able to close the info overlay as the USER taps on ‘GOT IT’ button
    Given click on the login link in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Add Card
    And Click on i icon in the security field
    Then Click on Got it button on popup screen

  @P11270-10112 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the user is able to choose the default credit card for payment by tapping on 'Choose Default Card'.
    Then click on the login link in dashboard
    When Enter the User name
    And Enter the password
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Choose Default Card link

  @P11270-10111 @AndroidRegression @IosRegression @PaymentMethod_Android
  Scenario: Check whether the system is able to grey out the ‘+Add Card’ link, when the user has already added 5 cards.
    Then click on the login link in dashboard
    When Enter "MaxFiveCardAdd" Login
    Then Click on login button
    And user clicks on more icon in LID Screen
    And Click on Account link
    Then Click on Add Card
    And Verify that user should be able to add maximum five cards message




