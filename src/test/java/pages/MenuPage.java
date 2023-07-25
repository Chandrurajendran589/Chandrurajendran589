package pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class MenuPage extends GenericWrappers {
	public MenuPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "login_email_editText")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' AND value== 'Email'")
	public MobileElement FFEmail;

	@AndroidFindBy(id = "login_passWord_editText")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeSecureTextField' AND value== 'Password'")
	public MobileElement FFPassword;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"There are now over 1,000 First Fuel sites in the US selling high quality First Fuel fuels. We offer products and services for both business and consumer use.\"]")
	public MobileElement Product1;

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	@iOSXCUITFindBy(id = "Station")
	public MobileElement Essopop;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Back']")
	@iOSXCUITFindBy(id = "NavBack")
	public static MobileElement Backbutton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Help']")
	@iOSXCUITFindBy(id = "Help")
	public MobileElement Help;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Fuel']")
	@iOSXCUITFindBy(id = "Fuel")
	public MobileElement fuel;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public MobileElement more;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Offers']")
	@iOSXCUITFindBy(id = "Offers")
	public MobileElement action_offer;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public MobileElement action_history;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[2][@text='PAY INSIDE']")
	@iOSXCUITFindBy(id = "PAY INSIDE")
	public MobileElement Payinsidebutton;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1][@text='PAY OUTSIDE']")
	@iOSXCUITFindBy(id = "PAY OUTSIDE")
	public MobileElement Payoutsidebutton;

	@AndroidFindBy(id = "largeLabel")
	@iOSXCUITFindBy(id = "Fuel")
	public MobileElement TabFuel;


	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public static MobileElement CloseButtonModalPopupLid;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(id = "Station")
	public MobileElement TabStation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(id = "Station")
	public MobileElement FFbutton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Offers\"]")
	@iOSXCUITFindBy(id = "Offers")
	public MobileElement Taboffers;

	@AndroidFindBy(id = "dashboard_start_option_inner_img")
	@iOSXCUITFindBy(id = "start")
	public MobileElement start_fueling_icon_NLID;

	@AndroidFindBy(id = "action_more")
	@iOSXCUITFindBy(id = "More")
	public MobileElement TabMore;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public MobileElement TabHistory;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'CONTINUE'")
	public static MobileElement AllowLocContinueButton;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Allow Location'")
	public List<MobileElement> AllowLocationScreen;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow Once'")
	public MobileElement PermissionallowButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement stationFinderScreenTxt;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement OffersScreenTitle;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Transaction History'")
	public MobileElement HistoryScreenTitle;

	@AndroidFindBy(id ="android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement OkButton;

	@AndroidFindBy(id = "dashboard_already_registered")
	@iOSXCUITFindBy(xpath = "//android.widget.Button[contains(@resource-id,'button1')]")
	public MobileElement HeadTxt;

	@AndroidFindBy(id = "dashboard_already_registered")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'Login!'")
	public static MobileElement AccountLogin;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Allow Location'")
	public static MobileElement FFheadertext;

	@AndroidFindBy(id = "location_setting_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Let us locate'")
	public MobileElement FFCopytext;

	@AndroidFindBy(id = "linkEnableGps")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public MobileElement FFTurnonLoc;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Then see which'")
	public MobileElement FFdirectiontext;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tell a Friend']")
	@iOSXCUITFindBy(id = "Tell a Friend")
	public MobileElement ReferAfriend;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Tell a Friend'")
	public MobileElement ReferAfriendtitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Products & Information']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Products & Information\"]")
	public MobileElement ProductsAndInformation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id = "Account")
	public MobileElement AccountBtn;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(id = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow Once'")
	public static MobileElement AllowOncePopup;

	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow While'")
	public static MobileElement AllowWhilePopup;

	@AndroidFindBy(id = "permission_deny_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Don't Allow'")
	public static MobileElement DontAllowPopup;

	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Cancel\"]")
	public static MobileElement DontallowCancel;

	@iOSXCUITFindBy(xpath =" \t\n" +
			"//XCUIElementTypeButton[@name=\"Settings\"]" )
	public static MobileElement DontAllowSettings;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'When you arrive at'")
	public static MobileElement AllowPopupHeader;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Location permission selected'")
	public static MobileElement LocationPermissionSuccessScreen;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'CONTINUE'")
	public static MobileElement LocationPermissionContinueButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get exclusive offers\"]")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Get exclusive offers\"]")
	public MobileElement OffersScreenWithoutVerify;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(id = "CONTINUE")
	public MobileElement Continue;

	@AndroidFindBy(id = "permission_allow_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow'")
	public MobileElement Allowaccess;

	@AndroidFindBy(id = "permission_deny_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow'")
	public MobileElement DontAllow;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please log into your'")
	public MobileElement loginpopop;

	@AndroidFindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[@text=\"OK\"]")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement okbutton;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'LOGIN'")
	public MobileElement headerloginpage;

	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='New password']")
	public MobileElement NewPassword;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement exxon_Help_feedback_Promtmsgok;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso App Tutorial']")
	@iOSXCUITFindBy(id = "Esso App Tutorial")
	public MobileElement Esso_Help_App_Tutorial;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Frequently Asked Questions']")
	@iOSXCUITFindBy(id = "Frequently Asked Questions")
	public MobileElement FDHelp_FAQ;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Call']")
	@iOSXCUITFindBy(id = "Call")
	public MobileElement FDHelp_Call;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso App Feedback']")
	@iOSXCUITFindBy(id = "Esso App Feedback")
	public MobileElement FDHelp_Feedback;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='YouTube']")
	@iOSXCUITFindBy(id = "YouTube")
	public MobileElement FDYoutube_link;

	@AndroidFindBy(id = "how_to_use_app_text")
	@iOSXCUITFindBy(id = "How to set up the Esso App.")
	public MobileElement FDHelp_Youtube_howtosetupFFApp;

	@AndroidFindBy(id = "how_to_setup_app_text")
	@iOSXCUITFindBy(id = "How to use the Esso App.")
	public MobileElement FDHelp_Youtube_howtouseFFApp;

	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Speak to a customer representative.']")
	@iOSXCUITFindBy(id = "Speak to a customer representative.")
	public MobileElement CallText;

	@AndroidFindBy(id = "help_section_subtext")
	@iOSXCUITFindBy(id = "Normal call rates apply.")
	public MobileElement CallTextNormal;

	@AndroidFindBy(xpath = "//android.widget.TextView[1][@text='Call']")
	@iOSXCUITFindBy(id = "Call")
	public MobileElement Call;

	@AndroidFindBy(xpath = "//android.widget.Button[2][@text='CALL']")
	@iOSXCUITFindBy(id = "Call")
	public MobileElement Callbutton;

	@AndroidFindBy(xpath = "//android.widget.Button[2][@text='CALL']")
	@iOSXCUITFindBy(id = "Cancel")
	public MobileElement Cancelbutton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'NEXT'")
	public MobileElement exxon_Help_Tutorial_NextBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='GET STARTED']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'GET STARTED'")
	public MobileElement exxon_Help_Tutorial_GetStartedBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Send us your questions or thoughts.']")
	@iOSXCUITFindBy(id = "Send us your questions or thoughts.")
	public MobileElement FDHelp_Email_Text;

	@AndroidFindBy(xpath = "//android.widget.TextView[1][@text='Email']")
	@iOSXCUITFindBy(id = "Email")
	public MobileElement FDHelp_Email_Navigation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Compose']")
	@iOSXCUITFindBy(id = "toField")
	public MobileElement FDHelp_Email_Validation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Frequently Asked Questions']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequently Asked Questions']")
	public MobileElement FD_FAQ_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How the app works']")
	@iOSXCUITFindBy(id = "How the app works")
	public MobileElement FDFAQ_How;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Safety and Security']")
	@iOSXCUITFindBy(id = "Safety and Security")
	public MobileElement FDFAQ_sfty;

	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Payments & Billing']")
	@iOSXCUITFindBy(id = "Payments & Billing")
	public MobileElement FDFAQ_pay;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Loyalty Points']")
	@iOSXCUITFindBy(id = "Loyalty Points")
	public MobileElement FDFAQ_Loyalty;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Benefits of Using the Esso App']")
	@iOSXCUITFindBy(id = "Benefits of Using the Esso App")
	public MobileElement FDFAQ_Benefitsofusing;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Technical']")
	@iOSXCUITFindBy(id = "Technical")
	public MobileElement FDFAQ_Technical;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Communications & Data Privacy']")
	@iOSXCUITFindBy(id = "Communications & Data Privacy")
	public MobileElement FDFAQ_Communications;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[5]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "First Fuel App Feedback")
	public MobileElement exxon_Help_feedback_Logo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Give Us More Feedback']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Give Us More Feedback'")
	public MobileElement FDFF_MoreFeedback;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[4]")
	public MobileElement exxon_Help_feedback_firstAllStars;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[3]")
	public MobileElement exxon_Help_feedback_SecondAllStars;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[2]")
	public MobileElement exxon_Help_feedback_ThirdsAllStars;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[5]")
	public MobileElement exxon_Help_feedback_fourthAllStars;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SEND FEEDBACK']")
	@iOSXCUITFindBy(id = "SEND FEEDBACK")
	public MobileElement exxon_Help_feedback_submit;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement exxon_Help_feedback_Ok;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[4]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='starDisable'])[4]")
	public MobileElement exxon_Help_feedback_FourthAllStars_Scr2;

	@AndroidFindBy(id = "app_store_survey_msg")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[2]")
	public MobileElement FD_Help_app_store_survey_msg;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='FirstFuel Logo']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage")
	public MobileElement Help_Feedback_Logo;

	@AndroidFindBy(id = "survey_header_tv")
	@iOSXCUITFindBy(id = "Help Us Improve")
	public MobileElement Help_Feedback_Improve;

	@AndroidFindBy(id = "survey_msg")
//	@iOSXCUITFindBy(id = "Hey TEST, how well did the Esso App work for you today?")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name ENDSWITH 'App work for you today?'")
	public MobileElement Help_Feedback_Screen;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='starDisable'])[3]")
	public MobileElement exxon_Help_feedback_ThirdAllStars_Scr2;

	@AndroidFindBy(id= "app_store_survey_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sorry to hear that TEST. Would you give us some quick feedback so we can try to improve your app experience?']")
	public MobileElement exxon_Help_feedback_surveymsg;

	@AndroidFindBy(id= "app_store_survey_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sorry to here that First1. Would you give us some quick feedback so we can try to improve your app experience?']")
	public MobileElement exxon_Help_feedback_surveymsg1;

	@AndroidFindBy(id= "btnNotNow")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Not Now']")
	public MobileElement exxon_Help_feedback_Notnow;

	@AndroidFindBy(id = "btnYes")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Yes']")
	public MobileElement exxon_Help_feedback_Yes;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Improve the Esso App']")
	public MobileElement exxon_Help_feedback_fourthscreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your customers will be able to rate the app once available in the play store.']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='App Not Available']")
	public MobileElement exxon_Help_feedback_Promtmsg;


	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]\r\n")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'SEND FEEDBACK'")
	public MobileElement exxon_Help_feedback_SendFeedbacktnx;

	@AndroidFindBy(id = "edit_payment_done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SEND FEEDBACK']")
	public MobileElement exxon_Help_feedback_SendFeedbackBtn;

	@AndroidFindBy(id = "lbl_comment")
	@iOSXCUITFindBy(id = "What could we do to improve your experience? (optional)")
	public MobileElement exxon_Help_feedback_Improve_Your;

	@AndroidFindBy(id = "edit_comment")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
	public MobileElement exxon_Help_feedback_textbox;

	@AndroidFindBy(id = "edit_comment_count")
	@iOSXCUITFindBy(id = "0/140")
	public MobileElement exxon_Help_feedback_Charcter;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Thanks for your feedback.")
	public MobileElement exxon_Help_feedback_Promtmsgtnx;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Improve the Esso App'")
	public MobileElement exxon_Help_feedback_title;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Close'")
	public MobileElement exxon_Help_feedback_Close;

	@AndroidFindBy(id = "feedback_header")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Please rate the following statements.'")
	public MobileElement exxon_Help_feedback_Plsratemsgheader;

	@AndroidFindBy(xpath= "//android.widget.TextView[@text='My fuelling experience was easy']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'My fuelling experience was easy'")
	public MobileElement exxon_Help_feedback_Myfuellingexperience;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='It saves me time']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'It saves me time'")
	public MobileElement exxon_Help_feedback_savestime;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My digital receipts are helpful']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'My digital receipts are helpful'")
	public MobileElement exxon_Help_feedback_Digitalreceipts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Esso App works well, with no errors']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'My Esso App works well, with no errors'")
	public MobileElement exxon_Help_feedback_EssoAppworks;

	@AndroidFindBy(id = "header_logo")
	@iOSXCUITFindBy(id = "tutorialHeader")
	public MobileElement homeBtn;

	@AndroidFindBy(id = "header_back_btn")
	@iOSXCUITFindBy(id = "NavBack")
	public MobileElement BackBtn;

	@AndroidFindBy(id = "header_back_image_btn")
	@iOSXCUITFindBy(id = "NavBack")
	public MobileElement tansaction_BackBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add Note')]")
	@iOSXCUITFindBy(id = "Note")
	public MobileElement AddNoteLink;

	@AndroidFindBy(id = "dashboard_login_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'LOG IN'")
	public MobileElement LoginBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Transaction Details')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Transaction Details'")
	public MobileElement TransactionDetailsScreenTitle;

	@AndroidFindBy(id = "transaction_childItemLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement TransactionHistoryInfo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public MobileElement historyBtn;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]")
	public MobileElement TransactionHistoryTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select']")
	@iOSXCUITFindBy(id = "Select")
	public MobileElement selectButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Receipt']")
	@iOSXCUITFindBy(id = "Email Receipt")
	public MobileElement emailReceipt;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id,'receipt_checkBox')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeApplication[@name=\"First Fuel\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage\n")
	public MobileElement transactionCheckBox;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "Email Receipt")
	public MobileElement emailReceiptButton;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Receipt(s) sent via email.")
	public MobileElement emailReceiptMessage;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement okBtn;

	@AndroidFindBy(id = "transaction_days")
	@iOSXCUITFindBy(id = "Last 90 days")
	public MobileElement day90s;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public MobileElement TransAmt;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement TransDate;

	@AndroidFindBy(id = "transaction_childItemLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement TransDtl;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public MobileElement TransHead;

	@AndroidFindBy(id = "fuelLayout")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
	public MobileElement FuelDtls;

	@AndroidFindBy(id = "imageView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='After making a fuel purchase you can view your transaction history, notes and VAT receipts here.']")
	public MobileElement NoHistory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='emailSelect.png'])[1]")
	public MobileElement SelectCkbx;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(id = "Receipts sent via email.")
	public MobileElement PopMsg;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement PopOk;

	@AndroidFindBy(id = "full_receipt_add_note")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton/XCUIElementTypeStaticText")
	public MobileElement AddNote;

	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='View']")
	public MobileElement VatView;

	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(id = "ShareICon")
	public MobileElement ShareBTN;

	@AndroidFindBy(id = "add_note_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextView")
	public MobileElement Notetxt;

	@AndroidFindBy(id = "add_note_save_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SAVE']")
	public MobileElement NoteSave;

	@AndroidFindBy(id = "note_details")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement NoteWithEsso;

	@AndroidFindBy(id = "account_email_setting_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Email Settings'")
	public MobileElement Account_Emailsetting;

	@AndroidFindBy(id = "account_receipt_checkBox")
	@iOSXCUITFindBy(xpath = "locator needed")
	public MobileElement Account_Recipetcheckbox;

	@AndroidFindBy(id = "account_news_checkBox")
	@iOSXCUITFindBy(xpath = "locator needed")
	public MobileElement Account_Receiveemailcheckbox;

	@AndroidFindBy(id = "account_receipt_msg")
	@iOSXCUITFindBy(id = "I would like to receive receipts by email.")
	public MobileElement Account_Recipetmailmsg;

	@AndroidFindBy(id = "account_newsletter_msg")
	@iOSXCUITFindBy(id = "I’d like to receive emails from Esso about topics that may interest me, promotions and Nectar offers.")
	public MobileElement Account_Receivemsg;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Settings\"])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public MobileElement Mobilesetting;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Apps & notifications']")
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

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Account'")
	public MobileElement AccountTitle;

	@AndroidFindBy(id = "account_user_profile_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'User Profile'")
	public static MobileElement UserProfileAccount;

	@AndroidFindBy(id = "account_user_name")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Full name'")
	public MobileElement FullNameAccount;

	@AndroidFindBy(id = "account_user_password")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Password'")
	public MobileElement PasswordAccount;

	@AndroidFindBy(id = "account_user_mobile_number")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Mobile number'")
	public MobileElement MobileNumberAccount;

	@AndroidFindBy(id = "account_secure_pin")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Esso PIN'")
	public MobileElement EssoPinAccount;

	@AndroidFindBy(id = "account_paycard_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Payment Method'")
	public MobileElement PaymentMethodAccount;

	@AndroidFindBy(id = "account_preauth_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
	public static MobileElement MfaTitleAccount;

	@AndroidFindBy(id = "account_nectar_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'Esso Nectar'")
	public MobileElement EssoTitleAccount;

	@AndroidFindBy(id = "account_location_service_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Location Services'")
	public MobileElement LocationTitleAccount;

	@AndroidFindBy(id = "account_notification_service_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Push Notifications'")
	public static MobileElement NotificationsTitleAccount;

	@AndroidFindBy(id = "account_camera_access_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Camera Access'")
	public MobileElement CameraTitleAccount;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Touch ID'")
	public MobileElement TouchIDTitleAccount;

	@AndroidFindBy(id = "account_email_setting_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Email Settings'")
	public MobileElement EmailSettingsTitleAccount;

	@AndroidFindBy(id = "account_terms_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Terms and Conditions'")
	public MobileElement TCLinkAccount;

	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Privacy Policy'")
	public MobileElement PPLinkAccount;

	@AndroidFindBy(id = "account_logout")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'LOG OUT'")
	public static MobileElement LogOut;

	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'REGISTER AN ACCOUNT'")
	public MobileElement DashRegstr;

	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Continue'")
	public MobileElement ContinuePaypalButton;

	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Cancel'")
	public MobileElement CancelPaypaPageButton;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Add PayPal'")
	public MobileElement PaypalBtn;

	@AndroidFindBy(id = "account_password")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == '••••••••'")
	public MobileElement MaskedPasswordAccountScreen;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[3]")
	public MobileElement PasswordEdit;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Edit Password'")
	public MobileElement EditPasswordTitle;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Please enter current password'")
	public MobileElement CurrentPasswordInlineErrorAccount;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Info\"])[1]")
	public MobileElement FirstShowButton;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Current password entered'")
	public MobileElement CurrentPasswordErrorPopup;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Not Now'")
	public MobileElement UpdatePasswordPopup;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement CurrentPasswordVisible;

	@AndroidFindBy(id = "account_info_layout")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[1]")
	public MobileElement InfoIconUser;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'PayPal'")
	public MobileElement PaypalTextAccount;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Apple Pay'")
	public MobileElement ApplePayTextAccount;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
	public MobileElement DebitCardAccount;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public MobileElement HeadTxtAccount;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "locator needed")
	public MobileElement TandCCloseBtn;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "locator needed")
	public MobileElement TandCTitle;

	@AndroidFindBy(id = "//android.webkit.WebView/android.view.View/android.view.View[1][@text='INFORMATION']")
	@iOSXCUITFindBy(id = "INFORMATION")
	public MobileElement ProductInfoInformation;

	@AndroidFindBy(xpath = "//android.view.View/android.view.View[2][@text='Esso Nectar']")
	@iOSXCUITFindBy(id = "Esso Nectar")
	public MobileElement ProductsAndInfoEssoNectar;

	@AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View[7][@text='About Esso']")
	@iOSXCUITFindBy(id = "About Esso")
	public MobileElement ProductsAndInfoAboutEsso;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(id = "PRODUCTS")
	public MobileElement ProductsAndInfoProducts;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]")
	public MobileElement ProductAboutEsso;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]")
	public MobileElement ProductEssoSynergy;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(id = "Esso Synergy™ Fuels")
	public MobileElement ProductsAndInfoEssoSynergy;

	@AndroidFindBy(xpath = "//android.view.View/android.view.View[5][@text='Mobil Motor Oils']")
	@iOSXCUITFindBy(id = "Mobil Motor Oils")
	public MobileElement ProductsAndInfoMobilMotor;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Info\"])[3]")
	public MobileElement ThirdShowButton;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField	")
	public MobileElement ConfirmPasswordVisible;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Info\"])[2]")
	public MobileElement SecondShowButton;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement NewPasswordVisible;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public MobileElement CurrentPassword;

	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public MobileElement NewPassword1;

	@AndroidFindBy(id = "confirm_new_pasword_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public MobileElement ConfirmPassword;

	@iOSXCUITFindBy(id = "Done")
	public MobileElement KayDone;

	@AndroidFindBy(id = "app_version")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Version'")
	public MobileElement VersionHelp;

	@AndroidFindBy(id = "locator required")
	@iOSXCUITFindBy(id = "Cancel")
	public MobileElement LocationPermissionCancelPopup;

	@AndroidFindBy(id = "validations1")
	@iOSXCUITFindBy(id = "At least 8 characters")
	public MobileElement PassValidation1EditPassword;

	@AndroidFindBy(id = "validations2")
	@iOSXCUITFindBy(id = "Contains upper and lower case letters")
	public MobileElement PassValidation2EditPassword;

	@AndroidFindBy(id = "validations3")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Contains a number'")
	public MobileElement PassValidation3EditPassword;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Go To Settings\"])[1]")
	public MobileElement LocationGotoSettingsAccount;

	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Password must contain'")
	public MobileElement PasswordInlineErrorMessageEditPwd;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Please enter new password'")
	public MobileElement NewPasswordInlineErrorAccount;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	public MobileElement TellAFriendMessageBodyField;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeOther' AND name BEGINSWITH 'Hey, I've been using'")
	public MobileElement TellAFriendMessageBodyFieldWithoutLink;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(id = "Enjoying the Esso App?")
	public MobileElement TellAFriendSubtitle;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(id = "Share the Esso App with your family & friends for a speedy and secure way to pay for their fuel.")
	public MobileElement TellAFriendBody;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'TELL A FRIEND'")
	public MobileElement TellAFriendButtonSendButton;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Messages\"]s")
	public MobileElement TellAFriendMessageButton;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(id = "140/140")
	public MobileElement exxon_Help_feedback_Charcter_Max;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public MobileElement SiteIdHistory;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	public MobileElement DateAndTransaction;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	public MobileElement TransactionAndDate;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(id = "ESSO NECTAR")
	public MobileElement EssoTitleTranscationDetails;

	@AndroidFindBy(id = "note_details")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	public MobileElement NoteWithoutEsso;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleCheck']")
	@AndroidFindBy(id = "account_receipt_checkBox")
	public MobileElement ReceiptCKbx;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/following::XCUIElementTypeButton[@name='circleCheck']")
	public MobileElement promotionsCircleCheck_box;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleUnCheck']")
	public MobileElement emailUnCircleCheck_box;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/following::XCUIElementTypeButton[@name='circleUnCheck']")
	public MobileElement promotionsUnCircleCheck_box;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scan Barcode\"]")
	public MobileElement ScanBarCodeNectarOffers;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CANCEL\"]")
	public MobileElement CancelButtonCameraScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]")
	public MobileElement LocationButtonDeviceSettings;

	@iOSXCUITFindBy(id = "Never")
	public MobileElement NeverButtonDeviceSettings;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(id ="Settings")
	public MobileElement LocSettingStation;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@iOSXCUITFindBy(id = "While Using the App")
	public MobileElement WhileusingButtonDeviceSettings;

	@iOSXCUITFindBy(id = "Help us improve your Esso App experience.")
	public MobileElement EssoFeedbackSubtitle;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Maximum Fuelling Amount\"]/following::XCUIElementTypeStaticText[1]")
	public MobileElement AmountInMfaAccountScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"titleLabel\"]")
	public MobileElement MaximumFuellingTitlePicker;

	@iOSXCUITFindBy(id = "Your default maximum fuelling amount has been updated successfully.")
	public MobileElement MfaSetSuccessfullyPopupAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePicker[@name=\"pickerView\"]/XCUIElementTypePickerWheel/XCUIElementTypeOther[28]")
	public MobileElement ScrollBar;

	@AndroidFindBy(id = "button_accept_all")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'ACCEPT ALL'")
	public static MobileElement AcceptAll;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Settings'")
	public MobileElement SettingsBtnMore;

	@AndroidFindBy(id = "android:id/button2")
	public MobileElement CallcancelButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Loyalty Points']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Loyalty Points']")
	public MobileElement LP;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Will I still earn Nectar points if I use the app?'])[1]")
	public MobileElement LPN;
	
	@AndroidFindBy(id = "list_item_text_child")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name='terms and conditions']")
	public MobileElement FAQLink;
}