package stepDefinitions;

//import sun.jvm.hotspot.runtime.StaticBaseConstructor;

import contants.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

public class SSOSteps extends SSOPage {
    GuestCheckOutPage GuestCheckOutPage=new GuestCheckOutPage();
    ContextualRegistrationPage ContextualRegistrationPage=new ContextualRegistrationPage();
    ProfileCompletionPage ProfileCompletionPage=new ProfileCompletionPage();
    FrictionlessFlowPage FrictionlessFlowPage=new FrictionlessFlowPage();
    COFChallangeFlowPage COFChallangeFlowPage =new COFChallangeFlowPage();
    AccountPage AccountPage=new AccountPage();

    @When("^I enter SSO login details for \"([^\"]*)\"$")
    public void i_enter_sso_login_details_for_something(String userType) throws Throwable {

        if(userType.toLowerCase().contains("linkedin")) {
            isElementDisplayed(COFChallangeFlowPage.LinkedinIcon);
            clickButtonWithOutScroll(COFChallangeFlowPage.LinkedinIcon);
            waitForElement(SSOUsername,15);
            enterTextWithoutScroll(SSOUsername, getTestDataValues(loginclass_path, userType)[0]);
            enterTextWithoutScroll(SSOpassWord, getTestDataValues(loginclass_path, userType)[1]);
            hideMobileKeyboard();
            clickButtonWithOutScroll(COFChallangeFlowPage.SSOsignin);
            waitFor(5000);
            if (isElementEnabled(AccountPage.NotNowButtonLID)) {
                clickButtonWithOutScroll(AccountPage.NotNowButtonLID);
            }
            if (isElementEnabled(AccountPage.CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(AccountPage.CloseButtonModalPopupLid);
            }
        }
        else if(userType.toLowerCase().contains("facebook"))
        {
            clickButtonWithOutScroll(FacebookIcon);
            waitFor(5000);
            enterTextWithoutScroll(SSOUsername, getTestDataValues(loginclass_path, userType)[0]);
            enterTextWithoutScroll(SSOpassWord, getTestDataValues(loginclass_path, userType)[1]);
            hideMobileKeyboard();
            clickButtonWithOutScroll(FBLogin);
            waitFor(5000);
            if (isElementEnabled(AccountPage.NotNowButtonLID)) {
                clickButtonWithOutScroll(AccountPage.NotNowButtonLID);
            }
            if (isElementEnabled(AccountPage.CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(AccountPage.CloseButtonModalPopupLid);
            }
        }
        else if(userType.toLowerCase().contains("twitter"))
        {
            clickButtonWithOutScroll(TwitterIcon);
            waitFor(5000);
            enterTextWithoutScroll(SSOUsername, getTestDataValues(loginclass_path, userType)[0]);
            hideMobileKeyboard();
            enterTextWithoutScroll(SSOpassWord, getTestDataValues(loginclass_path, userType)[1]);
            hideMobileKeyboard();
            clickButtonWithOutScroll(SSOTwittersignin);
            waitFor(5000);
            if (isElementEnabled(AccountPage.NotNowButtonLID)) {
                clickButtonWithOutScroll(AccountPage.NotNowButtonLID);
            }
            if (isElementEnabled(AccountPage.CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(AccountPage.CloseButtonModalPopupLid);
            }
        }
    }
    @When("^I enter SSO login details for Twitter$")
    public void i_enter_sso_login_details_for_twitter() throws Throwable {
        waitFor(15000);
        enterTextWithoutClick(SSOUsername,SSOConstants.TwitterUSER);
        hideMobileKeyboard();
        enterTextWithoutClick(SSOpassWord, SSOConstants.TwitterPASSWORD);
        hideMobileKeyboard();
    }
    @When("^I enter SSO login details for Facebook$")
    public void i_enter_sso_login_details_for_facebook() throws Throwable {
        waitFor(5000);
        enterTextWithoutClick(SSOUsername,SSOConstants.FacebookUSER);
        hideMobileKeyboard();
        enterTextWithoutClick(SSOpassWord, SSOConstants.FacebookPASSWORD);
        hideMobileKeyboard();
    }

    @And("^user taps login button in Twitter login screen$")
    public void user_taps_login_button_in_twitter_login_screen() throws Throwable {
        clickButtonWithOutScroll(SSOTwittersignin);
        waitFor(2000);

    }
    @And("^user taps login button in Facebook login screen$")
    public void user_taps_login_button_in_facebook_login_screen() throws Throwable {
        clickButtonWithOutScroll(FBLogin);
        waitFor(2000);
    }
    @And("^tap on Edit pin from account screen$")
    public void tap_on_edit_pin_from_account_screen() throws Throwable {

        clickButtonWithOutScroll(AccountEdit);
    }
    @Then("^Verify user is navigated to Enter Pin Screen$")
    public void verify_user_is_navigated_to_enter_pin_screen() throws Throwable {

        staticTextValidation(GuestCheckOutPage.HeaderText,SSOConstants.Forgot_PIN);
    }
    @When("^user taps on Forgot your pin link$")
    public void user_taps_on_forgot_your_pin_link() throws Throwable {
        clickButtonWithOutScroll(ForgotYourPin);
    }
    @Then("^user is navigated to Forgot Pin Screen$")
    public void user_is_navigated_to_forgot_pin_screen() throws Throwable {
        waitFor(3000);
        staticTextValidation(GuestCheckOutPage.HeaderText,SSOConstants.Forgot_PIN);
    }
    @And("^Veirfy all the elements are present in Forgot Pin Screen$")
    public void veirfy_all_the_elements_are_present_in_forgot_pin_screen() throws Throwable {
        staticTextValidation(GuestCheckOutPage.HeaderText,SSOConstants.Forgot_PIN);
        staticTextValidation(ForgotPinDescription,SSOConstants.Forgot_Pin_Desc);
        staticTextValidation(SendButton,SSOConstants.SEND);
    }
    @And("^user taps on send button in Forgot Pin Screen$")
    public void user_taps_on_send_button_in_forgot_pin_screen() throws Throwable {
        clickButtonWithOutScroll(SendButton);
    }
    @Then("^verify the confirmation pop up is displayed$")
    public void verify_the_confirmation_pop_up_is_displayed() throws Throwable {
       staticTextValidation(ResetPinPopup_Msg,SSOConstants.Instructon_ResetPin_Message);
    }
    @Then("^verify the user is navigated to the Account screen$")
    public void verify_the_user_is_navigated_to_the_account_screen() throws Throwable {
        staticTextValidation(GuestCheckOutPage.HeaderText,SSOConstants.Account);
    }
    @Then("^user is on Twitter Login$")
    public void user_is_on_twitter_login() throws Throwable {
        clickButtonWithOutScroll(TwitterIcon);
    }
    @Then("^user is on Facebook Login$")
    public void user_is_on_facebook_login() throws Throwable {
        clickButtonWithOutScroll(FacebookIcon);
    }
    @Then("^verify user is on LID Screen$")
    public void verify_user_is_on_lid_screen() throws Throwable {
        waitFor(10000);
        Assert.assertTrue(isElementDisplayed(StartFuelIconLID));
    }
}