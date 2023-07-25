package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

public class RedemptionOptionPage extends GenericWrappers {
    public RedemptionOptionPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Login!\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login!\"]")
    public MobileElement Loginlink;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public MobileElement userName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"NONE OF THE ABOVE\"]")
    @iOSXCUITFindBy(id = "cancel")
    public MobileElement clickOnCancelbutton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(xpath = "///XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public MobileElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"LOGIN\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOGIN\"]")
    public MobileElement loginButton;

    @AndroidFindBy(id = "dismiss_button")
    @iOSXCUITFindBy(id = "dismiss_button")
    public MobileElement LIDNectarPopup;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Start\"])[1]")
    @iOSXCUITFindBy(id = "dashboard_start_option_inner_img")
    public MobileElement startButton;

    @AndroidFindBy(id = "location_continue_btn")
    @iOSXCUITFindBy(id = "location_continue_btn")
    public MobileElement LocationContinueButton;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(id = "btnClose")
    public MobileElement NectarCloseLIDPopUp;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    @iOSXCUITFindBy(id = "permission_allow_foreground_only_button")
    public MobileElement LocationAccess;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(id ="continue_btn")
    public MobileElement selectPumpContinue;

    @AndroidFindBy(id = "loyalty_edit")
    @iOSXCUITFindBy(id = "loyalty_edit")
    public MobileElement EditLoyalityCardButton;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(id = "android:id/message")
    public MobileElement RewardPopupMessage;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id="android:id/button1")
    public MobileElement okButton;

}
