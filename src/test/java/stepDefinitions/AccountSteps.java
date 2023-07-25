package stepDefinitions;

import contants.AccountConstants;
import contants.COFChallangeFlowConstants;
import contants.MenuConstants;
import contants.StationFinderConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.GuestCheckOutPage;
import pages.MenuPage;
import pages.OffersPage;

public class AccountSteps extends AccountPage {
	OffersPage OffersPage = new OffersPage();
	GuestCheckOutPage GuestCheckOutPage = new GuestCheckOutPage();

	@Given("^user taps on SKIP button$")
	public void user_taps_on_SKIP_button() throws Throwable {
		clickButtonWithOutScroll(AccountSkip);
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(AccountOkBtn)) {
			clickButtonWithOutScroll(AccountOkBtn);
		}
		if (platformName.equalsIgnoreCase("iOS")) {
			clickButtonWithOutScroll(ContinueBtn);
			clickButtonWithOutScroll(AllowPopup);
			if (isElementDisplayedWithoutAssert(okBtn)) {
				clickButtonWithOutScroll(okBtn);
			}
		}
	}

	@And("^user is in login screen$")
	public void user_is_in_login_screen() throws Throwable {
		waitForElement(AccountLogin,5);
		clickButtonWithOutScroll(AccountLogin);
	}

	@When("^user enters login username and pwd$")
	public void user_enters_login_username_and_pwd() throws Throwable {
		enterTextWithoutScroll(AccountEmail, AccountConstants.ACCOUNTEMAIL);
		enterTextWithoutScroll(AccountPassword, AccountConstants.ACCOUNTPASSWORD);
	}

	@When("^I enter \"([^\"]*)\" in login details$")
	public void MIDirectUser1iEnterInLoginDetails(String userType) {
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(AccountEmail);
			waitFor(2000);
			if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
				clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
			}
			enterTextWithoutScroll(AccountEmail, getTestDataValues(loginclass_path, userType)[0]);
			enterTextWithoutScroll(AccountPassword, getTestDataValues(loginclass_path, userType)[1]);
		}
		else {
			waitForElement(AccountEmail,10);
			enterTextWithoutScroll(AccountEmail, getTestDataValues(loginclass_path, userType)[0]);
			enterTextWithoutScroll(AccountPassword, getTestDataValues(loginclass_path, userType)[1]);

		}
	}

	@When("^user taps login button in login screen$")
	public void user_taps_login_button_in_login_screen() throws Throwable {
		waitForElement(AccountLoginBtn,5);
		clickButtonWithOutScroll(AccountLoginBtn);
		waitFor(2000);
		if (isElementEnabled(LoginSave)) {
			clickButtonWithOutScroll(LoginSave);
		}
		if (isElementEnabled(Alertitle)) {
			if (AccountConstants.LOGINNTFCT.equalsIgnoreCase(Alertitle.getText())) {
				clickButtonWithOutScroll(okBtn);
			}
		}
		waitFor(16000);
		if (isElementEnabled(NotNowButtonLID)) {
			clickButtonWithOutScroll(NotNowButtonLID);
		}
		if (isElementEnabled(CloseButtonModalPopupLid)) {
			clickButtonWithOutScroll(CloseButtonModalPopupLid);
		}

	}

	@When("^user taps on More button in tab bar$")
	public void user_taps_on_More_button_in_tab_bar() throws Throwable {

		if (platformName.equalsIgnoreCase("Android")) {
			waitForElement(AccountMore,10);
			clickButtonWithOutScroll(AccountMore);
		} else {
			if (isElementDisplayedWithoutAssert(MenuPage.FFheadertext)) {
				clickButtonWithOutScroll(MenuPage.AllowLocContinueButton);
				if (isElementDisplayedWithoutAssert(MenuPage.AllowPopupHeader)) {
					clickButtonWithOutScroll(MenuPage.AllowOncePopup);
					if (isElementDisplayedWithoutAssert(MenuPage.LocationPermissionSuccessScreen)) {
						clickButtonWithOutScroll(MenuPage.LocationPermissionContinueButton);
					}
				}
			}
			waitFor(5000);
			clickButtonWithOutScroll(AccountMore);
		}
	}

	@Then("^verify the Products and Information header$")
	public void verify_the_about_first_fuel_header() throws Throwable {
		isElementDisplayed(FirstFuelheader);

	}

	@When("^user navigates to Products and Information screen$")
	public void user_navigates_to_about_firstfuel_screen() throws Throwable {
		waitForElement(ProductsAndInformation);
		clickButtonWithOutScroll(ProductsAndInformation);
	}

	@When("^user navigates to Account screen$")
	public void user_navigates_to_Account_screen() throws Throwable {
		waitForElement(AccountBtn,10);
		clickButtonWithOutScroll(AccountBtn);
	}

	@Then("^validate the please log into your account$")
	public void validate_the_please_log_into_your_account() throws Throwable {
		staticTextValidation(Accountct, AccountConstants.Accountctmsg);
	}

	@When("^user navigates to forgot your password$")
	public void user_navigates_to_forgot_your_password() throws Throwable {
		clickButtonWithOutScroll(Forgetpass);
	}

	@When("^user enters the reset email$")
	public void user_enters_the_reset_email() throws Throwable {
		enterTextWithoutScroll(Forgetmail, AccountConstants.ACCOUNTEMAIL);

	}

	@Then("^validate the reset email verify message$")
	public void validate_the_reset_email_verify_message() throws Throwable {

		staticTextValidation(Resetmsg, AccountConstants.Resetmsg);
	}

	@And("^user taps send button$")
	public void user_taps_send_button() throws Throwable {
		clickButtonWithOutScroll(send);
		waitFor(6000);
	}

	@Then("^user enters invalid Password in New Password field$")
	public void user_enters_invalid_Password_in_New_Password_field() throws Throwable {
		enterTextWithoutScroll(NewPassword, AccountConstants.INVALIDPASSWORD);
	}

	@Then("^verify validation text for Incorrect details as per validation rules of New Password field$")
	public void verify_validation_text_for_Incorrect_details_as_per_validation_rules_of_NewPassword_field()
			throws Throwable {
		staticTextValidation(NewPasswordError, AccountConstants.INVALIDPASSWORDVALIDATIONMSG);
	}

	@When("^Check System to display Copy Text of info icon And Check dismiss the prompt on tapping OK button from the prompt$")
	public void check_System_to_display_Copy_Text_of_info_icon_And_Check_dismiss_the_prompt_on_tapping_OK_button_from_the_prompt()
			throws Throwable {
		isElementDisplayed(AccountInfoIcon);
		staticTextValidation(AccountMessage, AccountConstants.ACCOUNTMSGTEXT);
		clickButtonWithOutScroll(AccountOkBtn);
	}

	@When("^user taps on Privacy Policy link$")
	public void user_taps_on_Privacy_Policy_link() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		clickButtonWithOutScroll(AccountPrivacyPolicy);
		waitFor(5000);
	}

	@Then("^verify user navigates to Privacy Policy screen$")
	public void verify_user_navigates_to_Privacy_Policy_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			Assert.assertTrue(isElementDisplayed(HeadTxt));
		} else {
			staticTextValidation(HeadTxt, AccountConstants.PRIVACYTXT);
		}
	}

	@Then("^user taps on Close button$")
	public void user_taps_on_Close_button() throws Throwable {
		clickButtonWithOutScroll(PrivacyCloseBtn);
	}

	@Then("^verify navigate back to account page$")
	public void verify_navigate_back_to_account_page() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			isElementDisplayed(HeadTxt);
		} else {
			staticTextValidation(HeadTxt, AccountConstants.ACCOUNTHEAD);
		}
	}

	@When("^user taps on Terms and Conditions link$")
	public void user_taps_on_Terms_and_Conditions_lnk() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
		clickButtonWithOutScroll(TermsACondition);
	}

	@Then("^verify user navigates to Terms and Conditions screen$")
	public void verify_user_navigates_to_Terms_and_Conditions_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			isElementDisplayed(HeadTxt);
		} else {
			staticTextValidation(HeadTxt, AccountConstants.TERMSTXT);
		}
	}

	@And("^user taps LogOut button in Account screen$")
	public void user_taps_logout_button_in_account_screen() throws Throwable {
		waitFor(7000);
		ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
		waitForElement(LogOut,5);
		clickButtonWithOutScroll(LogOut);
	}

	@Then("^user edit name by entering firstname and lastname$")
	public void user_edit_name_by_entering_firstname_and_lastname() throws Throwable {
		clickButtonWithOutScroll(UserEdit);
		enterTextWithoutScroll(EditFname, AccountConstants.REFNAME);
		enterTextWithoutScroll(EditLname, AccountConstants.RELNAME);
	}

	@Then("^revert firstname and lastname$")
	public void revert_firstname_and_lastname() throws Throwable {
		enterTextWithoutScroll(EditFname, AccountConstants.FNAME);
		enterTextWithoutScroll(EditLname, AccountConstants.LNAME);
	}

	@And("^tap on update button$")
	public void tap_on_update_button() throws Throwable {
		clickButtonWithOutScroll(EditUpdate);
		waitFor(5000);
	}

	@Then("^verify navigate back to account screen after tapping ok button$")
	public void verify_navigate_back_to_account_screen_after_tapping_ok_button() throws Throwable {
		clickButtonWithOutScroll(EditOK);
		waitFor(5000);
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountFullName, AccountConstants.EDITNAME);
		} else {
			staticTextValidation(AccountFullName, AccountConstants.EDITNAME);
		}
	}

	@Then("^reset data to original form$")
	public void reset_data_to_original_form() throws Throwable {
		clickButtonWithOutScroll(UserEdit);
		enterTextWithoutScroll(EditFname, AccountConstants.FNAME);
		enterTextWithoutScroll(EditLname, AccountConstants.LNAME);
		clickButtonWithOutScroll(EditUpdate);
		clickButtonWithOutScroll(EditOK);
	}

	@And("^user taps on cancel$")
	public void user_taps_on_cancel() throws Throwable {
		clickButtonWithOutScroll(PrivacyCloseBtn);
	}

	@Then("^verify navigate back to account screen after tapping cancel$")
	public void verify_navigate_back_to_account_screen_after_tapping_cancel() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			isElementDisplayed(AccountFullName);
		} else {
			staticTextValidation(AccountFullName, AccountConstants.NAME);
		}
	}

	@Then("^user taps on email info icon$")
	public void user_taps_on_email_info_icon() throws Throwable {
		clickButtonWithOutScroll(EmailInfoIcon);
	}

	@And("^Verify System to display Copy Text in info$")
	public void verify_system_to_display_copy_text_in_info() throws Throwable {
		isElementDisplayed(EmailInfo);
	}

	@Then("^user taps on GOT IT button$")
	public void user_taps_on_got_it_button() throws Throwable {
		clickButtonWithOutScroll(EmailInfoX);
	}

	@When("^user taps on edit usr pwd$")
	public void user_taps_on_edit_usr_pwd() throws Throwable {
		clickButtonWithOutScroll(PasswordEdit);
	}

	@Then("^user tap on Done button$")
	public void user_tap_on_done_button() throws Throwable {
		if (isElementDisplayedWithoutAssert(KayDone)) {
			clickButtonWithOutScroll(KayDone);
		}
		clickButtonWithOutScroll(PassWordDone);
		waitFor(5000);
	}

	@Then("^verify Inline error message for Current Password New Password$")
	public void verify_inline_error_message_for_current_password_new_password() throws Throwable {
		staticTextValidation(CurrentPassError, AccountConstants.CURRENTERMSG);
		staticTextValidation(NewPasswordError, AccountConstants.NEWERMSG);
	}

	@And("^user enters incorrect Current Password$")
	public void user_enters_incorrect_current_password() throws Throwable {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.CURRENTPASS);
	}

	@And("^user enters New Password$")
	public void user_enters_new_password() throws Throwable {
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASS);
	}

	@And("^user enters Confirm New Password$")
	public void user_enters_confirm_new_password() throws Throwable {
		if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
			clickButtonWithOutScroll(HideKeyPadMobileRegistration);
		}
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.CONFIRMPASS);
	}

	@Then("^Verify promt message for Incorrect Current Password$")
	public void verify_promt_message_for_incorrect_current_password() throws Throwable {
		isElementDisplayed(IncorrectPassErrorMessage);
	}

	@Then("^user enters Current password$")
	public void user_enters_current_password() throws Throwable {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.ACCOUNTPASSWORD);
	}

	@Then("^verify copy text message for password changed$")
	public void verify_copy_text_message_for_password_changed() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(LocCpyTXT, AccountConstants.PASSWRDCNGTXT);
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.PASSWRDCNGTXT);
		}
	}

	@Then("^user should see Star Rewards section below Maximum Fuelling$")
	public void user_should_see_star_rewards_section_below_maximum_fuelling() throws Throwable {
		isElementDisplayed(StarRewards);
	}

	@Then("^Tap on Maximum Fueling Amount edit button$")
	public void tap_on_maximum_fueling_amount_edit_button() throws Throwable {
		waitForElement(AccountPage.PasswordEdit, 20);
		if ("IOS".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.MaxiumumFuelling, AccountConstants.IOSSCROLLUP, MaxFuelAmtCk);
			clickButtonWithOutScroll(MaxFuelEditLk);
		} else {
			ScrollTo(AccountConstants.MaximumFuellingAmount, AccountConstants.IOSSCROLLUP, MaxFuelEditLk);
			clickButtonWithOutScroll(MaxFuelEditLk);
		}
	}

	@Then("^Select Maximum Fuelling Amount Amount$")
	public void select_maximum_fuelling_amount_amount() throws Throwable {
		clickButtonWithOutScroll(MaxFuelOK);
	}

	@And("^validate the updated Maximum Fueling Amount value$")
	public void validate_the_updated_maximum_fueling_amount_value() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(FuellingAmountAccount, AccountConstants.MAXFUELUPAMT);
		} else {
			staticTextValidation(MaxFuelAmtCk, AccountConstants.MAXFUELUPAMT);
		}
	}

	@Then("^Tap on cancel button and validate maximum fuel amount$")
	public void tap_on_cancel_button_and_validate_maximum_fuel_amount() throws Throwable {
		waitFor(5000);
		clickButtonWithOutScroll(MaxFuelCncl);
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(FuellingAmountAccount, AccountConstants.MAXFUELUPAMT);
		} else {
			staticTextValidation(MaxFuelAmtCk, AccountConstants.MAXFUELUPAMT);
		}
	}

	@Then("^scroll to location service toggle button$")
	public void scroll_to_location_service_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			ScrollTo(AccountConstants.LOCATIONSERVS, AccountConstants.IOSSCROLLUP, LocSrcSwitch);
		}
	}

	@And("^Turn On location service toggle button$")
	public void turn_on_location_service_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocSrcSwitch);
		}
	}

	@Then("^click on allow button in permission popup and validate toggle switch$")
	public void click_on_allow_button_in_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocAllow);
			staticTextValidation(LocSrcSwitch, AccountConstants.SWITCHON);
		}
	}

	@Then("^click on deny button in permission popup and validate toggle switch$")
	public void click_on_deny_button_in_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocDeny);
			staticTextValidation(LocSrcSwitch, AccountConstants.SWITCHOFF);
		}
	}

	@Then("^scroll to Camera Access toggle button$")
	public void scroll_to_camera_access_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			ScrollTo(AccountConstants.CAMSERVS, AccountConstants.CAMSERVS, MaxFuelInfo);
		}
	}

	@And("^Turn On Camera access toggle button$")
	public void turn_on_camera_access_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(CamSwitch);
		}
	}

	@Then("^click on deny button in camera permission popup and validate toggle switch$")
	public void click_on_deny_button_in_camera_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocDeny);
			staticTextValidation(CamSwitch, AccountConstants.SWITCHOFF);
		}
	}

	@Then("^click on allow button in camera permission popup and validate toggle switch$")
	public void click_on_allow_button_in_camera_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocAllow);
			staticTextValidation(CamSwitch, AccountConstants.SWITCHON);
		}
	}

	@And("^switch off location search toggle button$")
	public void switch_off_location_search_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocSrcSwitch);
		}
	}

	@And("^validate Copy text message for location pop up$")
	public void validate_copy_text_message_for_location_pop_up() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.LOCMSG);
		}
	}

	@Then("^tap on ok button and close location copy text$")
	public void tap_on_ok_button_and_close_location_copy_text() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitFor(2000);
			clickButtonWithOutScroll(okBtn);
		} else {
			clickButtonWithOutScroll(okBtn);
		}

	}

	@Then("^switch off Camera toggle button$")
	public void switch_off_camera_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(CamSwitch);
		}
	}

	@And("^validate Copy text message for Camera pop up$")
	public void validate_copy_text_message_for_camera_pop_up() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.LOCMSG);
		}
	}

//	@Then("^user should opt for receipts by email checkbox$")
//	public void user_should_opt_for_receipts_by_email_checkbox() throws Throwable {
//		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
//		if (platformName.equalsIgnoreCase("android")) {
//			if (ReceiptCKbx.getAttribute("checked").equalsIgnoreCase("true")) {
//				clickButtonWithOutScroll(ReceiptCKbx);
//				clickButtonWithOutScroll(okBtn);
//			}
//			clickButtonWithOutScroll(ReceiptCKbx);
//		} else {
//			if (isElementDisplayedWithoutAssert(ReceiptCKbx)) {
//				clickButtonWithOutScroll(ReceiptCKbx);
//				clickButtonWithOutScroll(okBtn);
//			}
//			clickButtonWithOutScroll(emailUnCircleCheck_box);
//		}
	// }

	@And("^user should validate the receipt checkbox copy text$")
	public void user_should_validate_the_receipt_checkbox_copy_text() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitFor(5000);
			isElementDisplayedWithoutAssert(mailOPTPopUP);
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.RECEIPTMSG);
		}
	}

	@Then("^user should opt out for receipts by email checkbox$")
	public void user_should_opt_out_for_receipts_by_email_checkbox() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, LogOut);
		if (platformName.equalsIgnoreCase("android")) {
			if (ReceiptCKbx.getAttribute("checked").equalsIgnoreCase("false")) {
				clickButtonWithOutScroll(ReceiptCKbx);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(ReceiptCKbx);
		} else {
			if (isElementDisplayedWithoutAssert(emailUnCircleCheck_box)) {
				clickButtonWithOutScroll(emailUnCircleCheck_box);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(ReceiptCKbx);
		}
	}

	@And("^user should validate the receipt checkbox copy text for not opting to receive emails$")
	public void user_should_validate_the_receipt_checkbox_copy_text_for_not_opting_to_receive_emails()
			throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitForElement(mailOPTOUTPopUP);
			staticTextValidation(mailOPTOUTPopUP, AccountConstants.RECEIPTMSGNO);
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.RECEIPTMSGNO);
		}
	}

	@Then("^user should opt for Offers by email checkbox$")
	public void user_should_opt_for_offers_by_email_checkbox() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, OfferCheck);
		if (platformName.equalsIgnoreCase("android")) {
			if (OfferCheck.getAttribute("checked").equalsIgnoreCase("true")) {
				clickButtonWithOutScroll(OfferCheck);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(OfferCheck);
		} else {
			if (isElementDisplayedWithoutAssert(promotionsCircleCheck_box)) {
				clickButtonWithOutScroll(promotionsCircleCheck_box);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(promotionsUnCircleCheck_box);
		}
	}

	@And("^user should validate the offer checkbox copy text for opting to receive emails$")
	public void user_should_validate_the_offer_checkbox_copy_text_for_opting_to_receive_emails() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(Promotion_OPT_IN_POpup, AccountConstants.OFFERMSG);
			isElementDisplayed(Promotion_OPT_IN_POpup);
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.OFFERMSG);
		}
	}

	@Then("^user should opt out for Offers by email checkbox$")
	public void user_should_opt_out_for_offers_by_email_checkbox() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, OfferCheck);
		if (platformName.equalsIgnoreCase("android")) {
			if (OfferCheck.getAttribute("checked").equalsIgnoreCase("false")) {
				clickButtonWithOutScroll(OfferCheck);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(OfferCheck);
		} else {
			if (isElementDisplayedWithoutAssert(promotionsUnCircleCheck_box)) {
				clickButtonWithOutScroll(promotionsUnCircleCheck_box);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(promotionsCircleCheck_box);
		}
	}

	@And("^user should validate the offer checkbox copy text for not opting to receive emails$")
	public void user_should_validate_the_offer_checkbox_copy_text_for_not_opting_to_receive_emails() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(Promotion_OPT_OUT_POpup, AccountConstants.NOOFFERMSG);
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.NOOFFERMSG);
		}
	}

	@Then("^Tap on Maximum Fueling info icon$")
	public void tap_on_maximum_fueling_info_icon() throws Throwable {
		ScrollTo(AccountConstants.MaxiumumFuelling, AccountConstants.IOSSCROLLUP, MaxFuelInfo);
		clickButtonWithOutScroll(MaxFuelInfo);
	}

	@And("^validate the Maximum Fueling copytext$")
	public void validate_the_maximum_fueling_copytext() throws Throwable {
		isElementDisplayed(MaxFuelInfoTxt);
	}

	@Then("^validate Maximum fueling amount$")
	public void validate_maximum_fueling_amount() throws Throwable {
		isElementDisplayed(MaxFuelAmtCk);
	}

	@And("^user enters New Password to check tick mark for acieving password criteria$")
	public void user_enters_new_password_to_check_tick_mark_for_acieving_password_criteria() throws Throwable {
		enterTextWithoutScroll(NewPassword, AccountConstants.ACCOUNTPASSWORD);
		isElementDisplayed(PassValidationTick1);
		isElementDisplayed(PassValidationTick2);
		isElementDisplayed(PassValidationTick3);
	}

	@And("^user enters New Password and check password criteria being displayed$")
	public void user_enters_new_password_and_check_password_criteria_being_displayed() throws Throwable {
		enterTextWithoutScroll(NewPassword, AccountConstants.ACCOUNTPASSWORD);
		isElementDisplayed(PassValidation1);
		isElementDisplayed(PassValidation2);
		isElementDisplayed(PassValidation3);
	}

	@Then("^user able to view components heading, BackButton, USER profile, Email address$")
	public void user_able_to_view_components_heading_backbutton_user_profile_email_address() throws Throwable {
		isElementDisplayed(HeadTxt);
		isElementDisplayed(BackBtn);
		isElementDisplayed(AcctEmail);
		isElementDisplayed(AcctLayOut);
	}

	@And("^Camera Access, Receipt Preferences, Marketing Email Preferences, Terms & Condition, Privacy Policy, LOG OUT$")
	public void camera_access_receipt_preferences_marketing_email_preferences_terms_condition_privacy_policy_log_out()
			throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			isElementDisplayed(AcctCam);
		}
		isElementDisplayed(AcctRecipt);
		isElementDisplayed(AcctRctMsg);
		isElementDisplayed(TermsACondition);
		isElementDisplayed(AccountPrivacyPolicy);
		isElementDisplayed(LogOut);
	}

	@Then("^tap on ok button and close receipt checkbox copy text$")
	public void tapOnOkButtonAndCloseReceiptCheckboxCopyText() {
		clickButtonWithOutScroll(okBtn);
	}

	@When("^user verify the location services status is on$")
	public void userVerifyTheLocationServicesStatusIsOn() {
		try {
			LocationServicesAcc.isDisplayed();
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

	@And("^user taps on Go To Settings link under notifications section$")
	public void userTapsOnGoToSettingsLinkUnderNotificationsSection() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, NotificationScroll);
			clickButtonWithOutScroll(NotifGoToSettings);
		} else {
			ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.TermsACondition);
			clickButtonWithOutScroll(NotifGoToSettings);
		}

	}

	@Then("^verify the user is navigated to device permission screen$")
	public void verifyTheUserIsNavigatedToDevicePermissionScreen() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			if (isElementDisplayedWithoutAssert(AppInfo)) {
				isElementDisplayed(AppInfo);
			} else if (isElementDisplayedWithoutAssert(AccountMessage)) {
				staticTextValidation(LocCpyTXT, AccountConstants.LOCMSG);
				clickButtonWithOutScroll(okBtn);
			}
		} else {
			Assert.assertTrue(PermissionScrn.isEnabled());
		}
	}

	@And("^Disable the notification access$")
	public void disableTheNotificationAccess() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(NotificationSettin);
			clickButtonWithOutScroll(NotifAllow);
			androidBack();
			androidBack();
			ScrollTo(AccountConstants.NOTIFICATIONS, AccountConstants.IOSSCROLLDOWN, NotificationSettin);

		} else {
			clickButtonWithOutScroll(NotificationSettin);
			clickButtonWithOutScroll(NotifAllow);
		}
	}

	@And("^navigate to the account screen$")
	public void navigateToTheAccountScreenAndVerifyTheStatusOfLocationServices() {
		clickButtonWithOutScroll(AccountMore);
		if (AccountBtn.isDisplayed()) {
			clickButtonWithOutScroll(AccountBtn);
		}
	}

	@Then("^verify the status of Location Services$")
	public void verifyTheStatusOfLocationServices() {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, NotificationScroll);
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(LocationOFF, AccountConstants.SWITCHOFF);
		} else {
			clickButtonWithOutScroll(StationFinder);
			waitForElement(ContinueBtn);
			clickButtonWithOutScroll(ContinueBtn);
			if (isElementDisplayedWithoutAssert(DontAllow))
				clickButtonWithOutScroll(DontAllow);
			waitForElement(DisabledCancel);
			while (isElementDisplayedWithoutAssert(DisabledCancel))
				clickButtonWithOutScroll(DisabledCancel);
			clickButtonWithOutScroll(AccountMore);
			if (AccountBtn.isDisplayed()) {
				clickButtonWithOutScroll(AccountBtn);
			}
			Assert.assertTrue(LocationOFF.isEnabled());
		}
	}

	@When("^location services is switched off$")
	public void location_services_is_switched_off() throws Throwable {
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, NotificationScroll);
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			if (AccountConstants.SWITCHOFF.equalsIgnoreCase(LocationOFF.getText())) {
				clickButtonWithOutScroll(LocGoToSettings);
				clickButtonWithOutScroll(AllowPopup);
			}
		}
	}

	@And("^navigate to start fuel screen to allow Camera access$")
	public void navigateToStartFuelScreenToAllowCameraAccess() {
		if ("IOS".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(FuelScr);
			waitForElement(Start);
			clickButtonWithOutScroll(Start);
			waitForElement(ScanQRCode);
			clickButtonWithOutScroll(ScanQRCode);
			clickButtonWithOutScroll(AccountOkBtn);
			waitForElement(CancelBtn);
			clickButtonWithOutScroll(CancelBtn);
			waitForElement(NavBck);
			clickButtonWithOutScroll(NavBck);
			navigateToTheAccountScreenAndVerifyTheStatusOfLocationServices();
		}
	}

	@Then("^Verify the status of the Camera Access$")
	public void verifyTheStatusOfTheCameraAccess() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, NotificationScroll);
			if (AccountConstants.SWITCHOFF.equalsIgnoreCase(CameraON.getText())) {
				clickButtonWithOutScroll(CameraON);
				clickButtonWithOutScroll(AllowPopup);
			}
		}
	}

	@And("^tap on the Go To Settings under camera access$")
	public void tapOnTheGoToSettingsUnderCameraAccess() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(CameraON);
		} else {
			ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.TermsACondition);
			clickButtonWithOutScroll(CameraGotoSettings);
		}
	}

	@Then("^disable the camera access for the user$")
	public void disableTheCameraAccessForTheUser() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountMessage, AccountConstants.SETTINGMSG);
			clickButtonWithOutScroll(okBtn);
			waitFor(2000);
			clickButtonWithOutScroll(Mobilesetting);
			clickButtonWithOutScroll(Apps);
			clickButtonWithOutScroll(EssoQA);
			clickButtonWithOutScroll(Permissions);
			clickButtonWithOutScroll(Cameraon);
		} else {
			clickButtonWithOutScroll(CameraAccess);
		}
	}

	@And("^verify the user profile link in the Account screen$")
	public void verifyTheUserProfileLinkInTheAccountScreen() {
		clickButtonWithOutScroll(UserProfileLink);
	}

	@Then("^verify the email field is non editable$")
	public void verifyTheEmailFieldIsNonEditable() {
		isElementDisplayed(EmailField);
	}

	@And("^verify the Copy Text in the userinfo link$")
	public void verifyTheCopyTextInTheUserinfoLink() {
		staticTextValidation(EmailCT, AccountConstants.EmailCT);
		clickButtonWithOutScroll(EmailInfoX);
	}

	@And("^Verify the change password screen$")
	public void verifyTheChangePasswordScreen() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(HeadTxt, AccountConstants.EDITPASS);
		} else {
			isElementDisplayed(EdtPasswordScr);
		}
	}

	@And("^user Taps on show button and verify the password typed is shown to the user$")
	public void userTapsOnShowButtonAndVerifyThePasswordTypedIsShownToTheUser() {
		clickButtonWithOutScroll(currentPwdShw);
		staticTextValidation(Currpassshwfield, AccountConstants.ACCOUNTPASSWORD);
		// staticTextValidation(currentPwdShw, SignInConstants.HIDE);
	}

	@Then("^Tap the Back button and verify the user navigated to the Account screen$")
	public void tapTheBackButtonAndVerifyTheUserNavigatedToTheAccountScreen() {
		clickButtonWithOutScroll(CancelBtn);
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(HeadTxt, AccountConstants.ACCOUNTHEAD);
		} else {
			isElementDisplayed(AccountScrn);
		}
	}

	@And("^user verify the tick marks are not visible$")
	public void userVerifyTheTickMarksAreNotVisible() {
		if (isElementDisplayedWithoutAssert(Tick1)) {
			Assert.fail();
		}
		if (isElementDisplayedWithoutAssert(Tick2)) {
			Assert.fail();
		}
		if (isElementDisplayedWithoutAssert(Tick3)) {
			Assert.fail();
		}
	}

	@Then("^user verify the tick marks are visible$")
	public void userVerifyTheTickMarksAreVisible() {
		Assert.assertTrue(Tick1.isEnabled());
		Assert.assertTrue(Tick2.isEnabled());
		Assert.assertTrue(Tick3.isEnabled());
	}

	@And("^user taps on new Password Field$")
	public void userTapsOnNewPasswordField() {
		clickButtonWithOutScroll(NewPassword);
	}

	@And("^user enters different Confirm New Password$")
	public void userEntersDifferentConfirmNewPassword() {
		if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
			clickButtonWithOutScroll(HideKeyPadMobileRegistration);
		}
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.DIFFCONFIRMPASS);
	}

	@Then("^user verify the error message for password mismatch$")
	public void userVerifyTheErrorMessageForPasswordMismatch() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(DiffPwdCT, AccountConstants.CONFIRMPASSER);
		} else {
			staticTextValidation(DiffPwdCT, AccountConstants.CONFIRMPASSER);
		}
	}

	@Then("^user enters invalid Current password$")
	public void userEntersInvalidCurrentPassword() {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.INVALIDPASSWORD);
	}

	@Then("^verify copy text error message for invalid current password$")
	public void verifyCopyTextErrorMessageForInvalidCurrentPassword() {
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(CurrPassInvldMsg))
			isElementDisplayed(CurrPassInvldMsg);
		else
			isElementDisplayed(CurrPassInvldMsg2);
	}

	@And("^user enter the new and confirm password$")
	public void userEnterTheNewAndConfirmPassword() {
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASS);
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.CONFIRMPASS);
	}

	@Then("^verify the error message for submitting the form with curernt password empty$")
	public void verifyTheErrorMessageForSubmittingTheFormWithCurerntPasswordEmpty() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(CurrPassEmptyMsg, AccountConstants.CURRENTERMSG);
		} else {
			isElementDisplayed(CurrPassEmptyMsg);
		}
	}

	@And("^user enter the Current and confirm password$")
	public void userEnterTheCurrentAndConfirmPassword() {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.CURRENTPASS);
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.CONFIRMPASS);
	}

	@Then("^verify the error message for submitting the form with new password empty$")
	public void verifyTheErrorMessageForSubmittingTheFormWithNewPasswordEmpty() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(NewPassEmptyMsg, AccountConstants.NEWERMSG);
		} else {
			isElementDisplayed(NewPassEmptyMsg);
		}
	}

	@And("^user enter the current and new password$")
	public void userEnterTheCurrentAndNewPassword() {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.CURRENTPASS);
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASS);
	}

	@Then("^verify the error message for submitting the form with confirm password empty$")
	public void verifyTheErrorMessageForSubmittingTheFormWithConfirmPasswordEmpty() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(ConfrmPassEmptyMsg, AccountConstants.CONFIRMERMSG);
		} else {
			isElementDisplayed(ConfrmPassEmptyMsg);
		}
	}

	@Then("^user verify the error message displayed for new and confirm password empty field$")
	public void userVerifyTheErrorMessageDisplayedForNewAndConfirmPasswordEmptyField() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountMessage, AccountConstants.CONFIRMERMSG);
		} else {
			isElementDisplayed(NewPassEmptyMsg);
		}
	}

	@Then("^user verify the error message displayed for current and new password empty field$")
	public void userVerifyTheErrorMessageDisplayedForCurrentAndNewPasswordEmptyField() {
		waitForElement(NewPassEmptyMsg);
		isElementDisplayed(CurrPassEmptyMsg);
		isElementDisplayed(NewPassEmptyMsg);
	}

	@Then("^verify the Updated message is displayed$")
	public void verifyTheUpdatedMessageIsDisplayed() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountMessage, AccountConstants.NAMEDIT);
		} else {
			staticTextValidation(NameEditSuccessMsg, AccountConstants.NAMEDIT);
		}
	}

	@And("^Tap on user edit$")
	public void tapOnUserEdit() {
		waitForElement(UserEdit);
		clickButtonWithOutScroll(UserEdit);
	}

	@Then("^Verify the Full name is prepopulated in the Name edit screen$")
	public void verifyTheFullNameIsPrepopulatedInTheNameEditScreen() {
		waitForElement(EditFname);
		Assert.assertTrue(!EditFname.getText().isEmpty());
		Assert.assertTrue(!EditLname.getText().isEmpty());
	}

	@And("^Clear the last name field and enter value with (\\d+) characters$")
	public void clearTheLastNameFieldAndEnterValueWithCharacters(int arg0) {
		waitForElement(EditLname);
		enterTextWithoutScroll(EditLname, AccountConstants.Char100Lname);
		clickButtonWithOutScroll(EditUpdate);
		clickButtonWithOutScroll(okBtn);
	}

	@Then("^Verify the Field has (\\d+) Charaters$")
	public void verifyTheFieldHasCharaters(int arg0) {
		clickButtonWithOutScroll(UserEdit);
		Assert.assertTrue(EditLname.getText().length() == 100);
	}

	@And("^Get the First name and last name and verify the first letter is capitalized$")
	public void getTheFirstNameAndLastNameAndVerifyTheFirstLetterIsCapitalized() {
		char Fname = EditFname.getText().charAt(0);
		char Lname = EditLname.getText().charAt(0);
		Assert.assertTrue(Character.isUpperCase(Fname));
		Assert.assertTrue(Character.isUpperCase(Lname));
	}

	@And("^enter the New Fist/Last Name with special characters$")
	public void enterTheNewFistLastNameWithSpecialCharacters() {
		enterTextWithoutScroll(EditFname, AccountConstants.FNAMESPL);
		enterTextWithoutScroll(EditLname, AccountConstants.LNAMESPL);

	}

	@Then("^verify the First/Last Name with special characters$")
	public void verifyTheFirstLastNameWithSpecialCharacters() {
		waitForElement(UserEdit);
		String NameCheck = AccountConstants.FNAMESPL + " " + AccountConstants.LNAMESPL;
		staticTextValidation(FullName, NameCheck);
	}

	@And("^user edit name by entering Test firstname and lastname$")
	public void userEditNameByEnteringTestFirstnameAndLastname() {
		clickButtonWithOutScroll(UserEdit);
		// clearTextFields(EditFname);
		enterTextWithoutScroll(EditFname, AccountConstants.TFNAME);
		// clearTextFields(EditLname);
		enterTextWithoutScroll(EditLname, AccountConstants.TLNAME);
	}

	@And("^Tap the cancel button$")
	public void tapTheCancelButton() {
		clickButtonWithOutScroll(PwdCancelBtn);
	}

	@Then("^verify the first and last name is not updated$")
	public void verifyTheFirstAndLastNameIsNotUpdated() {
		isElementDisplayed(FullName);
		Assert.assertTrue(!FullName.getText().contains(AccountConstants.TFNAME));

	}

	@And("^user taps on Go To Settings link under Location Services$")
	public void userTapsOnGoToSettingsLinkUnderLocationServices() {
		ScrollTo(AccountConstants.LOCATIONSERVS, AccountConstants.IOSSCROLLUP, LocationServicesAcc);
		clickButtonWithOutScroll(LocGoToSettings);

	}

	@Then("^Verify user allows the Location service enabled$")
	public void verifyUserAllowsTheLocationServiceEnabled() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(LocSrcSwitch, AccountConstants.SWITCHON);
		} else {
			waitForElement(LocSettings);
			clickButtonWithOutScroll(LocSettings);
			waitForElement(LocSettingsAlways);
			clickButtonWithOutScroll(LocSettingsAlways);
			clickButtonWithOutScroll(SettingsBack);
			Assert.assertTrue(isElementEnabled(LocSettingsAlwaysEnabled));
		}
	}

	@And("^give wrong current password everytime till the error message is verified$")
	public void giveWrongCurrentPasswordEverytimeTillTheErrorMessageIsVerified() throws Throwable {
		try {
			for (int i = 0; i < 4; i++) {
				user_enters_incorrect_current_password();
				user_enters_new_password();
				user_enters_confirm_new_password();
				user_tap_on_done_button();
				if (isElementDisplayedWithoutAssert(CurrPassInvldMsg2))
					break;
				clickButtonWithOutScroll(okBtn);
			}
			isElementDisplayed(CurrPassInvldMsg2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^Tap the info icon in maximum fueling amount$")
	public void tapTheInfoIconInMaximumFuelingAmount() {
		ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
		waitFor(4000);
		clickButtonWithOutScroll(FuelingInfo);
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountMessage, AccountConstants.PREAUTHINFO);
		} else {
			staticTextValidation(FuelingInfoTxt, AccountConstants.PREAUTHINFO);
		}
	}

	public void nectarAddAndVerify() throws Throwable {
		waitFor(3000);
		clickButtonWithOutScroll(AccountAddNectarCardButton);
		enterTextWithoutScroll(NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
		hideMobileKeyboard();
		clickButtonWithOutScroll(NextButtonNectarCardAddScreen);
		waitFor(2000);
		clickButtonWithOutScroll(AccountNectarCardVerifyLaterPopup);
		clickButtonWithOutScroll(AccountNectarVerifyLaterSkip);
		//ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
		waitFor(2000);
		ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
		Assert.assertTrue(
				isTextMatch(AccountNectarCardAdded.getText(), AccountConstants.ACCOUNTSCREENDELETENECTARCARDBUTTONCT));
		//Assert.assertTrue(isElementDisplayedWithoutScroll(AccountNectarCardWithStars));
	}

	public void nectarDeleteAndVerify() throws Throwable {
		waitForElement(TermsACondition,600);
		ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.TermsACondition);
		waitForElement(AccountNectarCardAdded,600);
		clickButtonWithOutScroll(AccountNectarCardAdded);
		waitForElement(AccountDeleteNectarPopup,600);
		clickButtonWithOutScroll(AccountDeleteNectarPopup);
		waitFor(4000);
		waitForElement(NectarDeleteSuccessfulPopup,600);
		clickButtonWithOutScroll(NectarDeleteSuccessfulPopup);
		waitForElement(AccountAddNectarCardButton,600);
		Assert.assertTrue(
				isTextMatch(AccountAddNectarCardButton.getText(), AccountConstants.ACCOUNTSCREENADDNECTARCARDBUTTONCT));

//		Assert.assertTrue(
//				isTextMatch(AccountAddNectarCardSectionCT.getText(), AccountConstants.ACCOUNTNECTARSECTIONCT));
//
	}

	@Then("^user verifies the Nectar card section$")
	public void user_verifies_the_nectar_card_section() throws Throwable {
		waitForElement(AccountPage.PasswordEdit, 20);
		ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
		if (isElementDisplayedWithoutAssert(AccountNectarCardAdded)) {
			nectarDeleteAndVerify();
			nectarAddAndVerify();
		} else {
			nectarAddAndVerify();
			nectarDeleteAndVerify();
		}
	}
	@When("^user enters \"([^\"]*)\" in login details$")
	public void userEntersInLoginDetails(String arg0) throws Throwable {

		waitFor(2000);
//		enterTextWithoutScroll(AccountEmail, PayOutsideConstants.LoggedEmail);
//		enterTextWithoutScroll(AccountPassword,PayOutsideConstants.LoggedPassword);
		enterTextWithoutScroll(AccountEmail, StationFinderConstants.USERNM);
		enterTextWithoutScroll(AccountPassword , StationFinderConstants.PASS);
	}

    @Then("^user verifies paypal email id with masked$")
    public void userVerifiesPaypalEmailIdWithMasked() {
		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(GuestCheckOutPage.HeaderText, "Account");
			staticTextValidation(PaypalEmail.getText().substring(1, 6), AccountConstants.PaypalEmailMasked);

		} else {
			waitFor(4000);
			waitForElement(getTextElement("Account"), 5);
//		ScrollTo("Payment Method",AccountConstants.IOSSCROLLDOWN,getTextElement("Payment Method"));
			waitFor(1500);
			Assert.assertTrue(isElementDisplayed(getTextContainsElement("****@")));
		}

	}
//	@And("^user adds nectar card in the Add Nectar card screen$")
//	public void user_adds_nectar_card_in_the_add_nectar_card_screen() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user taps on Verify Later in the card added successfully popup$")
//	public void user_taps_on_verify_later_in_the_card_added_successfully_popup() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user taps on Skip in the Add Nectar card screen$")
//	public void user_taps_on_skip_in_the_add_nectar_card_screen() throws Throwable {
//		throw new PendingException();
//	}
//	@Then("^user lands in the Account screen$")
//	public void user_lands_in_the_account_screen() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user verifies the Nectar card section after when there is a card$")
//	public void user_verifies_the_nectar_card_section_after_when_there_is_a_card() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user deletes the Nectar card$")
//	public void user_deletes_the_nectar_card() throws Throwable {
//		throw new PendingException();
//	}
//	@Then("^user navigates from the popup to Account screen$")
//	public void user_navigates_from_the_popup_to_account_screen() throws Throwable {
//		throw new PendingException();
//	}


}
