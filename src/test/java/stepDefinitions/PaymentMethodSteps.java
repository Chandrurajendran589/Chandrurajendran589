package stepDefinitions;

import contants.AccountConstants;
import contants.AppLaunchConstants;
import contants.PaymentMethodConstants;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.OffersPage;
import pages.PaymentMethodPage;

public class PaymentMethodSteps extends PaymentMethodPage {
    PaymentMethodPage paymentPage=new PaymentMethodPage();
    pages.OffersPage OffersPage=new OffersPage();


    @Given("^click on the login link in present in dashboard$")
    public void clickOnTheLoginLinkInPresentInDashboard() {
        waitFor(5000);
        clickButtonWithOutScroll(Loginlink);

    }
    @Given("^click on the login link in dashboard$")
    public void clickOnTheLoginLinkInDashboard() {
        waitFor(5000);
        clickButtonWithOutScroll(Loginlink);
    }

    @When("^Enter the User name$")
    public void enterTheUserName() throws InterruptedException {
        waitFor(5000);
        clickButtonWithOutScroll(userName);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
        }
        enterTextWithoutScroll(userName, PaymentMethodConstants.UserName1);
    }

    @And("^Enter the password$")
    public void enterThePassword() {
        waitFor(5000);
        enterTextWithoutScroll(password, PaymentMethodConstants.password);
    }

    @Then("^Click on login button$")
    public void clickOnLoginButton() throws InterruptedException {
        waitFor(5000);
        clickButtonWithOutScroll(loginButton);
        waitFor(5000);
        if(notNowPassword.size()>=1){
            Assert.assertTrue(SavePWD.isDisplayed());
            clickButtonWithOutScroll(notNowPWD);
        }
        else {
            System.out.println("Save Password or Never Popup is not displayed");
        }

    }

    @And("^user clicks on more icon in LID Screen$")
    public void userClicksOnMoreIconInLIDScreen() {
        waitFor(5000);
        /*if(notNowPassword.size()>=1){
            Assert.assertTrue(SavePWD.isDisplayed());
            clickButtonWithOutScroll(notNowPWD);
            clickButtonWithOutScroll(moreLink);
        }
        else {
            waitFor(5000);
            clickButtonWithOutScroll(moreLink);
        }*/
        clickButtonWithOutScroll(moreLink);
    }

    @Then("^Click on Add Card$")
    public void clickOnAddCard() {
        if(platformName.equalsIgnoreCase("Android")) {
            waitFor(3000);
            ScrollToAddNectarCardText.isDisplayed();
            // ScrollTo(PaymentMethodConstants.DefaultPaymentText, AccountConstants.IOSSCROLLUP, defaultPaymentMethodButton);
            clickButtonWithOutScroll(addCardLink);
        }
        else {
            waitFor(3000);
            //ScrollToAddNectarCardText.isDisplayed();
             ScrollTo(PaymentMethodConstants.DefaultPaymentText, AccountConstants.IOSSCROLLUP, defaultPaymentMethodButton);
            clickButtonWithOutScroll(addCardLink);
        }
    }

    @And("^Enter pin$")
    public void enterPin() {
        if(ListPinDigit1.size()>=1){
            waitFor(2000);
            enterTextWithoutScroll(pinDigit1, PaymentMethodConstants.pinFirstDigit1);
            enterTextWithoutScroll(pinDigit2, PaymentMethodConstants.pinFirstDigit2);
            enterTextWithoutScroll(pinDigit3, PaymentMethodConstants.pinFirstDigit3);
            enterTextWithoutScroll(pinDigit4, PaymentMethodConstants.pinFirstDigit4);
            clickButtonWithOutScroll(pinContinueButton);
        }
        else{
            System.out.println("Pin is already Set");
        }
    }

    @Then("^Click on continue button$")
    public void clickOnContinueButton() {
        if(pinContinueButton.isDisplayed()){
            clickButtonWithOutScroll(pinContinueButton);
            clickButtonWithOutScroll(pinOkButton);
        }
        else{
            System.out.println("No Ok button displayed");
            clickButtonWithOutScroll(accountLink);
        }
    }

    @And("^Verify Visa card icon is displayed$")
    public void verifyVisaCardIconIsDisplayed() {
        System.out.println("Visa Card icon is displayed: "+Visa_Icon.isEnabled());
        Assert.assertTrue(Visa_Icon.isEnabled());
    }

    @And("^Verify Master card icon is displayed$")
    public void verifyMasterCardIconIsDisplayed() {
        System.out.println("Master Card icon is displayed: "+master_Icon.isEnabled());
        Assert.assertTrue(master_Icon.isEnabled());
    }

    @And("^Verify Card Name text box is displayed$")
    public void verifyCardNameTextBoxIsDisplayed() {
        Assert.assertTrue(cardNameTextBox.isDisplayed());
    }

    @And("^Verify Card number text box is displayed$")
    public void verifyCardNumberTextBoxIsDisplayed() {
        Assert.assertTrue(cardNumberTextBox.isDisplayed());
    }

    @Then("^verify Card expire date text box is displayed$")
    public void verifyCardExpireDateTextBoxIsDisplayed() {
        Assert.assertTrue(expireDateTextBox.isDisplayed());
    }

    @And("^verify Post code text box is displayed$")
    public void verifyPostCodeTextBoxIsDisplayed() {
        Assert.assertTrue(SecurityCodeTextBox.isDisplayed());
        Assert.assertTrue(addressSearchIcon.isDisplayed());
        Assert.assertTrue(addressLine1TextBox.isDisplayed());
        Assert.assertTrue(addressLine2TextBox.isDisplayed());
        Assert.assertTrue(cityTextBox.isDisplayed());
    }

    @Then("^verify billing address text box is displayed$")
    public void verifyBillingAddressTextBoxIsDisplayed() {
        Assert.assertTrue(pinCodeSearchBox.isDisplayed());

    }


    @And("^Verify Search button is displayed$")
    public void verifyContinueButtonIsDisplayed() {
        waitFor(2000);
//        ScrollToFingerPrintText.isDisplayed();
        Assert.assertTrue(addressSearchIcon.isEnabled());
    }

    @And("^Verify that ‘Scan your card’ as a button$")
    public void verifyThatScanYourCardAsAButton() {
        Assert.assertTrue(paymentScanButton.isDisplayed());
    }

    @And("^Verify User is able to see 'Skip' button$")
    public void verifyUserIsAbleToSeeCancelButton() {
        Assert.assertTrue(paymentPageCancelButton.isEnabled());
    }

    @And("^Enter the PostCode in search box$")
    public void enterThePostCodeInSearchBox() {
        enterTextWithoutScroll(pinCodeSearchBox, PaymentMethodConstants.pinCodeSearchBox);
    }

    @Then("^Click on Search button$")
    public void clickOnSearchButton() {

        clickButtonWithOutScroll(addressSearchIcon);
    }

    @And("^Verify that No Result displayed$")
    public void verifyThatNoResultDisplayed() {
        waitFor(3000);
        Assert.assertTrue(noResultsText.isDisplayed());
    }

    @And("^Click on Account link$")
    public void clickOnAccountLink() {
        waitFor(2000);
        clickButtonWithOutScroll(accountLink);
    }

    @Then("^Click on Edit card link$")
    public void clickOnEditCardLink() {
        waitFor(3000);
        ScrollTo(PaymentMethodConstants.DefaultPaymentText, AccountConstants.IOSSCROLLUP, defaultPaymentMethodButton);
        clickButtonWithOutScroll(CardEditLink);

    }

    @And("^Click on delete Card button$")
    public void clickOnDeleteCardButton() {
        waitFor(3000);
//        ScrollToDeleteCardText.isDisplayed();
        ScrollTo(PaymentMethodConstants.DefaultPaymentText, AccountConstants.IOSSCROLLUP, deleteCardButton);
        clickButtonWithOutScroll(deleteCardButton);
        waitFor(3000);
        Assert.assertTrue(CancelOnDeleteCardPopup.isEnabled());
        clickButtonWithOutScroll(confirmDeleteButton);
        waitFor(3000);
        Assert.assertTrue(DeletedCardSuccessMessage.isDisplayed());
        waitFor(2000);
        clickButtonWithOutScroll(okButton);

    }

    @And("^Click on i icon in the security field$")
    public void clickOnIIconInTheSecurityField() {
        waitFor(3000);
        clickButtonWithOutScroll(iIconInPaymentScreen);
    }

    @Then("^Click on Got it button on popup screen$")
    public void clickOnGotItButtonOnPopupScreen() {
        waitFor(3000);
        clickButtonWithOutScroll(gotItButton);
    }

    @Then("^Click on Choose Default Card link$")
    public void clickOnChooseDefaultCardLink() {
        waitFor(5000);
//        ScrollToAddNectarCardText.isDisplayed();
        ScrollTo(PaymentMethodConstants.DefaultPaymentText, AccountConstants.IOSSCROLLUP, addCardLink);
        waitFor(3000);
        clickButtonWithOutScroll(defaultPaymentMethodButton);
        waitFor(5000);
        clickButtonWithOutScroll(doneButton);
    }

    @When("^Enter \"([^\"]*)\" Login$")
    public void enterLogin(String arg0) throws Throwable {
        waitFor(5000);
        enterTextWithoutScroll(userName, PaymentMethodConstants.userName);
        waitFor(3000);
        enterTextWithoutScroll(password, PaymentMethodConstants.password);
    }

    @And("^Verify that user should be able to add maximum five cards message$")
    public void verifyThatUserShouldBeAbleToAddMaximumFiveCardsMessage() {
        waitFor(3000);
        staticTextValidation(MaxFiveCardMessage, PaymentMethodConstants.AddCardDisabled);
        clickButtonWithOutScroll(okButton);
        waitFor(2000);
        Assert.assertTrue(addCardLink.isDisplayed());
    }
}