package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import stepLibrary.GenericWrappers;

public class ContextualRegistrationPage extends GenericWrappers {
	public ContextualRegistrationPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please wait...']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Indeterminate progress\"]")
	public static MobileElement Loader;
	
	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'REGISTER AN ACCOUNT'")
	public MobileElement DashRegstr;
	
	@AndroidFindBy(id = "fl_progress_lyt")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement PrfcmpltLID;
	
	@AndroidFindBy(id = "dashboard_nectar_balance")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement LIDNectar;
	
	@AndroidFindBy(id = "header_desc_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value BEGINSWITH 'To keep your payment'")
	public MobileElement RegstrTtl;
	
	@AndroidFindBy(id = "firstName_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public static MobileElement RegstrFirstName;
	
	@AndroidFindBy(id = "lastName_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public static MobileElement RegstrLastName;
	
	@AndroidFindBy(id = "email_EditText")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' and value == 'Email'")
	public static MobileElement RegstrEmail;
	
	@AndroidFindBy(id = "password_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static MobileElement RegstrPass;
	
	@AndroidFindBy(id = "confirm_password_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static MobileElement RegstrConfPass;
	
	@AndroidFindBy(id = "mobile_EditText")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' and value BEGINSWITH 'Mobile number'")
	public static MobileElement RegstrMobile;
	
	@AndroidFindBy(id = "terms_conditions_checkBox")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"][2])")
	public MobileElement RegstrTermsCkbx;
	
	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'CONTINUE'")
	public static MobileElement RegstrContinue;
	
	@AndroidFindBy(id = "confirm_email_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Confirm your email address'")
	public MobileElement CntxtRegTtl;
	
	@AndroidFindBy(id = "confirm_email_subtitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'We have sent you'")
	public MobileElement CntxtRegSubTtl;
	
	@AndroidFindBy(id = "confirm_email_image_icon")
	@iOSXCUITFindBy(id = "confirm_email")
	public MobileElement CntxtRegIcon;
	
	@AndroidFindBy(id = "confirm_email_subtitle2")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Resend confirmation email'")
	public MobileElement CntxtRegResendEmailLink;
	
	@AndroidFindBy(id = "confirm_email_btn_inbox")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'OPEN INBOX'")
	public MobileElement CntxtRegOpenInbox;
	
	@AndroidFindBy(id = "android:id/title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
	public MobileElement CntxtRegAPP;
	
	@AndroidFindBy(id = "accept_btn")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement ReviewAccept;

	@AndroidFindBy(id = "button_accept_all")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ACCEPT ALL\"]")
	public MobileElement acceptAllButtonAppLaunch;
	
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'We've sent you an'")
	public MobileElement PopUpMessage;
	/*
	 * Same for Continue in verify nectar
	 */
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement PopUpOK;
	
	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Are you sure you'")
	public MobileElement MessageTTL;
	
	/*
	 * Same for Verify later in verify nectar
	 */
	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Skip Anyway'")
	public MobileElement SkipAnyway;
	
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Verify Email'")
	public MobileElement VerifyEmail;
	
	@AndroidFindBy(id = "circular_progress_lid")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'start'")
	public static MobileElement LID;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'You can verify your'")
	public MobileElement PopUpMessageContextual;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Touch ID'")
	public MobileElement TouchIdContent;

	@AndroidFindBy(id = "terms_conditions_checkBox")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
	public MobileElement PpTcCheckboxWithBiometricsRegistration;

	@AndroidFindBy(id = "terms_conditions_checkBox")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
	public MobileElement PpTcCheckboxWithoutBiometricsRegistration;
}
