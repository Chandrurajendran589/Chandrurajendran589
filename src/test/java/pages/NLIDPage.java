package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import stepLibrary.GenericWrappers;

public class NLIDPage extends GenericWrappers {

    public NLIDPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement registeranaccount_NLID;


    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(id = "OK")
    public MobileElement OKBTN;

    @AndroidFindBy(id = "header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'To keep your payment '")
    public MobileElement registeration_First;

    @AndroidFindBy(id = "dashboard_already_registered")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'Login!'")
    public MobileElement login_Button_Nlid;

    @AndroidFindBy(id = "login_Btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'LOGIN'")
    public MobileElement login_Button_Login;

    @AndroidFindBy(id = "login_email_error_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please enter email address'")
    public MobileElement inline_Error_Email;

    @AndroidFindBy(id = "login_email_editText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement email_Valid_Login;

    @AndroidFindBy(id = "forgot_pwd_tv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your Password?\"]")
    public MobileElement forgot_Password_Button;

    @AndroidFindBy(id = "forgot_password_email_edit")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' AND value== 'Email'")
    public MobileElement invaild_Emailid_Section_Forgot_Password;

    @AndroidFindBy(id = "forgot_password_email_edit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement vaild_Emailid_Section_Forgot_Password;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND value== 'Email Sent'")
    public MobileElement email_Sent_popup;


    @AndroidFindBy(id = "forgot_password_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'SEND'")
    public MobileElement send_Button_Forgot_Password;

    @AndroidFindBy(id = "login_pwd_error_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please enter password'")
    public MobileElement inline_Error_Password;

    @AndroidFindBy(id = "forgot_password_email_error_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Incorrect email'")
    public MobileElement inline_Error_Email_Password;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBack\"]")
    public MobileElement cancel_Button_Forgot_Password;

    @AndroidFindBy(id = "login_passWord_editText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeSecureTextField' AND value== 'Password'")
    public MobileElement email_Valid_Password_Wrong;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND value== 'Your email or password was incorrect. Please try again.'")
    public MobileElement invalid_unpwd_popup;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign up for Twitter\"]/android.widget.TextView[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Authorise Esso App'")
    public MobileElement esso_Twitter_Screen_Content;

    @AndroidFindBy(id = "twitter_login_icon")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'twitterNew'")
    public MobileElement esso_Twitter_Button_Nlid;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"facebook\"]/android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'facebook'")
    public MobileElement esso_Facebook_Screen_Content;

    @AndroidFindBy(id = "facebook_login_icon")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'fbNew'")
    public MobileElement esso_Facebook_Button_Nlid;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'New to LinkedIn?'")
    public MobileElement esso_Linkedin_Screen_Content;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]")
    public MobileElement linkedIn_Back_esso;

    @AndroidFindBy(id = "linkedin_login_icon")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'linkednNew'")
    public MobileElement esso_Linkedin_Button_Nlid;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeToolbar[@name=\"Toolbar\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public MobileElement esso_SSO_Back_Button;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button[2]")
    public MobileElement esso_Twitter_Back_button;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Not now\"]/android.widget.TextView")
    public MobileElement esso_back_fb_button;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Return to Esso App\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "need to write path")
    public MobileElement esso_return_NLID_button;

    @AndroidFindBy(id = "header_back_btn")
    public MobileElement forget_pass_back_button;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'OK'")
    public MobileElement OkButtonWrongContentPopup;

    @AndroidFindBy(xpath = "Locstion needed")
    @iOSXCUITFindBy(id = "start")
    public MobileElement StartButtonLID;
}
