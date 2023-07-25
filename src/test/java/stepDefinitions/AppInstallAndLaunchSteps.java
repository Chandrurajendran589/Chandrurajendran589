package stepDefinitions;

import contants.*;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.When;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AccountPage;
import pages.AppInstallAndLaunchPage;
import pages.AppLaunchPage;
import pages.MenuPage;

public class AppInstallAndLaunchSteps extends AppInstallAndLaunchPage {
	AppLaunchPage appIstallLaunch =new AppLaunchPage();

	@Given("^user validates tutorial screen$")
	public void user_validates_tutorial_screen() throws Throwable {
		waitFor(6000);
		if (platformName.equalsIgnoreCase("android")) {
			isElementDisplayed(WelcomImg);
			staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title);
			staticTextValidation(Subtitle, AppInstallAndLaunchConstants.Tutorial_Screen_One_Sub_Title);
		} else {
			Assert.assertTrue(WelcomImg.isEnabled());
			// Assert.assertTrue(isElementEnabled(WelcomTtl));

			// Assert.assertTrue(isElementEnabled(WelcomSUBTtl_one));
		}
	}

	@When("^Validate swipe app tutorial screen$")
	public void validate_swipe_app_tutorial_screen() throws Throwable {
		swipeHorizontal(2000, WelcomTtl);
		swipeHorizontal(2000, WelcomTtl_two);
		swipeHorizontal(2000, WelcomTtl_three);
	}

	@Then("^Validate on next button$")
	public void validate_on_next_button() throws Throwable {
		Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
	}

	@When("^Validate tap on next button second screen$")
	public void validate_tap_on_next_button_second_screen() throws Throwable {
		Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
		clickButtonWithOutScroll(NextBtn);
	}

	@When("^Validate tap on next button third screen$")
	public void validate_tap_on_next_button_third_screen() throws Throwable {
		Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
		clickButtonWithOutScroll(NextBtn);
	}

	@Then("^Validate tap on next button first screen$")
	public void validate_tap_on_next_button_first_screen() throws Throwable {
		Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
		clickButtonWithOutScroll(NextBtn);
	}

	@When("^Validate the second Skip screen$")
	public void validate_the_second_skip_screen() throws Throwable {
		Assert.assertTrue(isTextContain(skip_BTN.getText(), AppInstallAndLaunchConstants.SKIP));
	}

	@Then("^Validate the First Skip screen$")
	public void validate_the_first_skip_screen() throws Throwable {
		Assert.assertTrue(isTextContain(skip_BTN.getText(), AppInstallAndLaunchConstants.SKIP));
	}

	@And("^Validate the third Skip screen$")
	public void validate_the_third_skip_screen() throws Throwable {
		Assert.assertTrue(isTextContain(skip_BTN.getText(), AppInstallAndLaunchConstants.SKIP));
	}

	@When("^Validate skip click on skip button$")
	public void validate_skip_click_on_skip_button() throws Throwable {
		clickButtonWithOutScroll(skip_BTN);
	}

	@Then("^Validate second screen$")
	public void validate_second_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			waitForElement(NextBtn,20);
		isElementDisplayed(NextBtn);
			waitForElement(skip_BTN,20);
		isElementDisplayed(skip_BTN);
			waitForElement(WelcomTtl,20);
			isElementDisplayed(WelcomTtl);
			isElementDisplayed(WelcomImg2);
			waitForElement(WelcomTtl,20);
			staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Page_Title);
			staticTextValidation(Subtitle, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Sub_Title);
		} else {
			waitFor(6000);
			isElementDisplayed(NextBtn);
			isElementDisplayed(skip_BTN);
			isElementDisplayed(WelcomTtl_2);
			isElementDisplayed(WelcomTtl_2);
			staticTextValidation(WelcomTtl_2, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Page_Title);
			staticTextValidation(WelcomTtl_2, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Sub_Title);
			/*Assert.assertTrue(isTextMatch(WelcomTtl_2.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Second_Page_Title));
			Assert.assertTrue(isTextMatch(WelcomSUBTtl_2.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Second_Sub_Title));*/
		}
	}

	@Then("^third screen$")
	public void third_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			swipeHorizontal(2000, WelcomTtl);
			Assert.assertTrue(isElementDisplayed(WelcomTtl));
			Assert.assertTrue(isElementDisplayed(NextBtn));
			Assert.assertTrue(isElementDisplayed(skip_BTN));
		} else {
			swipeHorizontal(2000, WelcomTtl_two);
			Assert.assertTrue(isElementDisplayed(WelcomTtl_three));
			Assert.assertTrue(isElementDisplayed(NextBtn));
			Assert.assertTrue(isElementDisplayed(skip_BTN));
		}

	}

	@Then("^validate third screen$")
	public void validate_third_screen() throws Throwable {

		if (platformName.equalsIgnoreCase("android")) {
			Assert.assertTrue(isElementDisplayed(NextBtn));
			Assert.assertTrue(isElementDisplayed(skip_BTN));
			Assert.assertTrue(isElementDisplayed(WelcomTtl));
			Assert.assertTrue(isElementDisplayed(WelcomImg3));
			Assert.assertTrue(isTextMatch(WelcomTtl.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Third_Page_Title));
			Assert.assertTrue(isTextMatch(Subtitle.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Third_Sub_Title));
		} else {
			Assert.assertTrue(isElementDisplayed(WelcomTtl_3));
			Assert.assertTrue(isTextMatch(WelcomTtl_four.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Third_Page_Title_iOS));
			Assert.assertTrue(isTextMatch(WelcomSUBTtl_fournew.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Third_Sub_Title_iOS));
			Assert.assertTrue(isElementDisplayed(GetStarted_BTN));
			Assert.assertTrue(isElementDisplayed(WelcomImg3));
		}
	}

	@And("^fourth screen$")
	public void fourth_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("android")) {
			swipeHorizontal(2000, WelcomTtl);
			Assert.assertTrue(isElementDisplayed(WelcomTtl));
			Assert.assertTrue(isElementDisplayed(GetStarted_BTN));

		} else {
			swipeHorizontal(2000, WelcomTtl_three);
			Assert.assertTrue(isElementDisplayed(WelcomTtl_four));
			Assert.assertTrue(isElementDisplayed(GetStarted_BTN));

		}
	}

	@And("^validate fourth screen$")
	public void validate_fourth_screen() throws Throwable {
		Assert.assertTrue(isElementDisplayed(GetStarted_BTN));
		if (platformName.equalsIgnoreCase("android")) {
			Assert.assertTrue(isElementDisplayed(WelcomTtl));
			Assert.assertTrue(isElementDisplayed(WelcomImg4));
			Assert.assertTrue(isTextMatch(WelcomTtl.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title));
			Assert.assertTrue(isTextMatch(Subtitle.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title));
		} else {
			Assert.assertTrue(isElementDisplayed(WelcomTtl_four));
			Assert.assertTrue(WelcomImg4.isEnabled());
			Assert.assertTrue(isTextMatch(WelcomTtl_four.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title_ios));
			Assert.assertTrue(isTextMatch(WelcomSUBTtl_four.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title_iOS));
		}
	}

	@Then("^Validate tabs for the Global Tab Bar logged in dashboard$")
	public void validate_tabs_for_the_global_tab_bar_logged_in_dashboard() throws Throwable {
		isElementDisplayed(FuelTab);
		isElementDisplayed(StationTab);
		isElementDisplayed(OffersTab);
		isElementDisplayed(HistoryTab);
		isElementDisplayed(MoreTab);
	}

	@Then("^Validate the device back button is inactive$")
	public void validate_the_device_back_button_is_inactive() throws Throwable {
		driver.navigate().back();
	}

	@Then("^user tap on next button$")
	public void user_tap_on_next_button() throws Throwable {
		clickButtonWithOutScroll(NextBtn);
	}

	@Then("^Validate the Get Started button in fourth screen$")
	public void validate_the_get_started_button_in_fourth_screen() throws Throwable {
		Assert.assertTrue(isTextMatch(GetStarted_BTN.getText().trim(), AppInstallAndLaunchConstants.GETSTD));
	}

	@When("^click on Get Started button$")
	public void clickOnGetStartedButton() {
		clickButtonWithOutScroll(GetStarted_BTN);
		waitFor(2000);
		if (platformName.equalsIgnoreCase("android")) {
			clickButtonWithOutScroll(AccountOkBtn);
		} else {
			clickButtonWithOutScroll(ContinueBtn);
			waitFor(3000);
			clickButtonWithOutScroll(AllowPopup);
			waitFor(2000);
			if (isElementDisplayed(AccountOkBtn)) {
				clickButtonWithOutScroll(AccountOkBtn);
			}
		}

	}

	@Given("^user validates the tutorial screen$")
	public void userValidatesTheTutorialScreen() {
	//	waitFor(6000);
		if (platformName.equalsIgnoreCase("android")) {
			waitForElement(WelcomImg,6000);
			Assert.assertTrue(isElementDisplayed(WelcomImg));
			Assert.assertTrue(isTextMatch(WelcomTtl.getText().trim(),
					AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title));
			Assert.assertTrue(
					isTextMatch(Subtitle.getText().trim(), AppInstallAndLaunchConstants.Tutorial_Screen_One_Sub_Title));
			// Assert.assertTrue(isTextContain(WelcomTtl.getText(),
			// AccountConstants.WELCOMTXT));
		} else {
			Assert.assertTrue(WelcomImg.isEnabled());
			// Assert.assertTrue(isElementEnabled(WelcomTtl));
			// Assert.assertTrue(isElementEnabled(WelcomSUBTtl_one));
		}
	}

	@Then("^User validate allow notifications screen$")
	public void userValidateAllowNotificationsScreen() {
		Assert.assertTrue(isElementDisplayed(Allow_Notifications_header));
		Assert.assertTrue(isElementDisplayed(notification_image));
		Assert.assertTrue(isElementDisplayed(notification_middle_message));
		Assert.assertTrue(isElementDisplayed(notification_bottom_message));
		Assert.assertTrue(isElementDisplayed(ContinueBtn));
		Assert.assertTrue(
				isTextMatch(Allow_Notifications_header.getText().trim(), AppInstallAndLaunchConstants.Welcome_Screen_fourth_top_header));
		Assert.assertTrue(
				isTextMatch(notification_middle_message.getText().trim(), AppInstallAndLaunchConstants.Welcome_Screen_fourth_middle_message));
		Assert.assertTrue(
				isTextMatch(notification_bottom_message.getText().trim(), AppInstallAndLaunchConstants.Welcome_Screen_fourth_small_message));
	}

    @Then("^User is navigated to Add Nectar Card screen$")
    public void userIsNavigatedToAddNectarCardScreen() {
		staticTextValidation(add_Nectar_card, OffersContants.ADDNECTAR);
    }

	@And("^user validates offers screen$")
	public void userValidatesOffersScreen() {
		waitForElement(add_nectar_card_to,4000);
		isElementDisplayed(add_nectar_card_to);
		isTextMatch(add_nectar_card_to.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_to_text);
		isElementDisplayed(get_offers);
		isTextMatch(get_offers.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_get_exclusive);
		isElementDisplayed(collection_points_header);
		isTextMatch(get_offers.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_get_exclusive);
		isElementDisplayed(collection_points_message);
		isTextMatch(collection_points_header.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_collection_points_header);
		isElementDisplayed(more_about_collecting_point_link);
		isTextMatch(more_about_collecting_point_link.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_More_about_collecting_points_link);
		isElementDisplayed(rewards_image);
		isElementDisplayed(rewards_header);
		isTextMatch(rewards_header.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_Rewards_header);
		isElementDisplayed(rewards_text);
		isTextMatch(rewards_text.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_Rewards_text);
		isElementDisplayed(add_nectar_card);
		isTextMatch(add_nectar_card.getText(),AppInstallAndLaunchConstants.Offers_Add_Nectar_card_text);
		isElementDisplayed(Add_Nectar_card_image);
		isElementDisplayed(collect_more_nectar_points);
	}

	@When("^user taps on \"([^\"]*)\" link$")
	public void userTapsOnLink(String linkName) throws Throwable {
		isElementDisplayed(more_about_collecting_point_link);
		clickButtonWithOutScroll(more_about_collecting_point_link);
	}

	@Then("^user should see How to collect points popup$")
	public void userShouldSeeHowToCollectPointsPopup() {
		waitForElement(how_to_collect_points_popup,3000);
		isElementDisplayed(how_to_collect_points_popup);
		clickButtonWithOutScroll(geRewards_How_to_collect_points_popup_Close);
	}

	@And("^user enters the nectar card number$")
	public void userEntersTheNectarCardNumber() {
		enterTextWithoutScroll(AccountPage.NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
		clickButtonWithOutScroll(AccountPage.DoneButtonInNectarKeypad);
		clickButtonWithOutScroll(AccountPage.NextButtonNectarCardAddScreen);
		clickButtonWithOutScroll(AccountPage.AccountNectarCardContinuePopup);
	}

    @And("^Click on skipp button in Welcome screen$")
    public void clickOnSkippButtonInWelcomeScreen() {
		waitForElement(appIstallLaunch.TutorialSkipButton,3000);
		clickButtonWithOutScroll(appIstallLaunch.TutorialSkipButton);
		clickButtonWithOutScroll(ContinueBtn);
		clickButtonWithOutScroll(AllowPopup);
    }

	@Then("^Verify the CT text popup text displayed in NLID screen$")
	public void verifyTheCTTextPopupTextDisplayedInNLIDScreen() {
		waitFor(2000);
		Assert.assertTrue(isElementDisplayed(CtTextLIDScreen));
		clickButtonWithOutScroll(OkButtonCTText);
	}

	@Then("^verify that User is able to see Welcome screen$")
	public void verifyThatUserIsAbleToSeeWelcomeScreen() {

		waitFor(5000);
		staticTextValidation(WelcomTtl,AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title_ios);
		staticTextValidation(WelcomSUBTtl_one,AppInstallAndLaunchConstants.Tutorial_Screen_One_Sub_Title);
	}

	@And("^Swipe left and right from welcome screen$")
	public void swipeLeftAndRightFromWelcomeScreen() {
		waitFor(2000);
		clickButtonWithOutScroll(NextButtonScreen);

	}

	@And("^User enter \"([^\"]*)\" Login credentials$")
	public void userEnterLoginCredentials(String arg0) throws Throwable {
		waitFor(5000);
		enterTextWithoutScroll(userName, AppInstallAndLaunchConstants.UN1);
		waitFor(3000);
		enterTextWithoutScroll(password, AppInstallAndLaunchConstants.PWD1);
	}

	@And("^Verify the Nectar Card points in LID screen$")
	public void verifyTheNectarCardPointsInLIDScreen() {
		waitFor(5000);
		clickButtonWithOutScroll(CloseNectarPopup);
		Assert.assertTrue(isElementDisplayed(NectarPointBalanceLID));
	}

	@And("^Verify that User should be able to see the tick mark for loaded card$")
	public void verifyThatUserShouldBeAbleToSeeTheTickMarkForLoadedCard() {
		waitFor(5000);
		Assert.assertTrue(isElementEnabled(OfferAppliedTickMark));
		Assert.assertTrue(isElementEnabled(OffersBannerPanen));

	}
	@Then("^user validates first tutorial screen$")
	public void userValidatesFirstTutorialScreen() {
		waitFor(10);
		waitForElement(CarImageWelScreen,20);
		Assert.assertTrue(CarImageWelScreen.isDisplayed());
		Assert.assertTrue(EssoLogo.isDisplayed());
	}

	@And("^User click on get Started Button$")
	public void userClickOnGetStartedButton() {
		waitForElement(GetStarted_BTN,20);
		clickButtonWithOutScroll(GetStarted_BTN);
		waitForElement(AllowNBtn,4);
		clickButtonWithOutScroll(AllowNBtn);
		clickButtonWithOutScroll(AllowNBtn1);
		clickButtonWithOutScroll(Rolloutct);
		clickButtonWithOutScroll(RolloutctOk);
	}

	@And("^Verify the Element displayed in NLID screen$")
	public void verifyTheElementDisplayedInNLIDScreen() {
		waitForElement(FuelAsGeustNLID,20);
		Assert.assertTrue(FuelAsGeustNLID.isEnabled());
		Assert.assertTrue(RegisterUserButton.isEnabled());
		Assert.assertTrue(loginTextNLID.isDisplayed());
		Assert.assertTrue(loginWithText.isDisplayed());
		Assert.assertTrue(AppleIconNLID.isEnabled());
		Assert.assertTrue(FBIconNLID.isEnabled());
		Assert.assertTrue(twitterIconLID.isEnabled());
		Assert.assertTrue(linkedINIconNLID.isEnabled());
	}

	@Then("^click on allow button$")
	public void clickOnAllowButton() {
		waitForElement(AllowInPopupScreen,20);
		clickButtonWithOutScroll(AllowInPopupScreen);
	}

	@Then("^Verify elements present in second screen$")
	public void verifyElementsPresentInSecondScreen() {
		waitFor(4000);
		waitForElement(Screen2Tittle,20);
		staticTextValidation(Screen2Tittle, AppInstallAndLaunchConstants.ScreenTitleText);
		staticTextValidation(Screen2SubTittle, AppInstallAndLaunchConstants.ScreenSubTitleText);
	}

	@Then("^Verify the Cookie page elements$")
	public void verifyTheCookiePageElements() {
		
		waitFor(2000);
		if (platformName.equalsIgnoreCase("android")) {
			waitForElement(acceptAllButtonAppLaunch,20);
			staticTextValidation(CookieSubText1AppLaunch, AppInstallAndLaunchConstants.CookieSubTextAnd1);
			Assert.assertTrue(acceptAllButtonAppLaunch.isEnabled());
			Assert.assertTrue(manageOptionButtonAppLaunch.isEnabled());
		} else {
			waitForElement(acceptAllButtonAppLaunch,20);
			staticTextValidation(CookieSubText1AppLaunch, AppInstallAndLaunchConstants.CookieSubText1);
			staticTextValidation(CookieSubText2AppLaunch, AppInstallAndLaunchConstants.CookieSubText2);
			Assert.assertTrue(acceptAllButtonAppLaunch.isEnabled());
		  waitForElement(manageOptionButtonAppLaunch,4);
			Assert.assertTrue(manageOptionButtonAppLaunch.isEnabled());

		}

	}

	@And("^Click Accept all button in the cookie page$")
	public void clickAcceptAllButtonInTheCookiePage() {
		waitForElement(acceptAllButtonAppLaunch,20);
		clickButtonWithOutScroll(acceptAllButtonAppLaunch);
	}
}
