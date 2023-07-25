package stepDefinitions;

import contants.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FrictionlessFlowSteps extends FrictionlessFlowPage {

	ContextualRegistrationPage contextualRegistrationPage = new ContextualRegistrationPage();
	NLIDPage nlidPage = new NLIDPage();
	AccountPage accountPage = new AccountPage();
	ProfileCompletionSteps profileCompletionSteps = new ProfileCompletionSteps();
	GuestCheckOutSteps guestCheckOutSteps = new GuestCheckOutSteps();
	GuestCheckOutPage guestCheckOutPage = new GuestCheckOutPage();
	COFChallangeFlowConstants cofChallangeFlowConstants = new COFChallangeFlowConstants();
	OffersPage OffersPage = new OffersPage();
	NLIDPage NLIDPage = new NLIDPage();
	PaymentMethodPage paymentMethodPage=new PaymentMethodPage();
	@Given("^install open the Esso app$")
	public void install_open_the_Esso_app() {
//		clickButtonWithOutScroll(AppSkip);
//		waitFor(2000);
//		clickButtonWithOutScroll(LocationFindBtn);
//		waitFor(2000);
	}

	@When("^user tab on register button from login screen$")
	public void user_tab_on_register_button_from_login_screen() throws Throwable {

		clickButtonWithOutScroll(RegisterTabBtn);
	}

	@Then("^enter the firstName$")
	public void enter_the_firstName() throws Throwable {

		enterTextWithoutClick(FirstName, FrictionlessFlowConstants.FirstName);
	}

	@Then("^enter the secondName$")
	public void enter_the_secondName() throws Throwable {

		enterTextWithoutClick(SecondName, FrictionlessFlowConstants.SecondName);
	}

	@Then("^enter the emailAddress$")
	public void enter_the_emailAddress() throws Throwable {

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		EmailIdUser.sendKeys("chandru.r+" + randomInt + "@photoninfotech.net");
	}

	@Then("^enter the password$")
	public void enter_the_password() throws Throwable {
		enterTextWithoutClick(ExistPassword, FrictionlessFlowConstants.LoggedPassword);
	}

	@Then("^enter the confirm password$")
	public void enter_the_confirm_password() throws Throwable {
		enterTextWithoutClick(ConfirmPassword, FrictionlessFlowConstants.ConfirmPassword);
		enterTextWithoutClick(MobileNumber, FrictionlessFlowConstants.MobileNumber);
	}

	@Then("^click the Accept checkBox$")
	public void click_the_Accept_checkBox() throws Throwable {

		if (isElementDisplayed(AcceptLink)) {
			clickButtonWithOutScroll(AcceptLink);
			waitFor(2000);
			clickButtonWithOutScroll(EmailLinkVerification);
			waitFor(2000);
			clickButtonWithOutScroll(AcceptLink);
		}
	}

	@Then("^click the continue button for register screen$")
	public void click_the_continue_button_for_register_screen() throws Throwable {
		clickButtonWithOutScroll(ContinueButton);

	}

	@Then("^click the skip button$")
	public void click_the_skip_button() throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(SkipButton);
		waitFor(2000);
		clickButtonWithOutScroll(SkipAnyway);

	}

	@Then("^click the accept button$")
	public void click_the_accept_button() throws Throwable {
		closingTheAlertPopUp();

	}

	@Then("^click the Start FuelButton$")
	public void click_the_Start_FuelButton() throws Throwable {
		clickButtonWithOutScroll(paymentCreationBtn);
		clickButtonWithOutScroll(StartFuelBtn);
		clickButtonWithOutScroll(AddToCardOkBtn);
	}

	@Then("^click AddPayment button$")
	public void click_AddPayment_button() throws Throwable {
		clickButtonWithOutScroll(AddtoCardBtn);
	}

	@Then("^click Debit/Credit card$")
	public void click_Debit_Credit_card() throws Throwable {
		clickButtonWithOutScroll(AddtoCardDebitBtn);
	}

	@Then("^set the Esso PIN$")
	public void set_the_Esso_PIN() throws Throwable {
		enterTextWithoutClick(PIN1, FrictionlessFlowConstants.PIN1);
		enterTextWithoutClick(PIN2, FrictionlessFlowConstants.PIN2);
		enterTextWithoutClick(PIN3, FrictionlessFlowConstants.PIN3);
		enterTextWithoutClick(PIN4, FrictionlessFlowConstants.PIN4);
	}

	@Then("^click the continue button$")
	public void click_the_continue_button() throws Throwable {
		clickButtonWithOutScroll(PINContinueBtn);
		clickButtonWithOutScroll(PINAddedSucessBtn);
	}

	@Then("^user enter PIN for unlock the app for fueling$")
	public void user_enter_PIN_for_unlock_the_app_for_fueling() throws Throwable {

	}

	@Then("^enter the card details$")
	public void enter_the_card_details() throws Throwable {
		enterTextWithoutClick(NameOnCard, FrictionlessFlowConstants.CardName);
		// enterTextWithoutClick(CardNumber, FrictionlessFlowConstants.CARDNumber);
		clickButtonWithOutScroll(CardExpDate);
		clickButtonWithOutScroll(CardExpDateBtn);
		enterTextWithoutClick(SecurityCode, FrictionlessFlowConstants.SecurityCode);
		clickButtonWithOutScroll(AddressSearchopn);
		clickButtonWithOutScroll(ChooseAddress);
		clickButtonWithOutScroll(SelectAddress);
	}

	@Then("^accept checkbox$")
	public void accept_checkbox() throws Throwable {
		clickButtonWithOutScroll(ADDtoCardChkBox);
		clickButtonWithOutScroll(ADDtoCardChkBox2);
		clickButtonWithOutScroll(AddToCardDoneBtn);
	}

	@Then("^continue payment button$")
	public void continue_payment_button() {

	}

	@Given("^user login the screen$")
	public void user_login_the_screen() {
		if (isElementDisplayedWithoutAssert(AppSkip)) {
			clickButtonWithOutScroll(AppSkip);
			clickButtonWithOutScroll(LocationFindBtn);
		}

	}

	@When("^user taps on login  button in login screen")
	public void user_taps_on_login_button_in_login_screen() {
		clickButtonWithOutScroll(loginBtn);
		enterTextWithoutClick(EmailAddress, FrictionlessFlowConstants.LoggedEmail);
		enterTextWithoutClick(LoginPassword, FrictionlessFlowConstants.LoggedPassword);
		clickButtonWithOutScroll(LoginPasswordBtn);
	}

	@And("^user on More button in tab bar$")
	public void user_on_More_button_in_tab_bar() {
		clickButtonWithOutScroll(TabMoreBtn);
		
	}

	@And("^user navigate to account screen$")
	public void user_navigate_to_account_screen() {
		clickButtonWithOutScroll(AccountTab);
		
	}

	@Then("^verify the card number$")
	public void verify_the_card_number() {
		staticTextValidation(CardNumberOne, FrictionlessFlowConstants.CardNumber);

	}

	@Then("^verify tick mark in payment method$")
	public void verify_tick_mark_in_payment_method() {
		isElementDisplayed(CardTicMark);

	}

	@Then("^verify card logo$")
	public void verify_card_logo() {
		if (isElementDisplayed(CardLogo)) {
			System.out.println("image is present");
		} else {
			System.out.println("image is not present");

		}

	}

	@Then("^user select pumb and tap on continue button$")
	public void user_select_pumb_and_tap_on_continue_button() {

		waitFor(3000);
		if (isElementDisplayedWithoutAssert(guestCheckOutPage.LocationContinueButton)) {
			clickButtonWithOutScroll(guestCheckOutPage.LocationContinueButton);
			waitFor(1000);
			driver.switchTo().alert().accept();
			waitFor(4000);
			staticTextValidation(guestCheckOutPage.SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
			clickButtonWithOutScroll(TabPumbcotinueBtn);
		} else if (isElementDisplayedWithoutAssert(guestCheckOutPage.SelectYourPump)) {
			waitFor(2000);
			staticTextValidation(guestCheckOutPage.SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
			clickButtonWithOutScroll(TabPumbcotinueBtn);
		}


	}

	@And("^user enter the confirms the payment button$")
	public void user_enter_the_confirm_the_payment_button() {
		waitForElement(PaymentConfirm, 5);
		clickButtonWithOutScroll(PaymentConfirm);
		waitFor(20000);
	}

	@And("^user enter the Enter PIN number$")
	public void user_enter_the_Enter_PIN_number() {

		enterTextWithoutClick(PIN1, FrictionlessFlowConstants.PIN1);
		enterTextWithoutClick(PIN2, FrictionlessFlowConstants.PIN2);
		enterTextWithoutClick(PIN3, FrictionlessFlowConstants.PIN3);
		enterTextWithoutClick(PIN4, FrictionlessFlowConstants.PIN4);
	}

	@Then("^Tap the continue button$")
	public void Tab_the_continue_button() {
		waitFor(20000);
		clickButtonWithOutScroll(PINContinueBtn);

	}

	@And("^user able to see the cancel button$")
	public void user_able_to_see_the_cancel_button()
	{
		staticTextValidation(PINCanceBtn, FrictionlessFlowConstants.EssoPINCancel);
		waitFor(2000);
	}

	@Then("^user able to see the screen label for Enter your Esso PIN to Authorize Payment$")
	public void user_able_to_see_the_screen_lable_for_Enter_your_Esso_PIN_to_Authorize_Payment() {
		staticTextValidation(PINText, FrictionlessFlowConstants.EnterPINTxt);
	}

	@Then("^user able to see the Forgot password Screen$")
	public void user_able_to_see_the_Forgot_password_Screen() {
		staticTextValidation(PINForgotlINK, FrictionlessFlowConstants.EssopwdLink);
	}

	@Then("^user able to see the Esso PIN on Account Screen$")
	public void user_able_to_see_the_Esso_PIN_on_Account_Screen() {
		waitFor(2000);
		staticTextValidation(EssoPINScreen, FrictionlessFlowConstants.EssoPIN);
	}

	@Then("^enter the edit button$")
	public void enter_the_edit_button() {
		clickButtonWithOutScroll(EssoPINEdit);
	}

	@Then("^click the Forgot your password link$")
	public void click_the_Forgot_your_password_link() {
		clickButtonWithOutScroll(ForgotPWD);

	}

	@Then("^user able to see the back button$")
	public void user_able_to_see_the_back_button() {
		isElementDisplayed(backBtn);

	}

	@Then("^user able to verify the forgot text and email address$")
	public void user_able_to_verify_the_forgot_text_and_email_address() {
		staticTextValidation(ForgotPWDTxt, FrictionlessFlowConstants.ForgotPwd);
		waitFor(20000);
		staticTextValidation(EmailAddressverify, FrictionlessFlowConstants.EmailAddres);
	}

	@Then("^user able to see the send button$")
	public void user_able_to_see_the_send_button() {
		staticTextValidation(SendBtn, FrictionlessFlowConstants.SendBtn);

	}

	@Then("^user click forgot button$")
	public void user_click_forgot_button() {
		clickButtonWithOutScroll(ForgotPWD);

	}

	@And("^user able see the Enter password text$")
	public void user_able_see_the_Enter_password_text() {
		staticTextValidation(EnterPWDText, FrictionlessFlowConstants.pwdtxt);
	}

	@And("^user able to see esso app password text$")
	public void user_able_to_see_esso_app_password_text() {
		staticTextValidation(passprocedtxt, FrictionlessFlowConstants.proceedtxt);
	}

	@And("^user able to view the password$")
	public void user_able_to_view_the_password() {
		enterTextWithoutClick(ForgotPwdEnter, FrictionlessFlowConstants.LoggedPassword);
		waitFor(2000);
		clickButtonWithOutScroll(toggle);
		staticTextValidation(Submit, FrictionlessFlowConstants.continuebtn);
		staticTextValidation(Forgotpwdlink, FrictionlessFlowConstants.ForgotPwdtxt);
	}
	
	@And("^user should enter wrong PIN three times$")
	public void user_should_enter_wrong_PIN_three_times()
	{
		for(int i=1;i<=3;i++)
		{
//			enterTextWithoutClick((MobileElement)driver.findElementById("com.firstdata.mpl.qa:id/security_pin_entry_code1"), FrictionlessFlowConstants.PIN1);
//			enterTextWithoutClick((MobileElement)driver.findElementById("com.firstdata.mpl.qa:id/security_pin_entry_code2"), FrictionlessFlowConstants.PIN2);
//			enterTextWithoutClick((MobileElement)driver.findElementById("com.firstdata.mpl.qa:id/security_pin_entry_code3"), FrictionlessFlowConstants.PIN3);
//			enterTextWithoutClick((MobileElement)driver.findElementById("com.firstdata.mpl.qa:id/security_pin_entry_code4"), FrictionlessFlowConstants.PIN4);
			enterTextWithoutClick(EssoPIN1,FrictionlessFlowConstants.PIN1);
			enterTextWithoutClick(EssoPIN2,FrictionlessFlowConstants.PIN2);
			enterTextWithoutClick(EssoPIN3,FrictionlessFlowConstants.PIN3);
			enterTextWithoutClick(EssoPIN4,FrictionlessFlowConstants.PIN4);
			clickButtonWithOutScroll(PINContinueBtn);
		}}
	
	@And ("^user should verify navigate to Enter password Screen$")
	public void user_should_verify_navigate_to_Enter_password_Screen()
	{
		staticTextValidation(ForgotPwdTxt, FrictionlessFlowConstants.EssopwdTxt);
	}
	@And("^user tap the cancel button$")
	public void user_tap_the_cancel_button()
	{
		clickButtonWithOutScroll(EssoPinCancel);
	}
	
	@And ("^user enter the edit button$")
	public void user_enter_the_edit_button()
	{
		clickButtonWithOutScroll(PayEditBtn);
		
	}
	@And ("^user able to see the edit payment method$")
	public void user_able_to_see_the_edit_payment_method()
	{
		staticTextValidation(PayEditscreen, FrictionlessFlowConstants.payEdidScreen);
		
		
	}
	
	@And ("^enter the Add card button$")
	public void enter_the_Add_card_button()
	{
	clickButtonWithOutScroll(AddToCardBtn);	
	}
	
	@And ("^user enter card Name$")
	public void user_enter_card_Name()
	{
		enterTextWithoutScroll(EnterCardName, FrictionlessFlowConstants.CardNameDC);
	}
	@And ("^user enter card number$")
	public void user_enter_card_number()
	{
		enterTextWithoutClick(EnterCArdNumber, FrictionlessFlowConstants.CardNumberfull);
	}
	@And ("^user enter card exp date$")
	public void user_enter_card_exp_date()
	{
		clickButtonWithOutScroll(EnterExpDate);
		clickButtonWithOutScroll(EnterExpbtn);
	}
	@And ("^enter security code$")
	public void enter_security_code() throws Exception
	{
		enterTextWithoutClick(EnterSecurityCode, FrictionlessFlowConstants.SecurityNumber);
		hideMobileKeyboard();
		waitFor(2000);
//		scrollbyCoordinatesUsingTouchActions(100, 700, 100, 200);
	}
	@And ("^enter postcode$")
	public void enter_postcode()
	{
		
		enterTextWithoutClick(EnterPOSTALCode, FrictionlessFlowConstants.Postalcode);
		waitFor(2000);
		clickButtonWithOutScroll(Searchbtn);
		clickButtonWithOutScroll(addresText);
		waitFor(2000);
		clickButtonWithOutScroll(SelectBtn);	
	}
	@And  ("^user enter security code$")
	public void user_enter_security_code()
	{
		enterTextWithoutClick(EnterSecurityCode, FrictionlessFlowConstants.SecurityNumber);
		hideMobileKeyboard();
		waitFor(2000);
		//scrollbyCoordinatesUsingTouchActions(100, 700, 100, 200);
		
	}
	
	@And("^enter continue button show the error message$")
	public void enter_continue_button_show_the_error_message()
	{
		clickButtonWithOutScroll(AcceptlINKONE);
		clickButtonWithOutScroll(AcceptlINKTWO);
		clickButtonWithOutScroll(PaymentDoneBtn);
		clickButtonWithOutScroll(EnterExpbtn);
		  Assert.assertTrue(isTextMatch(ExpErroMessage.getText(),
				  FrictionlessFlowConstants.ExpMessage));
		
	}
	@And  ("^user enter postcode$")
	public void user_enter_postcode()
	{
		waitFor(2000);
		enterTextWithoutClick(EnterPOSTALCode, FrictionlessFlowConstants.Postalcode);
	}
	
	@And ("^user able to see the search icon$")
	public void user_able_to_see_the_search_icon()
	{
		if(isElementDisplayed(Searchbtn))
		{
			System.out.println("Search icon available!");
		}else
		{
			System.out.println("Not Available");
			
	}
		
		
}

@And("^user should able to view inline error message without enter the postcode$")
public void user_should_able_to_view_inline_error_message_without_enter_the_postcode() throws Throwable {

	 hideMobileKeyboard();
	if(isElementDisplayed(AcceptlINKONE))
	{

	clickButtonWithOutScroll(AcceptlINKONE);

	clickButtonWithOutScroll(AcceptlINKTWO);
	
	clickButtonWithOutScroll(PaymentDoneBtn);
	waitFor(2000);
	clickButtonWithOutScroll(EnterExpbtn);
	  Assert.assertTrue(isTextMatch(EnterPOSTALErrortxt.getText(),
			  FrictionlessFlowConstants.PostCodeTxt));
	}
   
}

@And ("^user able to view billing details$")
public void user_able_to_view_billing_details()
{
		waitFor(2000);
		clickButtonWithOutScroll(BillingIcon);
		//Assert.assertTrue(isTextMatch(BillingTxticon.getText(),FrictionlessFlowConstants.Billingtxt));
Assert.assertEquals("Billing icon text should be matched", BillingTxticon.getText(), FrictionlessFlowConstants.Billingtxt);
		clickButtonWithOutScroll(BillingokBtn);
		waitFor(2000);
		staticTextValidation(AddressFiled, FrictionlessFlowConstants.Addresss);
	
}


@When("^checkbox icon should display the accept link text$")
public void checkbox_icon_should_display_the_accept_link_text() throws Throwable {
	clickButtonWithOutScroll(AcceptlINKONE);
	clickButtonWithOutScroll(AcceptlINKTWO);
	waitFor(2000);
	Assert.assertTrue(isTextMatch(AcceptlINKTWOTxt.getText(),
			  FrictionlessFlowConstants.LinkTxxt));
	clickButtonWithOutScroll(PaymentDoneBtn);
	clickButtonWithOutScroll(EnterExpbtn);
	
}
@When("^enter \"([^\"]*)\" in login details$")
public void enter_in_login_details(String arg1) throws Throwable {
   
}

	@And("^user clicks on Add credit or debit card$")
	public void user_clicks_on_add_credit_or_debit_card() throws Throwable {
		clickButtonWithOutScroll(payment_AddCreditDebit_Btn);
	}

	@Then("^user verifies the Set Up pin screen with numeric keypad$")
	public void user_verifies_the_set_up_pin_screen_with_numeric_keypad() throws Throwable {
		clickButtonWithOutScroll(profileCompletionSteps.card_Pin_Num1);
		isElementDisplayed(set_Pin_Screen);

	}

	@And("^user sets the pin number$")
	public void user_sets_the_pin_number() throws Throwable {

		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num1,FrictionlessFlowConstants.PIN1 );
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num2, FrictionlessFlowConstants.PIN2);
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num3, FrictionlessFlowConstants.PIN3);
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num4, FrictionlessFlowConstants.PIN4);
	}

	@Then("^user clicks on continue$")
	public void user_clicks_on_continue() throws Throwable {
		clickButtonWithOutScroll(payment_Pin_Continue_Btn);
	}

	@Then("^user verifies the popup and clicks on ok button$")
	public void user_verifies_the_popup_and_clicks_on_ok_button() throws Throwable {

		if(platformName.equalsIgnoreCase("Android")){
			isElementDisplayed(pin_Confirm);
			clickButtonWithOutScroll(pin_Confirm_Ok_Btn);
		}
		else if(platformName.equalsIgnoreCase("iOS")) {
			waitFor(6000);
			staticTextValidation(pinSuccessMessage,FrictionlessFlowConstants.pinSuccessMessage);
			clickButtonWithOutScroll(invalidPasswordError_popup_ok_btn);
		}
		else {
			waitForElement(pin_Confirm,6000);
			isElementDisplayed(pin_Confirm);
			clickButtonWithOutScroll(pin_Confirm_Ok_Btn);
			clickButtonWithOutScroll(AppSkip);
		}
	}

	@And("^user enters the card number$")
	public void user_enters_the_card_number() throws Throwable {

		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNUMBER);
		hideMobileKeyboard();
		ScrollTo(FrictionlessFlowConstants.ConsentScroll22, FrictionlessFlowConstants.IOSSCROLLUP, ConsentBox11);
		waitFor(2000);
	}

	@And("^user checks for verifies the logo color$")
	public void user_checks_for_verifies_the_logo_color() throws Throwable {
		if (platformName.equalsIgnoreCase("Android"))
		{
			isElementDisplayed(card_Details_Master_Logo);
		}else {

			isElementEnabled(card_Details_Master_Logo);
		}

	}

	@Then("^user click card details in Credit debit screen$")
	public void user_click_card_details_in_credit_debit_screen() throws Throwable {

		clickButtonWithOutScroll(card_Number_CreditDebit_Card);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();
	}

	@Then("^user clicks on continue button in Card screen$")
	public void user_clicks_on_continue_button_in_card_screen() throws Throwable {
		waitFor(5000);
		ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, add_CreditDebit_Continue_Btn);
		clickButtonWithOutScroll(add_CreditDebit_Continue_Btn);
		waitFor(6000);
	}

	@Then("^user verifies the inline error message for card number field$")
	public void user_verifies_the_inline_error_message_for_card_number_field() throws Throwable {
		staticTextValidation(add_CreditDebit_Cardnumber_Inline_Error, FrictionlessFlowConstants.CARDNUMBERINLINEERRORMSG);

	}

	@Then("^user clicks on card number$")
	public void user_clicks_on_card_number() throws Throwable {
		clickButtonWithOutScroll(card_Number_CreditDebit_Card);
		hideMobileKeyboard();
	}

	@And("^user checks for the keypad$")
	public void user_checks_for_the_keypad() throws Throwable {
		isElementDisplayed(set_Pin_Screen);
	}

	@Then("^user clicks on the expiry date and month$")
	public void user_clicks_on_the_expiry_date_and_month() throws Throwable {
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
	}

	@And("^user verifies the expiry month and date screen$")
	public void user_verifies_the_expiry_month_and_date_screen() throws Throwable {
		isElementDisplayed(card_Exp_DateMonth_screen);
	}

	@Then("^user clicks back to the NLID screen$")
	public void user_clicks_back_to_the_nlid_screen() throws Throwable {

		androidBack();
		androidBack();
	}

	@Then("^user clicks on esso pin edit$")
	public void user_clicks_on_esso_pin_edit() throws Throwable {
		clickButtonWithOutScroll(account_Esso_Pin_Edit);

	}

	@Then("^user enters the esso password$")
	public void user_enters_the_esso_password() throws Throwable {

		enterTextWithoutClick(esso_Pin_Edit_Password,FrictionlessFlowConstants.ESSOPASSWORD);
	}

	@And("^user clicks on continue button in password screen$")
	public void user_clicks_on_continue_button_in_password_screen() throws Throwable {

		clickButtonWithOutScroll(esso_Pin_Edit_Password_Continue);
	}

	@Then("^user verifies the set new pin screen$")
	public void user_verifies_the_set_new_pin_screen() throws Throwable {

		isElementDisplayed(esso_New_Pin_Screen);
	}

	@And("^user clicks on esso link in Account$")
	public void user_clicks_on_esso_link_in_account() throws Throwable {

		clickButtonWithOutScroll(essolink_In_Account);
	}

	@Then("^user verifies the Set Esso link screen$")
	public void user_verifies_the_set_esso_link_screen() throws Throwable {

		isElementDisplayed(essolink_Screen);
	}

	@And("^user clicks on Continue without entering PIN$")
	public void user_clicks_on_continue_without_entering_pin() throws Throwable {

		clickButtonWithOutScroll(set_Up_Pin_Continue);
	}

	@Then("^user verifies the inline error message$")
	public void user_verifies_the_inline_error_message() throws Throwable {

		isElementDisplayed(set_Up_Pin_Inline_Error_Msg);
	}

	@And("^user clicks on i icon in security code$")
	public void user_clicks_on_i_icon_in_security_code() throws Throwable {
		clickButtonWithOutScroll(iicon_Security_Code);
	}

	@Then("^user verifies the Visa and MasterCard in pop up$")
	public void user_verifies_the_visa_and_mastercard_in_pop_up() throws Throwable {
		isElementDisplayed(popup_I_Icon);
	}

	@And("^user sets the pin for first$")
	public void user_sets_the_pin_for_first() throws Throwable {

		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num1,FrictionlessFlowConstants.PIN1 );

	}

	@Then("^user verifies the first pin displayed as dot$")
	public void user_verifies_the_first_pin_displayed_as_dot() throws Throwable {

		isElementDisplayed(pin_Dot);
	}

	@Then("^user enters the valid credentials$")
	public void user_enters_the_valid_credentials() throws Throwable {
		clickButtonWithOutScroll(userName);
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
			clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
		}
		enterTextWithoutScroll(cmpltd_Username_Login, ProfileCompletionConstants.COMPLTDLOGINUSERNAME);
		enterTextWithoutClick(cmpltd_Password_Login, ProfileCompletionConstants.REGISTERPASS);
	}

	@And("^user clicks on start fueling icon$")
	public void user_clicks_on_start_fueling_icon() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			waitFor(3000);
			isElementDisplayed(completed_Popup);
			clickButtonWithOutScroll(completed_Popup);
			waitFor(7000);
			clickButtonWithOutScroll(start_Fueling_Icon);
		}else {

			waitFor(7000);
			clickButtonWithOutScroll(start_Fueling_Icon);
		}
	}

	@Then("^user clicks on continue button in pump screen$")
	public void user_clicks_on_continue_button_in_pump_screen() throws Throwable {
		waitFor(7000);
		clickButtonWithOutScroll(continue_Btn_Pump);
	}

	@And("^user clicks on pay with paypal in payment screen$")
	public void user_clicks_on_pay_with_paypal_in_payment_screen() throws Throwable {
		waitFor(7000);
		clickButtonWithOutScroll(paypal_Btn_Payment);
	}

	@Then("^user clicks on continue Button in fueling screen$")
	public void user_clicks_on_continue_button_in_fueling_screen() throws Throwable {

		clickButtonWithOutScroll(paypal_Continue_Btn);
	}

	@Then("^user verifies the set up pin back link and screen title$")
	public void user_verifies_the_set_up_pin_back_link_and_screen_title() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			isElementDisplayed(setpin_Title);
			isElementDisplayed(set_Pin_Screen);
		}
		else{
			Assert.assertTrue(isTextMatch(setpin_Title.getText(), FrictionlessFlowConstants.SETUPPIN));
			Assert.assertTrue(isTextMatch(setpin_Copytext.getText(), FrictionlessFlowConstants.SETUPPINCOPYTEXT));
			isElementDisplayed(PINCanceBtn);
		}
	}

	@Then("^user verifies the Add Payment Method in Complete Profile screen$")
	public void user_verifies_the_add_payment_method_in_complete_profile_screen() throws Throwable {

		isElementDisplayed(profileCompletionSteps.payment_Methd_Btn);
	}

	@And("^user clicks on Add card link$")
	public void user_clicks_on_add_card_link() throws Throwable {

		waitFor(2000);
		clickButtonWithOutScroll(AddToCardBtn);
	}

	@Then("^user verifies the card details screen$")
	public void user_verifies_the_card_details_screen() throws Throwable {

		isElementDisplayed(carddetails_Screen);
	}

	@And("^user taps on the Address field$")
	public void user_taps_on_the_address_field() throws Throwable {

		clickButtonWithOutScroll(second_Address_Field);
	}

	@Then("^user verifies the keypad for second address field$")
	public void user_verifies_the_keypad_for_second_address_field() throws Throwable {

		isElementDisplayed(second_Address_Field_Keypad);
	}

	@And("^user clicks on postcode field$")
	public void user_clicks_on_postcode_field() throws Throwable {
		clickButtonWithOutScroll(postcode_Field);
	}

	@Then("^user verifies the postcode field as input field$")
	public void user_verifies_the_postcode_field_as_input_field() throws Throwable {

		isElementDisplayed(postcode_Field);
	}

	@And("^user taps on search icon$")
	public void user_taps_on_search_icon() throws Throwable {

		clickButtonWithOutScroll(search_Icon);
	}

	@Then("^user verifies the search icon and click ok button$")
	public void user_verifies_the_search_icon_and_click_ok_button() throws Throwable {

		isElementDisplayed(search_Icon_Popup_Msg);
		clickButtonWithOutScroll(search_Icon_Ok_Btn);
	}

	@Then("^user click on the edit esso link$")
	public void user_click_on_the_edit_esso_link() throws Throwable {

		clickButtonWithOutScroll(EssoPINEdit);
	}

	@And("^user taps on forgot password in PIN$")
	public void user_taps_on_forgot_password_in_pin() throws Throwable {

		clickButtonWithOutScroll(forgot_Password_Pin);
	}

	@Then("^user verifies the forgot password screen with enter password btn cancel btn and continue btn$")
	public void user_verifies_the_forgot_password_screen_with_enter_password_btn_cancel_btn_and_continue_btn() throws Throwable {

		isElementDisplayed(enter_Password_ForgetPass);
		isElementDisplayed(cancel_Icon_ForgetPass);
		isElementDisplayed(enterpass_ForgetPass);
		//staticTextValidation(forgetPass_ForgetPass, FrictionlessFlowConstants.FORGOTPASS);
		isElementDisplayed(forgetPass_ForgetPass);
		isElementDisplayed(continue_ForgetPass);
	}

	@And("^user taps on forget password link$")
	public void user_taps_on_forget_password_link() throws Throwable {

		clickButtonWithOutScroll(forgetPass_ForgetPass);
	}

	@Then("^user clicks on send button to re login$")
	public void user_clicks_on_send_button_to_re_login() throws Throwable {

		clickButtonWithOutScroll(send_Btn_ForgetPass);
	}

	@Then("^user clicks on Got it button in the popup$")
	public void user_clicks_on_got_it_button_in_the_popup() throws Throwable {

		clickButtonWithOutScroll(cardDetails_I_Gotit_Icon);
	}

	@And("^user enters the wrong password in enter password field$")
	public void user_enters_the_wrong_password_in_enter_password_field() throws Throwable {

		enterTextWithoutClick(forgetPin_Password_Field, FrictionlessFlowConstants.WRONGPASS);
	}

	@Then("^user clicks on continue icon in Forget password Screen$")
	public void user_clicks_on_continue_icon_in_forget_password_screen() throws Throwable {

		clickButtonWithOutScroll(continue_ForgetPass);
	}

	@And("^user clicks ok icon in the pop up$")
	public void user_clicks_ok_icon_in_the_pop_up() throws Throwable {

		waitFor(3000);
		clickButtonWithOutScroll(forgetPin_Ok_Btn);
	}

	@Then("^user verifies the system navigated to NLID screen$")
	public void user_verifies_the_system_navigated_to_nlid_screen() throws Throwable {

		isElementDisplayed(back_To_NLID);
	}

	@Then("^user verifies the Billing address in the screen$")
	public void user_verifies_the_billing_address_in_the_screen() throws Throwable {
		waitFor(2000);
		isElementDisplayed(card_Details_Billing_Icon);
	}

	@Then("^user verifies the Billing address i icon in Card details screen$")
	public void user_verifies_the_billing_address_i_icon_in_card_details_screen() throws Throwable {
		waitFor(8000);
		isElementDisplayed(billing_Details_Field);
		isElementDisplayed(card_Details_Billing_I_Icon);
		if(isElementDisplayed(billing_Details_Field))
		{
			clickButtonWithOutScroll(billing_Details_Field);
			clickButtonWithOutScroll(card_Details_Billing_I_Icon);
			staticTextValidation(billingLable,"Your billing details must match the exact address registered with the issuing bank.");
		  clickButtonWithOutScroll(billingLableoK);
		}

	}

	@Then("^user verifies the entered pin as dot$")
	public void user_verifies_the_entered_pin_as_dot() throws Throwable {

		staticTextValidation(EssoPIN1,FrictionlessFlowConstants.PINDOT);
		staticTextValidation(EssoPIN2,FrictionlessFlowConstants.PINDOT);
		staticTextValidation(EssoPIN3,FrictionlessFlowConstants.PINDOT);
		staticTextValidation(EssoPIN4,FrictionlessFlowConstants.PINDOT);
	}

	@And("^user enters the five number in post code$")
	public void user_enters_the_five_number_in_post_code() throws Throwable {

		enterTextWithoutClick(post_Code_Card_Details,FrictionlessFlowConstants.POSTCODE);
	}

	@Then("^user verifies the search icon enables next to post code$")
	public void user_verifies_the_search_icon_enables_next_to_post_code() throws Throwable {

		isElementDisplayed(enable_Search_Icon);
	}

	@And("^user clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {

		clickButtonWithOutScroll(enable_Search_Icon);
	}

	@Then("^user verifies the search post code look up screen$")
	public void user_verifies_the_search_post_code_look_up_screen() throws Throwable {

		isElementDisplayed(post_Code_Lookup_Screen1);
		isElementDisplayed(post_Code_Lookup_Screen2);
		staticTextValidation(billing_Postcode_Address, FrictionlessFlowConstants.POSTCODEADDRESS );
	}

	@And("^user clicks on search icon next to post code$")
	public void user_clicks_on_search_icon_next_to_post_code() throws Throwable {

		clickButtonWithOutScroll(enable_Search_Icon);
	}

	@Then("^user verifies the pop up screen$")
	public void user_verifies_the_pop_up_screen() throws Throwable {

		isElementDisplayed(postcode_Popup);
		clickButtonWithOutScroll(Ok);
	}

	@Then("^user verifies the forgot password and back button and In order to reset your password, an email will be sent to your address and send button$")
	public void user_verifies_the_forgot_password_and_back_button_and_in_order_to_reset_your_password_an_email_will_be_sent_to_your_address_and_send_button() throws Throwable {

		staticTextValidation(enter_Password_ForgetPass,FrictionlessFlowConstants.FORGOTPASS);
		isElementDisplayed(forgotpass_text);
		isElementDisplayed(forgotPass_Send_Btn);
		isElementDisplayed(backBtn);
	}

	@And("^user clicks on City field$")
	public void user_clicks_on_city_field() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(cardDetails_City_Field);
		}
		else{
			clickButtonWithOutScroll(City);
		}
	}

	@Then("^user enters maximum of fifty characters above fifty user will not be able to enter$")
	public void user_enters_maximum_of_fifty_characters_above_fifty_user_will_not_be_able_to_enter() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			enterTextWithoutClick(cardDetails_City_Field, FrictionlessFlowConstants.CITYFIELD);
		}
		else{
			enterTextWithoutClick(City, FrictionlessFlowConstants.CITYFIELD);
			Assert.assertTrue(FrictionlessFlowConstants.CITYFIELD.length() <= 50);
		}
	}

	@Then("^user enters the card details except expiry date$")
	public void user_enters_the_card_details_except_expiry_date() throws Throwable {

		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();
	}

	@Then("^user verifies the inline error message for expiry date$")
	public void user_verifies_the_inline_error_message_for_expiry_date() throws Throwable {
		staticTextValidation(expiry_Date_Inline_Error_Msg, FrictionlessFlowConstants.EXPINLINEERRMSG);
	}

	@And("^user enters the card details except city name$")
	public void user_enters_the_card_details_except_city_name() throws Throwable {
		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();

	}

	@Then("^user verifies the inline error message for city name$")
	public void user_verifies_the_inline_error_message_for_city_name() throws Throwable {

		staticTextValidation(city_Name_Inline_Error_Msg, FrictionlessFlowConstants.CITYINLINEERRMSG);
	}

	@And("^user enters the card details except security code$")
	public void user_enters_the_card_details_except_security_code() throws Throwable {
		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, FrictionlessFlowConstants.CardNameS);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		clickButtonWithOutScroll(billing_Details_Expiry_Date_Ok);
		enterTextWithoutScroll(PostCode, FrictionlessFlowConstants.PostCode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, FrictionlessFlowConstants.Address);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, FrictionlessFlowConstants.Address2);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();

		if(platformName.equalsIgnoreCase("Android")){
			clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		}

	}

	@Then("^user verifies the inline error message for security code$")
	public void user_verifies_the_inline_error_message_for_security_code() throws Throwable {
		staticTextValidation(security_Code_Inline_Err_Msg, FrictionlessFlowConstants.SECURITYCODEINLNEERRMSG);
		waitFor(2000);

	}

	@Then("^user clicks on i icon and verifies the pop up message$")
	public void user_clicks_on_i_icon_and_verifies_the_pop_up_message() throws Throwable {

		clickButtonWithOutScroll(card_Details_Billing_I_Icon);
		staticTextValidation(iicon_Popup_Msg, FrictionlessFlowConstants.ICONPOPUPMSG);
	}

	@And("^user clicks on ok button$")
	public void user_clicks_on_ok_button() throws Throwable {

		clickButtonWithOutScroll(iicon_Popup_Msg_Ok_Btn);
	}

	@And("^user clicks on Name on card field and enters a name$")
	public void user_clicks_on_name_on_card_field_and_enters_a_name() throws Throwable {

		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
	}

	@And("^user enters wrong pin$")
	public void user_enters_wrong_pin() throws Throwable {
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num1 ,"5");
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num2 ,"6");
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num3, "7");
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num4, "8");
	}

	@Then("^user verifies the inline error message for entering wrong pin$")
	public void user_verifies_the_inline_error_message_for_entering_wrong_pin() throws Throwable {

		staticTextValidation(wrong_Pin_Inline_Err_Msg, FrictionlessFlowConstants.WRONGPININLINEERRMSG);
	}

	@And("^user taps on First Address field and verifies keypad$")
	public void user_taps_on_first_address_field_and_verifies_keypad() throws Throwable {

		clickButtonWithOutScroll(Address1);
	}

	@Then("^user enters the fifty characters in Address field$")
	public void user_enters_the_fifty_characters_in_address_field() throws Throwable {

		enterTextWithoutClick(Address1, FrictionlessFlowConstants.CITYFIELD);
	}
	@Then("^user verifies the forgot password screen$")
	public void user_verifies_the_forgot_password_screen() throws Throwable {

		isElementDisplayed(enter_Password_ForgetPass);
	}

	@And("^user enters eight digit number in the post code field$")
	public void user_enters_eight_digit_number_in_the_post_code_field() throws Throwable {

		enterTextWithoutClick(post_Code_Card_Details, FrictionlessFlowConstants.EIGHTNUMPOSTCODE);
		hideMobileKeyboard();

	}

	@Then("^user verifies the entered digits in post code field$")
	public void user_verifies_the_entered_digits_in_post_code_field() throws Throwable {

			staticTextValidation(post_Code_Card_Details, FrictionlessFlowConstants.EIGHTNUMPOSTCODE);
	}

	@And("^user taps on second Address Field$")
	public void user_taps_on_second_address_field() throws Throwable {

		clickButtonWithOutScroll(billing_Details_Second_Address);
	}

	@Then("^user enters the fifty characters in second Address Field$")
	public void user_enters_the_fifty_characters_in_second_address_field() throws Throwable {

		enterTextWithoutClick(billing_Details_Second_Address,FrictionlessFlowConstants.CITYFIELD);
	}

	@And("^user enters card details except address field$")
	public void user_enters_card_details_except_address_field() throws Throwable {

		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();

	}

	@Then("^user verifies the inline error message for Address Field$")
	public void user_verifies_the_inline_error_message_for_address_field() throws Throwable {

		staticTextValidation(billing_Inline_Error_Address_Field,FrictionlessFlowConstants.INLINEERRMSGADD);
	}

	@And("^user enters the card details in the Billing details screen$")
	public void user_enters_the_card_details_in_the_billing_details_screen() throws Throwable {

		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		clickButtonWithOutScroll(billing_Details_Expiry_Date_Ok);
		clickButtonWithOutScroll(SecurityCode);
		enterTextWithoutClick(SecurityCode,FrictionlessFlowConstants.SecurityNumber);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();
	}

	@Then("^user verifies the Checkbox for consent$")
	public void user_verifies_the_checkbox_for_consent() throws Throwable {

		isElementDisplayed(billing_Details_COF_Checkbox);
	}

	@And("^user enters the details except card name$")
	public void user_enters_the_details_except_card_name() throws Throwable {

		waitFor(5000);
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		clickButtonWithOutScroll(billing_Details_Expiry_Date_Ok);
		clickButtonWithOutScroll(SecurityCode);
		enterTextWithoutClick(SecurityCode,FrictionlessFlowConstants.SecurityNumber);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();
	}

	@And("^user verifies the inline error message for name on the card field$")
	public void user_verifies_the_inline_error_message_for_name_on_the_card_field() throws Throwable {

			staticTextValidation(card_Name_Inline_Err_Msg, FrictionlessFlowConstants.INLINEERRMSGCADNAME);
	}

	@Then("^user verifies the search icon is enabled$")
	public void user_verifies_the_search_icon_is_enabled() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			isElementDisplayed(search_Icon);
		}
		else {
			waitFor(2000);
			isElementEnabled(search_Icon);
		}
	}

	@And("^user enters the postcode in the billing Details screen$")
	public void user_enters_the_postcode_in_the_billing_details_screen() throws Throwable {

		enterTextWithoutClick(postcode_Field,FrictionlessFlowConstants.PostCode);
		hideMobileKeyboard();
	}

	@Then("^user clicks on enabled search icon$")
	public void user_clicks_on_enabled_search_icon() throws Throwable {

		clickButtonWithOutScroll(search_Icon);
	}

	@Then("^user verifies the screen with screen title and back icon and search clear icons$")
	public void user_verifies_the_screen_with_screen_title_and_back_icon_and_search_clear_icons() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			isElementDisplayed(backBtn);
			isElementDisplayed(postcode_Lookup_Title);
			isElementDisplayed(postcode_Lookup_Search_Icon);
			isElementDisplayed(postcode_Lookup_Clear_Icon);
		}
		else{
			isElementDisplayed(postcode_Lookup_Title);
//			isElementDisplayed(postcode_Lookup_Search_Icon);
			isElementDisplayed(postcode_Lookup_Clear_Icon);
		}
	}

	@And("^user clicks any one address in the below$")
	public void user_clicks_any_one_address_in_the_below() throws Throwable {

		waitFor(5000);
		clickButtonWithOutScroll(postcode_Lookup_Screen_Address);
	}

	@Then("^user verifies the selected icon is enabled$")
	public void user_verifies_the_selected_icon_is_enabled() throws Throwable {

		isElementDisplayed(postcode_Lookup_Screen_Selected_Address);
	}

	@Then("^user verifies the Check box for consent and Authorization$")
	public void user_verifies_the_check_box_for_consent_and_authorization() throws Throwable {
		if(platformName.equalsIgnoreCase("Android")){
			isElementDisplayed(billing_Details_COF_Checkbox);
			isElementDisplayed(billing_Details_Checkbox_Authoriz);
		}
		else{
			isElementDisplayed(ConsentBox);
			isElementDisplayed(TouchIdCheckBoxTick);
		}

	}

	@Then("^user verifies the edit esso pin link$")
	public void user_verifies_the_edit_esso_pin_link() throws Throwable {

		isElementDisplayed(esso_Edit_Pin_Screen);
	}

	@Then("^user verifies the tick mark in the selected Address$")
	public void user_verifies_the_tick_mark_in_the_selected_address() throws Throwable {

		isElementDisplayed(postcode_Lookup_Screen_Selected_Address);
	}

	@And("^user clicks on esso pin in Account screen$")
	public void user_clicks_on_esso_pin_in_account_screen() throws Throwable {

		clickButtonWithOutScroll(esso_Pin_Account);
	}

	@Then("^user verifies the united kingdom text in Billing Details screen$")
	public void user_verifies_the_united_kingdom_text_in_billing_details_screen() throws Throwable {

		staticTextValidation(unitedkingdm_Billing_Details,FrictionlessFlowConstants.UNITEDKINGDMBILLINGDTILS);
	}

	@Then("^user verifies the popup message for relogin the Application$")
	public void user_verifies_the_popup_message_for_relogin_the_application() throws Throwable {

		staticTextValidation(resendPopup_Title,FrictionlessFlowConstants.RESENDPOPUPTITLE);
		//staticTextValidation(resend_Popup_Msg,FrictionlessFlowConstants.RESENDPOPUPMSG);
		isElementDisplayed(resend_Popup_Msg);
		clickButtonWithOutScroll(Ok);
	}

	@And("^user clicks on clear icon in the postcode lookup screen$")
	public void user_clicks_on_clear_icon_in_the_postcode_lookup_screen() throws Throwable {

		clickButtonWithOutScroll(closeicon_Postcode_Lookup);
	}

	@And("^user verifies the list of address in postcode lookup screen$")
	public void user_verifies_the_list_of_address_in_postcode_lookup_screen() throws Throwable {

		isElementDisplayed(address_List_Postcode_LookupScreen);
	}

	@And("^user sets the first two pin $")
	public void user_sets_the_first_two_pin() throws Throwable {

		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num1,FrictionlessFlowConstants.PIN1 );
		enterTextWithoutClick(profileCompletionSteps.card_Pin_Num2, FrictionlessFlowConstants.PIN2);
	}

	@Then("^user verifies the first two pin as dot$")
	public void user_verifies_the_first_two_pin_as_dot() throws Throwable {

		staticTextValidation(EssoPIN1,FrictionlessFlowConstants.PINDOT);
		staticTextValidation(EssoPIN2,FrictionlessFlowConstants.PINDOT);
	}

	@Then("^user verifies and clicks the i icon next to consent checkbox$")
	public void user_verifies_and_clicks_the_i_icon_next_to_consent_checkbox() throws Throwable {
		if(platformName.equalsIgnoreCase("Android"))
		{
			isElementDisplayed(CONTINUE);
			isElementDisplayed(consent_I_Icon_Billing_Details);
			isElementDisplayed(CONTINUE);
			clickButtonWithOutScroll(ConsentBox);
		}
		else {
			ScrollTo(FrictionlessFlowConstants.ConsentScroll22, FrictionlessFlowConstants.IOSSCROLLUP, consent_I_Icon_Billing_Details);
			isElementDisplayed(consent_I_Icon_Billing_Details);
			clickButtonWithOutScroll(consent_I_Icon_Billing_Details);
			clickButtonWithOutScroll(ConsentBox11OK);
			clickButtonWithOutScroll(ConsentBox11);
		}
	}

	@Then("^verifies the popup message and clicks ok button$")
	public void verifies_the_popup_message_and_clicks_ok_button() throws Throwable {

		//staticTextValidation(iicon_Popup_Msg,FrictionlessFlowConstants.IICONPOPUPMSGCONSENT);
		isElementDisplayed(iicon_Popup_Msg);
		clickButtonWithOutScroll(iicon_Popup_Msg_Ok_Btn);
	}

	@And("^user enters the card details except postcode$")
	public void user_enters_the_card_details_except_postcode() throws Throwable {

		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		clickButtonWithOutScroll(billing_Details_Expiry_Date_Ok);
		clickButtonWithOutScroll(SecurityCode);
		enterTextWithoutClick(SecurityCode,FrictionlessFlowConstants.SecurityNumber);
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();

	}

	@Then("^user verifies the inline error message for postcode field$")
	public void user_verifies_the_inline_error_message_for_postcode_field() throws Throwable {

		staticTextValidation(postcode_Inline_Error_Msg,FrictionlessFlowConstants.INLINEERRMSGPOSTCODE);
	}

	@Then("^user set the expiry month and Date in Billing Details Screen$")
	public void user_set_the_expiry_month_and_date_in_billing_details_screen() throws Throwable {

		clickButtonWithOutScroll(Ok);
	}

	@Then("^user verifies the default text in the first Address Field$")
	public void user_verifies_the_default_text_in_the_first_address_field() throws Throwable {

		staticTextValidation(Address1, FrictionlessFlowConstants.ADDRESS1DEFAULTTXT);
	}

	@And("^user clicks on Name on card in Billing Details Screen$")
	public void user_clicks_on_name_on_card_in_billing_details_screen() throws Throwable {

		clickButtonWithOutScroll(NameOnCard);

	}

	@And("^user enters thirty characters in the Name on card field$")
	public void user_enters_thirty_characters_in_the_name_on_card_field() throws Throwable {

		enterTextWithoutScroll(NameOnCard, FrictionlessFlowConstants.THIRTYCHRTRS);
		hideMobileKeyboard();
	}

	@Then("^user verifies the entered characters in the field$")
	public void user_verifies_the_entered_characters_in_the_field() throws Throwable {

		isElementDisplayed(NameOnCard);
	}

	@Then("^user verifies the popup message for checkbox$")
	public void user_verifies_the_popup_message_for_checkbox() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(iicon_Popup_Msg, FrictionlessFlowConstants.CHECKBOXPOPUPMSG);
		}
		else{
			isTextMatch(CheckboxPopUpMsg.getText(),FrictionlessFlowConstants.CHECKBOXPOPUPMSG);
		}
	}

	@And("^user clicks on ok in the popup message$")
	public void user_clicks_on_ok_in_the_popup_message() throws Throwable {
		if(platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(Ok);
		}
		else{
			clickButtonWithOutScroll(card_Alert_Ok_Btn);
		}
	}

	@And("^user enters wrong card number in Billing Details screen$")
	public void user_enters_wrong_card_number_in_billing_details_screen() throws Throwable {

		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.WRONGCARDNUMBER);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		clickButtonWithOutScroll(billing_Details_Expiry_Date_Ok);
		clickButtonWithOutScroll(SecurityCode);
		enterTextWithoutClick(SecurityCode,FrictionlessFlowConstants.SecurityNumber);
		enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
		hideMobileKeyboard();
		enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
		hideMobileKeyboard();
		enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
		hideMobileKeyboard();
		clickButtonWithOutScroll(billing_Details_COF_Checkbox);
		clickButtonWithOutScroll(billing_Details_Checkbox_Authoriz);
	}

	@Then("^user verifies the popup message for entering wrong card number and clicks ok button$")
	public void user_verifies_the_popup_message_for_entering_wrong_card_number_and_clicks_ok_button() throws Throwable {

		//staticTextValidation(iicon_Popup_Msg,FrictionlessFlowConstants.WRONGCARDERRPOPUP);
		isElementDisplayed(iicon_Popup_Msg);
		clickButtonWithOutScroll(Ok);
	}

	@Then("^user verifies the entered card number$")
	public void user_verifies_the_entered_card_number() throws Throwable {

		isElementDisplayed(card_Number_CreditDebit_Card);
	}

	@And("^user enters the card details in Billing Screen except fingerprint checkbox$")
	public void user_enters_the_card_details_in_billing_screen_except_fingerprint_checkbox() throws Throwable {
		waitFor(5000);
		enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
		hideMobileKeyboard();
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNumber);
		waitFor(2000);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
		waitFor(2000);
		clickButtonWithOutScroll(billing_Details_Expiry_Date_Ok);
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(SecurityCode);
			enterTextWithoutClick(SecurityCode,FrictionlessFlowConstants.SecurityNumber);
			enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
			hideMobileKeyboard();
			clickButtonWithOutScroll(Postcodesearch);
			waitFor(2000);
			clickButtonWithOutScroll(Postselectaddress);
			waitFor(2000);
			clickButtonWithOutScroll(selectbutton);
			waitFor(2000);
//			enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
//			hideMobileKeyboard();
//			enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
//			hideMobileKeyboard();
//			enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
//			hideMobileKeyboard();
			clickButtonWithOutScroll(billing_Details_COF_Checkbox);
		} else {
			enterTextWithoutClick(SecurityCode,FrictionlessFlowConstants.SecurityNumber);
			hideMobileKeyboard();
			enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
			hideMobileKeyboard();
			enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
			hideMobileKeyboard();
			enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
			hideMobileKeyboard();
			enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
			hideMobileKeyboard();
			clickButtonWithOutScroll(billing_Details_COF_Checkbox);
		}
	}

	@Then("^user verifies the completed popup message for card added$")
	public void user_verifies_the_completed_popup_message_for_card_added() throws Throwable {
		waitFor(6000);
		staticTextValidation(card_Added_Success_Msg,FrictionlessFlowConstants.CARDADDSUCC);
	}

	@And("^user clicks on ok button in card added message$")
	public void user_clicks_on_ok_button_in_card_added_message() throws Throwable {
         waitFor(5000);
		clickButtonWithOutScroll(card_Add_Ok_Btn);
	}

	@Then("^user enters the valid credentials with card added$")
	public void user_enters_the_valid_credentials_with_card_added() throws Throwable {
		clickButtonWithOutScroll(userName);
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
			clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
		}
		enterTextWithoutClick(cmpltd_Username_Login, FrictionlessFlowConstants.CARDADDUSRNAME);
		enterTextWithoutClick(cmpltd_Password_Login, FrictionlessFlowConstants.CARDADDPASS);
	}

	@And("^user verifies for the payment method$")
	public void user_verifies_for_the_payment_method() throws Throwable {

		isElementDisplayed(payment_Method_Txt);
	}

	@Then("^user clicks on Add card link after adding card number$")
	public void user_clicks_on_add_card_link_after_adding_card_number() throws Throwable {

		clickButtonWithOutScroll(AddToCardBtn);
	}

	@Then("^user verifies the last digits of card number and tick mark for the added card number$")
	public void user_verifies_the_last_digits_of_card_number_and_tick_mark_for_the_added_card_number() throws Throwable {

		isElementDisplayed(CardTicMark);
		staticTextValidation(added_Card_Number, FrictionlessFlowConstants.ADDEDCARDNUM);
	}

	@And("^user taps on edit link in the added card$")
	public void user_taps_on_edit_link_in_the_added_card() throws Throwable {

		clickButtonWithOutScroll(added_Card_Edit);
	}

	@Then("^user verifies the cancel and delete option in the screen$")
	public void user_verifies_the_cancel_and_delete_option_in_the_screen() throws Throwable {

		isElementDisplayed(added_Card_Edit_Cancel);
		isElementDisplayed(added_Card_Edit_Done);
	}

	@Then("^user verifies the Account screen$")
	public void user_verifies_the_account_screen() throws Throwable {

		staticTextValidation(account_Screen_Title, FrictionlessFlowConstants.ACCOUNTTITLE);
	}

	@Then("^user verifies the logo of the added card$")
	public void user_verifies_the_logo_of_the_added_card() throws Throwable {
		isElementDisplayed(added_Card_Logo);
	}

	@And("^user clicks on Login icon in the Login page$")
	public void user_clicks_on_login_icon_in_the_login_page() throws Throwable {
		clickButtonWithOutScroll(LoginPasswordBtn);
	}

	@When("^user enter invalid password in enter password screen$")
	public void userEnterInvalidPasswordInEnterPasswordScreen() {
		enterTextWithoutClick(ForgotPwdEnter, FrictionlessFlowConstants.CARDADDPASS);
		clickButtonWithOutScroll(Submit);
	}

	@Then("^user able to see invalid password popup message$")
	public void userAbleToSeeInvalidPasswordPopupMessage() {
		waitForElement(invalidPasswordError_popup_text,2000);
		staticTextValidation(invalidPasswordError_popup_text,FrictionlessFlowConstants.INVALIDPASSWORDERRORPOPUP);
		clickButtonWithOutScroll(invalidPasswordError_popup_ok_btn);
	}

	@And("^user validate Enter PIN screen$")
	public void userValidateEnterPINScreen() {
		waitForElement(PINText);
		staticTextValidation(PINText,FrictionlessFlowConstants.EnterPINTxt);
		staticTextValidation(enteryouressopin_txt,FrictionlessFlowConstants.ENTERYOURESSOPINUNLOCK);
		isElementDisplayed(EssoPIN1);
		isElementDisplayed(EssoPIN2);
		isElementDisplayed(EssoPIN3);
		isElementDisplayed(EssoPIN4);
		isElementDisplayed(ForgotPWD);
		isElementDisplayed(payment_Pin_Continue_Btn);
		isElementDisplayed(backBtn);
	}

	@And("^user clicks on continue button in payment added successfully screen$")
	public void user_clicks_on_continue_button_in_payment_added_successfully_screen() throws Throwable {

		waitFor(3000);
		clickButtonWithOutScroll(continue_Payment_Added);
	}

	@And("^Click on confirm button in confirm payment screen$")
	public void clickOnConfirmButtonInConfirmPaymentScreen() {
		waitFor(3000);
		clickButtonWithOutScroll(PaymentConfirm);
	}

	@And("^Click on Cancel button in Forget password screen$")
	public void clickOnCancelButtonInForgetPasswordScreen() {
		waitFor(3000);
		clickButtonWithOutScroll(PINCanceBtn);
	}

	@Then("^Verify User should be able to see the warning Popup with valid message and ok button$")
	public void verifyUserShouldBeAbleToSeeTheWanringPopupWithValidMessageAndOkButton() {
		waitFor(4000);
		staticTextValidation(passwordWarningPopup,FrictionlessFlowConstants.passwordWaringPopupText);
		isElementDisplayed(invalidPasswordError_popup_ok_btn);
	}

	@And("^Enter the wrong password in password screen$")
	public void enterTheWrongPasswordInPasswordScreen() {
		enterTextWithoutScroll(enter_Password_ForgetPass,"Test@956097650");
		clickButtonWithOutScroll(continue_Btn_Pump);
	}

	@And("^click on Card Exp Date field in Add Card screen$")
	public void clickOnCardExpDateFieldInAddCardScreen() {
		waitForElement(card_Exp_DateMonth_Field,6000);
		clickButtonWithOutScroll(card_Exp_DateMonth_Field);
	}

	@Then("^Verify tha Current Data and Current months are displayed$")
	public void verifyThaCurrentDataAndCurrentMonthsAreDisplayed() {
		String CurrentMonth=MonthPickerAddCard.getText();
//		Arrays CurrentMonth= (Arrays) MonthPickerAddCard.listIterator();
//		ArrayList.contains("StringToBeChecked")

		String CurrentYear=YearPickerAddCard.getText();
		if(CurrentMonth.contains(monthPicker())){
			System.out.println("The months are matched:  " +CurrentMonth);
		}
		else{
			System.out.println("The months not are matched");
		}
		if(yearPicker().equals(CurrentYear)){
			System.out.println("The Year are matched: " +yearPicker());
		}
		else{
			System.out.println("The Year not are matched");
		}
	}

	@And("^Verify Success message and close the popup clicking on Ok button$")
	public void verifySuccessMessageAndCloseThePopupClickingOnOkButton() {
		waitFor(6000);
		staticTextValidation(pinSuccessMessage,FrictionlessFlowConstants.pinSuccessMessage);
		clickButtonWithOutScroll(invalidPasswordError_popup_ok_btn);
	}

	@And("^Enter the \"([^\"]*)\" in Login Page$")
	public void enterTheInLoginPage(String arg0) throws Throwable {
		waitFor(4000);
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(cmpltd_Username_Login);
			waitFor(4000);
			clickButtonWithOutScroll(noneOfTheAboveButton);
			enterTextWithoutScroll(cmpltd_Username_Login, FrictionlessFlowConstants.AddCardUN);
			enterTextWithoutClick(cmpltd_Password_Login, FrictionlessFlowConstants.AddCardPWD);
		}else {
			enterTextWithoutScroll(cmpltd_Username_Login, FrictionlessFlowConstants.AddCardUN);
			enterTextWithoutClick(cmpltd_Password_Login, FrictionlessFlowConstants.AddCardPWD);
		}
	}

	@When ("^user able to see the text of set up Esso PIN$")
	public  void user_able_to_see_the_text_of_set_up_Esso_PIN()
	{
		waitFor(1000);
		isElementDisplayed(EssoPINTxt);
		staticTextValidation(EssoPINTxt.getText(), FrictionlessFlowConstants.EssosetPintxt1);
	}
	@Then ("^user tap on Setup Esso PIN link$")
	public void user_tap_on_Setup_Esso_PIN_link()
	{
		clickButtonWithOutScroll(EssoPINTxt);

	}
	@Then ("^user able to see the title Set up PIN$")
	public void user_to_see_the_title_Set_up_PIN()
	{

	}


	@Then("^user should verify the cancel button$")
	public void userShouldVerifyTheCancelButton() {
		isElementDisplayed(EssoPINCancel);
	}

	@Then("^user should verify the text set the Esso PIN to unlock the app for fuelling$")
	public void userShouldVerifyTheTextSetTheEssoPINToUnlockTheAppForFuelling() {
		staticTextValidation(EssoPINTxt2, FrictionlessFlowConstants.EssoInlinetitle);
	}

	@Then("^user tap on continue button$")
	public void userTapOnContinueButton() {
		clickButtonWithOutScroll(EssoPINTxtContinue);
	}

	@Then("^user verify the inline error message$")
	public void userVerifyTheInlineErrorMessage() {
		staticTextValidation(EssoPINTxtinErr, FrictionlessFlowConstants.EssoInlineError);
	}

	@When("^User Should Enter the Username$")
	public void User_Should_Enter_the_Username() {
		waitFor(5000);
		clickButtonWithOutScroll(userName);
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
			clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
		}
		enterTextWithoutScroll(userName, FrictionlessFlowConstants.UserName1);
	}

	@And("^User Should Enter the password$")
	public void User_Should_Enter_the_password() {
		waitFor(5000);
		enterTextWithoutScroll(password, FrictionlessFlowConstants.password);

	}

	@Then("^User Click on login button$")
	public void User_Click_on_login_button() throws InterruptedException {
		waitFor(5000);
		clickButtonWithOutScroll(loginButton);
		waitFor(7000);
	}
	@Given("^User Tap Edit button$")
	public void user_Tap_Edit_button() {
//
		waitFor(5000);
		clickButtonWithOutScroll(EssoPINEdit1);
	}

	@Given("^User click the Forgot your PIN link$")
	public void user_click_the_Forgot_your_PIN_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickButtonWithOutScroll(EssoforgotPIN);
	}

	@Given("^User able to verify the CT label$")
	public void user_able_to_verify_the_CT_label() throws Throwable {
		waitForElement(EssoforgotPWDlable,14);
		Assert.assertTrue(EssoforgotPWDlable.isDisplayed());
	}

	@Then("^user click the Forgot your pwd link$")
	public void user_click_the_Forgot_your_pwd_link() throws Throwable {

		clickButtonWithOutScroll(Essoforgotlink);
	}

	@Then("^user should verify the title Forgot pwd$")
	public void user_should_verify_the_title_Forgot_pwd() throws Throwable {
		isElementDisplayed(EssoPINTxttitle1);
		staticTextValidation(EssoPINTxttitle1, FrictionlessFlowConstants.ForgotTitle1);

	}

	@Then("^user verify the back button$")
	public void user_verify_the_back_button() throws Throwable {
		isElementDisplayed(navBack);
	}

	@Then("^user should verify the CT label and clicks on send button$")
	public void user_should_verify_the_CT_label_and_clicks_on_send_button() throws Throwable {

		if(platformName.equalsIgnoreCase("Android"))
		{
			staticTextValidation(EssoEssoForgotttle, "Forgot Password");
			isElementDisplayed(EssoForContinueBtn);
			clickButtonWithOutScroll(NLIDPage.send_Button_Forgot_Password);
		}
		else {
			staticTextValidation(EssoEssoForgotttle, "Forgot Password");
			staticTextValidation(EssoForgotINCTLable, FrictionlessFlowConstants.EssoInlinetitle2);
			isElementDisplayed(EssoForContinueBtn);
			clickButtonWithOutScroll(NLIDPage.send_Button_Forgot_Password);
		}
	}

	@Given("^user click the payment edit button$")
	public void user_click_the_payment_edit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickButtonWithOutScroll(PaymentEditbtn);
		waitFor(5000);

	}

	@Given("^user tap on Delete Card button$")
	public void user_tap_on_Delete_Card_button() throws Throwable {
		waitFor(5000);
		clickButtonWithOutScroll(CardDeletebtn);

	}

	@Given("^user should verify the CT \"([^\"]*)\"$")
	public void user_should_verify_the_CT(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		staticTextValidation(Carddeletepopupmsg, FrictionlessFlowConstants.DeleteCardpopup);

	}

	@Then("^user should verify the inliner error \"([^\"]*)\"$")
	public void user_should_verify_the_inliner_error(String arg1) throws Throwable {
		staticTextValidation(CardinlineError, FrictionlessFlowConstants.CardinlineError);
	}

	@Then("^user should verify the system navigate to setup PIN screen$")
	public void user_should_verify_the_system_navigate_to_setup_PIN_screen() {
		waitForElement(EssoPINsetuptxt, 5000);
		staticTextValidation(EssoPINsetuptxt, FrictionlessFlowConstants.EssosetPintxt);
	}


	@And("^user should verify the last four digit of card number$")
	public void userShouldVerifyTheLastFourDigitOfCardNumber() {
		isElementDisplayed(cardLastdigit1);
		waitFor(2000);
		ScrollTo(FrictionlessFlowConstants.EditCard, FrictionlessFlowConstants.IOSSCROLLUP, CardDeletebtn);
	}


	@And("^user should verify cancel and delete button$")
	public void userShouldVerifyCancelAndDeleteButton() {
		if(platformName.equalsIgnoreCase("Android"))
		{
			Assert.assertTrue(isTextMatch(CANCEL.getText(),FrictionlessFlowConstants.CANCEL));
			Assert.assertTrue(isTextMatch(DELETE.getText(),FrictionlessFlowConstants.DELETE));
			clickButtonWithOutScroll(CANCEL);
			waitForElement(PINCanceBtn,4);
			clickButtonWithOutScroll(PINCanceBtn);

		}
		else {
			clickButtonWithOutScroll(PopUpCancel);
			isElementDisplayed(PopUpCancel);
			clickButtonWithOutScroll(PopUpCancel);
		}
	}

	@Then("^user should verify the Add Card link$")
	public void userShouldVerifyTheAddCardLink()
	{

		isElementEnabled(AccountaddCard);
	}

	@Then("^user should able to see the logo of the card$")
	public void userShouldAbleToSeeTheLogoOfTheCard() {

		if (platformName.equalsIgnoreCase("Android"))
		{
			isElementDisplayed(card_Details_Master_Logo);
		}else {

			isElementEnabled(card_Details_Master_Logo);
		}

	}

	@Then("^user should verifies the Set Up pin screen with numeric keypad$")
	public void userShouldVerifiesTheSetUpPinScreenWithNumericKeypad() {
        waitFor(2000);
		clickButtonWithOutScroll(pinDigit);
		isElementDisplayed(SetupPINTitle);


	}

	@And("^Verify card number in valid format$")
	public void verifyCardNumberInValidFormat() {
		waitFor(5000);
		if (card_Number_CreditDebit_Card.getText().equalsIgnoreCase("5544 3300 0000 0011"))
		{

		}

	}

	@Then("^user enters the details except card number$")
	public void userEntersTheDetailsExceptCardNumber() {

		ScrollTo(FrictionlessFlowConstants.ConsentScroll22, FrictionlessFlowConstants.IOSSCROLLUP, ConsentBox11);
		waitFor(2000);
		clickButtonWithOutScroll(SetUpEssoPinLink);
	}

	@Then("^user  verify the inline error \"([^\"]*)\"$")
	public void userVerifyTheInlineError(String arg0) throws Throwable {
      waitFor(2000);
		staticTextValidation(Cardnumber, "Please enter card number");

	}

	@Then("^user verifies the inline error msg for the invalid card$")
	public void userVerifiesTheInlineErrorMsgForTheInvalidCard() {
		waitFor(1000);
		staticTextValidation(CardInvalidErrMsg, FrictionlessFlowConstants.INLINECARDERRORMSG);
	}

	@And("^user verifies the Esso PIN under User Profile in Account Screen$")
	public void userVerifiesTheEssoPINUnderUserProfileInAccountScreen() {
		Assert.assertTrue(isTextMatch(EssoPinAccount.getText(), FrictionlessFlowConstants.ESSOPINACCOUNT));
	}

	@And("^user clicks the link to set up Esso Pin under User Profile section$")
	public void userClicksTheLinkToSetUpEssoPinUnderUserProfileSection() {
		isElementDisplayed(SetUpEssoPinLink);
		waitFor(2000);
		clickButtonWithOutScroll(SetUpEssoPinLink);
	}

	@Then("^user verifies if the select button as disabled until user has made any selection$")
	public void userVerifiesIfTheSelectButtonAsDisabledUntilUserHasMadeAnySelection() {
		isElementDisplayed(selectLookUp);
		if(isElementEnabled(postcode_Lookup_Screen_Address)){
			Assert.assertTrue(isElementEnabled(selectLookUp));

		}
	}

	@Then("^user should verify the inline error message \"([^\"]*)\"$")
	public void userShouldVerifyTheInlineErrorMessage(String arg0) throws Throwable {

		staticTextValidation(Cardname, "Please enter name on card");
	}
	@Then("^user verifies the default input text for the City field under Billing Details Section$")
	public void userVerifiesTheDefaultInputTextForTheCityFieldUnderBillingDetailsSection() {
		String CityValue=City.getAttribute("value");
		Assert.assertTrue(CityValue.equalsIgnoreCase("City"));
	}

	@Then("^verify whether the system displays the edit link near Esso PIN$")
	public void verifyWhetherTheSystemDisplaysTheEditLinkNearEssoPIN() {
		isElementDisplayed(EditEssoPin);
	}

    @And("^tap on done Button$")
    public void tapOnDoneButton() {
	clickButtonWithOutScroll(DonebtnEXP);

    }

	@When("^user clicks on select option$")
	public void userClicksOnSelectOption() {
		waitFor(1000);
		clickButtonWithOutScroll(postcode_Lookup_Screen_Selected_Address);
		clickButtonWithOutScroll(selectLookUp);
	}
	@Then("^user should verify title text on the payment screen$")
	public void userShouldVerifyTitleTextOnThePaymentScreen() {

		staticTextValidation(Addpaymentscreentitle,"Add Debit/Credit Card");
	}

	@Then("^user select postcode in the list$")
	public void userSelectPostcodeInTheList() {
		if(platformName.equalsIgnoreCase("Android"))
		{
			clickButtonWithOutScroll(guestCheckOutPage.SelectAddreess);
		}
		else {
			clickButtonWithOutScroll(Postcodelist);
		}
	}

	@Then("^Tap on Add Payment Done button$")
	public void tapOnAddPaymentDoneButton() {
		if(platformName.equalsIgnoreCase("Android"))
		{
			waitFor(1000);
			clickButtonWithOutScroll(PaymtDone);
		}
		else
		{
			waitFor(2000);
			ScrollTo(FrictionlessFlowConstants.ConsentScroll22, FrictionlessFlowConstants.IOSSCROLLUP, guestCheckOutPage.DoneButton);
			waitFor(2000);
			clickButtonWithOutScroll(guestCheckOutPage.DoneButton);
		}

	}
	@Then("^user tap on that clear the text which is been entered$")
	public void userTapOnThatClearTheTextWhichIsBeenEntered() {

		clickButtonWithOutScroll(postcode_Lookup_Clear_Icon);

	}

	@Then("^user should verify search icon should enable after enter the postcode$")
	public void userShouldVerifySearchIconShouldEnableAfterEnterThePostcode() {
		isElementEnabled(guestCheckOutPage.SearchIcon);
	}

	@Then("^user able to see and verify the search icon$")
	public void userAbleToSeeAndVerifyTheSearchIcon() {
		if(isElementEnabled(guestCheckOutPage.SearchIcon))
		clickButtonWithOutScroll(guestCheckOutPage.SearchIcon);
	}

	@When("^user taps on Delete Card button in Edit Payment Screen$")
	public void user_taps_on_delete_card_button_in_edit_payment_screen() throws Throwable {
		clickButtonWithOutScroll(CardDeletebtn);
	}

	@Then("^Verify system should display the prompt message$")
	public void verify_system_should_display_the_prompt_message() throws Throwable {
		staticTextValidation(Carddeletepopupmsg, FrictionlessFlowConstants.DeleteCardMessage);
		Assert.assertTrue(isTextMatch(FrictionlessFlowConstants.CANCEL, CANCEL.getText()));
		Assert.assertTrue(isTextMatch(FrictionlessFlowConstants.DELETE, DELETE.getText()));
	}
	@When("^user taps on the info icon$")
	public void userTapsOnTheInfoIcon() {
		clickButtonWithOutScroll(card_Details_Billing_I_Icon);
	}

	@And("^verify whether the system displays the copy text msg$")
	public void verifyWhetherTheSystemDisplaysTheCopyTextMsg() {
		staticTextValidation(iicon_Popup_Msg,FrictionlessFlowConstants.IICONPOPUPMSGCONSENT);
		isElementDisplayed(iicon_Popup_Msg);
		clickButtonWithOutScroll(iicon_Popup_Msg_Ok_Btn);

	}

	@Then("^verify whether the entered postcode is alphanumeric and also the postcode length$")
	public void verifyWhetherTheEnteredPostcodeIsAlphanumericAndAlsoThePostcodeLength() {
		String postcode = PostCode.getText();
		if(postcode.matches("^[a-zA-Z0-9]*$")){
			Assert.assertTrue(postcode.length()>=5 || postcode.length()<=8);
		}
	}

	@When("^user enters the unsupported card number in the Card number field$")
	public void userEntersTheUnsupportedCardNumberInTheCardNumberField() {
		enterTextWithoutClick(CardNo,FrictionlessFlowConstants.INACTIVECARDNO);

	}

	@Then("^verify whether the logo of the cards are greyed out$")
	public void verifyWhetherTheLogoOfTheCardsAreGreyedOut() {

		Assert.assertFalse(isElementEnabled(VisaLogo));
		Assert.assertFalse(isElementEnabled(MasterLogo));
	}

	@When("^user enters the first four digits of a valid card number in the Add number field$")
	public void userEntersTheFirstFourDigitsOfAValidCardNumberInTheAddNumberField() {

		enterTextWithoutClick(CardNo,FrictionlessFlowConstants.CARDFIRSTFOUR);
	}

	@Then("^verify whether the logo of the entered card is active$")
	public void verifyWhetherTheLogoOfTheEnteredCardIsActive() {
		Assert.assertTrue(isElementEnabled(MasterLogo));
	}

	@Then("^verifies the Consent icon popup message and clicks ok button$")
	public void verifiesTheConsentIconPopupMessageAndClicksOkButton() {

		staticTextValidation(ConsentIconPopUpMsg,FrictionlessFlowConstants.CONSENTICONPOPUPPMSG);
		clickButtonWithOutScroll(card_Alert_Ok_Btn);
	}
	@Then("^user land on enter PIN screen$")
	public void user_land_on_enter_pin_screen() {
		waitForElement(PinTxt,6);
			Assert.assertTrue(isTextMatch(PinTxt.getText(), COFChallangeFlowConstants.PINCONTEXT));
	}

	@Then("^user tap on add card button in account$")
	public void user_tap_on_add_card_button_in_account() throws Throwable {
		waitFor(6000);
//		ScrollTo(AccountConstants.PAYMENTMETHODCTACCOUNT, AccountConstants.IOSSCROLLUP, getTextElement("Payment Method"));
		ScrollTo(COFChallangeFlowConstants.ACCOUNT, AccountConstants.IOSSCROLLUP, AddCard);
//		ScrollTo(AccountConstants.PAYMENTMETHODCTACCOUNT, AccountConstants.IOSSCROLLDOWN, getTextElement("Payment Method"));
//
//		ScrollTo(COFChallangeFlowConstants.ACCOUNT, AccountConstants.IOSSCROLLDOWN, AddCard);
		try {
			waitForElement(AddCard, 3);
			AddCard.click();
		} catch (Exception e) {
			ScrollTo(AccountConstants.PAYMENTMETHODCTACCOUNT, AccountConstants.IOSSCROLLDOWN, getTextElement("Payment Method"));
			waitForElement(AddCard, 3);
			clickButtonWithOutScroll(AddCard);
		}
	}

	@And("^tap on ok button for default method if displayed$")
	public void tapOnOkButtonForDefaultMethodIfDisplayed() {
		waitForElement(okBtn,15);
		if(isElementDisplayedWithoutAssert(okBtn)){
			clickButtonWithOutScroll(okBtn);
		}
		else{
			logger.info("No pop up displayed");
		}
	}
	@When("^user is on setup PIN screen$")
	public void user_is_on_setup_pin_screen() throws Throwable {
		staticTextValidation(AccountMessage, COFChallangeFlowConstants.SETUPPIN);
	}

	@Then("^user tap on continue button in enter PIN screen$")
	public void user_tap_on_continue_button_in_enter_pin_screen() throws Throwable {
		waitForElement(Continue_BTN,5);
		clickButtonWithOutScroll(Continue_BTN);
	}

	@Then("^enter name of the card$")
	public void enter_name_of_the_card() throws Throwable {
		waitForElement(CardName,5);
		Assert.assertTrue(isElementDisplayed(CardName));
		enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
	}

	@Then("^enter \"([^\"]*)\" card number$")
	public void enter_something_card_number(String arg1)  {
		enterTextWithoutClick(CardNo, arg1);
	}

	@Then("^enter expiry date$")
	public void enter_expiry_date() throws Throwable {
		if(platformName.equalsIgnoreCase("Android"))
		{
			clickButtonWithOutScroll(guestCheckOutPage.ExpiryDate);
			waitFor(3000);
			clickButtonWithOutScroll(accountPage.okBtn);
		}
		else {
			waitFor(1000);
			enterTextWithoutClick(ExpDate, COFChallangeFlowConstants.EXPDATE);
		}
	}

	@Then("^enter CVV$")
	public void enter_cvv() throws Throwable {
		enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
	}

	@Then("^enter postal code$")
	public void enter_postal_code() throws Throwable {
		enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
		hideMobileKeyboard();
	}

	@Then("^enter address line1$")
	public void enter_address_line1() throws Throwable {
		enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
		hideMobileKeyboard();
	}

	@Then("^enter Address line2$")
	public void enter_address_line2() throws Throwable {
		enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
		hideMobileKeyboard();
	}

	@Then("^enter city$")
	public void enter_city() throws Throwable {
		enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
		hideMobileKeyboard();
	}

	@Then("^check consent checkbox$")
	public void check_consent_checkbox() throws Throwable {
		if(platformName.equalsIgnoreCase("Android"))
		{
			isElementDisplayed(CONTINUE);
			clickButtonWithOutScroll(ConsentBox);
		}
		else {
			ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
			clickButtonWithOutScroll(ConsentBox);
		}
	}


	@Then("^Confirmation prompt \"([^\"]*)\" should be displayed$")
	public void confirmation_prompt_should_be_displayed(String arg1) throws Throwable {
		for (int i = 0; i < 10;) {
			waitFor(2000);
			i++;
			logger.info("###################Modirum Pop up not yet displayed#########################");
			if (isElementDisplayedWithoutAssert(PromptTtl)) {
				logger.info("###################Modirum Pop displayed#########################");
				break;
			}
		}
		staticTextValidation(AccountMessage.getText(), COFChallangeFlowConstants.PASSPHRASEONBOARD);
	}

	@Then("^validate 3DS passphrase prompt$")
	public void validate_3ds_passphrase_prompt() throws Throwable {
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(Continue_BTN)) {
			clickButtonWithOutScroll(Continue_BTN);
		}
		for (int i = 0; i < 10;) {
			waitFor(2000);
			i++;
			logger.info("###################Modirum Pop up not yet displayed#########################");
			if (isElementDisplayedWithoutAssert(PromptTtl)) {
				logger.info("###################Modirum Pop displayed#########################");
				break;
			}
			staticTextValidation(AccountMessage, COFChallangeFlowConstants.PASSPHRASEONBOARD);
		}
	}
	//	@Then("^Confirmation prompt \"([^\"]*)\" should be displayed$")
//	public void confirmation_prompt_should_be_displayed(String arg1) throws Throwable {
//		for (int i = 0; i < 10;) {
//			waitFor(2000);
//			i++;
//			logger.info("###################Modirum Pop up not yet displayed#########################");
//			if (isElementDisplayedWithoutAssert(PromptTtl)) {
//				logger.info("###################Modirum Pop displayed#########################");
//				break;
//			}
//		}
//		staticTextValidation(AccountMessage.getText(), COFChallangeFlowConstants.PASSPHRASEONBOARD);
//	}
@And("^enter valid password and click on submit button$")
public void enter_valid_password_and_click_on_submit_button() throws Throwable {
		waitFor(8000);
	enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
	clickButtonWithOutScroll(PassPhraseSubmit);
}

	@Then("^validate success screen for added card$")
	public void validate_success_screen_for_added_card() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
//			staticTextValidation(PaymentSuccessTtl, COFChallangeFlowConstants.PAYSUCCSTTL);
//			staticTextValidation(PaymentSuccessDes, COFChallangeFlowConstants.PAYSUCCSDES);
			waitForElement(okBtn,10);
			//staticTextValidation(CardAddSuccess,COFChallangeFlowConstants.CARDSUCCESS);
			clickButtonWithOutScroll(okBtn);
		}
		else{
			waitForElement(okBtn,10);
			staticTextValidation(CardAddSuccess,COFChallangeFlowConstants.CARDSUCCESS);
			clickButtonWithOutScroll(okBtn);
		}
	}

@When("^user lands on card verification screen$")
public void userLandsOnCardVerificationScreen() {

	isElementDisplayed(VerifyPwd);
	waitFor(1000);
	staticTextValidation(EnterPwd,COFChallangeFlowConstants.ENTERPWD);

}
	@Then("^validate if user is on 3ds password screen$")
	public void validate_if_user_is_on_3ds_password_screen() throws Throwable {
		waitForElement(PassPhrase,55);
		PassPhrase.isDisplayed();
	}
	@And("^tap on continue button in add payment screen$")
	public void tap_on_continue_button_in_add_payment_screen() throws Throwable {
		waitForElement(PaymtDone,7);
		clickButtonWithOutScroll(PaymtDone);
	}

	@Then("^user  navigate to payment screen and enter the card number$")
	public void userNavigateToPaymentScreenAndEnterTheCardNumber() {
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNUMBER);
		hideMobileKeyboard();
		waitFor(2000);
//	System.out.println(card_Number_CreditDebit_Card.getText());
	String card=card_Number_CreditDebit_Card.getText();
	if (card.contains("5544 3300 0000 0011"))
	{
		System.out.println("card formated is valid" +card_Number_CreditDebit_Card.getText());
	}
//		staticTextValidation(card_Number_CreditDebit_Card,"5544 3300 0000 0011");

	}

	@Then("^user enters four digit PIN$")
	public void user_enters_four_digit_PIN() {
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(PinCode_1);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN1);
			waitFor(1000);
			//clickButtonWithOutScroll(PinCode_1);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN2);
			waitFor(1000);
			// clickButtonWithOutScroll(PinCode_1);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN3);
			waitFor(1000);
			// clickButtonWithOutScroll(PinCode_1);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN4);
			waitFor(1000);
		} else {
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN1);
			waitFor(1000);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN2);
			waitFor(1000);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN3);
			waitFor(1000);
			driver.getKeyboard().sendKeys(COFChallangeFlowConstants.PIN4);
			waitFor(1000);
		}
	}

	@And("^user confirms card payment$")
	public void user_confirms_card_payment() {
		if(platformName.equalsIgnoreCase("Android"))
		{
			waitForElement(Confirm_BTN,10);
			if(isElementDisplayedWithoutAssert(Confirm_BTN)){
				clickButtonWithOutScroll(Confirm_BTN);
				if (isElementDisplayedWithoutAssert(ReadyCtnBtn)) {
					clickButtonWithOutScroll(ReadyCtnBtn);
				}
			}
			else if(isElementDisplayedWithoutAssert(PayPalButn)){
				clickButtonWithOutScroll(PayPalButn);
				if (isElementDisplayedWithoutAssert(ReadyCtnBtn)) {
					clickButtonWithOutScroll(ReadyCtnBtn);
				}
			}

			else{
				logger.info("No button clicked");
			}
		}
		else {
			waitForElement(Confirm_BTN, 10);
			if (isElementDisplayedWithoutAssert(Confirm_BTN)) {
				Confirm_BTN.sendKeys(Keys.ENTER);
				if (isElementDisplayedWithoutAssert(ReadyCtnBtn)) {
					clickButtonWithOutScroll(ReadyCtnBtn);
				}
			} else if (isElementDisplayedWithoutAssert(PayPalButn)) {
				clickButtonWithOutScroll(PayPalButn);
				if (isElementDisplayedWithoutAssert(ReadyCtnBtn)) {
					clickButtonWithOutScroll(ReadyCtnBtn);
				}
			} else {
				logger.info("No button clicked");
			}
		}
	}

	@Then("^verify if a modal pop with the Nectar logo and Static firework image is displayed$")
	public void verifyIfAModalPopWithTheNectarLogoAndStaticFireworkImageIsDisplayed() {
		waitFor(4000);
		Assert.assertTrue(NectarLogo.isEnabled());
		Assert.assertTrue(FireworkImg.isEnabled());
		Assert.assertTrue(ViewDetailsBtn.isEnabled());
	}

	@When("^user tap on View Details Button in the Modal popup in LID$")
	public void userTapOnViewDetailsButtonInTheModalPopupInLID() {
		clickButtonWithOutScroll(ViewDetailsBtn);
	}

	@Then("^verify whether the user is navigated to the modal expands to give offer details$")
	public void verifyWhetherTheUserIsNavigatedToTheModalExpandsToGiveOfferDetails() {
		waitFor(3000);
		staticTextValidation(HIW, OffersContants.HIW);
		waitFor(1000);
		staticTextValidation(CollectPtsLnk, OffersContants.COLLECTPTSLNK);
		waitFor(1000);
		staticTextValidation(CollectMoreHead, OffersContants.COLECTMOREHEAD);
		waitFor(4000);
	}

	@When("^user should verify the four digit of the card number$")
	public void userShouldVerifyTheFourDigitOfTheCardNumber() {
		waitFor(2000);
		isElementDisplayed(cardLastdigit);

	}

	@Then("^user should verify the inline error message without enter postcode \"([^\"]*)\"$")
	public void userShouldVerifyTheInlineErrorMessageWithoutEnterPostcode(String arg0) throws Throwable {

		staticTextValidation(PostcodeinlineError, "Please enter postcode");
	}

	@Then("^user should verify the card last four digit$")
	public void userShouldVerifyTheCardLastFourDigit() {

		ScrollTo(ProfileCompletionConstants.ACCOUNTSCREEN, ProfileCompletionConstants.IOSSCROLLUP, MFA);

			isElementDisplayed(cardLastdigit);
	}

	@Then("^user should see the highlighted card number with tick mark$")
	public void userShouldSeeTheHighlightedCardNumberWithTickMark() {
		isElementDisplayed(tickMark);
	}

	@When("^user verify navigate to add payment screen$")
	public void userVerifyNavigateToAddPaymentScreen() {
		staticTextValidation(AddPaymentScreen11,FrictionlessFlowConstants.paymentlable);

	}

	@And("^user enter the valid card number$")
	public void userEnterTheValidCardNumber() {
		enterTextWithoutClick(card_Number_CreditDebit_Card, FrictionlessFlowConstants.CARDNUMBER);
		hideMobileKeyboard();
	}

	@When("^user tap done button to navigate verify screen \"([^\"]*)\"$")
	public void userTapDoneButtonToNavigateVerifyScreen(String arg0) throws Throwable {

		staticTextValidation(AddpaymentScuccss,"Payment method added successfully");
//		staticTextValidation(AddpaymentScuccsslabel,"Your payment method account will be charged for the amount you fuel.");
	}

	@When("^user tap on payment method added successfully screen continue button$")
	public void userTapOnPaymentMethodAddedSuccessfullyScreenContinueButton() {
		clickButtonWithOutScroll(Payemntmethodtsk);
	}

	@Then("^user should verify the \"([^\"]*)\" task is completed$")
	public void userShouldVerifyTheTaskIsCompleted(String arg0) throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(AddpaymentScuccssContinue);
		clickButtonWithOutScroll(Okcomplete);
	}

//	@Given("^user is on Linked LID Screen$")
//	public void userIsOnLinkedLIDScreen() {
//		isElementDisplayed(LinkedinIcon);
//
//    }
@Then("^user should be navigated to NLID$")
public void userShouldBeNavigatedToNLID() {

	waitForElement(DashRegstr,10);
	isElementDisplayed(DashRegstr);
	waitFor(7000);

}
	@Then("^user verify the security pop text$")
	public void userVerifyTheSecurityPopText() {

		staticTextValidation(Securitytxt,"Due to security reasons you need to login again.");
	}

	@Then("^user verify and click the ok button$")
	public void userVerifyAndClickTheOkButton() {
		isElementDisplayed(Securitytxtok);
		clickButtonWithOutScroll(Securitytxtok);
	}

	@Then("^user verify after tap on ok button navigate to NLID screen$")
	public void userVerifyAfterTapOnOkButtonNavigateToNLIDScreen() {
		staticTextValidation(DashRegstr,"REGISTER AN ACCOUNT");
	}

	@Then("^user should verify navigate Linkedin login screen or not$")
	public void userShouldVerifyNavigateLinkedinLoginScreenOrNot() {
		waitFor(2000);
		isElementDisplayed(LinkedinIconWel);
	}

//	@When("^user tap on Linkedin button$")
//	public void userTapOnLinkedinButton() {
//		clickButtonWithOutScroll(LinkedinIcon);
//	}

	@Then("^user tap login button$")
	public void userTapLoginButton() {
		clickButtonWithOutScroll(SSOsignin);
		waitFor(20000);

	}

	@Then("^user enter the username and password$")
	public void userEnterTheUsernameAndPassword() {
		enterTextWithoutScroll(SSOLinUsername,FrictionlessFlowConstants.LinkedInUSER1);
		enterTextWithoutScroll(SSOlinpwd,FrictionlessFlowConstants.LinkedInPASSWORD1);
	}

	@When("^veriy user should is on LID Screen$")
	public void veriyUserShouldIsOnLIDScreen() {
		if(platformName.equalsIgnoreCase("iOS"))
		{
			isElementDisplayed(StartFuelIconLID);

	}
}

	@And("^user lands on LID after tapping back button in Complete profile Screen$")
	public void userLandsOnLIDAfterTappingBackButtonInCompleteProfileScreen() {

		clickButtonWithOutScroll(navBack1);
		waitFor(7000);
		isElementDisplayed(CTLID);
		waitFor(7000);

	}

	@And("^validate the CT 'Reset your password' and tap on OK button$")
	public void validateTheCTResetYourPasswordAndTapOnOKButton() {

		staticTextValidation(Resetlabletxt,"We have sent you instructions to reset your password. Please check your inbox or spam folder.");
		clickButtonWithOutScroll(Okcomplete);
		waitFor(7000);
	}

	@Then("^user should be navigated to NID$")
	public void userShouldBeNavigatedToNID() {

		waitForElement(DashRegstr,10);
		isElementDisplayed(DashRegstr);
		waitFor(7000);

	}


	@Then("^user verifies the success set Default payment popup$")
	public void userVerifiesTheSuccessSetDefaultPaymentPopup() {
       waitFor(7000);
		clickButtonWithOutScroll(Okcomplete);
	}

	@Then("^user clicks on Skip Maximum Amount button$")
	public void userClicksOnSkipMaximumAmountButton() {
		clickButtonWithOutScroll(Skipmax);
		waitFor(5000);
	}

	@And("^user clicks on continue button in skip maximum fueling screen$")
	public void userClicksOnContinueButtonInSkipMaximumFuelingScreen() {
		clickButtonWithOutScroll(Contmax);
		waitFor(5000);

	}

	@And("^user verify task \"([^\"]*)\" task is completed$")
	public void userVerifyTaskTaskIsCompleted(String arg0) throws Throwable {
       clickButtonWithOutScroll(maximum_Fueling_Btn);
		staticTextValidation(profComCT,"Already Completed");
		staticTextValidation(profComCT1,"You have already completed this feature. Please select a feature without tickmark to complete your profile.");
		clickButtonWithOutScroll(Okcomplete);
	}

	@Then("^user verifies the task whether the task is completed$")
	public void userVerifiesTheTaskWhetherTheTaskIsCompleted() {

		staticTextValidation(profComCT,"Already Completed");
		staticTextValidation(profComCT1,"You have already completed this feature. Please select a feature without tickmark to complete your profile.");
		clickButtonWithOutScroll(Okcomplete);
	}

	@Then("^verify that user is navigated to next logical screen once authentication is successful$")
	public void verify_that_user_is_navigated_to_next_logical_screen_once_authentication_is_successful() throws Throwable {

		staticTextValidation(OffersPage.AuthHead, OffersContants.AUTHTTL);
		staticTextValidation(OffersPage.AuthDes, OffersContants.AUTHDES);
	}

	@And("^user is navigated to Select your pump screen$")
    public void userIsNavigatedToSelectYourPumpScreen() {
		if(platformName.equalsIgnoreCase("Android")) {
			if (isElementDisplayedWithoutAssert(guestCheckOutPage.LocationContinueButton)) {
				clickButtonWithOutScroll(guestCheckOutPage.LocationContinueButton);
				waitFor(1000);
				driver.switchTo().alert().accept();
				waitFor(4000);
				staticTextValidation(guestCheckOutPage.SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
				Assert.assertTrue(SelectPumpHeader.isDisplayed());
				Assert.assertTrue(SelectPumpTxt.isDisplayed());
				Assert.assertTrue(PumpContinueBtn.isEnabled());
			}
		}
		else
		{
		waitForElement(SelectPumpHeader, 15);
		Assert.assertTrue(SelectPumpHeader.isDisplayed());
		Assert.assertTrue(SelectPumpTxt.isDisplayed());
		Assert.assertTrue(PumpContinueBtn.isEnabled());
	}
    }

	@When("^user taps on the payment method link$")
	public void userTapsOnThePaymentMethodLink() {
		if(isElementDisplayedWithoutAssert(PaymentMethodLinkPaypal)){
			clickButtonWithOutScroll(PaymentMethodLinkPaypal);
		}
		else if(isElementDisplayedWithoutAssert(PaymentMethodLinkVisa)){
			clickButtonWithOutScroll(PaymentMethodLinkVisa);
		}

		else if(isElementDisplayedWithoutAssert(PaymentMethodLinkMaster)){
			clickButtonWithOutScroll(PaymentMethodLinkMaster);

		}
	}

	@When("^user selects the frictionless flow card and tap on update button$")
	public void userSelectsTheFrictionlessFlowCardAndTapOnUpdateButton() {
		clickButtonWithOutScroll(UpdateBtn1);
		waitForElement(UpdateBtn,3);
		clickButtonWithOutScroll(UpdateBtn);

	}

	@When("^user tap on back button in the transaction Details screen$")
	public void userTapOnBackButtonInTheTransactionDetailsScreen() {
		if(platformName.equalsIgnoreCase("Android")){
			androidBack();
		}
		else{
			clickButtonWithOutScroll(NavBackBtn);
		}
	}

	@And("^Verify if the thank you screen is displayed$")
	public void verifyIfTheThankYouScreenIsDisplayed() {
		waitForElement(thankYouHeader,6);
		Assert.assertTrue(thankYouHeader.isDisplayed());
		Assert.assertTrue(SafeJourneyTxt.isDisplayed());
	}
	@Then("^user enter the wrong pin number and click on continue button$")
	public void userEnterTheWrongPinNumberAndClickOnContinueButton() {

		if(paymentMethodPage.ListPinDigit1.size()>=1){
			waitFor(2000);
			enterTextWithoutScroll(paymentMethodPage.pinDigit1, "3");
			enterTextWithoutScroll(paymentMethodPage.pinDigit2, "4");
			enterTextWithoutScroll(paymentMethodPage.pinDigit3, "1");
			enterTextWithoutScroll(paymentMethodPage.pinDigit4, "6");
			clickButtonWithOutScroll(paymentMethodPage.pinContinueButton);
		}
	}

	@And("^User Tap Esso PIN Edit button$")
	public void userTapEssoPINEditButton() {
		waitFor(5000);
		clickButtonWithOutScroll(EssoPINEdit);

	}

//	@Then("^user clicks on Add nectar card$")
//	public void userClicksOnAddNectarCard() {
//		ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, OkNect);
//		waitFor(2000);
//		clickButtonWithOutScroll(OkNect);
//	}

	@Then("^user verifies the  Add nectar card task is completed$")
	public void userVerifiesTheAddNectarCardTaskIsCompleted() {
		waitFor(2000);
//		ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, OkNect);
		ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, OkNect);
//		ScrollTo(FrictionlessFlowConstants.Completsk, FrictionlessFlowConstants.IOSSCROLLUP, OkNect);
		clickButtonWithOutScroll(OkNect);
		staticTextValidation(profComCT,"Already Completed");
		staticTextValidation(profComCT1,"You have already completed this feature. Please select a feature without tickmark to complete your profile.");
		clickButtonWithOutScroll(Okcomplete);

	}

	@And("^user taps on confirm button in Confirm payment screen$")
	public void user_taps_on_confirm_button_in_confirm_payment_screen() throws Throwable {
		waitForElement(PaymentConfirm, 5);
		clickButtonWithOutScroll(PaymentConfirm);
	}

	@Then("^user is navigated to Enter pin screen$")
	public void user_is_navigated_to_enter_pin_screen() throws Throwable {
		waitForElement(EnterPINTxt, 5);
		Assert.assertTrue(isTextMatch(EnterPINTxt.getText(), FrictionlessFlowConstants.EnterPINTxt));
	}

	@Then("^Verify user is navigated to Enter Password screen$")
	public void verify_user_is_navigated_to_enter_password_screen() throws Throwable {
		waitForElement(EnterPWDText, 5);
		Assert.assertTrue(isTextMatch(EnterPWDText.getText(), FrictionlessFlowConstants.EssopwdTxt));
	}

	@Then("^verify user is navigated to Forgot Password screen$")
	public void verify_user_is_navigated_to_forgot_password_screen() throws Throwable {
		waitForElement(ForgotPWDTxt, 5);
		Assert.assertTrue(isTextMatch(ForgotPWDTxt.getText(), FrictionlessFlowConstants.ForgotPwd));
	}

	@Then("^verify the prompt message and tap on Ok button$")
	public void verify_the_prompt_message_and_tap_on_ok_button() throws Throwable {
		staticTextValidation(resendPopup_Title, FrictionlessFlowConstants.RESENDPOPUPTITLE);
		//staticTextValidation(resend_Popup_Msg,FrictionlessFlowConstants.RESENDPOPUPMSG);
		isElementDisplayed(resend_Popup_Msg);
		clickButtonWithOutScroll(Ok);
	}

	@Then("^user skip the Fingerprint option$")
	public void user_skip_the_fingerprint_option() throws Throwable {
		staticTextValidation(guestCheckOutPage.HeaderRightText, GuestCheckOutConstants.Skip);
		clickButtonWithOutScroll(guestCheckOutPage.HeaderRightText);

	}
//	@Then("^user should be navigated to NLID$")
//	public void user_should_be_navigated_to_nlid() throws Throwable {
//		waitVisibilityOfElement(guestCheckOutPage.FuelAsGuest);
//		isElementDisplayed(guestCheckOutPage.FuelAsGuest);
//	}
//	@And("^User Tap Esso PIN Edit button$")
//	public void userTapEssoPINEditButton() {
//		waitFor(5000);
//		clickButtonWithOutScroll(EssoPINEdit);
//	}
//	@Then("^user verify the security pop text$")
//	public void userVerifyTheSecurityPopText() {
//		staticTextValidation(Securitytxt,"Due to security reasons you need to login again.");
//	}
//	@Then("^user verify and click the ok button$")
//	public void userVerifyAndClickTheOkButton() {
//		isElementDisplayed(Securitytxtok);
//		clickButtonWithOutScroll(Securitytxtok);
//	}
//	@Then("^user verify after tap on ok button navigate to NLID screen$")
//	public void userVerifyAfterTapOnOkButtonNavigateToNLIDScreen() {
//		staticTextValidation(DashRegstr,"REGISTER AN ACCOUNT");
//	}

}