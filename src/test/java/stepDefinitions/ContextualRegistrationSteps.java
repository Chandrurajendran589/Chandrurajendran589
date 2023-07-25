package stepDefinitions;

import contants.AccountConstants;
import contants.ContextualRegistrationConstants;
import contants.FrictionlessFlowConstants;
import contants.StationFinderConstants;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

public class ContextualRegistrationSteps extends ContextualRegistrationPage {
	AccountPage AccountPage = new AccountPage();
	AccountSteps AccountSteps = new AccountSteps();
	FrictionlessFlowPage frictionlessFlowPage= new FrictionlessFlowPage();
	OffersPage OffersPage = new OffersPage();

	public void logOutMethod() throws Throwable {
		clickButtonWithOutScroll(AccountPage.AccountMore);
		waitForElement(AccountPage.AccountBtn, 20);
		clickButtonWithOutScroll(AccountPage.AccountBtn);
		waitForElement(AccountPage.PasswordEdit, 20);
		try {
			ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.LogOut);
		}catch(Exception e){
			ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.LogOut);
		}
		clickButtonWithOutScroll(AccountPage.LogOut);
	}

	@Given("^user is on NLID screen$")
	public void user_is_on_nlid_screen() throws Throwable {
		waitFor(20000);
		if (isElementDisplayedWithoutAssert(MenuPage.AcceptAll)) {
			clickButtonWithOutScroll(MenuPage.AcceptAll);
		}
		if (isElementDisplayedWithoutAssert(AccountPage.AccountSkip)) {
			AccountSteps.user_taps_on_SKIP_button();
		} else if (isElementDisplayedWithoutAssert(ReviewAccept)) {
			clickButtonWithOutScroll(ReviewAccept);
			logOutMethod();
		} else if (isElementDisplayedWithoutAssert(LID)) {
			logOutMethod();
		} else if (isElementDisplayedWithoutAssert(DashRegstr)) {
			isElementDisplayed(DashRegstr);
		} else if (isElementDisplayedWithoutAssert(PrfcmpltLID)) {
			logOutMethod();
		} else if (isElementDisplayedWithoutAssert(LIDNectar)) {
			logOutMethod();
		} else if (isElementDisplayedWithoutAssert(VerifyEmail)) {
			clickButtonWithOutScroll(VerifyEmail);
		}else if(isElementDisplayedWithoutAssert(acceptAllButtonAppLaunch)){
			waitForElement(acceptAllButtonAppLaunch,20);
			clickButtonWithOutScroll(acceptAllButtonAppLaunch);
			AccountSteps.user_taps_on_SKIP_button();
		}
		else if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
			clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
		}
		waitFor(3000);
	}

	@When("^user taps on register button from Login screen$")
	public void user_taps_on_register_button_from_login_screen() throws Throwable {
		waitForElement(DashRegstr,10);
		clickButtonWithOutScroll(DashRegstr);
	}

	@Then("^user should be navigated to Manual Register screen$")
	public void user_should_be_navigated_to_manual_register_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(AccountPage.FirstFuelheader, ContextualRegistrationConstants.REGISTERHEADER);
			staticTextValidation(RegstrTtl, ContextualRegistrationConstants.REGISTERTTL);
		} else {
			waitForElement(AccountPage.register_title,3);
			staticTextValidation(AccountPage.register_title,ContextualRegistrationConstants.REGISTERHEADER);
			staticTextValidation(RegstrTtl, ContextualRegistrationConstants.REGISTERTTL);
		}
	}

	@Then("^enter First Name$")
	public void enter_first_name() throws Throwable {
		enterTextWithoutClick(RegstrFirstName, ContextualRegistrationConstants.REGISTERFNAME);
	}

	@Then("^enter Last Name$")
	public void enter_last_name() throws Throwable {
		waitForElement(RegstrLastName,4);
		waitElementToBeClickable(RegstrLastName);
		enterTextWithoutClick(RegstrLastName, ContextualRegistrationConstants.REGISTERLNAME);
	}

	@Then("^enter \"([^\"]*)\" Email address$")
	public void enter_something_email_address(String arg1) throws Throwable {
		enterTextWithoutClick(RegstrEmail, arg1 + getSaltNumber()
				+ ContextualRegistrationConstants.REGISTEREMAILDOM);
	}

	@When("^user enter \"([^\"]*)\" in login details$")
	public void userEnterInLoginDetails(String arg0) throws Throwable {
		enterTextWithoutClick(RegstrEmail, arg0 + getSaltNumber()
				+ ContextualRegistrationConstants.REGISTEREMAILDOM);
		enterTextWithoutClick(RegstrPass, ContextualRegistrationConstants.REGISTERPASS);

	}
	@Then("^enter password$")
	public void enter_password() throws Throwable {
		waitForElement(RegstrPass,6);
		enterTextWithoutClick(RegstrPass, ContextualRegistrationConstants.REGISTERPASS);
	}

	@Then("^confirm password$")
	public void confirm_password() throws Throwable {
		hideMobileKeyboard();
		enterTextWithoutClick(RegstrConfPass, ContextualRegistrationConstants.REGISTERCONFPASS);
//		hideMobileKeyboard();
	}
	
	@Then("^enter First Name ASCII key$")
    public void enter_first_name_ascii_key() throws Throwable {
    	enterTextWithoutClick(RegstrFirstName, ContextualRegistrationConstants.ASCIIkEY);
    }

    @Then("^enter Last Name ASCII key$")
    public void enter_last_name_ascii_key() throws Throwable {
    	enterTextWithoutClick(RegstrLastName, ContextualRegistrationConstants.ASCIIkEY);
    }

    @Then("^enter password ASCII key$")
    public void enter_password_ascii_key() throws Throwable {
    	enterTextWithoutClick(RegstrPass, ContextualRegistrationConstants.ASCIIkEY);
    }

    @And("^enter a random password in the confirm password ASCII key field$")
    public void enter_a_random_password_in_the_confirm_password_ascii_key_field() throws Throwable {
    	hideMobileKeyboard();
		enterTextWithoutClick(RegstrConfPass, ContextualRegistrationConstants.ASCIIkEY);
    }

	@Then("^click the check box for accept$")
	public void click_the_check_box_for_accept() throws Throwable {
		hideMobileKeyboard();
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(RegstrTermsCkbx);
		} else {
			if (isElementDisplayedWithoutAssert(TouchIdContent)) {
				clickButtonWithOutScroll(PpTcCheckboxWithBiometricsRegistration);
			} else {
				clickButtonWithOutScroll(PpTcCheckboxWithoutBiometricsRegistration);
			}
		}
	}

	@When("^click on continue button from register screen$")
	public void click_on_continue_button_from_register_screen() throws Throwable {
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(ManualRegistrationPage.HideKeyPadMobileRegistration)) {
			hideMobileKeyboard();
		}
		clickButtonWithOutScroll(RegstrContinue);
		waitFor(7000);
		if (isElementDisplayedWithoutAssert(AccountPage.LoginSave)) {
			waitFor(1000);
			clickButtonWithOutScroll(AccountPage.LoginSave);
		}
	}

	@Then("^App should navigates to Confirm your email address screen$")
	public void app_should_navigates_to_confirm_your_email_address_screen() throws Throwable {
		staticTextValidation(AccountPage.FirstFuelheader, ContextualRegistrationConstants.CONTXTREGHEAD);
		staticTextValidation(CntxtRegTtl, ContextualRegistrationConstants.CONTXTREGTTL);
	}

	@Then("^user should see details in contextual registration screen$")
	public void user_should_see_details_in_contextual_registration_screen() throws Throwable {
		staticTextValidation(CntxtRegTtl, ContextualRegistrationConstants.CONTXTREGTTL);
		staticTextValidation(CntxtRegSubTtl, ContextualRegistrationConstants.CONTXTREGSUBTTL);
		staticTextValidation(CntxtRegResendEmailLink, ContextualRegistrationConstants.CONTXTREGRESNDLNK);
		staticTextValidation(CntxtRegOpenInbox, ContextualRegistrationConstants.CONTXTREGOPENINBX);
		if (platformName.equalsIgnoreCase("Android")) {
			isElementDisplayed(CntxtRegIcon);
		}
		staticTextValidation(AccountPage.AccountSkip, ContextualRegistrationConstants.CONTXTREGSKIP);
	}

	@Then("^user tap on open inbox$")
	public void user_tap_on_open_inbox() throws Throwable {
		clickButtonWithOutScroll(CntxtRegOpenInbox);
	}

	@Then("^see the list of apps installed in device$")
	public void see_the_list_of_apps_installed_in_device() throws Throwable {

		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(CntxtRegAPP, ContextualRegistrationConstants.CONTXTREGAPP);
		} else {
			staticTextValidation(CntxtRegAPP, ContextualRegistrationConstants.CONTXTREGAPPCANCELIOS);
		}
	}

	@Then("^tap on cancel button from email apps$")
	public void tap_on_cancel_button_from_email_apps() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			androidBack();
		} else {
			clickButtonWithOutScroll(CntxtRegAPP);
		}
	}

	@When("^user tap on Resend confirmation email link$")
	public void user_tap_on_resend_confirmation_email_link() throws Throwable {
		clickButtonWithOutScroll(CntxtRegResendEmailLink);
	}

	@Then("^the system should display the confirmation popup$")
	public void the_system_should_display_the_confirmation_popup() throws Throwable {
		staticTextValidation(PopUpMessage, ContextualRegistrationConstants.CONTXTREGRESNDMSG);
	}

	@Then("^app to dismiss the popup when the user taps on OK button$")
	public void app_to_dismiss_the_popup_when_the_user_taps_on_ok_button() throws Throwable {
	clickButtonWithOutScroll(PopUpOK);

	}

	@When("^user tap on Skip button$")
	public void user_tap_on_skip_button() throws Throwable {
//		waitFor(20000);
		waitForElement(AccountPage.AccountSkip,20);
		clickButtonWithOutScroll(AccountPage.AccountSkip);
	}

	@Then("^the system should display Skip warning popup$")
	public void the_system_should_display_skip_warning_popup() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(MessageTTL, ContextualRegistrationConstants.CONTXTREGSKIPTTL);
			staticTextValidation(PopUpMessage, ContextualRegistrationConstants.CONTXTREGSKIPMSG);
			isElementDisplayed(SkipAnyway);
			isElementDisplayed(VerifyEmail);
		} else {
			waitForElement(MessageTTL,3);
			staticTextValidation(MessageTTL, ContextualRegistrationConstants.CONTXTREGSKIPTTL);
			staticTextValidation(PopUpMessageContextual, ContextualRegistrationConstants.CONTXTREGSKIPMSG);
			isElementDisplayed(SkipAnyway);
			isElementDisplayed(VerifyEmail);
		}

	}

	@When("^user tap on Skip anyway$")
	public void user_tap_on_skip_anyway() throws Throwable {
		waitFor(4000);
		clickButtonWithOutScroll(SkipAnyway);
	}

	@Then("^app to dismiss the popup and navigate the user to LID after review$")
	public void app_to_dismiss_the_popup_and_navigate_the_user_to_lid_after_review() throws Throwable {

		if (platformName.equalsIgnoreCase("Android")) {
			waitFor(12000);
		//	clickButtonWithOutScroll(ReviewAccept);
		} else {
			waitForElement(LID,12);
			Assert.assertTrue(isElementDisplayed(LID));
		}
	}

	@When("^user tap on verify email$")
	public void user_tap_on_verify_email() throws Throwable {
		clickButtonWithOutScroll(VerifyEmail);
	}

	@Then("^App should not navigate user to add payment method or maximum fueling screen$")
	public void app_should_not_navigate_user_to_add_payment_method_or_maximum_fueling_screen() throws Throwable {
		staticTextNotSame(AccountPage.FirstFuelheader, ContextualRegistrationConstants.PAYMENTTTL);
	}

	@When("^user minimize and relaunch the app$")
	public void user_minimize_and_relaunch_the_app() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			androidBackgroundandLaunch();
		} else {
			backgroundiOSApp();
		}
	}

	@When("^user kill and relaunch the app$")
	public void user_kill_and_relaunch_the_app() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			initiateNativeAPP();
			waitFor(10000);
		} else {
			closeIOSApp();
			launchiOSApp();
		}
	}

	
}
