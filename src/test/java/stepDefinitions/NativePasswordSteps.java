package stepDefinitions;

import contants.AccountConstants;
import contants.ContextualRegistrationConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

public class NativePasswordSteps extends NativePasswordPage {
	AccountPage AccountPage = new AccountPage();
	ContextualRegistrationPage ContextualRegistrationPage = new ContextualRegistrationPage();
	OffersPage OffersPage = new OffersPage();

	@Then("^user taps login button in NLID$")
	public void user_taps_login_button_in_nlid() throws Throwable {
		clickButtonWithOutScroll(AccountPage.AccountLoginBtn);
		waitFor(1000);
	}

	@And("^validate the OS Native password pop up$")
	public void validate_the_os_native_password_pop_up() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			waitFor(1000);
			isElementDisplayed(LoginSavePwd);
			isElementDisplayed(LoginSave);
			isElementDisplayed(LoginSaveNever);
		}
		else{
			waitFor(5000);
			isElementDisplayed(LoginSavePwd);
			isElementDisplayed(LoginSaveNever);

		}
	}

	@Then("^click on continue button from NLID$")
	public void click_on_continue_button_from_nlid() throws Throwable {
		clickButtonWithOutScroll(ContextualRegistrationPage.RegstrContinue);
	}

	@When("^user clicks the save password button$")
	public void userClicksTheSavePasswordButton() {
		waitFor(3000);
		clickButtonWithOutScroll(LoginSavePwd);
	}

	@When("^user clicks the Not now button$")
	public void userClicksTheNotNowButton() {
		waitFor(5000);
		clickButtonWithOutScroll(LoginSaveNever);
	}

	@When("^user taps on email tab$")
	public void userTapsOnEmailTab() {
		waitForElement(AccountPage.AccountEmail,5);
		clickButtonWithOutScroll(AccountPage.AccountEmail);

	}

	@And("^user checks the suggestions on the keyboard$")
	public void userChecksTheSuggestionsOnTheKeyboard() {
		waitFor(5000);
		isElementDisplayed(EmailSuggestion);
	}

	@And("^user clicks the mail suggestion from the keyboard$")
	public void userClicksTheMailSuggestionFromTheKeyboard() {
		waitFor(2000);
		clickButtonWithOutScroll(EmailSuggestion);
	}

	@Then("^user validates the password getting displayed$")
	public void userValidatesThePasswordGettingDisplayed() {
		waitFor(3000);
		isElementDisplayed(PasswordPrompt);
	}

	@Then("^user validates the password not getting displayed$")
	public void userValidatesThePasswordNotGettingDisplayed() {
		waitFor(3000);
		isElementDisplayed(PasswordPrompt);
	}

	@When("^click on the continue button in registration screen$")
	public void clickOnTheContinueButtonInRegistrationScreen() {
		clickButtonWithOutScroll(RegstrContinue);
		waitFor(3000);
	}
}