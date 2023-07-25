package pages;

import contants.AccountConstants;
import cucumber.api.DataTable;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import stepLibrary.GenericWrappers;

import java.util.List;

public class FuelFinderPage extends GenericWrappers {
	public FuelFinderPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(id = "Services & Facilities")
	@AndroidFindBy(id = "services_filter_image")
	public List<MobileElement> Filtericon;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFHeader;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(id = "Station")
	public MobileElement FFbutton;
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFheadertext;
	@AndroidFindBy(id = "location_setting_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFCopytext;
	@AndroidFindBy(id = "linkEnableGps")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFTurnonLoc;
	@AndroidFindBy(id = "android:id/action_bar_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFdevsetting;
	@AndroidFindBy(id = "login_email_editText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Email']")
	public MobileElement FFEmail;
	@AndroidFindBy(id = "login_passWord_editText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Password']")
	public MobileElement FFPassword;
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='OFF']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFdevsettingON;
	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFdirectiontext;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFLoactionmsg;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFAllow;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFdeny;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"GO\"]\n")
	public MobileElement MapsLandScreen;
	@AndroidFindBy(id = "txtDirection")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeButton")
	public MobileElement GetDirection;
	@AndroidFindBy(id = "action_station")
	@iOSXCUITFindBy(id = "Station")
	public MobileElement FFScreen;
	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(id = "CONTINUE")
	public MobileElement Continue;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow'")
	public MobileElement Allowaccess;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow'")
	public MobileElement DontAllow;
	@AndroidFindBy(id = "header_filter")
	@iOSXCUITFindBy(id = "filter")
	public MobileElement Filter;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='More']")
	public MobileElement AccountMore;
	@AndroidFindBy(id = "login_Btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='LOG IN']")
	public MobileElement AccountLoginBtn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Account']")
	public MobileElement AccountScreenChk;
	@AndroidFindBy(id = "btnViewStations")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='List Stations']")
	public MobileElement listStations;
	@AndroidFindBy(id = "btnMobilePay")
	@iOSXCUITFindBy(id = "Mobile Pay Stations")
	public MobileElement MobilePayStatons_BTN;
	@AndroidFindBy(id = "btnAllStations")
	@iOSXCUITFindBy(id = "All Esso Stations")
	public MobileElement AllStations_BTN;
	@AndroidFindBy(id = "edtSearch")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Search;
	@AndroidFindBy(id = "edtSearch")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Station;
	@AndroidFindBy(id = "edtSearch")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Back;
	@AndroidFindBy(id = "txtMobilePayEnabledInfo")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_MobilePay;
	@AndroidFindBy(id = "txtStationAddress")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement StationAddress;
	@AndroidFindBy(id = "phoneNumberTextView")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_PhoneNum;
	@AndroidFindBy(id = "txtOpeningHours")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_OpeningHours;
	@AndroidFindBy(id = "lblFuelingHours")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_FuellingHours;
	@AndroidFindBy(id = "lblShopHours")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_ShopHours;
	@AndroidFindBy(id = "txtTime")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Hours;
	@AndroidFindBy(id = "txtServices")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Services;
	@AndroidFindBy(id = "favorate_img")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Staricon;
	@AndroidFindBy(id = "favorate_img")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Starsavetext;
	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_NLID;
	@AndroidFindBy(id = "favorate_img_desc")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_unsave;
	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_saved;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Enter Postcode or City")
	public MobileElement FuelFinder_Internet;
	@iOSXCUITFindBy(id = "Search")
	public MobileElement FuelFinder_SearchKey;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	public MobileElement FuelFinder_SearchResult;
	@AndroidFindBy(id = "rvStationInfo")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List<MobileElement> listOfStations;
	@AndroidFindBy(id = "header_filter")
	@iOSXCUITFindBy(id = "filter")
	public MobileElement FuelFinder_filter;
	@AndroidFindBy(id = "childItemLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List<MobileElement> fuelFinder_List;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Google Map']")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement mapView;
	@AndroidFindBy(id = "serv_fac_filter_tv")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement selecttheservices;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Payment Enabled']")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement mobilepaymentenable;
	@AndroidFindBy(id = "services_filter_selected")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement filterselected;
	@AndroidFindBy(id = "serv_fac_apply_filter_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'APPLY'")
	public MobileElement fuelFinder_ApplyButton;
	@AndroidFindBy(xpath = "filter_count")
	@iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeButton' AND name BEGINSWITH 'APPLY'")
	public MobileElement fuelFinder_filter_count;
	@AndroidFindBy(id = "services_filter_selected")
	@iOSXCUITFindBy(id = "More Info")
	public List<MobileElement> fuelFinder_filterSelected;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Don’t Allow']")
	public MobileElement permission_deny_button;
	@AndroidFindBy(xpath = "//android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public List<MobileElement> fuelFinder_ListView;
	@AndroidFindBy(id = "txtNoStationsMsg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Turn on Location to find Esso Stations\"]\n")
	public MobileElement UnabletoLocate;
	@AndroidFindBy(xpath = "//android.widget.TextView[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Turn on Location to find Esso Stations\"]\n")
	public MobileElement Distance;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Google Map']/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement Fuel_pump_Icon;
	@AndroidFindBy(id = "txtStationName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public MobileElement FF_Mart_Screen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton")
	public List<MobileElement> FF_Mart_Screen_Dir;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Google Map']/android.view.View")
	public MobileElement fuel_Station_Icon;
	@AndroidFindBy(id = "btnGetDirection")
	public MobileElement btnGetDirection;
	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(id = "Cancel")
	public MobileElement FF_Cancel_Call;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Cancel'])[1]")
	public MobileElement Cancel_Location;
	@AndroidFindBy(id = "call_layout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[3]")
	public MobileElement FF_call_layout;
	@AndroidFindBy(xpath = "//*[@text='CALL']")
	@iOSXCUITFindBy(xpath = "XCUIElementTypeCell")
	public MobileElement FF_Call;
	@AndroidFindBy(id = "loyality_text")
	public MobileElement firstFuel_About;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='My Location']")
	@iOSXCUITFindBy(id = "CurrentLocationMap")
	public List<MobileElement> currentLocation;
	@AndroidFindBy(id = "ivRightArrow")
	@iOSXCUITFindBy(id = "fuelDirections")
	public MobileElement Getdirection;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Maps\"]")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement Maps;
	@AndroidFindBy(id = "txtNoStationsMsg")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement Result;
	@AndroidFindBy(id = "ivWifi")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement Stationicon;
	@AndroidFindBy(xpath = "txtStationName")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement Stationname;
	@AndroidFindBy(xpath = "txtMileAndLoc")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement StationDistance;
	@AndroidFindBy(id = "txtDirection")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement StationDirections;
	@AndroidFindBy(id = "txtDirection")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement Mapzoom;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"182651663017.\"]")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement Differentpinmap;
	@AndroidFindBy(id = "btnCurrentLocation")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement CurrentLocation;
	@AndroidFindBy(id = "com.google.android.gms:id/message")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement GeoLocationmsg;
	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement CancelLocation;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement OKLocation;
	@AndroidFindBy(id = "close_img")
	@iOSXCUITFindBy(id = "Maps")
	public MobileElement ClearText;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Fake GPS - Search location\"]")
	@iOSXCUITFindBy(id = "HelpPhoneCallIcon")
	public MobileElement Gpslocation;
	@AndroidFindBy(id = "btnAllStations")
	@iOSXCUITFindBy(id = "All Esso Stations")
	public MobileElement Allstations;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]")
	@iOSXCUITFindBy(id = "Google Maps")
	public MobileElement GoogleMap;
	@iOSXCUITFindBy(id = "Services & Facilities")
	public MobileElement Servs;
	@AndroidFindBy(id = "mainmap_container")
	@iOSXCUITFindBy(id = "//XCUIElementTypeApplication[@name=\"Maps\"]")
	public MobileElement mainMap;
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]")
	public MobileElement listcityclick;
	@iOSXCUITFindBy(id = "Services & Facilities")
	@AndroidFindBy(id = "txtServiceName")
	public List<MobileElement> ServicesAndFacilities;
	@iOSXCUITFindBy(id = "NavBack")
	public MobileElement BackBTN;

}
