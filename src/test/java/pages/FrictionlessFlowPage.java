package pages;

import com.google.common.collect.ImmutableMap;
import contants.ProfileCompletionConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.Calendar;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FrictionlessFlowPage extends GenericWrappers {
    GuestCheckOutPage guestCheckOutPage = new GuestCheckOutPage();
    ProfileCompletionConstants profileCompletionConstants= new ProfileCompletionConstants();
    PaymentMethodPage paymentMethodPage=new PaymentMethodPage();


    @AndroidFindBy(id = "dashboard_register_btn")
    public MobileElement RegisterLink;

    @AndroidFindBy(id = "facebook_login_icon")
    @iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"fbNew\"]")
    public MobileElement FacebookIcon;

    @AndroidFindBy(xpath = "//hierarchy//android.widget.Button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
    public MobileElement FBLogin;

    @AndroidFindBy(id = "twitter_login_icon")
    @iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"twitterNew\"]")
    public MobileElement TwitterIcon;


    @AndroidFindBy(xpath = "//hierarchy//android.widget.Button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
    public MobileElement TwitterLogin;

    @AndroidFindBy(id="firstName_EditText")
    public MobileElement FirstName;

    @AndroidFindBy(id="lastName_EditText")
    public MobileElement SecondName;
    @AndroidFindBy(id="email_EditText")
    public MobileElement EmailIdUser;

    @AndroidFindBy(id="password_EditText")
    public MobileElement ExistPassword;

    @AndroidFindBy(id= "confirm_password_EditText")
    public MobileElement ConfirmPassword;

    @AndroidFindBy(id= "mobile_EditText")
    public MobileElement MobileNumber;

    @AndroidFindBy(id= "terms_conditions_checkBox")
    public MobileElement AcceptLink;

    @AndroidFindBy(id= "newsletter_checkBox")
    public MobileElement EmailLinkVerification;

    @AndroidFindBy(id="confirm_email_title")
    public MobileElement confirmYourEmailAddress;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public MobileElement AppSkip;

    @AndroidFindBy(id="android:id/button1")
    @iOSXCUITFindBy(id="OK")
    public MobileElement Ok;

    @AndroidFindBy(id="dashboard_register_btn")
    public MobileElement RegisterTabBtn;

    @AndroidFindBy(id="dashboard_start_option_lyt")
    public MobileElement StartFuelTab;

    @AndroidFindBy(id="location_continue_btn")
    public MobileElement StartFuelTabLocationContinueBtn;

    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public MobileElement StartFuelLocationAllow;

    @AndroidFindBy(xpath="//*[@text='Your Maximum Fuelling Amount: £100']")
    public MobileElement StartFuelAmount;

    @AndroidFindBy(id="pump_select_gallery")
    public MobileElement pumbSelect;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : Mastercard']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: MasterCard\"]")
    public MobileElement PaymentMethodLinkMaster;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : Visa']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Visa\"]")
    public MobileElement PaymentMethodLinkVisa;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : PayPal']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Paypal\"]")
    public MobileElement PaymentMethodLinkPaypal;


    @AndroidFindBy(id="payment_details_update_btn")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"UPDATE\"]")
    public MobileElement UpdateBtn;

    @AndroidFindBy(id="payment_details_update_btn")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"****0014\"]")
    public MobileElement UpdateBtn1;


    @iOSXCUITFindBy(id ="NavBack")
    public MobileElement NavBackBtn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[1])[2]")
    public MobileElement PayPalTick;

    @AndroidFindBy(xpath="//android.widget.RelativeLayout[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]")
    public MobileElement SelectOtherCard;

    @AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you!\"]")
    public MobileElement thankYouHeader;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you!\"]")
    public MobileElement ProvideFeedbackBtn;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Have a safe journey.']")
    @iOSXCUITFindBy(id = "Have a safe journey.")
    public MobileElement SafeJourneyTxt;

    @iOSXCUITFindBy(id = "(//XCUIElementTypeImage)[1]")
    public MobileElement EssoImage1;

    @iOSXCUITFindBy(id = "(//XCUIElementTypeImage)[2]")
    public MobileElement EssoImage2;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
    public MobileElement PumpContinueBtn;

    @AndroidFindBy(id="continue_btn")
    public MobileElement PumbContinue;

    @AndroidFindBy(id="defaultpicket_ok_btn")
    public MobileElement PumbContinueOK;

    @AndroidFindBy(id="payment_checkout_layout")
    public MobileElement PumbContinueConfirm;

    @AndroidFindBy(id="continue_btn")
    public MobileElement ContinueButton;

    @AndroidFindBy(id="header_right_txt")
    public MobileElement SkipButton;

    @AndroidFindBy(id="android:id/button2")
    public MobileElement MailVerifcationSkip;

    @AndroidFindBy(id="dashboard_start_option_inner_img")
    public MobileElement StartFuelBtn;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"visaLogo\"]")
    public MobileElement VisaLogo;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")
    public MobileElement MasterLogo;


    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Card Number'")
    public MobileElement CardNo;


    @AndroidFindBy(id="android:id/button1")
    public MobileElement paymentCreationBtn;

    @AndroidFindBy(id="android:id/button1")
    public MobileElement AddToCardOkBtn;

    @AndroidFindBy(id="android:id/button2")
    public MobileElement SkipAnyway;

    @AndroidFindBy(id="android:id/button1")
    public MobileElement VerifyEmail;

    @AndroidFindBy(id="android:id/button1")
    public MobileElement AddtoCardBtn;

    @AndroidFindBy(id="security_pin_entry_code1")
    public MobileElement PIN1;

    @AndroidFindBy(id="security_pin_entry_code2")
    public MobileElement PIN2;

    @AndroidFindBy(id="security_pin_entry_code3")
    public MobileElement PIN3;

    @AndroidFindBy(id="security_pin_entry_code4")
    public MobileElement PIN4;

    @AndroidFindBy(id="add_payment_btn")
    public MobileElement AddtoCardDebitBtn;

    @AndroidFindBy(id="security_pin_entry_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement PINContinueBtn;

    @AndroidFindBy(id="android:id/button1")
    public MobileElement PINAddedSucessBtn;

    @AndroidFindBy(id="pin_entry_forgot_pin_txt")
    public MobileElement ForgotPwd11;

    @AndroidFindBy(id="security_pin_entry_continue_btn")
    public MobileElement OTPContinueBtn;

    @AndroidFindBy(id="payment_name_et")
//    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Name on card\"")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement NameOnCard;

    @AndroidFindBy(id="android:id/button1")
    public MobileElement CardExpDateBtn;

    @AndroidFindBy(id="search_icon")
    public MobileElement AddressSearchopn;

    @AndroidFindBy(xpath="//*[@text='Flat 2, Henry House, Ringers Road']")
    public MobileElement ChooseAddress;

    @AndroidFindBy(id="header_right_txt")
    public MobileElement SelectAddress;

    @AndroidFindBy(id="finger_print_check_box")
    public MobileElement ADDtoCardChkBox;

    @AndroidFindBy(id="card_consent_checkBox")
    public MobileElement ADDtoCardChkBox2;

    @AndroidFindBy(id="account_card_number")
    public MobileElement CardNumberOne;

    @AndroidFindBy(id="payment_expdate_et")
    public MobileElement CardExpDate;

    @AndroidFindBy(id="payment_security_code_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement SecurityCode;

    @AndroidFindBy(id="payment_bill_address_postcode")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Postcode\"")
    public MobileElement PostCode;

    @AndroidFindBy(id= "payment_bill_address_street")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Address 1\"")
    public MobileElement Address1;

    @AndroidFindBy(id="payment_bill_address_locality")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Address 2\"")
    public MobileElement Address2;

    @AndroidFindBy(id="payment_bill_address_city")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"City\"")
    public MobileElement AddressCity;

    @AndroidFindBy(id="payment_done_btn")
    public MobileElement AddToCardDoneBtn;

    @AndroidFindBy(id="dashboard_already_registered")
    public MobileElement loginBtn;

    @AndroidFindBy(id="dashboard_login")
    public MobileElement loginDSBtn;

    @AndroidFindBy(id="login_email_editText")
    public MobileElement UserName;
    @AndroidFindBy(id="login_passWord_editText")
    public MobileElement Pwd;

    @AndroidFindBy(id="forgot_pwd_tv")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement ForgotPwd;

    @AndroidFindBy(id="forgot_password_email_edit")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement ForgotPwdEmail;

    @AndroidFindBy(id="forgot_password_continue_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement ForgotPwdEmailSentBtn;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public MobileElement TouchIdCheckBoxTick;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public MobileElement ForgotPwdTxt;

    @iOSXCUITFindBy(id ="dp2NectatNIcon2")
    @AndroidFindBy(id="header_text")
    public MobileElement NectarLogo;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "homeScreen_promo_banner")
    public MobileElement FireworkImg;

    @AndroidFindBy(id = "fuel_authorize_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
    public MobileElement ReadyCtnBtn;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Collect 6X Nectar points today when you fill up with our Esso Synergy Supreme+ fuels. \"]")
    public MobileElement LogoDesc;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"VIEW DETAILS\"]")
    public MobileElement ViewDetailsBtn;

    @AndroidFindBy(id="enter_password_text")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Enter Password\" AND type == \"XCUIElementTypeSecureTextField\"")
    public MobileElement ForgotPwdEnter;

    @AndroidFindBy(id = "first_section_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OFFERS\"]\n")
    public MobileElement OfferLink;

    @AndroidFindBy(id = "how_it_work")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"HOW IT WORKS\"]/XCUIElementTypeOther")
    public MobileElement HIW;

    @AndroidFindBy(id = "points_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bonus Points\"]\n")
    public MobileElement PointsSec;

    @AndroidFindBy(id = "pay_points_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rewards\"]")
    public MobileElement RewardsSec;

    @AndroidFindBy(id = "list_item_earning_points")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeStaticText[@name=\"More about collecting points\"]")
    public MobileElement CollectPtsLnk;

    @AndroidFindBy(id = "earn_points")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"COLLECT MORE NECTAR POINTS\"]/XCUIElementTypeOther")
    public MobileElement CollectMoreHead;

    @AndroidFindBy(id="item_edit")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement PayEditBtn;

    @AndroidFindBy(id="account_add_card")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeStaticText[@name=\"Invalid card details or unsupported card. Please check and try again, or use an alternative card.\"]")
    public MobileElement AddToCardBtn;

    @AndroidFindBy(id="item_edit")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement CardInvalidErrMsg;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement PayEditscreen;

    @AndroidFindBy(id="login_password_showHide_btn")
    @iOSXCUITFindBy(id = "Info")
    public MobileElement toggle;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public MobileElement EnterPWDText;

    @AndroidFindBy(id="security_pin_password")
    @iOSXCUITFindBy(id = "Enter your Esso App password to proceed.")
    public MobileElement passprocedtxt;

    @AndroidFindBy(id="submit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement Submit;

    @AndroidFindBy(id="forgot_password_link")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your Password?\"]")
    public MobileElement Forgotpwdlink;

    @iOSXCUITFindBy(id="OK")
    public MobileElement invalidPasswordError_popup_ok_btn;

    @iOSXCUITFindBy(id="Due to security reasons you need to login again.")
    public MobileElement invalidPasswordError_popup_text;

    @AndroidFindBy(id="android:id/button1")
    public MobileElement LocationFindBtn;

    @AndroidFindBy(id="login_Btn")
    public MobileElement LOGINBtn;

    @AndroidFindBy(id="continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CONTINUE\"]")
    public MobileElement TabPumbcotinueBtn;

    @AndroidFindBy(id="pump_select_confirm_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONFIRM\"]")
    public MobileElement PaymentConfirm;

    @AndroidFindBy(id="enter_password_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement passwordshow;

    @AndroidFindBy(id="enter_password_show_hide_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement passwordtxt;

    @AndroidFindBy(id="account_secure_pin")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPINScreen;

    @AndroidFindBy(id="account_secure_pin_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[5]")
    public MobileElement EssoPINEdit;

    @AndroidFindBy(id="account_secure_pin_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public MobileElement EssoPINEdit1;

    @AndroidFindBy(id="account_secure_pin_edit")
    @iOSXCUITFindBy(id="Default payment method successfully updated.")
    public MobileElement Defaultxt;

    @AndroidFindBy(id="account_secure_pin_edit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement DefaultxtOk;

    @AndroidFindBy(id="pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    public MobileElement ForgotPWD;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterPINTxt;

    @AndroidFindBy(id="header_back_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBack\"]")
    public MobileElement backBtn;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement ForgotPWDTxt;

    @AndroidFindBy(id="forgot_password_header_tv")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EmailAddressverify;

    @AndroidFindBy(id="forgot_password_continue_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement SendBtn;

    @AndroidFindBy(id="header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Cancel'")
    public MobileElement PINCanceBtn;

    @AndroidFindBy(id="action_more")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement TabMoreBtn;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Account']")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AccountTab;

    @AndroidFindBy(id="android:id/button1")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AccountTabok;

    @AndroidFindBy(id="account_card_number")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Card Number\"]")
    public  MobileElement EnterCardNumber;

    @AndroidFindBy(id="account_card_number")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Card Number\"]")
    public MobileElement AccountCardNumber;

    @AndroidFindBy(id="cardLogoContainer")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement CardLogo;

    @AndroidFindBy(id="selected_card_tickmark")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement CardTicMark;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Password should contain at least 8 characters')]")
    public MobileElement Accountct;

    @AndroidFindBy(id="login_Btn")
    public MobileElement Loginclick1;

    @AndroidFindBy(id="rootView")
    public MobileElement HelpTab;

    @AndroidFindBy(id="list_item_text_view")
    public MobileElement PaymentDetails;

    @AndroidFindBy(xpath="//*[@text='Why has my transaction been declined?']")
    public MobileElement TransactFAQ;

    @AndroidFindBy(id="list_item_text_child")
    public MobileElement TextPara;

    @AndroidFindBy(id="login_email_editText")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EmailAddress;

    @AndroidFindBy(id="login_passWord_editText")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement LoginPassword;

    @AndroidFindBy(id="login_Btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement LoginPasswordBtn;

    @AndroidFindBy(id="location_continue_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement StartFuelAllowLoc;

    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AccessDeviceLoc;
    
    @AndroidFindBy(id="dashboard_start_option_inner_img")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement StartFuel;

    @AndroidFindBy(id="selected_amount")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AmtSelect;

    @AndroidFindBy(id="continue_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AmtSelectContinueBtn;
    
    @AndroidFindBy(id="defaultpicket_ok_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement amtSelectBtn;
    
    @AndroidFindBy(id="pump_select_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement PumbLoc;
    
    @AndroidFindBy(id="pump_select_confirm_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement PumbSelectConfirmBtn;

    @AndroidFindBy(id="security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public MobileElement EssoPIN1;

    @AndroidFindBy(id="security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public MobileElement EssoPIN2;
    
    @AndroidFindBy(id="security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public MobileElement EssoPIN3;
    
    @AndroidFindBy(id="security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    public MobileElement EssoPIN4;
    
    @AndroidFindBy(id="header_left_txt")
    @iOSXCUITFindBy(id = "Cancel")
    public MobileElement EssoPinCancel;
    
    @AndroidFindBy(id="security_pin_entry_continue_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPinContinueBtn;
    
    @AndroidFindBy(id="pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPinForgot;
    
    @AndroidFindBy(id="enter_password_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPinForgotPassword;

    @AndroidFindBy(id="enter_password_show_hide_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPinForgotToggle;

    @AndroidFindBy(id="submit_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPinForgotContinue;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoPinForgotScn;
    
    @AndroidFindBy(id="security_pin_password")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoForgotpwdScreen;
    
    @AndroidFindBy(id="forgot_password_link")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EssoForgotpwdLink;
    
    @AndroidFindBy(id="enter_password_show_hide_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement ToggleShw;

    @AndroidFindBy(id="header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Enter PIN\"]")
    public MobileElement PINText;
    
    @AndroidFindBy(id="pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public MobileElement PINForgotlINK;

    @AndroidFindBy(id="payment_name_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterCardName;

    @AndroidFindBy(id="payment_cardno_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterCArdNumber;

    @AndroidFindBy(id="payment_expdate_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterExpDate;

    @AndroidFindBy(id="android:id/button2")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterExpbtn;

    @AndroidFindBy(id="payment_security_code_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterSecurityCode;

    @AndroidFindBy(id="payment_bill_address_postcode")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterPOSTALCode;


    @AndroidFindBy(xpath="//*[contains(@text,'Please enter postcode')]")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement EnterPOSTALErrortxt;


    @AndroidFindBy(id="search_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement Searchbtn;

    @AndroidFindBy(id="finger_print_check_box")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AcceptlINKONE;

    @AndroidFindBy(id="card_consent_checkBox")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AcceptlINKTWO;

    @AndroidFindBy(id="card_consent_text_view")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AcceptlINKTWOTxt;

    @AndroidFindBy(id="payment_done_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement PaymentDoneBtn;

    @AndroidFindBy(xpath="//*[contains(@text,'Henry')]")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement addresText;

    @AndroidFindBy(id="header_right_txt")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement SelectBtn;

    @AndroidFindBy(xpath="//*[contains(@text,'Billing Details')]")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement BillingTxt;

    @AndroidFindBy(id="android:id/button1")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement BillingokBtn;

    @AndroidFindBy(xpath="//*[contains(@text,'Your billing details must match the exact address')]")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement BillingTxticon;

    @AndroidFindBy(xpath="//*[contains(@text,'Address 1')]")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement AddressFiled;

    @AndroidFindBy(id = "account_add_card")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Card\"]")
    public MobileElement AddCard;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//XCUIElementTypeStaticText~xpath")
    public MobileElement AccountMessage;

    @AndroidFindBy(id = "payment_name_et")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Name on card'")
    public MobileElement CardName;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Exp. MM/YY'")
    public MobileElement ExpDate;

    @AndroidFindBy(id = "payment_security_code_et")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Security code'")
    public MobileElement CVV;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Postcode'")
    public MobileElement Postal;

    @AndroidFindBy(id = "payment_bill_address_street")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Address 1'")
    public MobileElement Addrs1;

    @AndroidFindBy(id = "payment_bill_address_locality")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Address 2'")
    public MobileElement Addrs2;

    @AndroidFindBy(id = "payment_bill_address_city")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'City'")
    public MobileElement City;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement PaymtDone;

    @AndroidFindBy(id = "security_pin_entry_title")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Enter your Esso PIN to unlock the app for fuelling.\"]")
    public MobileElement PinTxt;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public MobileElement PassPhrase;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verification\"]")
    public MobileElement VerificationTxt;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[1]")
    public MobileElement ModirumImg;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password\"]")
    public MobileElement EnterPwdTxt;

    @AndroidFindBy(id = "pump_select_text")
    @iOSXCUITFindBy(id = "Select your pump")
    public MobileElement SelectPumpHeader;

    @AndroidFindBy(id = "pump_selection_message")
    @iOSXCUITFindBy(id = "Make sure you are parked at this pump and remain in your vehicle.")
    public MobileElement SelectPumpTxt;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    public MobileElement PinCode_1;


    @AndroidFindBy(id = "dashboard_help_msg_social")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Card added'")
    public MobileElement CardAddSuccess;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Default payment'")
    public MobileElement PaymentSuccessTtl;

    @AndroidFindBy(id = "dashboard_help_msg_social")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public MobileElement PaymentSuccessDes;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement okBtn;

    @AndroidFindBy(id = "submitButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
    public MobileElement PassPhraseSubmit;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement Continue_BTN;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Fraud Prevention'")
    public MobileElement PromptTtl;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password\"]")
    public MobileElement EnterPwd;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify by Password\"]")
    public MobileElement VerifyPwd;

    @AndroidFindBy(id = "pump_select_confirm_btn")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"CONFIRM\"]")
    public MobileElement Confirm_BTN;

    @AndroidFindBy(id="payment_billing_info_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement BillingIcon;

    @AndroidFindBy(id="payment_billing_info_icon")
    @iOSXCUITFindBy(id = "Set the Esso PIN to unlock the app for fuelling.")
    public MobileElement setpin_Copytext;

    @AndroidFindBy(id="payment_expdt_validation_txt")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public MobileElement ExpErroMessage;

    public FrictionlessFlowPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "add_payment_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD DEBIT/CREDIT CARD\"]")
    public MobileElement payment_AddCreditDebit_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    public MobileElement set_Pin_Screen;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE']")
    public MobileElement payment_Pin_Continue_Btn;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso PIN added successfully.\"]")
    public MobileElement pin_Confirm;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement pin_Confirm_Ok_Btn;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement card_Number_CreditDebit_Card;

    @AndroidFindBy(id = "master_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Card Details\"]/following::XCUIElementTypeOther//XCUIElementTypeImage[2]")
    public MobileElement card_Details_Master_Logo;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"DONE\"]")
    public MobileElement add_CreditDebit_Continue_Btn;

    @AndroidFindBy(id = "payment_cardno_validation_txt")
    public MobileElement add_CreditDebit_Cardnumber_Inline_Error;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Exp. MM/YY\"")
    public MobileElement card_Exp_DateMonth_Field;

    @AndroidFindBy(id = "pickers")
    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypePicker\"")
    public MobileElement card_Exp_DateMonth_screen;

    @AndroidFindBy(id = "account_secure_pin_edit")
    public MobileElement account_Esso_Pin_Edit;

    @AndroidFindBy(id = "enter_password_text")
    public MobileElement esso_Pin_Edit_Password;

    @AndroidFindBy(id = "submit_btn")
    public MobileElement esso_Pin_Edit_Password_Continue;

    @AndroidFindBy(id = "security_pin_entry")
    public MobileElement esso_New_Pin_Screen;

    @AndroidFindBy(id = "account_secure_set_up_pin")
    public MobileElement essolink_In_Account;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    public MobileElement essolink_Screen;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    public MobileElement set_Up_Pin_Continue;

    @AndroidFindBy(id = "pin_entry_attemp_validation_txt")
    public MobileElement set_Up_Pin_Inline_Error_Msg;

    @AndroidFindBy(id = "payment_cvv_info_icon")
    @iOSXCUITFindBy(id = "Info")
    public MobileElement iicon_Security_Code;

    @AndroidFindBy(id = "pay_dialog_mid_lyt")
    @iOSXCUITFindBy(id="Visa and MasterCard")
    public MobileElement popup_I_Icon;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'start'")
    public MobileElement start_Fueling_Icon;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement continue_Btn_Pump;

    @AndroidFindBy(id = "pay_with_paypal_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PayPal\"]")
    public MobileElement paypal_Btn_Payment;

    @AndroidFindBy(id = "fuel_authorize_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement paypal_Continue_Btn;

    @AndroidFindBy(id = "login_email_editText")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Email\"")
    public MobileElement cmpltd_Username_Login;

    @AndroidFindBy(id = "login_passWord_editText")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Password\"")
    public MobileElement cmpltd_Password_Login;

    @AndroidFindBy(id = "security_pin_entry_code1")
    public MobileElement pin_Dot;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Close Icon'")
    public MobileElement completed_Popup;

    @AndroidFindBy(id = "payment_confirmation_done_btn")
    public MobileElement transaction_Done;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Set Up PIN'")
    public MobileElement setpin_Title;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Esso PIN'")
    public MobileElement EssoPinAccount;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name=\"Set up Esso PIN\"]")
    public MobileElement SetUpEssoPinLink;

    @AndroidFindBy(id = "payment_details_cardview_lyt")
    public MobileElement carddetails_Screen;

    @AndroidFindBy(id = "payment_bill_address_locality")
    public MobileElement second_Address_Field;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    public MobileElement second_Address_Field_Keypad;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Postcode\"")
    public MobileElement postcode_Field;

    @AndroidFindBy(id = "search_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    public MobileElement search_Icon;

    @AndroidFindBy(id = "android:id/message")
    public MobileElement search_Icon_Popup_Msg;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement search_Icon_Ok_Btn;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    public MobileElement forgot_Password_Pin;

    @AndroidFindBy(id = "com.firstdata.mpl.qa:id/header_text")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public MobileElement enter_Password_ForgetPass;

    @AndroidFindBy(id = "com.firstdata.mpl.qa:id/header_left_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public MobileElement cancel_Icon_ForgetPass;

    @AndroidFindBy(id = "com.firstdata.mpl.qa:id/security_pin_password")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Enter Password\" AND type == \"XCUIElementTypeSecureTextField\"")
    public MobileElement enterpass_ForgetPass;

    @AndroidFindBy(id = "forgot_password_link")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Forgot Your Password?\"`]")
    public MobileElement forgetPass_ForgetPass;

    @AndroidFindBy(id = "submit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CONTINUE\"]")
    public MobileElement continue_ForgetPass;

    @AndroidFindBy(id="LocatorNeeded")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Info\"]")
    public MobileElement ShowPasswordLabel;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CONTINUE\"]")
    public MobileElement send_Btn_ForgetPass;

    @AndroidFindBy(id = "info_dialog_gotit_btn")
    public MobileElement cardDetails_I_Gotit_Icon;

    @AndroidFindBy(id = "enter_password_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso App password to proceed.\"]/following::XCUIElementTypeOther[2]")
    public MobileElement forgetPin_Password_Field;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement forgetPin_Ok_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup")
    public MobileElement back_To_NLID;

    @AndroidFindBy(id = "payment_billing_details_title")
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Billing Details\"]")
    public MobileElement card_Details_Billing_Icon;


    @AndroidFindBy(id = "payment_billing_details_title")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public MobileElement EditEssoPin;

    @AndroidFindBy(id = "payment_billing_info_icon")
    @iOSXCUITFindBy(xpath= "(//XCUIElementTypeButton[@name=\"info blue icon\"])[1]")
    public MobileElement card_Details_Billing_I_Icon;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement ConsentBox;

    @AndroidFindBy(id = "security_pin_entry")
    public MobileElement set_Pin_dot_Screen;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    public MobileElement post_Code_Card_Details;

    @AndroidFindBy(id = "search_icon")
    public MobileElement enable_Search_Icon;

    @AndroidFindBy(id = "search_editText")
    public MobileElement post_Code_Lookup_Screen1;

    @AndroidFindBy(id = "address_list_lyt")
    public MobileElement post_Code_Lookup_Screen2;

    @AndroidFindBy(id = "android:id/message")
    public MobileElement postcode_Popup;

    @AndroidFindBy(id = "forgot_password_header_tv")
    public MobileElement forgotpass_text;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    public MobileElement forgotPass_Send_Btn;

    @AndroidFindBy(id = "payment_bill_address_city")
    public MobileElement cardDetails_City_Field;

    @AndroidFindBy(id = "payment_expdt_validation_txt")
    @iOSXCUITFindBy(id="Please enter expiry date")
    public MobileElement expiry_Date_Inline_Error_Msg;

    @AndroidFindBy(id = "payment_city_validation_txt")
    public MobileElement city_Name_Inline_Error_Msg;

    @AndroidFindBy(id = "payment_secCode_validation_txt")
    @iOSXCUITFindBy(xpath = "Please enter security code")
    public MobileElement security_Code_Inline_Err_Msg;

    @AndroidFindBy(id = "payment_billing_details_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Billing Details\"]")
    public MobileElement billing_Details_Field;

    @iOSXCUITFindBy(id="Please set up Apple Pay, PayPal or manually add a Debit/Credit Card to pay with the Esso App.")
    public MobileElement AddPaymentScreen11;

    @iOSXCUITFindBy(id="Your billing details must match the exact address registered with the issuing bank.")
    public MobileElement billingLable;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement billingLableoK;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(id = "Your billing details must match the exact address registered with the issuing bank.")
    public MobileElement iicon_Popup_Msg;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH'Please check the box'")
    public MobileElement CheckboxPopUpMsg;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH'By saving the card,you consent'")
    public MobileElement ConsentIconPopUpMsg;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement iicon_Popup_Msg_Ok_Btn;

    @AndroidFindBy(id = "pin_entry_attemp_validation_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Wrong PIN. 2 Attempts left.\"]")
    public MobileElement wrong_Pin_Inline_Err_Msg;

    @AndroidFindBy(id = "payment_bill_address_locality")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Address 2\"]")
    public MobileElement billing_Details_Second_Address;

    @AndroidFindBy(id = "payment_streetAdr_validation_txt")
    @iOSXCUITFindBy(id = "Please enter address")
    public MobileElement billing_Inline_Error_Address_Field;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Done'")
    public MobileElement billing_Details_Expiry_Date_Ok;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement billing_Details_COF_Checkbox;

    @AndroidFindBy(id = "payment_name_validation_txt")
    public MobileElement card_Name_Inline_Err_Msg;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Postcode Lookup\"]")
    public MobileElement postcode_Lookup_Title;

    @AndroidFindBy(id = "com.firstdata.mpl.qa:id/address_search_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public MobileElement postcode_Lookup_Search_Icon;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear text\"]")
    public MobileElement postcode_Lookup_Clear_Icon;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select\"]")
    public MobileElement selectLookUp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[48]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
    public MobileElement postcode_Lookup_Screen_Address;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[48]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
    @AndroidFindBy(id = "address_lookup_selected")
    public MobileElement postcode_Lookup_Screen_Selected_Address;

    @AndroidFindBy(id = "finger_print_check_box")
    public MobileElement billing_Details_Checkbox_Authoriz;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout")
    public MobileElement esso_Edit_Pin_Screen;

    @AndroidFindBy(id = "account_secure_set_up_pin")
    public MobileElement esso_Pin_Account;

    @AndroidFindBy(id = "payment_bill_address_country")
    public MobileElement unitedkingdm_Billing_Details;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(id="We have sent you instructions to reset your password. Please check your inbox or spam folder.")
    public MobileElement resend_Popup_Msg;

    @iOSXCUITFindBy(xpath = "label == //XCUIElementTypeStaticText[@name=\"Email Sent\"]")
    @AndroidFindBy(id = "alertTitle")
    public MobileElement resendPopup_Title;

    @AndroidFindBy(id = "close_img")
    public MobileElement closeicon_Postcode_Lookup;

    @AndroidFindBy(id = "flContainer")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
    public MobileElement address_List_Postcode_LookupScreen;

    @AndroidFindBy(id = "consent_info_icon")
    @iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[@name=\"info blue icon\"])[2]")
    public MobileElement consent_I_Icon_Billing_Details;

    @AndroidFindBy(id = "payment_posCode_validation_txt")
    @iOSXCUITFindBy(id = "Please enter postcode")
    public MobileElement postcode_Inline_Error_Msg;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Card added'")
    public MobileElement card_Added_Success_Msg;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement card_Add_Ok_Btn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement card_Alert_Ok_Btn;

    @AndroidFindBy(id = "account_paycard_title")
    public MobileElement payment_Method_Txt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    public MobileElement added_Card_Number;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    public MobileElement added_Card_Edit;

    @AndroidFindBy(id = "edit_payment_done_btn")
    public MobileElement added_Card_Edit_Done;

    @AndroidFindBy(id = "edit_payment_delete_btn")
    public MobileElement added_Card_Edit_Cancel;

    @AndroidFindBy(id = "header_text")
    public MobileElement account_Screen_Title;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Mastercard Logo\"]")
    public MobileElement added_Card_Logo;

    @AndroidFindBy(id = "paypal_get_started")
    public MobileElement continue_Payment_Added;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    public MobileElement billing_Postcode_Address;

    @AndroidFindBy(id = "search_icon")
    public MobileElement Postcodesearch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    public MobileElement Postselectaddress;

    @AndroidFindBy(id = "header_right_txt")
    public MobileElement selectbutton;

    @AndroidFindBy(id = "security_pin_entry_title")
    @iOSXCUITFindBy(id="Enter your Esso PIN to unlock the app for fuelling.")
    public MobileElement enteryouressopin_txt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Due to security reasons you need to login again.\"]")
    public MobileElement passwordWarningPopup;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypePickerWheel[@index=\"0\"])[1]")
    public MobileElement MonthPickerAddCard;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypePickerWheel[@index=\"1\"])[1]")
    public MobileElement YearPickerAddCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"New PIN updated successfully.\"]")
    public MobileElement pinSuccessMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"NONE OF THE ABOVE\"]")
    public MobileElement noneOfTheAboveButton;


    public String monthPicker(){
        Calendar cal = Calendar.getInstance();
        String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};
        String Months = monthName[cal.get(Calendar.MONTH)];
        return Months;
    }
    public String yearPicker(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String YR=String.valueOf(year);
        return YR;
    }
    public static void acceptbutton(){
//        driver.executeScript(String.valueOf(new KeyEvent(AndroidKey.SEARCH)));
//        driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
//        driver.getKeyboard().sendKeys(Keys.ENTER);
//        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.getKeyboard().pressKey(Keys.ENTER);
    }
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter a 4 digit PIN\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement EssoPINTxtinErr;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    @AndroidFindBy(id = "submit_btn")
    public MobileElement EssoPINTxtContinue;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Due to security reasons you need to login again.\"]")
    @AndroidFindBy(id = "message")
    public MobileElement Securitytxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"OK\"))")
    public MobileElement Securitytxtok;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set the Esso PIN to unlock the app for fuelling.\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement EssoPINTxt2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    @AndroidFindBy(id = "header_left_txt")
    public MobileElement EssoPINCancel;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Set up Esso PIN\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement EssoPINTxt;

    @AndroidFindBy(id = "login_email_editText")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public MobileElement userName;

    @AndroidFindBy(id="login_passWord_editText")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeSecureTextField' AND value BEGINSWITH 'Password'")
    public MobileElement password;

    @AndroidFindBy(id="login_Btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOGIN\"]")
    public MobileElement loginButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your Password?\"]")
    @AndroidFindBy(id = "forgot_password_link")
    public MobileElement Essoforgotlink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    public MobileElement EssoforgotPIN;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso App password to proceed.\"]")
    @AndroidFindBy(id = "security_pin_password")
    public MobileElement EssoforgotPWDlable;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SEND\"]")
    @AndroidFindBy(id = "forgot_password_continue_btn")
    public MobileElement EssoForContinueBtn;

    @AndroidFindBy(id = "pay_with_paypal_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PayPal'")
    public MobileElement PayPalButn;


    @iOSXCUITFindBy(id = "In order to reset your password, an email will be sent to your address:")
    @AndroidFindBy(id = "forgot_password_header_tv")
    public MobileElement EssoForgotINCTLable;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Password\"]")
    @AndroidFindBy(id = "header_text")
    public MobileElement EssoEssoForgotttle;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name=='Forgot Password'")
    @AndroidFindBy(id = "header_text")
    public MobileElement EssoPINTxttitle1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[7]")
    @AndroidFindBy(id = "item_edit")
    public MobileElement PaymentEditbtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Card\"]")
    @AndroidFindBy(id = "edit_payment_delete_btn")
    public MobileElement CardDeletebtn;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Are you sure you want to delete this card?'")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Are you sure you want to delete this card?\"))")
    public MobileElement Carddeletepopupmsg;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter city\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement CardinlineError;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter card number\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement Cardnumber;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter name on card\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement Cardname;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter postcode\"]")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement PostcodeinlineError;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Set Up PIN'")
    @AndroidFindBy(id = "header_right_txt")
    public MobileElement EssoPINsetuptxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBack\"]")
    @AndroidFindBy(id = "header_back_btn")
    public MobileElement navBack;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"back Icon\"]")
    @AndroidFindBy(id = "header_back_btn")
    public MobileElement navBack1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"****0014\"]")
    @AndroidFindBy(id = "account_card_number")
    public MobileElement cardLastdigit;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"****0014\"]")
    @AndroidFindBy(id = "com.firstdata.mpl.stage:id/account_card_number")
    public MobileElement cardLastdigit1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"****0014\"]")
    @AndroidFindBy(id = "selected_card_tickmark")
    public MobileElement tickMark;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Card\"]")
    public MobileElement MFA;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Add Card\"]")
    public MobileElement AccountaddCard;

    @AndroidFindBy(id ="card_consent_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement ConsentBox11;

    @AndroidFindBy(id = "button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement ConsentBox11OK;

    @AndroidFindBy(id ="dashboard_greeting_msg")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment method added successfully\"]")
    public MobileElement AddpaymentScuccss;

    @AndroidFindBy(id ="dashboard_help_msg_social")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your payment method account will be charged for the amount you fuel.\"]")
    public MobileElement AddpaymentScuccsslabel;

    @AndroidFindBy(xpath ="(//android.widget.ImageView[@content-desc=\"Complete your profile\"])[8]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Payment Method\"])[2]")
    public MobileElement AddpaymentScuccssContinue;

    @AndroidFindBy(id ="paypal_get_started")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement Payemntmethodtsk;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public MobileElement pinDigit;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Done\"]")
    public MobileElement DonebtnEXP;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement Okcomplete;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
    public MobileElement maximum_Fueling_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Payment Method'])[2]")
    public MobileElement payment_Methd_Btn1;


    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Add Nectar card\"]")
    public MobileElement OkNect;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Already Completed\"]")
    public MobileElement profComCT;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"You have already completed this feature. Please select a feature without tickmark to complete your profile.\"]")
    public MobileElement profComCT1;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Up PIN\"]")
    public MobileElement SetupPINTitle;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Debit/Credit Card\"]")
    public MobileElement Addpaymentscreentitle;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
    public MobileElement Postcodelist;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public MobileElement Skipmax;


    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement Contmax;

    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'REGISTER AN ACCOUNT'")
    public MobileElement DashRegstr;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'REGISTER AN ACCOUNT'")
    public MobileElement Fingerprintskip;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'REGISTER AN ACCOUNT'")
    public MobileElement Emailsentpromt;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'REGISTER AN ACCOUNT'")
    public MobileElement EmailSentokbtn;

    @AndroidFindBy(id = "linkedin_login_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Welcome Back\"]")
    public MobileElement LinkedinIconWel;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or Phone\"]")
    public MobileElement SSOLinUsername;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"] ")
    public MobileElement SSOlinpwd;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
    public WebElement SSOsignin;

    @AndroidFindBy(id="dashboard_start_option_inner_img")
    @iOSXCUITFindBy(id = "//XCUIElementTypeOther[@name=\"start\"]")
    public MobileElement StartFuelIconLID;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public MobileElement PopUpCancel;

    @AndroidFindBy(id = "lid_vertical_dash")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"start\"]")
    public MobileElement CTLID;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"We have sent you instructions to reset your password. Please check your inbox or spam folder.\"]")
    public MobileElement Resetlabletxt;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"CANCEL\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CANCEL\"]")
    public MobileElement CANCEL;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"DELETE\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DELETE\"]")
    public MobileElement DELETE;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"CONTINUE\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"DONE\"]")
    public MobileElement CONTINUE;
}