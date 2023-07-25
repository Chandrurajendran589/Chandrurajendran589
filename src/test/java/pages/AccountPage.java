package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

public class AccountPage extends GenericWrappers {
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Settings\"])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement Mobilesetting;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Help']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement Apps;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso_QA']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement EssoQA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Permissions']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement Permissions;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OFF']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement Cameraon;
	
	@AndroidFindBy(id = "password_validation_txt")
	@iOSXCUITFindBy(id = "Password should contain at least 8 characters, an uppercase letter, a lowercase letter, and one number or special character")
//	public MobileElement InvalidPasswordValidationMsg;
//	@AndroidFindBy(id = "new_password_EditText")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public MobileElement AccountNewPassword;
	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "Skip")
	public MobileElement AccountSkip;
	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Login Notification'")
	public static MobileElement Alertitle;
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[1][@text='Notifications']")
	public MobileElement SettingNotify;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")
	public MobileElement SettingNotifyOff;
	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE']")
	public MobileElement ContinueBtn;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Don’t Allow']")
	public MobileElement DontAllow;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Cancel'])[1]")
	public MobileElement DisabledCancel;
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow']")
	public MobileElement AllowPopup;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public MobileElement okBtn;
	@AndroidFindBy(id = "dismiss_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'GOT IT'")
	public MobileElement EmailInfoX;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleCheck']")
	@AndroidFindBy(id = "account_receipt_checkBox")
	public MobileElement ReceiptCKbx;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/following::XCUIElementTypeButton[@name='circleCheck']")
	public MobileElement promotionsCircleCheck_box;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleUnCheck']")
	public MobileElement emailUnCircleCheck_box;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/following::XCUIElementTypeButton[@name='circleUnCheck']")
	public MobileElement promotionsUnCircleCheck_box;
	@AndroidFindBy(id = "dashboard_already_registered")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Login!'")
	public static MobileElement AccountLogin;

	@AndroidFindBy(id = "login_email_editText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
	public static MobileElement AccountEmail;

	@AndroidFindBy(id = "login_passWord_editText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
	public MobileElement AccountPassword;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public MobileElement AccountMore;
	@AndroidFindBy(id = "login_Btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'LOGIN'")
	public static MobileElement AccountLoginBtn;
	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_reject")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'LOGIN'")
	public MobileElement LoginNever;
	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
	public static MobileElement LoginSave;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Products & Information']")
	@iOSXCUITFindBy(id = "Products & Information")
	public MobileElement ProductsAndInformation;
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(id= "Enter Nectar Card Details")
	public MobileElement FirstFuelheader;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Register']")
	public MobileElement register_title;

	@AndroidFindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='LOG IN']")
	public MobileElement loginOkBtn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement AccountBtn;
	@AndroidFindBy(id = "forgot_pwd_tv")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement Forgetpass;
	@AndroidFindBy(id = "forgot_password_email_edit")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement Forgetmail;
	@AndroidFindBy(id = "forgot_password_email_edit")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement Resetmsg;
	@AndroidFindBy(id = "forgot_password_continue_btn")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement send;
	@iOSXCUITFindBy(id = "Fuel")
	public MobileElement FuelScr;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='start']")
	public MobileElement Start;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SCAN QR CODE']")
	public MobileElement ScanQRCode;
	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='acc info icon'])[2]")
	public MobileElement AccountInfoIcon;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//XCUIElementTypeStaticText~xpath")
	public MobileElement AccountMessage;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement AccountOkBtn;
	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Privacy Policy'")
	public MobileElement AccountPrivacyPolicy;
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Privacy Policy'")
	public MobileElement 	HeadTxt;
	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Cancel and return to ESSO\"]")
	public MobileElement PrivacyCloseBtn;
	@AndroidFindBy(id = "toolbar")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy Policy']")
	public MobileElement PrivacyPolicyElement;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms and Conditions']")
	public MobileElement TermsAndConditionElement;
	@AndroidFindBy(id = "account_terms_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Terms and'")
	public static MobileElement TermsACondition;
	@AndroidFindBy(id = "account_logout")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'LOG OUT'")
	public static MobileElement LogOut;
	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Good')]")
	public MobileElement LogOutPage;
	@AndroidFindBy(id = "account_name_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[2]")
	public MobileElement UserEdit;
	@AndroidFindBy(id = "editFirstName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement EditFname;
	@AndroidFindBy(id = "lastName_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement EditLname;
	@AndroidFindBy(id = "edit_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'DONE'")
	public MobileElement EditUpdate;
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'OK'")
	public MobileElement EditOK;
	@AndroidFindBy(id = "account_user_fullname")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public MobileElement AccountFullName;
	@AndroidFindBy(id = "account_info_icon")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[1]")
	public MobileElement EmailInfoIcon;
	@AndroidFindBy(id = "account_info_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]")
	public MobileElement EmailInfo;
	@iOSXCUITFindBy(id = "Changes saved. You will now receive emails from Esso about topics that may interest you, promotions and Nectar offers.")
	public MobileElement Promotion_OPT_IN_POpup;
	@iOSXCUITFindBy(id = "Changes saved. You will no longer receive emails from Esso about topics that may interest you, promotions and Nectar offers.")
	public MobileElement Promotion_OPT_OUT_POpup;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Changes saved. You will now receive receipts via email.']")
	public MobileElement mailOPTPopUP;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Changes saved. You will no longer')]")
	public MobileElement mailOPTOUTPopUP;
	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[3]")
	public static MobileElement PasswordEdit;
	@iOSXCUITFindBy(id = "Done")
	public MobileElement KayDone;
	@AndroidFindBy(id = "edit_password__done_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'DONE'")
	public MobileElement PassWordDone;
	@AndroidFindBy(id = "password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Password should contain at least 8 characters')]")
	public MobileElement NewPasswordError;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Password should contain at least 8 characters')]")
	public MobileElement Accountct;
	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static MobileElement CurrentPassword;
	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public MobileElement NewPassword;
	@AndroidFindBy(id = "confirm_new_pasword_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static MobileElement ConfirmPassword;
	@AndroidFindBy(id = "current_password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter current password']")
	public MobileElement CurrentPassError;
	@AndroidFindBy(id = "current_password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter current password']")
	public MobileElement IncorrectPassErrorMessage;
	public MobileElement StarRewards;
	@AndroidFindBy(id = "account_preauth_edit")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum Fuelling Amount']/preceding:: XCUIElementTypeButton[@name='Edit'][1]")
	public static MobileElement MaxFuelEditLk;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='test_number_picker_view']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Privacy Policy']")
	public MobileElement MaxFuelAmt;
	@AndroidFindBy(id = "defaultpicket_ok_btn")
	@iOSXCUITFindBy(id = "Done")
	public static MobileElement MaxFuelOK;
	@AndroidFindBy(id = "defaultpicket_cancel_btn")
	@iOSXCUITFindBy(id = "Cancel")
	public MobileElement MaxFuelCncl;
	@AndroidFindBy(id = "preauth_amount")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum Fuelling Amount']")
	public MobileElement MaxFuelAmtCk;
	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='acc info icon'])[2]")
	public MobileElement MaxFuelInfo;
	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public MobileElement MaxFuelInfoTxt;
	@AndroidFindBy(id = "location_service_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public MobileElement LocSrcSwitch;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public MobileElement LocAllow;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Your password has been'")
	public MobileElement LocCpyTXT;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public MobileElement LocDeny;
	@AndroidFindBy(id = "camera_access_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public MobileElement CamSwitch;
	@AndroidFindBy(id = "validations_tick1_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]")
	public MobileElement PassValidationTick1;
	@AndroidFindBy(id = "validations_tick2_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")
	public MobileElement PassValidationTick2;
	@AndroidFindBy(id = "validations_tick3_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[3]")
	public MobileElement PassValidationTick3;
	@AndroidFindBy(id = "validations1")
	@iOSXCUITFindBy(id = "At least 8 characters")
	public MobileElement PassValidation1;
	@AndroidFindBy(id = "validations2")
	@iOSXCUITFindBy(id = "Contains upper and lower case")
	public MobileElement PassValidation2;
	@AndroidFindBy(id = "validations3")
	@iOSXCUITFindBy(id = "Contains numbers or special character")
	public MobileElement PassValidation3;
	@AndroidFindBy(id = "selected_card_tickmark")
	public MobileElement CardTick;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='ADD PAYMENT METHOD']")
	public MobileElement PaymentMtdBtn;
	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Add PayPal'")
	public MobileElement PaypalBtn;
	@AndroidFindBy(id = "header_back_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBack\"]")
	public MobileElement BackBtn;
	@AndroidFindBy(id = "AcctEmail")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public MobileElement AcctEmail;
	@AndroidFindBy(id = "account_info_layout")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[1]")
	public MobileElement AcctLayOut;
	@AndroidFindBy(id = "account_camera_access_title")
	public MobileElement AcctCam;
	@AndroidFindBy(id = "crind_receipt_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'No Paper'")
	public MobileElement AcctRecipt;
	@AndroidFindBy(id = "account_receipt_msg")
	@iOSXCUITFindBy(xpath = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'I would like to receive receipts '")
	public MobileElement AcctRctMsg;
	@AndroidFindBy(id = "account_paycard_default")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Choose Default Method']")
	public MobileElement DefPayMtd;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='test_number_picker_view']")
	@iOSXCUITFindBy(id = "Default Method")
	public MobileElement DefPayPick;
	@AndroidFindBy(id = "defaultpicket_cancel_btn")
	@iOSXCUITFindBy(id = "Done")
	public MobileElement DefPayCncl;
	@AndroidFindBy(id = "account_news_checkBox")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']")
	public MobileElement OfferCheck;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Location Services']")
	public MobileElement LocationServicesAcc;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Go To Settings\"])[1]")
	public MobileElement NotifGoToSettings;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Notifications']")
	public MobileElement NotificationScroll;
	@AndroidFindBy(id = "location_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Location Services']/following::XCUIElementTypeStaticText[@name='OFF'][1]")
	public MobileElement LocationOFF;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ALLOW ESSO-QA TO ACCESS']")
	public MobileElement PermissionScrn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App notifications']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Notifications')]")
	public static MobileElement NotificationSettin;
	@AndroidFindBy(id = "com.android.settings:id/switch_widget")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name='Allow Notifications']")
	public static MobileElement NotifAllow;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Esso-QA']")
	public MobileElement GoSettings;
	@AndroidFindBy(id = "ss")
	@iOSXCUITFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Offers\"]")
	public MobileElement StationFinder;
	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	public MobileElement CancelBtn;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NavBack']")
	public MobileElement NavBck;
	@AndroidFindBy(id = "camera_access_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Camera Access']/following::XCUIElementTypeStaticText[@name='ON'][1]")
	public MobileElement CameraON;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Camera Access']/following::XCUIElementTypeButton[@name='Go To Settings'][1]")
	public MobileElement CameraGotoSettings;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name='Camera']")
	public MobileElement CameraAccess;
	@AndroidFindBy(id = "account_info_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='User Profile']/following::XCUIElementTypeButton[@name='acc info icon'][1]")
	public MobileElement UserProfileLink;
	@AndroidFindBy(id = "account_user_email")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='praveenkumar.s1@photon.in']")
	public MobileElement EmailField;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'This email is used to set')]")
	public MobileElement EmailCT;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Edit Password']")
	public MobileElement EdtPasswordScr;
	@AndroidFindBy(id = "current_password_showHide_btn")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Info'])[1]")
	public MobileElement currentPwdShw;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	@AndroidFindBy(id = "header_left_txt")
	public MobileElement PwdCancelBtn;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Account']")
	public MobileElement AccountScrn;
	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Info'])[1]/ancestor::XCUIElementTypeTextField[1]")
	public MobileElement Currpassshwfield;
	@AndroidFindBy(id = "validations_tick1_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='At least 8 characters']/following::XCUIElementTypeImage[1]")
	public MobileElement Tick1;
	@AndroidFindBy(id = "validations_tick2_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Contains upper and lower case']/following::XCUIElementTypeImage[1]")
	public MobileElement Tick2;
	@AndroidFindBy(id = "validations_tick3_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Contains numbers or special character']/following::XCUIElementTypeImage[1]")
	public MobileElement Tick3;
	@AndroidFindBy(id = "com.android.settings:id/app_snippet")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Contains numbers or special character']/following::XCUIElementTypeImage[1]")
	public MobileElement AppInfo;
	@AndroidFindBy(id = "confirm_password_validation_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'The passwords entered do not match.'")
	public MobileElement DiffPwdCT;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Current password entered is incorrect')]")
	public MobileElement CurrPassInvldMsg;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Due to security reasons')]")
	public MobileElement CurrPassInvldMsg2;
	@AndroidFindBy(id = "current_password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter current password']")
	public MobileElement CurrPassEmptyMsg;
	@AndroidFindBy(id = "password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter new password']")
	public MobileElement NewPassEmptyMsg;
	@AndroidFindBy(id = "confirm_password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please confirm your new password']")
	public MobileElement ConfrmPassEmptyMsg;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Full name successfully updated.']")
	public MobileElement NameEditSuccessMsg;
	@AndroidFindBy(id = "account_user_fullname")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Full name']/following::XCUIElementTypeStaticText[1]")
	public MobileElement FullName;
	@AndroidFindBy(id = "location_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Location Services']/following::XCUIElementTypeButton[@name='Go To Settings'][1]")
	public MobileElement LocGoToSettings;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Location')]")
	public MobileElement LocSettings;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@name,'While')]")
	public MobileElement LocSettingsAlways;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Esso-QA']")
	public MobileElement SettingsBack;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'While')]")
	public MobileElement LocSettingsAlwaysEnabled;
	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum Fuelling Amount']/following::XCUIElementTypeButton[@name='acc info icon'][1]")
	public MobileElement FuelingInfo;
	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'This is the amount')]")
	public MobileElement FuelingInfoTxt;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"There are now over 1,000 First Fuel sites in the US selling high quality First Fuel fuels. We offer products and services for both business and consumer use.\"]")
	public MobileElement Product;

	@AndroidFindBy(id = "account_nectar_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Push Notifications'")
	public static MobileElement AccountNectarCardSection;
	@AndroidFindBy(id = "account_nectar_edit")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Delete'")
	public static MobileElement AccountNectarCardAdded;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Delete'")
	public static MobileElement AccountDeleteNectarPopup;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'OK'")
	public static MobileElement NectarDeleteSuccessfulPopup;
	@AndroidFindBy(id = "account_add_nectarcard")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Add Nectar card'")
	public static MobileElement AccountAddNectarCardButton;
	@AndroidFindBy(id = "account_nectar_desc")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'You can collect Nectar'")
	public MobileElement AccountAddNectarCardSectionCT;
	@AndroidFindBy(id = "add_loyalty_entry_edit")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Card number'")
	public static MobileElement NectarCardnumberEnter;
	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Done'")
	public static MobileElement DoneButtonInNectarKeypad;
	@AndroidFindBy(id = "add_loyalty_done_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'NEXT'")
	public static MobileElement NextButtonNectarCardAddScreen;
	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Verify later'")
	public static MobileElement AccountNectarCardVerifyLaterPopup;
	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Skip'")
	public static MobileElement AccountNectarVerifyLaterSkip;
	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
	public static MobileElement AccountNectarCardWithStars;
	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Continue'")
	public static MobileElement AccountNectarCardContinuePopup;
	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value == 'Done'")
	public static MobileElement HideKeyPadMobileRegistration;
	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public static MobileElement CloseButtonModalPopupLid;
	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
	public static MobileElement NotNowButtonLID;
	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£100\"]")
	public static MobileElement FuellingAmountAccount;
	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£100\"]")
	public static MobileElement Close;
	@AndroidFindBy(id = "account_preauth_edit")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Edit\"]")
	public static MobileElement MaxFuelEditLkiOS;
	@AndroidFindBy(id = "paypal_account_emailid")
	@iOSXCUITFindBy(xpath = "Locator Needed")
	public static MobileElement PaypalEmail;

	public AccountPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
