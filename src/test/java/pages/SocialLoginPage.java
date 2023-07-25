package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

public class SocialLoginPage extends GenericWrappers {
        public SocialLoginPage()
        {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        }
    @AndroidFindBy(xpath = "locator need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"fbNew\"]")
    public MobileElement FbIcon;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
    public MobileElement FbUserName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
    public MobileElement FbPassword;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'u_0_4')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
    public MobileElement FbLoginBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"In order to reset your Esso PIN, an email will be sent to your address: essotesting234@gmail.com\"]")
    public MobileElement ForgotPinText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SEND\"]")
    public MobileElement ForgotPinSendBtn;

    @AndroidFindBy(xpath = "locator need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"twitterNew\"]")
    public MobileElement TwitterIcon;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "iOSNsPredicate = \"type== 'XCUIElementTypeStaticText\n" +
            "' AND name == ‘Forgot PIN’")
    public MobileElement ForgotPinTitle;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "iOSNsPredicate = \"type== 'XCUIElementTypeStaticText\n" +
            "' AND name == ‘Cancel’")
    public MobileElement ForgotPinCancelBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "iOSNsPredicate = \"type== 'XCUIElementTypeStaticText\n" +
            "' name BEGINSWITH ‘We have sent you instructions’")
    public MobileElement ForgotPinPopUpText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public MobileElement TwitterUserName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
    public MobileElement TwitterPwd;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'u_0_4')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
    public MobileElement TwitterLoginBtn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public MobileElement Facebook_Privacy_policy_tc_checkbox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement Facebook_Receive_emails_tc_checkbox;

    @iOSXCUITFindBy(id = "I accept the Privacy Policy and Terms and Conditions.")
    public MobileElement Facebook_Privacy_policy_tc_txt;

    @iOSXCUITFindBy(id = "I’d like to receive emails from Esso about topics that may interest me, promotions and Nectar offers.")
    public MobileElement Facebook_Receive_emails_tc_txt;

}
