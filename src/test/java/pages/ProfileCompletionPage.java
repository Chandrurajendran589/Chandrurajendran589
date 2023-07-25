package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class ProfileCompletionPage extends GenericWrappers
{

    public ProfileCompletionPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement registerAccount;

    @AndroidFindBy(id = "firstName_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement registerFirstName;

    @AndroidFindBy(id = "lastName_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement registerLastName;

    @AndroidFindBy(id = "email_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_Email;

    @AndroidFindBy(id = "password_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_Password;

    @AndroidFindBy(id = "confirm_password_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_ConfirmPass;

    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_AcceptPrivacy;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_Continue_Btn;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_Email_Skip;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement register_Emailskip_Anyway;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement thirty_percent_Indicator;

    @AndroidFindBy(id = "complete_profile_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'COMPLETE YOUR PROFILE'")
    public MobileElement profile_Completion_NLID;

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Nectar Card'")
    public MobileElement add_Nectar_Button;

    @AndroidFindBy(id = "get_started_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'GET STARTED'")
    public MobileElement getStarted_Add_Nectar;

    @AndroidFindBy(id = "login_passWord_editText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement valid_Password_Login;

    @AndroidFindBy(id = "login_email_editText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement valid_Username_Login;

    @AndroidFindBy(id = "lid_resend_email_click_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Resend Email'")
    public MobileElement resend_email_btn_NLID;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'We've sent you an'")
    public MobileElement resend_email_Popup_message;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement resend_popup_ok_btn;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Complete Your Profile'")
    public MobileElement complete_profile_Screen;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(id = "start")
    public MobileElement start_fueling_icon_NLID;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Before you can proceed,'")
    public MobileElement start_fueling_verficaton_msg;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Add Nectar card\"]")
    public MobileElement OkNect;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement start_fueling_popup_btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement add_Moble_Num_Btn;

    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField")
    public static MobileElement enter_Mble_Num;

    @AndroidFindBy(id = "mobile_done_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'DONE'")
    public MobileElement mble_num_Done_Btn;

    @AndroidFindBy(id = "dashboard_help_msg_social")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number added successfully'")
    public MobileElement mble_Num_Complted_popup;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement mble_Num_Popup_Okbtn;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public MobileElement mble_Num_Popup_Cont;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement add_Mobl_Num_cmpltd;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Already Completed'")
    public static MobileElement compltd_mbl_Num_popup;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id ="OK")
    public MobileElement completd_Mble_Num_Popupok_Btn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public List<MobileElement> already_completed_Popupok_Btn;

    @AndroidFindBy(id = "iv_profile_tick")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement completed_tick_Mark;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Email Preferences'")
    public static MobileElement email_task;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeImage[1]")
    public MobileElement completed_Privacy_And_Terms;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]/XCUIElementTypeImage[1]")
    public MobileElement completed_First_Last_Name;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[9]/XCUIElementTypeImage[1]")
    public MobileElement completed_Notification;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
    public MobileElement maximum_Fueling_Btn;

    @AndroidFindBy(id = "set_amount")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'SET MAXIMUM AMOUNT'")
    public MobileElement set_Maximum_Fueling_Btn;

    @AndroidFindBy(id = "defaultpicket_ok_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Done'")
    public MobileElement maximum_Fueling_ok_btn;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
    public MobileElement maximum_fueling_continu_btn;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'You have already'")
    public MobileElement maximum_Fueling_Amnt_Compltd_Msg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement compltd_Add_Nectar;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement compltd_Add_Nectar_Msgpopup;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'OK'")
    public MobileElement compltd_Add_Nectar_okbtn;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'back Icon'")
    public MobileElement app_Back_Button;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement percent_progress;

    @AndroidFindBy(id = "action_third_tab")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Offers'")
    public MobileElement offer_icon;

    @AndroidFindBy(id = "action_more")
    @iOSXCUITFindBy(id = "More")
    public MobileElement more_icon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout")
    @iOSXCUITFindBy(id = "Account")
    public MobileElement account_icon;

    @AndroidFindBy(id = "account_add_nectarcard")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Nectar card\"]")
    public MobileElement add_nectar_Account;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement cancel_add_nectar_accnt;

    @AndroidFindBy(id = "add_loyalty_entry_edit")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' AND value == 'Card number'")
    public MobileElement enter_nectar_card_Accnt;

    @AndroidFindBy(id = "add_loyalty_done_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'NEXT'")
    public MobileElement accnt_Nectar_Next;

    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Verify later\"]")
    public MobileElement accnt_Nectar_verify_later;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Skip'")
    public MobileElement accnt_Nectar_Skip;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Account'")
    public MobileElement account_Page;

    @AndroidFindBy(id = "login_dc_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'ADD NECTAR CARD'")
    public static MobileElement add_Nectar_Offer;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public MobileElement add_Nectar_Continue_Offer;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement add_Nectar_cancel;

    @AndroidFindBy(id = "txtoffer")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'OFFERS'")
    public MobileElement offer_screen;

    @AndroidFindBy(id = "account_add_card")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement add_card_Account;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(iOSNsPredicate = "//XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public MobileElement card_Pin_Num1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public MobileElement card_Pin_Num2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public MobileElement card_Pin_Num3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    public MobileElement card_Pin_Num4;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement add_Card_Continue;

    @AndroidFindBy(id = "contentPanel")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement pin_added_Success_Msg;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement pin_Added_Ok_Btn;

    @AndroidFindBy(id = "account_setup_paypal")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement add_Paypal_Account;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Email_id;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Password;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Login_btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View[2]/android.view.View[2]/android.view.View[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Agree_Cookies;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Continue_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Agree_Continue;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement paypal_Completed_Success_Msg;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE']")
    public MobileElement paypal_Compltd_Continue_Btn;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement nectar_Card_Success_Msg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Nectar Card'")
    public MobileElement compltd_nectar_Card_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Payment Method'])[2]")
    public MobileElement payment_Methd_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Card\"]")
    public MobileElement MFA;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"****0014\"]")
    public MobileElement MFA1;

    @AndroidFindBy(id = "payment_paypal_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement payment_Mthd_Paypal_Btn;

    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeButton/XCUIElementTypeStaticText")
    public MobileElement payment_Edit_Btn;

    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[1]")
    public MobileElement payment_Edit_Btn1;

    @AndroidFindBy(id = "paypal_signout_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement payment_Edit_Signout_Btn;

    @AndroidFindBy(id = "account_info_layout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'REGISTER AN'")
    public MobileElement compltd_Accnt_Featrs;

    @AndroidFindBy(id = "wow_starburst_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public MobileElement enectarpoints;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PROFILE COMPLETION AT 30%'")
    public MobileElement CompleteYourProfile30;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PROFILE COMPLETION AT 40%'")
    public MobileElement CompleteYourProfile40;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PROFILE COMPLETION AT 50%'")
    public MobileElement CompleteYourProfile50;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PROFILE COMPLETION AT 60%'")
    public MobileElement CompleteYourProfile60;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeImage[1]")
    public MobileElement TickMarkMfaCompleteYourProfile;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '30%'")
    public MobileElement LIDProgress30;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '40%'")
    public MobileElement LIDProgress40;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '50%'")
    public MobileElement LIDProgress50;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '60%'")
    public MobileElement LIDProgress60;

    @AndroidFindBy(id = "wow_starburst_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther")
    public MobileElement enectarpointsThumbnail;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name=\"Verification Required\"]")
    public MobileElement VerificationRequiredPopupTitle;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'start'")
    public MobileElement start_Fueling_Icon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'User Profile'")
    public MobileElement UserProfileTitleProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Accepted Privacy Policy and Terms and Conditions'")
    public static MobileElement PpAndTcProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Email Verified'")
    public MobileElement EmailVerifiedProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Set First and Last Name'")
    public static MobileElement SetFirstnameProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public static MobileElement MobileProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'Payment Method'")
    public MobileElement PaymentTitleProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'Loyalty Onboarding'")
    public MobileElement LoyaltyTitleProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'Email Settings'")
    public MobileElement EmailTitleProfie;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'Permissions'")
    public MobileElement PermissionsTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Location Services'")
    public MobileElement LocationServicesProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Notifications'")
    public static MobileElement NotificationsProfile;

    @AndroidFindBy(id = "account_add_card")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Card'")
    public MobileElement add_card_button;

    @AndroidFindBy(id = "account_privacy_link")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Push Notifications'")
    public static MobileElement NectarCardSectionAccount;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'CONTINUE'")
    public MobileElement payment_Pin_Continue_Btn;

    @AndroidFindBy(id = "edit_payment_delete_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Delete Card'")
    public MobileElement deleteButtonEditPaymentMethod;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public MobileElement pin_Confirm_Ok_Btn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Delete'")
    public MobileElement DeletePopupButtonDebitCard;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Fuel']")
    @iOSXCUITFindBy(id = "Fuel")
    public MobileElement fuel;
    
    @AndroidFindBy(id = "complete_profile_txt")
    @iOSXCUITFindBy(id = "Fuel")
    public MobileElement Profile40completion;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    @AndroidFindBy(id = "offers_checkBox")
    public MobileElement emailPreference_accept_checkbox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='successImage']")
    public MobileElement emailpreference_success_image;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Tell us what')]")
    @AndroidFindBy(id = "email_pref_title")
    public MobileElement emailPreference_tellustext;

    @AndroidFindBy(id = "preference_continue_btn")
    public MobileElement emailcontinue;

}