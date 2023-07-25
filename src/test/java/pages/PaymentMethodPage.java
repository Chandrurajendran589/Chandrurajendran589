package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class PaymentMethodPage extends GenericWrappers {
    public PaymentMethodPage()
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
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public MobileElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"LOGIN\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOGIN\"]")
    public MobileElement loginButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Save Password\"]")
    public MobileElement SavePWD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Now\"]")
    public MobileElement notNowPWD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Now\"]")
    public List<MobileElement> notNowPassword;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More\"]")
    public MobileElement moreLink;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Account")
    public MobileElement accountLink;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Add Card\"]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Add Card\"]")
    public MobileElement addCardLink;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public MobileElement pinDigit1;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public List<MobileElement> ListPinDigit1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    public MobileElement pinDigit2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    public MobileElement pinDigit3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]")
    public MobileElement pinDigit4;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement pinContinueButton;

    @AndroidFindBy(id ="button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]")
    public MobileElement pinOkButton;

    @AndroidFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public MobileElement faceIDSkipButton;

    @AndroidFindBy(id = "visa_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[2]")
    public MobileElement Visa_Icon;

    @AndroidFindBy(id = "master_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[3]")
    public MobileElement master_Icon;

    @AndroidFindBy(id = "payment_name_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Name on card\"']")
    public MobileElement cardNameTextBox;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Card Number\"']")
    public MobileElement cardNumberTextBox;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Exp. MM/YY\"']")
    public MobileElement expireDateTextBox;

    @AndroidFindBy(id = "payment_security_code_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Security code\"']")
    public MobileElement SecurityCodeTextBox;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Postcode\"']")
    public MobileElement pinCodeSearchBox;

    @AndroidFindBy(id = "search_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public MobileElement addressSearchIcon;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@index=0])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText['index=1'])[4]")
    public MobileElement addressSelectFromList;

    @AndroidFindBy(id = "payment_bill_address_street")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Address 1\"']")
    public MobileElement addressLine1TextBox;

    @AndroidFindBy(id = "payment_bill_address_locality")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Address 2\"']")
    public MobileElement addressLine2TextBox;

    @AndroidFindBy(id = "payment_bill_address_city")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"City\"']")
    public MobileElement cityTextBox;

    @AndroidFindBy(id = "finger_print_check_box")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public MobileElement fingerPrintCheckBox;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement cardConsentCheckBox;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"DONE\"]")
    public MobileElement PaymentContinueButton;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public MobileElement paymentPageCancelButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Scan Your Card\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
    public MobileElement paymentScanButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Use Fingerprint to quickly authorise payments\"))")
    public MobileElement ScrollToFingerPrintText;

    @AndroidFindBy(id = "no_search_result_text")
    @iOSXCUITFindBy(xpath = "//*[contains(@name,\"No results were found\")]")
    public MobileElement noResultsText;


    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath= "(//XCUIElementTypeStaticText[@name=\"Edit\"])[2]")
    public  MobileElement CardEditLink;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Delete Card\"))")
    public MobileElement ScrollToDeleteCardText;


    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"LOG OUT\"))")
    public MobileElement ScrollToLogOutText;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Add Nectar Card\"))")
    public MobileElement ScrollToAddNectarCardText;

    @AndroidFindBy(id = "payment_cvv_info_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Info\"]")
    public MobileElement iIconInPaymentScreen;

    @AndroidFindBy(id = "info_dialog_gotit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"GOT IT\"]")
    public MobileElement gotItButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Choose Default Method\"]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Choose Default Method\"]")
    public MobileElement defaultPaymentMethodButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"doneButton\"]")
    public MobileElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Delete Card\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Card\"]")
    public MobileElement deleteCardButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to delete this card?\"]")
    public MobileElement deleteCardPopupText;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Cancel\"])[1]")
    public MobileElement CancelOnDeleteCardPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card deleted successfully.\"]")
    public MobileElement DeletedCardSuccessMessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement okButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"DELETE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")
    public MobileElement confirmDeleteButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"CONTINUE\"))")
    public MobileElement ScrollToContinueText;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(id = "card_consent_checkBox")
    public MobileElement cardConsentCheckBoxInAddCard;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(id = "payment_done_btn")
    public MobileElement continueButtonAddCard;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"OK\"]")
    @iOSXCUITFindBy(xpath = "//android.widget.Button[@text=\"OK\"]")
    public MobileElement dateSelectOkButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You can only add a maximum of 5 cards. You can remove one of the cards to proceed.\"]")
    public  MobileElement MaxFiveCardMessage;
}
