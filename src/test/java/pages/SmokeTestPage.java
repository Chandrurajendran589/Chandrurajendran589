package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

public class SmokeTestPage extends GenericWrappers {

	public SmokeTestPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "dashboard_login")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='LOGIN']")
	public MobileElement LoginBtn;
	
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FirstFuelheader;
	
	@AndroidFindBy(id = "product_image")
	@iOSXCUITFindBy(id = "headerTutorialLogo")
	public MobileElement FirstFuelLogo;
	
	@AndroidFindBy(id = "products_title")
	@iOSXCUITFindBy(id = "PRODUCTS")
	public MobileElement Products;
	
	@AndroidFindBy(id = "edtSearch")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField")
	public MobileElement SearchCity;

	@iOSXCUITFindBy(id = "Search")
	public MobileElement SearchBtn;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout/android.widget.RelativeLayout[2]")
	@iOSXCUITFindBy(id = "Search")
	public MobileElement FuelFinder_SearchKey;
	
	@AndroidFindBy(xpath = "//android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List <MobileElement> MapMarkerPin;

	@iOSXCUITFindBy(id = "(//XCUIElementTypeCell)[1]/XCUIElementTypeStaticText")
	public  MobileElement EssoStations;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CurrentLocationMap']")
	public  MobileElement CurrLocation;
	
	@AndroidFindBy(id = "rvStationInfo")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	public List <MobileElement> RV;
	
	@AndroidFindBy(id = "txtMobilePayEnabledInfo")
	@iOSXCUITFindBy(id = "LEARN MORE")
	public MobileElement MobilePayStn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Loyalty Points']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Loyalty Points']")
	public MobileElement LP;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Will I still earn Nectar points if I use the app?'])[1]")
	public MobileElement LPN;
	
	@AndroidFindBy(id = "list_item_text_child")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name='terms and conditions']")
	public MobileElement FAQLink;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Frequently Asked Questions']")
	@iOSXCUITFindBy(id = "Frequently Asked Questions")
	public MobileElement FAQButton;
	
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public MobileElement HeaderText;
	
	@AndroidFindBy(id = "txtStationName")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[1]/XCUIElementTypeStaticText")
	public MobileElement StationName;
	
	@AndroidFindBy(id = "loyality_desc")
	@iOSXCUITFindBy(id = "For journeys that matter. Wherever you’re going, there’s a First Fuel to help you get there.")
	public MobileElement Productsdescr;
	
}
