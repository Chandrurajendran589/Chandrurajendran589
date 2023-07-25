package stepDefinitions;

import contants.AccountConstants;
import contants.StationFinderConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import pages.ContextualRegistrationPage;
import pages.FrictionlessFlowPage;
import pages.MenuPage;
import pages.StationFinderPage;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;

public class StationFinderSteps extends StationFinderPage {

    FrictionlessFlowPage frictionlessFlowPage = new FrictionlessFlowPage();

    @Then("^Verify the app display icons next to all available services and facilities$")
    public void verifyTheAppDisplayIconsNextToAllAvailableServicesAndFacilities() throws Throwable {
        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayedWithoutAssert(MobilePaymentEnabledIcon);
            isElementDisplayedWithoutAssert(OpenHoursIcon);
            isElementDisplayedWithoutAssert(TescoExpressIcon);
            isElementDisplayedWithoutAssert(FoodServiceIcon);
            isElementDisplayedWithoutAssert(PremiumCoffeeIcon);
            isElementDisplayedWithoutAssert(CustomerToiletsIcon);
            isElementDisplayedWithoutAssert(ATMIcon);
            isElementDisplayedWithoutAssert(MotorwayIcon);
            isElementDisplayedWithoutAssert(HGVPumpsIcon);
            isElementDisplayedWithoutAssert(SynergyIcon);
            isElementDisplayedWithoutAssert(SynergyUnleadedIcon);
            isElementDisplayedWithoutAssert(LPGIcon);
            isElementDisplayedWithoutAssert(AdBlueIcon);
            ScrollTo(StationFinderConstants.NECTARTXT, AccountConstants.IOSSCROLLUP, ClubCardService);
            isElementDisplayedWithoutAssert(CarWashIcon);
            isElementDisplayedWithoutAssert(JetWashIcon);
            isElementDisplayedWithoutAssert(AirTowerIcon);
            isElementDisplayedWithoutAssert(MobIcon);
            isElementDisplayedWithoutAssert(NectarPointsIcon);
            isElementDisplayedWithoutAssert(ClubCardIcon);
        }
        else {
            isElementEnabled(MobilePaymentEnabledIcon);
            isElementEnabled(OpenHoursIcon);
            isElementEnabled(TescoExpressIcon);
            isElementEnabled(FoodServiceIcon);
            isElementEnabled(PremiumCoffeeIcon);
            isElementEnabled(CustomerToiletsIcon);
            isElementEnabled(ATMIcon);
            isElementEnabled(MotorwayIcon);
            isElementEnabled(HGVPumpsIcon);
            isElementEnabled(SynergyIcon);
            isElementEnabled(SynergyUnleadedIcon);
            isElementEnabled(LPGIcon);
            isElementEnabled(AdBlueIcon);
            ScrollTo(StationFinderConstants.NECTARTXT, AccountConstants.IOSSCROLLUP, ClubCardService);
            isElementEnabled(CarWashIcon);
            isElementEnabled(JetWashIcon);
            isElementEnabled(AirTowerIcon);
            isElementEnabled(MobIcon);
            isElementEnabled(NectarPointsIcon);
            isElementEnabled(ClubCardIcon);
        }

    }


    @Then("^verify the app display icons next to all available services and facilities in the respective station$")
    public void verifyTheAppDisplayIconsNextToAllAvailableServicesAndFacilitiesInTheRespectiveStation() {

        //ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLDOWN, Servs);
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(5000);
            ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLUP,Servs);
            waitFor(9000);
            isElementDisplayed(MobPayment);
            isElementDisplayed(Synergy);
            isElementDisplayed(MobOne);
        }
        else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLUP,Servs);
            waitFor(9000);
            staticTextValidation(MobPayment,StationFinderConstants.MOBPAYMENT);

            staticTextValidation(Synergy,StationFinderConstants.SYNERGY);

            staticTextValidation(MobOne, StationFinderConstants.MOB);
        }
    }

    @Then("^user clicks on close icon for station$")
    public void user_clicks_on_close_icon_for_station() throws Throwable {

        waitFor(6000);
        // clickButtonWithOutScroll(close_Icon_Station);
    }

    @Then("^user verify the app display the direct distance of the stations from device location$")
    public void userVerifyTheAppDisplayTheDirectDistanceOfTheStationsFromDeviceLocation() {
        if (platformName.equalsIgnoreCase("iOS")) {

            waitFor(6000);
            isElementDisplayed(MilesStationOne);
            isElementDisplayed(MilesStationTwo);
        }
        else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(6000);
            staticTextValidation(MilesStationOne,StationFinderConstants.KM);
            staticTextValidation(MilesStationTwo, StationFinderConstants.KM);
        }
    }

    @Then("^user verify the app display the direct distance in miles for station in Station Details screen$")
    public void userVerifyTheAppDisplayTheDirectDistanceInMilesForStationInStationDetailsScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(9000);
            isElementDisplayed(StationOneMiles);
        }
        else if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(stationFirstMile, StationFinderConstants.KM);
        }
    }

    @Then("^check the map is displayed in the station finder screen$")
    public void checkTheMapIsDisplayedInTheStationFinderScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(3000);
            if(isElementDisplayed(StationMap)){
                logger.info("Map is displayed under 3 seconds");
            }
            else{
                logger.info("Map is not displayed");
            }

        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(6000);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }

    }

    @Then("^the user changes the view using zoom in and out and views the map$")
    public void theUserChangesTheViewUsingZoomInAndOutAndViewsTheMap() throws InterruptedException {
        waitFor(4000);
        ZoomInAndOut();
    }

    @Then("^check the stations are displayed in the station finder screen$")
    public void checkTheStationsAreDisplayedInTheStationFinderScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(3000);
            isElementDisplayed(SepStationsMap);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(2000);
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
//            isElementDisplayed(SepStationsMap);
        }
    }

    @When("^user taps on Mobile pay Stations in Esso Station Finder Screen$")
    public void userTapsOnMobilePayStationsInEssoStationFinderScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(3000);
            isElementEnabled(MobPayStationBtn);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(6000);
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }

    @And("^user should see the copy text displayed on the modal pop and the View Details Button$")
    public void userShouldSeeTheCopyTextDisplayedOnTheModalPopAndTheViewDetailsButton() {
        waitFor(6000);
        isElementDisplayed(ViewDetailsBtn);
    }

    @Then("^user should see the modal pop with offer details and Terms and Conditions$")
    public void userShouldSeeTheModalPopWithOfferDetailsAndTermsAndConditions() {
        waitFor(4000);
        staticTextValidation(TermsAndCondLink,"Terms and Conditions");
        isElementDisplayed(BannerCloseBtn);
    }

    @Then("^user taps on View Details Button$")
    public void userTapsOnViewDetailsButton() {
        waitFor(3000);
        clickButtonWithOutScroll(ViewDetailsBtn);
    }

    @Then("^tap on close button in offer details modal pop up$")
    public void tapOnCloseButtonInOfferDetailsModalPopUp() {
        waitFor(3000);
        clickButtonWithOutScroll(BannerCloseBtn);
    }

    @And("^user taps on Terms and Conditions link in the view Details modal pop up$")
    public void userTapsOnTermsAndConditionsLinkInTheViewDetailsModalPopUp() {

        clickButtonWithOutScroll(TermsAndCondLink);
    }

    @Then("^the system navigates to the Fuel Finder Screen$")
    public void theSystemNavigatesToTheFuelFinderScreen() {

        if (platformName.equalsIgnoreCase("iOS")) {

            isElementDisplayed(MobPayStationBtn);
            isElementDisplayed(AllEssoStationBtn);
            isElementDisplayed(MapBtn);
            isElementDisplayed(FavBtn);
        }
        else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(7000);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }



    @And("^user taps on close button in view details modal pop up$")
    public void userTapsOnCloseButtonInViewDetailsModalPopUp() {

        clickButtonWithOutScroll(BannerCloseBtn);
    }


    @Then("^the system should display location services access help text$")
    public void theSystemShouldDisplayLocationServicesAccessHelpText() {

        isElementDisplayed(LocHelpText);

    }

    @When("^user verifies Continue button is displayed in Allow Location screen$")
    public void userVerifiesContinueButtonIsDisplayedInAllowLocationScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {

            isElementDisplayed(MenuPage.AllowLocContinueButton);
        }
        else if (platformName.equalsIgnoreCase("Android")) {

            waitFor(7000);
            staticTextValidation(MenuPage.AllowLocContinueButton, StationFinderConstants.CONTINUEBTN);
        }
    }

    @When("^user enters \"([^\"]*)\" in the registration details$")
    public void userEntersInTheRegistrationDetails(String arg0) throws Throwable {
        enterTextWithoutClick(ContextualRegistrationPage.RegstrFirstName, StationFinderConstants.REGISTERFNAME);
        enterTextWithoutClick(ContextualRegistrationPage.RegstrLastName, StationFinderConstants.REGISTERLNAME);
        waitFor(1000);
        enterTextWithoutClick(ContextualRegistrationPage.RegstrEmail, arg0 + getSaltNumber()
                + StationFinderConstants.REGISTEREMAILDOM);
        enterTextWithoutClick(ContextualRegistrationPage.RegstrPass, StationFinderConstants.REGISTERPASS);
        enterTextWithoutClick(ContextualRegistrationPage.RegstrConfPass, StationFinderConstants.REGISTERCONFPASS);
    }
    private Sequence zoomSinglefinger(String fingerName, Point locus, int startRadius, int endRadius, double angle, Duration duration) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, fingerName);
        Sequence fingerPath = new Sequence(finger, 0);

        double midpointRadius = startRadius + (endRadius > startRadius ? 1 : -1) * 20;

        // find coordinates for starting point of action (converting from polar coordinates to cartesian)
        int fingerStartx = (int)Math.floor(locus.x + startRadius * Math.cos(angle));
        int fingerStarty = (int)Math.floor(locus.y - startRadius * Math.sin(angle));

        // find coordinates for first point that pingers move quickly to
        int fingerMidx = (int)Math.floor(locus.x + (midpointRadius * Math.cos(angle)));
        int fingerMidy = (int)Math.floor(locus.y - (midpointRadius * Math.sin(angle)));

        // find coordinates for ending point of action (converting from polar coordinates to cartesian)
        int fingerEndx = (int)Math.floor(locus.x + endRadius * Math.cos(angle));
        int fingerEndy = (int)Math.floor(locus.y - endRadius * Math.sin(angle));
        // move finger into start position
        fingerPath.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), fingerStartx, fingerStarty));
        // finger comes down into contact with screen
        fingerPath.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        // finger moves a small amount very quickly
        fingerPath.addAction(finger.createPointerMove(Duration.ofMillis(1), PointerInput.Origin.viewport(), fingerMidx, fingerMidy));
        // pause for a little bit
        fingerPath.addAction(new Pause(finger, Duration.ofMillis(100)));
        // finger moves to end position
        fingerPath.addAction(finger.createPointerMove(duration, PointerInput.Origin.viewport(), fingerEndx, fingerEndy));
        // finger lets up, off the screen
        fingerPath.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        return fingerPath;
    }
    private Collection<Sequence> zoom(Point locus, int startRadius, int endRadius, int pinchAngle, Duration duration) {
        // convert degree angle into radians. 0/360 is top (12 O'clock).
        double angle = Math.PI / 2 - (2 * Math.PI / 360 * pinchAngle);
        // create the gesture for one finger
        Sequence fingerAPath = zoomSinglefinger("fingerA", locus, startRadius, endRadius, angle, duration);
        // flip the angle around to the other side of the locus and get the gesture for the second finger
        angle = angle + Math.PI;
        Sequence fingerBPath = zoomSinglefinger("fingerB", locus, startRadius, endRadius, angle, duration);
        return Arrays.asList(fingerAPath, fingerBPath);
    }
    private Collection<Sequence> zoomIn(Point locus, int distance) {
        return zoom(locus, 200, 200 + distance, 45, Duration.ofMillis(25));
    }

    private Collection<Sequence> zoomOut(Point locus, int distance) {
        return zoom(locus, 200 + distance, 200, 45, Duration.ofMillis(25));
    }
    public void ZoomInAndOut() throws InterruptedException {
        // tap center to dismiss toolbars
        WebElement map = driver.findElementByXPath("\t\n" +
                "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
        map.click();

        Rectangle mapCoordinates = map.getRect();
        Point center = getCenter(mapCoordinates);
        driver.perform(zoomOut(center, 450));
        Thread.sleep(1000);
        driver.perform(zoomIn(center, 450));
        Thread.sleep(1000);
        driver.perform(zoomOut(center.moveBy(0, 250), 300));
        Thread.sleep(1000);
        driver.perform(zoomIn(center.moveBy(0, -250), 300));
        Thread.sleep(3000);
    }
    private Point getCenter(Rectangle rect) {
        return new Point(rect.x + rect.getWidth() / 2, rect.y + rect.getHeight() / 2);
    }
    @Then("^verify whether the system should close the prompt$")
    public void verifyWhetherTheSystemShouldCloseThePrompt() {

        Assert.assertTrue(isElementDisplayed(MenuPage.DontallowCancel));
        Assert.assertTrue(isElementDisplayed(MenuPage.DontAllowSettings));
    }

    @Then("^verify whether the system navigate back to the fuel finder screen$")
    public void verifyWhetherTheSystemNavigateBackToTheFuelFinderScreen() {

        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isElementDisplayed(MenuPage.DontallowCancel));
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
        }

    }


    @When("^user taps on any of the following using the App button$")
    public void userTapsOnAnyOfTheFollowingUsingTheAppButton() {
        if (platformName.equalsIgnoreCase("iOS")) {

            waitFor(5000);
            Assert.assertTrue(isElementDisplayed(MobPayStationBtn));
            Assert.assertTrue(isElementDisplayed(AllEssoStationBtn));
        }
        else if (platformName.equalsIgnoreCase("Android")) {

            waitFor(5000);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }


    }

    @Then("^Verify whether the user is able to tap on Station Finder$")
    public void verifyWhetherTheUserIsAbleToTapOnStationFinder() {

        isElementDisplayed(TabStation);
        waitFor(4000);
        clickButtonWithOutScroll(frictionlessFlowPage.completed_Popup);
        waitFor(4000);
        staticTextValidation(TabStation, StationFinderConstants.STATION);
        clickButtonWithOutScroll(TabStation);
    }

    @And("^user clicks on Settings button$")
    public void userClicksOnSettingsButton() {

        if (platformName.equalsIgnoreCase("iOS")) {

            clickButtonWithOutScroll(MenuPage.DontAllowSettings);
        }
    }

    @And("^user clicks on Cancel button$")
    public void userClicksOnCancelButton() {

        clickButtonWithOutScroll(MenuPage.DontallowCancel);
    }

    @And("^verify whether the system displays reference to nectar$")
    public void verifyWhetherTheSystemDisplaysReferenceToNectar() {
        if (platformName.equalsIgnoreCase("iOS")) {
            ScrollTo(StationFinderConstants.NECTARPTS, AccountConstants.IOSSCROLLUP, NectarPoints);
            isElementDisplayed(NectarPoints);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(MobilePaymentEnabledService, StationFinderConstants.MOBPAYMENT);
            waitFor(3000);
            staticTextValidation(OpenHoursService, StationFinderConstants.OPENHOURS);
            waitFor(3000);
            staticTextValidation(TescoExpressService, StationFinderConstants.TESCO);
            waitFor(3000);
            staticTextValidation(NectarPoints, StationFinderConstants.NECTARPTS);
        }
    }

    @Then("^Verify whether the system is able to display the following components as part of Station finder$")
    public void verifyWhetherTheSystemIsAbleToDisplayTheFollowingComponentsAsPartOfStationFinder() {

        if (platformName.equalsIgnoreCase("iOS")) {

            isElementDisplayed(StationSearch);
            isElementDisplayed(StationFilter);
            isElementDisplayed(MobPayStationBtn);
            isElementDisplayed(AllEssoStationBtn);
            isElementDisplayed(MapBtn);
            isElementDisplayed(FavBtn);
        }
        else if (platformName.equalsIgnoreCase("Android")) {

            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);

            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }
    }

    @Then("^verify whether the system is able to navigate to the App level settings under Device Settings$")
    public void verifyWhetherTheSystemIsAbleToNavigateToTheAppLevelSettingsUnderDeviceSettings() {

        waitFor(1000);
        isTextMatch(AllowAccessTxt.getText(),StationFinderConstants.ALLOWACCESSTXT);
        Assert.assertTrue(isElementDisplayed(LocSetting));
    }

    @Then("^Verify the System is able to display the following components as part of Filter By screen$")
    public void verify_the_system_is_able_to_display_the_following_components_as_part_of_filter_by_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(filter_by_Header, StationFinderConstants.FILTER);
            staticTextValidation(FilterByStartText, StationFinderConstants.FILTERSTARTTEXT);
            staticTextValidation(OpenHoursService,StationFinderConstants.OPENHOURS);
            staticTextValidation(TescoExpressService,StationFinderConstants.TESCO);
            staticTextValidation(filter_Cancel_Btn, StationFinderConstants.FILTERCANCEL);
            staticTextValidation(filter_Apply_Btn, StationFinderConstants.FILTERAPPLY);
        }
        else{
            waitForElement(filter_by_Header,3);
            Assert.assertTrue(isElementDisplayed(filter_by_Header));
            Assert.assertTrue(isElementDisplayed(FilterByStartText));
            Assert.assertTrue(isElementDisplayed(filter_Cancel_Btn));
            Assert.assertTrue(isElementDisplayed(filter_Apply_Btn));
            Assert.assertTrue(FilterServicesList.size()==19);
        }

    }

    @Then("^whether System navigates to extended Map View By default$")
    public void whether_system_navigates_to_extended_map_view_by_default() throws Throwable {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(4000);
            isElementDisplayed(StationMap);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }

    @Then("^verify user is in the Station details screen$")
    public void verify_user_is_in_the_station_details_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(4000);
            staticTextValidation(station_Address, StationFinderConstants.KM);
            isElementEnabled(station_Address);
        }
        else{
            waitFor(9000);
            if(isElementDisplayedWithoutAssert(GotItBtn)||isElementDisplayedWithoutAssert(ViewDetailsBtn)){
                clickButtonWithOutScroll(GotItClose);
            }
            waitFor(5000);
            isElementEnabled(OpeningHours);
            isElementEnabled(MobPayAccept);
            isElementEnabled(FuelHrsTxt);
            isElementEnabled(PhoneTxt);
            Assert.assertTrue(GetDirections.isEnabled());
        }
    }

    @Then("^verify whether System to display phone number in station details screen$")
    public void verify_whether_system_to_display_phone_number_in_station_details_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            staticTextValidation(station_Phno, StationFinderConstants.STATIONPHNO);
        }

    }

    @And("^check whether System displays Opening Hours details in Station Details screen$")
    public void check_whether_system_displays_opening_hours_details_in_station_details_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(4000);
            staticTextValidation(open_Hours_Station, StationFinderConstants.OPENHOURSSTATION);
            staticTextValidation(shop_Hours_Station, StationFinderConstants.SHOPHOURSSTATION);
            waitFor(5000);
            ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLUP,Servs);
            staticTextValidation(fuel_Hours_Station, StationFinderConstants.FUELHOURSSTATION);
        }
    }

    @When("^user taps on phone number$")
    public void user_taps_on_phone_number() throws Throwable {

        waitFor(9000);
        clickButtonWithOutScroll(phno_Station);
    }

    @And("^check whether the System displays prompt with phone number with Call and cancel button$")
    public void check_whether_the_system_displays_prompt_with_phone_number_with_call_and_cancel_button() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            staticTextValidation(phno_Call_Station, StationFinderConstants.PHNOCALLSTATION);
            staticTextValidation(phno_Cancel_Station, StationFinderConstants.PHNOCANCELSTATION);
        }
    }

    @When("^user taps on cancel button the system should close the prompt$")
    public void user_taps_on_cancel_button_the_system_should_close_the_prompt() throws Throwable {

        waitFor(4000);
        clickButtonWithOutScroll(phno_Cancel_Station);
    }

    @And("^System to navigate user to device level to make a call to the station when user tap on Call button$")
    public void system_to_navigate_user_to_device_level_to_make_a_call_to_the_station_when_user_tap_on_call_button() throws Throwable {

        waitFor(5000);
        staticTextValidation(open_Hours_Station, StationFinderConstants.OPENHOURSSTATION);
    }

    @Then("^user checks that the geolocation permission is on for app$")
    public void user_checks_that_the_geolocation_permission_is_on_for_app() throws Throwable {

        if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);

            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }
    }

    @Then("^check whether System show results based on entered city on the map as well as list view$")
    public void checkWhetherSystemShowResultsBasedOnEnteredCityOnTheMapAsWellAsListView() {
        if (platformName.equalsIgnoreCase("iOS")) {
           isElementDisplayed(CityMapView);
           isElementDisplayed(FirstStation);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(5000);
            staticTextValidation(address_Station_List, StationFinderConstants.KM);
        }
    }

    @Then("^verify whether system convert full Map View into split Map View and List View if user has tapped on List Stations button$")
    public void verifyWhetherSystemConvertFullMapViewIntoSplitMapViewAndListViewIfUserHasTappedOnListStationsButton() {
        if (platformName.equalsIgnoreCase("iOS")) {
//                isElementDisplayed(CityMapView);
//            isElementDisplayed(FirstStation);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(8000);
            isElementDisplayed(CityMapView);
            isElementDisplayed(MapBtn);
            staticTextValidation(address_Station_List, StationFinderConstants.KM);

        }
    }

    @Then("^Verify whether services available in the Esso station should be displayed in the List View$")
    public void verifyWhetherServicesAvailableInTheEssoStationShouldBeDisplayedInTheListView() {
        waitFor(3000);
        staticTextValidation(FilterByStartText, StationFinderConstants.FILTERSTARTTEXT);
        waitFor(3000);
        staticTextValidation(MobilePaymentEnabledService, StationFinderConstants.MOBPAYMENT);
        //isElementDisplayed(MobIcon);
        waitFor(3000);
        staticTextValidation(OpenHoursService, StationFinderConstants.OPENHOURS);
        //isElementDisplayed(OpenIcon);
        waitFor(3000);
        staticTextValidation(TescoExpressService, StationFinderConstants.TESCO);
        // isElementDisplayed(TescoIcon);
        waitFor(3000);
        staticTextValidation(NectarPoints, StationFinderConstants.NECTARPTS);
        //isElementDisplayed(NectarIcon);
        waitFor(3000);
        staticTextValidation(ClubPoints, StationFinderConstants.CLUB);
        //isElementDisplayed(ClubIcon);
    }

    @When("^user taps on cancel button in Filter By Screen$")
    public void userTapsOnCancelButtonInFilterByScreen() {
        waitFor(7000);
        clickButtonWithOutScroll(CancelFilterBtn);
    }

    @When("^user enters \"([^\"]*)\" in station finder$")
    public void userEntersInStationFinder(String arg0) throws Throwable {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(5000);
            enterTextWithoutScroll(StationSearch, arg0);
            waitFor(3000);
            actionClick(PostCdStation1);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(9000);
            enterTextWithoutScroll(StationSearch, arg0);
            waitFor(3000);
            getCoordinates(StationSearch);
            waitFor(1000);
            androidTap();
            waitFor(5000);
        }
    }

    @Then("^check whether System show results based on entered postcode on the map as well as list view$")
    public void checkWhetherSystemShowResultsBasedOnEnteredPostcodeOnTheMapAsWellAsListView() {
        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(PostcodeStation);
            isElementDisplayed(MapView);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(5000);
            staticTextValidation(address_Station_List, StationFinderConstants.KM);
            isElementDisplayed(CityMapView);
        }
    }

    @When("^user switches toggle button option$")
    public void userSwitchesToggleButtonOption() {
        if (isElementEnabled(MobPayStationBtn)) {
            clickButtonWithOutScroll(AllEssoStationBtn);
        } else {
            clickButtonWithOutScroll(MobPayStationBtn);
        }
    }

    @Then("^System should update results based on the search$")
    public void systemShouldUpdateResultsBasedOnTheSearch() {
        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(SearchResults);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);

            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }

    }

    @And("^check that the system loads all Esso Stations button$")
    public void checkThatTheSystemLoadsAllEssoStationsButton() {

        if (platformName.equalsIgnoreCase("iOS")) {
            isElementEnabled(AllEssoStationBtn);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(5000);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }
    }

    @When("^user taps on All esso Stations$")
    public void userTapsOnAllEssoStations() {
        waitFor(7000);

        clickButtonWithOutScroll(AllEssoStationBtn);
    }

    @Then("^the system displays the copy text msg$")
    public void theSystemDisplaysTheCopyTextMsg() {

        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(SorryMsg);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(3000);
            staticTextValidation(SorryMsg, StationFinderConstants.SORRYMSG);
        }
    }

    @And("^user verfies the copy text msg displayed$")
    public void userVerfiesTheCopyTextMsgDisplayed() {
        waitFor(1000);
        staticTextValidation(SorryMsg, StationFinderConstants.SORRYMSG);
    }

    @And("^system displays the current location on the map$")
    public void systemDisplaysTheCurrentLocationOnTheMap() {

        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(CurrentLocMap);
        }
        else if(platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);

            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }

    }

    @And("^verify System displays Mobile Pay Stations as selected by default$")
    public void verifySystemDisplaysMobilePayStationsAsSelectedByDefault() {

        if (platformName.equalsIgnoreCase("iOS")) {
            isElementEnabled(MobPayStationBtn);
        }
        else if (platformName.equalsIgnoreCase("Android"))
        {
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }

    @Then("^user verify the components in the station$")
    public void user_verify_the_components_in_the_station() throws Throwable {

        if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(4000);
            staticTextValidation(open_Hours_Station, StationFinderConstants.OPENHOURSSTATION);
            staticTextValidation(shop_Hours_Station, StationFinderConstants.SHOPHOURSSTATION);
            waitFor(5000);
            ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLUP,Servs);
            staticTextValidation(fuel_Hours_Station, StationFinderConstants.FUELHOURSSTATION);
            staticTextValidation(get_Direction_Station, StationFinderConstants.GETDIRECTION);
        }
    }

    @Then("^verify whether the system should be able to make the service call and load the nearby service stations$")
    public void verify_whether_the_system_should_be_able_to_make_the_service_call_and_load_the_nearby_service_stations() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            staticTextValidation(station_Phno, StationFinderConstants.STATIONPHNO);
        }
    }

    @Then("^system should display the copy text msg if the user has not given the location services access$")
    public void system_should_display_the_copy_text_msg_if_the_user_has_not_given_the_location_services_access() throws Throwable {

        if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(6000);
            staticTextValidation(location_Off_Msg, StationFinderConstants.LOCATIONOFFMSG);
            staticTextValidation(location_Off_Deny, StationFinderConstants.LOCATIONOFFDENY);
            staticTextValidation(location_Off_Ok, StationFinderConstants.LOCATIONOFFOK);
        }
    }

    @Then("^verify whether System is able to get the consolidated list of all available fueling stations with complete details$")
    public void verify_whether_system_is_able_to_get_the_consolidated_list_of_all_available_fueling_stations_with_complete_details() throws Throwable {

        if (platformName.equalsIgnoreCase("Android"))
        {
            waitFor(5000);
            staticTextValidation(address_Station_List, StationFinderConstants.KM);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

        }
        else{
            Assert.assertTrue(isElementDisplayed(address_Station_List));
            Assert.assertTrue(isElementEnabled(DirectionsLink));
        }
    }

    @When("^user taps on Get Directions Button$")
    public void user_taps_on_get_directions_button() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(9000);
            clickButtonWithOutScroll(get_Direction_Station);
        }
    }

    @Then("^user navigates to the route map view$")
    public void user_navigates_to_the_route_map_view() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(2000);
            staticTextValidation(direction_Get_Direction, StationFinderConstants.GETDIRDIRECTION);
        }
    }

    @Then("^user taps on back button in fuel finder screen$")
    public void user_taps_on_back_button_in_fuel_finder_screen() throws Throwable {

        waitFor(1000);
        androidBack();

    }

    @Then("^user navigates back to NLID screen$")
    public void user_navigates_back_to_nlid_screen() throws Throwable {

        waitFor(3000);
        staticTextValidation(complete_Profile, StationFinderConstants.COMPLETEPROFILE);
    }

    @Then("^user verifies the search icon in the fuel finder screen$")
    public void user_verifies_the_search_icon_in_the_fuel_finder_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(2000);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            isElementDisplayed(StationSearch);
        }
    }

    @Then("^user taps on Apply Filter Button$")
    public void user_taps_on_apply_filter_button() throws Throwable {

            waitFor(10000);
            clickButtonWithOutScroll(filter_Apply_Btn);
    }

    @And("^user clicks on ok button in location off popup$")
    public void user_clicks_on_ok_button_in_location_off_popup() throws Throwable {
        waitFor(4000);
        clickButtonWithOutScroll(location_Off_Ok);
    }

    @Then("^Check whether multiple stations are displayed in cluster$")
    public void check_whether_multiple_stations_are_displayed_in_cluster() throws Throwable {

        waitFor(2000);
        isElementEnabled(map_Cluster);
    }

    @When("^user taps on no thanks in turn on location pop up$")
    public void user_taps_on_no_thanks_in_turn_on_location_pop_up() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(no_Thanks_Button);
    }

    @And("^verify whether the app should not display 'Open now'or 'Closed Now' Status$")
    public void verifyWhetherTheAppShouldNotDisplayOpenNowOrClosedNowStatus() {
        waitForElement(OpeningHours,3);
        Assert.assertFalse(OpenNowTxt.isDisplayed());
    }

    @When("^user taps on any of the stations in the Map$")
    public void userTapsOnAnyOfTheStationsInTheMap() {
        clickButtonWithOutScroll(address_Station_List);
    }

    @Then("^the system navigates to the Esso Station Finder Screen$")
    public void theSystemNavigatesToTheEssoStationFinderScreen() {
        waitForElement(MobPayStationBtn,20);
        Assert.assertTrue(isTextMatch(StationHeader.getText(),"Esso Station Finder"));
        Assert.assertTrue(StationFilter.isEnabled());
        Assert.assertTrue(StationSearch.isEnabled());
        Assert.assertTrue(FavBtn.isEnabled());
        Assert.assertTrue(MapBtn.isEnabled());
        Assert.assertTrue(MobPayStationBtn.isEnabled());
        Assert.assertTrue(AllEssoStationBtn.isEnabled());
        Assert.assertTrue(listStations.isEnabled());
        isElementEnabled(MobPayStationBtn);
        isElementEnabled(AllEssoStationBtn);
        isElementEnabled(listStations);

    }
    @Then("^the system navigates to the Esso Finder Screen$")
    public void theSystemNavigatesToTheEssoFinderScreen() {
        waitForElement(MobPayStationBtn,10);
        Assert.assertTrue(isTextMatch(StationHeader.getText(),"Esso Station Finder"));
        Assert.assertTrue(StationFilter.isEnabled());
        Assert.assertTrue(StationSearch.isEnabled());
        Assert.assertTrue(FavBtn.isEnabled());
        Assert.assertTrue(MobPayStationBtn.isEnabled());
        Assert.assertTrue(AllEssoStationBtn.isEnabled());

    }



    @When("^user clicks on the search field in the Esso Station Finder Screen$")
    public void userClicksOnTheSearchFieldInTheEssoStationFinderScreen() {
        waitForElement(StationSearch,3);
        clickButtonWithOutScroll(StationSearch);
    }

    @Then("^verify whether the system displays Search button as a part of keyboard$")
    public void verifyWhetherTheSystemDisplaysSearchButtonAsAPartOfKeyboard() {
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isElementEnabled(KeyBoardSearch));
        }
        else {

        }
    }

    @Then("^verify if the Mobile pay stations is selected by default$")
    public void verifyIfTheMobilePayStationsIsSelectedByDefault() {
        waitForElement(MobPayStationBtn, 10);
        if (MobPayStationBtn.isSelected())
        {
        isElementEnabled(MobPayStationBtn);
    }}

    @When("^user clicks on Save Station button$")
    public void userClicksOnSaveStationButton() {
        waitFor(3000);
       clickButtonWithOutScroll(StationDetailsFavBtn); ;
    }

    @Then("^verify if the Station is saved$")
    public void verifyIfTheStationIsSaved() {
        Assert.assertTrue(isElementEnabled(StationDetailsSaveBtn));
        isElementEnabled(StationDetailsSaveBtn);
    }

    @When("^user taps on back button in Station Details screen$")
    public void userTapsOnBackButtonInStationDetailsScreen() {
        clickButtonWithOutScroll(NavBack);
    }

    @When("^taps on any of the services and facilities$")
    public void tapsOnAnyOfTheServicesAndFacilities() {
        ScrollTo(StationFinderConstants.MOBTXT, AccountConstants.IOSSCROLLDOWN,MobilePaymentEnabledService);
        clickButtonWithOutScroll(FoodServiceService);
        clickButtonWithOutScroll(AtmService);
    }

    @Then("^verify if a tick mark is displayed next to the selected services$")
    public void verifyIfATickMarkIsDisplayedNextToTheSelectedServices() {
        int size= checkmark.size();
        Assert.assertTrue(size>1);
    }

    @And("^verify the change in Apply Filter button$")
    public void verifyTheChangeInApplyFilterButton() {
        Assert.assertTrue(isElementEnabled(ApplyFilter));
    }

    @When("^user clicks on Apply filter buttton$")
    public void userClicksOnApplyFilterButtton() {
        clickButtonWithOutScroll(ApplyFilter);
    }

    @When("^user clicks on the Saved Station$")
    public void userClicksOnTheSavedStation() {
        if (platformName.equalsIgnoreCase("iOS")) {
            if (isElementDisplayedWithoutAssert(StationDetailsSaveBtn)) {
                clickButtonWithOutScroll(StationDetailsSaveBtn);
            }
        }
        else
        {
            clickButtonWithOutScroll(StationDetailsSaveBtn);
        }
    }

    @Then("^verify if the Station is unsaved$")
    public void verifyIfTheStationIsUnsaved() {
        Assert.assertTrue(isElementEnabled(StationDetailsFavBtn));
        isElementEnabled(StationDetailsFavBtn);
    }



}
