package stepDefinitions;

import contants.AccountConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import contants.StationFinderConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountPage;
import pages.Nectar_PointsinFilterPage;

public class NectarPointinFilteSteps extends Nectar_PointsinFilterPage{
	Nectar_PointsinFilterPage stationfinder = new Nectar_PointsinFilterPage();
	StationFinderConstants TestData;
	@Given("^Login to ESSO app$")
	public void login_to_ESSO_app() throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(DashboardLoginlink);
		clickButtonWithOutScroll(userName);
		clickButtonWithOutScroll(clickOnCancelbutton);
		enterTextWithoutScroll(userName,StationFinderConstants.userName);
		enterTextWithoutScroll(password,StationFinderConstants.password);
		clickButtonWithOutScroll(loginButton);
		waitFor(2000);
	}

	@When("^Stations accepting Mobile pay should have Nectar points in the filter options$")
	public void stations_accepting_Mobile_pay_should_have_Nectar_points_in_the_filter_options() throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(stations);
		waitFor(2000);
		//clickButtonWithOutScroll(continueButton);
		//clickButtonWithOutScroll(locationPermission);
		clickButtonWithOutScroll(filterButton);
		waitFor(2000);
		NectarPointScroll();
		//ScrollTo(StationFinderConstants.nectarPoint, AccountConstants.IOSSCROLLUP, stationfinder.nectarPointlink);
		nectarPointsLinkVarification();
	}
	
	@Then("^From LID screen reach Station finder$")
	public void from_LID_screen_reach_Station_finder() throws Throwable {
		nectarPointlink.click();
		applyFilter.click();
		searchBox.sendKeys(TestData.citySeacrch,Keys.ENTER);
		clickButtonWithOutScroll(filterButton);
		waitFor(2000);

		nectarPointsLinkClick();


	}
}
