package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import stepLibrary.GenericWrappers;
import java.util.List;

public class OffersPage extends GenericWrappers {
	public OffersPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter Postcode or City\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Enter Postcode or City\"]")
	public MobileElement StationSearch;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"London, UK\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"London, UK\"]")
	public MobileElement StationSelect;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement StationContinue;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.Button[starts-with(@text, 'A')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='List Stations']")
	public MobileElement StationAllow;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"List Stations\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"List Stations\"]")
	public MobileElement listStations;

	@AndroidFindBy(id = "rvStationInfo")
	public List<MobileElement> Station1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MRH SHORTLANDS 202 BROMLEY ROAD, BECKENHAM 5109.4 mi \"]")
	@AndroidFindBy(id = "txtMileAndLoc")
	public MobileElement address_Station_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement FirstStation;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List<MobileElement> StationCluster;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"VIEW DETAILS\"]" )
	public MobileElement ViewDetailsBtn;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(id = "Banner close" )
	public MobileElement GotItClose;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GOT IT\"]" )
	public MobileElement GotItBtn;


	@AndroidFindBy(id = "pop_up_imageview")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"promotional_banner\"]")
	public MobileElement StationOfferImg;

	@AndroidFindBy(id = "dashboard_start_option_outer_img")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement LIDCMPLTDASH;

	@AndroidFindBy(id = "title_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Fuel at MRH SHORTLANDS\"]")
	public MobileElement StationOfferTtl;

	@AndroidFindBy(id = "description_text_view")
	@iOSXCUITFindBy(id = "See current promotions and rewards when you log into the app!")
	public MobileElement StationOfferDes;

	@AndroidFindBy(id = "dismiss_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GOT IT\"]")
	public MobileElement StationOfferGotIt;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement StationOfferClose;

	@AndroidFindBy(id = "cancel")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement NoneLogin;

	@AndroidFindBy(id = "dc_logo_white")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement NectarLogo;

	@AndroidFindBy(id = "first_section_lyt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OFFERS\"]")
	public MobileElement OfferLink;

	@AndroidFindBy(id = "how_it_work")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HOW IT WORKS\"]")
	public MobileElement HIW;

	@AndroidFindBy(id = "points_lyt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bonus Points\"]")
	public MobileElement PointsSec;

	@AndroidFindBy(id = "pay_points_lyt")
	@iOSXCUITFindBy(id = "Rewards")
	public MobileElement RewardsSec;

	@AndroidFindBy(id = "pay_points_lyt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify your Nectar card to\"]")
	public MobileElement VerifyNectarCard;

	@AndroidFindBy(id = "list_item_earning_points")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Collect points\"]")
	public MobileElement CollectPtsLnk;

	@AndroidFindBy(id = "NeedLocator")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Find out more about Nectar\"]")
	public MobileElement FindOutMoreNectar;


	@AndroidFindBy(id = "NeedLocator")
	@iOSXCUITFindBy(id = "Get exclusive offers")
	public MobileElement GetExclusiveOffers;

	@AndroidFindBy(id = "NeedLocator")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More about collecting points\"]")
	public MobileElement MoreCollectpoints;

	@AndroidFindBy(id = "earn_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,’COLLECT MORE NECTAR POINTS’)]")
	public MobileElement CollectMoreHead;

	@AndroidFindBy(id = "esso_logo_tm")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeNavigationBar[@name=\"ClientSDK.PLOffersVC\"]/XCUIElementTypeImage")
	public MobileElement EssoTM;

	@AndroidFindBy(id = "see_all_partnr")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,’Find out more about Nectar’)]")
	public MobileElement FindMoreLnk;

	@AndroidFindBy(id = "login_dc_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"ADD NECTAR CARD\"]")
	public MobileElement AddNectarBtn;

	@AndroidFindBy(id = "login_dc_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD NECTAR CARD\"]")
	public MobileElement AddNectarCardBtn;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(id = "Close Icon")
	public static MobileElement CloseButtonModalPopupLid;

	@AndroidFindBy(id = "learn_more_nector")
	@iOSXCUITFindBy(id = "Learn more")
	public MobileElement LIDLearnMore;

	@AndroidFindBy(id = "add_loyalty_entry_edit")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeTextField' AND value == 'Card number'")
	public MobileElement NectarEnter;

	@AndroidFindBy(id = "add_loyalty_done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NEXT\"]")
	public MobileElement NectarNxt;

	@AndroidFindBy(id = "paypal_get_started")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Continue\"]")
	public MobileElement Continue;

	@AndroidFindBy(id = "paypal_get_started")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Verify later\"]")
	public MobileElement VerifyLater;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath="\t\n" +
			"//XCUIElementTypeButton[@name=\"Skip\"]")
	public MobileElement skip_BTN;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Find out more about Nectar\"]")
	public static MobileElement FindMoreHomeLnk;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect and spend Nectar points with hundreds of brands.\"]")
	public MobileElement FindMoreMsgLnk;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nectar card added successfully\"]")
	public MobileElement NectarCardSuccess;

	@AndroidFindBy(id = "pay_with_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PayPal'")
	public MobileElement PayPalButn;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement ContinueNectarCard;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter a Nectar Card number\"]")
	public MobileElement NectarcardInlineError;


	@AndroidFindBy(id = "top_verify_status_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify card\"]")
	public MobileElement VerifyCardTTL;

	@AndroidFindBy(id = "verify_details_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your card number has been added but you must verify it with Nectar to enjoy the benefits of exclusive rewards.\"]")
	public MobileElement VerifyCardDes;

	@AndroidFindBy(id = "verify_check_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"notVerifiedCard\"]")
	public MobileElement VerifyImg;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"VERIFY NOW\"]")
	public MobileElement VerifyNowBtn;

	@AndroidFindBy(id = "tutorial_four_mobile_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[2]")
	public MobileElement TutorialImg;

	@AndroidFindBy(id = "PASSWORD")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement VerifyNectarpass;

	@AndroidFindBy(id = "action_fuel")
	@iOSXCUITFindBy(id = "Fuel")
	public MobileElement Fuel;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='start']")
	public MobileElement payButton;

//	@AndroidFindBy(xpath = "//android.widget.EditText")
//	@iOSXCUITFindBy(xpath = "NeedLocator")
//	public MobileElement OTP;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement LINKAccBtn;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Link your account\"]")
	public MobileElement LinkAccTxt;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Cancel and return to ESSO\"]")
	public MobileElement CancelReturnEssoLink;

	@AndroidFindBy(id = "safe_travel")
	@iOSXCUITFindBy(id = "Safe travels!")
	public MobileElement SafeTravelsTxt;

	@AndroidFindBy(id = "payment_confirmation_drive_text")
	@iOSXCUITFindBy(id = "Your payment was successful.")
	public MobileElement PaymentSuccessTxt;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(id ="Card added successfully, you will start earning points. You need to verify your card to see your exclusive rewards.")
	public MobileElement NectarCardTransTxt;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Transaction Details\"]")
	public MobileElement TransDetailsLink;


	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(id = "Nectar card number")
	public MobileElement NectarCardNumTxt;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Nectar password\"]")
	public MobileElement NectarPasswordTxt;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public MobileElement LinkAccOkBtn;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Your card will not be linked and you won’t be able to spend your Nectar points with ESSO\"]")
	public MobileElement PopUpTxt;

	@AndroidFindBy(id = "nectar_number_text")
	@iOSXCUITFindBy(id = "Verify card")
	public MobileElement VerifyCardTxt;

	@AndroidFindBy(id = "nectar_number_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nectar Card: ****6060\"]")
	public MobileElement NectarCard;

	@AndroidFindBy(id = "loyalty_points")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"POINTS\"]")
	public MobileElement Nectarpoints;

	@AndroidFindBy(id = "account_add_nectarcard")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Nectar card\"]")
	public MobileElement AddNectar;

	@AndroidFindBy(id = "nectar_card_details")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n")
	public MobileElement AccNectarcard;

	@AndroidFindBy(id = "account_nectar_edit")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]\n")
	public MobileElement AccNectardelete;

	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Delete'")
	public MobileElement Deletecnf;

	@AndroidFindBy(id = "nectar_logo_image")
	@iOSXCUITFindBy(id = "dp2NectatNIcon2")
	public MobileElement HCLogo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How to collect points']")
	@iOSXCUITFindBy(id = "How to collect points")
	public MobileElement HCTtl;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "1 litre of fuel")
	public MobileElement HC1;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "£1 spent on shop")
	public MobileElement HC2;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "£1 spent on car wash")
	public MobileElement HC3;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[4]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£1 spent on Mobil car lubricants\"]")
	public MobileElement HC4;

	@AndroidFindBy(id = "load_img3")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement AuthLoader;

	@AndroidFindBy(id = "authorising_please_wait_text")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement AuthHead;

	@AndroidFindBy(id = "authorising_sub_desc_text")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement AuthDes;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[1])[1]")
	public MobileElement VerifyNectarTransdone;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Verify your Nectar card to get exclusive Esso rewards.\"]")
	public MobileElement VerfiyNectarCardTransdone;

	@AndroidFindBy(id = "fueling_pump_cirle_layout")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement FuelingLoader;

	@AndroidFindBy(id = "NeedLocator")
	@iOSXCUITFindBy(id ="Do you have a Nectar card?")
	public MobileElement AddNectarCardText;

	@AndroidFindBy(id = "NeedLocator")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	public MobileElement NectarcomAlert;

	@AndroidFindBy(id = "img_close")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"rewardViewClose\"]")
	public MobileElement HCclose;

	@AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Image")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement NowFuelingLoader;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement StartFuelingNow;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Now fuelling']")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement NowFueling;

	@AndroidFindBy(id = "loyalty_edit")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement LoyaltyEdit;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement ChangePayment;

	@AndroidFindBy(id = "pre_transaction_summary_clubcard_icon")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement CPNectarLogo;

	@AndroidFindBy(id = "pre_transaction_summary_clubcard_title")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement CPNectarTtl;

	@AndroidFindBy(id = "account_your_nectar_collect_review_txt")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement CPNectDes;

	@AndroidFindBy(id = "pre_transaction_summary_add_clubcard")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement CPNectAdd;

	@AndroidFindBy(id = "offers_banner_image_view")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement OffImg;

	@AndroidFindBy(id = "offer_points_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+500 Points Points Points Points Points Points Points Points Points PointsPoints Points PointsPoints\"]")
	public MobileElement OffTTL;

	@AndroidFindBy(id = "offer_desc_tv")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"when you fuel at Esso (test) when you fuel at Esso (test)when you fuel at Esso when you fuel at Esso\"])[2]")
	public MobileElement OffDes;

	@AndroidFindBy(id = "active_coupon_btn")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"View Offer\"])[2]")
	public MobileElement OffLoadBtn;

	@AndroidFindBy(id = "card_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+500 points\"]")
	public MobileElement OffOTTL;

	@AndroidFindBy(id = "offer_desc")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"when you fuel at Esso (test)\"]")
	public MobileElement OffODes;

	@AndroidFindBy(id = "terms_and_conditions_txt")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	public MobileElement OffOTC;

	@AndroidFindBy(id = "view_offer_btn")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"View Offer\"])[1]")
	public MobileElement ViewOffer;

	@AndroidFindBy(id = "note_header")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Banner close\"]")
	public MobileElement ViewOfferClose;

	@AndroidFindBy(id = "note_header")
	@iOSXCUITFindBy(xpath = "How to get this offer")
	public MobileElement OffNoteTTl;

	@AndroidFindBy(id = "offer_no_1")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement OffNoteDes;

	@AndroidFindBy(id = "load_btn")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement OffOLoadBtn;

	@AndroidFindBy(id = "load_btn")
	@iOSXCUITFindBy(id = "Your Nectar card")
	public MobileElement YourNectarCard;

	@AndroidFindBy(id = "load_btn")
	@iOSXCUITFindBy(id = "Tap here to scan")
	public MobileElement TapHere;

	@AndroidFindBy(id = "need locator")
	@iOSXCUITFindBy(id = "POINTS")
	public MobileElement PointsTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Conditions']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"])[2]")
	public MobileElement OffTCTTL;

	@AndroidFindBy(id = "terms_and_conditions_txt")
	@iOSXCUITFindBy(id = "1. Offer valid on the first qualifying transaction after Loading to card 2. Bonus points will only be awarded to the registered account holder of the Nectar card presented at the time of the Qualifying Purchase. 3. Bonus points are non-transferable and there are no cash or prize alternatives available. Your statutory rights are not affected. 4. Points will be awarded within 28 days of offer expiry.")
	public MobileElement OffTCdes;

	@AndroidFindBy(id = "close_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"closeWhiteSmall\"]")
	public MobileElement OffTCClose;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "Save on fuel with points")
	public MobileElement RedemptionSaveTxt;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "rewardViewClose")
	public MobileElement RedemptionViewClose;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "CHOOSE AN OPTION OR CONTINUE")
	public MobileElement RedemptionChooseOption;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "5p/litre Off")
	public MobileElement RedemptionOption1;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "10p/litre Off")
	public MobileElement RedemptionOption2;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "rewardCellClose")
	public MobileElement RedemptionRewardCellClose;

	@AndroidFindBy(id = "loyalty_edit")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit\"])[4]")
	public MobileElement RewardEdit;

	@AndroidFindBy(id = "reward_title")
	@iOSXCUITFindBy(id = "Reward")
	public MobileElement RedemptionReward;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement RedemptionContinue;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "Confirm payment")
	public MobileElement ConfirmPayment;

	@AndroidFindBy(id = "verify_nectar_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your Nectar card\"]")
	public MobileElement ViewNectarCrd;

	@AndroidFindBy(id = "card_number_header")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card number\"]")
	public MobileElement DigiCardHead;

	@AndroidFindBy(id = "card_number")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"****6060\"]")
	public MobileElement DigiCardNum;

	@AndroidFindBy(id = "barcode_img")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage")
	public MobileElement DigiBarcode;

	@AndroidFindBy(id = "note_header")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Never miss out on points again\"]")
	public MobileElement DigiNoteHead;

	@AndroidFindBy(id = "note_desc")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"This digital card can be used instead of your plastic card.\"]")
	public MobileElement DigiNoteTtl;

	@AndroidFindBy(id = "clubcard_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"boxIcon\"]")
	public MobileElement DigiLogo;

	@AndroidFindBy(id = "cross_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"closeWhite\"]")
	public MobileElement DigiClose;

	@AndroidFindBy(id = "card_holder_name")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Sujitha\"]")
	public MobileElement DigiFName;

	@AndroidFindBy(id = "card_holder_last_name")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Sujitha\"]")
	public MobileElement DigiLName;

	@AndroidFindBy(id = "com.firstdata.mpl:id/header_filter")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"filter\"]")
	public MobileElement StationFilter;

	@AndroidFindBy(id = "childItemLayout")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public List<MobileElement> FilterOption;

	@AndroidFindBy(id = "serv_fac_apply_filter_btn")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public MobileElement FilterApplyBtn;

	@FindBy(xpath = "//android.view.View/android.view.View[4]/android.view.View[4]/android.widget.Button")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement VerifyNectarCont;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
	@iOSXCUITFindBy(id="Open 24 Hours")
	public MobileElement OpenHours;

	@FindBy(xpath = "//android.view.View[1]/android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeOther[@name=\"Nectar Login\"]/XCUIElementTypeTextField")
	public WebElement VerifyNectarnum;

	@FindBy(xpath = "//android.view.View[2]/android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeOther[@name=\"Nectar Login\"]/XCUIElementTypeSecureTextField")
	public WebElement VerifyNectarPass;


	@FindBy(xpath = "//android.view.View[2]/android.widget.EditText[@resource-id='VERIFICATIONCODE']")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeOther[@name=\"Nectar Login\"]/XCUIElementTypeSecureTextField")
	public WebElement OTP;

	@FindBy(id = "load_img3")
	public static WebElement AuthLoad;

	@FindBy(xpath = "//android.widget.Button[@text='Link account']")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Link account\"]")
	public WebElement OTPDone;

	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeOther[@name=\"OFFERS\"]")
	public MobileElement OffersNect;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : Visa']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Visa\"]")
	public MobileElement PaymentMethodLinkVisa;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment method']")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Payment Method\"]")
	public MobileElement PaymentMethodTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso Nectar']")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Esso Nectar\"]")
	public MobileElement EssoNectarTxt;

	@AndroidFindBy(id = "payment_details_update_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement PaymentContinueBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='+ Add Nectar Card']")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"+ Add Nectar Card\"]")
	public MobileElement PaymentAddNectarCard;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"See your Nectar balance.\"]")
	public MobileElement SeeYourNectBalink;

	@AndroidFindBy(id = "learn_more_nector")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Learn more\"]")
	public MobileElement LearnMoreLink;

	@AndroidFindBy(id = "get_started_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"GET STARTED\"]")
	public MobileElement GetStartedBtn;

	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Bonus Points\"]")
	public MobileElement BonusPoints;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"YES, ADD NOW\"]")
	public MobileElement YesAddNow;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"No, sign up\"]")
	public MobileElement NoSignUpBtn;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"VERIFY NECTAR CARD\"]")
	public MobileElement VerifyNectarCardBtn;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"What is Nectar?\"]")
	public MobileElement WhatisNectarTxt;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"NONE OF THE ABOVE\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
	public static MobileElement NONEOFTHEABOVE;

}
