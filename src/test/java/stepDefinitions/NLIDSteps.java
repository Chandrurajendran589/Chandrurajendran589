package stepDefinitions;

import contants.MenuConstants;
import contants.NLIDConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.MenuPage;
import pages.NLIDPage;
import pages.OffersPage;

public class NLIDSteps extends NLIDPage {
    AccountSteps accountSteps = new AccountSteps();
    pages.MenuPage MenuPage = new MenuPage();
    OffersPage OffersPage=new OffersPage();
    @When("^user taps on Register screen$")
    public void user_taps_on_Register_screen() {
        waitFor(5000);
    	clickButtonWithOutScroll(registeranaccount_NLID);
    }

    @When("^Verify the Registration screen$")
    public void Verify_the_Registration_screen() {
        Assert.assertTrue(isTextMatch(registeration_First.getText(),
                NLIDConstants.REGISTRATIONSCREENTITLE));
    }
    @And("^user taps on Login button in NLID$")
    public void user_taps_on_login_button_in_nlid() {

        clickButtonWithOutScroll(login_Button_Nlid);
    }

    @And("^User taps on Login button in Login screen without entering the values$")
    public void user_taps_on_login_button_in_login_screen_without_entering_the_values() {
        clickButtonWithOutScroll(login_Button_Login);

        if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
           	clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
        }
        
    }

    @Then("^Verify the inline error message during login$")
    public void verify_the_inline_error_message_during_login() {
        Assert.assertTrue(isTextMatch(inline_Error_Email.getText(),
                NLIDConstants.INLINEERROREMAIL));
    }

    @And("^Enter valid mail and tap done$")
    public void enter_valid_mail_and_tap_done() {
        if (platformName.equalsIgnoreCase("iOS")) {
            enterTextWithoutScroll(email_Valid_Login, NLIDConstants.VALIDMAILLOGIN);
            clickButtonWithOutScroll(login_Button_Login);
        }
        else
            if (platformName.equalsIgnoreCase("Android"))
        {
            enterTextWithoutScroll(email_Valid_Login,NLIDConstants.VALIDMAILID);
            clickButtonWithOutScroll(login_Button_Login);
        }
    }

    @Then("^Verify the inline error message for password$")
    public void verify_the_inline_error_message_for_password() {
        Assert.assertTrue(isTextMatch(inline_Error_Password.getText(),
                NLIDConstants.INLINEERRORPASSOWRD));
    }

    @And("^Enter the wrong password and tap login$")
    public void enter_the_wrong_password_and_tap_login() {
        enterTextWithoutScroll(email_Valid_Password_Wrong, NLIDConstants.VALIDPASSWORDWRONG);
        clickButtonWithOutScroll(login_Button_Login);
    }

    @Then("^Verify the popup content$")
    public void verify_the_popup_content() throws Throwable {
        waitFor(7000);
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isTextMatch(invalid_unpwd_popup.getText(),
                    NLIDConstants.LOGINPAGENOTIFICATIONPOPUP));
        }
        else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(3000);
            
            isElementEnabled(invalid_unpwd_popup);
            Assert.assertTrue(isTextMatch(invalid_unpwd_popup.getText(),
                    NLIDConstants.LOGINPAGENOTIFICATIONPOPUP));
        }
    }

    @Then("^user taps on Forgot password link in login screen in NLID$")
    public void user_taps_on_Forgot_password_link_in_login_screen_in_NLID() throws Throwable {
      waitForElement(forgot_Password_Button,5);
        clickButtonWithOutScroll(forgot_Password_Button);
    }

    @And("^user enters invalid email id$")
    public void user_enters_invalid_email_id() {
       waitForElement(invaild_Emailid_Section_Forgot_Password, 8);
        enterTextWithoutScroll(invaild_Emailid_Section_Forgot_Password, NLIDConstants.INVALIDEMAILID);
    }

    @And("^user taps on send button in Forgot Password Screen$")
    public void user_taps_on_send_button_in_Forgot_Password_screen() {
        clickButtonWithOutScroll(send_Button_Forgot_Password);
    }

    @Then("^Verify the inability to send the mail$")
    public void verify_the_inability_to_send_the_mail() {
        Assert.assertTrue(isTextMatch(inline_Error_Email_Password.getText(),
                NLIDConstants.INLINEERROREMAILPASSOWRD));
    }

    @And("^user taps on Cancel in the Login Screen$")
    public void user_taps_on_cancel_in_the_login_screen() {
        if (platformName.equalsIgnoreCase("iOS"))
        {
            clickButtonWithOutScroll(cancel_Button_Forgot_Password);
        }
        else
            if (platformName.equalsIgnoreCase("Android"))
            {
                clickButtonWithOutScroll(cancel_Button_Forgot_Password);
        }

    }

    @And("^User enters valid email id and taps send button$")
    public void user_enters_valid_email_id_and_taps_send_button() {
        if (platformName.equalsIgnoreCase("iOS")) {
            enterTextWithoutScroll(vaild_Emailid_Section_Forgot_Password, NLIDConstants.VALIDMAILLOGIN);
            clickButtonWithOutScroll(send_Button_Forgot_Password);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
           enterTextWithoutClick(vaild_Emailid_Section_Forgot_Password, NLIDConstants.VALIDMAILID);
           clickButtonWithOutScroll(send_Button_Forgot_Password);
        }
    }

    @Then("^Verify the mail is sent$")
    public void verify_the_mail_is_sent() throws Throwable {
        waitForElement(email_Sent_popup,10);
        Assert.assertTrue(isTextMatch(email_Sent_popup.getText(),
                    NLIDConstants.EMAILSENTPOPUPTITLE));
        clickButtonWithOutScroll(OKBTN);
    }

    @And("^user taps on Twitter icon in the NLID$")
    public void user_taps_on_twitter_icon_in_the_nlid() {
        clickButtonWithOutScroll(esso_Twitter_Button_Nlid);
    }

    @Then("^user verifies whether the app navigated to Twitter login screen$")
    public void user_verifies_whether_the_app_navigated_to_twitter_login_screen() throws Throwable {
        waitForElement(esso_Twitter_Screen_Content);
        isElementEnabled(esso_Twitter_Screen_Content);

    }

    @And("^user navigates back to NLID from Twitter$")
    public void user_navigates_back_to_nlid_from_twitter() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(esso_SSO_Back_Button);
        }
        else
            if (platformName.equalsIgnoreCase("Android"))
            {
                isElementEnabled(esso_Twitter_Back_button);
                clickButtonWithOutScroll(esso_Twitter_Back_button);
                isElementEnabled(esso_return_NLID_button);
                clickButtonWithOutScroll(esso_return_NLID_button);
            }
    }

    @And("^user taps on Facebook icon in the NLID$")
    public void user_taps_on_facebook_icon_in_the_nlid() {
        isElementEnabled(esso_Facebook_Button_Nlid);
        clickButtonWithOutScroll(esso_Facebook_Button_Nlid);
    }

    @Then("^user verifies whether the app navigated to Facebook login screen$")
    public void user_verifies_whether_the_app_navigated_to_facebook_login_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(esso_Facebook_Screen_Content, 10);
            Assert.assertTrue(isTextMatch(esso_Facebook_Screen_Content.getText(),
                    NLIDConstants.ESSOTFACEBOOKPAGE));
        }
        else
        if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(3000);
            isElementEnabled(esso_Facebook_Screen_Content);
        }
    }

    @And("^user navigates back to NLID from Facebook$")
    public void user_navigates_back_to_nlid_from_facebook() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(esso_SSO_Back_Button);
        }
        else
            if (platformName.equalsIgnoreCase("Android"))
            {
                isElementEnabled(esso_back_fb_button);
                clickButtonWithOutScroll(esso_back_fb_button);
            }
    }

    @And("^user taps on Linkedin icon in the NLID$")
    public void user_taps_on_linkedin_icon_in_the_nlid() {
        isElementEnabled(esso_Linkedin_Button_Nlid);
        clickButtonWithOutScroll(esso_Linkedin_Button_Nlid);
    }

    @Then("^user verifies whether the app navigated to Linkedin login screen$")
    public void user_verifies_whether_the_app_navigated_to_linkedin_login_screen() throws Throwable {
        waitForElement(esso_Linkedin_Screen_Content, 10);
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isTextMatch(esso_Linkedin_Screen_Content.getText(),
                    NLIDConstants.ESSOLINKEDINPAGE));
        }
        else
            if (platformName.equalsIgnoreCase("Android"))
            {
                Assert.assertTrue(isTextMatch(esso_Linkedin_Screen_Content.getText(),
                        NLIDConstants.LINKEDINSCREEN));
            }
    }

    @And("^user navigates back to NLID from Linkedin$")
    public void user_navigates_back_to_nlid_from_linkedin() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(esso_SSO_Back_Button);
        }
        else
            if (platformName.equalsIgnoreCase("Android"))
            {
                androidBack();
                waitFor(2000);
            }
    }

    @Then("^user taps on back button to navigate to login screen$")
    public void user_taps_on_back_button_to_navigate_to_login_screen() throws Throwable {

        androidBack();
    }

    @Then("^user verifies the login button in the NLID$")
    public void user_verifies_the_login_button_in_the_nlid() throws Throwable {
        Assert.assertTrue(isElementDisplayed(login_Button_Nlid));
    }

    @And("^user enters valid mail id$")
    public void user_enters_valid_mail_id() throws Throwable {

        enterTextWithoutScroll(email_Valid_Login, NLIDConstants.VALIDMAILLOGIN);
    }

    @And("^user enters valid mail id and password$")
    public void user_enters_valid_mail_id_and_password() throws Throwable {

        enterTextWithoutScroll(email_Valid_Login, NLIDConstants.VALIDMAILLOGIN);
        enterTextWithoutScroll(email_Valid_Password_Wrong, NLIDConstants.VALIDPASS);
    }

    @And("^user navigated to More Screen$")
    public void user_navigated_to_more_screen() throws Throwable {

        waitFor(1000);
        androidBack();
    }
    @And("^clicks on ok button in the popup content$")
    public void clicksOnOkButtonInThePopupContent() {
        waitForElement(OkButtonWrongContentPopup);
        clickButtonWithOutScroll(OkButtonWrongContentPopup);
    }

    @Then("^user verifies Start button in the LID$")
    public void userVerifiesStartButtonInTheLID() {
        waitForElement(StartButtonLID);
        isElementEnabled(StartButtonLID);
//        Assert.assertTrue(isElementEnabled(StartButtonLID));
    }

    @And("^user verifies the Youtube links$")
    public void userVerifiesTheYoutubeLinks() {
//        ScrollTo(MenuConstants.FD_Help_Youtube_howtouseFFApp, "up", MenuPage.FDHelp_Youtube_howtouseFFApp);
        Assert.assertTrue(isTextMatch(MenuPage.FDYoutube_link.getText(), MenuConstants.Youtube_link));
        Assert.assertTrue(isTextMatch(MenuPage.FDHelp_Youtube_howtosetupFFApp.getText(), MenuConstants.FD_Help_Youtube_howtosetupFFApp));
        Assert.assertTrue(isTextMatch(MenuPage.FDHelp_Youtube_howtouseFFApp.getText(), MenuConstants.FD_Help_Youtube_howtouseFFApp));
    }

    @And("^user verifies the Version in the help screen$")
    public void userVerifiesTheVersionInTheHelpScreen() {
        Assert.assertTrue(isElementEnabled(MenuPage.VersionHelp));
    }

    @And("^user enters invalid email id in the Login screen$")
    public void userEntersInvalidEmailIdInTheLoginScreen() {
        waitForElement(AccountPage.AccountEmail, 8);
        enterTextWithoutScroll(AccountPage.AccountEmail, NLIDConstants.INVALIDEMAILID);
    }

    @And("^User enters the \"([^\"]*)\" valid mail id and taps send button$")
    public void userEntersTheValidMailIdAndTapsSendButton(String userType) throws Throwable {
        waitForElement(vaild_Emailid_Section_Forgot_Password);
        enterTextWithoutScroll(vaild_Emailid_Section_Forgot_Password, getTestDataValues(loginclass_path, userType)[0]);
        clickButtonWithOutScroll(send_Button_Forgot_Password);
    }
}