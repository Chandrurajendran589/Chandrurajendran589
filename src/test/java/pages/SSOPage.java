package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class SSOPage extends GenericWrappers {
	COFChallangeFlowPage COFChallangeFlowPage=new COFChallangeFlowPage();

	public SSOPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "twitter_login_icon")
	@iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"twitterNew\"]")
	public MobileElement TwitterIcon;

	@AndroidFindBy(id = "facebook_login_icon")
	@iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"fbNew\"]")
	public MobileElement FacebookIcon;

	@AndroidFindBy(id = "apple_sign_in_icon")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement AppleIcon;

	@AndroidFindBy(id = "account_secure_pin_edit")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement AccountEdit;

	@AndroidFindBy(id = "pin_entry_forgot_pin_txt")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ForgotYourPin;

	@AndroidFindBy(id = "send_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement SendButton;

	@AndroidFindBy(xpath ="//android.widget.RelativeLayout[@text='Forgot PIN']")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ForgotPin;

	@AndroidFindBy(id = "mobile_header_desc_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ForgotPinDescription;

	@AndroidFindBy(id = "eamil_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement EmailText;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ResetPinPopup_Msg;

	@AndroidFindBy(id = "button1")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ResetPin_Popup_Msg_Ok_Btn;

	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement SSOUsername;

	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or Phone\"]")
	public MobileElement SSOUsername1;

	@AndroidFindBy(id = "linkedin_login_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"linkednNew\"]")
	public MobileElement LinkedinIcon;

	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	public MobileElement SSOUsername2;

	@AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField")
	public MobileElement SSOpassWord1;

	@AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
	public MobileElement SSOpassWord2;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "Locator Need")
	public List<MobileElement> SSo;

	@AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
	public MobileElement SSOpassWord;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign In']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
	public MobileElement SSOTwittersignin;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"facebook\"]")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Facebook;

	@AndroidFindBy(id = "m_login_email")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement FBEmail;

	@AndroidFindBy(id = "m_login_password")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement FBpassword;

	@AndroidFindBy(xpath = "//hierarchy//android.widget.Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
	public MobileElement FBLogin;

	@AndroidFindBy(xpath = "//hierarchy//android.widget.Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
	public MobileElement TwitterLogin;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign up for Twitter\"]/android.widget.TextView[1]")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Twitter;

	//@AndroidFindBy(id = "username_or_email")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\\”username_or_email\\”]")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement TwitterEmail;

	//android.widget.EditText[@resource-id=\”username_or_email\”]

	@AndroidFindBy(id = "password")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Twitterpassword;


	@AndroidFindBy(id="dashboard_start_option_inner_img")
	@iOSXCUITFindBy(id = "LocatorNeeded")
	public MobileElement StartFuelIconLID;

	@AndroidFindBy(id="terms_conditions_checkBox")
	@iOSXCUITFindBy(id = "LocatorNeeded")
	public MobileElement TermsAndConditionChkbox;

	@AndroidFindBy(id="btn_accept")
	@iOSXCUITFindBy(id = "LocatorNeeded")
	public MobileElement AcceptBtn;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Privacy Policy\"))")
	public MobileElement PrivacyandPolicy;
















}
