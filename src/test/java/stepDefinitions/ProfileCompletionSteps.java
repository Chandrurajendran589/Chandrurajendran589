package stepDefinitions;

import contants.AccountConstants;
import contants.ContextualRegistrationConstants;
import contants.FrictionlessFlowConstants;
import contants.ProfileCompletionConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

public class ProfileCompletionSteps extends ProfileCompletionPage {
    ContextualRegistrationPage contextualRegistrationPage = new ContextualRegistrationPage();
    NLIDPage nlidPage = new NLIDPage();
    AccountPage accountPage = new AccountPage();
    FrictionlessFlowPage frictionlessFlowPage = new FrictionlessFlowPage();

    @And("^user clicks on the register account$")
    public void user_clicks_on_the_register_account() {
        isElementDisplayed(registerAccount);
        clickButtonWithOutScroll(registerAccount);
    }

    @Then("^user fills the details on the registration screen$")
    public void user_fills_the_details_on_the_registration_screen() {
        isElementDisplayed(registerFirstName);
        enterTextWithoutScroll(registerFirstName, ProfileCompletionConstants.REGISTERFIRSTNAME);
        enterTextWithoutScroll(registerLastName, ProfileCompletionConstants.REGISTERLASTNAME);
        enterTextWithoutScroll(register_Email, ProfileCompletionConstants.REGISTEREMAIL);
        enterTextWithoutScroll(register_Password, ProfileCompletionConstants.REGISTERPASS);
        enterTextWithoutScroll(register_ConfirmPass, ProfileCompletionConstants.REGISTERPASS);
        hideMobileKeyboard();
        isElementDisplayed(register_AcceptPrivacy);
        clickButtonWithOutScroll(register_AcceptPrivacy);
        clickButtonWithOutScroll(register_Continue_Btn);
    }

    @And("^user skips the email verification page$")
    public void user_skips_the_email_verification_page() {
        waitFor(7000);
        isElementDisplayed(register_Email_Skip);
        clickButtonWithOutScroll(register_Email_Skip);
        isElementDisplayed(register_Emailskip_Anyway);
        clickButtonWithOutScroll(register_Emailskip_Anyway);

    }

    @And("^user verifies the thirty percent in indicator$")
    public void user_verifies_the_thirty_percent_in_indicator() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(thirty_percent_Indicator, 5);
//            isElementDisplayed(thirty_percent_Indicator);
            isElementEnabled(thirty_percent_Indicator);
            Assert.assertTrue(isTextMatch(thirty_percent_Indicator.getText(),
                    ProfileCompletionConstants.THIRTYPERCENTINDICATOR));
        } else {
            waitFor(4000);
            if (isElementDisplayedWithoutAssert(LIDProgress30)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress30.getText(), ProfileCompletionConstants.THIRTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress40))  {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            }
        }
    }

    @Then("^enter Email address as \"([^\"]*)\"$")
    public void enter_Email_address_as(String arg1) throws Throwable {
        enterTextWithoutClick(contextualRegistrationPage.RegstrEmail, arg1 + getSaltNumber()
                + ContextualRegistrationConstants.REGISTEREMAILDOM);

    }

    @Then("^enter Email address as invalid \\\"([^\\\"]*)\\\"$")
    public void enter_email_address_as_invalid_something(String arg1) throws Throwable {
        enterTextWithoutClick(contextualRegistrationPage.RegstrEmail, arg1 + getSaltNumber()
                + ContextualRegistrationConstants.REGISTEREMAILINVALID);

    }

    @And("^user taps on the complete profile$")
    public void user_taps_on_the_complete_profile() {
        waitForElement(profile_Completion_NLID, 8);
        clickButtonWithOutScroll(profile_Completion_NLID);
    }

    @And("^user clicks on the get started icon$")
    public void user_clicks_on_the_get_started_icon() {
        clickButtonWithOutScroll(getStarted_Add_Nectar);
    }

    @And("^user taps on 'Resend Email' link below the 'Open Inbox’ link$")
    public void user_taps_on_resend_email_link_below_the_open_inbox_link() throws Throwable {
        waitForElement(resend_email_btn_NLID,2);
        clickButtonWithOutScroll(resend_email_btn_NLID);
    }

    @And("^user verifies the confirmation pop up message$")
    public void user_verifies_the_confirmation_pop_up_message() throws Throwable {
        waitFor(5000);
        staticTextValidation(resend_email_Popup_message, ProfileCompletionConstants.RESENDEMAILPOPUP);
    }

    @Then("^user tap on OK button from the confirmation popup$")
    public void user_tap_on_ok_button_from_the_confirmation_popup() throws Throwable {
        clickButtonWithOutScroll(resend_popup_ok_btn);
    }

    @And("^user verifies the \"([^\"]*)\" screen$")
    public void user_verifies_the_something_screen(String strArg1) throws Throwable {
        waitForElement(complete_profile_Screen,4);
        staticTextValidation(complete_profile_Screen, ProfileCompletionConstants.COMPLETEYOURPROFILESCREEN);
    }

    @And("^user tap on the Start Fueling icon$")
    public void user_tap_on_the_start_fueling_icon() throws Throwable {
        clickButtonWithOutScroll(start_fueling_icon_NLID);
    }

    @Then("^system should display verification pop up$")
    public void system_should_display_verification_pop_up() throws Throwable {
        waitFor(4000);
        staticTextValidation(start_fueling_verficaton_msg, ProfileCompletionConstants.STARTFUELINGVERIFYMSG);
        staticTextValidation(VerificationRequiredPopupTitle, ProfileCompletionConstants.VERIFICATIONREQUIREDTITLE);
    }

    @And("^user tap on ok button$")
    public void user_tap_on_ok_button() throws Throwable {
        waitForElement(start_fueling_popup_btn, 6);
        clickButtonWithOutScroll(start_fueling_popup_btn);
    }

    @And("^user taps on Add Mobile Number$")
    public void user_taps_on_add_mobile_number() throws Throwable {
        waitForElement(add_Moble_Num_Btn,3);
        clickButtonWithOutScroll(add_Moble_Num_Btn);
    }

    @And("^user enters the mobile number$")
    public void user_enters_the_mobile_number() throws Throwable {

        enterTextWithoutScroll(enter_Mble_Num, ProfileCompletionConstants.MOBILENUMBER);
    }

    @Then("^user clicks done icon on the screen$")
    public void user_clicks_done_icon_on_the_screen() throws Throwable {

        clickButtonWithOutScroll(mble_num_Done_Btn);

    }

    @And("^user confirms the verification pop up$")
    public void user_confirms_the_verification_pop_up() throws Throwable {
        waitFor(3000);
//        if (isElementEnabled(mble_Num_Popup_Okbtn))
//        {
//            clickButtonWithOutScroll(mble_Num_Popup_Okbtn);
//        }
//        else {
//            staticTextValidation(mble_Num_Complted_popup, ProfileCompletionConstants.MOBILENUMCOMPLTDPOPUP);
//            clickButtonWithOutScroll(mble_Num_Popup_Okbtn);
//        }
    }

    @Then("^user clicks on Completed Add Mobile number Icon$")
    public void user_clicks_on_completed_add_mobile_number_icon() throws Throwable {
        waitForElement(add_Mobl_Num_cmpltd, 9);
        clickButtonWithOutScroll(add_Mobl_Num_cmpltd);
    }

    @And("^user verifies the Add Mobile Number confirmation pop up with message$")
    public void user_verifies_the_add_mobile_number_confirmation_pop_up_with_message() throws Throwable {

        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);

    }

    @And("^user accepts the pop up message$")
    public void user_accepts_the_pop_up_message() throws Throwable {
        waitForElement(completd_Mble_Num_Popupok_Btn,8);
        clickButtonWithOutScroll(completd_Mble_Num_Popupok_Btn);
    }

    @When("^user clicks on Login Icon$")
    public void user_clicks_on_login_icon() throws Throwable {
        waitFor(6000);
        clickButtonWithOutScroll(nlidPage.login_Button_Nlid);
    }

    @And("^user enters the valid Username and password$")
    public void user_enters_the_valid_username_and_password() throws Throwable {


        enterTextWithoutScroll(valid_Username_Login, ProfileCompletionConstants.VALIDEMAILID);
        enterTextWithoutScroll(valid_Password_Login, ProfileCompletionConstants.REGISTERPASS);
    }

    @Then("^user taps on Login Icon in Login screen$")
    public void user_taps_on_login_icon_in_login_screen() throws Throwable {

        clickButtonWithOutScroll(nlidPage.login_Button_Login);
        waitFor(7000);
    }

    @When("^user verify without tick mark on the task$")
    public void user_verify_without_tick_mark_on_the_task() throws Throwable {

//        Assert.assertTrue(isElementDisplayed(email_task));
        isElementEnabled(email_task);
    }

    @Then("^user verifies the completed Accept privacy and Terms task$")
    public void user_verifies_the_completed_accept_privacy_and_terms_task() throws Throwable {
        waitFor(4000);
//        Assert.assertTrue(isElementDisplayed(completed_Privacy_And_Terms));
        isElementEnabled(completed_Privacy_And_Terms);
    }

    @And("^user verifies the completed Set First Name and Last Name task$")
    public void user_verifies_the_completed_set_first_name_and_last_name_task() throws Throwable {
        waitFor(4000);
//        Assert.assertTrue(isElementDisplayed(completed_First_Last_Name));
        isElementEnabled(completed_First_Last_Name);
    }

    @And("^user verifies the completed Notifications task$")
    public void user_verifies_the_completed_notifications_task() throws Throwable {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(isElementDisplayed(completed_Notification));
        } else {
            ScrollTo(ProfileCompletionConstants.EMAILTASK, ProfileCompletionConstants.IOSSCROLLUP, email_task);
            waitFor(1500);
            Assert.assertTrue(isElementEnabled(completed_Notification));
        }
    }

    @Then("^user taps on maximum fueling amount$")
    public void user_taps_on_maximum_fueling_amount() throws Throwable {
        if (isElementDisplayedWithoutAssert(CompleteYourProfile30)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile30.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE30));
        } else if(isElementDisplayedWithoutAssert(CompleteYourProfile40))  {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile40.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE40));
        } else if (isElementDisplayedWithoutAssert(CompleteYourProfile50)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile50.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE50));
        }
        waitForElement(maximum_Fueling_Btn,5);
        clickButtonWithOutScroll(maximum_Fueling_Btn);
    }
    @Then("^user clicks on Add nectar card$")
    public void userClicksOnAddNectarCard() {
        ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, OkNect);
        waitFor(2000);
        clickButtonWithOutScroll(OkNect);
    }

    @Then("^user clicks on Set Maximum Amount button$")
    public void user_clicks_on_set_maximum_amount_button() throws Throwable {
        waitForElement(set_Maximum_Fueling_Btn,2);
        clickButtonWithOutScroll(set_Maximum_Fueling_Btn);
    }

    @And("^user sets the fueling amount and clicks ok button$")
    public void user_sets_the_fueling_amount_and_clicks_ok_button() throws Throwable {

        clickButtonWithOutScroll(maximum_Fueling_ok_btn);
    }

    @And("^user clicks on continue button in maximum fueling screen$")
    public void user_clicks_on_continue_button_in_maximum_fueling_screen() throws Throwable {
        waitForElement(maximum_fueling_continu_btn,5);
        clickButtonWithOutScroll(maximum_fueling_continu_btn);
    }

    @Then("^user verifies \"([^\"]*)\" task is completed$")
    public void user_verifies_something_task_is_completed(String strArg1) throws Throwable {

        clickButtonWithOutScroll(maximum_Fueling_Btn);
        waitForElement(maximum_Fueling_Amnt_Compltd_Msg,2);
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
        isElementEnabled(completd_Mble_Num_Popupok_Btn);
        Assert.assertTrue(isElementDisplayed(completd_Mble_Num_Popupok_Btn));
        clickButtonWithOutScroll(completd_Mble_Num_Popupok_Btn);
    }

    @Then("^user clicks on Add card icon$")
    public void user_clicks_on_add_card_icon() throws Throwable {

        clickButtonWithOutScroll(compltd_Add_Nectar);

    }

    @And("^user verifies the completed pop up message and clicks ok button$")
    public void user_verifies_the_completed_pop_up_message_and_clicks_ok_button() throws Throwable {
//        staticTextValidation(compltd_Add_Nectar_Msgpopup, ProfileCompletionConstants.ALREADYCOMPLETEDMSGPOPUP);
//        clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
//        Assert.assertTrue(isElementDisplayed(completd_Mble_Num_Popupok_Btn));
        isElementEnabled(completd_Mble_Num_Popupok_Btn);
        clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
    }

    @Then("^user clicks back button$")
    public void user_clicks_back_button() throws Throwable {

        clickButtonWithOutScroll(app_Back_Button);
    }

    @And("^user verifies the circular indicator$")
    public void user_verifies_the_circular_indicator() throws Throwable {

        isElementDisplayed(percent_progress);
    }

    @And("^user clicks on more icon$")
    public void user_clicks_on_more_icon() throws Throwable {
        waitForElement(more_icon, 9);
        clickButtonWithOutScroll(more_icon);
    }

    @Then("^user clicks on Account$")
    public void user_clicks_on_account() throws Throwable {

        clickButtonWithOutScroll(account_icon);
        waitFor(6000);
    }

    @Then("^user clicks on Add nectar card button$")
    public void user_clicks_on_add_nectar_card_button() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.AccountNectarCardSection);
            //scrollToElement(add_nectar_Account);
            clickButtonWithOutScroll(add_nectar_Account);
        } else {
            ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.LogOut);
            waitForElement(add_nectar_Account,5000);
            clickButtonWithOutScroll(add_nectar_Account);
        }
    }

    @And("^user enters the card details and click next icon$")
    public void user_enters_the_card_details_and_click_next_icon() throws Throwable {

        enterTextWithoutScroll(enter_nectar_card_Accnt, ProfileCompletionConstants.NECTARCARDNUMBER);
        hideMobileKeyboard();
        clickButtonWithOutScroll(accnt_Nectar_Next);

    }

    @And("^user clicks on verify later$")
    public void user_clicks_on_verify_later() throws Throwable {

        clickButtonWithOutScroll(accnt_Nectar_verify_later);
    }

    @Then("^user skips the verification page$")
    public void user_skips_the_verification_page() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(accnt_Nectar_Skip);
    }

    @And("^user verifies the account page$")
    public void user_verifies_the_account_page() throws Throwable {
        waitFor(3000);
        staticTextValidation(account_Page, ProfileCompletionConstants.ACCOUNTSCREEN);
    }

    @And("^user clicks on offer icon$")
    public void user_clicks_on_offer_icon() throws Throwable {
        waitFor(4000);
        clickButtonWithOutScroll(offer_icon);
    }

    @Then("^user clicks Add Nectar Card from offer screen$")
    public void user_clicks_add_nectar_card_from_offer_screen() throws Throwable {
        waitFor(3000);
        clickButtonWithOutScroll(add_Nectar_Offer);
    }

    @And("^user clicks on continue in add nectar card$")
    public void user_clicks_on_continue_in_add_nectar_card() throws Throwable {
        waitFor(3000);
//        clickButtonWithOutScroll(add_Nectar_Continue_Offer);
        waitFor(3000);
        clickButtonWithOutScroll(accnt_Nectar_verify_later);
    }

    @Then("^user clicks cancels and skips the verification page$")
    public void user_clicks_cancels_and_skips_the_verification_page() throws Throwable {

        clickButtonWithOutScroll(add_Nectar_cancel);
    }

    @And("^user verifies the offer page$")
    public void user_verifies_the_offer_page() throws Throwable {
        waitFor(5000);
//        Assert.assertTrue(isElementDisplayed(offer_screen));
            isElementEnabled(offer_screen);
    }

    @And("^user clicks a Add card in Account screen$")
    public void user_clicks_a_Add_card_in_Account_screen() throws Throwable {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(add_card_button);
        } else {
//            ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.LogOut);
//            ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLDOWN, add_card_button);
            ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, AccountConstants.IOSSCROLLUP, add_card_button);
            clickButtonWithOutScroll(add_card_button);
        }

    }

    @And("^user enter the email id in paypal screen$")
    public void user_enter_the_email_id_in_paypal_screen() throws Throwable {

        waitFor(7000);
        isElementDisplayed(paypal_Email_id);
        enterTextWithoutScroll(paypal_Email_id, ProfileCompletionConstants.PAYPALUSERNAME);
    }

    @Then("^user enters the password in paypal screen$")
    public void user_enters_the_password_in_paypal_screen() throws Throwable {

        enterTextWithoutScroll(paypal_Password, ProfileCompletionConstants.PAYPALPASSWORD);
    }

    @Then("^user clicks on login button in paypal screen$")
    public void user_clicks_on_login_button_in_paypal_screen() throws Throwable {

        clickButtonWithOutScroll(paypal_Login_btn);
    }

    @And("^user clicks on continue button$")
    public void user_clicks_on_continue_button() throws Throwable {
        waitFor(9000);
        waitFor(9000);
        waitFor(9000);
        clickButtonWithOutScroll(paypal_Agree_Cookies);
        clickButtonWithOutScroll(paypal_Continue_Btn);
    }

    @Then("^user clicks on Agree and Continue Button$")
    public void user_clicks_on_agree_and_continue_button() throws Throwable {

        clickButtonWithOutScroll(paypal_Agree_Continue);
    }

    @Then("^user verifies the success messgae and clicks on Continue$")
    public void user_verifies_the_success_messgae_and_clicks_on_continue() throws Throwable {

        //staticTextValidation(paypal_Completed_Success_Msg, ProfileCompletionConstants.PAYPALSUCCESSMSG);
        clickButtonWithOutScroll(paypal_Compltd_Continue_Btn);
    }

    @Then("^user verifies the Nectar Added Success Message$")
    public void user_verifies_the_nectar_added_success_message() throws Throwable {

        staticTextValidation(nectar_Card_Success_Msg, ProfileCompletionConstants.NECTARCARDSUCCESSMSG);
    }

    @Then("^user clicks on Add nectar$")
    public void user_clicks_on_add_nectar() throws Throwable {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(compltd_nectar_Card_Btn);
        } else {
            if (isElementDisplayedWithoutAssert(compltd_nectar_Card_Btn)) {
                clickButtonWithOutScroll(compltd_nectar_Card_Btn);
            } else {
                ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, compltd_nectar_Card_Btn);
                waitFor(2000);
                clickButtonWithOutScroll(compltd_nectar_Card_Btn);
            }
        }
    }

    @Then("^user taps on add payment method$")
    public void user_taps_on_add_payment_method() throws Throwable {
        waitFor(3000);
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(payment_Methd_Btn);
        } else {
            ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, payment_Methd_Btn);
            clickButtonWithOutScroll(payment_Methd_Btn);
        }
    }



    @And("^clicks on \"([^\"]*)\" icon$")
    public void clicks_on_something_icon(String strArg1) throws Throwable {

        clickButtonWithOutScroll(payment_Mthd_Paypal_Btn);
    }

    @Then("^user verifies the payment method task as completed$")
    public void user_verifies_the_payment_method_task_as_completed() throws Throwable {

        clickButtonWithOutScroll(payment_Methd_Btn);
        staticTextValidation(compltd_Add_Nectar_Msgpopup, ProfileCompletionConstants.ALREADYCOMPLETEDMSGPOPUP);
        clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
        androidBack();
    }

    @Then("^user clicks on edit in the added payment method$")
    public void user_clicks_on_edit_in_the_added_payment_method() throws Throwable {
        ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, payment_Edit_Btn);
        clickButtonWithOutScroll(payment_Edit_Btn);
    }

    @Then("^user click on the signout icon in the popup$")
    public void user_click_on_the_signout_icon_in_the_popup() throws Throwable {

        clickButtonWithOutScroll(payment_Edit_Signout_Btn);
    }

    @And("^user navigated to NLID Screen$")
    public void user_navigated_to_nlid_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(9000);
            androidBack();
           } else {
            clickButtonWithOutScroll(fuel);
        }
        waitFor(3000);
    }

    @Then("^user verifies the payment method$")
    public void user_verifies_the_payment_method() throws Throwable {

    clickButtonWithOutScroll(payment_Methd_Btn);
    clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
    }

    @And("^user closes the pop up of nectar card$")
    public void user_closes_the_pop_up_of_nectar_card() throws Throwable {

        waitFor(9000);
        if (isElementDisplayedWithoutAssert(frictionlessFlowPage.completed_Popup)){
            clickButtonWithOutScroll(frictionlessFlowPage.completed_Popup);
        }
    }


    @Then("^user verifies the completed features in Account$")
    public void user_verifies_the_completed_features_in_account() throws Throwable {

        isElementDisplayed(compltd_Accnt_Featrs);
    }

    @Then("^user verifies the circular indicator in the LID$")
    public void user_verifies_the_circular_indicator_in_the_LID() throws Throwable {
            waitFor(2000);
            isElementEnabled(start_Fueling_Icon);
    }

    @Then("^user verifies the nectar points in dashboard$")
    public void user_verifies_the_nectar_points_in_dashboard() throws Throwable {
        Assert.assertTrue(isElementEnabled(enectarpoints));
    }

    @Then("^user verifies the progress bar in the Complete your Profile screen$")
    public void user_verifies_the_progress_bar_in_the_complete_your_profile_screen() throws Throwable {
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(CompleteYourProfile40)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile40.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE40));
        } else if (isElementDisplayedWithoutAssert(CompleteYourProfile50))  {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile50.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE50));
        } else if (isElementDisplayedWithoutAssert(CompleteYourProfile60)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile60.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE60));
        }
    }

    @Then("^user verifies the tick mark in the Maximum fuelling Amount$")
    public void user_verifies_the_tick_mark_in_the_maximum_fuelling_amount() throws Throwable {
        waitFor(3000);
        Assert.assertTrue(isElementDisplayed(TickMarkMfaCompleteYourProfile));
    }

    @Then("^verify the body of the already completed task$")
    public void verify_the_body_of_the_already_completed_task() throws Throwable {
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
    }

    @Then("^user lands in the Complete your Profile screen$")
    public void user_lands_in_the_complete_your_profile_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayed(add_Mobl_Num_cmpltd));
    }

    @Then("^user verifies the nectar thumbnails in the LID$")
    public void user_verifies_the_nectar_thumbnails_in_the_lid() throws Throwable {
        if (isElementEnabled(enectarpointsThumbnail)) {
            Assert.assertTrue(isElementEnabled(enectarpointsThumbnail));
        }
    }

    @Then("^user verifies the progress in the LID$")
    public void user_verifies_the_progress_in_the_lid() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(1000);
            isElementEnabled(thirty_percent_Indicator);
            Assert.assertTrue(isTextMatch(thirty_percent_Indicator.getText(),
                    ProfileCompletionConstants.THIRTYPERCENTINDICATOR));
        } else {
            waitFor(4000);
            if (isElementDisplayedWithoutAssert(LIDProgress40)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50))  {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress60)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress60.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
            }
        }
    }

    @Then("^user verifies the User Profile section in Complete your profile screen$")
    public void userVerifiesTheUserProfileSectionInCompleteYourProfileScreen() {
        waitFor(6000);
        Assert.assertTrue(isElementEnabled(UserProfileTitleProfile));
        Assert.assertTrue(isTextMatch(PpAndTcProfile.getText(), ProfileCompletionConstants.PPTANDCPROFILE));
        Assert.assertTrue(isTextMatch(EmailVerifiedProfile.getText(), ProfileCompletionConstants.EMAILPROFILE));
        Assert.assertTrue(isTextMatch(SetFirstnameProfile.getText(), ProfileCompletionConstants.FNAMEPROFILE));
        Assert.assertTrue(isTextMatch(MobileProfile.getText(), ProfileCompletionConstants.MOBILEPROFILE));
        Assert.assertTrue(isElementEnabled(PaymentTitleProfile));
//        Assert.assertTrue(isTextMatch(maximum_Fueling_Btn.getText(), ProfileCompletionConstants.MFAPROFILE));
    }

    @Then("^user verifies permission settings in the Complete your profile screen$")
    public void userVerifiesPermissionSettingsInTheCompleteYourProfileScreen() {
        ScrollTo(ProfileCompletionConstants.EMAILPREFERENCEPROFILE, ProfileCompletionConstants.IOSSCROLLUP, email_task);
        waitFor(2000);
        Assert.assertTrue(isElementEnabled(PermissionsTitle));
        Assert.assertTrue(isTextMatch(LocationServicesProfile.getText(), ProfileCompletionConstants.LOCATIONSERVICESPROFILE));
        Assert.assertTrue(isTextMatch(NotificationsProfile.getText(), ProfileCompletionConstants.NOTIFICATIONSPROFILE));
    }

    @Then("^user verifies Email settings in the Complete your profile screen$")
    public void userVerifiesEmailSettingsInTheCompleteYourProfileScreen() {
        Assert.assertTrue(isElementEnabled(EmailTitleProfie));
        Assert.assertTrue(isTextMatch(email_task.getText(), ProfileCompletionConstants.EMAILPREFERENCEPROFILE));
    }

    @Then("^user verifies Payment and Loyalty in the Complete your profile screen$")
    public void userVerifiesPaymentAndLoyaltyInTheCompleteYourProfileScreen() {
        Assert.assertTrue(isElementEnabled(LoyaltyTitleProfile));
//        isElementEnabled(LoyaltyTitleProfile);
        Assert.assertTrue(isTextMatch(add_Nectar_Button.getText(), ProfileCompletionConstants.ADDNECTARCARD));
        ScrollTo(ProfileCompletionConstants.PAYMENTMETHODPROFILE, ProfileCompletionConstants.IOSSCROLLDOWN, payment_Methd_Btn);
//        ScrollTo(ProfileCompletionConstants.PAYMENTMETHODPROFILE, ProfileCompletionConstants.IOSSCROLLUP, payment_Methd_Btn);
        if (isElementDisplayedWithoutAssert(payment_Methd_Btn)) {
            Assert.assertTrue(isTextMatch(payment_Methd_Btn.getText(), ProfileCompletionConstants.PAYMENTMETHODPROFILE));
        }
    }

    @And("^user sets the pin number from Account screen$")
    public void user_sets_the_pin_number_from_Account_screen() throws Throwable {
        waitFor(3000);
        enterTextWithoutClick(card_Pin_Num1, FrictionlessFlowConstants.PIN1 );
        enterTextWithoutClick(card_Pin_Num2, FrictionlessFlowConstants.PIN2);
        enterTextWithoutClick(card_Pin_Num3, FrictionlessFlowConstants.PIN3);
        enterTextWithoutClick(card_Pin_Num4, FrictionlessFlowConstants.PIN4);
    }

    @Then("^user clicks on continue in Edit button$")
    public void user_clicks_on_continue_in_Edit_button() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(payment_Pin_Continue_Btn);
    }

    @Then("^user clicks on ok button in esso pin successful$")
    public void user_clicks_on_ok_button_in_esso_pin_successful() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(pin_Confirm_Ok_Btn);
    }

    @Then("^user taps delete in the Edit Payment Method screen$")
    public void userTapsDeleteInTheEditPaymentMethodScreen() {
        clickButtonWithOutScroll(deleteButtonEditPaymentMethod);
    }

    @Then("^user taps on delete button in the Delete popup msg$")
    public void userTapsOnDeleteButtonInTheDeletePopupMsg() {
        clickButtonWithOutScroll(DeletePopupButtonDebitCard);
        waitFor(5000);
    }

    @Then("^user verifies whether the task is completed$")
    public void userVerifiesWhetherTheTaskIsCompleted() {
        waitFor(2000);
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
//        Assert.assertTrue(isElementDisplayed(completd_Mble_Num_Popupok_Btn));
        isElementEnabled(completd_Mble_Num_Popupok_Btn);
    }
    
    @And("^user verifies the 40% profile completion circular indicator$")
    public void user_verifies_the_40_profile_completion_circular_indicator() throws Throwable {
    	waitFor(1000);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(Profile40completion, ProfileCompletionConstants.PROFILECOMPLETE40);
        } else {
            if (isElementDisplayedWithoutAssert(CompleteYourProfile30)) {
                Assert.assertTrue(
                        isTextMatch(CompleteYourProfile30.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE30));
            } else if(isElementDisplayedWithoutAssert(CompleteYourProfile40))  {
                Assert.assertTrue(
                        isTextMatch(CompleteYourProfile40.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE40));
            } else if (isElementDisplayedWithoutAssert(CompleteYourProfile50)) {
                Assert.assertTrue(
                        isTextMatch(CompleteYourProfile50.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE50));
            }
        }
    }

    @When("^user taps on the Email Preferences in Complete your profile screen$")
    public void userTapsOnTheEmailPreferencesInCompleteYourProfileScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            ScrollTo(ProfileCompletionConstants.EMAILTASK, ProfileCompletionConstants.IOSSCROLLUP, email_task);
            waitForElement(email_task, 3);
            clickButtonWithOutScroll(email_task);
        }
        else {
//            ScrollToDown(ProfileCompletionConstants.EMAILTASK, ProfileCompletionConstants.IOSSCROLLUP, EmailVerifiedProfile);
            waitForElement(email_task, 9);
            clickButtonWithOutScroll(email_task);
        }
    }

    @And("^user verifies the Email Preferences screen$")
    public void userVerifiesTheEmailPreferencesScreen() {

        if(platformName.equalsIgnoreCase("iOS")) {
            waitForElement(email_task,5);
            Assert.assertTrue(isElementDisplayed(emailPreference_tellustext));
            Assert.assertTrue(isElementDisplayed(getTextElement("Personalised offers from Esso")));
            Assert.assertTrue(isElementDisplayed(getTextElement("I would not like to receive any promotional emails from Esso")));
            isElementDisplayed(emailPreference_accept_checkbox);
        }
        else
        {
            staticTextValidation(account_Page, ProfileCompletionConstants.EMAILTASK);
            isElementEnabled(emailPreference_tellustext);
            Assert.assertTrue(isElementEnabled(getTextElement("Personalised offers from Esso")));
            Assert.assertTrue(isElementEnabled(getTextElement("I would not like to receive any promotional emails from Esso")));
            isElementEnabled(emailPreference_accept_checkbox);
        }
    }

    @And("^user taps on the accept email preferences$")
    public void userTapsOnTheAcceptEmailPreferences() {

            clickButtonWithOutScroll(emailPreference_accept_checkbox);

    }

    @And("^User taps on Continue button in the email preferences set successfully screen$")
    public void userTapsOnContinueButtonInTheEmailPreferencesSetSuccessfullyScreen() {
        if(platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(getButtonElement("CONTINUE"));
        }
        else
        {
            waitForElement(paypal_Compltd_Continue_Btn, 9);
            clickButtonWithOutScroll(paypal_Compltd_Continue_Btn);
        }
    }


    @Then("^user verifies whether the email preferences task is completed$")
    public void userVerifiesWhetherTheEmailPreferencesTaskIsCompleted() {
        waitFor(5000);
        isElementEnabled(getTextElement("Email preferences set successfully"));
        Assert.assertTrue(isElementDisplayed(getTextElement("Email preferences set successfully")));
        Assert.assertTrue(isElementDisplayed((getTextElement("Thank you for letting us know what content you want to receive via email."))));
//        Assert.assertTrue(isElementDisplayed(emailpreference_success_image));
    }

    @Then("^user taps on location services and confirm whether it is completed$")
    public void userTapsOnLocationServicesAndConfirmWhetherItIsCompleted() {
        waitForElement(LocationServicesProfile,3);
        clickButtonWithOutScroll(LocationServicesProfile);
        waitFor(3000);
        if(already_completed_Popupok_Btn.isEmpty()) {
            Assert.assertTrue(isElementDisplayed(getTextElement("Let us locate your nearest stations")));
            Assert.assertTrue(isElementDisplayed(getTextElement("Then see which is most convenient and get directions if required.")));
            clickButtonWithOutScroll(getButtonElement("CONTINUE"));
            waitForElement(new GuestCheckOutPage().AllowLocationWhileUsingTheApp);
            clickButtonWithOutScroll(new GuestCheckOutPage().AllowLocationWhileUsingTheApp);
            waitFor(5000);
            isElementEnabled(MenuSteps.LocationPermissionSuccessScreen);
            Assert.assertTrue(isElementEnabled(MenuSteps.LocationPermissionSuccessScreen));
            Assert.assertTrue(isElementEnabled(getTextElement("You will always be able to quickly navigate to your favourite station.")));
            clickButtonWithOutScroll(getButtonElement("CONTINUE"));
        }else {
            waitForElement(already_completed_Popupok_Btn.get(0),3);
            clickButtonWithOutScroll(already_completed_Popupok_Btn.get(0));
            clickButtonWithOutScroll(app_Back_Button);
        }
    }

    @And("^User taps on \"([^\"]*)\" button in the mobile number added successfully screen$")
    public void userTapsOnButtonInTheMobileNumberAddedSuccessfullyScreen(String label) throws Throwable {
        if(platformName.equalsIgnoreCase("iOS")) {
//            waitForElement(getButtonElement(label),8);
//            clickButtonWithOutScroll(getButtonElement(label));
            waitForElement(mble_Num_Popup_Okbtn);
            clickButtonWithOutScroll(mble_Num_Popup_Okbtn);
            clickButtonWithOutScroll(mble_Num_Popup_Cont);
        }
        else
        {
            waitForElement(mble_Num_Popup_Okbtn);
            clickButtonWithOutScroll(mble_Num_Popup_Okbtn);
        }

    }

    @And("^User taps on Continue button in the email preferences screen$")
    public void userTapsOnContinueButtonInTheEmailPreferencesScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(getButtonElement("CONTINUE"));
        }
        else
        {
                clickButtonWithOutScroll(emailcontinue);
        }
    }

    @When("^user navigates to the top of the screen in Complete your profile screen$")
    public void userNavigatesToTheTopOfTheScreenInCompleteYourProfileScreen() {
        ScrollTo(ProfileCompletionConstants.PPTANDCPROFILE, ProfileCompletionConstants.IOSSCROLLDOWN, completed_Privacy_And_Terms);
        waitFor(1500);
    }

//    @Then("^user clicks on Add nectar card$")
//    public void userClicksOnAddNectarCard() {
//        ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, OkNect);
//        waitFor(2000);
//        clickButtonWithOutScroll(OkNect);
//    }
}
