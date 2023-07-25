package stepDefinitions;

import contants.AccountConstants;
import contants.AppInstallAndLaunchConstants;
import contants.GuestCheckOutConstants;
import contants.OffersContants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;
import pages.AccountPage;
import pages.ContextualRegistrationPage;
import pages.OffersPage;
import pages.PayOutsidePage;

import javax.swing.*;

public class OffersSteps extends OffersPage {
	ContextualRegistrationPage ContextualRegistrationPage = new ContextualRegistrationPage();
	AccountPage AccountPage = new AccountPage();
	AppInstallAndLaunchSteps AppInstallAndLaunchSteps = new AppInstallAndLaunchSteps();

	@Given("^reset the app$")
	public void reset_the_app() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			((AndroidDriver) driver).resetApp();
		}
 	else {
			((IOSDriver) driver).resetApp();
		}
	}

	@Then("^user clicks on continue button in station screen$")
	public void user_clicks_on_continue_button_in_station_screen() throws Throwable {
		waitFor(5000);
		clickButtonWithOutScroll(StationContinue);
	}

	@And("^allow location access$")
	public void allow_location_access() throws Throwable {
		waitFor(7000);
		if(platformName.equalsIgnoreCase("Android"))
		{
			if(isAlertPresent())
			{
				driver.switchTo().alert().accept();
			}
			else {
				System.out.println(" Alert is not present");
			}

		}
		else {
			clickButtonWithOutScroll(StationAllow);
			if (isElementDisplayedWithoutAssert(StationAllow)) {
				waitFor(7000);
				clickButtonWithOutScroll(StationAllow);
				waitFor(7000);
			}
		}
	}

	@When("^user enters search term in station finder$")
	public void user_enters_search_term_in_station_finder() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			waitFor(5000);
			enterTextWithoutScroll(StationSearch, "London , UK");
			waitFor(5000);
			getCoordinates(StationSearch);
			waitFor(1000);
			androidTap();
			waitFor(5000);
		}
		else {
			waitFor(5000);
			enterTextWithoutScroll(StationSearch, "London , UK");
			waitFor(3000);
			actionClick(StationSelect);
		}
	}

	@When("^user tap on list view$")
	public void user_tap_on_list_view() throws Exception {
		waitFor(7000);
		clickButtonWithOutScroll(listStations);
		waitFor(4000);
	}

	@Then("^user selects a station from the list$")
	public void user_selects_a_station_from_the_list() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			clickButtonWithOutScroll(Station1.get(0));

		}
		else{
			clickButtonWithOutScroll(address_Station_List);
			waitFor(5000);
		}
	}

	@Then("^user should see the copy text displayed on the modal pop\"([^\"]*)\" up in station finder for logged in user with non verified nectar$")
	public void user_should_see_the_copy_text_displayed_on_the_modal_pop_up_in_station_finder_for_logged_in_user_with_non_verified_nectar(
			String arg1) throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			waitFor(2000);
			isElementDisplayed(StationOfferImg);
			isElementDisplayed(StationOfferTtl);
			staticTextValidation(StationOfferDes, arg1);
			isElementDisplayed(StationOfferGotIt);
			isElementDisplayed(StationOfferClose);

		}
		else{
			waitFor(5000);
			//isElementDisplayed(StationOfferImg);
			//isElementDisplayed(StationOfferTtl);
			System.out.println(StationOfferDes.getText());
			//staticTextValidation(StationOfferDes, arg1);
			//isElementDisplayed(StationOfferGotIt);
			//isElementDisplayed(StationOfferClose);

		}
	}

	@Then("^tap on close$")
	public void tap_on_close() throws Throwable {
		clickButtonWithOutScroll(StationOfferClose);
	}

	@Then("^tap on Got It$")
	public void tap_on_got_it() throws Throwable {
		clickButtonWithOutScroll(StationOfferGotIt);
	}

	@When("^user lands on LID screen after successful Login$")
	public void user_lands_on_lid_screen_after_successful_login() throws Throwable {
		waitFor(8000);
		 if (isElementDisplayedWithoutAssert(StationOfferClose)) {
		clickButtonWithOutScroll(StationOfferClose);
		 }
	}

	@Then("^user should see the copy text displayed on the modal pop up in station finder for logged in user with verified nectar$")
	public void user_should_see_the_copy_text_displayed_on_the_modal_pop_up_in_station_finder_for_logged_in_user_with_verified_nectar()
			throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			waitFor(3000);
			isElementDisplayed(StationOfferImg);
			isElementDisplayed(StationOfferTtl);
			staticTextValidation(StationOfferDes, OffersContants.STATIONOFFERDES1);
			isElementDisplayed(StationOfferGotIt);
			isElementDisplayed(StationOfferClose);
		}
		else{
			waitFor(2000);
			isElementDisplayed(StationOfferImg);
			isElementDisplayed(StationOfferTtl);
		}
	}

	@When("^navigate back to \"([^\"]*)\" page$")
	public void navigate_back_to_something_page(String strArg1) throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			androidBack();
		}
		else{
			iOSBack();
		}
	}

	@And("^user should not see the Model popup in station detais$")
	public void user_should_not_see_the_model_popup_in_station_detais() throws Throwable {
		if (isElementDisplayedWithoutAssert(StationOfferImg)) {
			Assert.fail("StationOfferImg present");
		}
	}

	@And("^validate offer details in offers screen$")
	public void validate_offer_details_in_offers_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			isElementDisplayed(NectarLogo);
			isElementDisplayed(OfferLink);
			isElementDisplayed(PointsSec);
			staticTextValidation(HIW, OffersContants.HIW);
			staticTextValidation(CollectPtsLnk, OffersContants.COLLECTPTSLNK);
			staticTextValidation(CollectMoreHead, OffersContants.COLECTMOREHEAD);
			staticTextValidation(FindMoreLnk, OffersContants.FINDMORELNK);
			isElementDisplayed(RewardsSec);
			isElementDisplayed(EssoTM);
		}
		else{
			Assert.assertTrue(EssoTM.isDisplayed());
		}
	}

	@When("^user tap on learn more link in LID screen$")
	public void user_tap_on_learn_more_link_in_lid_screen() throws Throwable {
		clickButtonWithOutScroll(LIDLearnMore);
	}

	@Then("^user is navigated to add nectar screen$")
	public void user_is_navigated_to_add_nectar_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
		staticTextValidation(AccountPage.FirstFuelheader, OffersContants.ADDNECTARHEAD);
		}
		else{
			waitFor(2000);
			if (isElementDisplayedWithoutAssert(YesAddNow)) {
				clickButtonWithOutScroll(YesAddNow);
			}
			waitFor(4000);
			staticTextValidation(AccountPage.FirstFuelheader, OffersContants.ADDNECTARHEADIOS);
		}
	}

	@And("^enter random nectar card value and tap on next button$")
	public void enter_random_nectar_card_value_and_tap_on_next_button() throws Throwable {
		enterTextWithoutScroll(NectarEnter, OffersContants.NECTARNUM);
		clickButtonWithOutScroll(NectarNxt);
	}

	@Then("^user is navigated to Verify nectar screen$")
	public void user_is_navigated_to_verify_nectar_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			clickButtonWithOutScroll(ContextualRegistrationPage.PopUpOK);
		}
		else{
			waitFor(6000);
			clickButtonWithOutScroll(AccountPage.AccountNectarCardContinuePopup);
		}
	}

	@Then("^user enters valid nectar details in verify nectar screen$")
	public void user_enters_valid_nectar_details_in_verify_nectar_screen() throws Throwable {
		waitFor(2000);
		switchToWebAppContext(((AppiumDriver) driver));
		waitFor(2000);
		enterTextWithoutScroll(VerifyNectarnum, OffersContants.NECTARNUMVALID);
		enterTextWithoutScroll(VerifyNectarPass, OffersContants.NECTARPASS);
		hideMobileKeyboard();
		waitElementToBeClickable(VerifyNectarCont);
		clickButtonWithOutScroll(VerifyNectarCont);
		waitFor(2000);
		enterTextWithoutScroll(OTP, OffersContants.OTP);
		waitFor(4000);
		hideMobileKeyboard();
		clickButtonWithOutScroll(OTPDone);
		waitFor(5000);
	}

	@When("^user tap on a cluster$")
	public void user_tap_on_a_cluster() throws Throwable {
		
		
		clickButtonWithOutScroll(StationCluster.get(5));
	}

	@Then("^user validates cluster displayed in map area$")
	public void user_validates_cluster_displayed_in_map_area() throws Throwable {
		waitFor(4000);
		isElementDisplayed(StationCluster.get(2));
	}

	@Then("^map gets zoomed in to display cluster and map pins$")
	public void map_gets_zoomed_in_to_display_cluster_and_map_pins() throws Throwable {
		waitFor(3000);
		clickButtonWithOutScroll(StationCluster.get(2));
	}

	@And("^enter nectar card value and tap on next button$")
	public void enter_nectar_card_value_and_tap_on_next_button() throws Throwable {
		waitFor(1000);
		enterTextWithoutScroll(NectarEnter, OffersContants.NECTARNUMVALID);
		hideMobileKeyboard();
		clickButtonWithOutScroll(NectarNxt);
		if(isElementDisplayedWithoutAssert(Continue)){
			clickButtonWithOutScroll(Continue);
		}
	}

	@When("^user tap on add nectar button in offers screen$")
	public void user_tap_on_add_nectar_button_in_offers_screen() throws Throwable {
		waitForElement(AddNectarBtn,4000);
		clickButtonWithOutScroll(AddNectarBtn);
	}

	@Then("^validate nectar card number and point balance in offers screen$")
	public void validate_nectar_card_number_and_point_balance_in_offers_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			staticTextValidation(NectarCard, OffersContants.CARDNUM);
			isElementDisplayed(Nectarpoints);
		}
		else{
			waitFor(7000);
			ScrollTo(OffersContants.OFFERSTXTCROLL, AccountConstants.IOSSCROLLDOWN, PointsTxt);
			Assert.assertTrue(PointsTxt.isDisplayed());

		}
	}

	@Then("^tap on continue button in verify nectar screen$")
	public void tap_on_continue_button_in_verify_nectar_screen() throws Throwable {
		switchToWebAppContext(((AppiumDriver) driver));
		clickButtonWithOutScroll(VerifyNectarCont);
		System.out.println("clicked" + VerifyNectarCont);
	}

	@Then("^tap on add nectar card from account screen$")
	public void tap_on_add_nectar_card_from_account_screen() throws Throwable {
		waitFor(2000);
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.AccountNectarCardSection);
		waitFor(3000);
		if (isElementDisplayedWithoutAssert(AccNectardelete)) {
			delete_added_nectar_card();
		}
		waitFor(3000);
		clickButtonWithOutScroll(AddNectar);
	}

	@And("^validate added nectar card in account$")
	public void validate_added_nectar_card_in_account() throws Throwable {
		staticTextValidation(AccNectarcard, OffersContants.CARDNUM);
	}

	@Then("^delete added nectar card$")
	public void delete_added_nectar_card() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.AccountNectarCardSection);
			waitFor(2000);
			clickButtonWithOutScroll(AccNectardelete);
			waitFor(3000);
			clickButtonWithOutScroll(ContextualRegistrationPage.PopUpOK);
			waitFor(3000);
			clickButtonWithOutScroll(ContextualRegistrationPage.PopUpOK);
		}
		else{
			waitFor(9000);
			ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.TermsAndConditionElement);
			if(isElementDisplayedWithoutAssert(AccNectardelete)) {
				clickButtonWithOutScroll(AccNectardelete);
				waitForElement(Deletecnf,4);
				clickButtonWithOutScroll(Deletecnf);
				waitForElement(ContextualRegistrationPage.PopUpOK,4);
				clickButtonWithOutScroll(ContextualRegistrationPage.PopUpOK);
			}
		}
	}

	@Then("^user tap on verify later$")
	public void user_tap_on_verify_later() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			clickButtonWithOutScroll(ContextualRegistrationPage.SkipAnyway);
		} else {
			clickButtonWithOutScroll(AccountPage.AccountNectarCardVerifyLaterPopup);
			clickButtonWithOutScroll(AccountPage.AccountNectarVerifyLaterSkip);
		}

	}

	@And("^validate Verify later screen$")
	public void validate_verify_later_screen() throws Throwable {
		waitFor(6000);
		staticTextValidation(VerifyCardTTL, OffersContants.VERIFYTTL);
		/*waitFor(1000);
		//staticTextValidation(VerifyCardDes, OffersContants.VERIFYDES);
		waitFor(2000);
		isElementDisplayed(VerifyImg);
		waitFor(3000);
		isElementDisplayed(VerifyNowBtn);*/
	}

	@And("^validate if user sees add nectar card button after deleting nectar$")
	public void validate_if_user_sees_add_nectar_card_button_after_deleting_nectar() throws Throwable {
		staticTextValidation(AddNectar, OffersContants.ADDNECTAR);
	}

	@When("^user taps on more about collecting points$")
	public void user_taps_on_more_about_collecting_points() throws Throwable {
		clickButtonWithOutScroll(CollectPtsLnk);
	}

	@When("^user tap on find out more about nectar$")
	public void user_tap_on_find_out_more_about_nectar() throws Throwable {

		ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, FindMoreHomeLnk);
		clickButtonWithOutScroll(FindOutMoreNectar);
	}

	@Then("^user sees how to collect points overlay$")
	public void user_sees_how_to_collect_points_overlay() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			isElementDisplayed(HCLogo);
			isElementDisplayed(HCTtl);
			isElementDisplayed(HC1);
			isElementDisplayed(HC2);
			isElementDisplayed(HC3);
			isElementDisplayed(HC4);
			clickButtonWithOutScroll(HCclose);
		}
		else{
			isElementDisplayed(HCLogo);
			isElementDisplayed(HCTtl);
			isElementDisplayed(HC1);
			isElementDisplayed(HC2);
			isElementDisplayed(HC3);
			isElementDisplayed(HC4);
			clickButtonWithOutScroll(HCclose);
		}
	}

	@Then("^user is redirected to corresponding page$")
	public void user_is_redirected_to_corresponding_page() throws Throwable {
		if (platformName.equalsIgnoreCase("android")){
			androidBack();
		}
		else{
			iOSBack();
		}

	}

	@Then("^tap on cancel button on verify screen and land on verify later screen$")
	public void tap_on_cancel_button_on_verify_screen_and_land_on_verify_later_screen() throws Throwable {
		ScrollTo(OffersContants.CANCELSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.PrivacyCloseBtn);
		waitFor(2000);
		clickButtonWithOutScroll(AccountPage.PrivacyCloseBtn);
		isElementDisplayed(VerifyNowBtn);
	}

	@Then("^tap on verify now button$")
	public void tap_on_verify_now_button() throws Throwable {
		clickButtonWithOutScroll(VerifyNowBtn);
	}

	@Then("^Validate third screen$")
	public void validate_second_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			isElementEnabled(TutorialImg);
			staticTextValidation(AppInstallAndLaunchSteps.WelcomTtl,
					AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title);
			staticTextValidation(AppInstallAndLaunchSteps.Subtitle,
					AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title);
		}
		else {
			Assert.assertTrue(isTextMatch(AppInstallAndLaunchSteps.WelcomTtl_three.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title_ios));
			Assert.assertTrue(isTextMatch(AppInstallAndLaunchSteps.WelcomSUBTtl_fournew.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title_iOS));
			Assert.assertTrue(isElementEnabled(AppInstallAndLaunchSteps.GetStarted_BTN));
		}
	}

	@When("^user tap on LID screen$")
	public void user_tap_on_lid_screen() throws Throwable {
		clickButtonWithOutScroll(Fuel);
	}

	@When("^user taps on start button in LID$")
	public void tapPayButton() {
		waitForElement(payButton,20);
		clickButtonWithOutScroll(payButton);
	}

	@Then("^tap on verify nectar screen from transaction complete screen$")
	public void tap_on_verify_nectar_screen_from_transaction_complete_screen() throws Throwable {
		clickButtonWithOutScroll(VerifyNectarTransdone);
	}

	@And("^close the thank you screen if displayed$")
	public void close_the_thank_you_screen_if_displayed() throws Throwable {
		if (isElementDisplayedWithoutAssert(AccountPage.AccountSkip)) {
			clickButtonWithOutScroll(AccountPage.AccountSkip);
		}
	}

	@Then("^user lands on authorize payment screen$")
	public void user_lands_on_authorize_payment_screen() throws Throwable {
		staticTextValidation(AuthHead, OffersContants.AUTHTTL);
		staticTextValidation(AuthDes, OffersContants.AUTHDES);
		AuthLoader(AuthLoader);
	}

	@Then("^user is navigated to start fueling now screen$")
	public void user_is_navigated_to_start_fueling_now_screen() throws Throwable {
		staticTextValidation(StartFuelingNow, OffersContants.STARTNOW);
		AuthLoader(FuelingLoader);
	}

	@And("^then to now fueling$")
	public void then_to_now_fueling() throws Throwable {
		staticTextValidation(NowFueling, GuestCheckOutConstants.NowFueling);
		AuthLoader(NowFuelingLoader);
	}

	@Then("^user taps on Loyalty edit$")
	public void user_taps_on_loyalty_edit() throws Throwable {
		clickButtonWithOutScroll(LoyaltyEdit);
	}

	@And("^validate redemption offers$")
	public void validate_redemption_offers() throws Throwable {
		if (isElementDisplayedWithoutAssert(AccountPage.AccountMessage)) {
			staticTextValidation(AccountPage.AccountMessage, OffersContants.NOREDEMPTION);
		} else if (isElementDisplayedWithoutAssert(AccountPage.AccountMessage)) {
			// Need fill redemption offers scenario
		}
	}

	@Then("^tap on payment method in select your pump screen$")
	public void tap_on_payment_method_in_select_your_pump_screen() throws Throwable {
		clickButtonWithOutScroll(ChangePayment);
	}

	@Then("^validate nectar section in change payment screen$")
	public void validate_nectar_section_in_change_payment_screen() throws Throwable {
		isElementDisplayed(CPNectarLogo);
		staticTextValidation(CPNectarTtl, OffersContants.CPNECTTTL);
		staticTextValidation(CPNectDes, OffersContants.CPNECTDES);
		isElementDisplayed(CPNectAdd);
	}

	@Then("^tap on add nectar card in change payment screen$")
	public void tap_on_add_nectar_card_in_change_payment_screen() throws Throwable {
		clickButtonWithOutScroll(CPNectAdd);
	}

	@And("^validate offers displayed in offer screen$")
	public void validate_offers_displayed_in_offer_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			ScrollTo(OffersContants.OFFERSCROLL, AccountConstants.IOSSCROLLUP, OffImg);
			isElementDisplayed(OffImg);
			isElementDisplayed(OffTTL);
			isElementDisplayed(OffDes);
			isElementDisplayed(OffLoadBtn);
		}
		else{
			waitForElement(PointsTxt,13);
			Assert.assertTrue(PointsTxt.isDisplayed());
			Assert.assertTrue(OfferLink.isDisplayed());
			Assert.assertTrue(PointsSec.isDisplayed());
			waitFor(5000);
			ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, RewardsSec);
			Assert.assertTrue(isTextMatch(FindOutMoreNectar.getText(), OffersContants.OFFERSFINDSCROLL));
			Assert.assertTrue(isElementDisplayed(RewardsSec));
		}
	}

	@Then("^tap on view offers button$")
	public void tap_on_view_offers_button() throws Throwable {
		ScrollTo(OffersContants.OFFERSCROLL, AccountConstants.IOSSCROLLUP, OffDes);
		clickButtonWithOutScroll(ViewOffer);
	}

	@And("^validate offer details$")
	public void validate_offer_details() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
				isElementDisplayed(OffOTTL);
				isElementDisplayed(OffODes);
				isElementDisplayed(OffOLoadBtn);
				staticTextValidation(OffNoteTTl, OffersContants.OFFNOTETTL);
				isElementDisplayed(OffNoteDes);
			}
		else{

			isElementDisplayed(OffOTC);
			staticTextValidation(OffNoteTTl, OffersContants.OFFNOTETTL);
			isElementEnabled(ViewOfferClose);
		}
		}

	@Then("^tap on Terms & conditions link$")
	public void tap_on_terms_conditions_link() throws Throwable {
		clickButtonWithOutScroll(OffOTC);
	}

	@And("^validate Terms & conditions overlay$")
	public void validate_terms_conditions_overlay() throws Throwable {
		isElementDisplayed(OffTCTTL);
		staticTextValidation(OffTCdes, OffersContants.OFFTCDES);
	}

	@Then("^close the Terms & conditions overlay$")
	public void close_the_Terms_conditions_overlay() throws Throwable {
		clickButtonWithOutScroll(OffTCClose);
	}

	@Then("^validate add nectar card button displayed in transaction complete screen$")
	public void validate_add_nectar_card_button_displayed_in_transaction_complete_screen() throws Throwable {

		waitFor(20000);
		Assert.assertTrue(VerifyNectarTransdone.isEnabled());
		waitFor(20000);
	}

	@Then("^tap on your nectar card link in offers screen$")
	public void tap_on_your_nectar_card_link_in_offers_screen() throws Throwable {
		clickButtonWithOutScroll(ViewNectarCrd);
	}

	@Then("^user should see the digital nectar card$")
	public void user_should_see_the_digital_nectar_card() throws Throwable {

		if (platformName.equalsIgnoreCase("android")) {
			isElementDisplayed(DigiLogo);
			isElementDisplayed(DigiBarcode);
			isElementDisplayed(DigiCardHead);
			isElementDisplayed(DigiCardNum);
			isElementDisplayed(DigiClose);
			isElementDisplayed(DigiFName);
			isElementDisplayed(DigiLName);
			isElementDisplayed(DigiNoteHead);
			isElementDisplayed(DigiNoteTtl);
		}
		else{
			waitFor(5000);
			//Assert.assertTrue(DigiLogo.isDisplayed());
			Assert.assertTrue(DigiCardHead.isDisplayed());
			Assert.assertTrue(DigiClose.isEnabled());
			Assert.assertTrue(DigiNoteHead.isDisplayed());
			Assert.assertTrue(DigiNoteTtl.isDisplayed());
		}
	}

	@Then("^close the digital nectar card$")
	public void close_the_digital_nectar_card() throws Throwable {
		clickButtonWithOutScroll(DigiClose);
	}

	@When("^user tap on filter icon$")
	public void user_tap_on_filter_icon() throws Throwable {
		waitFor(1000);
		clickButtonWithOutScroll(StationFilter);
	}

	@Then("^select a filter option$")
	public void select_a_filter_option() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			waitFor(1000);
			clickButtonWithOutScroll(FilterOption.get(1));
		}else
		{
			clickButtonWithOutScroll(OpenHours);
		}
	}

	@And("^validate apply filter button$")
	public void validate_apply_filter_button() throws Throwable {
		waitFor(1000);
		staticTextValidation(FilterApplyBtn, OffersContants.APPLY1);
	}

	@Then("^validate point balance as nill in offers screen when user has no points$")
	public void validate_point_balance_as_nill_in_offers_screen_when_user_has_no_points() throws Throwable {
		staticTextValidation(Nectarpoints, "-");
	}

	@And("^user check whether find more about nectar link is available in the offers details screen$")
	public void userCheckWhetherFindMoreAboutNectarLinkIsAvailableInTheOffersDetailsScreen() {
		waitFor(3000);
		ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, FindMoreMsgLnk);
		waitFor(4000);
		isElementDisplayed(FindMoreHomeLnk);
	}

	@And("^click the continue button under 'Nectar card added successfully' screen$")
	public void clickTheContinueButtonUnderNectarCardAddedSuccessfullyScreen() {
		waitForElement(NectarCardSuccess,6);
		if(isElementDisplayedWithoutAssert(NectarCardSuccess)){
			waitForElement(ContinueNectarCard,3);
			clickButtonWithOutScroll(ContinueNectarCard);
			waitFor(5000);
			if(isElementDisplayedWithoutAssert(Continue))
			clickButtonWithOutScroll(Continue);
			waitFor(15000);
		}
	}

	@And("^user verifies the inline error message for empty nectar card number field$")
	public void userVerifiesTheInlineErrorMessageForNectarCardNumberField() {

		staticTextValidation(NectarcardInlineError,OffersContants.NECTARCARDNUMBERINLINEERRORMSG);

	}

	@When("^user taps on the next button in 'Add Nectar Card' screen without entering the nectar card$")
	public void userTapsOnTheNextButtonInAddNectarCardScreenWithoutEnteringTheNectarCard() {
		waitFor(2000);
		clickButtonWithOutScroll(NectarNxt);
	}

	@And("^tap on the Add Nectar Card button in Transaction complete Screen$")
	public void tapOnTheAddNectarCardButtonInTransactionCompleteScreen() {
		waitForElement(VerifyNectarTransdone,9);
		clickButtonWithOutScroll(VerifyNectarTransdone);

	}

	@And("^verify the Add nectar card screen$")
	public void verifyTheAddNectarCardScreen() {
		waitForElement(AddNectarCardText,10);
		Assert.assertTrue(AddNectarCardText.isDisplayed());
		Assert.assertTrue(YesAddNow.isEnabled());
		Assert.assertTrue(NoSignUpBtn.isEnabled());
		Assert.assertTrue(WhatisNectarTxt.isEnabled());
	}

	@Then("^tap on Add now button in Add Nectar Card Screen$")
	public void tapOnAddNowButtonInAddNectarCardScreen() {
		clickButtonWithOutScroll(YesAddNow);
	}

	@And("^verify if the application redirects to the 'Link your account' Screen$")
	public void verifyIfTheApplicationRedirectsToTheLinkYourAccountScreen() throws InterruptedException {
		waitFor(6000);
		switchToWebAppContext(((AppiumDriver) driver));
		waitForElement(LinkAccTxt,7);
		Assert.assertTrue(LinkAccTxt.isDisplayed());
		Assert.assertTrue(VerifyNectarCont.isDisplayed());
		Assert.assertTrue(NectarCardNumTxt.isDisplayed());
		Assert.assertTrue(NectarPasswordTxt.isDisplayed());
		Assert.assertTrue(CancelReturnEssoLink.isEnabled());

	}

	@When("^tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen$")
	public void tapOnCancelAndReturnToESSOLinkInLinkYourAccountScreen() {
		waitForElement(CancelReturnEssoLink,4);
		clickButtonWithOutScroll(CancelReturnEssoLink);
	}

	@Then("^verify if the user is in the Transaction Complete Screen$")
	public void verifyIfTheUserIsInTheTransactionCompleteScreen() {
		waitForElement(SafeTravelsTxt,50);
		Assert.assertTrue(SafeTravelsTxt.isDisplayed());
		Assert.assertTrue(PaymentSuccessTxt.isDisplayed());
		Assert.assertTrue(TransDetailsLink.isEnabled());
	}

	@And("^verify the modal popup and click on Ok button before navigating to Transaction Complete Screen$")
	public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToTransactionCompleteScreen() {
		waitForElement(LinkAccOkBtn,4);
		Assert.assertTrue(PopUpTxt.isDisplayed());
		clickButtonWithOutScroll(LinkAccOkBtn);
	}

	@And("^user lands on Verify Card Screen and taps on skip button$")
	public void userLandsOnVerifyCardScreenAndTapsOnSkipButton() {
		Assert.assertTrue(VerifyCardTxt.isDisplayed());
		Assert.assertTrue(VerifyNowBtn.isEnabled());
		clickButtonWithOutScroll(skip_BTN);
	}

	@Then("^verify if the user is in the Transaction Complete Screen with the context to verify the nectar card$")
	public void verifyIfTheUserIsInTheTransactionCompleteScreenWithTheContextToVerifyTheNectarCard() {
		Assert.assertTrue(SafeTravelsTxt.isDisplayed());
		Assert.assertTrue(PaymentSuccessTxt.isDisplayed());
		Assert.assertTrue(NectarCardTransTxt.isDisplayed());
		Assert.assertTrue(TransDetailsLink.isDisplayed());

	}

	@Then("^validate verify nectar card link displayed in transaction complete screen$")
	public void validateVerifyNectarCardLinkDisplayedInTransactionCompleteScreen() {
		waitFor(15000);
		Assert.assertTrue(VerfiyNectarCardTransdone.isEnabled());

	}

	@And("^tap on the Verify Nectar Card link in Transaction complete Screen$")
	public void tapOnTheVerifyNectarCardLinkInTransactionCompleteScreen() {
		waitFor(10000);
		clickButtonWithOutScroll(VerfiyNectarCardTransdone);
	}

	@Then("^tap on Verify Nectar button in offers Screen$")
	public void tapOnVerifyNectarButtonInOffersScreen() {
		clickButtonWithOutScroll(VerifyNectarCardBtn);
		if(isElementDisplayedWithoutAssert(Continue))
			waitFor(1000);
		clickButtonWithOutScroll(Continue);
	}

	@And("^verify the modal popup and click on Ok button before navigating to Offers Screen$")
	public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToOffersScreen() {
		Assert.assertTrue(isTextMatch(PopUpTxt.getText(),OffersContants.LINKACCPOPUPTXT));
		clickButtonWithOutScroll(LinkAccOkBtn);
	}

	@Then("^verify if the user is navigated to Offers screen$")
	public void verifyIfTheUserIsNavigatedToOffersScreen() {
		Assert.assertTrue(OffersNect.isDisplayed());
		Assert.assertTrue(BonusPoints.isDisplayed());
	}

	@And("^verify the modal popup and click on Ok button before navigating to Account Screen$")
	public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToAccountScreen() {
		Assert.assertTrue(isTextMatch(PopUpTxt.getText(),OffersContants.LINKACCPOPUPTXT));
		clickButtonWithOutScroll(LinkAccOkBtn);
	}

	@And("^user taps on Payment Method link under 'Select your pump'Screen$")
	public void userTapsOnPaymentMethodLinkUnderSelectYourPumpScreen() {

		clickButtonWithOutScroll(PaymentMethodLinkVisa);
	}

	@Then("^verify if the user lands on Payment Details Screen$")
	public void verifyIfTheUserLandsOnPaymentDetailsScreen() {
		waitForElement(PaymentMethodTxt,7);
		Assert.assertTrue(PaymentMethodTxt.isDisplayed());
		Assert.assertTrue(EssoNectarTxt.isDisplayed());
		Assert.assertTrue(PaymentContinueBtn.isEnabled());

	}

	@And("^tap on Add Nectar card button in Payment details screen$")
	public void tapOnAddNectarCardButtonInPaymentDetailsScreen() {
		clickButtonWithOutScroll(PaymentAddNectarCard);
	}

	@And("^verify if user lands on Verify Card Screen$")
	public void verifyIfUserLandsOnVerifyCardScreen() {
		Assert.assertTrue(VerifyCardTxt.isDisplayed());
		Assert.assertTrue(VerifyNowBtn.isDisplayed());
	}

	@And("^verify the modal popup and click on Ok button before navigating to verify card screen$")
	public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToVerifyCardScreen() {
		Assert.assertTrue(isTextMatch(PopUpTxt.getText(),OffersContants.LINKACCPOPUPTXT));
		clickButtonWithOutScroll(LinkAccOkBtn);
	}

	@Then("^verify whether 'See your Nectar balance' link is displayed on LID$")
	public void verifyWhetherSeeYourNectarBalanceLinkIsDisplayedOnLID() {
		waitForElement(SeeYourNectBalink,5);
		Assert.assertTrue(SeeYourNectBalink.isEnabled());
	}

	@And("^tap on 'See your Nectar balance' Link$")
	public void tapOnSeeYourNectarBalanceLink() {
		clickButtonWithOutScroll(SeeYourNectBalink);
		if(isElementDisplayedWithoutAssert(Continue))
			waitFor(1000);
		clickButtonWithOutScroll(Continue);
	}

	@And("^verify the modal popup and click on Ok button before navigating to LID$")
	public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToLID() {
		Assert.assertTrue(isTextMatch(PopUpTxt.getText(),OffersContants.LINKACCPOPUPTXT));
		clickButtonWithOutScroll(LinkAccOkBtn);
	}

	@Then("^verify whether 'Learn more' link is displayed on LID$")
	public void verifyWhetherLearnMoreLinkIsDisplayedOnLID() {
		Assert.assertTrue(LearnMoreLink.isEnabled());
	}

	@And("^tap on 'Learn more' Link$")
	public void tapOnLearnMoreLink() {
		clickButtonWithOutScroll(LearnMoreLink);
	}

	@And("^user tap on Get Started button in the Add Nectar Card screen$")
	public void userTapOnGetStartedButtonInTheAddNectarCardScreen() {
		clickButtonWithOutScroll(GetStartedBtn);
	}

	@And("^click the continue button under 'Card Added successfully' alert$")
	public void clickTheContinueButtonUnderCardAddedSuccessfullyAlert() {
		if(isElementDisplayedWithoutAssert(Continue))
			waitFor(1000);
		clickButtonWithOutScroll(Continue);
		waitFor(15000);
	}

	@And("^click the continue button under 'verify your card' alert$")
	public void clickTheContinueButtonUnderVerifyYourCardAlert() {
		waitForElement(NectarcomAlert,10);
		//Assert.assertTrue(NectarcomAlert.isDisplayed());
		clickButtonWithOutScroll(Continue);

	}

	@And("^close the modal popup$")
	public void closeTheModalPopup() {
		waitFor(10000);
		if (isElementDisplayedWithoutAssert(CloseButtonModalPopupLid)) {
			clickButtonWithOutScroll(CloseButtonModalPopupLid);
		}
		else{
			logger.info("No popup");
		}
	}


	@And("^validate the offers screen before adding the nectar card$")
	public void validateTheOffersScreenBeforeAddingTheNectarCard() {
		waitForElement(GetExclusiveOffers,10);
		Assert.assertTrue(GetExclusiveOffers.isEnabled());
		Assert.assertTrue(isTextMatch(HIW.getText(), OffersContants.HIW));
		Assert.assertTrue(isTextMatch(CollectPtsLnk.getText(), OffersContants.COLLECTPTSLNK));
		Assert.assertTrue(MoreCollectpoints.isEnabled());
		//Assert.assertTrue(isTextMatch(CollectMoreHead.getText(), OffersContants.COLECTMOREHEAD));
		ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, FindMoreHomeLnk);
		Assert.assertTrue(isTextMatch(FindMoreHomeLnk.getText(), OffersContants.OFFERSFINDSCROLL));
		Assert.assertTrue(isElementDisplayed(RewardsSec));
		Assert.assertTrue(AddNectarCardBtn.isEnabled());
	}

	@When("^user taps on 'More about collecting points'link in the offers screen$")
	public void userTapsOnMoreAboutCollectingPointsLinkInTheOffersScreen() {
		waitForElement(MoreCollectpoints,4);
		clickButtonWithOutScroll(MoreCollectpoints);
	}

	@Then("^validate the popup which displays 'How to collect points' in detail and close the popup$")
	public void validateThePopupWhichDisplaysHowToCollectPointsInDetailAndCloseThePopup() {
		//Assert.assertTrue(isElementDisplayed(HCLogo));
		Assert.assertTrue(isElementDisplayed(HCTtl));
		Assert.assertTrue(isElementDisplayed(HC1));
		Assert.assertTrue(isElementDisplayed(HC2));
		Assert.assertTrue(isElementDisplayed(HC3));
		//Assert.assertTrue(isElementDisplayed(HC4));
		Assert.assertTrue(isElementEnabled(HCclose));
		clickButtonWithOutScroll(HCclose);
	}

	@When("^user taps on 'Get Exclusive offers' in the offers screen$")
	public void userTapsOnGetExclusiveOffersInTheOffersScreen() {
	ScrollTo(OffersContants.HIW, AccountConstants.IOSSCROLLDOWN,GetExclusiveOffers);
		clickButtonWithOutScroll(GetExclusiveOffers);
	}

	@When("^user clicks on Verify Later button under 'Card Added successfully' alert$")
	public void userClicksOnVerifyLaterButtonUnderCardAddedSuccessfullyAlert() {
		waitForElement(VerifyLater,8);
		clickButtonWithOutScroll(VerifyLater);
		waitFor(10000);
	}

	@And("^verify if the user is navigated to Verify Offers screen$")
	public void verifyIfTheUserIsNavigatedToVerifyOffersScreen() {
		waitForElement(OfferLink,5);
		//Assert.assertTrue(VerifyNectarCard.isDisplayed());
		Assert.assertTrue(OfferLink.isDisplayed());
		Assert.assertTrue(PointsSec.isDisplayed());
		ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, RewardsSec);
		Assert.assertTrue(isTextMatch(FindMoreHomeLnk.getText(), OffersContants.OFFERSFINDSCROLL));
		Assert.assertTrue(RewardsSec.isDisplayed());
		Assert.assertTrue(isElementEnabled(VerifyNectarCardBtn));
	}

	@When("^user taps on Verify Nectar card button in the 'Verify Offers' Screen$")
	public void userTapsOnVerifyNectarCardButtonInTheVerifyOffersScreen() {
		clickButtonWithOutScroll(VerifyNectarCardBtn);
	}

	@When("^user taps on fuel icon$")
	public void userTapsOnFuelIcon() {
		clickButtonWithOutScroll(Fuel);
		waitFor(7000);
		if (isElementDisplayedWithoutAssert(CloseButtonModalPopupLid)) {
			clickButtonWithOutScroll(CloseButtonModalPopupLid);
		}

	}

	@Then("^Redemption screen is displayed with Redemption options$")
	public void redemptionScreenIsDisplayedWithRedemptionOptions() {
		waitForElement(RedemptionSaveTxt,7);
		Assert.assertTrue(RedemptionViewClose.isEnabled());
		Assert.assertTrue(RedemptionSaveTxt.isDisplayed());
		Assert.assertTrue(RedemptionChooseOption.isDisplayed());
		Assert.assertTrue(RedemptionOption1.isEnabled());
		Assert.assertTrue(RedemptionOption2.isEnabled());
		Assert.assertTrue(RedemptionContinue.isEnabled());
	}

	@When("^user selects any of the options and click on continue in the popup$")
	public void userSelectsAnyOfTheOptionsAndClickOnContinueInThePopup() {
		clickButtonWithOutScroll(RedemptionOption1);
		clickButtonWithOutScroll(RedemptionContinue);
	}

	@Then("^the user is navigated to Confirm payment screen$")
	public void theUserIsNavigatedToConfirmPaymentScreen() {
		Assert.assertTrue(isElementDisplayed(ConfirmPayment));
		Assert.assertTrue(isElementEnabled(RewardEdit));
	}

	@When("^click on Edit link under Redemption Offers in Confirm payment screen$")
	public void clickOnEditLinkUnderRedemptionOffersInConfirmPaymentScreen() {
		clickButtonWithOutScroll(RewardEdit);
	}

	@Then("^the user is navigated to the Redemption screen$")
	public void theUserIsNavigatedToTheRedemptionScreen() {
		Assert.assertTrue(isElementEnabled(RedemptionViewClose));
		Assert.assertTrue(isElementDisplayed(RedemptionSaveTxt));
		Assert.assertTrue(isElementDisplayed(RedemptionChooseOption));
		Assert.assertTrue(isElementEnabled(RedemptionOption1));
		Assert.assertTrue(isElementEnabled(RedemptionOption2));
		Assert.assertTrue(isElementEnabled(RedemptionContinue));
		Assert.assertTrue(isElementEnabled(RedemptionRewardCellClose));
	}

	@When("^user unselects the redemption option$")
	public void userUnselectsTheRedemptionOption() {
		clickButtonWithOutScroll(RedemptionRewardCellClose);
		clickButtonWithOutScroll(RedemptionContinue);
	}


	@Then("^the user is navigated to Confirm payment screen after unselecting the redemption option$")
	public void theUserIsNavigatedToConfirmPaymentScreenAfterUnselectingTheRedemptionOption() {
		Assert.assertTrue(isElementDisplayed(PayPalButn));
		Assert.assertTrue(isElementDisplayed(RedemptionReward));
	}


	@And("^delete added nectar card if exists$")
	public void deleteAddedNectarCardIfExists() {
		waitForElement(AccountPage.PasswordEdit, 20);
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.TermsACondition);
		if(isElementDisplayedWithoutAssert(AccNectardelete)) {
			clickButtonWithOutScroll(AccNectardelete);
			waitForElement(Deletecnf,4);
			clickButtonWithOutScroll(Deletecnf);
			waitForElement(ContextualRegistrationPage.PopUpOK,4);
			clickButtonWithOutScroll(ContextualRegistrationPage.PopUpOK);
		} else{
			logger.info("No nectar card added");
		}
	}

	@And("^close the viewoffers popup$")
	public void closeTheViewoffersPopup() {
		clickButtonWithOutScroll(ViewOfferClose);
	}

	@Then("^the user is navigated to Confirm payment screen after selecting the redemption option$")
	public void theUserIsNavigatedToConfirmPaymentScreenAfterSelectingTheRedemptionOption() {
		Assert.assertTrue(isElementDisplayed(PayPalButn));
		Assert.assertTrue(isElementEnabled(RewardEdit));
	}

}



