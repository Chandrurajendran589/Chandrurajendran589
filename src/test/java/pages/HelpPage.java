package pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import stepLibrary.GenericWrappers;

public class HelpPage extends GenericWrappers {

    public HelpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "//action_more")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'More'")
    public MobileElement moreIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Help']")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Help'")
    public MobileElement helpIcon;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx" +
            ".recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Esso App Tutorial'")
    public MobileElement essoTutorialIcon;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Welcome to Esso!\"]")
    public MobileElement FirstScreenTitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Use the Esso App'")
    public MobileElement FirstScreenSubtitle;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Pay securely from your car'")
    public MobileElement SecondScreenTitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Set up your payment'")
    public MobileElement SecondScreenSubtitle;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Collect Nectar points on every fill'")
    public MobileElement ThirdScreenTitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Get exclusive Esso rewards'")
    public MobileElement ThirdScreenSubtitle;

    @AndroidFindBy(id = "next_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'NEXT'")
    public MobileElement nextIcon;

    @AndroidFindBy(id = "dashboard_already_registered")
    public MobileElement loginIcon;

    @AndroidFindBy(id = "login_email_editText")
    public MobileElement username;

    @AndroidFindBy(id = "login_passWord_editText")
    public MobileElement password;

    @AndroidFindBy(id = "login_Btn")
    public MobileElement loginbtn;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[3]")
    public MobileElement thirtypercent;

    @AndroidFindBy(id = "circular_progress_lid")
    public MobileElement circularIndicator;

    @AndroidFindBy(id = "complete_profile_txt")
    public MobileElement completeprofileIcon;

    @AndroidFindBy(id = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout")
    public MobileElement addNdectarIcon;

    @AndroidFindBy(id = "get_started_btn")
    public MobileElement nectarGetStarted;

    @AndroidFindBy(id = "add_loyalty_entry_edit")
    public MobileElement nectarCardNumber;

    @AndroidFindBy(id = "complete_profile_button")
    public MobileElement nectarCompletionicon;

    @AndroidFindBy(id = "alertTitle")
    public MobileElement nectarAlreadyCompleted;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement nectarAlreadycompltdpopup;

    @AndroidFindBy(id = "done_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'GET STARTED'")
    public MobileElement GetStartedThirdTutorial;

    @AndroidFindBy(id = "tutorial_page_one_bg")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"car\"]")
    public MobileElement WelcomImgScreenOne;

}
