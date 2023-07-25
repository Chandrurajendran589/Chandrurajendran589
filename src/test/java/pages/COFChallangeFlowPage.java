package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import stepLibrary.GenericWrappers;

public class COFChallangeFlowPage extends GenericWrappers {

	public COFChallangeFlowPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirmation")
	@iOSXCUITFindBy(id = "NeedLocator")
	public MobileElement LoginSavePwd;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_reject")
	@iOSXCUITFindBy(id = "NeedLocator")
	public MobileElement LoginSaveNever;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(id = "NeedLocator")
	public MobileElement LoginSave;

	@AndroidFindBy(id = "security_pin_entry_code1")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
	public MobileElement PinCode_1;

	@AndroidFindBy(id = "security_pin_entry_code2")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	public MobileElement PinCode_2;

	@AndroidFindBy(id = "security_pin_entry_code3")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[3]")
	public MobileElement PinCode_3;

	@AndroidFindBy(id = "security_pin_entry_code4")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[4]")
	public MobileElement PinCode_4;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	public MobileElement AddPaymentMethod;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	public MobileElement AddNectarLink;

	@AndroidFindBy(id = "security_pin_entry_continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement Continue_BTN;

	@AndroidFindBy(id = "locaator need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GET STARTED\"]")
	public MobileElement GetStartedBtn;

	@AndroidFindBy(id = "pump_select_confirm_btn")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"CONFIRM\"]")
	public MobileElement Confirm_BTN;

	@AndroidFindBy(id = "security_pin_entry_title")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Enter your Esso PIN to unlock the app for fuelling.\"]")
	public MobileElement PinTxt;

	@AndroidFindBy(id = "LocatorNeed")
	@iOSXCUITFindBy(xpath = "Nectar card added successfully")
	public MobileElement NectCardSuccess;

	@AndroidFindBy(id = "LocatorNeed")
	@iOSXCUITFindBy(id = "Payment Method added successfully")
	public MobileElement PaymentMethodSuccess;

	@AndroidFindBy(id = "LocatorNeed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	public MobileElement SetMaxFuelAmount;

	@AndroidFindBy(id = "LocatorNeed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SET MAXIMUM AMOUNT\"]")
	public MobileElement SetMaxAmount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ready to start fuelling?\"]")
	public MobileElement ReadyStartFuel;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start fuelling now\"]")
	public MobileElement StartFuelingNow;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement ReadyContinueBtn;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField\n")
	public MobileElement PassPhrase;

	@AndroidFindBy(id = "submitButton")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
	public MobileElement PassPhraseSubmit;
	
	@AndroidFindBy(id = "account_add_card")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Card\"]")
	public MobileElement AddCard;

	@AndroidFindBy(id = "payment_name_et")
	@iOSXCUITFindBy(id = "Name on card")
	public MobileElement CardName;

	@AndroidFindBy(id = "payment_cardno_et")
	@iOSXCUITFindBy(id = "Card Number")
	public MobileElement CardNo;

	@AndroidFindBy(id = "challengeInformationHeaderTextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify by Password\"]")
	public MobileElement VerifyPwd;

	@AndroidFindBy(id = "challengeInformationLabelTextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password\"]")
	public MobileElement EnterPwd;

	@AndroidFindBy(id = "payment_expdate_et")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Exp. MM/YY'")
	public MobileElement ExpDate;

	@AndroidFindBy(id = "payment_security_code_et")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Security code'")
	public MobileElement CVV;

	@AndroidFindBy(id = "payment_billing_details_title")
	public MobileElement billingDetails_TXT;

	@AndroidFindBy(id = "payment_bill_address_street")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Address 1'")
	public MobileElement Addrs1;

	@AndroidFindBy(id = "payment_bill_address_locality")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Address 2'")
	public MobileElement Addrs2;

	@AndroidFindBy(id = "payment_bill_address_city")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'City'")
	public MobileElement City;

	@AndroidFindBy(id = "payment_bill_address_state")
	@iOSXCUITFindBy(id = "State")
	public MobileElement State;

	@AndroidFindBy(id = "payment_bill_address_postcode")
	@iOSXCUITFindBy(id = "Postcode")
	public MobileElement Postal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public MobileElement AccountMore;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement AccountBtn;

	@AndroidFindBy(id = "payment_bill_address_country")
	@iOSXCUITFindBy(id = "United Kingdom")
	public MobileElement Country;

	@AndroidFindBy(id = "card_consent_checkBox")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
	public MobileElement ConsentBox;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "I consent to use the card for purchases in the Esso App")
	public MobileElement ConsentBoxCopyText;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "Use Touch ID to quickly authorise payments")
	public MobileElement TouchIDCopyText;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"circleCheck\"]")
	public MobileElement TouchIdCheckBox;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
	public MobileElement TouchIdCheckBoxTick;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//XCUIElementTypeStaticText~xpath")
	public MobileElement AccountMessage;


	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
	public MobileElement PaymtDone;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[5]")
	public MobileElement EditCard;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' AND name == 'United Kingdom'")
	public MobileElement CountryField;

	@AndroidFindBy(id = "linkedin_login_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"linkednNew\"]")
	public MobileElement LinkedinIcon;

	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or Phone\"]")
	public WebElement SSOusername;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "jjks")
	public List<MobileElement> SSo;

	@AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
	public WebElement SSOpassWord;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
	public WebElement SSOsignin;
	
	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Fraud Prevention'")
	public MobileElement PromptTtl;
	
	@AndroidFindBy(id = "challengeInformationTextView")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Invalid password'")
	public MobileElement PassError;

	@AndroidFindBy(id= "locator need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"alert\"]")
	public MobileElement FailAlertImg;
	
	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Default payment'")
	public MobileElement PaymentSuccessTtl;

	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Card details'")
	public MobileElement EditCardSuccess;
	
	@AndroidFindBy(id = "dashboard_help_msg_social")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
	public MobileElement PaymentSuccessDes;

	@AndroidFindBy(id = "dashboard_help_msg_social")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Card added'")
	public MobileElement CardAddSuccess;
	
	@AndroidFindBy(id = "account_card_number")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
	public MobileElement AddedCard;
	
	@AndroidFindBy(id = "facebook_login_icon")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"fbNew\"]")
	public MobileElement FacebookTab;
	
	@AndroidFindBy(xpath="//*[contains(@class, 'android.view.View')][contains(@id,'email_input_container')")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	public MobileElement MobileNumber;
	
	
	@AndroidFindBy(id = "m_login_password")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
	public MobileElement Pwd;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'u_0_4')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
	public MobileElement ContinueBtn;
	
	@AndroidFindBy(id = "button_cancel")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
	public MobileElement OTPcancel;
	
	@AndroidFindBy(id="search_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement AddressSearchopn;
    
    @AndroidFindBy(xpath="//*[@text='Flat 2, Henry House, Ringers Road']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement ChooseAddress;
    
    @AndroidFindBy(id="android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Sorry! Your Facebook'")
    public MobileElement FBMSG;
	
    @AndroidFindBy(id="android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement OkBtn;

	@AndroidFindBy(id="android:id/button1")
	@iOSXCUITFindBy@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
	public MobileElement OkButton;

	@AndroidFindBy(id="android:id/button1")
	@iOSXCUITFindBy@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Cancel'")
	public MobileElement TransCancel;

    @AndroidFindBy(id="header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement SelectAddress;
	
    @AndroidFindBy(id="twitter_login_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement TwitterTap;
    
    @AndroidFindBy(id="username_or_email")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement Twitterid;
	
    @AndroidFindBy(id="password")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement TwitterPwd;
    
    @AndroidFindBy(id="allow")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement TwitterSign;
	
}
