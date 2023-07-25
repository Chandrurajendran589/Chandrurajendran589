package stepDefinitions;

import contants.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.InteractsWithApps;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import pages.*;

import java.util.HashMap;
import java.util.Map;

public class PayOutsideSteps extends PayOutsidePage {
    MenuPage MenuPage = new MenuPage();
	OffersPage OffersPage = new OffersPage();
	GuestCheckOutPage GuestCheckOutPage = new GuestCheckOutPage();
    AccountSteps AccountSteps = new AccountSteps();
	FrictionlessFlowPage frictionlessFlowPage = new FrictionlessFlowPage();
	@And("^user login with the username and pwd$")
	public void user_login_with_the_username_and_pwd() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {

			clickButtonWithOutScroll(FFEmail);

			enterTextWithoutScroll(FFEmail, PayOutsideConstants.LoggedEmail);
			enterTextWithoutScroll(FFPassword, PayOutsideConstants.LoggedPassword);
		} else {

			enterTextWithoutScroll(FFEmail, AccountConstants.ACCOUNTEMAIL);
			enterTextWithoutScroll(FFPassword, AccountConstants.ACCOUNTPASSWORD);
		}
	}

	@Then("^user should opt for receipts by email checkbox$")
	public void user_should_opt_for_receipts_by_email_checkbox() throws Throwable {
		
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
		if (platformName.equalsIgnoreCase("android")) {
			if (ReceiptCKbx.getAttribute("checked").equalsIgnoreCase("true")) {
				clickButtonWithOutScroll(ReceiptCKbx);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(ReceiptCKbx);
		} else {
			if (isElementDisplayedWithoutAssert(ReceiptCKbx)) {
				clickButtonWithOutScroll(ReceiptCKbx);
				
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(emailUnCircleCheck_box);
		}
	}

    @When("^the system displays the confirmation popup$")
    public void the_system_displays_the_confirmation_popup() throws Throwable {
        waitFor(2000);
        staticTextValidation(PopUpMessage, PayOutsideConstants.RECEIPTMSG);
    }

    @When("^the system displays the confirmation popup for not receiving mails$")
    public void the_system_displays_the_confirmation_popup_for_not_receiving_mails() throws Throwable {
        waitFor(2000);
        staticTextValidation(PopUpMessage1, PayOutsideConstants.RECEIPTMSGNO);
    }
    @Then("^user taps on fuel icon and start fuelling button$")
    public void user_taps_on_fuel_icon_and_start_fuelling_button() throws Throwable {
        waitForElement(FuelIcon,3);
        clickButtonWithOutScroll(FuelIcon);
        waitForElement(StartFuelIcon,5);
        clickButtonWithOutScroll(StartFuelIcon);
    }

	@Then("^user selects the pump from 'Select your Pump' page and taps on continue button$")
	public void user_selects_the_pump_from_Select_your_Pump_page_and_taps_on_continue_button() throws Throwable {
		waitForElement(PumpContinueBtn,600);
		clickButtonWithOutScroll(PumpContinueBtn);
		if(isElementDisplayedWithoutAssert(ContinueBtn)){
			clickButtonWithOutScroll(ContinueBtn);
		}

	}

	@And("^user confirms the payment$")
	public void userConfirmsThePayment() {
	
		clickButtonWithOutScroll(PayPalButn);
		if (isElementDisplayedWithoutAssert(ReadyCtnBtn)) {
			clickButtonWithOutScroll(ReadyCtnBtn);
		}
	}

	@Then("^user taps on done button after finishing fuelling$")
	public void user_taps_on_done_button_after_fininshing_fuelling() throws Throwable {
		waitFor(5000);
		waitForElement(DoneBtn,600);
		clickButtonWithOutScroll(DoneBtn);

	}

	@Then("^the system should display the authorization screen$")
	public void theSystemShouldDisplayTheAuthorizationScreen() {
		waitForElement(AuthorizeTxt,600);
		staticTextValidation(AuthorizeTxt, PayOutsideConstants.PAYMENTAUTHMSG);

	}

	@Then("^the system should display the loader when authorization is in progress$")
	public void theSystemShouldDisplayTheLoaderWhenAuthorizationIsInProgress() {
		
		Assert.assertTrue(isElementDisplayed(AuthorizeTxtSiteId));
		staticTextValidation(CnfrmLoader, "Please wait");
		staticTextValidation(PleaseWaitBottomCt, PayOutsideConstants.PLEASEWAITBOTTOMCT);
		staticTextValidation(PleaseWaitPumpCt, PayOutsideConstants.PLEASEWAITPUMP);
		staticTextValidation(AuthorizeTxt, PayOutsideConstants.PAYMENTAUTHMSG);
	}

	@When("^user taps on cancel button in the 'Start fuelling now' page$")
	public void userTapsOnCancelButtonInTheStartFuellingNowPage() {
		waitForElement(CancelBttn,600);
		clickButtonWithOutScroll(CancelBttn);

	}

    @Then("^the system displays the cancellation popup$")
    public void theSystemDisplaysTheCancellationPopup() {
        staticTextValidation(CancelPopUpMessage,"Transaction Cancelled");
    }

	@And("^system cancels the transaction and returns to the 'Confirm Payment' Screen$")
	public void systemCancelsTheTransactionAndReturnsToTheConfirmPaymentScreen() {
		
		staticTextValidation(ConfrmPayment, PayOutsideConstants.CONFRMPAYMENT);
	}

	@Then("^user checks the details in the transaction summary screen$")
	public void userChecksTheDetailsInTheTransactionSummaryScreen() {
		waitForElement(DoneBtn,1000);
		Assert.assertTrue(isElementDisplayed(FuelAmount));
		Assert.assertTrue(isElementDisplayed(FuelGrade));
		Assert.assertTrue(isElementDisplayed(FuelQty));
		Assert.assertTrue(isElementDisplayed(DoneBtn));

	}

	@When("^user checks the Transaction Details in the transaction summary screen$")
	public void userChecksTheTransactionDetailsInTheTransactionSummaryScreen() {
		waitForElement(TransDetLink,600);
		clickButtonWithOutScroll(TransDetLink);

	}

	@Then("^the system displays the view link for receipt$")
	public void theSystemDisplaysTheViewLinkForReceipt() {

		waitForElement(ViewLink,600);
		Assert.assertTrue(isElementDisplayed(ViewLink));

	}

	@And("^the user should view the receipt after clicking view in Transaction Details screen$")
	public void theUserShouldViewTheReceiptAfterClickingViewInTransactionDetailsScreen() {
		waitForElement(ViewLink,600);
		clickButtonWithOutScroll(ViewLink);
	}

	@And("^system should display the tutorial screen$")
	public void systemShouldDisplayTheTutorialScreen() {
		waitForElement(TutorialScrn,600);
		clickButtonWithOutScroll(TutorialScrn);
	}

	@And("^system should display the alignment$")
	public void systemShouldDisplayTheAlignment() {
		waitForElement(TutorialAlignment,600);
		Assert.assertTrue(isElementDisplayed(TutorialAlignment));
	}

	@And("^user selects the payment method under 'Select your pump' page$")
	public void userSelectsThePaymentMethodUnderSelectYourPumpPage() {
		waitForElement(PaymentMethod,600);
		
		clickButtonWithOutScroll(PaymentMethod);
	}

	@And("^user adds the Nectar card details by clicking the Add nectar card in Payment details screen$")
	public void userAddsTheNectarCardDetailsByClickingTheAddNectarCardInPaymentDetailsScreen() {
		waitForElement(PaymentAddNectar,600);
		clickButtonWithOutScroll(PaymentAddNectar);

	}

    @And("^user taps on continue button in payment details screen$")
    public void userTapsOnContinueButtonInPaymentDetailsScreen() {

		waitForElement(PaymentContinueBtn,600);
		clickButtonWithOutScroll(PaymentContinueBtn);

	}

	@And("^user verifies the Select your Pump Screen$")
	public void userVerifiesTheSelectYourPumpScreen() {
		waitForElement(PumpContinueBtn,600);
		Assert.assertTrue(isElementDisplayed(MenuPage.BackBtn));
		Assert.assertTrue(isElementDisplayed(QrCodeButtonSelectYourPump));
		Assert.assertTrue(isElementDisplayed(AuthorizeTxtSiteId));
		staticTextValidation(SelectYourPumpHeading, PayOutsideConstants.SELECTYOURPUMPHEADING);
		staticTextValidation(SelectYourPumpSubHeading, PayOutsideConstants.SELECTYOURPUMPSUBHEADING);
		staticTextValidation(SelectYourPumpNo1, PayOutsideConstants.PIN1);
		staticTextValidation(SelectYourPumpNo2, PayOutsideConstants.PIN2);
		staticTextValidation(SelectYourPumpNo3, PayOutsideConstants.PIN3);
		//Assert.assertTrue(isElementDisplayed(MfaLinkSelectYourPump));
		//Assert.assertTrue(isElementDisplayed(MfaInfoSelectYourPump));
		Assert.assertTrue(isElementDisplayed(PaymentMethodLinkSelectYourPump));
		staticTextValidation(PumpContinueBtn, PayOutsideConstants.CONTINUEBUTTONSELECTYOURPUMP);
	}

	@And("^user validate and delete the nectar card in Account screen$")
	public void userValidateAndDeleteTheNectarCardInAccountScreen() throws Throwable {
	
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
		if (isElementDisplayedWithoutAssert(AccountPage.AccountNectarCardAdded)) {
			AccountSteps.nectarDeleteAndVerify();
		}
	}

	@Then("^user verify the payment details screen with Nectar card$")
	public void userVerifyThePaymentDetailsScreenWithNectarCard() {
		staticTextValidation(CancelBttn, PayOutsideConstants.CANCELBUTTONPAYMENTDETAILS);
		staticTextValidation(PaymentDetailsHeading, PayOutsideConstants.PAYMENTDETAILSHEADING);
		staticTextValidation(PaymentMethodHeadingPaymentDetails,
				PayOutsideConstants.PAYMENTDETAILSPAYMENTMETHODHEADING);
		staticTextValidation(EssoNectarHeadingPaymentDetails, PayOutsideConstants.ESSONECTARHEADINGPAYMENTDETAILS);
		staticTextValidation(PumpContinueBtn, PayOutsideConstants.CONTINUEBUTTONSELECTYOURPUMP);
	}

	@Then("^user verify the confirms the payment screen$")
	public void user_verify_the_confirms_the_payment_screen() throws Throwable {

		if(platformName.equalsIgnoreCase("Android")) {
			waitForElement(GuestCheckOutPage.ConfirmPaymentScreenHeader, 6000);
			;
			staticTextValidation(GuestCheckOutPage.ConfirmPaymentScreenHeader, GuestCheckOutConstants.ConfirmPaymentHeader);
			staticTextValidation(GuestCheckOutPage.fuelConfirmSubHeaderText, GuestCheckOutConstants.ConfirmPaymentSubHeader);
			staticTextValidation(GuestCheckOutPage.selectPumpHeaderText, GuestCheckOutConstants.SelectedPumpText);
			staticTextValidation(GuestCheckOutPage.paymentMethodHeaderText, GuestCheckOutConstants.PaymentMethodText);
			staticTextValidation(GuestCheckOutPage.maxFuellingHeaderText, GuestCheckOutConstants.MaxFuellingAmountText);
			staticTextValidation(GuestCheckOutPage.rewardPaymentHeaderText, GuestCheckOutConstants.RewardText);
		}
		else {
			waitForElement(getTextElement("Confirm payment"),5);
			Assert.assertTrue(isElementDisplayed(getTextElement("Confirm payment")));

		}
	}

	@Then("^user taps on continue button$")
	public void user_taps_on_continue_button() throws Throwable {
		if(platformName.equalsIgnoreCase("Android"))
		{
			clickButtonWithOutScroll(ReadyCtnBtn);
		}
		else {
			waitForElement(ContinueBtn, 6);
			clickButtonWithOutScroll(ContinueBtn);
		}
	}

	@And("^verify the Select Your Pump Screen$")
	public void verify_the_select_your_pump_screen() throws Throwable {
		waitForElement(selectpump,6);
		staticTextValidation(selectpump, "Select your pump");
	}

	@And("^user taps on continue button in Select Your Pump Screen$")
	public void user_taps_on_continue_button_in_select_your_pump_screen() throws Throwable {
		waitForElement(ContinueBtn,6);
		clickButtonWithOutScroll(ContinueBtn);
	}

	@And("^user taps on confirms the payment$")
	public void user_taps_on_confirms_the_payment() throws Throwable {
		waitForElement(confirmspayment,600);
		clickButtonWithOutScroll(confirmspayment);
	}

	@Then("^user verify the Authorising your payment screen$")
	public void user_verify_the_authorising_your_payment_screen() throws Throwable {
		waitForElement(Authorisingpayment,600);
		staticTextValidation(Authorisingpayment, "Authorising your payment");
	}

	@Then("^user verify the Start fuelling now screen$")
	public void user_verify_the_start_fuelling_now_screen() throws Throwable {
		
		if (isElementDisplayedWithoutAssert(Startfuelling)) {
            staticTextValidation(Startfuelling, "Start fuelling now");
            Assert.assertTrue(isElementDisplayed(CancelButton));
            Assert.assertTrue(isElementDisplayed(AuthorizeTxtSiteId));
            staticTextValidation(StartfuellingSubheading, "Please start fuelling");
            staticTextValidation(StartfuellingPump, "PUMP");
            staticTextValidation(StartfuellingPumpNumber, "1");
            Assert.assertTrue(isElementDisplayed(StartfuellingCt));
        }

	}

	@Then("^user verify the Transaction Complete screen$")
	public void user_verify_the_transaction_complete_screen() throws Throwable {
		if(platformName.equalsIgnoreCase("Android"))
		{   waitFor(20000);
			staticTextValidation(GuestCheckOutPage.HeaderText, GuestCheckOutConstants.TransactionComplete);
			staticTextValidation(GuestCheckOutPage.SafeTravels, GuestCheckOutConstants.SafeTravelsText);
			staticTextValidation(GuestCheckOutPage.PaymentWasSuccessful, GuestCheckOutConstants.PaymentSuccessful);
			Assert.assertTrue(isElementDisplayed(GuestCheckOutPage.FuelProductName));
			Assert.assertTrue(isElementDisplayed(GuestCheckOutPage.TransactionAmount));
			isElementDisplayed(GuestCheckOutPage.PaymentInfo);
			staticTextValidation(GuestCheckOutPage.TransactionDetailsLinK, GuestCheckOutConstants.TransactionDetailsLinkText);
			staticTextValidation(GuestCheckOutPage.DoneButton, GuestCheckOutConstants.DONE);

		}
		else {
			waitForElement(TransactionCompleteFuelType,20);
			staticTextValidation(TransactionComplete, "Transaction Complete");
			staticTextValidation(TransactionCompleteSafeTravels, "Safe travels!");
			staticTextValidation(TransactionCompleteSuccessfulCt, "Your payment was successful.");
			Assert.assertTrue(isElementDisplayed(TransactionCompleteFuelType));
			Assert.assertTrue(isElementDisplayed(TransactionCompleteQuantity));
			Assert.assertTrue(isElementDisplayed(TransactionCompletePrice));
			staticTextValidation(TransactionCompletePaid, "PAID");
			staticTextValidation(TransactionCompleteDetails, "Transaction Details");
			Assert.assertTrue(isElementDisplayed(DoneBtn));
		}
	}

	@And("^user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen$")
	public void user_adds_the_nectar_card_details_by_clicking_the_add_nectar_card_in_transaction_complete_screen()
			throws Throwable {
		waitForElement(AddNectar,600);
		clickButtonWithOutScroll(AddNectar);
	}

	@Then("^user verify the Transaction Details screen$")
	public void user_verify_the_transaction_details_screen() throws Throwable {
		waitForElement(Transactiondeatils,6);
		staticTextValidation(Transactiondeatils, "Transaction Details");
	}

	@And("^user taps on the Transaction Details screen$")
	public void user_taps_on_the_transaction_details_screen() throws Throwable {
		waitForElement(Transactiondeatils,6);
		clickButtonWithOutScroll(Transactiondeatils);
	}

	@Then("^user verify the Verify your Nectar card to get exclusive Esso rewards$")
	public void user_verify_the_verify_your_nectar_card_to_get_exclusive_esso_rewards() throws Throwable {
		
		staticTextValidation(Verifynectar, "Verify your Nectar card to get exclusive Esso rewards.");

	}

	@Then("^user verify the Verify your Nectar card$")
	public void user_verify_the_verify_your_nectar_card() throws Throwable {
		waitForElement(Verifynectar,600);
		clickButtonWithOutScroll(Verifynectar);
	}

	@And("^user taps on Verify your Nectar card to get exclusive Esso rewards$")
	public void user_taps_on_verify_your_nectar_card_to_get_exclusive_esso_rewards() throws Throwable {
		
		staticTextValidation(Verifynectarmsg, "\"Esso\" would like to open \"nectar.com\" to verify your card.");

	}

	@Then("^user verify the Loyalty discounted for fuelling$")
	public void user_verify_the_loyalty_discounted_for_fuelling() throws Throwable {
		
		staticTextValidation(Nectarpoint, "+10 points");

	}

	@Then("^user tap done in the Transaction Complete screen$")
	public void userTapDoneInTheTransactionCompleteScreen() {
		
		clickButtonWithOutScroll(DoneBtn);
	}

	@And("^user adds a nectar card and taps verify later$")
	public void userAddsANectarCardAndTapsVerifyLater() throws Throwable {
		AccountSteps.nectarAddAndVerify();
	}

	@Then("^user verifies the Verify Nectar card link in the Transaction Complete screen$")
	public void userVerifiesTheVerifyNectarCardLinkInTheTransactionCompleteScreen() {
		staticTextValidation(VerifyNectarLinkTransactionComplete,
				"Verify your Nectar card to get exclusive Esso rewards.");
	}
	
	@Then("^verify below are the elements$")
	public void verify_below_are_the_elements(DataTable arg1) throws Throwable {
		waitForElement(changepayment,600);
		Assert.assertTrue(isTextMatch(MaximumFueling.getText(), PayOutsideConstants.Fuelingamt));
		Assert.assertTrue(isTextMatch(changepayment.getText(), PayOutsideConstants.ChangePay));
		
	}

	@Then("^user verifies the Transaction Details screen from Transaction complete screen$")
	public void userVerifiesTheTransactionDetailsScreenFromTransactionCompleteScreen() {
		Assert.assertTrue(isElementDisplayed(MenuPage.BackBtn));
		staticTextValidation(TransactionDetailsHeading, "Transaction Details");
		Assert.assertTrue(isElementDisplayed(TransactionDetailsAddress));
		Assert.assertTrue(isElementDisplayed(TransactionDetailsTime));
		Assert.assertTrue(isElementDisplayed(TransactionDetailsRateWithoutPoints));
		Assert.assertTrue(isElementDisplayed(TransactionDetailsFuelTypeWithoutPoints));
		Assert.assertTrue(isElementDisplayed(TransactionDetailsPriceWithoutPoints));
		staticTextValidation(TransactionCompletePaid, "PAID");
		staticTextValidation(TransactionDetailsVat, "VAT Receipt");
		staticTextValidation(TransactionDetailsView, "View");
		staticTextValidation(TransactionDetailsAddNote, "+ Add Note");
	}

	@When("^user taps on \"([^\"]*)\" button from confirm payment screen$")
	public void userTapsOnButtonFromConfirmPaymentScreen(String arg0) throws Throwable {

		if(platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(PayPalButn);
		}
		else {
			waitForElement(getButtonElement("PayPal"),4);
			clickButtonWithOutScroll(getButtonElement("PayPal"));
		}
	}

	@Then("^user select the PayPal in payment screen$")
	public void userSelectThePayPalInPaymentScreen() {
		waitFor(3000);
		clickButtonWithOutScroll(OffersPage.ChangePayment);
		if(paymentMethodPayPal.isEmpty()) {
			clickButtonWithOutScroll(PayPal);
			clickButtonWithOutScroll(PaymentContinueBtn);
		}
	}

	@When("^user taps on Transaction Details Link in the Transaction Complete Screen$")
	public void userTapsOnTransactionDetailsLinkInTheTransactionCompleteScreen() {
		waitForElement(Transactiondeatils,5);
		clickButtonWithOutScroll(Transactiondeatils);
	}

	@And("^validate the details in the Transaction Details screen$")
	public void validateTheDetailsInTheTransactionDetailsScreen() {
		staticTextValidation(Transactiondeatils, "Transaction Details");
		staticTextValidation(TransactionCompletePaid, "PAID");
//		staticTextValidation(TransactionCompleteDetails, "Transaction Details");
	}

//	@When("^user tap on back button in the transaction Details screen$")
//	public void userTapOnBackButtonInTheTransactionDetailsScreen() {
//		androidBack();
//	}

	@When("^user tap on add note’s in transaction details screen$")
	public void userTapOnAddNoteSInTransactionDetailsScreen() {
		clickButtonWithOutScroll(getTextElement("Add Note"));
	}

	@Then("^verify if the user is navigated to the Transaction Complete Screen$")
	public void verifyIfTheUserIsNavigatedToTheTransactionCompleteScreen() {
		if(platformName.equalsIgnoreCase("Android"))
		{
			staticTextValidation(GuestCheckOutPage.HeaderText, GuestCheckOutConstants.TransactionComplete);
		}
		else {
			waitForElement(getTextContainsElement("Transaction Complete"), 5);
			staticTextValidation(TransactionComplete, "Transaction Complete");
		}
	}

	@Then("^user verifies is Navigated to Thank you Screen$")
	public void userVerifiesIsNavigatedToThankYouScreen() {
		if(platformName.equalsIgnoreCase("Android"))
		{
			staticTextValidation(GuestCheckOutPage.Thankyou, GuestCheckOutConstants.Thankyou);
		}
		else {
			waitForElement(frictionlessFlowPage.thankYouHeader, 15);
			Assert.assertTrue(isElementDisplayed(frictionlessFlowPage.thankYouHeader));
		}
	}

	@Then("^user verifies the Thank you screen$")
	public void userVerifiesTheThankYouScreen() {
		Assert.assertTrue(isElementDisplayed(frictionlessFlowPage.thankYouHeader));
	}

	@And("^user taps on \"([^\"]*)\" button in Allow Location screen$")
	public void userTapsOnButtonInAllowLocationScreen(String arg0) throws Throwable {
		waitFor(4000);
		if(!MenuPage.AllowLocationScreen.isEmpty()){
			clickButtonWithOutScroll(MenuPage.AllowLocContinueButton);
			waitForElement(MenuPage.WhileusingButtonDeviceSettings,4);
			clickButtonWithOutScroll(MenuPage.WhileusingButtonDeviceSettings);
		}
	}

	@When("^user taps on pump continue button$")
	public void userTapsOnPumpContinueButton() {
	}
}