package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class PayOutsidePage extends GenericWrappers {

	@AndroidFindBy(id = "dashboard_already_registered")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'Already Registered? Sign In'")
	public MobileElement AccountLogin;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleCheck']")
	@AndroidFindBy(id = "account_receipt_checkBox")
	public MobileElement ReceiptCKbx;

	@AndroidFindBy(id = "account_terms_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Terms and'")
	public MobileElement TermsACondition;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleUnCheck']")
	public MobileElement emailUnCircleCheck_box;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement okBtn;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Fuel\"]/android.widget.ImageView")
	@iOSXCUITFindBy(id = "Fuel")
	public MobileElement FuelIcon;

	@AndroidFindBy(id = "dashboard_start_option_inner_img")
	@iOSXCUITFindBy(id = "start")
	public MobileElement StartFuelIcon;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement AccountOkBtn;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Notifications']")
	public MobileElement NotificationScroll;

	@AndroidFindBy(id = "account_email_setting_title")
	@iOSXCUITFindBy(id = "Locator Needed")
	public MobileElement EmailNotifyScroll;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	public MobileElement CancelBttn;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
	public MobileElement PumpContinueBtn;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Changes saved. You will now receive receipts via email.")
	public MobileElement PopUpMessage;

	@AndroidFindBy(id = "pay_with_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'PayPal'")
	public MobileElement PayPalButn;

	@AndroidFindBy(id = "payment_confirmation_done_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'DONE'")
	public MobileElement DoneBtn;

	@AndroidFindBy(id = "paid_pound_value")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement FuelAmount;

	@AndroidFindBy(id = "regular_unleaded_title")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement FuelGrade;

	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement FuelQty;

	@AndroidFindBy(id = "fuel_authorize_title")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement ReadyStrtFuel;

	@AndroidFindBy(id = "fuel_authorize_continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
	public MobileElement ReadyCtnBtn;

	@AndroidFindBy(id = "authorising_sub_desc_text")
	@iOSXCUITFindBy(id = "Authorizing your payment")
	public MobileElement AuthorizeTxt;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public MobileElement AuthorizeTxtSiteId;

	@AndroidFindBy(id = "authorising_please_wait_text")
	@iOSXCUITFindBy(id = "Please wait")
	public MobileElement CnfrmLoader;

	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement CancelPopUpMessage;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public MobileElement ConfrmPayment;

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

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement TransDetLink;

	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement ViewLink;

	@AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement ViewTransLink;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Esso App Tutorial'")
	public MobileElement TutorialScrn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement TutorialAlignment;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]/XCUIElementTypeStaticText")
	public MobileElement PaymentMethod;

	@AndroidFindBy(id = "pre_transaction_summary_add_clubcard")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ Add Nectar Card\"]")
	public MobileElement PaymentAddNectar;

	@AndroidFindBy(id = "payment_details_update_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
	public MobileElement PaymentContinueBtn;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
	public MobileElement ContinueBtn;

	@AndroidFindBy(id = "pump_select_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Select your pump'")
	public MobileElement selectpump;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement confirmspayment;

	@AndroidFindBy(id = "authorising_sub_desc_text")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement Authorisingpayment;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(id = "Start fuelling now")
	public MobileElement Startfuelling;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Complete\"]")
	public MobileElement TransactionComplete;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(id = "Add your Nectar card to get exclusive Esso rewards.")
	public MobileElement AddNectar;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Transaction Details']")
	public MobileElement Transactiondeatils;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement Transactiondeatilspage;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement Verifynectar;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement Verifynectarmsg;

	@AndroidFindBy(id = "collect_points_tv")
	@iOSXCUITFindBy(id = "Locator Need")
	public MobileElement Nectarpoint;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Changes saved. You will no longer receive receipts by email. You can still find your receipts in 'History'.")
	public MobileElement PopUpMessage1;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "The fuel price displayed on the pump will apply.")
	public MobileElement PleaseWaitBottomCt;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'PUMP'")
	public MobileElement PleaseWaitPumpCt;

	@AndroidFindBy(id = "header_right_btn_cross")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'qrCodeReaderIcon'")
	public MobileElement QrCodeButtonSelectYourPump;

	@AndroidFindBy(id = "pump_select_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Select your pump'")
	public MobileElement SelectYourPumpHeading;

	@AndroidFindBy(id = "pump_selection_messag")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Make sure you are'")
	public MobileElement SelectYourPumpSubHeading;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[@text='1']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '1'")
	public MobileElement SelectYourPumpNo1;

	@AndroidFindBy(id = "//android.widget.RelativeLayout[2]/android.widget.TextView[@text='2']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '2'")
	public MobileElement SelectYourPumpNo2;

	@AndroidFindBy(id = "//android.widget.RelativeLayout[3]/android.widget.TextView[@text='3']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '3'")
	public MobileElement SelectYourPumpNo3;

	@AndroidFindBy(id = "//android.widget.RelativeLayout[3]/android.widget.TextView[@text='3']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public MobileElement MfaLinkSelectYourPump;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]")
	public MobileElement MfaInfoSelectYourPump;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]/XCUIElementTypeStaticText")
	public MobileElement PaymentMethodLinkSelectYourPump;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Payment Details'")
	public MobileElement PaymentDetailsHeading;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Payment Method'")
	public MobileElement PaymentMethodHeadingPaymentDetails;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Esso Nectar'")
	public MobileElement EssoNectarHeadingPaymentDetails;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Please start fuelling")
	public MobileElement StartfuellingSubheading;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "PUMP")
	public MobileElement StartfuellingPump;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "1")
	public MobileElement StartfuellingPumpNumber;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You can fuel up to £ 100 Do not use your mobile while dispensing fuel or when walking on the forecourt.\"]")
	public MobileElement StartfuellingCt;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public MobileElement CancelButton;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Safe travels!")
	public MobileElement TransactionCompleteSafeTravels;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Your payment was successful.")
	public MobileElement TransactionCompleteSuccessfulCt;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public MobileElement TransactionCompleteFuelType;

	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public MobileElement TransactionCompleteQuantity;

	@AndroidFindBy(id = "regular_unleaded_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	public MobileElement TransactionCompletePrice;

	@AndroidFindBy(id = "total_title")
	@iOSXCUITFindBy(id = "PAID")
	public MobileElement TransactionCompletePaid;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public MobileElement TransactionCompleteDetails;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify your Nectar card to get exclusive Esso rewards.\"]")
	public MobileElement VerifyNectarLinkTransactionComplete;

	@AndroidFindBy(id = "collect_points_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public MobileElement TransactionDetailsHeading;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "VAT Receipt")
	public MobileElement TransactionDetailsVat;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View\"]")
	public MobileElement TransactionDetailsView;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ Add Note\"]")
	public MobileElement TransactionDetailsAddNote;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public MobileElement TransactionDetailsAddress;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public MobileElement TransactionDetailsTime;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public MobileElement TransactionDetailsRateWithoutPoints;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	public MobileElement TransactionDetailsFuelTypeWithoutPoints;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public MobileElement TransactionDetailsPriceWithoutPoints;

	@AndroidFindBy(id="selected_amount")
	@iOSXCUITFindBy(id = "Maximum fueling amount: $100")
	public MobileElement MaximumFueling;

	@AndroidFindBy(id="pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Change Payment Details\"]")
	public MobileElement changepayment;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='PayPal']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"PayPal\"]")
	public MobileElement PayPal;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='PayPal']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='Payment method: Paypal']")
	public List<MobileElement> paymentMethodPayPal;

	public PayOutsidePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}