package stepDefinitions;

import contants.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.ContextualRegistrationPage;
import pages.ManualRegistrationPage;
import pages.ProfileCompletionPage;
import pages.MenuPage;
import pages.AppInstallAndLaunchPage;

public class ManualRegistrationSteps extends ManualRegistrationPage {
    AppInstallAndLaunchPage AppInstallAndLaunchPage = new AppInstallAndLaunchPage();

    @Then("^user verifies the updated password rules$")
    public void user_verifies_the_updated_password_rules() throws Throwable {
        Assert.assertTrue(
                isTextMatch(PassValidation1ManualRegistration.getText(), ManualRegistrationConstants.MANUALREGISTRATIONPASSWORDRULE1));
        Assert.assertTrue(isTextMatch(PassValidation2ManualRegistration.getText(), ManualRegistrationConstants.MANUALREGISTRATIONPASSWORDRULE2));
        Assert.assertTrue(isTextMatch(PassValidation3ManualRegistration.getText(), ManualRegistrationConstants.MANUALREGISTRATIONPASSWORDRULE3));
    }

    @And("^user enters a password with less than 8 characters$")
    public void user_enters_a_password_with_less_than_8_characters() {
        enterTextWithoutScroll(ContextualRegistrationPage.RegstrPass, ManualRegistrationConstants.PWDLESSTHANEIGHTCHARACTERS);
    }

    @Then("^user verifies the validation message$")
    public void user_verifies_the_validation_message() throws Throwable {
        waitFor(3000);
        Assert.assertTrue(
                isTextMatch(PasswordInlineErrorMessage.getText(), ManualRegistrationConstants.PWDINLINEERRORMESSAGEMANUAL));
    }

    @And("^user enters a password with only upper case more than 8 characters$")
    public void user_enters_a_password_with_only_upper_case_more_than_8_characters() throws Throwable {
//        enterTextWithoutClick(ContextualRegistrationPage.RegstrPass, ManualRegistrationConstants.PWDMORETHANEIGHTUPPERCHARACTERS);
        enterTextWithoutScroll(ContextualRegistrationPage.RegstrPass, ManualRegistrationConstants.PWDMORETHANEIGHTUPPERCHARACTERS);
    }

    @And("^user enters a password with only lower case$")
    public void user_enters_a_password_with_only_lower_case() throws Throwable {
        enterTextWithoutScroll(ContextualRegistrationPage.RegstrPass, ManualRegistrationConstants.PWDMORETHANEIGHTLOWERCHARACTERS);
    }

    @Then("^verify the tick marks are present in the Register screen$")
    public void verify_the_tick_marks_are_present_in_the_register_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayed(Tick1ManualRegistration));
        Assert.assertTrue(isElementDisplayed(Tick2ManualRegistration));
        Assert.assertTrue(isElementDisplayed(Tick3ManualRegistration));
    }

    @Then("^validate the first tick mark validation$")
    public void validate_the_first_tick_mark_validation() throws Throwable {
        isElementDisplayed(Tick1ManualRegistration);
    }

    @And("^enter a random password in the confirm password field$")
    public void enter_a_random_password_in_the_confirm_password_field() throws Throwable {
        waitFor(5000);
        enterTextWithoutClick(ContextualRegistrationPage.RegstrConfPass, ManualRegistrationConstants.CNFMPWDMORETHANEIGHTLOWERCHARACTERS);
    }
    
    @Then("^verify the inline error message in the password section$")
    public void verify_the_inline_error_message_in_the_password_section() throws Throwable {
    	staticTextValidation(InlineErrorless8charPassword, ManualRegistrationConstants.PWDINLINEERRORMESSAGEMANUAL);
    }

    @Then("^verify the inline error message in the confirm password$")
    public void verify_the_inline_error_message_in_the_confirm_password() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(
                    isTextMatch(InlineErrorEmptyConfirmPassword.getText(), ManualRegistrationConstants.CNFMPWDINLINEERRORMESSAGEMANUAL));
        } else {
            Assert.assertTrue(
                    isTextMatch(ConfirmPasswordInlineErrorMessage.getText(), ManualRegistrationConstants.CNFMPWDINLINEERRORMESSAGEMANUAL));
        }

    }

    @When("^click on continue button from register screen without selecting the PP and TC checkbox$")
    public void click_on_continue_button_from_register_screen_without_selecting_the_pp_and_tc_checkbox() throws Throwable {
        hideMobileKeyboard();
        waitFor(1000);
        clickButtonWithOutScroll(ContextualRegistrationPage.RegstrContinue);
        waitFor(9000);
        if (isElementDisplayedWithoutAssert(AccountPage.LoginSave)) {
            clickButtonWithOutScroll(AccountPage.LoginSave);
        }
    }

    @Then("^verify the content of the PP and TC checkbox$")
    public void verify_the_content_of_the_pp_and_tc_checkbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(PleaseAcceptPPContent.getText(), ManualRegistrationConstants.PLEASEACCEPTPPPOPUPCONTENT));
    }

    @Then("^verify the title of the PP and TC checkbox$")
    public void verify_the_title_of_the_pp_and_tc_checkbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(PleaseAcceptPPTitle.getText(), ManualRegistrationConstants.PLEASEACCEPTPPPOPUPTITLE));
    }

    @And("^user enters the already registered mail address$")
    public void user_enters_the_already_registered_mail_address() throws Throwable {
        enterTextWithoutClick(ContextualRegistrationPage.RegstrEmail, ManualRegistrationConstants.ALREADYREGISTEREDMAILID);
    }

    @Then("^verify the multiple registration error popup$")
    public void verify_the_multiple_registration_error_popup() throws Throwable {
        waitFor(15000);
    	Assert.assertTrue(
                isTextMatch(MultipleMailIdPopup.getText(), ManualRegistrationConstants.ALREADYREGISTEREDMAILIDPOPUPCONTENT));
    }

    @Then("^user verifies the Esso related content$")
    public void user_verifies_the_Esso_related_content() throws Throwable {
       waitFor(5000);
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(
                    isTextMatch(EssoCheckboxContentRegistration.getText(), ManualRegistrationConstants.ESSOCHECKBOXCONTENT));
        } else {
            Assert.assertTrue(
                    isTextMatch(EssoCheckboxContentRegistration.getText(), ManualRegistrationConstants.ESSOCHECKBOXCONTENTIOS));
        }
    }

    @Then("^user verifies the Esso related checkbox$")
    public void user_verifies_the_esso_related_checkbox() throws Throwable {
        if (isElementDisplayedWithoutAssert(TouchIdContent)) {
            clickButtonWithOutScroll(EssoCheckboxWithBiometricsRegistration);
        } else {
            clickButtonWithOutScroll(EssoCheckboxWithoutBiometricsRegistration);
        }
    }

    @Then("^user verifies the mail is accepted without any error$")
    public void user_verifies_the_mail_is_accepted_without_any_error() throws Throwable {
        Assert.assertTrue(isElementDisplayed(InlineEmailErrorRegistration));
    }

    @And("^user enters the wrong mail format in the Register screen$")
    public void user_enters_the_wrong_mail_format_in_the_register_screen() throws Throwable {
        enterTextWithoutClick(ContextualRegistrationPage.RegstrEmail, ManualRegistrationConstants.WRONGMMAILIDFORMAT);
    }

    @Then("^user verifies the inline error message of the mail id$")
    public void user_verifies_the_inline_error_message_of_the_mail_id() throws Throwable {
    	
    	 	
    	Assert.assertTrue(
                isTextMatch(InlineEmailErrorRegistration.getText(), ManualRegistrationConstants.INLINEERRORREGISTRATIONCONTENT));
    }

    @Then("^user lands in the Register screen$")
    public void user_lands_in_the_register_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayed(ContextualRegistrationPage.RegstrContinue));
    }

    @Then("^user taps on Done button$")
    public void user_taps_on_done_button() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            hideMobileKeyboard();
            if(isElementDisplayedWithoutAssert(TouchIdContent)){
                driver.navigate().back();
            }
            else
            {
                clickButtonWithOutScroll(DoneKeypadRegistration);
                waitFor(1000);
            }
        } else {
            hideMobileKeyboard();
        }
    }
    
    @Then("^user taps on the Done button$")
    public void user_taps_on_the_done_button() throws Throwable {
    	
    	if(isElementDisplayedWithoutAssert(TouchIdContent)){
    		hideMobileKeyboard();
        }
        else
        {
        clickButtonWithOutScroll(DoneKeypadRegistration);
        waitFor(1000);
    }
    }


    @Then("^user verifies the inline error message of the empty first name$")
    public void user_verifies_the_inline_error_message_of_the_empty_first_name() throws Throwable {
        Assert.assertTrue(
                isTextMatch(InlineErrorEmptyFirstName.getText(), ManualRegistrationConstants.INLINEERROREMPTYFN));
    }

    @Then("^user verifies the inline error message of the empty last name$")
    public void user_verifies_the_inline_error_message_of_the_empty_last_name() throws Throwable {
        Assert.assertTrue(
                isTextMatch(InlineErrorEmptyLastName.getText(), ManualRegistrationConstants.INLINEERROREMPTYLN));
    }

    @Then("^user verifies the inline error message of the empty email address$")
    public void user_verifies_the_inline_error_message_of_the_empty_email_address() throws Throwable {
        Assert.assertTrue(
                isTextMatch(InlineErrorEmptyEmail.getText(), ManualRegistrationConstants.INLINEERROREMPTYEMAILID));
    }

    @Then("^user verifies the inline error message of the empty Password$")
    public void user_verifies_the_inline_error_message_of_the_empty_password() throws Throwable {
        Assert.assertTrue(
                isTextMatch(InlineErrorEmptyPassword.getText(), ManualRegistrationConstants.INLINEERROREMPTYPWD));
    }

    @Then("^user verify the empty confirm password$")
    public void user_verify_the_empty_confirm_password() throws Throwable {
        Assert.assertTrue(
                isTextMatch(InlineErrorEmptyConfirmPassword.getText(), ManualRegistrationConstants.INLINEERROREMPTYCONFIRMPWD));
    }

    @And("^user taps on Privacy Policy link in the Registration screen$")
    public void user_taps_on_privacy_policy_link_in_the_registration_screen() throws Throwable {
        clickButtonWithOutScroll(PpLinkRegistration);
    }

    @And("^user lands in the Privacy Policy screen$")
    public void user_lands_in_the_privacy_policy_screen() throws Throwable {
        Assert.assertTrue(
                isTextMatch(PpLinkRegistrationTitle.getText(), ManualRegistrationConstants.PPLINKTITLEREGISTRATION));
    }

    @And("^user navigate back to the Register screen from Privacy policy$")
    public void user_navigate_back_to_the_register_screen_from_privacy_policy() throws Throwable {
        clickButtonWithOutScroll(BackPpLinkRegistration);
    }

    @And("^user taps on Terms and Conditions link in the Registration screen$")
    public void user_taps_on_terms_and_conditions_link_in_the_registration_screen() throws Throwable {
        clickButtonWithOutScroll(TcLinkRegistration);
    }

    @And("^user verifies the first name checkbox$")
    public void user_verifies_the_first_name_checkbox() throws Throwable {
       
    	waitFor(3000);
    	Assert.assertTrue(
                isTextMatch(ContextualRegistrationPage.RegstrFirstName.getText(), ManualRegistrationConstants.FNCHECKBOXREGISTRATION));
    }

    @And("^user verifies the last name checkbox$")
    public void user_verifies_the_last_name_checkbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(ContextualRegistrationPage.RegstrLastName.getText(), ManualRegistrationConstants.LNCHECKBOXREGISTRATION));
    }

    @And("^user verifies the email checkbox$")
    public void user_verifies_the_email_checkbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(ContextualRegistrationPage.RegstrEmail.getText(), ManualRegistrationConstants.EMAILCHECKBOXREGISTRATION));
    }

    @And("^user verifies the Mobile number Textbox$")
    public void user_verifies_the_mobile_number_textbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(ContextualRegistrationPage.RegstrMobile.getText(), ManualRegistrationConstants.MOBILECHECKBOXREGISTRATION));
    }

    @Then("^user verifies the Continue button$")
    public void user_verifies_the_continue_button() throws Throwable {
        Assert.assertTrue(
                isTextMatch(ContextualRegistrationPage.RegstrContinue.getText(), ManualRegistrationConstants.CONTINUEBUTTONREGISTRATION));
    }

    @Then("^user verifies the show hide toggle button$")
    public void user_verifies_the_show_hide_toggle_button() throws Throwable {
        Assert.assertTrue(isElementDisplayed(ShowToggleButtonPwd));
    }

    @Then("^user verifies the checkboxes$")
    public void user_verifies_the_checkboxes() throws Throwable {
        if (isElementDisplayedWithoutAssert(TouchIdContent)) {
            Assert.assertTrue(isElementDisplayed(BiometricsCheckboxRegistration));
            Assert.assertTrue(isElementDisplayed(PpTcCheckboxWithBiometricsRegistration));
            Assert.assertTrue(isElementDisplayed(EssoCheckboxWithBiometricsRegistration));
        } else {
            Assert.assertTrue(isElementDisplayed(PpTcCheckboxWithoutBiometricsRegistration));
            Assert.assertTrue(isElementDisplayed(EssoCheckboxWithoutBiometricsRegistration));
        }
    }

    @Then("^user verifies the PP and TC related content$")
    public void user_verifies_the_pp_and_tc_related_content() throws Throwable {
        Assert.assertTrue(
                isTextMatch(PpTcCheckboxContentRegistration.getText(), ManualRegistrationConstants.PPTCCHECKBOXCONTENT));
    }

    @Then("^click the check box for accept in Register screen$")
    public void click_the_check_box_for_accept_in_Register_screen() throws Throwable {
        hideMobileKeyboard();
        if (isElementDisplayedWithoutAssert(TouchIdContent)) {
            clickButtonWithOutScroll(PpTcCheckboxWithBiometricsRegistration);
        } else {
            clickButtonWithOutScroll(PpTcCheckboxWithoutBiometricsRegistration);
        }
    }

    @Then("^user verifies country code$")
    public void user_verifies_country_code() throws Throwable {
        Assert.assertTrue(isElementDisplayed(CountryCodeRegisterScreen));
    }

    @Then("^user verifies the place holder in the textbox$")
    public void user_verifies_the_place_holder_in_the_textbox() {
        waitFor(2000);
    	Assert.assertTrue(
                isTextMatch(MobileNumberTextBoxManualRegistration.getText(), ManualRegistrationConstants.MOBILENUMBERCHECKBOXREGISTRATION));
    }

    @And("^user enters the mobile number in the Register screen$")
    public void user_enters_the_mobile_number_in_the_register_screen() throws Throwable {
        enterTextWithoutClick(MobileNumberTextBoxManualRegistration, ManualRegistrationConstants.VALIDMOBILENUMBERREGISTRATION);
    }

    @Then("^user verifies the place holder is not displayed$")
    public void user_verifies_the_place_holder_is_not_displayed() {
    	hideMobileKeyboard();
        Assert.assertTrue(
                isTextMatch(MobileNumberTextBoxManualRegistration.getText(), ManualRegistrationConstants.VALIDMOBILENUMBERCHECKBOXREGISTRATION));
    }

    @And("^user taps the info icon in the Mobile number section$")
    public void user_taps_the_info_icon_in_the_mobile_number_section() {
        clickButtonWithOutScroll(InfoButtonMobileRegistration);
    }

    @Then("^user verifies the content in the info popup of Mobile number section$")
    public void user_verifies_the_content_in_the_info_popup_of_mobile_number_section() {
        Assert.assertTrue(
                isTextMatch(InfoContentMobileRegistration.getText(), ManualRegistrationConstants.INFOCONTENTMOBILEREGISTRATION));
    }

    @And("^user taps on OK button in the info popup of Mobile number section$")
    public void user_taps_on_ok_button_in_the_info_popup_of_mobile_number_section() {
        clickButtonWithOutScroll(InfoPopupOkMobileRegistration);
    }

    @Then("^user lands in the Registration Screen after tapping OK from Mobile Info popup$")
    public void user_lands_in_the_Registration_Screen_after_tapping_OK_from_Mobile_Info_popup()  {
        Assert.assertTrue(
                isTextMatch(ContextualRegistrationPage.RegstrEmail.getText(), ManualRegistrationConstants.EMAILCHECKBOXREGISTRATION));
    }

    @Then("^user closes the keypad in the mobile section in Registration screen$")
    public void user_closes_the_keypad_in_the_mobile_section_in_registration_screen()  {
    	hideMobileKeyboard();
    	if (isElementDisplayedWithoutAssert(TouchIdContent)) {
            clickButtonWithOutScroll(PpTcCheckboxWithBiometricsRegistration);
        }
    	else {
    		hideMobileKeyboard();
    }
    }
    @Then("^user verifies the keyboard section$")
    public void user_verifies_the_keyboard_section() {
        Assert.assertTrue(isElementDisplayed(HideKeyPadMobileRegistration));
    }

    @And("^user enters the mobile number in the Register screen less than 10 digits$")
    public void user_enters_the_mobile_number_in_the_register_screen_less_than_10_digits() {
        enterTextWithoutClick(MobileNumberTextBoxManualRegistration, ManualRegistrationConstants.INVALIDMOBILENUMBERREGISTRATION);
    }

    @Then("^verify the inline error message for the mobile section in Registration screen$")
    public void verify_the_inline_error_message_for_the_mobile_section_in_registration_screen() {
        Assert.assertTrue(
                isTextMatch(InlineErrorMessageMobileRegistration.getText(), ManualRegistrationConstants.INLINEERRORMOBILENUMBERREGISTRATION));
    }

    @Then("^user verifies whether the country code is editable$")
    public void user_verifies_whether_the_country_code_is_editable() {
        staticTextValidation(CountryCodeRegisterScreen, ManualRegistrationConstants.COUNTRYCODEREGISTRATION);
    }

    @Then("^user verifies the entered mobile number is present with space$")
    public void user_verifies_the_entered_mobile_number_is_present_with_space() {
        Assert.assertTrue(
                isTextMatch(MobileNumberTextBoxManualRegistration.getText(), ManualRegistrationConstants.VALIDMOBILENUMBERCHECKBOXREGISTRATION));
    }

    @Then("^verify the mobile number header section in account$")
    public void verify_the_mobile_number_header_section_in_account() {
        Assert.assertTrue(
                isTextMatch(MobileNumberTitleAccount.getText(), ManualRegistrationConstants.MOBILENUMBERTITLEACCOUNT));
    }

    public void deleteMobileNumberAccount() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(MobileNumberEditAccountWithButton);
        waitFor(2000);
        clickButtonWithOutScroll(MobileNumberDeleteButtonAccount);
        waitFor(2000);
        clickButtonWithOutScroll(MobileDeleteButtonPopupAccount);
        waitFor(2000);
        clickButtonWithOutScroll(MobileDeleteOkPopupSuccessAccount);
    }

    @Then("^verify the add mobile number button in account$")
    public void verify_the_add_mobile_number_button_in_account() throws Throwable {
        if (isElementDisplayedWithoutAssert(MobileNumberButtonAccountWithButton)) {
            deleteMobileNumberAccount();
        } else {
            Assert.assertTrue(isElementDisplayed(MobileNumberButtonAccount));
        }
    }

    @And("^user taps on Add mobile number button$")
    public void user_taps_on_add_mobile_number_button() throws Throwable {
        if (isElementDisplayedWithoutAssert(MobileNumberButtonAccountWithButton)) {
            deleteMobileNumberAccount();
            waitFor(2000);
            clickButtonWithOutScroll(MobileNumberButtonAccount);
        } else {
            clickButtonWithOutScroll(MobileNumberButtonAccount);
        }
    }

    @Then("^Verify the title and the label$")
    public void verify_the_title_and_the_label() throws Throwable {
    	waitFor(2000);
    	Assert.assertTrue(
                isTextMatch(AddMobileNumberTitleEditAccount.getText(), ManualRegistrationConstants.ADDMOBILENUMBERTITLEACCOUNT));
//        Assert.assertTrue(
//                isTextMatch(AddMobileNumberSubtitleAccount.getText(), ManualRegistrationConstants.ADDMOBILENUMBERSUBTITLEACCOUNT));
    }

    @Then("^verify the add mobile number section in the account screen$")
    public void verify_the_add_mobile_number_section_in_the_account_screen() throws Throwable {
        waitFor(5000);
    	Assert.assertTrue(isElementDisplayed(CountryCodeRegisterScreen));
        Assert.assertTrue(
                isTextMatch(MobileTextBoxAddMobileAccount.getText(), ManualRegistrationConstants.MOBILENUMBERCHECKBOXREGISTRATION));
    }

    @Then("^verify the buttons in the add mobile number screen$")
    public void verify_the_buttons_in_the_add_mobile_number_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayed(CancelButtonAddMobileNumberAccount));
        Assert.assertTrue(isElementDisplayed(DoneButtonAddMobileNumberAccount));
    }

    @And("^user adds the mobile number in the Account screen$")
    public void user_adds_the_mobile_number_in_the_account_screen() throws Throwable {
        enterTextWithoutClick(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.VALIDMOBILENUMBERREGISTRATION);
    }

    @Then("^user verifies the place holder is not displayed in the Account Screen$")
    public void user_verifies_the_place_holder_is_not_displayed_in_the_account_screen() {
    	 hideMobileKeyboard();
    	 if(isElementDisplayedWithoutAssert(TouchIdContent)){
    		 Assert.assertTrue(
    	                isTextMatch(MobileTextBoxAddMobileAccount.getText(), ManualRegistrationConstants.VALIDMOBILENUMBERCHECKBOXREGISTRATION));
    	    }         
    	 else {
    	//clickButtonWithOutScroll(HideKeyPadMobileRegistration);
        Assert.assertTrue(
                isTextMatch(MobileTextBoxAddMobileAccount.getText(), ManualRegistrationConstants.VALIDMOBILENUMBERCHECKBOXREGISTRATION));
    }
    	 }

    @And("^user taps the Login Button alone$")
    public void user_taps_the_login_button_alone() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(AccountPage.AccountLoginBtn);
    }

    @Then("^user verify the Login Notification Title$")
    public void user_verify_the_login_notification_title() throws Throwable {
        waitFor(20000);
        if (isElementDisplayedWithoutAssert(ReinstalledAppPopupContent)) {
            clickButtonWithOutScroll(OkButtonMailSentPopup);
        }
        waitFor(10000);
        Assert.assertTrue(
                isTextMatch(AccountPage.Alertitle.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONTITLE));
    }

    @Then("^user verify the Login Notification content$")
    public void user_verify_the_login_notification_content() {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(MailResentSubtitle)) {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE1));
            } else {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle1.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE));
            }
        } else {
            if (isElementDisplayedWithoutAssert(MailResentSubtitle)) {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE));
            } else {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle1.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE1));
            }
        }

    }

    @Then("^user verify the OK button and Resend button$")
    public void user_verify_the_ok_button_and_resend_button() {
        Assert.assertTrue(isElementDisplayed(OkButtonMailSentPopup));
        Assert.assertTrue(isElementDisplayed(ResendMailButtonMailSentPopup));
    }

    @And("^user tap on OK button in the Login Notification popup$")
    public void user_tap_on_ok_button_in_the_login_notification_popup() throws Throwable {
        clickButtonWithOutScroll(OkButtonMailSentPopup);
    }

    @Then("^user verifies the Login screen$")
    public void user_verifies_the_login_screen() throws Throwable {
        waitFor(2000);
        Assert.assertTrue(isElementDisplayed(AccountPage.AccountLoginBtn));
    }

    @And("^user tap on Resend link in the Login Notification popup$")
    public void user_tap_on_resend_link_in_the_login_notification_popup() throws Throwable {
        clickButtonWithOutScroll(ResendMailButtonMailSentPopup);
    }

    @Then("^user verifies the mail sent popup$")
    public void user_verifies_the_mail_sent_popup() throws Throwable {
        waitFor(10000);
              Assert.assertTrue(
                isTextMatch(MailResentSubtitle.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE));
    }

    @Then("^user taps done button in the keypad$")
    public void user_taps_done_button_in_the_keypad() throws Throwable {
    	 hideMobileKeyboard();
    	 if(isElementDisplayedWithoutAssert(TouchIdContent)){
    		 clickButtonWithOutScroll(HideKeyPadMobileRegistration);
         }
        
    }

    @And("^user adds the mobile number less than 10 digits in the Account screen$")
    public void user_adds_the_mobile_number_less_than_10_digits_in_the_account_screen() throws Throwable {
        enterTextWithoutClick(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.INVALIDMOBILENUMBERREGISTRATION);
    }

    @And("^user taps on the Done button in the Add Mobile screen$")
    public void user_taps_on_the_done_button_in_the_add_mobile_screen() throws Throwable {
        clickButtonWithOutScroll(DoneButtonAddMobileNumberAccount);
        waitFor(5000);
    }

    @Then("^user verifies the inline error message in the mobile number$")
    public void user_verifies_the_inline_error_message_in_the_mobile_number() {
        Assert.assertTrue(
                isTextMatch(InlineErrorMessageMobileRegistration.getText(), ManualRegistrationConstants.INLINEERRORMOBILENUMBERREGISTRATION));
    }

    @Then("^user verifies the mobile number is added successfully$")
    public void user_verifies_the_mobile_number_is_added_successfully() throws Throwable {
        waitFor(2000);
        Assert.assertTrue(isElementDisplayed(MobileNumberAddedSuccessfullyPopup));
    }
    
    @Then("^user navigate to account screen and verifies the mobile number$")
    public void user_navigate_to_account_screen_and_verifies_the_mobile_number() throws Throwable {
    	waitFor(4000);
        Assert.assertTrue(isElementDisplayed(Mobilenumberverifies));
    }

    @Then("^user verifies the delete pop msg$")
    public void user_verifies_the_delete_pop_msg() throws Throwable {
        Assert.assertTrue(
                isTextMatch(MobileNumberDeletePopupContent.getText(), ManualRegistrationConstants.MOBILENUMBERDELETEACCOUNT));
        waitFor(5000);
    }

    @Then("^user verifies the mobile number is deleted successfully$")
    public void user_verifies_the_mobile_number_is_deleted_successfully() throws Throwable {
    	waitFor(5000);
    	Assert.assertTrue(
                isTextMatch(DeleteMobileSuccessPopup.getText(), ManualRegistrationConstants.MOBILENUMBERDELETEDPOPUP));
    }

    @Then("^user navigate to account screen and verifies the add mobile number section$")
    public void user_navigate_to_account_screen_and_verifies_the_add_mobile_number_section() throws Throwable {
       waitFor(5000);
    	Assert.assertTrue(isElementDisplayed(MobileNumberButtonAccount));
    }

    @And("^user taps on edit button Mobile section in the Account screen$")
    public void user_taps_on_edit_button_mobile_section_in_the_account_screen() throws Throwable {
    	waitFor(5000);
        if (isElementDisplayedWithoutAssert(MobileNumberButtonAccount)) {
            addMobileNumberAccount();
        }
    	clickButtonWithOutScroll(EditMobilenumber);
    }

    @And("^user taps on delete button in Edit Mobile Number section$")
    public void user_taps_on_delete_button_in_edit_mobile_number_section() throws Throwable {
        clickButtonWithOutScroll(DeleteMobilenumber);
    }

    @And("^user taps on delete button in the Delete Mobile popup msg$")
    public void user_taps_on_delete_button_in_the_delete_mobile_popup_msg() throws Throwable {
        clickButtonWithOutScroll(DeleteMobileButtonPopup);
        waitFor(5000);
    }
    
    @Then("^user Verify the enter there authentication credentials$")
    public void user_verify_the_enter_there_authentication_credentials() throws Throwable {
    	//staticTextValidation(PopUpMessage, PayOutsideConstants.RECEIPTMSG);
    }
    
    @Then("^verify the following content in Edit Mobile section$")
    public void verify_the_following_content_in_edit_mobile_section(DataTable arg1) throws Throwable  {
    	waitFor(5000);
    	Assert.assertTrue(
                isTextMatch(EditMobileNumberTitleEditAccount.getText(), ManualRegistrationConstants.EDITMOBILENUMBERHEADER));
    	Assert.assertTrue(
                isTextMatch(EditMobileNumberSubtitleAccount.getText(), ManualRegistrationConstants.EDITMOBILENUMBERSUBTITLE));
    	Assert.assertTrue(
                isTextMatch(DeleteMobilenumber.getText(), ManualRegistrationConstants.DELETEMOBILENUMBER));
    	Assert.assertTrue(
                isTextMatch(CountryCodeRegisterScreen.getText(), ManualRegistrationConstants.COUNTRYCODEREGISTRATION));
    	
    	Assert.assertTrue(
                isTextMatch(CancelButtonAddMobileNumberAccount.getText(), ManualRegistrationConstants.EDITMOBILECANCEL));
    	Assert.assertTrue(
                isTextMatch(DoneButtonAddMobileNumberAccount.getText(), ManualRegistrationConstants.EDITMOBILEDONE));
    	
    }
    
    @And("^user taps on contiue button$")
    public void user_taps_on_contiue_button() throws Throwable {
    	waitFor(10000);
        Assert.assertTrue(
                isTextMatch(MobileNumberAddedScreenTitle.getText(), ManualRegistrationConstants.MOBILENUMBERADDEDTITLE));
        Assert.assertTrue(
                isTextMatch(MobileNumberAddedScreenSubtitle.getText(), ManualRegistrationConstants.MOBILENUMBERADDEDSUBTITLE));
        clickButtonWithOutScroll(MobileNumberaddedContiuebutton);
        
    }
    @And("^user edit the mobile number$")
    public void user_edit_the_mobile_number() throws Throwable {
    	waitFor(1000);
    	clickButtonWithOutScroll(MobileNumberEditAccountWithButton);
    }
    
    @Then("^user verifies the remove inline error message in the mobile number$")
    public void user_verifies_the_remove_inline_error_message_in_the_mobile_number() throws Throwable {
    	waitFor(1000);
    	Assert.assertTrue(
                isTextMatch(MobileNumberTextBoxManualRegistration.getText(), ManualRegistrationConstants.MOBILECHECKBOXREGISTRATION));
    	
    	    }

    @And("^user taps back in the mobile number field$")
    public void user_taps_back_in_the_mobile_number_field() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            enterTextWithoutClick(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.INVALIDMOBILENUMBERREGISTRATION);
        } else {
            enterTextWithoutClick(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.VALIDMOBILENUMBERREGISTRATION);
        }
    }
    
    @And("^user remove edit the mobile number$")
    public void user_remove_edit_the_mobile_number() throws Throwable {
    	enterTextWithoutClick(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.INVALIDMOBILENUMBERREGISTRATION1);
    }
    
    @Then("^user verifies the inline error message in the edit mobile number screen with no number$")
    public void user_verifies_the_inline_error_message_in_the_edit_mobile_number_screen_with_no_number() throws Throwable {
    	waitFor(1000);
    	 Assert.assertTrue(
                 isTextMatch(InlineErrorNoNumberMobileRegistration.getText(), ManualRegistrationConstants.INLINEERRORNONUMBEREDITMOBILESCREEN));
    }
    @Then("^user 'Add Mobile Number' task under user profile section$")
    public void user_add_mobile_number_task_under_user_profile_section() throws Throwable {
    	waitFor(1000);
   	 Assert.assertTrue(
                isTextMatch(add_Moble_Num_Btn.getText(), ManualRegistrationConstants.PLEASEENTERMOBILE));
    }
    
    @Then("^user verifies the first name field$")
    public void user_verifies_the_first_name_field() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_FirstName, ManualRegistrationConstants.FirstName);
    }

    @Then("^user verifies the last name field$")
    public void user_verifies_the_last_name_field() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_LastName, ManualRegistrationConstants.LastName);
    }

    @Then("^user verifies the email address field$")
    public void user_verifies_the_email_address_field() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_Email, ManualRegistrationConstants.Email);
    }

    @Then("^user verifies the Password field$")
    public void user_verifies_the_password_field() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_Password, ManualRegistrationConstants.Password);
    }

    @Then("^user verifies the ConfirmPassword field$")
    public void user_verifies_the_confirmpassword_field() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_ConfirmPassword, ManualRegistrationConstants.ConfirmPassword);
    }

    @Then("^user verifies the show and hide togle$")
    public void user_verifies_the_show_and_hide_togle() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_Show, ManualRegistrationConstants.Show);
        waitFor(2000);
        clickButtonWithOutScroll(Reg_Show);
        waitFor(1000);
        staticTextValidation(Reg_Show, ManualRegistrationConstants.Hide);
    }

    @Then("^user verifies the mobile number field$")
    public void user_verifies_the_mobile_number_field() throws Throwable {
    	waitFor(1000);
        staticTextValidation(Reg_Mobile, ManualRegistrationConstants.Mobile);
    }

    @Then("^user verifies the I accept check box$")
    public void user_verifies_the_i_accept_check_box() throws Throwable {
    	isElementDisplayed(Reg_Iaccept);
    }

    @Then("^user verifies the I�d like check box$")
    public void user_verifies_the_id_like_check_box() throws Throwable {
    	isElementDisplayed(Reg_ilike);
    }

    @Then("^user verifies the back button$")
    public void user_verifies_the_back_button() throws Throwable {
    	isElementDisplayed(Reg_Back);
    }
    
    @Then("^user verifies the inline error message of the invalid email address$")
    public void user_verifies_the_inline_error_message_of_the_invalid_email_address() throws Throwable {
    	
    	staticTextValidation(InlineErrorEmptyFirstName, ManualRegistrationConstants.INVALIDEMAILFORMAT);
    }
    
    @Then("^enter the password field$")
	public void enter_the_password_field() throws Throwable {
		enterTextWithoutClick(RegstrPass, ManualRegistrationConstants.LoggedPassword);
	}
    
    @Then("^user verifies the inline error message of the$")
    public void user_verifies_the_inline_error_message_of_the() throws Throwable {
    	Assert.assertTrue(
                isTextMatch(InlineErrorEmptyPassword.getText(), ManualRegistrationConstants.INLINEERROREMPTYPWD));
    }
    
    @Then("^enter the password less then 8 characters$")
    public void enter_the_password_less_then_8_characters() throws Throwable {
    	enterTextWithoutClick(RegstrPass, ManualRegistrationConstants.LoggedPassword1);
    }
    
    @Then("^user taps on Privacy Policy$")
    public void user_taps_on_Privacy_Policy() throws Throwable {
        clickButtonWithOutScroll(PrivacyPolicyLink);
    }
    @When("^user taps on Terms and Conditions link in Register screen$")
    public void user_taps_on_Terms_and_Conditions_link_in_Register_screen() throws Throwable {
        clickButtonWithOutScroll(TermsAConditionLink);
    }
    
    @Then("^verify user display checkbox for marketing emails$")
    public void verify_user_display_checkbox_for_marketing_emails() throws Throwable {
    	staticTextValidation(Emailcheckbox, ManualRegistrationConstants.Emailcheckbox);
        
    }
    
    @Then("^verify user default maximum fuelling amount$")
    public void verify_user_default_maximum_fuelling_amount() throws Throwable {
    	staticTextValidation(Preauthamt, ManualRegistrationConstants.Setpreauthamt);
    }
    
    @When("^user taps on the \"([^\"]*)\" link$")
	public void user_taps_on_the_link(String arg1) throws Throwable {
		clickButtonWithOutScroll(MaximumFueling);
		
	}
    
	@Then("^it should open \"([^\"]*)\" pop-up$")
	public void it_should_open_pop_up(String arg1) throws Throwable {
		Assert.assertTrue(isElementDisplayed(mfpop));
	}
	
	@When("^user tap on \"([^\"]*)\" button$")
	public void user_tap_on_button(String arg1) throws Throwable {
		clickButtonWithOutScroll(cancelpop);
		
	}
	
	@Then("^user verifies the display a tick mark for the Add Mobile Number$")
    public void user_verifies_the_display_a_tick_mark_for_the_add_mobile_number() throws Throwable {
		isElementDisplayed(Reg_Back);
    }


    @And("^user enter the \"([^\"]*)\" in Registration fields and verify the values$")
    public void userEnterTheInRegistrationFieldsAndVerifyTheValues(String AsciiValueRange) throws Throwable {
        enterTextWithoutClick(ContextualRegistrationPage.RegstrFirstName, getTestDataValues(passwordclass_path, AsciiValueRange)[0]);
        enterTextWithoutClick(ContextualRegistrationPage.RegstrLastName, getTestDataValues(passwordclass_path, AsciiValueRange)[0]);
        enterTextWithoutClick(RegstrPass, getTestDataValues(passwordclass_path, AsciiValueRange)[0]);
        hideMobileKeyboard();
        enterTextWithoutClick(ContextualRegistrationPage.RegstrConfPass, getTestDataValues(passwordclass_path, AsciiValueRange)[0]);
    }

    @Then("^user verify the Login Notification content in the Login screen$")
    public void userVerifyTheLoginNotificationContentInTheLoginScreen() {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(MailResentSubtitle)) {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE1));
            } else {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle1.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE));
            }
        } else {
            if (isElementDisplayedWithoutAssert(MailResentSubtitle)) {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE));
            } else {
                Assert.assertTrue(
                        isTextMatch(MailResentSubtitle1.getText(), ManualRegistrationConstants.LOGINNOTIFICATIONSUBTITLE1));
            }
        }

    }

    public void addMobileNumberAccount() throws Throwable {
            clickButtonWithOutScroll(MobileNumberButtonAccount);
            waitFor(4000);
            enterTextWithoutClick(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.VALIDMOBILENUMBERREGISTRATION);
            clickButtonWithOutScroll(DoneButtonAddMobileNumberAccount);
            waitFor(3000);
            clickButtonWithOutScroll(InfoPopupOkMobileRegistration);
    }

    @Then("^user verifies the mobile updated password successfully popup$")
    public void userVerifiesTheMobileUpdatedPasswordSuccessfullyPopup() {
        waitFor(3000);
        Assert.assertTrue(
                isTextMatch(MobileNumberUpdatedPopup.getText(), ManualRegistrationConstants.MobileNumberUpdatedCt));
        Assert.assertTrue(
                isTextMatch(OkButton.getText(), ManualRegistrationConstants.OKBUTTON));
    }

    @And("^user enters the mobile number in the Account screen$")
    public void userEntersTheMobileNumberInTheAccountScreen() {
        enterTextWithoutScroll(MobileTextBoxAddMobileAccount, ManualRegistrationConstants.VALIDMOBILENUMBERREGISTRATION);
    }

    @Then("^user verifies the entered mobile number is present with space in the Account screen$")
    public void userVerifiesTheEnteredMobileNumberIsPresentWithSpaceInTheAccountScreen() {
        Assert.assertTrue(
                isTextMatch(MobileTextBoxAddMobileAccount.getText(), ManualRegistrationConstants.VALIDMOBILENUMBERCHECKBOXREGISTRATION));
    }

    @And("^user taps on cancel button in the Mobile number then the system should close the prompt$")
    public void userTapsOnCancelButtonInTheMobileNumberThenTheSystemShouldCloseThePrompt() {
        clickButtonWithOutScroll(CancelMobileButtonPopup);
    }

    @Then("^user verifies the mobile number task is not completed$")
    public void userVerifiesTheMobileNumberTaskIsNotCompleted() {
        Assert.assertTrue(isElementDisplayed(ProfileCompletionPage.enter_Mble_Num));
    }

    @And("^user taps on back and navigates to LID$")
    public void userTapsOnBackAndNavigatesToLID() {
        clickButtonWithOutScroll(Reg_Back);
    }

    @And("^user verifies the completion of PP and TC task$")
    public void userVerifiesTheCompletionOfPPAndTCTask() {
        clickButtonWithOutScroll(ProfileCompletionPage.PpAndTcProfile);
        staticTextValidation(ProfileCompletionPage.compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
        clickButtonWithOutScroll(OkButton);
    }

    @Then("^user verifies the completion of Set First Name and Last Name task$")
    public void userVerifiesTheCompletionOfSetFirstNameAndLastNameTask() {
        clickButtonWithOutScroll(ProfileCompletionPage.SetFirstnameProfile);
        staticTextValidation(ProfileCompletionPage.compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
        clickButtonWithOutScroll(OkButton);
    }

    @And("^user verifies the completion of Mobile number task$")
    public void userVerifiesTheCompletionOfMobileNumberTask() {
        clickButtonWithOutScroll(ProfileCompletionPage.MobileProfile);
        staticTextValidation(ProfileCompletionPage.compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
        clickButtonWithOutScroll(OkButton);
    }

    @Then("^user verifies the completion of Notification task$")
    public void userVerifiesTheCompletionOfNotificationTask() {
        ScrollTo(ProfileCompletionConstants.EMAILPREFERENCEPROFILE, ProfileCompletionConstants.IOSSCROLLUP, ProfileCompletionPage.email_task);
        clickButtonWithOutScroll(ProfileCompletionPage.NotificationsProfile);
        staticTextValidation(ProfileCompletionPage.compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
        clickButtonWithOutScroll(OkButton);
    }

    @And("^user skips the maximum fueling amount$")
    public void userSkipsTheMaximumFuelingAmount() {
        clickButtonWithOutScroll(SkipButtonMfa);
    }

    @And("^user taps on back button in complete your profile button$")
    public void userTapsOnBackButtonInCompleteYourProfileButton() {
        clickButtonWithOutScroll(BackButtonCompleteYourProfile);
    }

    @And("^user navigate to Maximum Fuelling Amount section in Account screen$")
    public void userNavigateToMaximumFuellingAmountSectionInAccountScreen() {
        if ("IOS".equalsIgnoreCase(platformName)) {
            waitForElement(AccountPage.PasswordEdit, 20);
            ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.LogOut);
        } else {
            ScrollTo(AccountConstants.MaximumFuellingAmount, AccountConstants.IOSSCROLLUP, AccountPage.MaxFuelEditLk);
        }
    }

    @Then("^user selects the receive mails checkbox$")
    public void userSelectsTheReceiveMailsCheckbox() {
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(MailsCheckboxRegisterNoBiometrics);
        } else {
            if (isElementDisplayedWithoutAssert(TouchIdContent)) {
                clickButtonWithOutScroll(MailsCheckboxRegisterWithBiometrics);
            } else {
                clickButtonWithOutScroll(MailsCheckboxRegisterNoBiometrics);
            }
        }
    }

    @Then("^user validates the title maximum fuelling amount picker$")
    public void userValidatesTheTitleMaximumFuellingAmountPicker() {
        Assert.assertTrue(isElementDisplayed(MfaPickerTitle));
    }

    @And("^user click on Loyalty points$")
    public void userClickOnLoyaltyPoints() {
        waitForElement(LoyaltyPointsFaq, 4000);
        clickButtonWithOutScroll(LoyaltyPointsFaq);
    }

    @And("^user click on nectar link in loyalty points$")
    public void userClickOnNectarLinkInLoyaltyPoints() {
        clickButtonWithOutScroll(NectarPintsFaq);
    }

    @And("^tap on FAQ link in the nectar section$")
    public void tapOnFAQLinkInTheNectarSection() {
        clickButtonWithOutScroll(FaqLinkLoyaltyPointsFaqs);
    }

    @Then("^user verifies the faq link$")
    public void userVerifiesTheFaqLink() {
        clickButtonWithOutScroll(EssoBrowserLink);
        Assert.assertTrue(
                isTextMatch(UrlFaqLinkHelp.getText(), ManualRegistrationConstants.URLFAQLINKHELP));
    }

    @And("^user verifies the Add nectar card screen from offers$")
    public void userVerifiesTheAddNectarCardScreenFromOffers() {
        waitForElement(AddYourNectarCardCtOffers,4000);
        Assert.assertTrue(
                isTextMatch(AddYourNectarCardCtOffers.getText(), ManualRegistrationConstants.ADDYOURNECTARCARDCTOFFERS));
        Assert.assertTrue(
                isTextMatch(AfterAddingYourCtOffers.getText(), ManualRegistrationConstants.AFTERADDINGYOURCARDCTOFFERS));
//        Assert.assertTrue(
//                isTextMatch(NectarCardSignUpCtOffers.getText(), ManualRegistrationConstants.NECTARCARDSIGNUPCTOFFERS));
    }

    @When("^user clicks on Sign up link in Add Nectar card screen$")
    public void userClicksOnSignUpLinkInAddNectarCardScreen() {
        clickButtonWithOutScroll(SignUpLinkOffers);
    }

    @Then("^user verifies the sign up link offers screen$")
    public void userVerifiesTheSignUpLinkOffersScreen() {
        clickButtonWithOutScroll(SignUpLinkBrowser);
        Assert.assertTrue(
                isTextMatch(NectarSignUpFaqLinkOffers.getText(), ManualRegistrationConstants.NECTARSIGNUPFAQLINKOFFERS));
    }

    @Then("^user validate the empty offers screen$")
    public void userValidateTheEmptyOffersScreen() {
        waitForElement(AppInstallAndLaunchPage.add_nectar_card_to,4000);
        isTextMatch(AppInstallAndLaunchPage.add_nectar_card_to.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_to_text);
        isTextMatch(AppInstallAndLaunchPage.get_offers.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_get_exclusive);
        isElementDisplayed(AppInstallAndLaunchPage.collection_points_message);
        isTextMatch(AppInstallAndLaunchPage.collection_points_header.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_collection_points_header);
        isTextMatch(AppInstallAndLaunchPage.more_about_collecting_point_link.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_More_about_collecting_points_link);
        isTextMatch(AppInstallAndLaunchPage.rewards_header.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_Rewards_header);
        isTextMatch(AppInstallAndLaunchPage.rewards_text.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_Rewards_text);
        isTextMatch(AppInstallAndLaunchPage.add_nectar_card.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_card_text);
    }

    @And("^user enters the \"([^\"]*)\" already registered mail address$")
    public void userEntersTheAlreadyRegisteredMailAddress(String userType) throws Throwable {
        enterTextWithoutClick(ContextualRegistrationPage.RegstrEmail, getTestDataValues(loginclass_path, userType)[0]);
    }
}