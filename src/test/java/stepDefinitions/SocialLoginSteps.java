package stepDefinitions;

import contants.COFChallangeFlowConstants;
import contants.SocialLoginConstants;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import pages.SocialLoginPage;

public class SocialLoginSteps extends SocialLoginPage {
    @When("^user taps on login with facebook$")
    public void userTapsOnLoginWithFacebook() {
        clickButtonWithOutScroll(FbIcon);
    }

    @When("^the user enters the login details for \"([^\"]*)\"$")
    public void theUserEntersTheLoginDetailsFor(String arg0) throws Throwable {
        waitFor(3000);
        switchToWebAppContext(((AppiumDriver) driver));
        waitFor(2000);
        enterTextWithoutScroll(FbUserName, SocialLoginConstants.FBMAIL);
        hideMobileKeyboard();
        enterTextWithoutScroll(FbPassword,SocialLoginConstants.FBPWD);
        hideMobileKeyboard();
    }

    @Then("^user validates the Forgot PIN screen$")
    public void userValidatesTheForgotPINScreen() {
        Assert.assertTrue(isElementDisplayed(ForgotPinText));
        Assert.assertTrue(isElementDisplayed(ForgotPinSendBtn));
        Assert.assertTrue(isElementDisplayed(ForgotPinTitle));
        Assert.assertTrue(isElementDisplayed(ForgotPinCancelBtn));
    }

    @When("^user clicks on send button in Forget password Screen$")
    public void userClicksOnSendButtonInForgetPasswordScreen() {
        clickButtonWithOutScroll(ForgotPinSendBtn);
    }

    @Then("^user verifies the popup for the forgot PIN$")
    public void userVerifiesThePopupForTheForgotPIN() {

        Assert.assertTrue(isElementDisplayed(ForgotPinPopUpText));

    }


    @And("^user taps on the login button in the facebook login$")
    public void userTapsOnTheLoginButtonInTheFacebookLogin() {
        clickButtonWithOutScroll(FbLoginBtn);
    }

    @When("^user logs in with twitter$")
    public void userLogsInWithTwitter() {
        clickButtonWithOutScroll(TwitterIcon);
    }

    @And("^user enters the login details for \"([^\"]*)\"$")
    public void userEntersTheLoginDetailsFor(String arg0) throws Throwable {
        waitFor(3000);
        switchToWebAppContext(((AppiumDriver) driver));
        waitFor(2000);
        enterTextWithoutScroll(TwitterUserName,COFChallangeFlowConstants.LNUSER);
        hideMobileKeyboard();
        enterTextWithoutScroll(TwitterPwd,COFChallangeFlowConstants.LNPASSWORD);
        hideMobileKeyboard();

    }

    @And("^user taps twitter login button$")
    public void userTapsTwitterLoginButton() {
        clickButtonWithOutScroll(TwitterLoginBtn);
    }

    @And("^user taps on terms and conditions checkboxes$")
    public void userTapsOnTermsAndConditionsCheckboxes() {
        waitForElement( Facebook_Privacy_policy_tc_txt, 9);
        Assert.assertTrue(Facebook_Privacy_policy_tc_txt.isDisplayed());
        Assert.assertTrue(Facebook_Receive_emails_tc_txt.isDisplayed());
        System.out.println("check box validation1 "+Facebook_Privacy_policy_tc_checkbox.isEnabled());
        System.out.println("check box validation2 "+Facebook_Receive_emails_tc_checkbox.isDisplayed());
        clickButtonWithOutScroll(Facebook_Privacy_policy_tc_checkbox);
        waitForElement(Facebook_Receive_emails_tc_checkbox,5);
        clickButtonWithOutScroll(Facebook_Receive_emails_tc_checkbox);
    }

    @And("^user taps on \"([^\"]*)\" button$")
    public void userTapsOnButton(String label) throws Throwable {
       clickButtonWithOutScroll(getButtonElement(label));
    }
}
