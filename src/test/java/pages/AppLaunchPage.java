package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

public class AppLaunchPage extends GenericWrappers {
    public AppLaunchPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public MobileElement userName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"NONE OF THE ABOVE\"]")
    @iOSXCUITFindBy(id = "cancel")
    public MobileElement clickOnCancelbutton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(xpath = "///XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public MobileElement password;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index=\"1\"]")
    public MobileElement welComeScreen;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public MobileElement TutorialSkipButton;

    @AndroidFindBy(id = "next_btn")
    public MobileElement tutorialNextButton;

    @AndroidFindBy(id = "done_btn")
    public MobileElement tutorialGetStartedButton;

    @AndroidFindBy(id = "nectar_points_lyt")
    public MobileElement nectarPointLID;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    public MobileElement startButtonLID;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    public MobileElement subTitleText;

    @AndroidFindBy(id = "tutorial_page_one_bg")
    public MobileElement pumpIconFirst;

    @AndroidFindBy(id = "lid_profile_variation_text")
    public MobileElement AddNectarLinkLID;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Nectar Card\"]")
    public MobileElement addNectarCardPage;

    @AndroidFindBy(id = "dc_dont_have")
    public MobileElement dontHaveNectarCardLink;

    @AndroidFindBy(id = "get_started_btn")
    public MobileElement getStartedButton;

    @AndroidFindBy(id = "add_loyalty_entry_edit")
    public MobileElement nectarCardNumTextBox;

    @AndroidFindBy(id = "add_loyalty_done_btn")
    public MobileElement NextButton;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    public MobileElement nectarSuccessScreen;

    @AndroidFindBy(id = "paypal_get_started")
    public MobileElement continueButton;

    @AndroidFindBy(id = "android:id/message")
    public MobileElement SuccessPopup;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Verify later\"]")
    public MobileElement verifyLaterButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    public MobileElement continueButtonNectarPopup;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Link your account\"]")
    public MobileElement linkYourAcctPage;

    @AndroidFindBy (xpath = "//android.widget.EditText[@resource-id=\"CARDNUMBER\"]")
    public MobileElement LYANectarCardNumBox;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"PASSWORD\"]")
    public MobileElement LYANectarPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    public MobileElement LYANectarContinueButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"VERIFICATIONCODE\"]")
    public MobileElement nectarOTPTextBox;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Link account\"]")
    public MobileElement linkAccountButton;

    @AndroidFindBy(id = "learn_more_nector")
    public MobileElement learnMoreLIDScreen;



}
