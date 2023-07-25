package stepDefinitions;

import contants.ModalPopupConstants;
import contants.RedemptionOptionConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ModalPopupPage;
import pages.RedemptionOptionPage;

import java.security.Key;

public class ModalPopupSteps extends ModalPopupPage {
  RedemptionOptionPage paymentPage=new RedemptionOptionPage();
    ModalPopupPage ModelPage=new ModalPopupPage();
    @And("^Click on Stations tab$")
    public void clickOnStationsTab() {
        waitFor(8000);
        System.out.println("Station tab is displayed"+StationTabLID.isDisplayed());
        clickButtonWithOutScroll(StationTabLID);
    }

    @Then("^Click on ListStations$")
    public void clickOnListStations() {
        waitFor(4000);
        clickButtonWithOutScroll(listStations);
    }

    @And("^Click on the First station displayed in the list$")
    public void clickOnTheFirstStationDisplayedInTheList() {
        clickButtonWithOutScroll(stationInfoLink);
    }

    @And("^Click on View button on popup window$")
    public void clickOnViewButtonOnPopupWindow() {
        //boolean isPresent = viewDetailsPopup.isDisplayed();
        for (int i=0;i<=4;i++) {
        //if(enterViewDetailsPopup.size()>=1)
            if(enterViewDetailsPopup.size()>=1){
            waitFor(2000);
            System.out.println("System is clicked on View Details button");
            clickButtonWithOutScroll(viewDetailsPopup);
            break;
        }
        else{
                clickButtonWithOutScroll(bcakButtonInStationDetails);
                clickButtonWithOutScroll(stationInfoLink);
            }
        }
    }

    @Then("^Click on the Terms and Condition link on the popup$")
    public void clickOnTheTermsAndConditionLinkOnThePopup() {
        clickButtonWithOutScroll(termsConditionLink);
    }

    @And("^Click on the Close button$")
    public void clickOnTheCloseButton() {
        staticTextValidation(termsConditionText, ModalPopupConstants.TermsConditionMessage);
        clickButtonWithOutScroll(CloseButton);

    }


    @Then("^Search the Station in the Search box$")
    public void searchTheStationInTheSearchBox() {
        waitFor(5000);
        enterTextWithoutScroll(stationSearchBox, ModalPopupConstants.StationSearchText+Keys.ARROW_DOWN+Keys.ENTER);
        androidTap();
        waitFor(3000);
    }

    @And("^Click on the Close button in terms and condition page$")
    public void clickOnTheCloseButtonInTermsAndConditionPage() {
        waitFor(2000);
        clickButtonWithOutScroll(CloseButton);
    }

    @Then("^Verify the terms and Conditions link$")
    public void verifyTheTermsAndConditionsLink() {
        Assert.assertTrue(termsConditionText.isDisplayed());

    }

    @And("^Verify the Load to Card button should display$")
    public void verifyTheLoadToCardButtonShouldDisplay() {
        Assert.assertTrue(loadToCardButton.isDisplayed());
    }

    @And("^Verify the Close icon is displayed on popup screen$")
    public void verifyTheCloseIconIsDiaplyedOnPopupScreen() {
        Assert.assertTrue(CloseButton.isDisplayed());
    }

    @And("^Verify the Title of the Modal popup$")
    public void verifyTheTitleOfTheModalPopup() {
        Assert.assertTrue(ModalPopupHeader.isDisplayed());

    }

    @Then("^Verify the View details is button displayed$")
    public void verifyTheViewDetailsIsButtonDisplayed() {
        Assert.assertTrue(viewDetailsPopup.isDisplayed());
    }

    @And("^Verify Close icon is displayed on modal popup screen$")
    public void verifyCloseIconIsDisplayedOnModalPopupScreen() {
        waitFor(2000);
        Assert.assertTrue(modalImagePopup.isDisplayed());
    }

    @And("^Verify that User offer popup should not displayed$")
    public void verifyThatUserOfferPopupShouldNotDisplayed() {
        Assert.assertTrue(StationPopupScreen.size()<=0);
    }

    @And("^Click on Load to Card button$")
    public void clickOnLoadToCardButton() {
        clickButtonWithOutScroll(loadToCardButton);
    }

    @Then("^Click on Close button$")
    public void clickOnCloseButton() {
        clickButtonWithOutScroll(CloseButton);
        
    }
    @And("^Click on Back button$")
    public void clickOnBackButton() {
        clickButtonWithOutScroll(bcakButtonInStationDetails);
    }
    @Then("^Click on fuel tab$")
    public void clickOnFuelTab() {
        waitFor(2000);
        clickButtonWithOutScroll(FuelTab);
        
    }

    @And("^Verify that tick mark is displayed on the offers$")
    public void verifyThatTickMarkIsDiaplayedOnTheOffers() {
        waitFor(5000);
        Assert.assertTrue(OfferAppliedTickMark.isDisplayed());
    }


    @And("^Click on Close button in Modal popup$")
    public void clickOnCloseButtonInModalPopup() {
        for (int i=0;i<=4;i++) {
            if(enterViewDetailsPopup.size()>=1){
                waitFor(2000);
                clickButtonWithOutScroll(closeModalPopup);
                break;
            }
            else{
                clickButtonWithOutScroll(bcakButtonInStationDetails);
                clickButtonWithOutScroll(stationInfoLink);
            }
        }
    }

}
