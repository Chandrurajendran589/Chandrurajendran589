package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.reporters.jq.BannerPanel;
import stepLibrary.GenericWrappers;

import java.lang.management.MonitorInfo;
import java.time.Duration;

public class AppInstallAndLaunchPage extends GenericWrappers {
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
	public MobileElement userName;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
	public MobileElement password;

	@AndroidFindBy(id = "LocatorNeeded")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Cookie Settings\"]")
	public MobileElement cookiePageHeaderAppLaunch;

	@AndroidFindBy(id = "button_accept_all")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ACCEPT ALL\"]")
	public MobileElement acceptAllButtonAppLaunch;

	@AndroidFindBy(id = "text_manage_options")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"MANAGE OPTIONS\"]")
	public MobileElement manageOptionButtonAppLaunch;

	@AndroidFindBy(id = "text_user_consent")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextView['index=0'])[2]")
	public MobileElement CookieSubText1AppLaunch;

	@AndroidFindBy(id = "text_user_consent")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextView['index=0'])[3]")
	public MobileElement CookieSubText2AppLaunch;

	@AndroidFindBy(id = "tutorial_page_one_bg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='car']")
	public MobileElement WelcomImg;

	@AndroidFindBy(id = "tutorial_page_title")
	@iOSXCUITFindBy(id = "Welcome to Esso!")
	public MobileElement WelcomTtl;

	@AndroidFindBy(id = "tutorial_page_sub_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Use the Esso App to pay from your car and earn fuel rewards.\"]")
	public MobileElement WelcomSUBTtl_one;
	@AndroidFindBy(id = "tutorial_page_title")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[3])[1]")
	public MobileElement WelcomImg2;
	@AndroidFindBy(id = "tutorial_page_title")
	@iOSXCUITFindBy(id = "Fuelling is as easy as 1-2-3")
	public MobileElement WelcomTtl_two;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'1. Select your pump.')]")
	public MobileElement WelcomSUBTtl_two;
	@AndroidFindBy(id = "tutorial_page_three_pump_iv")
	@iOSXCUITFindBy(id = "tutorial4_handAnim")
	public MobileElement WelcomImg3;

	@iOSXCUITFindBy(id = "Pay securely from your car")
	public MobileElement WelcomTtl_2;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	public MobileElement WelcomImg_2;

	@iOSXCUITFindBy(id = "Set up your payment method to pay for fuel from your mobile phone.")
	public MobileElement WelcomSUBTtl_2;

	@iOSXCUITFindBy(id = "Collect Nectar points on every fill")
	public MobileElement WelcomTtl_3;

	@AndroidFindBy(id = "tutorial_page_title")
	@iOSXCUITFindBy(id = "Collect Nectar points on every fill")
	public MobileElement WelcomTtl_three;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get exclusive Esso rewards when you verify your Nectar card.\"]")
	public MobileElement WelcomSUBTtl_three;
	@AndroidFindBy(id = "tutorial_page_four_bg")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[3]")
	public MobileElement WelcomImg4;
	@iOSXCUITFindBy(id = "Collect Nectar points on every fill")
	public MobileElement WelcomTtl_four;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Points collected will be shown')]")
	public MobileElement WelcomSUBTtl_four;

	@iOSXCUITFindBy(id = "Get exclusive Esso rewards when you verify your Nectar card.")
	public MobileElement WelcomSUBTtl_fournew;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Fuel']")
	@iOSXCUITFindBy(id = "Fuel")
	public MobileElement FuelTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(id = "Station")
	public MobileElement StationTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public MobileElement More;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso Station Finder\"]")
	public MobileElement StationHeaderTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Offers']")
	@iOSXCUITFindBy(id = "Offers")
	public MobileElement OffersTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public MobileElement HistoryTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public MobileElement MoreTab;

	@AndroidFindBy(id = "next_btn")
	@iOSXCUITFindBy(id = "NEXT")
	public MobileElement NextBtn;

	@AndroidFindBy(id = "done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GET STARTED\"]")
	public MobileElement GetStarted_BTN;

	@AndroidFindBy(id = "done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement AllowNBtn;

	@AndroidFindBy(id = "done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
	public MobileElement AllowNBtn1;

	@AndroidFindBy(id = "done_btn")
	@iOSXCUITFindBy(id = "We're still rolling out the Esso App across our network. Use \"Station\" below to locate your nearest station with mobile pay.")
	public MobileElement Rolloutct;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement RolloutctOk;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public MobileElement skip_BTN;
	@AndroidFindBy(id = "tutorial_page_sub_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Use the Esso App to pay from')]")
	public MobileElement Subtitle;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement AccountOkBtn;
	@iOSXCUITFindBy(id = "CONTINUE")
	public MobileElement ContinueBtn;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
	public MobileElement AllowPopup;
	@AndroidFindBy(id = "dashboard_circle_progress")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement start;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "/XCUIElementTypeOther[@name=\"Allow Notifications\"]")
	public MobileElement Allow_Notifications_header;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"pushBackground\"]")
	public MobileElement notification_image;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Easy access to your receipts\"]")
	public MobileElement notification_middle_message;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The Esso App can notify you when your receipt is ready for viewing.\"]")
	public MobileElement notification_bottom_message;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Nectar Card\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Add Nectar Card\"]")
	public MobileElement add_Nectar_card;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get exclusive offers\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get exclusive offers\"]")
	public MobileElement get_offers;

	@AndroidFindBy(id = "txtregi_redeem")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add your Nectar card to\"]")
	public MobileElement add_nectar_card_to;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Collect points\"]")
	public MobileElement collection_points_header;

	@AndroidFindBy(id = "list_item_text_child")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect Nectar points for your fuel or shop purchase at participating Esso stations. \"]")
	public MobileElement collection_points_message;

	@AndroidFindBy(id = "list_item_earning_points")
	@iOSXCUITFindBy(id = "More about collecting points")
	public MobileElement more_about_collecting_point_link;

	@AndroidFindBy(id = "pay_point_imgd")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	public MobileElement rewards_image;

	@AndroidFindBy(id = "pay_with_points")
	@iOSXCUITFindBy(id = "Rewards")
	public MobileElement rewards_header;

	@AndroidFindBy(id = "sub_txt")
	@iOSXCUITFindBy(id = "Enjoy the benefits of Esso Nectar offers exclusive for you when you purchase at Esso.")
	public MobileElement rewards_text;

	@AndroidFindBy(xpath = "earn_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"COLLECT MORE NECTAR POINTS\"]/XCUIElementTypeOther")
	public MobileElement collect_more_nectar_points;

	@AndroidFindBy(id = "login_dc_btn")
	@iOSXCUITFindBy(id = "Collect and spend Nectar points with hundreds of brands.")
	public MobileElement add_nectar_card;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
	public MobileElement Add_Nectar_card_image;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect Nectar points for your fuel or shop purchase at participating Esso stations. \"]")
	public MobileElement how_to_collect_points_popup;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
	public MobileElement collection_points;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"COLLECT MORE NECTAR POINTS\"]/XCUIElementTypeOther")
	public MobileElement collection_points1;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(id="rewardViewClose")
	public MobileElement geRewards_How_to_collect_points_popup_Close;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	public MobileElement get_nectar_points_home;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@index=\"0\"])[1]")
	public MobileElement CtTextLIDScreen;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public MobileElement OkButtonCTText;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NEXT\"]")
	public MobileElement NextButtonScreen;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@index=\"1\"])[1]")
	public MobileElement NectarPointBalanceLID;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close Icon\"]")
	public MobileElement CloseNectarPopup;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@index=\"1\"])[2]")
	public MobileElement OfferAppliedTickMark;

	@AndroidFindBy(id = "Need to add")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell[2]/XCUIElementTypeOther[@index=\"0\"])")
	public MobileElement OffersBannerPanen;
   
	@AndroidFindBy(id = "tutorial_car_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"car\"]")
	public MobileElement CarImageWelScreen;

	@AndroidFindBy(id = "tutorial_car_iv")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=2'])[5]")
	public MobileElement EssoLogo;
    
	@AndroidFindBy(id = "dashboard_app_logo")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[1]")
	public MobileElement EssoLogoNLID;
    
	@AndroidFindBy(id = "dashboard_start_option_inner_img")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeButton['index=0'])[1]")
	public MobileElement FuelAsGeustNLID;

	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"REGISTER AN ACCOUNT\"]")
	public MobileElement RegisterUserButton;

	@AndroidFindBy(id = "dashboard_already_registered_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Already have an account?\"]")
	public MobileElement loginTextNLID;

	@AndroidFindBy(id = "dashboard_already_registered")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Login!\"]")
	public MobileElement loginLink;

	@AndroidFindBy(id = "or_login_with_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Or log in with\"]")
	public MobileElement loginWithText;

	@AndroidFindBy(id = "apple_sign_in_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"appleNew\"]")
	public MobileElement AppleIconNLID;

	@AndroidFindBy(id = "facebook_login_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"fbNew\"]")
	public MobileElement FBIconNLID;

	@AndroidFindBy(id = "twitter_login_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"twitterNew\"]")
	public MobileElement twitterIconLID;

	@AndroidFindBy(id = "linkedin_login_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"linkednNew\"]")
	public MobileElement linkedINIconNLID;

	@AndroidFindBy(id = "tutorial_car_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
	public MobileElement AllowInPopupScreen;
    
	@AndroidFindBy(id = "tutorial_car_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pay securely from your car\"]")
	public MobileElement Screen2Tittle;
	
	@AndroidFindBy(id = "tutorial_car_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set up your payment method to pay for fuel from your mobile phone.\"]")
	public MobileElement Screen2SubTittle;

	public AppInstallAndLaunchPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



}
