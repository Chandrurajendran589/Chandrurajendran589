package stepDefinitions;

import contants.AccountConstants;
import contants.RedemptionOptionConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.OffersPage;
import pages.RedemptionOptionPage;

public class RedemptionOptionSteps extends RedemptionOptionPage {
    RedemptionOptionPage paymentPage=new RedemptionOptionPage();
    OffersPage OffersPage=new OffersPage();

    @Given("^click in the login link in present in dashboard$")
    public void clickOnTheLoginLinkInPresentInDashboard() {
        waitFor(4000);
        clickButtonWithOutScroll(Loginlink);

    }

    @When("^Enter the UserName$")
    public void enterTheUserName() throws InterruptedException {
        waitFor(4000);
        clickButtonWithOutScroll(userName);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
        }
        enterTextWithoutScroll(userName, RedemptionOptionConstants.userName);
    }

    @And("^Enter the Password$")
    public void enterThePassword() {
        waitFor(1000);
        enterTextWithoutScroll(password, RedemptionOptionConstants.password);
    }

    @Then("^Click on logIn button$")
    public void clickOnLoginButton() throws InterruptedException {
        waitFor(5000);
        clickButtonWithOutScroll(loginButton);
        waitFor(4000);
        if(isElementDisplayedWithoutAssert(NectarCloseLIDPopUp)) {
            clickButtonWithOutScroll(NectarCloseLIDPopUp);
        }
    }

    @And("^Click on Start fuelling button$")
    public void clickOnStartFuellingButton() {
        waitFor(2000);
        clickButtonWithOutScroll(startButton);
        clickButtonWithOutScroll(LocationContinueButton);
        clickButtonWithOutScroll(LocationAccess);
    }

    @Then("^Click on Continue button in Select pump screen$")
    public void clickOnContinueButtonInSelectPumpScreen() {
        waitFor(5000);
        clickButtonWithOutScroll(selectPumpContinue);
    }

    @And("^Click on reward Edit button in Payment confirmation screen$")
    public void clickOnRewardEditButtonInPaymentConfirmationScreen() {
        clickButtonWithOutScroll(EditLoyalityCardButton);

    }

    @Then("^Verify the Message is displayed$")
    public void verifyTheMessageIsDisplayed() {
        staticTextValidation(RewardPopupMessage, RedemptionOptionConstants.RewardPopupMessage);
    }

    @And("^Click Ok button on Redemption Popup$")
    public void clickRedemptionOnOkButtonOnPopup() {

        clickButtonWithOutScroll(okButton);
    }


}
