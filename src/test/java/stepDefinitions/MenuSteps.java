package stepDefinitions;

import contants.AccountConstants;
import contants.ManualRegistrationConstants;
import contants.MenuConstants;
import contants.StationFinderConstants;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

public class MenuSteps extends MenuPage {
	AccountPage AccountPage = new AccountPage();
	AccountSteps AccountSteps = new AccountSteps();
	StationFinderPage stationFinderPage = new StationFinderPage();
	ContextualRegistrationPage ContextualRegistrationPage = new ContextualRegistrationPage();

	@When("^user navigates to products & Information$")
	public void user_navigates_to_products_information() throws Throwable {
		clickButtonWithOutScroll(Product1);
	}

	@Then("^verify the Tab bar at the bottom of App UI screen$")
	public void verify_the_tab_bar_at_the_bottom_of_app_ui_screen() throws Throwable {
		waitForElement(action_history,30);
		if (isElementDisplayed(action_history))
		{
			Assert.assertTrue(isElementDisplayed(fuel));
			Assert.assertTrue(isElementDisplayed(more));
			Assert.assertTrue(isElementDisplayed(action_offer));
			Assert.assertTrue(isElementDisplayed(action_history));
			//Assert.assertTrue(isElementDisplayed(TabStation));
		} else {
			isElementDisplayed(fuel);
			staticTextValidation(fuel, MenuConstants.fuel);
			isElementDisplayed(more);
			Assert.assertTrue(isTextMatch(more.getText(), MenuConstants.More));
			isElementDisplayed(action_offer);
			Assert.assertTrue(isTextMatch(action_offer.getText(), MenuConstants.Offers));
			isElementDisplayed(action_history);
			Assert.assertTrue(isTextMatch(action_history.getText(), MenuConstants.His));
		}
	}

	@When("^user enters login the username and pwd$")
	public void user_enters_login_the_username_and_pwd() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			waitFor(5000);
			clickButtonWithOutScroll(FFEmail);
			waitFor(5000);
			// clickButtonWithOutScroll(Essopop);
			enterTextWithoutScroll(FFEmail, MenuConstants.LoggedEmail);
			enterTextWithoutScroll(FFPassword, MenuConstants.LoggedPassword);
		}
	}

	@When("^user DontAllow location access$")
	public void user_DontAllow_location_access() throws Throwable {
		clickButtonWithOutScroll(Continue);
		Thread.sleep(5000);
		if (isElementDisplayed(DontAllow)) {
			clickButtonWithOutScroll(DontAllow);
		}
	}

	@Then("^verify user is on non logged in Dashboard$")
	public void verify_user_is_on_non_logged_in_dashboard() throws Throwable {
		waitFor(5000);
		if (platformName.equalsIgnoreCase("Android")) {
			isElementDisplayed(AccountPage.AccountLogin);
		} else {
			Assert.assertTrue(isElementDisplayed(DashRegstr));
		}
	}

	@Then("^user able to view Fuel, Station, Offers$")
	public void user_able_to_view_fuel_station_offers() throws Throwable {
		isElementDisplayed(TabFuel);
		isElementDisplayed(TabStation);
		isElementDisplayed(Taboffers);
	}

	@And("^History,More$")
	public void historymore() throws Throwable {
		isElementDisplayed(TabHistory);
		isElementDisplayed(TabMore);
	}

	@And("^verify user is able to see login popup$")
	public void verify_user_is_able_to_see_login_popup() throws Throwable {
		waitForElement(loginpopop,5);
		staticTextValidation(loginpopop, MenuConstants.MESSAGE);
	}

	@Then("^user taps on ok button$")
	public void user_taps_on_ok_button() throws Throwable {
		waitForElement(OkButton,5);
		clickButtonWithOutScroll(OkButton);
	}

	@When("^user taps on Station Finder$")
	public void user_taps_on_Station_Finder() throws Throwable {
		if (isElementEnabled(CloseButtonModalPopupLid)) {
			clickButtonWithOutScroll(CloseButtonModalPopupLid);
		}
		waitFor(9000);
		isElementDisplayed(TabStation);
		clickButtonWithOutScroll(TabStation);
	}

	@Then("^user verify the Location Permission screen$")
	public void user_verify_the_location_permission_screen() throws Throwable {
		waitFor(9000);
		Assert.assertTrue(isTextMatch(FFheadertext.getText().trim(), MenuConstants.FF_LOCATION));
		Assert.assertTrue(isTextMatch(FFCopytext.getText().trim(), MenuConstants.FF_NEAREST));
		Assert.assertTrue(isTextMatch(FFdirectiontext.getText().trim(), MenuConstants.FF_NEARESTMSG));
	}

	@When("^user navigates to Fuel Finder screen and Verify$")
	public void user_navigates_to_fuel_finder_screen_and_verify() throws Throwable {

		if (isElementDisplayed(FFbutton)) {
			Assert.assertTrue(isTextMatch(FFbutton.getText().trim(), MenuConstants.FF_SCREEN));
			clickButtonWithOutScroll(FFbutton);
			
			}	

		 else {
			Assert.assertTrue(isTextMatch(FFbutton.getText().trim(), MenuConstants.FF_SCREEN));
			clickButtonWithOutScroll(FFbutton);
			waitFor(4000);
			if (isElementDisplayedWithoutAssert(FFheadertext)) {
				clickButtonWithOutScroll(AllowLocContinueButton);
				waitFor(4000);
			}
			if (isElementDisplayedWithoutAssert(AllowPopupHeader)) {
				clickButtonWithOutScroll(AllowWhilePopup);
				waitFor(4000);
			}
			if (isElementDisplayedWithoutAssert(LocationPermissionSuccessScreen)) {
				clickButtonWithOutScroll(LocationPermissionContinueButton);
				waitFor(4000);
			}
			if (isElementDisplayedWithoutAssert(LocationPermissionCancelPopup)) {
				clickButtonWithOutScroll(LocationPermissionCancelPopup);
				waitFor(4000);
			}
		}
	}

	@When("^user taps on Continue button in Allow Location screen$")
	public void user_taps_on_Continue_button_in_Allow_Location_screen() throws Throwable {
		waitFor(1000);
		clickButtonWithOutScroll(AllowLocContinueButton);
	}

	@Then("user taps on ALLOW button$")
	public void user_taps_on_ALLOW_button() throws Throwable {
		waitFor(1000);
		clickButtonWithOutScroll(PermissionallowButton);
	}

	@When("^verify user is able to Navigate Station Finder screen$")
	public void verify_user_is_able_to_Navigate_Station_Finder_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			Assert.assertTrue(isTextMatch(stationFinderScreenTxt.getText().trim(), MenuConstants.STATIONFINDERTITLE));
		} else {
			if (isElementDisplayedWithoutAssert(MenuPage.LocationPermissionSuccessScreen)) {
				clickButtonWithOutScroll(MenuPage.LocationPermissionContinueButton);
			}
			waitFor(3000);
			Assert.assertTrue(isTextMatch(stationFinderScreenTxt.getText().trim(), MenuConstants.STATIONFINDERTITLE));

		}
	}

	@When("^user taps on Offers$")
	public void user_taps_on_Offers() throws Throwable {
		waitFor(5000);
		clickButtonWithOutScroll(Taboffers);
	}

	@When("^verify user is able to Navigate Offers screen$")
	public void verify_user_is_able_to_Navigate_Offers_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitFor(2000);
			Assert.assertTrue(isTextMatch(OffersScreenWithoutVerify.getText().trim(),
					MenuConstants.OFFERSSCREENCTWITHOUTVERIFYCARD));
		} else {
			waitFor(1000);
			Assert.assertTrue(isTextMatch(OffersScreenTitle.getText().trim(), MenuConstants.OFFERSSCREEN));
		}
	}

	@When("^user taps on History$")
	public void user_taps_on_History() throws Throwable {
		clickButtonWithOutScroll(TabHistory);
//		waitFor(2000);
	}

	@When("^verify user is able to Navigate History screen$")
	public void verify_user_is_able_to_Navigate_History_screen() throws Throwable {
		waitFor(5000);
		staticTextValidation(HistoryScreenTitle, MenuConstants.HISTORYCREEN);
	}

	@Then("^user taps on Tell a Friend$")
	public void user_taps_on_refer_a_friend() throws Throwable {
		clickButtonWithOutScroll(ReferAfriend);
	}

	@And("^verify system navigating to Refer a Friend screen$")
	public void verify_system_navigating_to_refer_a_friend_screen() throws Throwable {
		Assert.assertTrue(isElementDisplayed(ReferAfriendtitle));
		// isElementDisplayed(ReferAfriendfamily);
	}

	@Then("^user tabs on back button$")
	public void user_tabs_on_back_button() throws Throwable {
		waitForElement(Backbutton,10);
		clickButtonWithOutScroll(Backbutton);
	}

	@Then("^verify the about Esso fuel products & Information$")
	public void verify_the_about_first_fuel_products_information() throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			waitForElement(ProductsAndInfoAboutEsso, 10);
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInformation));
			// Assert.assertTrue(isElementDisplayedWithoutScroll(ProductInfoInformation));
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoEssoNectar));
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoAboutEsso));
			ScrollTo(MenuConstants.PRODUCTSANDINFOPRODUCTS, MenuConstants.IOSSCROLLUP, ProductsAndInfoProducts);
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoProducts));
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoEssoSynergy));
			ScrollTo(MenuConstants.PRODUCTSANDINFOMOBILMOTOR, MenuConstants.IOSSCROLLUP, ProductsAndInfoMobilMotor);
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoMobilMotor));
		}
		else
		{
			waitForElement(ProductsAndInfoAboutEsso, 10);
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInformation));
			// Assert.assertTrue(isElementDisplayedWithoutScroll(ProductInfoInformation));
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoEssoNectar));
			Assert.assertTrue(isElementDisplayedWithoutScroll(ProductsAndInfoAboutEsso));
//			ScrollTo(MenuConstants.PRODUCTSANDINFOPRODUCTS, MenuConstants.IOSSCROLLUP, ProductsAndInfoProducts);
//			ScrollTo(MenuConstants.ABOUTESSO, MenuConstants.IOSSCROLLUP, ProductAboutEsso);
			Assert.assertTrue(isElementEnabled(ProductsAndInfoProducts));
			Assert.assertTrue(isElementEnabled(ProductsAndInfoEssoSynergy));
//			ScrollTo(MenuConstants.PRODUCTSANDINFOMOBILMOTOR, MenuConstants.IOSSCROLLUP, ProductsAndInfoMobilMotor);
//			ScrollTo(MenuConstants.ESSOSYNERGY, MenuConstants.IOSSCROLLUP, ProductEssoSynergy);
			isElementEnabled(ProductsAndInfoMobilMotor);
		}
	}

	@When("^user navigates to Help screen$")
	public void user_navigates_to_help_screen() throws Throwable {
		clickButtonWithOutScroll(Help);
		waitFor(3000);
	}

	@And("^validate the Call text as Speak to a customer representative and Normal call rates apply.$")
	public void validate_the_call_text_as_speak_to_a_customer_representative_and_normal_call_rates_apply()
			throws Throwable {
		Assert.assertTrue(isTextMatch(CallText.getText(), MenuConstants.Call_Text));
		Assert.assertTrue(isTextMatch(CallTextNormal.getText(), MenuConstants.Call_Text_Normal));
	}

	@When("^User click on the call link$")
	public void user_click_on_the_call_link() throws Throwable {
		clickButtonWithOutScroll(Call);
		waitFor(500);
//		clickButtonWithOutScroll(Callbutton);
		Thread.sleep(2000);
	}

	@Then("^verify if user click on call its navigating to dial pad screen$")
	public void verify_if_user_click_on_call_its_navigating_to_dialpad_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(Cancelbutton);
		} else {
//			driver.navigate().back();
			clickButtonWithOutScroll(CallcancelButton);
		}
	}

	@Then("^verify the following content in tab bar$")
	public void verify_the_following_content_in_tab_bar(DataTable arg1) throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(isTextMatch(ReferAfriend.getText(), MenuConstants.TellAFRIEND));
		Assert.assertTrue(isTextMatch(AccountBtn.getText(), MenuConstants.ACCOUNT1));
		Assert.assertTrue(isTextMatch(SettingsBtnMore.getText(), MenuConstants.SETTINGSBUTTON));
		Assert.assertTrue(isTextMatch(ProductsAndInformation.getText(), MenuConstants.ProductsandInformation));
		Assert.assertTrue(isTextMatch(Help.getText(), MenuConstants.HELP));

	}

	@And("^verify system navigating to login page$")
	public void verify_system_navigating_to_login_page() throws Throwable {
		waitForElement(headerloginpage,10);
		Assert.assertTrue(isElementDisplayed(headerloginpage));

	}

	@Then("^user veify the display the available payment methods under the payment method section$")
	public void user_veify_the_display_the_available_payment_methods_under_the_payment_method_section()
			throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), MenuConstants.PAYMENTMETHODACCOUNT));
			waitFor(3000);
			ScrollTo(MenuConstants.MaxiumumFuelling, MenuConstants.IOSSCROLLUP, MfaTitleAccount);
			if (isElementDisplayedWithoutAssert(ApplePayTextAccount)) {
				Assert.assertTrue(isElementDisplayed(ApplePayTextAccount));
			}
			if (isElementDisplayedWithoutAssert(PaypalTextAccount)) {
				Assert.assertTrue(isElementDisplayed(PaypalTextAccount));
			}
			if (isElementDisplayedWithoutAssert(DebitCardAccount)) {
				Assert.assertTrue(isElementDisplayed(DebitCardAccount));
			}
		}
	}

	@Then("^Tap on OK button$")
	public void tap_on_OK_button() throws Throwable {
		clickButtonWithOutScroll(exxon_Help_feedback_Promtmsgok);
		waitFor(5000);
	}

	@Then("^User gives more feedback and submit$")
	public void user_gives_more_feedback_and_submit() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLDOWN, exxon_Help_feedback_submit);
		// clickButtonWithOutScroll(exxon_Help_feedback_firstAllStars);
		// clickButtonWithOutScroll(exxon_Help_feedback_SecondAllStars);
		// clickButtonWithOutScroll(exxon_Help_feedback_ThirdsAllStars);
		// clickButtonWithOutScroll(exxon_Help_feedback_fourthAllStars);
		clickButtonWithOutScroll(exxon_Help_feedback_submit);
		clickButtonWithOutScroll(exxon_Help_feedback_Ok);
	}

	@Given("^User click on the Esso App Feedback$")
	public void user_click_on_the_ff_app_feedback() throws Throwable {
		waitForElement(FDHelp_Feedback,10);
		staticTextValidation(EssoFeedbackSubtitle, MenuConstants.ESSOFEEDBACKSUBTITLE);
		clickButtonWithOutScroll(FDHelp_Feedback);
	}

	@Then("^User taps on Give Us more feedback$")
	public void user_taps_on_give_us_more_feedback() throws Throwable {
		waitFor(1000);
		clickButtonWithOutScroll(FDFF_MoreFeedback);
	}

	@Then("^user give stars for First Statement$")
	public void user_give_stars_for_First_Statement() throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(exxon_Help_feedback_firstAllStars);
	}

	@Then("^user give stars for Second Statement$")
	public void user_give_stars_for_Second_Statement() throws Throwable {
		clickButtonWithOutScroll(exxon_Help_feedback_SecondAllStars);
	}

	@Then("^user give stars for Third Statement$")
	public void user_give_stars_for_Third_Statement() throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(exxon_Help_feedback_ThirdsAllStars);
	}

	@Then("^user give stars for Fourth Statement$")
	public void user_give_stars_for_Fourth_Statement() throws Throwable {
		clickButtonWithOutScroll(exxon_Help_feedback_fourthAllStars);
		waitFor(2000);
	}

	@Then("^click on the SEND FEEDBACK button$")
	public void click_on_the_SEND_FEEDBACK_button() throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			ScrollTo(MenuConstants.SENDFEEDBACKHELP, MenuConstants.IOSSCROLLUP, exxon_Help_feedback_SendFeedbacktnx);
			clickButtonWithOutScroll(exxon_Help_feedback_SendFeedbackBtn);
		} else {
			clickButtonWithOutScroll(exxon_Help_feedback_SendFeedbackBtn);
		}
		waitFor(4000);
	}

	@Then("^verify the prompt message as \"([^\"]*)\"$")
	public void verify_the_prompt_message_as(String arg1) throws Throwable {
		waitFor(5000);
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_Promtmsgtnx.getText(), MenuConstants.FD_FFD_Thankyou));
	}

	@Then("^verify promt id getting closed and user navigated back to Help Screen$")
	public void verify_promt_id_getting_closed_and_user_navigated_back_to_Help_Screen() throws Throwable {
		Assert.assertTrue(isElementDisplayed(Help));
	}

	@Then("^verify title as \"([^\"]*)\"$")
	public void verify_title_as(String arg1) throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			Assert.assertTrue(isElementDisplayed(Help_Feedback_Logo));
		} else {
			waitForElement(Help_Feedback_Logo,5);
			Assert.assertTrue(Help_Feedback_Logo.isEnabled());

		}
	}

	@Then("^verify Sub title as \"([^\"]*)\"$")
	public void verify_Sub_title_as(String arg1) throws Throwable {
		Assert.assertTrue(isTextMatch(Help_Feedback_Improve.getText(), MenuConstants.FD_FFD_Improve));
	}

	@Then("^verify Esso App Feedback screen copy text$")
	public void verify_Esso_App_Feedback_screen_copy_text() throws Throwable {
		waitForElement(Help_Feedback_Screen,10);
		Assert.assertTrue(isTextMatch(Help_Feedback_Screen.getText(), MenuConstants.FD_FFD_Screen));

	}

	@Then("^verify Give Us More Feedback link$")
	public void verify_Give_Us_More_Feedback_link() throws Throwable {
		waitFor(1000);
		Assert.assertTrue(isTextMatch(FDFF_MoreFeedback.getText(), MenuConstants.FD_FFD_Givemore));
	}

	@And("^verify text box the statement reviews$")
	public void verify_text_box_the_statement_reviews() throws Throwable {
		waitFor(3000);
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, exxon_Help_feedback_submit);
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_Improve_Your.getText(), MenuConstants.FD_FFD_Improve_Your));
		Assert.assertTrue(isElementDisplayed(exxon_Help_feedback_textbox));
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_Charcter.getText(), MenuConstants.FD_FFD_Charcter));
	}

	@And("^verify the Esso App feedback screen$")
	public void verify_the_esso_app_feedback_screen() throws Throwable {
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_title.getText(), MenuConstants.FD_FFD_Title));
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_Close.getText(), MenuConstants.FD_FFD_Close));
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_Plsratemsgheader.getText(), MenuConstants.FD_FFD_header));
		Assert.assertTrue(
				isTextMatch(exxon_Help_feedback_Myfuellingexperience.getText(), MenuConstants.FD_FFD_Myfuelling));
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_savestime.getText(), MenuConstants.FD_FFD_Saves));
		Assert.assertTrue(
				isTextMatch(exxon_Help_feedback_Digitalreceipts.getText(), MenuConstants.FD_FFD_Digital_receipts));
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_EssoAppworks.getText(), MenuConstants.FD_FFD_No_errors));
	}

	@Given("^User click on the Frequently asked Question link$")
	public void user_click_on_the_frequently_asked_question_link() throws Throwable {
		clickButtonWithOutScroll(FDHelp_FAQ);
	}

	@Then("^Validate the header of Frequently asked Question title \"([^\"]*)\"$")
	public void validate_the_header_of_Frequently_asked_Question_title(String arg1) throws Throwable {
		waitForElement(FD_FAQ_Header,10);
		Assert.assertTrue(isElementEnabled(FD_FAQ_Header));
	}

	@Then("^Validate all the Frequently Asked Question Header$")
	public void validate_all_the_Frequently_Asked_Question_Header_value(DataTable arg1) throws Throwable {
		waitForElement(FDFAQ_How);
		Assert.assertTrue(isTextMatch(FDFAQ_How.getText(), MenuConstants.FD_FAQ_How));
		Assert.assertTrue(isTextMatch(FDFAQ_pay.getText(), MenuConstants.FD_FAQ_Payments));
		Assert.assertTrue(isTextMatch(FDFAQ_sfty.getText(), MenuConstants.FD_FAQ_Safety));
		Assert.assertTrue(isTextMatch(FDFAQ_Loyalty.getText(), MenuConstants.FD_FAQ_Loyalty));
		Assert.assertTrue(isTextMatch(FDFAQ_Benefitsofusing.getText(), MenuConstants.FD_FAQ_Benefits));
		Assert.assertTrue(isTextMatch(FDFAQ_Technical.getText(), MenuConstants.FD_FAQ_Technical));
		Assert.assertTrue(isTextMatch(FDFAQ_Communications.getText(), MenuConstants.FD_FAQ_Communications));
	}

	@Given("^User click on the Esso App Tutorial Link and verify next screens$")
	public void user_click_on_the_esso_app_tutorial_link_and_verify_next_screens() throws Throwable {
		clickButtonWithOutScroll(Esso_Help_App_Tutorial);
	}

	@Then("^User click on the get started button$")
	public void user_click_on_the_get_started_button() throws Throwable {
		waitForElement(exxon_Help_Tutorial_NextBtn);
		clickButtonWithOutScroll(exxon_Help_Tutorial_NextBtn);
		waitForElement(exxon_Help_Tutorial_NextBtn);
		clickButtonWithOutScroll(exxon_Help_Tutorial_NextBtn);
		waitForElement(exxon_Help_Tutorial_GetStartedBtn);
		clickButtonWithOutScroll(exxon_Help_Tutorial_GetStartedBtn);
		waitFor(2000);
	}

	@Then("^validate user on Help page$")
	public void validate_user_on_help_page() throws Throwable {
		Assert.assertTrue(isTextMatch(Esso_Help_App_Tutorial.getText(), MenuConstants.FD_Help_App_Tutorial));
	}

	@And("^validate the Email title as Send us your questions or thoughts$")
	public void validate_the_email_title_as_send_us_your_questions_or_thoughts() throws Throwable {
		waitForElement(FDHelp_Email_Text);
		Assert.assertTrue(isTextMatch(FDHelp_Email_Text.getText(), MenuConstants.FD_Help_Email_Text));
	}

	@Given("^User click on the Email link$")
	public void user_click_on_the_email_link() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			ScrollTo(MenuConstants.FD_Help_Email, "down", FDHelp_Email_Navigation);
			clickButtonWithOutScroll(FDHelp_Email_Navigation);
		} else {
			waitForElement(FDHelp_Email_Navigation,5);
			clickButtonWithOutScroll(FDHelp_Email_Navigation);
		}
	}

	@Then("^validate the email page$")
	public void validate_the_email_page() throws Throwable {

		if ("IOS".equalsIgnoreCase(platformName)) {

			Assert.assertTrue(
					isTextMatch(FDHelp_Email_Validation.getText(), MenuConstants.FD_Help_Email_Validation_text1));

		} else {
			Assert.assertTrue(
					isTextMatch(FDHelp_Email_Validation.getText(), MenuConstants.FD_Help_Email_Validation_text));

		}
	}

	@Then("^validate the Help page options$")
	public void validate_the_help_page_options() throws Throwable {
		Assert.assertTrue(isTextMatch(Esso_Help_App_Tutorial.getText(), MenuConstants.FD_Help_App_Tutorial));
		Assert.assertTrue(isTextMatch(FDHelp_FAQ.getText(), MenuConstants.FD_Help_FAQ));
		Assert.assertTrue(isTextMatch(FDHelp_Email_Navigation.getText(), MenuConstants.FD_Help_Email));
		Assert.assertTrue(isTextMatch(FDHelp_Call.getText(), MenuConstants.FD_Help_Call));
		Assert.assertTrue(isTextMatch(FDHelp_Feedback.getText(), MenuConstants.FD_Help_Feedback));
//		if (platformName.equalsIgnoreCase("Android")) {
		ScrollTo(MenuConstants.Youtube_link_scroll, "up", FDYoutube_link);
//		}
		Assert.assertTrue(isTextMatch(FDYoutube_link.getText(), MenuConstants.Youtube_link));

	}

	@When("^user taps on History icon from footers$")
	public void userTapsOnHistoryIconFromFooters() {
		waitFor(3000);
		clickButtonWithOutScroll(historyBtn);
	}

	@Then("^user should navigate to Transaction History Screen$")
	public void userShouldNavigateToTransactionHistoryScreen() {
		waitFor(2000);
		Assert.assertTrue(isElementDisplayed(TransactionHistoryTitle));
	}

	@When("^user taps on Select Button$")
	public void userTapsOnSelectButton() {
		clickButtonWithOutScroll(selectButton);
	}

	@Then("^System should display Email Receipt button with Disable state$")
	public void systemShouldDisplayEmailReceiptButtonWithDisableState() throws Exception {
		if (emailReceipt.isEnabled()) {
			throw new Exception("Email is not disabled");
		}
	}

	@When("^user select any Transaction Checkbox History$")
	public void userSelectAnyTransactionCheckboxHistory() {
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(transactionCheckBox);
		} else {
			clickButtonWithOutScroll(TransDate);
		}

	}

	@When("^user taps on Email receipt Button$")
	public void userTapsOnEmailReceiptButton() {
		clickButtonWithOutScroll(emailReceiptButton);
	}

	@Then("^user should able to see Popup with text as Receipts sent via email$")
	public void userShouldAbleToSeePopupWithTextAsReceiptSSentViaEmail() {
		waitFor(3000);
		if (platformName.equalsIgnoreCase("Android")) {
			Assert.assertTrue(isTextMatch(emailReceiptMessage.getText(), MenuConstants.MESSAGE));
		} else {
			Assert.assertTrue(isTextMatch(emailReceiptMessage.getText(), MenuConstants.MESSAGE1));
		}

	}

	@When("^user taps on Ok Button$")
	public void userTapsOnOkButton() {
		clickButtonWithOutScroll(okBtn);
	}

	@And("^user should not see transaction history$")
	public void user_should_not_see_transaction_history() throws Throwable {
		Assert.assertTrue(isElementDisplayed(NoHistory));
	}

	@And("^transaction for last 90 days$")
	public void transaction_for_last_90_days() throws Throwable {
		Assert.assertTrue(isElementDisplayed(day90s));
	}

	@Then("^the deatils as Date, Time, Transaction Amount$")
	public void the_deatils_as_Date_Time_Transaction_Amount() throws Throwable {
		Assert.assertTrue(isElementDisplayed(TransAmt));
		Assert.assertTrue(isElementDisplayed(TransDate));
		Assert.assertTrue(isElementDisplayed(TransDtl));
	}

	@Then("^user tap on transaction list$")
	public void user_tap_on_transaction_list() throws Throwable {
		clickButtonWithOutScroll(TransDtl);
	}

	@And("^user is navigated to transaction details$")
	public void user_is_navigated_to_transaction_details() throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			Assert.assertTrue(FuelDtls.isEnabled());
		} else {
			Assert.assertTrue(isElementDisplayed(FuelDtls));
		}
		Assert.assertTrue(isElementDisplayed(TransHead));
	}

	@Then("^user taps on select button in transaction history$")
	public void user_taps_on_select_button_in_transaction_history() throws Throwable {
		clickButtonWithOutScroll(selectButton);
	}

	@Then("^user should select an order and tap on email receipt$")
	public void user_should_select_an_order_and_tap_on_email_receipt() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			clickButtonWithOutScroll(SelectCkbx);
		} else {
			clickButtonWithOutScroll(TransDate);
		}
		clickButtonWithOutScroll(emailReceipt);
	}

	@And("^tap on ok button to share pdf$")
	public void tap_on_ok_button_to_share_pdf() throws Throwable {
		clickButtonWithOutScroll(ShareBTN);
	}

	@Then("^user tap on view vat receipt and validate$")
	public void user_tap_on_view_vat_receipt_and_validate() throws Throwable {
		clickButtonWithOutScroll(VatView);
		Assert.assertTrue(isElementDisplayed(ShareBTN));
		Assert.assertTrue(isElementDisplayed(Backbutton));
	}

	@And("^user validate vat receipt view link$")
	public void user_validate_vat_receipt_view_link() throws Throwable {
		waitForElement(VatView);
		Assert.assertTrue(isElementDisplayed(VatView));
	}

	@Then("^user tap on Add note link$")
	public void user_tap_on_add_note_link() throws Throwable {
		clickButtonWithOutScroll(AddNote);
	}

	@Then("^enter a note and save$")
	public void enter_a_note_and_save() throws Throwable {

		enterTextWithoutScroll(Notetxt, MenuConstants.NOTETXT);
		clickButtonWithOutScroll(NoteSave);
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(PopOk)) {
			clickButtonWithOutScroll(PopOk);
			waitFor(1000);
		}
	}

	@Then("^validate the entered note$")
	public void validate_the_entered_note() throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			if (isElementDisplayedWithoutAssert(EssoTitleTranscationDetails)) {
				if (isElementDisplayedWithoutAssert(NoteWithEsso)) {
					Assert.assertTrue(isTextMatch(NoteWithEsso.getText(), MenuConstants.NOTETXT));
				} else {
					ScrollTo(MenuConstants.MAX140CHARACTERSESSOFEEDBACK, AccountConstants.IOSSCROLLUP, NoteWithEsso);
					Assert.assertTrue(isTextMatch(NoteWithEsso.getText(), MenuConstants.NOTETXT));
				}
			} else {
				Assert.assertTrue(isTextMatch(NoteWithoutEsso.getText(), MenuConstants.NOTETXT));
			}
		} else {
			Assert.assertTrue(isTextMatch(NoteWithEsso.getText(), MenuConstants.NOTETXT));
		}
	}

	@Then("^user taps on view tax button$")
	public void userTapsOnViewTaxButton() {
		clickButtonWithOutScroll(VatView);
	}

	@When("^user taps on back Arrow from transaction details$")
	public void userTapsOnBackArrowFromTransactionDetails() {
		clickButtonWithOutScroll(tansaction_BackBtn);
	}

	@When("^user should navigate to transaction details screen$")
	public void user_should_navigate_to_transaction_details_screen() throws Throwable {
		Assert.assertTrue(isElementDisplayed(TransactionDetailsScreenTitle));
	}

	@When("^user taps on any of the Transaction infos from list$")
	public void user_taps_on_any_of_the_Transaction_infos_from_list() throws Throwable {
		clickButtonWithOutScroll(TransactionHistoryInfo);
	}

	@Then("^user should validate the email setting options$")
	public void user_should_validate_the_email_setting_options() throws Throwable {
		ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.TermsACondition);
		Assert.assertTrue(isTextMatch(Account_Emailsetting.getText(), MenuConstants.EmailTXT));
	}

	@And("^user should validate the Receipt subscription$")
	public void user_should_validate_the_receipt_subscription() throws Throwable {
		waitFor(2000);
		if (platformName.equalsIgnoreCase("iOS")) {
			if (isElementDisplayedWithoutAssert(ReceiptCKbx)) {
				Assert.assertTrue(isElementDisplayed(ReceiptCKbx));
			} else {
				Assert.assertTrue(isElementDisplayed(emailUnCircleCheck_box));
			}
			Assert.assertTrue(isTextMatch(Account_Recipetmailmsg.getText(), MenuConstants.ReceiveTXT));
		} else {
			Assert.assertTrue(isElementDisplayed(Account_Recipetcheckbox));
			Assert.assertTrue(isTextMatch(Account_Recipetmailmsg.getText(), MenuConstants.ReceiveTXT));
		}
	}

	@And("^user should validate the Receipt marketing subscriptions$")
	public void user_should_validate_the_receipt_marketing_subscriptions() throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			if (isElementDisplayedWithoutAssert(promotionsCircleCheck_box)) {
				Assert.assertTrue(isElementDisplayed(promotionsCircleCheck_box));
			} else {
				Assert.assertTrue(isElementDisplayed(promotionsUnCircleCheck_box));
			}
			Assert.assertTrue(isTextMatch(Account_Receivemsg.getText(), MenuConstants.OfferTxt));
		} else {
			Assert.assertTrue(isElementDisplayed(Account_Receiveemailcheckbox));
			Assert.assertTrue(isTextMatch(Account_Receivemsg.getText(), MenuConstants.OfferTxt));
		}
	}

	@Then("^system displays the popup with the contents$")
	public void systemDisplaysThePopupWithTheContents() {
		if (platformName.equalsIgnoreCase("iOS")) {
			waitFor(3000);
			isElementDisplayed(AllowOncePopup);
			isElementDisplayed(AllowWhilePopup);
			isElementDisplayed(DontAllowPopup);
		}
		else if (platformName.equalsIgnoreCase("Android"))
		{
			waitFor(6000);
			staticTextValidation(AllowOncePopup, StationFinderConstants.ALLOWONCE);
			staticTextValidation(AllowWhilePopup, StationFinderConstants.ALLOWALWAYS);
			staticTextValidation(DontAllowPopup, StationFinderConstants.ALLOWDENY);

		}
	}

	@When("^user taps on dont allow button$")
	public void userTapsOnDontAllowButton() {
		waitFor(7000);
		clickButtonWithOutScroll(DontAllowPopup);
	}

	@Then("^system should display the location access for the app$")
	public void systemShouldDisplayTheLocationAccessForTheApp() {

		if (platformName.equalsIgnoreCase("iOS")) {
			isElementDisplayed(DontallowCancel);
			isElementDisplayed(DontAllowSettings);
		}

	}

	@Then("^user verifies the back button in the top left corner$")
	public void user_verifies_the_back_button_in_the_top_left_corner() throws Throwable {
		waitFor(3000);
		Assert.assertTrue(isElementDisplayed(Backbutton));
		waitFor(3000);
	}

	@Then("^user verifies whether landed on the Extended Tab bar$")
	public void user_verifies_whether_landed_on_the_extended_tab_bar() throws Throwable {
		waitFor(3000);
		Assert.assertTrue(isTextMatch(ReferAfriend.getText(), MenuConstants.TellAFRIEND));
		Assert.assertTrue(isTextMatch(AccountBtn.getText(), MenuConstants.ACCOUNT1));
		Assert.assertTrue(isTextMatch(SettingsBtnMore.getText(), MenuConstants.SETTINGSBUTTON));
		Assert.assertTrue(isTextMatch(ProductsAndInformation.getText(), MenuConstants.ProductsandInformation));
		Assert.assertTrue(isTextMatch(Help.getText(), MenuConstants.HELP));
	}

	@Then("^user verifies the User Profile section$")
	public void user_verifies_the_user_profile_section() throws Throwable {
		waitFor(9000);
		Assert.assertTrue(isTextMatch(AccountTitle.getText(), MenuConstants.ACCOUNT1));
		Assert.assertTrue(isTextMatch(UserProfileAccount.getText(), MenuConstants.USERPROFILEACCOUNT));
		Assert.assertTrue(isTextMatch(FullNameAccount.getText(), MenuConstants.FULLNAMEACCOUNT));
		Assert.assertTrue(isTextMatch(PasswordAccount.getText(), MenuConstants.PASSWORDACCOUNT));
		Assert.assertTrue(isTextMatch(MobileNumberAccount.getText(), MenuConstants.MOBILEACCOUNT));
		Assert.assertTrue(isTextMatch(EssoPinAccount.getText(), MenuConstants.ESSOPINACCOUNT));
	}

	@Then("^user verifies the Payment, MFA and Nectar section$")
	public void user_verifies_the_payment_mfa_and_nectar_section() throws Throwable {
		Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), MenuConstants.PAYMENTMETHODACCOUNT));
		//ScrollTo(MenuConstants.MaxiumumFuelling, MenuConstants.IOSSCROLLUP, MfaTitleAccount);
		
		ScrollTo(MenuConstants.MaxiumumFuelling1, AccountConstants.IOSSCROLLUP, MenuPage.MfaTitleAccount);
		waitFor(1000);
		Assert.assertTrue(isTextMatch(MfaTitleAccount.getText(), MenuConstants.MaxiumumFuelling));
		if (isElementDisplayedWithoutAssert(EssoTitleAccount)) {
			Assert.assertTrue(isElementDisplayed(EssoTitleAccount));
		} else {
			ScrollTo(MenuConstants.EssoTitleAccount1, MenuConstants.IOSSCROLLUP, EssoTitleAccount);
			Assert.assertTrue(isElementDisplayed(EssoTitleAccount));
		}
	}

	@Then("^user verifies the Device settings section$")
	public void user_verifies_the_device_settings_section() throws Throwable {
		if (isElementDisplayedWithoutAssert(NotificationsTitleAccount)) {
			Assert.assertTrue(
					isTextMatch(NotificationsTitleAccount.getText(), MenuConstants.PushNotificationsTitleAccount));
		} else {
			ScrollTo(MenuConstants.LocationServicesTitleAccount, MenuConstants.IOSSCROLLUP, NotificationsTitleAccount);
			Assert.assertTrue(
					isTextMatch(NotificationsTitleAccount.getText(), MenuConstants.PushNotificationsTitleAccount));
		}
		if (isElementDisplayedWithoutAssert(LocationTitleAccount)) {
			Assert.assertTrue(isTextMatch(LocationTitleAccount.getText(), MenuConstants.LocationServicesTitleAccount));
		}
		ScrollTo(MenuConstants.EmailSettingsTitleAccount, MenuConstants.IOSSCROLLUP, EmailSettingsTitleAccount);
		if (isElementDisplayedWithoutAssert(CameraTitleAccount)) {
			Assert.assertTrue(isTextMatch(CameraTitleAccount.getText(), MenuConstants.CameraAccessTitleAccount));
		}
		if (isElementDisplayedWithoutAssert(TouchIDTitleAccount)) {
			Assert.assertTrue(isTextMatch(TouchIDTitleAccount.getText(), MenuConstants.TouchIdTitleAccount));
		}
	}

	@Then("^user verifies the Email settings section$")
	public void user_verifies_the_email_settings_section() throws Throwable {
		ScrollTo(MenuConstants.LOGOUTTXT, MenuConstants.IOSSCROLLUP, LogOut);
		Assert.assertTrue(isTextMatch(EmailSettingsTitleAccount.getText(), MenuConstants.EmailSettingsTitleAccount));
	}

	@Then("^user verifies TC and PP link sections$")
	public void user_verifies_tc_and_pp_link_sections() throws Throwable {
		Assert.assertTrue(isElementDisplayed(TCLinkAccount));
		Assert.assertTrue(isElementDisplayed(PPLinkAccount));
	}

	@Then("^user verifies the Logout button section$")
	public void user_verifies_the_logout_button_section() throws Throwable {
		Assert.assertTrue(isElementDisplayed(LogOut));
	}

	@And("^user taps the logout button in the Account screen$")
	public void user_taps_the_logout_button_in_the_account_screen() throws Throwable {
		clickButtonWithOutScroll(LogOut);
		waitFor(9000);
	}

	@Then("^user lands in the NLID screen after logout$")
	public void user_lands_in_the_nlid_screen_after_logout() throws Throwable {
		Assert.assertTrue(isElementDisplayed(DashRegstr));
	}

	@And("^user taps on Add Pay Pal account in Account screen$")
	public void user_taps_on_add_pay_pal_account_in_account_screen() throws Throwable {
		ScrollTo(MenuConstants.EmailSettingsTitleAccount, MenuConstants.IOSSCROLLUP, LogOut);
		ScrollToDown(MenuConstants.MaxiumumFuelling, MenuConstants.IOSSCROLLDOWN, PaypalBtn);
		clickButtonWithOutScroll(PaypalBtn);
	}

	@Then("^user verifies the Paypal page$")
	public void user_verifies_the_paypal_page() throws Throwable {
		waitFor(5000);
		clickButtonWithOutScroll(ContinuePaypalButton);
		waitFor(5000);
//		Assert.assertTrue(isElementDisplayed(CancelPaypaPageButton));

	}

	@And("^user verifies the Account title in the account section$")
	public void userVerifiesTheAccountTitleInTheAccountSection() {
		Assert.assertTrue(isTextMatch(AccountTitle.getText(), MenuConstants.ACCOUNT1));
	}

	@And("^user verifies the user profile title and the icon in the account section$")
	public void userVerifiesTheUserProfileTitleAndTheIconInTheAccountSection() {
		Assert.assertTrue(isTextMatch(UserProfileAccount.getText(), MenuConstants.USERPROFILEACCOUNT));
		Assert.assertTrue(isElementDisplayed(InfoIconUser));
	}

	@And("^user should verify the masked password and edit button in the account section$")
	public void userShouldVerifyTheMaskedPasswordAndEditButtonInTheAccountSection() {
		if (platformName.equalsIgnoreCase("iOS")) {
			Assert.assertTrue(
					isTextMatch(MaskedPasswordAccountScreen.getText(), MenuConstants.MASKEDPASSWORD1ACCOUNTSCREEN));
			Assert.assertTrue(isElementDisplayed(PasswordEdit));
		} else {
			Assert.assertTrue(
					isTextMatch(MaskedPasswordAccountScreen.getText(), MenuConstants.MASKEDPASSWORDACCOUNTSCREEN));
			Assert.assertTrue(isElementDisplayed(PasswordEdit));
		}
	}

	@Then("^user verifies the edit password title$")
	public void userVerifiesTheEditPasswordTitle() {
		Assert.assertTrue(isTextMatch(EditPasswordTitle.getText(), AccountConstants.EDITPASS));
	}

	@Then("^user verifies the Current password text box$")
	public void userVerifiesTheCurrentPasswordTextBox() {
		Assert.assertTrue(
				isTextMatch(AccountPage.CurrentPassword.getText(), MenuConstants.EDITPASSWORDCURRENTPASSWORD));
	}

	@Then("^user verifies the inline error message in Current password$")
	public void userVerifiesTheInlineErrorMessageInCurrentPassword() {
		Assert.assertTrue(isTextMatch(CurrentPasswordInlineErrorAccount.getText(), AccountConstants.CURRENTERMSG));
	}

	@And("^user Taps on show button and verify the current password typed is shown to the user$")
	public void userTapsOnShowButtonAndVerifyTheCurrentPasswordTypedIsShownToTheUser() {
		clickButtonWithOutScroll(FirstShowButton);
		waitFor(2000);
		Assert.assertTrue(isTextMatch(CurrentPasswordVisible.getText(), AccountConstants.NEWPASS));
	}

	@Then("^user taps on hide button and verify the masked password$")
	public void userTapsOnHideButtonAndVerifyTheMaskedPassword() {
		if (platformName.equalsIgnoreCase("iOS")) {
			clickButtonWithOutScroll(FirstShowButton);
			waitFor(2000);
			Assert.assertTrue(
					isTextMatch(AccountPage.CurrentPassword.getText(), MenuConstants.MASKEDPASSWORD1ACCOUNTSCREEN));
		} else {
			clickButtonWithOutScroll(FirstShowButton);
			waitFor(2000);
			Assert.assertTrue(
					isTextMatch(AccountPage.CurrentPassword.getText(), MenuConstants.MASKEDPASSWORDACCOUNTSCREEN));
		}
	}

	@And("^user enters incorrect Current password$")
	public void userEntersIncorrectCurrentPassword() {
		enterTextWithoutScroll(AccountPage.CurrentPassword, MenuConstants.ACCOUNTPASSWORD);
	}

	@Then("^user verifies the popup containing current password is wrong$")
	public void userVerifiesThePopupContainingCurrentPasswordIsWrong() {
		Assert.assertTrue(isTextMatch(CurrentPasswordErrorPopup.getText(), AccountConstants.CURRENTPASSER));
	}

	@And("^Tap on OK button in the popup$")
	public void tapOnOKButtonInThePopup() throws Throwable {
		clickButtonWithOutScroll(exxon_Help_feedback_Promtmsgok);
		waitFor(5000);
		if (isElementDisplayedWithoutAssert(UpdatePasswordPopup)) {
			clickButtonWithOutScroll(UpdatePasswordPopup);
		}
	}

	@Then("^user verifies the app redirects back to NLID$")
	public void userVerifiesTheAppRedirectsBackToNLID() throws Throwable {
		waitFor(5000);
		Assert.assertTrue(isElementDisplayed(DashRegstr));
	}

	@Then("^verify navigate back to account screen$")
	public void verify_navigate_back_to_account_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountTitle, AccountConstants.ACCOUNTHEADIOS);
		} else {
			staticTextValidation(HeadTxtAccount, AccountConstants.ACCOUNTHEAD);
		}
	}

	@Then("^user verifies the title and taps on Close button$")
	public void userVerifiesTheTitleAndTapsOnCloseButton() {
		Assert.assertTrue(isElementDisplayed(TandCTitle));
		Assert.assertTrue(isElementDisplayed(TandCCloseBtn));
		clickButtonWithOutScroll(TandCCloseBtn);
	}

	@Then("^user closes the Privacy Policy screen$")
	public void userClosesThePrivacyPolicyScreen() throws Throwable {
		clickButtonWithOutScroll(Backbutton);
		waitFor(5000);
	}

	@Then("^user verifies the Confirm new password text box$")
	public void userVerifiesTheConfirmNewPasswordTextBox() {
		if (isElementDisplayedWithoutAssert(KayDone)) {
			clickButtonWithOutScroll(KayDone);
		}
		Assert.assertTrue(isTextMatch(ConfirmPassword.getText(), MenuConstants.EDITPASSWORDCONFIRMNEWPASSWORD));
	}

	@And("^user enters Confirm New Password with max first set of Ascii characters$")
	public void user_enters_confirm_new_password_with_max_first_set_of_ascii_characters() throws Throwable {
		enterTextWithoutScroll(ConfirmPassword, MenuConstants.MAX30ASCIIPASSWORD1);
	}

	@And("^user verifies on show button and verify the Ascii characters \"([^\"]*)\" in confirm password typed is shown to the user$")
	public void user_verifies_on_show_button_and_verify_the_ascii_characters_something_in_confirm_password_typed_is_shown_to_the_user(
			String strArg1) throws Throwable {
		clickButtonWithOutScroll(ThirdShowButton);
		waitFor(2000);
		Assert.assertTrue(isTextMatch(ConfirmPasswordVisible.getText(), MenuConstants.MAX30ASCIIPASSWORD1));
	}

	@And("^user enters Confirm New Password with max of \"([^\"]*)\" Ascii characters from \"([^\"]*)\"$")
	public void user_enters_confirm_new_password_with_max_of_something_ascii_characters_from_something(String strArg1,
																									   String strArg2) throws Throwable {
		enterTextWithoutScroll(ConfirmPassword, MenuConstants.MAX30ASCIIPASSWORD2);
	}

	@And("^user taps show button and verify the Ascii characters \"([^\"]*)\" in confirm password$")
	public void user_taps_show_button_and_verify_the_ascii_characters_something_in_confirm_password(String strArg1)
			throws Throwable {
		clickButtonWithOutScroll(ThirdShowButton);
		waitFor(2000);
		Assert.assertTrue(isTextMatch(ConfirmPasswordVisible.getText(), MenuConstants.MAX30ASCIIPASSWORD2));
	}

	@Then("^user taps on hide button and verify the \"([^\"]*)\" Ascii characters masked password in confirm password$")
	public void user_taps_on_hide_button_and_verify_the_something_ascii_characters_masked_password_in_confirm_password(
			String strArg1) throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			clickButtonWithOutScroll(ThirdShowButton);
			waitFor(2000);
			Assert.assertTrue(isTextMatch(ConfirmPassword.getText(), MenuConstants.MASKEDPASSWORD30ACCOUNTSCREEN));
		} else {
			clickButtonWithOutScroll(FirstShowButton);
			waitFor(2000);
			Assert.assertTrue(isElementDisplayed(CurrentPassword));
		}
	}

	@And("^user taps on show button and verify the Ascii characters from \"([^\"]*)\" in confirm password$")
	public void user_taps_on_show_button_and_verify_the_ascii_characters_from_something_in_confirm_password(
			String strArg1) throws Throwable {
		clickButtonWithOutScroll(ThirdShowButton);
		waitFor(2000);
		Assert.assertTrue(isTextMatch(ConfirmPasswordVisible.getText(), MenuConstants.MAX30ASCIIPASSWORD3));
	}

	@And("^user enters Confirm Password with max of \"([^\"]*)\" Ascii characters from \"([^\"]*)\"$")
	public void user_enters_confirm_password_with_max_of_something_ascii_characters_from_something(String strArg1,
																								   String strArg2) throws Throwable {
		enterTextWithoutScroll(ConfirmPassword, MenuConstants.MAX30ASCIIPASSWORD3);
	}

	@And("^user enters Confirm Password with Ascii characters from \"([^\"]*)\"$")
	public void user_enters_confirm_password_with_ascii_characters_from_something(String strArg1) throws Throwable {
		enterTextWithoutScroll(ConfirmPassword, MenuConstants.MAX30ASCIIPASSWORD4);
	}

	@And("^user taps on show button and verifies the Ascii characters from \"([^\"]*)\" in confirm password$")
	public void user_taps_on_show_button_and_verifies_the_ascii_characters_from_something_in_confirm_password(
			String strArg1) throws Throwable {
		clickButtonWithOutScroll(ThirdShowButton);
		waitFor(2000);
		Assert.assertTrue(isTextMatch(ConfirmPasswordVisible.getText(), MenuConstants.MAX30ASCIIPASSWORD4));
	}

	@Then("^user taps on hide button and verify the masked Ascii characters in confirm password$")
	public void userTapsOnHideButtonAndVerifyTheMaskedAsciiCharactersInConfirmPassword() {
		if (platformName.equalsIgnoreCase("iOS")) {
			clickButtonWithOutScroll(ThirdShowButton);
			waitFor(2000);
			Assert.assertTrue(
					isTextMatch(AccountPage.ConfirmPassword.getText(), MenuConstants.MASKEDPASSWORD5ACCOUNTSCREEN));
		} else {
			clickButtonWithOutScroll(FirstShowButton);
			waitFor(2000);
			Assert.assertTrue(isElementDisplayed(AccountPage.CurrentPassword));
		}
	}

	@And("^user verifies the New Password textbox in Edit Password$")
	public void userVerifiesTheNewPasswordTextboxInEditPassword() {
		Assert.assertTrue(isTextMatch(NewPassword1.getText(), MenuConstants.EDITPASSWORDNEWPASSWORD));
	}

	@And("^user Taps on show button and verify the new password typed is shown to the user$")
	public void userTapsOnShowButtonAndVerifyTheNewPasswordTypedIsShownToTheUser() {
		clickButtonWithOutScroll(SecondShowButton);
		waitFor(2000);
		Assert.assertTrue(isTextMatch(NewPasswordVisible.getText(), AccountConstants.NEWPASS));
	}

	@Then("^user taps on hide button and verify the masked password in new password$")
	public void userTapsOnHideButtonAndVerifyTheMaskedPasswordInNewPassword() {
		if (platformName.equalsIgnoreCase("iOS")) {
			clickButtonWithOutScroll(SecondShowButton);
			waitFor(2000);
			Assert.assertTrue(isTextMatch(NewPassword1.getText(), MenuConstants.MASKEDPASSWORD1ACCOUNTSCREEN));
		} else {
			clickButtonWithOutScroll(FirstShowButton);
			waitFor(2000);
			Assert.assertTrue(
					isTextMatch(AccountPage.CurrentPassword.getText(), MenuConstants.MASKEDPASSWORDACCOUNTSCREEN));
		}
	}

	@Then("^user verifies the updated password rules in Edit Password screen$")
	public void user_verifies_the_updated_password_rules_in_Edit_Password_screen() throws Throwable {
		Assert.assertTrue(isTextMatch(PassValidation1EditPassword.getText(), MenuConstants.EDITPASSWORDPASSWORDRULE1));
		Assert.assertTrue(isTextMatch(PassValidation2EditPassword.getText(), MenuConstants.EDITPASSWORDPASSWORDRULE2));
		Assert.assertTrue(isTextMatch(PassValidation3EditPassword.getText(), MenuConstants.EDITPASSWORDPASSWORDRULE3));
	}

	@And("^user enter the \"([^\"]*)\" in confirm password and verify the values$")
	public void userEnterTheInConfirmPasswordAndVerifyTheValues(String AsciiValueRange) throws Throwable {
//		enterTextWithoutScroll(ConfirmPassword, getTestDataValues(passwordclass_path, AsciiValueRange)[0]);
//		clickButtonWithOutScroll(ThirdShowButton);
//		waitFor(2000);
//		Assert.assertTrue(isTextMatch(ConfirmPasswordVisible.getText(), getTestDataValues(passwordclass_path, AsciiValueRange)[0]));
//		clickButtonWithOutScroll(ThirdShowButton);
//		waitFor(2000);
//		Assert.assertTrue(isTextMatch(ConfirmPassword.getText(), getTestDataValues(passwordclass_path, AsciiValueRange)[1]));
	}

	@And("^user navigates to Location services in the Account screen$")
	public void userNavigatesToLocationServicesInTheAccountScreen() {
		ScrollTo(MenuConstants.LocationServicesTitleAccount, MenuConstants.IOSSCROLLUP, NotificationsTitleAccount);
	}

	@Then("^user verifies the Location services section$")
	public void userVerifiesTheLocationServicesSection() {
		Assert.assertTrue(isTextMatch(LocationTitleAccount.getText(), MenuConstants.LocationServicesTitleAccount));
		Assert.assertTrue(isTextMatch(LocationGotoSettingsAccount.getText(), MenuConstants.GOTOSETTINGSACCOUNT));
	}

	@And("^user enter the \"([^\"]*)\" in new password and verify the values$")
	public void userEnterTheInNewPasswordAndVerifyTheValues(String AsciiValueRange) throws Throwable {
//		enterTextWithoutScroll(NewPassword1, getTestDataValues(passwordclass_path, AsciiValueRange)[0]);
//		clickButtonWithOutScroll(SecondShowButton);
//		waitFor(2000);
//		Assert.assertTrue(isTextMatch(NewPasswordVisible.getText(), getTestDataValues(passwordclass_path, AsciiValueRange)[0]));
//		clickButtonWithOutScroll(SecondShowButton);
//		waitFor(2000);
//		Assert.assertTrue(isTextMatch(NewPassword1.getText(), getTestDataValues(passwordclass_path, AsciiValueRange)[1]));
	}

	@Then("^user verifies the validation message in the Password section in Edit Password screen$")
	public void user_verifies_the_validation_message_in_the_Password_section_in_Edit_Password_screen()
			throws Throwable {
		waitFor(3000);
		Assert.assertTrue(isTextMatch(PasswordInlineErrorMessageEditPwd.getText(),
				ManualRegistrationConstants.PWDINLINEERRORMESSAGEMANUAL));
	}

	@Then("^user verifies the inline error message in password section Edit Password screen$")
	public void userVerifiesTheInlineErrorMessageInPasswordSectionEditPasswordScreen() {
		Assert.assertTrue(isTextMatch(NewPasswordInlineErrorAccount.getText(), AccountConstants.NEWERMSG));
	}

	@Then("^user verifies whether user lands in the Tell a friend screen$")
	public void userVerifiesWhetherUserLandsInTheTellAFriendScreen() {
		Assert.assertTrue(isElementDisplayed(ReferAfriend));
	}

	@And("^verify the tell a friend content$")
	public void verifyTheTellAFriendContent() {
		Assert.assertTrue(
				isTextMatch(TellAFriendMessageBodyField.getText(), MenuConstants.TELLAFRIENDCONTENTMESSSAGEWITHLINK));
	}

	@Then("^user verifies the Tell a friend screen$")
	public void userVerifiesTheTellAFriendScreen() {
		Assert.assertTrue(isTextMatch(TellAFriendSubtitle.getText(), MenuConstants.TELLAFRIENDSUBTITLE));
		Assert.assertTrue(isTextMatch(TellAFriendBody.getText(), MenuConstants.TELLAFRIENDSCREENBODY));
		Assert.assertTrue(isTextMatch(TellAFriendButtonSendButton.getText(), MenuConstants.TELLAFRIENDSENDBUTTON));
	}

	@Then("^user taps on Tell a friend button in Tell a friend screen$")
	public void userTapsOnTellAFriendButtonInTellAFriendScreen() {
		clickButtonWithOutScroll(TellAFriendButtonSendButton);
	}

	@Then("^user verifies the tell a friend content in the display$")
	public void userVerifiesTheTellAFriendContentInTheDisplay() {
		waitFor(3000);
		Assert.assertTrue(isTextMatch(TellAFriendMessageBodyFieldWithoutLink.getText(),
				MenuConstants.TELLAFRIENDCONTENTMESSSAGE));
	}

	@Then("^user taps message button in the Tell a friend option$")
	public void userTapsMessageButtonInTheTellAFriendOption() {
		waitFor(3000);
		clickButtonWithOutScroll(TellAFriendMessageButton);
	}

	@And("^user enters maximum characters including Ascii characters in Esso Feedback$")
	public void userEntersMaximumCharactersIncludingAsciiCharactersInEssoFeedback() {
		enterTextWithoutScroll(exxon_Help_feedback_textbox, MenuConstants.MAX140CHARACTERSESSOFEEDBACK);
	}

	@Then("^user verifies the character count entered in the Textbox feedback$")
	public void userVerifiesTheCharacterCountEnteredInTheTextboxFeedback() {
		Assert.assertTrue(isTextMatch(exxon_Help_feedback_Charcter_Max.getText(), MenuConstants.FD_FFD_Charcter_Max));
	}

	@Then("^user verify the Transaction History screen$")
	public void userVerifyTheTransactionHistoryScreen() {
		Assert.assertTrue(isTextMatch(TransactionHistoryTitle.getText(), MenuConstants.HISTORYCREEN));
		Assert.assertTrue(isElementDisplayed(selectButton));
		Assert.assertTrue(isTextMatch(day90s.getText(), MenuConstants.LASTNINTYDAYSHISTORY));
		Assert.assertTrue(isElementDisplayed(SiteIdHistory));
		Assert.assertTrue(isElementDisplayed(TransAmt));
		Assert.assertTrue(isElementDisplayed(DateAndTransaction));
		if (isElementDisplayedWithoutAssert(TransactionAndDate)) {
			Assert.assertTrue(isElementDisplayed(TransactionAndDate));
		}
	}

	@When("^user navigates to Account screen to verify the device settings$")
	public void userNavigatesToAccountScreenToVerifyTheDeviceSettings() throws Throwable {
		waitFor(7000);
		clickButtonWithOutScroll(AccountBtn);
		waitFor(3000);
		if (platformName.equalsIgnoreCase("iOS")) {
			ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP,
					AccountPage.AccountNectarCardSection);
			if (isElementDisplayedWithoutAssert(AccountPage.AccountNectarCardAdded)) {
				AccountSteps.nectarDeleteAndVerify();
			} else {
				clickButtonWithOutScroll(AccountPage.AccountAddNectarCardButton);
				clickButtonWithOutScroll(ScanBarCodeNectarOffers);
				if (isElementDisplayedWithoutAssert(OkButton)) {
					clickButtonWithOutScroll(OkButton);
					waitFor(2000);
					clickButtonWithOutScroll(CancelButtonCameraScreen);
					clickButtonWithOutScroll(LocationPermissionCancelPopup);
				}
				if (isElementDisplayedWithoutAssert(CancelButtonCameraScreen)) {
					clickButtonWithOutScroll(CancelButtonCameraScreen);
					clickButtonWithOutScroll(LocationPermissionCancelPopup);
				}
				if (isElementDisplayedWithoutAssert(LocSettingStation)) {
					clickButtonWithOutScroll(Cancelbutton);
				}
				waitFor(2000);
			}
		}
	}

	@And("^user navigates to Device settings to turn off the Location services$")
	public void user_navigates_to_Device_settings_to_turn_off_the_Location_services() {
		clickButtonWithOutScroll(LocationGotoSettingsAccount);
	}

	@And("^user taps on location button in Device level setting$")
	public void userTapsOnLocationButtonInDeviceLevelSetting() {
		waitFor(2000);
		clickButtonWithOutScroll(LocationButtonDeviceSettings);
	}

	@And("^user taps on Never button in Device level setting$")
	public void userTapsOnNeverButtonInDeviceLevelSetting() {
		waitFor(2000);
		clickButtonWithOutScroll(NeverButtonDeviceSettings);
	}

	@And("^user verify the Location services is disabled$")
	public void userVerifyTheLocationServicesIsDisabled() {
		waitFor(2000);
		clickButtonWithOutScroll(TabStation);
		waitFor(2000);
		Assert.assertTrue(isElementDisplayed(LocationPermissionCancelPopup));
	}

	@When("^user navigates to Fuel Finder screen and enable the location$")
	public void user_navigates_to_fuel_finder_screen_and_enable_the_location() throws Throwable {
		waitFor(14000);
		if (platformName.equalsIgnoreCase("Android")) {
			Assert.assertTrue(isTextMatch(FFbutton.getText().trim(), MenuConstants.FF_SCREEN));
			clickButtonWithOutScroll(FFbutton);
		} else {
			Assert.assertTrue(isTextMatch(FFbutton.getText().trim(), MenuConstants.FF_SCREEN));
			clickButtonWithOutScroll(FFbutton);
			waitFor(4000);
			if (isElementDisplayedWithoutAssert(FFheadertext)) {
				clickButtonWithOutScroll(AllowLocContinueButton);
				waitFor(4000);
			}
			if (isElementDisplayedWithoutAssert(AllowPopupHeader)) {
				clickButtonWithOutScroll(AllowWhilePopup);
				waitFor(4000);
			}
			if (isElementDisplayedWithoutAssert(LocationPermissionSuccessScreen)) {
				clickButtonWithOutScroll(LocationPermissionContinueButton);
				waitFor(4000);
			}
			if (isElementDisplayedWithoutAssert(LocationPermissionCancelPopup)) {
				clickButtonWithOutScroll(LocSettingStation);
				clickButtonWithOutScroll(LocationButtonDeviceSettings);
				clickButtonWithOutScroll(WhileusingButtonDeviceSettings);
				initiateNativeAPP();
				waitFor(4000);
			}
		}
	}

	@Then("^verify the camera access in Account screen$")
	public void verify_the_camera_access_in_Account_screen() {
		waitFor(4000);
		clickButtonWithOutScroll(AccountBtn);
		waitFor(3000);
		ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP,
				AccountPage.AccountNectarCardSection);
		clickButtonWithOutScroll(AccountPage.AccountAddNectarCardButton);
		clickButtonWithOutScroll(ScanBarCodeNectarOffers);
		Assert.assertTrue(isElementDisplayed(LocSettingStation));
	}

	@And("^enable back the notification services$")
	public void enableBackTheNotificationServices() {
		clickButtonWithOutScroll(AccountPage.NotificationSettin);
		clickButtonWithOutScroll(AccountPage.NotifAllow);
	}

	@And("^user validate the maximum fuelling amount section in Account screen$")
	public void userValidateTheMaximumFuellingAmountSectionInAccountScreen() {
		Assert.assertTrue(isElementDisplayed(AmountInMfaAccountScreen));
		Assert.assertTrue(isElementDisplayed(AccountPage.MaxFuelEditLk));
	}

	@And("^user tap Edit in the Maximum Fuelling Amount$")
	public void userTapEditInTheMaximumFuellingAmount() {
		clickButtonWithOutScroll(AccountPage.MaxFuelEditLk);
	}

	@And("^user validate the picker view of Maximum fuelling amount screen$")
	public void userValidateThePickerViewOfMaximumFuellingAmountScreen() {
		Assert.assertTrue(isElementDisplayed(AccountPage.MaxFuelOK));
		Assert.assertTrue(isElementDisplayed(MaximumFuellingTitlePicker));
	}

	@And("^user tap Done button in Picker view$")
	public void userTapDoneButtonInPickerView() {
		clickButtonWithOutScroll(AccountPage.MaxFuelOK);
		if (isElementDisplayedWithoutAssert(OkButton)) {
			staticTextValidation(MfaSetSuccessfullyPopupAccount, MenuConstants.MFASETSUCCESSFULLYPOPUPACCOUNT);
			clickButtonWithOutScroll(OkButton);
		}
	}

	@And("^user scroll the picker in Maximum fuelling Amount in Account screen$")
	public void userScrollThePickerInMaximumFuellingAmountInAccountScreen() {
		if (isElementDisplayedWithoutAssert(ScrollBar)) {
			System.out.println(ScrollBar);
		}
//		List<MobileElement> pickerList = ((IOSDriver) driver).findElementsByXPath("//XCUIElementTypePicker[@name=\"pickerView\"]/XCUIElementTypePickerWheel/XCUIElementTypeOther");
//		for (MobileElement mobileElement : pickerList) {
//			System.out.println(mobileElement.getText());
//		}
	}

	@When("^user taps on fuel icon and navigate to LID screen$")
	public void userTapsOnFuelIconAndNavigateToLIDScreen() {
		waitForElement(fuel,30);
		clickButtonWithOutScroll(fuel);
		waitFor(4000);
		if (isElementDisplayedWithoutAssert(AccountPage.CloseButtonModalPopupLid)) {
			clickButtonWithOutScroll(AccountPage.CloseButtonModalPopupLid);
		}
	}

	@And("^user verifies whether the system landed in LID$")
	public void userVerifiesWhetherTheSystemLandedInLID() {
		waitForElement(ContextualRegistrationPage.LID,10);
		Assert.assertTrue(isElementDisplayed(ContextualRegistrationPage.LID));
	}

	@And("^user taps on More button alone$")
	public void userTapsOnMoreButtonAlone() {
		waitForElement(AccountPage.AccountMore,10);
		clickButtonWithOutScroll(AccountPage.AccountMore);
	}
	
	@Then("^tap on loyalty point links in FAQ$")
	public void tap_on_loyalty_point_links_in_faq() throws Throwable {
		clickButtonWithOutScroll(LP);
	}

	@Then("^tap on Will I still earn Nectar Points if I use the app?$")
	public void tap_on_will_i_still_earn_nectar_points_if_i_use_the_app() throws Throwable {
		clickButtonWithOutScroll(LPN);
	}

	@And("^tap on FAQ hyperlink in nectar card description$")
	public void tap_on_faq_hyperlink_in_nectar_card_description() throws Throwable {
		clickButtonWithOutScroll(FAQLink);
	}

	@When("^user tries to login back from the Account screen$")
	public void userTriesToLoginBackFromTheAccountScreen() {
		waitFor(5000);
		if(isElementDisplayedWithoutAssert(loginpopop)) {
			staticTextValidation(loginpopop, MenuConstants.MESSAGE);
			clickButtonWithOutScroll(OkButton);
			waitForElement(BackBtn, 5);
			clickButtonWithOutScroll(BackBtn);
		} else {
			waitForElement(AccountPage.PasswordEdit, 10);
			ScrollTo(MenuConstants.LOGOUTTXT, MenuConstants.IOSSCROLLUP, LogOut);
			clickButtonWithOutScroll(LogOut);
		}
	}

	@When("^user verifies the location permission on tapping Station Finder$")
	public void userVerifiesTheLocationPermissionOnTappingStationFinder() {

		waitFor(4000);
		if (isElementDisplayedWithoutAssert(FFheadertext)) {
			clickButtonWithOutScroll(AllowLocContinueButton);
			waitFor(4000);
		}
		if (isElementDisplayedWithoutAssert(AllowPopupHeader)) {
			clickButtonWithOutScroll(AllowWhilePopup);
			waitFor(4000);
		}
		if (isElementDisplayedWithoutAssert(LocationPermissionSuccessScreen)) {
			clickButtonWithOutScroll(LocationPermissionContinueButton);
			waitFor(4000);
		}
		if (isElementDisplayedWithoutAssert(LocationPermissionCancelPopup)) {
			clickButtonWithOutScroll(LocationPermissionCancelPopup);
			waitFor(4000);
		}
	}
}