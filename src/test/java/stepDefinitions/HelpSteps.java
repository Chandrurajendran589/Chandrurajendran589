package stepDefinitions;

import contants.AccountConstants;
import contants.MenuConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import pages.AccountPage;
import pages.HelpPage;
import contants.HelpConstants;
import pages.MenuPage;

public class HelpSteps extends HelpPage {
    MenuPage MenuPage = new MenuPage();

    @Given("^user clicks the more icon$")
    public void user_clicks_the_more_icon() throws Throwable {
        waitFor(5000);
        clickButtonWithOutScroll(moreIcon);
    }

    @When("^user clicks the esso tutorial icon after clicking help icon$")
    public void user_clicks_the_esso_tutorial_icon_after_clicking_help_icon() throws Throwable {
        clickButtonWithOutScroll(helpIcon);
        isElementDisplayed(essoTutorialIcon);
        clickButtonWithOutScroll(essoTutorialIcon);
    }

   @Given("^user login the Account using credentials$")
    public void user_login_the_Account_using_credentials() throws Throwable
   {
       waitElementToBeClickable(loginIcon);
       clickButtonWithOutScroll(loginIcon);
       clickButtonWithOutScroll(username);
       username.sendKeys("Shruthi.s2@photoninfotech.net");
       clickButtonWithOutScroll(password);
       password.sendKeys("photon@1234");
       clickButtonWithOutScroll(loginbtn);
   }

   @And("^user validates the welcome screen for 30% completion$")
    public void user_validates_the_welcome_screen_for_thirty_percent_completion() throws Throwable
   {
       isElementDisplayed(thirtypercent);
       isElementDisplayed(circularIndicator);
   }

    @Given("^user taps the complete profile tab$")
    public void user_taps_the_complete_profile_tab() throws Throwable
    {

        clickButtonWithOutScroll(completeprofileIcon);

    }

    @And("^user adds the Nectar card details by clicking the Add nectar card$")
    public void user_adds_the_Nectar_card_details_by_clicking_the_Add_nectar_card() throws Throwable
    {
        //scrollToElement(addNdectarIcon);web element
        waitElementToBeClickable(addNdectarIcon);
        clickButtonWithOutScroll(addNdectarIcon);
        clickButtonWithOutScroll(nectarGetStarted);
        nectarCardNumber.sendKeys("46362546060");

        isElementDisplayed(nectarCompletionicon);
        clickButtonWithOutScroll(nectarCompletionicon);
    }

    @Then("^user check for Add Nectar Task as Completed$")
    public void user_check_for_Add_Nectar_Task_as_Completed() throws Throwable
    {
        isElementDisplayed(completeprofileIcon);
        clickButtonWithOutScroll(completeprofileIcon);
        scrollToElement(addNdectarIcon);
        clickButtonWithOutScroll(addNdectarIcon);
        isElementDisplayed(nectarAlreadyCompleted);
    }

    @And("^user verifies the Already completed pop up$")
    public void user_verifies_the_Already_completed_pop_up() throws Throwable
    {
        isElementDisplayed(nectarAlreadyCompleted);
        clickButtonWithOutScroll(nectarAlreadycompltdpopup);
    }

    @Then("^navigate to the Nectar card section$")
    public void navigate_to_the_nectar_card_section() throws Throwable {
        waitFor(5000);
        ScrollTo(MenuConstants.LOGOUTTXT, MenuConstants.IOSSCROLLUP, MenuPage.LogOut);
//        ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP, AccountPage.AccountNectarCardSection);
    }

    @And("^Delete the Nectar card if it is present$")
    public void delete_the_nectar_card_if_it_is_present() throws Throwable {
        waitFor(3000);
        if (isElementDisplayedWithoutAssert(AccountPage.AccountNectarCardAdded)) {
            clickButtonWithOutScroll(AccountPage.AccountNectarCardAdded);
            clickButtonWithOutScroll(AccountPage.AccountDeleteNectarPopup);
            waitFor(2000);
            clickButtonWithOutScroll(AccountPage.NectarDeleteSuccessfulPopup);
        }
        clickButtonWithOutScroll(AccountPage.AccountAddNectarCardButton);
    }

    @And("^Add the Nectar card$")
    public void add_the_nectar_card() throws Throwable {
        enterTextWithoutScroll(AccountPage.NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
        clickButtonWithOutScroll(AccountPage.DoneButtonInNectarKeypad);
        clickButtonWithOutScroll(AccountPage.NextButtonNectarCardAddScreen);
        waitFor(2000);
        clickButtonWithOutScroll(AccountPage.AccountNectarCardVerifyLaterPopup);
        clickButtonWithOutScroll(AccountPage.AccountNectarVerifyLaterSkip);
    }

    @Then("^Verify the nectar card section in the Account screen$")
    public void verify_the_nectar_card_section_in_the_account_screen() throws Throwable {
        ScrollTo(MenuConstants.LOGOUTTXT, MenuConstants.IOSSCROLLUP, MenuPage.LogOut);
        Assert.assertTrue(
                isTextMatch(AccountPage.AccountNectarCardAdded.getText(), AccountConstants.ACCOUNTSCREENDELETENECTARCARDBUTTONCT));
        Assert.assertTrue(isElementDisplayedWithoutScroll(AccountPage.AccountNectarCardWithStars));
    }

    @And("^user taps on Help icon$")
    public void user_taps_on_help_icon() throws Throwable {
    	waitForElement(helpIcon,10);
    	Assert.assertTrue(isElementDisplayedWithoutScroll(helpIcon));
        clickButtonWithOutScroll(helpIcon);
    }

    @And("^user taps on Tutorial button in Help screen$")
    public void user_taps_on_tutorial_button_in_help_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayedWithoutScroll(essoTutorialIcon));
        clickButtonWithOutScroll(essoTutorialIcon);
    }

    @Then("^user verifies the first screen$")
    public void user_verifies_the_first_screen() throws Throwable {
        waitFor(5000);
        if ("ANDROID".equalsIgnoreCase(platformName)) {
        	waitFor(5000);
            Assert.assertTrue(isElementDisplayedWithoutScroll(MenuPage.exxon_Help_feedback_Close));
            Assert.assertTrue(isTextMatch(FirstScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALONE));
            Assert.assertTrue(isTextMatch(FirstScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALONE));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        } else {
            Assert.assertTrue(isElementDisplayedWithoutScroll(MenuPage.exxon_Help_feedback_Close));
            Assert.assertTrue(isTextMatch(FirstScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALONE1));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        }
    }

    @And("^user taps on next button in the Tutorial screen one of the Help screen$")
    public void user_taps_on_next_button_in_the_tutorial_screen_one_of_the_help_screen() throws Throwable {
    	waitFor(5000);
    	//Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        clickButtonWithOutScroll(nextIcon);
    }

    @Then("^user verifies the second screen$")
    public void user_verifies_the_second_screen() throws Throwable {
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            Assert.assertTrue(isTextMatch(SecondScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTWO));
            Assert.assertTrue(isTextMatch(SecondScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTWO));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        } else {
            Assert.assertTrue(isTextMatch(SecondScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTWO));
            Assert.assertTrue(isTextMatch(SecondScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTWO1));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        }
    }

    @Then("^user verifies the third screen$")
    public void user_verifies_the_third_screen() throws Throwable {
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            Assert.assertTrue(isTextMatch(ThirdScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTHREE));
            Assert.assertTrue(isTextMatch(ThirdScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTHREE));
            Assert.assertTrue(isElementDisplayedWithoutScroll(GetStartedThirdTutorial));
        } else {
            Assert.assertTrue(isTextMatch(ThirdScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTHREE));
            Assert.assertTrue(isTextMatch(ThirdScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTHREE1));
            Assert.assertTrue(isElementDisplayedWithoutScroll(GetStartedThirdTutorial));
        }
    }

    @And("^user taps on Get started button in the Help screen$")
    public void user_taps_on_get_started_button_in_the_help_screen() throws Throwable {
        //Assert.assertTrue(isElementDisplayedWithoutScroll(GetStartedThirdTutorial));
        clickButtonWithOutScroll(GetStartedThirdTutorial);
    }

    @Then("^user lands on Help screen in NLID$")
    public void user_lands_on_help_screen_in_nlid() throws Throwable {
        Assert.assertTrue(isElementDisplayedWithoutScroll(essoTutorialIcon));
    }

    @And("^user taps on next button in the Tutorial screen two of the Help screen$")
    public void user_taps_on_next_button_in_the_tutorial_screen_two_of_the_help_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        clickButtonWithOutScroll(nextIcon);
    }
}