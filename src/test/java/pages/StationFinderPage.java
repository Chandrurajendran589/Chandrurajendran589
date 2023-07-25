package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class StationFinderPage extends GenericWrappers{
    public StationFinderPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "serv_fac_filter_tv")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Please select the services that you require')]")
    public MobileElement FilterByStartText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Payment Enabled']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Mobile Payment Enabled')]")
    public MobileElement MobilePaymentEnabledService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Payment Enabled']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeImage")
    public MobileElement MobilePaymentEnabledIcon;

    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public static MobileElement DontallowCancel;

    @iOSXCUITFindBy(xpath =" \t\n" +
            "//XCUIElementTypeButton[@name=\"Settings\"]" )
    public static MobileElement DontAllowSettings;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Open 24 Hours']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Open 24 Hours')]")
    public MobileElement OpenHoursService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Open 24 Hours']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[2]/XCUIElementTypeImage")
    public MobileElement OpenHoursIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tesco Express']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Tesco Express')]")
    public MobileElement TescoExpressService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tesco Express']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[3]/XCUIElementTypeImage)[1]")
    public MobileElement TescoExpressIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Food Service']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Food Service')]")
    public MobileElement FoodServiceService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Food Service']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[4]/XCUIElementTypeImage)[1]")
    public MobileElement FoodServiceIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Premium Coffee')]")
    public MobileElement PremiumCoffeeService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Premium Coffee']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[5]/XCUIElementTypeImage)[1]")
    public MobileElement PremiumCoffeeIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Customer Toilets')]")
    public MobileElement CustomerToiletsService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Customer Toilets']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[6]/XCUIElementTypeImage)[1]")
    public MobileElement CustomerToiletsIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ATM']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'ATM')]")
    public MobileElement AtmService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ATM']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[7]/XCUIElementTypeImage)[1]")
    public MobileElement ATMIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Motorway')]")
    public MobileElement MotorwayService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Motorway']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[8]/XCUIElementTypeImage)[1]")
    public MobileElement MotorwayIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'HGV Pumps')]")
    public MobileElement HGVPumpService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HGV Pumps']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[9]/XCUIElementTypeImage)[1]")
    public MobileElement HGVPumpsIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Synergy Supreme + Diesel')]")
    public MobileElement SynergyService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Diesel']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[10]/XCUIElementTypeImage)[1]")
    public MobileElement SynergyIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Synergy Supreme + Unleaded')]")
    public MobileElement SynergyUnleadedService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Unleaded']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[11]/XCUIElementTypeImage)[1]")
    public MobileElement SynergyUnleadedIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'LPG')]")
    public MobileElement LPGService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LPG']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[12]/XCUIElementTypeImage)[1]")
    public MobileElement LPGIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'AdBlue')]")
    public MobileElement AdBlueService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AdBlue']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[13]/XCUIElementTypeImage)[1]")
    public MobileElement AdBlueIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Car Wash')]")
    public MobileElement CarWashService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Car Wash']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[14]/XCUIElementTypeImage)[1]")
    public MobileElement CarWashIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Jet Wash')]")
    public MobileElement JetWashService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jet Wash']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[15]/XCUIElementTypeImage)[1]")
    public MobileElement JetWashIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Air Tower')]")
    public MobileElement AirTowerservice;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Air Tower']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[16]/XCUIElementTypeImage)[1]")
    public MobileElement AirTowerIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Mobil 1')]")
    public MobileElement MobService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobil 1']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[17]/XCUIElementTypeImage)[1]")
    public MobileElement MobIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Nectar Points')]")
    public MobileElement NectarPointsService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nectar Points']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[18]/XCUIElementTypeImage)[1]")
    public MobileElement NectarPointsIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clubcard Points on Fuel and Shop']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Clubcard Points on Fuel and Shop')]")
    public MobileElement ClubCardService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clubcard Points on Fuel and Shop']")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[18]/XCUIElementTypeImage)[1]")
    public MobileElement ClubCardIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage")
    public MobileElement OpenIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeImage")
    public MobileElement TescoIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]")
    @iOSXCUITFindBy(id="Nectar Points")
    public MobileElement NectarPoints;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[18]/XCUIElementTypeImage")
    public MobileElement NectarIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]")
    @iOSXCUITFindBy(id="Clubcard Points on Fuel and Shop")
    public MobileElement ClubPoints;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[19]/XCUIElementTypeImage")
    public MobileElement ClubIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Services & Facilities")
    public MobileElement ServicesAndFac;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Please turn on Location Services in your device settings")
    public MobileElement LocServiceMsg;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Search'")
    public MobileElement SearchMobKeyboard;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"ALLOW ESSO-QA TO ACCESS\"]")
    public MobileElement AllowAccessTxt;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeCell[@name=\"Location, Never\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public MobileElement LocSetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Payment Enabled']")
    @iOSXCUITFindBy(id = "Mobile Payment Enabled")
    public MobileElement MobPayment;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
//    public MobileElement PostcodeStation;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
//    public MobileElement PostCdStation1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Unleaded']")
    @iOSXCUITFindBy(id = "Synergy Supreme+ Unleaded")
    public MobileElement Synergy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobil 1']")
    @iOSXCUITFindBy(id = "Mobil 1")
    public MobileElement MobOne;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
//    public MobileElement MapView;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mrh Moleside']")
    @iOSXCUITFindBy(id = "MRH SHORTLANDS 202 BROMLEY ROAD, BECKENHAM 5101.6 mi")
    public MobileElement MilesStationOne;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mrh Eastcote']")
    @iOSXCUITFindBy(id = "MRH EDEN PARK LINKS WAY, BECKENHAM 5102.4 mi")
    public MobileElement MilesStationTwo;

    @AndroidFindBy(id = "txtStationDist")
    @iOSXCUITFindBy(id = "5101.6 mi")
    public MobileElement StationOneMiles;

    @AndroidFindBy(id = "txtStationDist")
    public MobileElement stationFirstMile;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(id = "service_facilities_layout")
    public MobileElement Servs;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public MobileElement StationMap;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public MobileElement FirstStation;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[6]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public MobileElement SepStationsMap;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Mobile Pay Stations']")
    @iOSXCUITFindBy(id = "Mobile Pay Stations")
    public MobileElement MobPayStationBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"VIEW DETAILS\"]" )
    public MobileElement ViewDetailsBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='GOT IT']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GOT IT\"]" )
    public MobileElement GotItBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='GOT IT']")
    @iOSXCUITFindBy(id = "Banner close" )
    public MobileElement GotItClose;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]" )
    public MobileElement TermsAndCondLink;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]" )
    public MobileElement DetTermsAndCond;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Banner close\"]" )
    public MobileElement CloseTermsAndCond;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Banner close\"]")
    public MobileElement BannerCloseBtn;

    @AndroidFindBy(id = "action_station")
    @iOSXCUITFindBy(id = "Station")
    public MobileElement TabStation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Esso Station Finder\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso Station Finder\"]")
    public MobileElement StationHeader;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"filter\"]")
    @AndroidFindBy(id = "header_filter")
    public MobileElement StationFilter;

    @iOSXCUITFindBy(id = "Enter Postcode or City")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter Postcode or City\"]")
    public MobileElement StationSearch;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='All Esso Stations']fdr")
    @iOSXCUITFindBy(id = "All Esso Stations")
    public MobileElement AllEssoStationBtn;

    @AndroidFindBy(id = "btnCurrentLocation")
    @iOSXCUITFindBy(id = "CurrentLocationMap")
    public MobileElement MapBtn;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"FavNotActive\"]")
    public MobileElement FavBtn;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(id = "UnFavSave")
    public MobileElement StationDetailsFavBtn;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(id = "FavActive")
    public MobileElement SaveBtn;


    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement StationDetailsSaveBtn;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public MobileElement KeyBoardSearch;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"List Stations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"List Stations\"]")
    public MobileElement listStations;

    @AndroidFindBy(id = "call_subtextView")
    @iOSXCUITFindBy(id = "Normal call rates apply.")
    public MobileElement PhoneTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Payment Enabled']")
    @iOSXCUITFindBy(id = "This station accepts mobile payments")
    public MobileElement MobPayAccept;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Opening Hours']")
    @iOSXCUITFindBy(id = "Opening Hours")
    public MobileElement OpeningHours;


    @AndroidFindBy(id = "lblFuelingHours")
    @iOSXCUITFindBy(id = "Fuelling Hours")
    public MobileElement FuelHrsTxt;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Open Now:")
    public MobileElement OpenNowTxt;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public MobileElement CancelBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Call Back\"]")
    public MobileElement CallBackBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Maps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public MobileElement RouteView;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='GET DIRECTIONS']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GET DIRECTIONS\"]")
    public MobileElement GetDirections;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeImage")
    public MobileElement PhoneIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public MobileElement StationDetailsMap;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let us locate your nearest stations\"]")
    public MobileElement LocHelpText;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\" \"]/XCUIElementTypeWindow[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell\n")
    public MobileElement PhoneCallBtn;


    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Cancel")
    public MobileElement PhoneCancelBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeImagev")
    public MobileElement OpeningHrsIcon;

    @AndroidFindBy(id = "txtNoStationsMsg")
    @iOSXCUITFindBy(id = "\t\n" +
            "Sorry, no results found in this area. Please adjust your search and try again.")
    public MobileElement SorryMsg;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
    public MobileElement CurrentLocMap;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]\n")
    public MobileElement SearchResults;


//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath = "\t\n" +
//            "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
//    public MobileElement CityMapView;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
//    public MobileElement CancelFilterBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ATM']")
    public MobileElement atm_Filter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LPG']")
    public MobileElement lpg_Filter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nectar Points']")
    public MobileElement nectar_Points;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Filter By\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Filter By\"]")
    public MobileElement filter_by_Header;

    @iOSXCUITFindBy(id = "Cancel")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cancel\"]")
    public MobileElement filter_Cancel_Btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"APPLY\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
    public MobileElement filter_Apply_Btn;

    @AndroidFindBy(id = "txtStationDist")
    public MobileElement station_Address;

    @AndroidFindBy(id = "call_subtextView")
    public MobileElement station_Phno;

    @AndroidFindBy(id = "txtOpeningHours")
    public MobileElement open_Hours_Station;

    @AndroidFindBy(id = "lblFuelingHours")
    public MobileElement fuel_Hours_Station;

    @AndroidFindBy(id = "lblShopHours")
    public MobileElement shop_Hours_Station;

    @AndroidFindBy(id = "call_layout")
    public MobileElement phno_Station;

    @AndroidFindBy(id = "button2")
    public MobileElement phno_Call_Station;

    @AndroidFindBy(id = "button1")
    public MobileElement phno_Cancel_Station;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public MobileElement CityMapView;

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
//    public MobileElement FirstStation;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MRH SHORTLANDS 202 BROMLEY ROAD, BECKENHAM 5109.4 mi \"]")
    @AndroidFindBy(id = "txtMileAndLoc")
    public MobileElement address_Station_List;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
    public List<MobileElement> FilterServicesList;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'checkmark')]")
    public List<MobileElement> checkmark;

    @AndroidFindBy(id = "Locator need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Directions\"])[1]")
    public MobileElement DirectionsLink;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY 2 FILTERS']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"APPLY 2 FILTERS\"]")
    public MobileElement ApplyFilter;

    @AndroidFindBy(id = "txtMileAndLoc")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage\n")
    public MobileElement StationImg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]\n")
    public MobileElement map_Station;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "Services & Facilities")
    public MobileElement CancelFilterBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "This station accepts mobile payments")
    public MobileElement StationFinderDetScreenTxt;

    @AndroidFindBy(id = "Locattor Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MRH SHORTLANDS\"])[1]")
    public MobileElement StationDetailsHeader;


    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
    @iOSXCUITFindBy(id = "NavBack")
    public MobileElement NavBack;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
    public MobileElement PostCdStation1;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public MobileElement PostcodeStation;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
    public MobileElement MapView;

    @AndroidFindBy(id = "btnGetDirection")
    public MobileElement get_Direction_Station;

    @AndroidFindBy(id = "message")
    public MobileElement location_Off_Msg;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement location_Off_Deny;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement location_Off_Ok;

    @AndroidFindBy(id = "//android.widget.Button[@content-desc=\"Directions to 674 High Rd, 674 High Rd\"]")
    public MobileElement direction_Get_Direction;

    @AndroidFindBy(id = "complete_profile_txt")
    public MobileElement complete_Profile;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[6]")
    public MobileElement map_Cluster;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement no_Thanks_Button;
}

