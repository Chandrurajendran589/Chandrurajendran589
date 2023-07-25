package stepDefinitions;

import contants.AppLaunchConstants;
import contants.ModalPopupConstants;
import contants.PaymentMethodConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AppLaunchPage;
import pages.ContextualRegistrationPage;
import pages.OffersPage;
import pages.RedemptionOptionPage;

public class AppLaunchSteps extends AppLaunchPage {
    AppLaunchPage appScreen= new AppLaunchPage();
    RedemptionOptionPage paymentPage=new RedemptionOptionPage();
    OffersPage OffersPage=new OffersPage();
    ContextualRegistrationPage ContextualRegistrationPage=new ContextualRegistrationPage();

    @Then("^verify that Welcome screen screen is displayed$")
    public void verifyThatWelcomeScreenScreenIsDisplayed() {
        waitFor(15000);
        Assert.assertTrue(TutorialSkipButton.isEnabled());
        staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_welComeMessage);
    }

    @And("^Verify Pay securely from your car screen displayed$")
    public void verifyPaySecurelyFromYourCarScreenDisplayed() {
        waitFor(5000);
        Assert.assertTrue(TutorialSkipButton.isDisplayed());
        clickButtonWithOutScroll(tutorialNextButton);
        staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_PaySecurelyTitle);

    }

    @And("^Verify Collect Nectar points on every fill$")
    public void collectNectarPointsOnEveryFill() {
        waitFor(5000);
        clickButtonWithOutScroll(tutorialNextButton);
        staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_NectarPoint_Title);
        Assert.assertTrue(tutorialGetStartedButton.isDisplayed());
    }

    @Then("^Verify the Start fueling button$")
    public void verifyTheStartFuelingButton() {
        waitFor(4000);
        Assert.assertTrue(nectarPointLID.isDisplayed());
        System.out.println(nectarPointLID.getText());
    }

    @And("^Verify the Nectar Points in LID screen$")
    public void verifyTheNectarPointsInLIDScreen() {
        waitFor(4000);
        Assert.assertTrue(startButtonLID.isDisplayed());

    }

    @Then("^verify that Welcome screen screen is displayed and Pump in welcome screen$")
    public void verifyThatWelcomeScreenScreenIsDisplayedAndPumpInWelcomeScreen() {
        waitFor(4000);
//        Assert.assertTrue(subTitleText.isDisplayed());
        staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_welComeMessage);
        Assert.assertTrue(pumpIconFirst.isEnabled());
//        staticTextValidation(subTitleText, AppLaunchConstants.SubTitle);
    }

    @When("^Enter the UserName in UN Text field$")
    public void enterTheUserNameInUNTextField() {
        waitFor(5000);
        clickButtonWithOutScroll(userName);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
        }
        enterTextWithoutScroll(userName, AppLaunchConstants.userName);
    }

    @And("^Enter the Password in PW Text field$")
    public void enterThePasswordInPWTextField() {
        waitFor(3000);
        enterTextWithoutScroll(password, AppLaunchConstants.password);
    }
    @And("^Accept all the cookies$")
    public void accept_all_the_cookies() throws Throwable {

            waitForElement(ContextualRegistrationPage.acceptAllButtonAppLaunch,20);
            clickButtonWithOutScroll(ContextualRegistrationPage.acceptAllButtonAppLaunch);

    }
}
