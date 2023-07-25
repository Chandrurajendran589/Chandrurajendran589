package stepDefinitions;

import contants.AccountConstants;
import contants.COFChallangeFlowConstants;
import contants.ContextualRegistrationConstants;
import contants.OffersContants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.COFChallangeFlowPage;
import pages.ContextualRegistrationPage;
import pages.OffersPage;

public class COFChallangeFlowSteps extends COFChallangeFlowPage {
	
	AccountPage AccountPage = new AccountPage();
	OffersPage OffersPage = new OffersPage();



	@When("^I enter SSO in login details for \"([^\"]*)\"$")
	public void i_enter_sso_in_login_details_for_something(String userType) throws Throwable {
		waitFor(3000);
		switchToWebAppContext(((AppiumDriver) driver));
		waitFor(2000);
		enterTextWithoutScroll(SSOusername,COFChallangeFlowConstants.LNUSER);
		hideMobileKeyboard();
		enterTextWithoutScroll(SSOpassWord,COFChallangeFlowConstants.LNPASSWORD);
		hideMobileKeyboard();
	}

	@Then("^user is in Linked in Login$")
	public void user_is_in_linked_in_login() throws Throwable {
		waitFor(3000);
		isElementDisplayed(LinkedinIcon);
		clickButtonWithOutScroll(LinkedinIcon);
	}

	@And("^user taps login button in SSO login screen$")
	public void user_taps_login_button_in_sso_login_screen() throws Throwable {
		clickButtonWithOutScroll(SSOsignin);
		waitFor(2000);
	}


//	@Then("^validate if user is on 3ds password screen$")
//	public void validate_if_user_is_on_3ds_password_screen() throws Throwable {
//		waitFor(4000);
//		isElementDisplayed(PassPhrase);
//	}
//
//	@Then("^validate 3DS passphrase prompt$")
//	public void validate_3ds_passphrase_prompt() throws Throwable {
//		waitFor(2000);
//		if (isElementDisplayedWithoutAssert(Continue_BTN)) {
//			clickButtonWithOutScroll(Continue_BTN);
//		}
//		for (int i = 0; i < 10;) {
//			waitFor(2000);
//			i++;
//			logger.info("###################Modirum Pop up not yet displayed#########################");
//			if (isElementDisplayedWithoutAssert(PromptTtl)) {
//				logger.info("###################Modirum Pop displayed#########################");
//				break;
//			}
//			staticTextValidation(AccountPage.AccountMessage, COFChallangeFlowConstants.PASSPHRASEONBOARD);
//		}
//	}

//	@Then("^user tap on add card button in account$")
//	public void user_tap_on_add_card_button_in_account() throws Throwable {
//		ScrollTo(COFChallangeFlowConstants.ACCOUNT, AccountConstants.IOSSCROLLUP, AddCard);
//		clickButtonWithOutScroll(AddCard);
//		waitFor(2000);
//	}

//	@Then("^enter name of the card$")
//	public void enter_name_of_the_card() throws Throwable {
//		isElementDisplayed(CardName);
//		enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
//	}
//
//	@Then("^enter \"([^\"]*)\" card number$")
//	public void enter_something_card_number(String arg1)  {
//		enterTextWithoutClick(CardNo, arg1);
//	}
//
//	@Then("^enter expiry date$")
//	public void enter_expiry_date() throws Throwable {
//		waitFor(1000);
//		enterTextWithoutClick(ExpDate,COFChallangeFlowConstants.EXPDATE);
//
//	}
//
//	@Then("^enter CVV$")
//	public void enter_cvv() throws Throwable {
//		enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
//	}
//
//	@Then("^enter postal code$")
//	public void enter_postal_code() throws Throwable {
//		enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
//		hideMobileKeyboard();
//	}
//
//	@Then("^enter address line1$")
//	public void enter_address_line1() throws Throwable {
//		enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
//		hideMobileKeyboard();
//	}
//
//	@Then("^enter Address line2$")
//	public void enter_address_line2() throws Throwable {
//		enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
//		hideMobileKeyboard();
//	}
//
//	@Then("^enter city$")
//	public void enter_city() throws Throwable {
//		enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
//		hideMobileKeyboard();
//	}
//
//	@Then("^check consent checkbox$")
//	public void check_consent_checkbox() throws Throwable {
//		ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
//		clickButtonWithOutScroll(ConsentBox);
//	}

//	@When("^user is on setup PIN screen$")
//	public void user_is_on_setup_pin_screen() throws Throwable {
//		staticTextValidation(AccountPage.AccountMessage, COFChallangeFlowConstants.SETUPPIN);
//	}

	@Then("^validate Confirmation prompt should be displayed only for 5 seconds$")
	public void validate_confirmation_prompt_should_be_displayed_only_for_5_seconds() throws Throwable {
		if (isElementDisplayedWithoutAssert(Continue_BTN)) {
			clickButtonWithOutScroll(Continue_BTN);
		}
		if (isElementDisplayedWithoutAssert(PromptTtl)) {
			if (isElementDisplayedWithoutAssert(PromptTtl)) {
				Assert.fail("Promt displayed after 5 seconds");
			}
		}
	}

	@Then("^tap on got it button in overlay$")
	public void tap_on_got_it_button_in_overlay() throws Throwable {
		if (isElementDisplayedWithoutAssert(PromptTtl)) {
			clickButtonWithOutScroll(AccountPage.okBtn);
		}
	}
	@When("^user enters invalid card number and other valid card details$")
	public void userEntersInvalidCardNumberAndOtherValidCardDetails() {
		waitFor(2000);
		enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
		enterTextWithoutClick(CardNo,COFChallangeFlowConstants.INVALIDCARD);
		enterTextWithoutClick(ExpDate,COFChallangeFlowConstants.EXPDATE);
		enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
		enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
		hideMobileKeyboard();
		enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
		hideMobileKeyboard();
		enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
		hideMobileKeyboard();
		enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
		hideMobileKeyboard();

	}
	@And("^enter invalid password and click on submit button$")
	public void enter_invalid_password_and_click_on_submit_button() throws Throwable {
		enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.CARDNAME);
		clickButtonWithOutScroll(PassPhraseSubmit);
	}

	@Then("^validate error message displayed in modirum screen$")
	public void validate_error_message_displayed_in_modirum_screen() throws Throwable {
		isElementDisplayed(PassError);
		isElementDisplayed(FailAlertImg);
	}

//	@And("^enter valid password and click on submit button$")
//	public void enter_valid_password_and_click_on_submit_button() throws Throwable {
//		enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
//		clickButtonWithOutScroll(PassPhraseSubmit);
//	}

//	@Then("^validate success screen for added card$")
//	public void validate_success_screen_for_added_card() throws Throwable {
//		if (platformName.equalsIgnoreCase("Android")) {
//			staticTextValidation(PaymentSuccessTtl, COFChallangeFlowConstants.PAYSUCCSTTL);
//			staticTextValidation(PaymentSuccessDes, COFChallangeFlowConstants.PAYSUCCSDES);
//		}
//		else{
//			staticTextValidation(CardAddSuccess,COFChallangeFlowConstants.CARDSUCCESS);
//			staticTextValidation(PaymentSuccessTtl, COFChallangeFlowConstants.PAYSUCCSTTL);
//			clickButtonWithOutScroll(AccountPage.okBtn);
//		}
//	}

	@Then("^tap on continue button in success screen$")
	public void tap_on_continue_button_in_success_screen() throws Throwable {
		clickButtonWithOutScroll(OffersPage.Continue);
	}
	
	@When("^user Tap on facebook button$")
	public void user_Tap_on_facebook_button() throws Throwable {

		clickButtonWithOutScroll(FacebookTab);
	}

	@When("^user enter the mobile number$")
	public void user_enter_the_mobile_number() throws Throwable {
		
		enterTextWithoutScroll(MobileNumber, COFChallangeFlowConstants.MOBNUMBER);
		
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		enterTextWithoutScroll(Pwd, COFChallangeFlowConstants.PWDFACEBOOK);
	}

	@When("^user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
	    clickButtonWithOutScroll(ContinueBtn);
	}

	@When("^validate the facebook prompt$")
	public void validate_the_facebook_prompt() {
	 staticTextValidation(FBMSG, COFChallangeFlowConstants.FBPromt);
	 clickButtonWithOutScroll(OkBtn);
		
	}
	
	@And ("^tap on cancel button navigate to payment screen$")
	public void tap_on_cancel_button_navigate_to_payment_screen()
	{
		clickButtonWithOutScroll(OTPcancel);
		waitFor(2000);
		if(isElementDisplayed(TransCancel)){
			clickButtonWithOutScroll(OkButton);
		}
		
	}
	@Then ("^enter address details$")
	public void enter_address_details()
	{
		clickButtonWithOutScroll(AddressSearchopn);
		clickButtonWithOutScroll(ChooseAddress);
		clickButtonWithOutScroll(SelectAddress);
	}


	@Then("^user lands on enter PIN screen$")
	public void userLandsOnEnterPINScreen() {
	}

//	@When("^user lands on card verification screen$")
//	public void userLandsOnCardVerificationScreen() {
//
//		isElementDisplayed(VerifyPwd);
//		waitFor(1000);
//		staticTextValidation(EnterPwd,COFChallangeFlowConstants.ENTERPWD);
//
//	}

	@When("^user taps on 'Add a payment method to pay at the pump' link$")
	public void userTapsOnAddAPaymentMethodToPayAtThePumpLink() {

		isElementDisplayed(AddPaymentMethod);
		waitFor(2000);
		clickButtonWithOutScroll(AddPaymentMethod);
	}

	@When("^user taps on 'Add nectar card' link in LID$")
	public void userTapsOnAddNectarCardLinkInLID() {

		isElementDisplayed(AddNectarLink);
		waitFor(2000);
		clickButtonWithOutScroll(AddNectarLink);
	}

	@Then("^tap on 'Get Started' button under Add Nectar Card screen$")
	public void tapOnGetStartedButtonUnderAddNectarCardScreen() {

		isElementDisplayed(GetStartedBtn);
		waitFor(2000);
		clickButtonWithOutScroll(GetStartedBtn);
	}

	@Then("^verify the 'Nectar card added successfully' page and click on continue button$")
	public void verifyTheNectarCardAddedSuccessfullyPageAndClickOnContinueButton() {

		isElementDisplayed(NectCardSuccess);
		waitFor(2000);
		clickButtonWithOutScroll(Continue_BTN);
	}

	@Then("^verify the 'Payment method added successfully' page and click on continue button$")
	public void verifyThePaymentMethodAddedSuccessfullyPageAndClickOnContinueButton() {
		isElementDisplayed(PaymentMethodSuccess);
		waitFor(2000);
		clickButtonWithOutScroll(Continue_BTN);
	}

	@Then("^user clicks on 'Set your maximum fuelling amount' button in LID screen$")
	public void userClicksOnSetYourMaximumFuellingAmountButtonInLIDScreen() {
		isElementDisplayed(SetMaxFuelAmount);
		waitFor(2000);
		clickButtonWithOutScroll(SetMaxFuelAmount);

	}

	@Then("^user taps on 'SET MAXIMUM AMOUNT'$")
	public void userTapsOnSETMAXIMUMAMOUNT() {
		clickButtonWithOutScroll(SetMaxAmount);
	}


	@And("^user enters the maximum digit card number in the Card Number field$")
	public void userEntersTheMaximumDigitCardNumberInTheCardNumberField() {
		enterTextWithoutClick(CardNo,COFChallangeFlowConstants.CARDNUM);
		if(COFChallangeFlowConstants.CARDNUM.length()==19){
			logger.info("################### Maximum digits for the Card Number is 19 !#########################");
		}

	}

	@Then("^verify whether the entered card number is displayed$")
	public void verifyWhetherTheEnteredCardNumberIsDisplayed() {
		Assert.assertTrue(
				isTextMatch(CardNo.getText(), COFChallangeFlowConstants.CARDNUM));

		}

	@Then("^verify whether the system displays 'Add a payment method to pay at the pump'link in LID$")
	public void verifyWhetherTheSystemDisplaysAddAPaymentMethodToPayAtThePumpLinkInLID() {
		isElementDisplayed(AddPaymentMethod);
	}

	@And("^user enters the maximum characters in Card Name field$")
	public void userEntersTheMaximumCharactersInCardNameField() {
		enterTextWithoutClick(CardName,COFChallangeFlowConstants.CARDNAMEMAX);
		Assert.assertTrue(COFChallangeFlowConstants.CARDNAMEMAX.length()<=30);
	}

	@Then("^verify whether the entered card name is displayed$")
	public void verifyWhetherTheEnteredCardNameIsDisplayed() {
		Assert.assertTrue(
				isTextMatch(CardName.getText(), COFChallangeFlowConstants.CARDNAMEMAX));
	}

	@And("^user enters the card details in Add card screen$")
	public void userEntersTheCardDetailsInAddCardScreen() {

		waitFor(2000);
		enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
		enterTextWithoutClick(CardNo,COFChallangeFlowConstants.CARDNUM);
		enterTextWithoutClick(ExpDate,COFChallangeFlowConstants.EXPDATE);
		enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
		enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
		hideMobileKeyboard();
		enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
		hideMobileKeyboard();
		enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
		hideMobileKeyboard();
		enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
		hideMobileKeyboard();

	}


	@And("^user scrolls to Country name under Billing Details Section$")
	public void userScrollsToCountryNameUnderBillingDetailsSection() {

		ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, CountryField);
	}

	@Then("^user verifies the Country name as 'United Kingdom' by default$")
	public void userVerifiesTheCountryNameAsUnitedKingdomByDefault() {

		Assert.assertTrue(CountryField.getText().equalsIgnoreCase("United Kingdom"));
	}

	@When("^user adds five cards from the add card link in the Account Screen$")
	public void userAddsFiveCardsFromTheAddCardLinkInTheAccountScreen() {

		for(int i=1;i<=5;i++){
			clickButtonWithOutScroll(AccountMore);
			waitFor(2000);
			clickButtonWithOutScroll(AccountBtn);
			waitFor(1000);
			ScrollTo(COFChallangeFlowConstants.ACCOUNT, AccountConstants.IOSSCROLLUP, AddCard);
			clickButtonWithOutScroll(AddCard);
			waitFor(2000);
			enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
			enterTextWithoutClick(CardNo,COFChallangeFlowConstants.MAXCARD_+i);
			enterTextWithoutClick(ExpDate,COFChallangeFlowConstants.EXPDATE);
			enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
			enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
			hideMobileKeyboard();
			enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
			hideMobileKeyboard();
			enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
			hideMobileKeyboard();
			enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
			hideMobileKeyboard();
			ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
			clickButtonWithOutScroll(ConsentBox);
			clickButtonWithOutScroll(PaymtDone);

			if(isElementDisplayed(PassPhrase)){
				clickButtonWithOutScroll(Continue_BTN);
				enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
				clickButtonWithOutScroll(PassPhraseSubmit);
			}
			else if(isElementDisplayed(VerifyPwd)){
				waitFor(1000);
				staticTextValidation(EnterPwd,COFChallangeFlowConstants.ENTERPWD);
			}
			else{
				continue;
			}

		}
	}

	@And("^validates if the system disables the Add card link after adding a maximum of five cards$")
	public void validatesIfTheSystemDisablesTheAddCardLinkAfterAddingAMaximumOfFiveCards() {

			Assert.assertTrue(!isElementEnabled(AddCard));

	}

	@And("^user scrolls to Add card link$")
	public void userScrollsToAddCardLink() {
		ScrollTo(COFChallangeFlowConstants.ADDCARDSCROLL, AccountConstants.IOSSCROLLUP,AddCard);

	}

	@Then("^check if the address is auto filled in the address fields in billing section$")
	public void checkIfTheAddressIsAutoFilledInTheAddressFieldsInBillingSection() {
		String Address1=Addrs1.getText();
		String Address2=Addrs2.getText();
		String CityNew=City.getText();
		Assert.assertTrue(!(Address1.isEmpty()));
		Assert.assertTrue(!(Address2.isEmpty()));
		Assert.assertTrue(!(CityNew.isEmpty()));
	}

	@Then("^check consent checkbox and verifies the copy text displayed$")
	public void checkConsentCheckboxAndVerifiesTheCopyTextDisplayed() {
		ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
		clickButtonWithOutScroll(ConsentBox);
		staticTextValidation(ConsentBoxCopyText.getText(),COFChallangeFlowConstants.CONSENTSCROLL);
	}

	@Then("^user verifies the default input text for the Address field Line one under Billing Details Section$")
	public void userVerifiesTheDefaultInputTextForTheAddressFieldLineOneUnderBillingDetailsSection() {
		String CityValue=Addrs1.getAttribute("value");
		Assert.assertTrue(CityValue.equalsIgnoreCase("Address 1"));
	}

	@And("^verify whether the system navigates to Start fuelling now screen$")
	public void verifyWhetherTheSystemNavigatesToStartFuellingNowScreen() {
		waitFor(6000);
		isElementDisplayed(StartFuelingNow);
	}

	@And("^user scrolls down to Payment Method section in the Account screen$")
	public void userScrollsDownToPaymentMethodSectionInTheAccountScreen() {
		ScrollTo(COFChallangeFlowConstants.ADDCARDSCROLL, AccountConstants.IOSSCROLLUP, AddCard);
	}

	@And("^check whether Edit link is available near the Added card and tap on it$")
	public void checkWhetherEditLinkIsAvailableNearTheAddedCardAndTapOnIt() {
		isElementDisplayed(EditCard);
		clickButtonWithOutScroll(EditCard);
	}

	@And("^verify whether the Edit link is available near the added card$")
	public void verifyWhetherTheEditLinkIsAvailableNearTheAddedCard() {
		isElementDisplayed(EditCard);
	}

	@Then("^verify whether the card details are prepopulated in the Edit payment screen$")
	public void verifyWhetherTheCardDetailsArePrepopulatedInTheEditPaymentScreen() {
		String CardNameNew=CardName.getText();
		Assert.assertTrue(CardNameNew.length()>0);
		String ExpDateNew=ExpDate.getText();
		Assert.assertTrue(ExpDateNew.length()>0);
		String PostcodeNew=Postal.getText();
		Assert.assertTrue(PostcodeNew.length()>0);
		String AddressNew1=Addrs1.getText();
		Assert.assertTrue(AddressNew1.length()>0);
		String AddressNew2=Addrs2.getText();
		Assert.assertTrue(AddressNew2.length()>0);
		String CityNew1=City.getText();
		Assert.assertTrue(CityNew1.length()>0);

	}

	@And("^edit any of the fields under Edit Payment screen$")
	public void editAnyOfTheFieldsUnderEditPaymentScreen() {
		String CardNameNew=CardName.getText();
		CardName.getText().replace("Test","Test1");
		enterTextWithoutScroll(CVV,COFChallangeFlowConstants.CVV);
	}

	@And("^verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments$")
	public void verifyIfTheSystemDisplaysTheCheckboxAndCopyTextToUseTouchIDForAuthorizingPayments() {
		isElementDisplayed(TouchIdCheckBox);
		staticTextValidation(TouchIDCopyText,COFChallangeFlowConstants.TOUCHIDCOPYTEXT);

	}

	@And("^user scrolls down to Consent checkbox section$")
	public void userScrollsDownToConsentCheckboxSection() {
		ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
	}

	@Then("^user verifies the updated pop up and clicks on ok buttton$")
	public void userVerifiesTheUpdatedPopUpAndClicksOnOkButtton() {
		staticTextValidation(EditCardSuccess,COFChallangeFlowConstants.EDITCARDSUCCESS);
		clickButtonWithOutScroll(OkButton);

	}

	@Then("^user verifies the default input text for the Address field Line two under Billing Details Section$")
	public void userVerifiesTheDefaultInputTextForTheAddressFieldLineTwoUnderBillingDetailsSection() {
		String CityValue=Addrs2.getAttribute("value");
		Assert.assertTrue(CityValue.equalsIgnoreCase("Address 2"));
	}

	@Then("^user verifies the default input text for the Card Name under Billing Details Section$")
	public void userVerifiesTheDefaultInputTextForTheCardNameUnderBillingDetailsSection() {
		String Cardname=CardName.getAttribute("value");
		Assert.assertTrue(Cardname.equalsIgnoreCase("Name on card"));
	}

	@When("^user taps on the checkbox to use Touch ID for authorizing payments$")
	public void userTapsOnTheCheckboxToUseTouchIDForAuthorizingPayments() {
		clickButtonWithOutScroll(TouchIdCheckBox);
	}

	@Then("^verify if the system displays a tickmark on the checkbox and save it$")
	public void verifyIfTheSystemDisplaysATickmarkOnTheCheckboxAndSaveIt() {
		isElementDisplayed(TouchIdCheckBoxTick);
	}


}