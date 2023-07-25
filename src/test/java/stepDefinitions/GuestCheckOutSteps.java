package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;
//import sun.jvm.hotspot.runtime.StaticBaseConstructor;

import contants.AccountConstants;
import contants.COFChallangeFlowConstants;
import contants.PaymentMethodConstants;
import cucumber.api.PendingException;
import org.junit.Assert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import contants.GuestCheckOutConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import pages.*;
import stepLibrary.GenericWrappers;

public class GuestCheckOutSteps extends GuestCheckOutPage {
    AccountPage AccountPage = new AccountPage();
    FrictionlessFlowPage FrictionlessFlowPage = new FrictionlessFlowPage();
    GenericWrappers GenWrapper= new GenericWrappers();
    OffersPage OffersPage=new OffersPage();


    @Then("^Tap on FUEL AS GUEST  Button in the NLID$")
    public void tap_on_fuel_as_guest_button_in_the_nlid() throws Throwable {
        waitForElement(FuelAsGuest,10);
        clickButtonWithOutScroll(FuelAsGuest);
    }

    @Then("^verify user is able to view Terms and Condition Screen$")
    public void verify_user_is_able_to_view_terms_and_condition_screen() throws Throwable {
        waitFor(4000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(HeaderText, GuestCheckOutConstants.TermsAndConditions);
            waitFor(2000);
            staticTextValidation(YourprivacyisImportant, GuestCheckOutConstants.YourPrivacyisImportant);
            waitFor(2000);
            //staticTextValidation(PleaseAcceptTermsandConditions, GuestCheckOutConstants.PleaseAcceptTCtext);
            waitFor(2000);
            staticTextValidation(AccepttermsandConditions, GuestCheckOutConstants.Accept_TC_Text);
        }
        else {
            staticTextValidation(HeaderText, GuestCheckOutConstants.TermsAndConditions);
            waitFor(2000);
            staticTextValidation(YourprivacyisImportant, GuestCheckOutConstants.YourPrivacyisImportant);
            waitFor(2000);
            staticTextValidation(PleaseAcceptTermsandConditions, GuestCheckOutConstants.PleaseAcceptTCtext);
            waitFor(2000);
            staticTextValidation(AccepttermsandConditions, GuestCheckOutConstants.Accept_TC_Text);
        }
    }

    @Then("^user should opt out Verify the Terms and condition checkbox$")
    public void user_should_opt_out_verify_the_terms_and_condition_checkbox() throws Throwable {
        waitForElement(PrivacyAndTermsCheckBox,8);
        clickButtonWithOutScroll(PrivacyAndTermsCheckBox);

    }

    @And("^Tap on continue button$")
    public void tap_on_continue_button() throws Throwable {
        waitForElement(ContinueButtonInFuelAsGuest,20);
        clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
    }

    @And("^Tap the continue button in the Allow location screen$")
    public void tap_the_continue_button_in_the_allow_location_screen() throws Throwable {
        clickButtonWithOutScroll(LocationContinueButton);
    }

    @Then("^Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin$")
    public void verify_whether_the_user_is_able_to_view_the_select_your_pump_screen_for_a_valid_mobile_pay_site_checkin() throws Throwable {
        waitFor(3000);
        if (isElementDisplayedWithoutAssert(LocationContinueButton)) {
            clickButtonWithOutScroll(LocationContinueButton);
            waitFor(1000);
            driver.switchTo().alert().accept();
            waitFor(4000);
            staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
        } else if (isElementDisplayedWithoutAssert(SelectYourPump)) {
            waitFor(2000);
            if(platformName.equalsIgnoreCase("Android"))
            {
                staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
            }
            else {
                staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
                clickButtonWithOutScroll(SelectPump2);
            }

        }

    }

    @Then("^Verify whether the user is able to view the location permission popup$")
    public void verify_whether_the_user_is_able_to_view_the_location_permission_popup() throws Throwable {
        waitFor(5000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        //String locTxt=driver.switchTo().alert().getText();
		/*if(locTxt.equals(GuestCheckOutConstants.LocationPermissionMessage))
		{
			logger.info("Expected text and actual text are same");
					logger.info("Static Text - Actual: " + locTxt);
			logger.info("Static Text - Expected: " + GuestCheckOutConstants.LocationPermissionMessage);

		}*/
        //isElementDisplayed(LocationPermissionDetailedMessage);
        //staticTextValidation(AllowLocationWhileUsingTheApp,GuestCheckOutConstants.While_Using_this_App);

    }

    @And("^Tap on Deny button$")
    public void tap_on_deny_button() throws Throwable {
        driver.switchTo().alert().dismiss();
    }

    @Then("^Verify user is navigated to Scan QR Code screen$")
    public void verify_user_is_navigated_to_scan_qr_code_screen() throws Throwable {
        staticTextValidation(ScanQRCode, GuestCheckOutConstants.Scan_QR_Code);
    }

    @Then("^Verify user is navigated to Scan QR Code screen when you deny the location$")
    public void verify_user_is_navigated_to_scan_qr_code_screen_when_you_deny_the_location() throws Throwable {

        waitFor(3000);
        if (isElementDisplayedWithoutAssert(LocationContinueButton)) {
            clickButtonWithOutScroll(LocationContinueButton);
            waitFor(1000);
            driver.switchTo().alert().dismiss();
            waitFor(4000);
            staticTextValidation(ScanQRCode, GuestCheckOutConstants.Scan_QR_Code);
        } else if (isElementDisplayedWithoutAssert(SelectYourPump)) {
            //waitFor(2000);
            //boolean b=isTextMatch(selectyourpump, GuestCheckOutConstants.SelectYourPumpText);
            //String selectyourpump=SelectYourPump.getText();
            staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
        }
    }

    @And("^Tap on turn on location link$")
    public void tap_on_turn_on_location_link() throws Throwable {
        clickButtonWithOutScroll(TurnonLocationLink);
    }

    @And("^Tap on Allow Location$")
    public void tap_on_allow_location() throws Throwable {
        driver.switchTo().alert().accept();
    }

    @And("^Tap on Confirm Button$")
    public void tap_on_confirm_button() throws Throwable {
        waitForElement(ConfirmButton,20);
        clickButtonWithOutScroll(ConfirmButton);
    }

    @Then("^Tap on Add Debit or Credit card details$")
    public void tap_on_add_debit_or_credit_card() throws Throwable {
        clickButtonWithOutScroll(AddDebitOrCrecitcardButton);
    }

    @Then("^Add Card Details$")
    public void add_card_details() throws Throwable {
        waitFor(5000);
        if(platformName.equalsIgnoreCase("Android"))
        {  enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
            enterTextWithoutScroll(CardNumber, GuestCheckOutConstants.cardNumber);
            clickButtonWithOutScroll(ExpiryDate);
            clickButtonWithOutScroll(AccountPage.okBtn);
            waitFor(3000);
            enterTextWithoutScroll(SecurityCodeCVV, GuestCheckOutConstants.cardSecuritycode);
            hideMobileKeyboard();
            enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
            hideMobileKeyboard();
            enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
            hideMobileKeyboard();
            enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
            hideMobileKeyboard();
            enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
            hideMobileKeyboard();
        }
        else {
            enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
            enterTextWithoutScroll(CardNumber, GuestCheckOutConstants.cardNumber);
            enterTextWithoutScroll(ExpiryDate, GuestCheckOutConstants.cardExpDate);
            waitFor(3000);
            enterTextWithoutScroll(SecurityCodeCVV, GuestCheckOutConstants.cardSecuritycode);
            hideMobileKeyboard();
            enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
            hideMobileKeyboard();
            enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
            hideMobileKeyboard();
            enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
            hideMobileKeyboard();
            enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
            hideMobileKeyboard();
        }
    }

    @Then("^Tap on done button$")
    public void tap_on_done_button() throws Throwable {
        clickButtonWithOutScroll(DoneButton);
    }

    @Then("^Tap on continue button in how to fuel screen$")
    public void tap_on_continue_button_in_how_to_fuel_screen() throws Throwable {
        waitFor(10000);
        if(HowToFuelContinueButton.isDisplayed()) {
            clickButtonWithOutScroll(HowToFuelContinueButton);
        }else{
            System.out.println("User did not get continue or Ready for feulling screen");
        }
    }

    @Then("^User should be able to view start fueling screen with all the mandatory fields and images as expected$")
    public void user_should_be_able_to_view_start_fueling_screen_with_all_the_mandatory_fields_and_images_as_expected() throws Throwable {

        if (isElementDisplayedWithoutAssert(AuthorisingYourPayment)) {
            Thread.sleep(8000);
            staticTextValidation(StartFuelingNow, GuestCheckOutConstants.Start_Fuelling_Now);
        } else if (isElementDisplayedWithoutAssert(StartFuelingNow)) {
            staticTextValidation(StartFuelingNow, GuestCheckOutConstants.Start_Fuelling_Now);

        } else if (isElementDisplayedWithoutAssert(NowFueling)) {
            Thread.sleep(5000);
            staticTextValidation(NowFueling, GuestCheckOutConstants.NowFueling);
        }
    }

    @Then("^Verify whether the user is navigated to transaction complete screen after fueling completed successfully$")
    public void verify_whether_the_user_is_navigated_to_transaction_complete_screen_after_fueling_completed_successfully() throws Throwable {
        waitFor(5000);
        staticTextValidation(TransactionCompleteHeader, GuestCheckOutConstants.TransactionComplete);
    }

    @Then("^Tap on Payment Confirmation done button $")
    public void tap_on_payment_confirmation_done_button() throws Throwable {
        clickButtonWithOutScroll(PaymentConfirmationDone);
    }

    @Then("^Tap on Send my Reciept button with the checkbox checked$")
    public void tap_on_send_my_reciept_button_with_the_checkbox_checked() throws Throwable {
        enterTextWithoutClick(EmailIDforSendReport, GuestCheckOutConstants.EmailId);
        hideMobileKeyboard();
        clickButtonWithOutScroll(SendingRecieptChceckBox);
        clickButtonWithOutScroll(SendMeTheReciept);
    }



    @Then("^Verify user should see all the mandatory details in Thank You screen$")
    public void verify_user_should_see_all_the_mandatory_details_in_thank_you_screen() throws Throwable {
        waitFor(5000);
        isElementDisplayed(EssoLogo);
        staticTextValidation(Thankyou, GuestCheckOutConstants.Thankyou);
        isElementDisplayed(DontmissLoyaltyPoint);
        staticTextValidation(DontmissLoyaltyPoint.getText().substring(5, DontmissLoyaltyPoint.getText().length()), GuestCheckOutConstants.DontmissloyalltypointText.substring(5, GuestCheckOutConstants.DontmissloyalltypointText.length()));
        //staticTextValidation(ThankYouDescBottomView, GuestCheckOutConstants.ThankYouDescBottomViewText);
        isElementDisplayed(ThankYouDescBottomView);
        staticTextValidation(RemindLaterTextView, GuestCheckOutConstants.RemindLaterText);
        staticTextValidation(RegisterNowButton, GuestCheckOutConstants.RegisterNowText);

    }
    @When("^Tap on Remind later link$")
    public void tap_on_remind_later_link() throws Throwable {
        clickButtonWithOutScroll(RemindLaterTextView);
    }

    @And("^Tap on Close Button$")
    public void tap_on_close_button() throws Throwable {
        clickButtonWithOutScroll(CloseButton);
    }

    @Then("^Verify user should navigate the NLID screen$")
    public void verify_user_should_navigate_the_nlid_screen() throws Throwable {
        isElementDisplayedWithoutAssert(FuelAsGuest);
    }

    @Then("^Verify user should see the prompt with message displayed as Receipt Sent Successfully$")
    public void verify_user_should_see_the_prompt_with_message_displayed_as_receipt_sent_successfully() throws Throwable {
        waitFor(5000);
        staticTextValidation(RecieptSentSuccessfully, GuestCheckOutConstants.RecieptSentSuccessfullyText);

    }

    @Then("^Verify  all the fields and elements in the Transaction complete screen are available$")
    public void verify_all_the_fields_and_elements_in_the_transaction_complete_screen_are_available() throws Throwable {
        if (isElementDisplayedWithoutAssert(NowFueling)) {
            waitFor(30000);
            staticTextValidation(HeaderText, GuestCheckOutConstants.TransactionComplete);
            staticTextValidation(SafeTravels, GuestCheckOutConstants.SafeTravelsText);
            staticTextValidation(PaymentWasSuccessful, GuestCheckOutConstants.PaymentSuccessful);
            staticTextValidation(FuelProductName, GuestCheckOutConstants.FuelProductNameText);
            staticTextValidation(TransactionAmount, GuestCheckOutConstants.TransactionAmountValue);
            isElementDisplayed(PaymentInfo);
            staticTextValidation(TransactionDetailsLinK, GuestCheckOutConstants.TransactionDetailsLinkText);
            staticTextValidation(DoneButton, GuestCheckOutConstants.DONE);
        } else if (isElementDisplayedWithoutAssert(TransactionComplete)) {
            waitFor(5000);
            staticTextValidation(HeaderText, GuestCheckOutConstants.TransactionComplete);
            staticTextValidation(SafeTravels, GuestCheckOutConstants.SafeTravelsText);
            staticTextValidation(PaymentWasSuccessful, GuestCheckOutConstants.PaymentSuccessful);
            staticTextValidation(FuelProductName, GuestCheckOutConstants.FuelProductNameText);
            staticTextValidation(TransactionAmount, GuestCheckOutConstants.TransactionAmountValue);
            isElementDisplayed(PaymentInfo);
            staticTextValidation(TransactionDetailsLinK, GuestCheckOutConstants.TransactionDetailsLinkText);
            staticTextValidation(DoneButton, GuestCheckOutConstants.DONE);
        }
    }

//    @When("^Tap on Transaction Details link in Transaction Complete Screen$")
//    public void tap_on_transaction_details_link_in_transaction_complete_screen() throws Throwable {
//        clickButtonWithOutScroll(TransactionDetailsLinK);
//    }

    @And("^Tap on cancel button$")
    public void tap_on_cancel_button() throws Throwable {
        clickButtonWithOutScroll(CloseButton);
    }

    @And("^Tap on the back button in navigation panel$")
    public void tap_on_the_back_button_in_navigation_panel() throws Throwable {
        androidBack();
    }

    @Then("^verify whether user is navigated back to NLID screen$")
    public void verify_whether_user_is_navigated_back_to_nlid_screen() throws Throwable {
        isElementDisplayed(EssoLogoimg);
    }

    @Then("^Verify user is able to view the copy text appears in the popup for not selecting the checkbox for accepting PP and TC$")
    public void verify_user_is_able_to_view_the_copy_text_appears_in_the_popup_for_not_selecting_the_checkbox_for_accepting_pp_and_tc() throws Throwable {
        staticTextValidation(RecieptSentSuccessfully, GuestCheckOutConstants.Privacy_Policy_TCError);
    }

    @Then("^Verify user is not navigated to other screens when the prompt is active in front screen$")
    public void verify_user_is_not_navigated_to_other_screens_when_the_prompt_is_active_in_front_screen() throws Throwable {
        staticTextValidation(RecieptSentSuccessfully, GuestCheckOutConstants.Privacy_Policy_TCError);
    }

    @Then("^Check whether user is able to navigate to the Allow Location screen from the terms and condition screen$")
    public void check_whether_user_is_able_to_navigate_to_the_allow_location_screen_from_the_terms_and_condition_screen() throws Throwable {
        staticTextValidation(TransactionComplete, GuestCheckOutConstants.AllowLocation);
    }

    @Then("^Veriy the user is able to view the location permission screen with all expected elements$")
    public void veriyTheUserIsAbleToViewTheLocationPermissionScreenWithAllExpectedElements() {
        if (isElementDisplayedWithoutAssert(LocationContinueButton)) {
            staticTextValidation(TransactionComplete, GuestCheckOutConstants.AllowLocation);
            staticTextValidation(LocateYourStation, GuestCheckOutConstants.LocateYourStation);
            staticTextValidation(LocateYourStation_SubTitle, GuestCheckOutConstants.LocateYourStation_SubTitle);
        } else {
            waitFor(2000);
            staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
        }

    }

    @Then("^Veriy the user is able to view the Select your pump screen with all expected elements$")
    public void veriy_the_user_is_able_to_view_the_select_your_pump_screen_with_all_expected_elements() throws Throwable {
        isElementDisplayed(HeaderBackButton);
        staticTextValidation(SelectPumpScreenHeader, GuestCheckOutConstants.IFSCSiteNumber);
        staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
        staticTextValidation(PumpSelectionmessage, GuestCheckOutConstants.Pump_Selection_Message);
        staticTextValidation(Pump_Number, GuestCheckOutConstants.Pump_Number);
        staticTextValidation(Selectedamount, GuestCheckOutConstants.Maximum_FuelAmount);

    }

    @Then("^Verify whether the user is able to view the Maximum Fueling Amount as 100 in your pump$")
    public void verify_whether_the_user_is_able_to_view_the_maximum_fueling_amount_as_100_in_your_pump() throws Throwable {
        staticTextValidation(Selectedamount, GuestCheckOutConstants.Maximum_FuelAmount);
    }

    @And("^Tap on Maximum Fueling Amount$")
    public void tap_on_maximum_fueling_amount() throws Throwable {
        clickButtonWithOutScroll(Selectedamount);
    }

    @Then("^Verify App displays the Maximum Fuelling Amount picker with the range from 5 to 140$")
    public void verify_app_displays_the_maximum_fuelling_amount_picker_with_the_range_from_5_to_140() throws Throwable {
        waitFor(6000);
        //ScrollTo(GuestCheckOutConstants.pickerRange5, AccountConstants.IOSSCROLLUP, Picker);
        //List<MobileElement> MaximumFuelingAmtPicker = (List<MobileElement>) driver.findElementsById("picker");

        //List<MobileElement> allCheckBoxes;
        //allCheckBoxes = driver.findElementsByXPath("//android.view.View[@content-desc=\"test_number_picker_view\"]");

        //for (MobileElement mobileElement : allCheckBoxes) {
        //	System.out.println(mobileElement.getText());
        //}
        //String str=MaximumFuelingAmtPicker.get(0).getText();

    }

    @And("^Update the amount in the picker by scrolling$")
    public void update_the_amount_in_the_picker_by_scrolling() throws Throwable {
        clickButtonWithOutScroll(Picker);
        SetMaximumFuellingAmount.isDisplayed();
        clickButtonWithOutScroll(MaximumFuellingOkButton);
    }
//    @And("^Scroll the picker and set the maximum fuelling amount$")
//    public void scroll_the_picker_and_set_the_maximum_fuelling_amount() throws Throwable {
//        SetMaximumFuellingAmount.isDisplayed();
//
//    }

    @When("^Tap on More button$")
    public void tap_on_more_button() throws Throwable {
        clickButtonWithOutScroll(More);
    }

    @And("^Tap on Account$")
    public void tap_on_account() throws Throwable {
        clickButtonWithOutScroll(AccountPage.AccountBtn);
    }

    @Then("^Verify The user should see the Terms and conditions document with the heading Terms and Conditions$")
    public void verify_the_user_should_see_the_terms_and_conditions_document_with_the_heading_terms_and_conditions() throws Throwable {
        waitFor(4000);
        staticTextValidation(HeaderText, GuestCheckOutConstants.TermsAndConditions);
    }

    @And("^Tap on Terms And Conditons link$")
    public void tap_on_terms_and_conditons_link() throws Throwable {
        waitFor(4000);
        clickButtonWithOutScroll(TermsAndConditions);
    }


    @Then("^Verify the popup message to login into app for seeing the feature$")
    public void verify_the_popup_message_to_login_into_app_for_seeing_the_feature() throws Throwable {

        staticTextValidation(RecieptSentSuccessfully, GuestCheckOutConstants.Account_message);
    }

    @Then("^Verify the user should see the Privacy Policy document with the heading Privacy Policy$")
    public void verify_the_user_should_see_the_privacy_policy_document_with_the_heading_privacy_policy() throws Throwable {

        staticTextValidation(TransactionComplete, GuestCheckOutConstants.Privacy_Policy);
    }

    @And("^Tap on Privacy Policy link$")
    public void tap_on_privacy_policy_link() throws Throwable {
        clickButtonWithOutScroll(PrivacyPolicy);

    }

    @And("^Tap on Done button with scroll$")
    public void tap_on_done_button_with_scroll() throws Throwable {
        if(platformName.equalsIgnoreCase("Android"))
        {
            Done.isDisplayed();
            clickButtonWithOutScroll(DoneButton);
        }
        else {
            ScrollTo(GuestCheckOutConstants.DONE, AccountConstants.IOSSCROLLUP, DoneButton);
            clickButtonWithOutScroll(DoneButton);
        }
    }

    @Then("^Verify user is navigated to Add Payment Method screen$")
    public void verify_user_is_navigated_to_add_payment_method_screen() throws Throwable {
        staticTextValidation(TransactionComplete, GuestCheckOutConstants.Add_Payment_Method);
    }

    @Then("^Verify user is navigated to Add Debit or Credit card screen$")
    public void verify_user_is_navigated_to_add_debit_or_credit_card_screen() throws Throwable {
        waitForElement(AddDebitCreditCardHeader,6);
        staticTextValidation(AddDebitCreditCardHeader, GuestCheckOutConstants.Add_Debit_Credit_Card);
    }
    @And("^Tap on Cancel button in Add Debit or Credit card screen$")
    public void tap_on_cancel_button_in_add_debit_or_credit_card_screen() throws Throwable {
        waitForElement(Cancel,6);
        clickButtonWithOutScroll(Cancel);
    }
    @Then("^Verify the Add Debit or Credit card screen$")
    public void verify_the_add_debit_or_credit_card_screen() throws Throwable {
        if(platformName.equalsIgnoreCase("Android")){
            staticTextValidation(ScanYourCard, GuestCheckOutConstants.Scan_Your_Card);
            staticTextValidation(BillingDetails, GuestCheckOutConstants.Billing_Details);
            staticTextValidation(Cancel, GuestCheckOutConstants.Cancel);
            Done.isDisplayed();
            staticTextValidation(DoneButton, GuestCheckOutConstants.DONE);
        }
        else {
            staticTextValidation(ScanYourCard, GuestCheckOutConstants.Scan_Your_Card);
            staticTextValidation(BillingDetails, GuestCheckOutConstants.Billing_Details);
            staticTextValidation(Cancel, GuestCheckOutConstants.Cancel);
        }
    }
    @Then("^Verify the inline error message for Name On Card$")
    public void verify_the_inline_error_message_for_name_on_card() throws Throwable {
        staticTextValidation(InlineErrorNameOnCard,GuestCheckOutConstants.InLIneError_Name_On_Card);
    }
    @And("^enter name on the card$")
    public void enter_name_on_the_card() throws Throwable {
        waitForElement(NameOnCard,8);
        enterTextWithoutScroll(NameOnCard, GuestCheckOutConstants.NameOncard);
    }
    @Then("^Verify the inline error message for Card Number$")
    public void verify_the_inline_error_message_for_card_number() throws Throwable {
        staticTextValidation(InlineErrorCardNumber,GuestCheckOutConstants.InLIneError_Card_Number);
    }
    @And("^enter Card Number$")
    public void enter_card_number() throws Throwable {
        enterTextWithoutScroll(CardNumber, GuestCheckOutConstants.cardNumber);
    }
    @Then("^Verify the inline error message for Expiry Date$")
    public void verify_the_inline_error_message_for_expiry_date() throws Throwable {
        staticTextValidation(InlineErrorExpiryDate,GuestCheckOutConstants.InLIneError_ExpiryDate);
    }
    @And("^enter Expiry Date$")
    public void enter_expiry_date() throws Throwable {
        if(platformName.equalsIgnoreCase("Android"))
        {
            clickButtonWithOutScroll(ExpiryDate);
            waitFor(3000);
            clickButtonWithOutScroll(AccountPage.okBtn);
        }
        else {
            waitFor(1000);
            enterTextWithoutClick(FrictionlessFlowPage.ExpDate, COFChallangeFlowConstants.EXPDATE);
        }


    }
    @Then("^Verify the inline error message for Security Code$")
    public void verify_the_inline_error_message_for_security_code() throws Throwable {
        staticTextValidation(InlineErrorSecurityCode,GuestCheckOutConstants.InLIneError_Securuty_Code);
    }
    @And("^enter Security Code$")
    public void enter_security_code() throws Throwable {
        waitFor(3000);
        enterTextWithoutScroll(SecurityCodeCVV, GuestCheckOutConstants.cardSecuritycode);
        hideMobileKeyboard();
    }
    @Then("^Verify Billing Details$")
    public void verify_biling_details() throws Throwable {
        staticTextValidation(BillingDetails,GuestCheckOutConstants.Billing_Details);
    }
    @And("^Tap on Billing info icon$")
    public void tap_on_billing_info_icon() throws Throwable {
        clickButtonWithOutScroll(BillingInfoiIcon);
    }
    @Then("^Verify the Billing pop up$")
    public void verify_the_billing_pop_up() throws Throwable {
        staticTextValidation(BillingMessage,GuestCheckOutConstants.Billing_Details_Message);
    }
    @Then("^Verify inline error message for post code$")
    public void verify_inline_error_message_for_post_code() throws Throwable {
        waitFor(4000);
        hideMobileKeyboard();
        staticTextValidation(InlineErrorPostCode,GuestCheckOutConstants.InLIneError_PostCode);
    }
    @And("^enter the postcode$")
    public void enter_the_postcode() throws Throwable {
        enterTextWithoutScroll(PostCode, GuestCheckOutConstants.billpostcode);
    }
    @Then("^Verify search icon is present$")
    public void verify_search_icon_is_present() throws Throwable {
        isElementDisplayed(SearchIcon);
    }
    @Then("^Verify inline error message for Address1$")
    public void verify_inline_error_message_for_address1() throws Throwable {
        staticTextValidation(InlineErrorAddress1,GuestCheckOutConstants.InLIneError_Address1);
    }
    @And("^enter data in Address1$")
    public void enter_data_in_address1() throws Throwable {
        hideMobileKeyboard();
        enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
    }
    @And("^enter data in Address2$")
    public void enter_data_in_address2() throws Throwable {
        hideMobileKeyboard();
        enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
    }
    @Then("^Verify the inline error message for city$")
    public void verify_the_inline_error_message_for_city() throws Throwable {
        staticTextValidation(InlineErrorCity,GuestCheckOutConstants.InLIneError_City);
    }
    @And("^Enter city$")
    public void enter_city() throws Throwable {
        hideMobileKeyboard();
        enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
    }
    @And("^tap on Ok Button$")
    public void tap_on_ok_button() throws Throwable {
        waitFor(3000);
        clickButtonWithOutScroll(AccountPage.okBtn);
    }
    @And("^tap on search icon$")
    public void tap_on_search_icon() throws Throwable {
        clickButtonWithOutScroll(SearchIcon);
    }
    @Then("^verify user is navigated to postcode lookup screen$")
    public void verify_user_is_navigated_to_postcode_lookup_screen() throws Throwable {
        waitFor(4000);
        staticTextValidation(HeaderText,GuestCheckOutConstants.PostCode_Lookup);
    }
    @And("^validate the fields displayed in the screen are as expected$")
    public void validate_the_fields_displayed_in_the_screen_are_as_expected() throws Throwable {
        staticTextValidation(HeaderRightText,GuestCheckOutConstants.Select);
        isElementDisplayed(AccountPage.BackBtn);
        isElementDisplayed(Address_SearchIcon);
        isElementDisplayed(ClearSearch);
    }
    @And("^tap on clear search$")
    public void tap_on_clear_search() throws Throwable {
        clickButtonWithOutScroll(ClearSearch);
    }
    @And("^enter the postcode after clearing the search text$")
    public void enter_the_postcode_after_clearing_the_search_text() throws Throwable {
        waitFor(2000);
        enterTextWithoutClick(SearchEditText,GuestCheckOutConstants.billpostcode);
    }
    @Then("^user selects a postcode from the list$")
    public void user_selects_a_postcode_from_the_list() throws Throwable {
//        SelectAddreess.isDisplayed();
        waitFor(4000);
        clickButtonWithOutScroll(SelectAddreess);
    }
    @And("^tap on select$")
    public void tap_on_select() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(HeaderRightText);
        waitFor(2000);
        hideMobileKeyboard();
    }
    @Then("^Verify whether the user is navigated to Ready to Start fuelling Screen$")
    public void verify_Whether_the_user_is_navigated_to_ready_to_start_fuelling_screen() {
        waitFor(3000);
        staticTextValidation(ReadyToDStartFuelling,GuestCheckOutConstants.Ready_ToStart_Fuelling);
    }

    @And("^Verify user is navigated to the Start fuelling screen$")
    public void verify_user_is_navigated_to_the_start_fueling_screen() throws Throwable {
        waitForElement(StartFuelingNow,10);
        staticTextValidation(StartFuelingNow, GuestCheckOutConstants.Start_Fuelling_Now);
    }

    @And("^Select terms and Condition chek box$")
    public void selectTermsAndConditionChekBox() {
        clickButtonWithOutScroll(PrivacyAndTermsCheckBox);
    }
    @Then("^Verify Sorry there was a connectivity issue while updating your details Please try again message should be displayed$")
    public void verifyMessageShouldBeDisplayed(String arg0) throws Throwable {
        staticTextValidation(networkSorryMessage,GuestCheckOutConstants.ServerErrorMessageText);
    }

    @When("^Enter \"([^\"]*)\" Login to ESSO$")
    public void enterLoginToESSO(String arg0) throws Throwable {
        waitFor(5000);
        clickButtonWithOutScroll(userName);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
        }
        enterTextWithoutScroll(userName, GuestCheckOutConstants.UN1);
        waitFor(3000);
        enterTextWithoutScroll(password, GuestCheckOutConstants.PWD1);
    }

    @And("^Click on start fuel button in LID$")
    public void clickOnStartFuelButtonInLID() {
        waitForElement(StartFuelButton,10);
        clickButtonWithOutScroll(StartFuelButton);

    }

    @Then("^user navigated to select pump screen$")
    public void userNavigatedToSelectPumpScreen() {
        if (isElementDisplayedWithoutAssert(LocationContinueButton)) {
            clickButtonWithOutScroll(LocationContinueButton);
            waitFor(1000);
            driver.switchTo().alert().accept();
            waitFor(4000);
            staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectYourPumpText);
            Assert.assertTrue(SelectPumpContinueButton.isEnabled());
        }
        else {
            staticTextValidation(SelectYourPump, GuestCheckOutConstants.SelectPump);
            Assert.assertTrue(SelectPumpContinueButton.isEnabled());
        }

    }

    @And("^Verify user doesn't navigate to LID untill five minutes$")
    public void verifyUserDoesnTNavigateToLIDUntillFiveMinutes() {
        waitFor(278000);
        Assert.assertTrue(SelectPumpContinueButton.isEnabled());
//        Assert.assertFalse(StartFuelButton.isEnabled());

    }

    @And("^Click on Payment method link$")
    public void clickOnPaymentMethodLink() {
        waitFor(5000);
        clickButtonWithOutScroll(changePaymentMethod);
    }

    @Then("^Verify Payment details screen$")
    public void verifyPaymentDetailsScreen() {
        staticTextValidation(paymentDetailsHeader,GuestCheckOutConstants.PaymentDetailsHeader);
    }

    @Then("^Verify user navigated back to LID screen$")
    public void verifyUserNavigatedBackToLIDScreen() {
        waitFor(305000);
        Assert.assertTrue(StartFuelButton.isEnabled());

    }

    @Then("^wait for session timeout five minutes and Tap on FUEL AS GUEST  Button in the NLID$")
    public void waitForSessionTimeoutFiveMinutesAndTapOnFUELASGUESTButtonInTheNLID() {
        waitFor(305000);
        clickButtonWithOutScroll(FuelAsGuest);
    }

    @Then("^wait for more than five minutes user should navigate back to LID andc click on Start fueling button again$")
    public void waitForMoreThanFiveMinutesUserShouldNavigateBackToLIDAndcClickOnStartFuelingButtonAgain() {
        waitFor(310000);
        clickButtonWithOutScroll(StartFuelButton);
    }

    @Then("^Click on Add Debit or Credit Card$")
    public void clickOnAddDebitOrCreditCard() {
        waitFor(4000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            Assert.assertTrue(AddCreditCardGCOButton.isDisplayed());
            clickButtonWithOutScroll(AddCreditCardGCOButton);
        }
        else {
            waitForElement(AddPaymentScreenMessage, 5);
            Assert.assertTrue(AddPaymentScreenMessage.isDisplayed());
            Assert.assertTrue(setUpApplePayGCOButton.isDisplayed());
            Assert.assertTrue(AddCreditCardGCOButton.isDisplayed());
            waitForElement(AddCreditCardGCOButton, 6);
            clickButtonWithOutScroll(AddCreditCardGCOButton);
        }
    }

    @And("^Enter the Card Name and Details$")
    public void enterTheCardNameDetails() {
        Assert.assertTrue(scanQRCodelink.isDisplayed());
        Assert.assertTrue(AddDebitCreditCardHeader.isDisplayed());
        waitFor(6000);
        enterTextWithoutScroll(enterCardName, GuestCheckOutConstants.NameOncard);
        enterTextWithoutScroll(EnterCardNumber,GuestCheckOutConstants.cardNumber);
        enterTextWithoutScroll(cardExpDate, GuestCheckOutConstants.cardExpDate);
        enterTextWithoutScroll(securityCode,GuestCheckOutConstants.cardSecuritycode);
        hideMobileKeyboard();
    }
    @Then("^Enter the address of Customer$")
    public void enterTheAddressOfCustomer() {
        waitForElement(BillingAddress,6);
        enterTextWithoutScroll(BillingAddress,"BR11AA");
        clickButtonWithOutScroll(addressSearchIcon);
        waitForElement(SelectAddressFromList,60);
        clickButtonWithOutScroll(SelectAddressFromList);
        waitFor(6000);
        clickButtonWithOutScroll(selectAddressbutton);
        hideMobileKeyboard();

    }
    @Then("^Click on the Done button$")
    public void clickOnTheDoneButton() {
        waitFor(4000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            clickButtonWithOutScroll(DoneButton);
        }
        else {
            ScrollTo(GuestCheckOutConstants.UnitedKingdom, AccountConstants.IOSSCROLLUP, doneButton);
            clickButtonWithOutScroll(doneButton);
        }
    }

    @And("^Verify that Please wait screen is displayed$")
    public void verifyThatPleaseWaitScreenIsDisplayed() {
        waitForElement(PleaseWaitScreen,8);
        Assert.assertTrue(isElementDisplayed(PleaseWaitScreen));
        staticTextValidation(PleaseWaitScreen,GuestCheckOutConstants.Please_Wait);
        staticTextValidation(authorisingPaymentScreen,GuestCheckOutConstants.AuthorisingPaymentText);
        staticTextValidation(fuelConfirmSubHeaderText,GuestCheckOutConstants.ConfirmPaymentSubHeader);
    }

    @Then("^Start fuelling screen now is displayed$")
    public void startFuellingScreenNowIsDisplayed() {
        waitForElement(StartFuelingNowScreen,30);
        Assert.assertTrue(StartFuelingNowScreen.isDisplayed());
//        staticTextValidation(PleaseStartFuelSubTitle,GuestCheckOutConstants.Please_Start_Fuelling);
//        staticTextValidation(footerTextStartFuellingScreen,GuestCheckOutConstants.footerTextStartFuellingNowScreen);
    }

    @And("^Now fuelling displayed$")
    public void nowFuelingDisplayed() {
        waitForElement(nowFuelingScreen, 20);
        Assert.assertTrue(nowFuelingScreen.isDisplayed());
    }

    @And("^Transaction Complete screen is displayed for the user$")
    public void transactionCompleteScreenIsDisplayedForTheUser() {
        waitFor(15000);
        Assert.assertTrue(transactionCompleteScreen.isDisplayed());
    }

    @Then("^Verify Send receipt screen is displayed$")
    public void verifySendReceiptScreenIsDisplayed() {
        waitFor(8000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(HeaderText, GuestCheckOutConstants.Send_Reciept);
            staticTextValidation(HeaderRightText, GuestCheckOutConstants.Skip);
            staticTextValidation(SendReciptHeaderDescp, GuestCheckOutConstants.Do_you_need_the_Receipt);
            staticTextValidation(SendReciptSubHeaderDescp, GuestCheckOutConstants.Send_Receipt_SubHeader_Descrp);
            staticTextValidation(EmailIDforSendReport, GuestCheckOutConstants.Email);
            isElementDisplayed(SendingRecieptChceckBox);
            isElementDisplayed(MarkettingInfo);
            isElementDisplayed(SendMeTheReciept);
        }
        else {
            Assert.assertTrue(skipButtonSendReceipt.isDisplayed());
            Assert.assertTrue(sendReceiptButton.isDisplayed());
            Assert.assertTrue(mobileIconSendReceiptScreen.isEnabled());
            Assert.assertTrue(receiveEmailCBSendReceiptScreen.isDisplayed());
            staticTextValidation(DoYouNeedYourReceipt, GuestCheckOutConstants.Do_you_need_the_Receipt);
            staticTextValidation(DoYouNeedYourReceiptSubTitle, GuestCheckOutConstants.Send_Receipt_SubHeader_Descrp);
        }
    }

    @And("^Click on the Skip button in Send receipt screen$")
    public void clickOnTheSkipButtonInSendReceiptScreen() {
        waitFor(6000);
        clickButtonWithOutScroll(skipButtonSendReceipt);
    }

    @Then("^Verify that confirmation popup for skip send receipt$")
    public void verifyThatConfirmationPopupForSkipSendReceipt() {
        waitFor(8000);
        clickButtonWithOutScroll(skipConfirmButton);

    }

    @And("^Verify that thank you screen is displayed$")
    public void verifyThatThankYouScreenIsDisplayed() {
        waitFor(4000);
        waitForElement(thankYouHeader,8);
        Assert.assertTrue(thankYouHeader.isDisplayed());
        Assert.assertTrue(dontMissLoyaltyTextMesg.isDisplayed());
        waitForElement(remindLaterButton,6);
        Assert.assertTrue(remindLaterButton.isDisplayed());
        Assert.assertTrue(RegNowButton.isDisplayed());
    }

    @And("^Click on Close button in Thank you screen$")
    public void clickOnCloseButtonInThankYouScreen() {

            waitFor(6000);
            clickButtonWithOutScroll(CloseButtonThankYouScreen);
    }

    @And("^Verify that Skip button is displayed in send reciept screen$")
    public void verifyThatSkipButtonIsDisplayedInSendRecieptScreen() {
        Assert.assertTrue(skipButtonSendReceipt.isDisplayed());
    }

    @Then("^user should wait more than three hundred second click on fuel as guest button$")
    public void userShouldWaitMoreThanThreeHundredSecondClickOnFuelAsGuestButton() {
        waitFor(301000);
        clickButtonWithOutScroll(FuelAsGuest);
    }

    @Then("^wait for more than five minutes user should navigate back to LID$")
    public void waitForMoreThanFiveMinutesUserShouldNavigateBackToLID() {
        waitFor(310000);
        Assert.assertTrue(StartFuelButton.isDisplayed());
    }

    @When("^Enter \"([^\"]*)\" Login to ESSO app$")
    public void enterLoginToESSOApp(String arg0) throws Throwable {
        waitFor(5000);
        clickButtonWithOutScroll(userName);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(OffersPage.NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(OffersPage.NONEOFTHEABOVE);
        }
        enterTextWithoutScroll(userName, GuestCheckOutConstants.TestUserName1);
        waitFor(3000);
        enterTextWithoutScroll(password, GuestCheckOutConstants.PWD1);
    }

    @And("^user clicks on continue button in select pump screen$")
    public void userClicksOnContinueButtonInSelectPumpScreen() {
        waitFor(2000);
        Assert.assertTrue(selectYourPumpHeader.isDisplayed());
        clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
    }

    @And("^Verify that Card details screen is displayed$")
    public void verifyThatCardDetailsScreenIsDisplayed() {
        waitFor(2000);
        Assert.assertTrue(scanQRCodelink.isDisplayed());
        Assert.assertTrue(AddDebitCreditCardHeader.isDisplayed());
    }

    @Then("^wait for more than five minutes user should navigate back to NLID screen$")
    public void waitForMoreThanFiveMinutesUserShouldNavigateBackToNLIDScreen() {
        waitFor(310000);
        Assert.assertTrue(FuelAsGuest.isDisplayed());
    }

    @And("^verify that confirm Payment screen is displayed$")
    public void verifyThatConfirmPaymentScreenIsDisplayed() {
        waitFor(4000);
        if(OfferPopupInPaymentScreen.size()>=1) {
            waitForElement(ContinueButtonInFuelAsGuest, 10);
            clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
        }
        else{
            System.out.println("No Offers displayed ");
        }
        waitForElement(ConfirmPaymentScreenHeader,12);
        Assert.assertTrue(ConfirmPaymentScreenHeader.isDisplayed());

    }

    @Then("^wait for more than five minutes user should navigate back to LID screen$")
    public void waitForMoreThanFiveMinutesUserShouldNavigateBackToLIDScreen() {
        waitFor(310000);
        Assert.assertTrue(StartFuelButton.isDisplayed());
    }

    @Then("^Click on Continue button in Selectpump screen$")
    public void clickOnContinueButtonInSelectpumpScreen() {
        waitFor(4000);
        clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
    }


    @Then("^Click on Continue button in Select pumpscreen$")
    public void clickOnContinueButtonInSelectPumpscreen() {
        if(platformName.equalsIgnoreCase("Android"))
        {
            clickButtonWithOutScroll(ConfirmButton);

        }
        else {
            waitForElement(SelectPump2, 15);
            clickButtonWithOutScroll(SelectPump2);
            waitForElement(ContinueButtonInFuelAsGuest, 6);
            clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
        }
//      waitFor(4000);
//          if(OfferPopupInPaymentScreen.isDisplayed()) {
//           waitForElement(ContinueButtonInFuelAsGuest, 10);
//           clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
//       }
//       else{
//           System.out.println("No Offers displayed ");
//       }

    }

    @And("^Click on done button in transaction complete screen$")
    public void clickOnDoneButtonInTransactionCompleteScreen() {
        if(platformName.equalsIgnoreCase("Android"))
        {
            Assert.assertTrue(isElementDisplayed(PaymentConfirmationDone));
            clickButtonWithOutScroll(PaymentConfirmationDone);
        }
        else {
            waitForElement(TransactionCompleteHeader, 10);
            staticTextValidation(PaymentWasSuccessful, GuestCheckOutConstants.PaymentSuccessful);
            waitForElement(doneButton, 10);
            clickButtonWithOutScroll(doneButton);
        }
    }

    @And("^Click on Send receipt button$")
    public void clickOnSendReceiptButton() {
        waitFor(2000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            enterTextWithoutScroll(enterEmailAddress, GuestCheckOutConstants.SendReceiptEmail);
            waitFor(4000);
            hideMobileKeyboard();
            clickButtonWithOutScroll(sendReceiptButton);
        }
        else {
            enterTextWithoutScroll(enterEmailAddress, GuestCheckOutConstants.SendReceiptEmail);
            waitFor(2000);
            clickButtonWithOutScroll(KeyBoardDone);
            waitFor(4000);
            clickButtonWithOutScroll(sendReceiptButton);
        }
    }

    @And("^Click on remind me later button$")
    public void clickOnRemindMeLaterButton() {
        waitFor(2000);
        enterTextWithoutScroll(thankYouHeader, GuestCheckOutConstants.Thankyou);
        Assert.assertTrue(dontMissLoyaltyTextMesg.isDisplayed());
        clickButtonWithOutScroll(remindLaterButton);
        waitForElement(Cancel,6);
        clickButtonWithOutScroll(Cancel);
        waitForElement(CloseButtonThankYouScreen,6);
        clickButtonWithOutScroll(CloseButtonThankYouScreen);
    }

    @Then("^Verify that User is navigate back to NLID screen$")
    public void verifyThatUserIsNavigateBackToNLIDScreen() {
        waitFor(6000);
        Assert.assertTrue(FuelAsGuest.isDisplayed());
    }

    @And("^Verify the thank you screen should be displayed$")
    public void verifyTheThankYouScreenShouldBeDisplayed() {
        waitFor(4000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            isElementDisplayed(EssoLogo);
            staticTextValidation(Thankyou, GuestCheckOutConstants.Thankyou);
            isElementDisplayed(DontmissLoyaltyPoint);
            staticTextValidation(DontmissLoyaltyPoint.getText().substring(5, DontmissLoyaltyPoint.getText().length()), GuestCheckOutConstants.DontmissloyalltypointText.substring(5, GuestCheckOutConstants.DontmissloyalltypointText.length()));
            //staticTextValidation(ThankYouDescBottomView, GuestCheckOutConstants.ThankYouDescBottomViewText);
            isElementDisplayed(ThankYouDescBottomView);
            staticTextValidation(RemindLaterTextView, GuestCheckOutConstants.RemindLaterText);
            staticTextValidation(RegisterNowButton, GuestCheckOutConstants.RegisterNowText);
        }
        else {
            enterTextWithoutScroll(thankYouHeader, GuestCheckOutConstants.Thankyou);
            Assert.assertTrue(dontMissLoyaltyTextMesg.isDisplayed());
            staticTextValidation(dontMissLoyaltyTextMesg, GuestCheckOutConstants.DontMissOutThankYouScreenText);
            Assert.assertTrue(starImageThankYouScreen.isEnabled());
            staticTextValidation(loyalityTextThankYouScreen, GuestCheckOutConstants.ThankYouDescBottomViewText);
        }
    }

    @And("^Click on ok button present in the receipt sent Success message screen$")
    public void clickOnOkButtonPresentInTheReceiptSentSuccessMessageScreen() {
        waitFor(2000);
        staticTextValidation(ReceiptSentSuccess,GuestCheckOutConstants.ReceiptSentSuccessMessage);
        clickButtonWithOutScroll(okButton);
    }

    @And("^Click on Skip button in send receipt screen$")
    public void clickOnSkipButtonInSendReceiptScreen() {
        waitFor(2000);
        clickButtonWithOutScroll(skipButtonSendReceipt);
    }

    @And("^Click on Skip button on popup screen with confirmation message$")
    public void clickOnSkipButtonOnPopupScreenWithConfirmationMessage() {
        waitFor(2000);
        staticTextValidation(SkipConfirmMessage,GuestCheckOutConstants.ConfirmSkipMessageText);
        Assert.assertTrue(skipConfirmButton.isEnabled());
        Assert.assertTrue(collectReceiptButton.isEnabled());
        clickButtonWithOutScroll(skipConfirmButton);
    }

    @And("^Verify the all elements are displayed in Start fueling screen$")
    public void verifyTheAllElementsAreDisplayedInStartFuelingScreen() {
        waitFor(2000);
        staticTextValidation(PleaseStartFuelSubTitle,GuestCheckOutConstants.PleaseStartFuelText);
//        Assert.assertTrue(CloseButton.isEnabled());
//        Assert.assertTrue(PumpTextFuelScreen.isEnabled());
//        Assert.assertTrue(topProgressLineStartFuel.isEnabled());
    }

    @And("^Verify user is able  to see the Scan your card link in Add Card screen$")
    public void verifyUserIsAbleToSeeTheScanYourCardLinkInAddCardScreen() {
        Assert.assertTrue(scanQRCodelink.isDisplayed());

    }

    @And("^click on the Scan your card link$")
    public void clickOnTheScanYourCardLink() {
        waitFor(2000);
        clickButtonWithOutScroll(scanQRCodelink);
        waitFor(4000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


    }
    @Then("^Verify user is navigated to Authorising your payment screen$")
    public void verify_user_is_navigated_to_authorising_your_payment_screen() throws Throwable {
        staticTextValidation(AuthorisingYourPayment, GuestCheckOutConstants.Authorising_Your_Payment);
    }

    @And("^verify the Start fueling screen$")
    public void verify_the_start_fueling_screen() throws Throwable {
        staticTextValidation(StartFuellingMessage, GuestCheckOutConstants.Start_Fuelling_Message1);
        isElementDisplayed(HeaderText);
        staticTextValidation(AccountPage.CancelBtn, GuestCheckOutConstants.Cancel);
        staticTextValidation(StartFuelingNow, GuestCheckOutConstants.Start_Fuelling_Now);
        staticTextValidation(PleaseStartFuelling, GuestCheckOutConstants.Please_Start_Fuelling);
        isElementDisplayed(Fuelling_Pump_Circle);


    }

    @Then("^Verify user is navigated to Now Fuelling screen$")
    public void verify_user_is_navigated_to_now_fuelling_screen() throws Throwable {
        if (isElementDisplayedWithoutAssert(AuthorisingYourPayment)) {
            waitFor(30000);
            staticTextValidation(NowFueling, GuestCheckOutConstants.NowFueling);
        } else if (isElementDisplayedWithoutAssert(StartFuelingNow)) {
            waitFor(20000);
            staticTextValidation(NowFueling, GuestCheckOutConstants.NowFueling);
        } else {
            waitFor(10000);
            staticTextValidation(NowFueling, GuestCheckOutConstants.NowFueling);
        }
    }

    @Then("^Verify user is navigated to Transaction Details screen$")
    public void verify_user_is_navigated_to_transaction_details_screen() throws Throwable {
        waitFor(5000);
        staticTextValidation(TransactionDetailsHeaderText, GuestCheckOutConstants.TransactionDetailsLinkText);
    }

    @Then("^Verify all the fields are present in Transaction Details screen$")
    public void verify_all_the_fields_are_present_in_transaction_details_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(3000);
            staticTextValidation(HeaderText, GuestCheckOutConstants.TransactionDetailsLinkText);
            isElementDisplayed(FuelTypeEssoLogo);
            isElementDisplayed(StationAddress);
            //staticTextValidation(StationAddress,GuestCheckOutConstants.StationAdrerssText);
            isElementDisplayed(FuelingDateAndTime);
            isElementDisplayed(PrdtnameinTranstnDtls);
            isElementDisplayed(TransactionAmountinTransactionDetails);
            isElementDisplayed(TransactionLitresTransactionDetails);
        }
        else{
            waitFor(6000);
            staticTextValidation(TransactionDetailsHeaderText, GuestCheckOutConstants.TransactionDetailsLinkText);
            isElementDisplayed(FuelingDateAndTime);
            isElementDisplayed(TransactionAmountinTransactionDetails);
            isElementDisplayed(TransactionLitresTransactionDetails);
            waitFor(2000);
        }
    }

    @Then("^verify user navigates to Transaction Complete screen$")
    public void verify_user_navigates_to_transaction_complete_screen() throws Throwable {
        Thread.sleep(8000);
        if(platformName.equalsIgnoreCase("Android"))
        {   staticTextValidation(TransactionCompleteHeader, GuestCheckOutConstants.TransactionComplete);
            Assert.assertTrue(isElementDisplayed(PaymentConfirmationDone));

        }
        else {
            waitForElement(doneButton, 10);
//        staticTextValidation(TransactionDetailsHeaderText, GuestCheckOutConstants.TransactionComplete);
            staticTextValidation(SafeTravels, GuestCheckOutConstants.SafeTravelsText);
            staticTextValidation(PaymentWasSuccessful, GuestCheckOutConstants.PaymentSuccessful);
        }
    }

    @When("^user tap on Done button in Transaction Complete screen$")
    public void user_tap_on_done_button_in_transaction_complete_screen() throws Throwable {
        clickButtonWithOutScroll(PaymentConfirmationDone);
    }

    @Then("^Verify user is navigated to Send Reciept screen$")
    public void verify_user_is_navigated_to_send_reciept_screen() throws Throwable {
        Thread.sleep(2000);
        staticTextValidation(HeaderText, GuestCheckOutConstants.Send_Reciept);
    }

    @And("^verify all the fields are present in Send Reciept screen$")
    public void verify_all_the_fields_are_present_in_send_reciept_screen() throws Throwable {
        Thread.sleep(3000);
        staticTextValidation(HeaderText, GuestCheckOutConstants.Send_Reciept);
        staticTextValidation(HeaderRightText, GuestCheckOutConstants.Skip);
        staticTextValidation(SendReciptHeaderDescp, GuestCheckOutConstants.Do_you_need_the_Receipt);
        staticTextValidation(SendReciptSubHeaderDescp, GuestCheckOutConstants.Send_Receipt_SubHeader_Descrp);
        staticTextValidation(EmailIDforSendReport, GuestCheckOutConstants.Email);
        isElementDisplayed(SendingRecieptChceckBox);
        isElementDisplayed(MarkettingInfo);
        // staticTextValidation(MarkettingInfo,GuestCheckOutConstants.Markettinginfo1);
        isElementDisplayed(SendMeTheReciept);
    }


    @Then("^User is navigated to Thank You screen$")
    public void user_is_navigated_to_thank_you_screen() throws Throwable {
        Thread.sleep(3000);
        staticTextValidation(HeaderText, GuestCheckOutConstants.Thankyou);
    }

    @When("^user Tap on Send my Reciept button with the checkbox checked with out entering the email field$")
    public void user_tap_on_send_my_reciept_button_with_the_checkbox_checked_with_out_entering_the_email_field() throws Throwable {
        Thread.sleep(2000);
        clickButtonWithOutScroll(SendingRecieptChceckBox);
        clickButtonWithOutScroll(SendMeTheReciept);
    }

    @Then("^Verify the inline error message for Email Validation$")
    public void verify_the_inline_error_message_for_email_validation() throws Throwable {
        staticTextValidation(InlineErrorMessageEmailValidation, GuestCheckOutConstants.Inline_Error_Message_Email_Validation);
    }

    @When("^user Tap on Send my Reciept button with checkbox checked with entering wrong email id$")
    public void user_tap_on_send_my_reciept_button_with_checkbox_checked_with_entering_wrong_email_id() throws Throwable {
        enterTextWithoutClick(EmailIDforSendReport, GuestCheckOutConstants.Wrong_EmailId);
        hideMobileKeyboard();
        clickButtonWithOutScroll(SendingRecieptChceckBox);
        clickButtonWithOutScroll(SendMeTheReciept);
    }

    @Then("^verify the inline error message for Incorrect Email Format$")
    public void verify_the_inline_error_message_for_incorrect_email_format() throws Throwable {
        staticTextValidation(InlineErrorMessageEmailValidation, GuestCheckOutConstants.Inline_Error_Message_Incorrect_Email_Format);
    }

    @When("^User Tap on skip button$")
    public void user_tap_on_skip_button() throws Throwable {
        clickButtonWithOutScroll(HeaderRightText);
    }

    @Then("^Verify user should see the prompt message and buttons listed below$")
    public void verify_user_should_see_the_prompt_message_and_buttons_listed_below() throws Throwable {
        Thread.sleep(3000);
        staticTextValidation(PopUpMessage, GuestCheckOutConstants.Skip_Email_PopUp_Message);
        staticTextValidation(CollectReceipt, GuestCheckOutConstants.Collect_Receipt);

        //Assert.assertTrue(isElementDisplayed(CollectReceipt));
        //Assert.assertTrue(isElementDisplayed(SKIP));
        staticTextValidation(SKIP, GuestCheckOutConstants.SKIPButton);
    }

    @When("^user tap on Collect Reciept button$")
    public void user_tap_on_collect_reciept_button() throws Throwable {
        Collect_Reciept.isDisplayed();
        clickButtonWithOutScroll(Collect_Reciept);
    }

    @When("^user taps on SKIP button in confirmation prompt$")
    public void user_taps_on_skip_button_in_confirmation_prompt() throws Throwable {
        Skip_prompt.isDisplayed();
        clickButtonWithOutScroll(Skip_prompt);
    }

    @And("^Verify skip button should be displayed on the screen$")
    public void verify_skip_button_should_be_displayed_on_the_screen() throws Throwable {
        staticTextValidation(HeaderRightText, GuestCheckOutConstants.Skip);
    }

    @Then("^Verify user is navigated to NLID screen from Add Payment method screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_nlid_screen_from_add_payment_method_screen_after_300_seconds_of_in_activity() throws Throwable {

        waitFor(310000);
        waitVisibilityOfElement(FuelAsGuest);
//        String title=HeaderText.getText();
//        WebDriverWait wait=new WebDriverWait(driver,300);
//        wait.until(ExpectedConditions.titleContains(title));
        isElementDisplayed(FuelAsGuest);
    }
    @Then("^Verify user is navigated to NLID screen from Ready to start fuelling screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_nlid_screen_from_ready_to_start_fuelling_screen_after_300_seconds_of_in_activity() throws Throwable {
        waitFor(310000);
        waitVisibilityOfElement(FuelAsGuest);
        isElementDisplayed(FuelAsGuest);
    }
    @Then("^Verify user is navigated to NLID screen from Scan QR Code screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_nlid_screen_from_scan_qr_code_screen_after_300_seconds_of_in_activity() throws Throwable {
        waitFor(310000);
        waitVisibilityOfElement(FuelAsGuest);
        isElementDisplayed(FuelAsGuest);
    }

    @When("^Tap on Scan QR Code button$")
    public void tap_on_scan_qr_code_button() throws Throwable {
        clickButtonWithOutScroll(ScanQRCodebtn);
    }

    @Then("^Verify user is navigated to Scan QR Code Camera screen$")
    public void verify_user_is_navigated_to_scan_qr_code_camera_screen() throws Throwable {

        if(isAlertPresent())
        {
            driver.switchTo().alert().accept();
            waitFor(2000);
            staticTextValidation(ScanCancelbtn,GuestCheckOutConstants.CANCEL);
        }
        else if(isElementDisplayedWithoutAssert(ScanCancelbtn))
        {
            staticTextValidation(ScanCancelbtn,GuestCheckOutConstants.CANCEL);
        }
    }
    @And("^Verify user is navigated to NLID screen from Scan QR Code Camera screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_nlid_screen_from_scan_qr_code_camera_screen_after_300_seconds_of_in_activity() throws Throwable {

        if(isAlertPresent())
        {
            driver.switchTo().alert().accept();
            waitFor(310000);
            waitVisibilityOfElement(FuelAsGuest);
            isElementDisplayed(FuelAsGuest);
        }
        else {
            waitFor(310000);
            waitVisibilityOfElement(FuelAsGuest);
            isElementDisplayed(FuelAsGuest);
        }
    }

    @And("^Tap on Scan Your Card$")
    public void tap_on_scan_your_card() throws Throwable {
        clickButtonWithOutScroll(ScanYourCard);
    }
    @And("^Verify user is navigated to NLID screen from Add Payment Method scan card screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_nlid_screen_from_add_payment_method_scan_card_screen_after_300_seconds_of_in_activity() throws Throwable {

        if(isAlertPresent())
        {
            driver.switchTo().alert().accept();
            waitFor(310000);
            waitVisibilityOfElement(FuelAsGuest);
            isElementDisplayed(FuelAsGuest);
        }
        else {
            waitFor(310000);
            waitVisibilityOfElement(FuelAsGuest);
            isElementDisplayed(FuelAsGuest);
        }
    }

    @And("^Verify user is navigated to NLID screen from Geolocation based site check in screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_nlid_screen_from_geolocation_based_site_check_in_screen_after_300_seconds_of_in_activity() throws Throwable {
        waitFor(310000);
        waitVisibilityOfElement(FuelAsGuest);
        isElementDisplayed(FuelAsGuest);
    }
    @And("^Verify user is navigated to LID screen from Scan QR Code Camera screen after 300 seconds of in activity$")
    public void verify_user_is_navigated_to_lid_screen_from_scan_qr_code_camera_screen_after_300_seconds_of_in_activity() throws Throwable {
        waitFor(310000);
        waitVisibilityOfElement(FuelAsGuest);
        isElementDisplayed(FuelAsGuest);
    }

    @Then("^Verify whether the user is able to view the Select your pump screen displayed with all the elements$")
    public void verifyWhetherTheUserIsAbleToViewTheSelectYourPumpScreenDisplayedWithAllTheElements() {
        staticTextValidation(PleaseSetupApplePayDebitCardStaticText,GuestCheckOutConstants.SetupApplePayOrCardText);
        Assert.assertTrue(setUpApplePayGCOButton.isEnabled());
        Assert.assertTrue(AddCreditCardGCOButton.isEnabled());
    }

    @Then("^Verify the Elements present in the Select your pump screen$")
    public void verifyTheElementsPresentInTheSelectYourPumpScreen() {
        waitForElement(selectYourPumpHeader,6);
        staticTextValidation(selectYourPumpHeader,GuestCheckOutConstants.SelectYourPumpText);
        staticTextValidation(Selectedamount,GuestCheckOutConstants.Maximum_FuelAmount);
        waitForElement(SelectPumpContinueButton,6);
        Assert.assertTrue(SelectPumpContinueButton.isEnabled());
        Assert.assertTrue(ScanQRCodePumpScreen.isEnabled());

    }

    @Then("^Verify the Elements present in the Add Payment Method screen$")
    public void verifyTheElementsPresentInTheAddPaymentMethodScreen() {
        waitForElement(AddPaymentScreenMessage,4);
        staticTextValidation(AddPaymentScreenMessage,GuestCheckOutConstants.SetupApplePayOrCardText);
        Assert.assertTrue(AddCreditCardGCOButton.isEnabled());
        Assert.assertTrue(setUpApplePayGCOButton.isEnabled());
    }


    @And("^Enter name Card Name$")
    public void enterNameCardName() {
        waitForElement(enterCardName,6);
        enterTextWithoutScroll(enterCardName, GuestCheckOutConstants.NameOncard);
    }

    @And("^Enter name Card Number$")
    public void enterNameCardNumber() {
        waitForElement(EnterCardNumber,4);
        enterTextWithoutScroll(EnterCardNumber, GuestCheckOutConstants.cardNumber);
        hideMobileKeyboard();
    }

    @And("^Enter name Card Exp Date$")
    public void enterNameCardExpDate() {
        if(platformName.equalsIgnoreCase("Android"))
        {
            clickButtonWithOutScroll(ExpiryDate);
            waitFor(3000);
            clickButtonWithOutScroll(AccountPage.okBtn);
        }
        else {
            waitForElement(cardExpDate, 4);
            enterTextWithoutScroll(cardExpDate, GuestCheckOutConstants.cardExpDate);
            hideMobileKeyboard();
        }
    }

    @And("^Enter name Security Code$")
    public void enterNameSecurityCode() {
        waitForElement(securityCode,4);
        enterTextWithoutScroll(securityCode, GuestCheckOutConstants.cardSecuritycode);
        hideMobileKeyboard();
    }

    @And("^Enter name PostCode$")
    public void enterNamePostCode() {
        waitForElement(BillingAddress,4);
        enterTextWithoutScroll(BillingAddress, GuestCheckOutConstants.billpostcode);
        hideMobileKeyboard();
    }

    @And("^Enter name Address(\\d+)$")
    public void enterNameAddress(int arg0) {
        waitForElement(Address1,4);
        enterTextWithoutScroll(Address1, GuestCheckOutConstants.billAddressStreet);
        hideMobileKeyboard();
    }

    @And("^Enter name AddressSecond$")
    public void enterNameAddressSecond() {
        waitForElement(Address2,4);
        enterTextWithoutScroll(Address2, GuestCheckOutConstants.billAddressLocality);
        hideMobileKeyboard();

    }

    @And("^Enter name Card City$")
    public void enterNameCardCity() {
        waitForElement(AddressCity,4);
        enterTextWithoutScroll(AddressCity, GuestCheckOutConstants.billAddressCity);
        hideMobileKeyboard();
    }

    @Then("^Click on Done button in Add Card Screen$")
    public void clickOnDoneButtonInAddCardScreen() {
        waitForElement(DoneButton,4);
        clickButtonWithOutScroll(DoneButton);
    }

    @And("^Enter email and Click on send receipt$")
    public void enterEmailAndClickOnSendReceipt() {
        if(platformName.equalsIgnoreCase("Android"))
        {
            waitForElement(enterEmailAddress,6);
            enterTextWithoutScroll(enterEmailAddress, GuestCheckOutConstants.TestUserName1);
            hideMobileKeyboard();
            waitForElement(sendReceiptButton,6);
            clickButtonWithOutScroll(sendReceiptButton);
        }
        else {
            waitForElement(enterEmailAddress, 6);
            enterTextWithoutScroll(enterEmailAddress, GuestCheckOutConstants.TestUserName1);
            waitForElement(KeyBoardDone, 6);
            clickButtonWithOutScroll(KeyBoardDone);
            hideMobileKeyboard();
            waitForElement(sendReceiptButton, 6);
            clickButtonWithOutScroll(sendReceiptButton);
        }
    }

    @And("^Verify Receipt success message$")
    public void verifyReceiptSuccessMessage() {
        waitForElement(ReceiptSentSuccess,6);
        staticTextValidation(ReceiptSentSuccess,GuestCheckOutConstants.RecieptSentSuccessfullyText);
        waitForElement(okButton,8);
        clickButtonWithOutScroll(okButton);
    }

    @Then("^Tap on Transaction Details link in Transaction Complete Screen$")
    public void tapOnTransactionDetailsLinkInTransactionCompleteScreen() {
        waitFor(5000);
        clickButtonWithOutScroll(TransactionDetailsLinK);
    }

    @Then("^Install and launch the Esso app$")
    public void InstallandlaunchtheEssoapp() throws IOException, InterruptedException {
        waitFor(5000);
        appUninstallInstall();
        appInstall();

    }

    @And("^Verify that Confirm Payment screen with all the elements details$")
    public void verifyThatConfirmPaymentScreenWithAllTheElementsDetails() {
        waitFor(4000);
        if(OfferPopupInPaymentScreen.size()>=1) {
            waitForElement(ContinueButtonInFuelAsGuest, 10);
            clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
        }
        else{
            System.out.println("No Offers displayed ");
        }
        waitForElement(ConfirmPaymentScreenHeader,6000);;
        staticTextValidation(ConfirmPaymentScreenHeader,GuestCheckOutConstants.ConfirmPaymentHeader);
        staticTextValidation(fuelConfirmSubHeaderText,GuestCheckOutConstants.ConfirmPaymentSubHeader);
        staticTextValidation(selectPumpHeaderText,GuestCheckOutConstants.SelectedPumpText);
        staticTextValidation(paymentMethodHeaderText,GuestCheckOutConstants.PaymentMethodText);
        staticTextValidation(maxFuellingHeaderText,GuestCheckOutConstants.MaxFuellingAmountText);
        staticTextValidation(rewardPaymentHeaderText,GuestCheckOutConstants.RewardText);

    }

    @And("^Click on Change payment link$")
    public void clickOnChangePaymentLink() {
        waitForElement(EditPaymentMethodLink,6000);
        clickButtonWithOutScroll(EditPaymentMethodLink);
    }

    @And("^Verify that Payment details screen$")
    public void verifyThatPaymentDetailsScreen() {
        waitFor(6000);
//        waitForElement(paymentDetailsHeaderText,6000);;
        Assert.assertTrue(paymentDetailsHeaderText.isEnabled());
        Assert.assertTrue(EssoNectarPaymentDetailsHeaderText.isEnabled());
//        staticTextValidation(paymentDetailsHeaderText,GuestCheckOutConstants.PaymentDetailsText);
//        staticTextValidation(EssoNectarPaymentDetailsHeaderText,GuestCheckOutConstants.EssoNectarText);

    }

    @And("^Click on Continue button in Allow location screen$")
    public void clickOnContinueButtonInAllowLocationScreen() {
        waitForElement(ContinueButtonInFuelAsGuest,6000);
        clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
    }

    @And("^Verify that elements displayed in Location access page$")
    public void verifyThatElementsDisplayedInLocationAccessPage() {
        waitFor(6000);
        staticTextValidation(useLocationPopupHeader,GuestCheckOutConstants.LocationPermissionMessage);
        staticTextValidation(useLocationPopupSubHeader,GuestCheckOutConstants.useLocationPopupSubHeaderText);
        waitFor(4000);
        Assert.assertTrue(AllowLocationdontAllow.isEnabled());
        Assert.assertTrue(AllowLocationOnlyThisTime.isEnabled());
        Assert.assertTrue(AllowLocationWhileUsingTheApp.isEnabled());

    }

    @And("^Verify that Ready to start Fuelling screen is displayed with How to fuel header$")
    public void verifyThatReadyToStartFuellingScreenIsDisplayedWithHowToFuelHeader() {
        waitFor(6000);
        staticTextValidation(howToFuelHeader,GuestCheckOutConstants.How_To_Fuel);
    }

    @Then("^Verify the element displayed in the Ready to start fuel screen$")
    public void verifyTheElementDisplayedInTheReadyToStartFuelScreen() {
        waitFor(6000);
//        staticTextValidation(readytoStartFuellingSubText,GuestCheckOutConstants.readyForFuellingText);
//        staticTextValidation(ReadyToDStartFuelling,GuestCheckOutConstants.Ready_ToStart_Fuelling);
        Assert.assertTrue(clockImageReadyToStartFuelScreen.isEnabled());
        Assert.assertTrue(ContinueButtonInFuelAsGuest.isEnabled());

    }

    @And("^Tap on continue button location screen and select allow while using app in select location popup$")
    public void tapOnContinueButtonLocationScreenAndSelectAllowWhileUsingAppInSelectLocationPopup() {
        waitFor(6000);
        clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
        waitFor(6000);
        clickButtonWithOutScroll(AllowLocationWhileUsingTheApp);
    }

    @And("^select the Address from the list of address displayed$")
    public void selectTheAddressFromTheListOfAddressDisplayed() {
        waitForElement(SelectAddressFromList,6);
        clickButtonWithOutScroll(SelectAddressFromList);
        clickButtonWithOutScroll(selectAddressbutton);
    }

    @When("^User click on remind me later link in thank you screen$")
    public void userClickOnRemindMeLaterLinkInThankYouScreen() {
        waitForElement(remindLaterButton,6);
        clickButtonWithOutScroll(remindLaterButton);
    }

    @Then("^Verify the CT text displayed with Cancel button$")
    public void verifyTheCTTextDisplayedWithCancelButton() {
        if(platformName.equalsIgnoreCase("Android"))
        {
            waitFor(2000);
        }
        else {
            waitForElement(remindmeLaterCopyText, 6);
            staticTextValidation(remindmeLaterCopyText, GuestCheckOutConstants.RemindLaterPopupText);
            Assert.assertTrue(remindmeLaterCopyText.isDisplayed());
            Assert.assertTrue(SettingsButtonremindmeLater.isEnabled());
            Assert.assertTrue(Cancel.isEnabled());
            clickButtonWithOutScroll(Cancel);
            waitFor(6000);
            clickButtonWithOutScroll(CloseButtonThankYouScreen);
        }
    }

    @Then("^Click on Confirm Payment with PayPal$")
    public void clickOnConfirmPaymentWithPayPal() {
        waitForElement(PayWithPaypalButton,10);
        clickButtonWithOutScroll(PayWithPaypalButton);
    }

    @And("^Verify the Use should be navigated to Thank you Screen$")
    public void verifyTheUseShouldBeNavigatedToThankYouScreen() {
        waitFor(4000);
        waitForElement(thankYouHeader,8);
        Assert.assertTrue(thankYouHeader.isDisplayed());
    }

    @And("^Enter Challenge flow (\\d+)DS card Card Name$")
    public void enterChallengeFlowDSCardCardName(int arg0) {
        waitForElement(EnterCardNumber,4);
        enterTextWithoutScroll(EnterCardNumber, GuestCheckOutConstants.challangeFlow3DScardNumber);
        hideMobileKeyboard();
    }

    @When("^user lands on card verification screen GCO$")
    public void userLandsOnCardVerificationScreenGCO() {
        waitFor(5000);
        waitForElement(VerifyPwd,20);
        isElementDisplayed(VerifyPwd);
        waitForElement(EnterPwd,20);
        staticTextValidation(EnterPwd, COFChallangeFlowConstants.ENTERPWD);
    }

    @And("^enter valid password and click on submit button GCO$")
    public void enterValidPasswordAndClickOnSubmitButtonGCO() {
        waitForElement(PassPhrase,20);
        enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
        clickButtonWithOutScroll(PassPhraseSubmit);
    }

    @When("^Click on info icon next to max fuelling amount link$")
    public void clickOnInfoIconNextToMaxFuellingAmountLink() {
        waitForElement(MaxFuelInfoIcon,20);
        clickButtonWithOutScroll(MaxFuelInfoIcon);
        waitFor(1500);
        staticTextValidation(MaxFuellingPopUp,GuestCheckOutConstants.maxFuellingAmountInfoIconPopupText);
        clickButtonWithOutScroll(okButton);
    }

    @And("^verify elements displayed in Add Card Screen$")
    public void verifyElementsDisplayedInAddCardScreen() {
        waitForElement(ScanYourCard,10);
        staticTextValidation(ScanYourCard,GuestCheckOutConstants.Scan_Your_Card);
        staticTextValidation(EnterCardDetailsText,GuestCheckOutConstants.Enter_Card_Details);
        Assert.assertTrue(enterCardName.isDisplayed());
        Assert.assertTrue(EnterCardNumber.isDisplayed());
        Assert.assertTrue(cardExpDate.isDisplayed());
        Assert.assertTrue(securityCode.isDisplayed());
        Assert.assertTrue(Address1.isDisplayed());
        Assert.assertTrue(Address2.isEnabled());
        Assert.assertTrue(AddressCity.isDisplayed());
    }

    @Then("^Verify Location page and Select allow while using app button$")
    public void verifyLocationPageAndSelectAllowWhileUsingAppButton() {
        waitFor(4000);
        if(platformName.equalsIgnoreCase("Android"))
        {
            if (isElementDisplayedWithoutAssert(LocationContinueButton))
            {
                clickButtonWithOutScroll(LocationContinueButton);
                driver.switchTo().alert().accept();

            }
            else {
                System.out.println("Location popup is not displayed");
                }
        }
        else {
            if (AllowLocationHeader.size() >= 1) {
                clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
                waitForElement(AllowLocationWhileUsingTheApp, 10);
                clickButtonWithOutScroll(AllowLocationWhileUsingTheApp);
            } else {
                System.out.println("Location popup is not displayed");
            }
        }
    }

    @And("^Verify the ready to start fuelling if displayed click on continue button$")
    public void verifyTheReadyToStartFuellingIfDisplayedClickOnContinueButton() {
        waitFor((15000));
        if(platformName.equalsIgnoreCase("Android"))
        {
            System.out.println("continue button status"+HowToFuelContinueButton.isDisplayed());
            if(isElementDisplayedWithoutAssert(HowToFuelContinueButton)) {
               waitForElement(HowToFuelContinueButton,5);
                //clickButtonWithOutScroll(HowToFuelContinueButton);
                HowToFuelContinueButton.click();

            }else{
                System.out.println("User did not get continue or Ready for feulling screen");
            }
        }
        else {
            if (ReadyToDStartFuellingSize.size() >= 1) {
                clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
            } else {
                System.out.println("Ready to start fuelling screen is not displayed");
            }
        }
    }
}