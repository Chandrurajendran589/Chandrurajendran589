package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestCheckOutPage extends GenericWrappers {


	public GuestCheckOutPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
	public MobileElement userName;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
	public MobileElement password;

	@AndroidFindBy(id = "dashboard_start_option_inner_img")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeButton['index=0'])[1]")
	public MobileElement FuelAsGuest;

	@AndroidFindBy(id = "terms_conditions_checkBox")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"circleUnCheck\"]")
	public MobileElement PrivacyAndTermsCheckBox;

	@AndroidFindBy(id = "LocatorNeeded")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sorry there was a connectivity issue while updating your details. Please try again.\"]")
	public MobileElement networkSorryMessage;

	@AndroidFindBy(id = "gco_tc_continue_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement ContinueButtonInFuelAsGuest;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement LocationContinueButton;

	@AndroidFindBy(id = "permission_allow_foreground_only_button")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Allow While Using App\"]")
	public MobileElement AllowLocationWhileUsingTheApp;

	@AndroidFindBy(id = "permission_allow_one_time_button")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Allow Once\"]")
	public MobileElement AllowLocationOnlyThisTime;

	@AndroidFindBy(id = "permission_dont-allow_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Don’t Allow\"]")
	public MobileElement AllowLocationdontAllow;

	@AndroidFindBy(id = "pump_select_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Select your pump\"]")
	public MobileElement SelectYourPump;

	@AndroidFindBy(id = "selected_amount")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Your Maximum Fuelling Amount: £100\"]")
	public MobileElement Selectedamount;

	//@AndroidFindBy(id = "continue_btn")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONFIRM']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement ConfirmButton;

	@AndroidFindBy(id = "add_payment_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"ADD DEBIT/CREDIT CARD\"]")
	public MobileElement AddDebitOrCrecitcardButton;

	@AndroidFindBy(id = "payment_name_et")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Name on card\"]")
	public MobileElement NameOnCard;

	@AndroidFindBy(id = "payment_cardno_et")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Card Number\"]")
	public MobileElement CardNumber;

	@AndroidFindBy(id = "payment_expdate_et")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Exp. MM/YY\"]")
	public MobileElement ExpiryDate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"2\"]")
	public MobileElement SelectPump2;

	@AndroidFindBy(id = "payment_security_code_et")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Security code\"]")
	public MobileElement SecurityCodeCVV;

	@AndroidFindBy(id = "payment_bill_address_postcode")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Postcode\"]")
	public MobileElement PostCode;

	@AndroidFindBy(id = "payment_bill_address_street")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Address 1\"]")
	public MobileElement Address1;

	@AndroidFindBy(id = "payment_bill_address_locality")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"Address 2\"]")
	public MobileElement Address2;

	@AndroidFindBy(id = "payment_bill_address_city")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"City\"]")
	public MobileElement AddressCity;

	@AndroidFindBy(id = "payment_bill_address_country")
	@iOSXCUITFindBy(id="//XCUIElementTypeTextField[@value=\"United Kingdom\"]")
	public MobileElement AddressCountry;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"DONE\"]")
	public MobileElement DoneButton;

	@AndroidFindBy(id = "fuel_authorize_continue_btn")
	//@AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	@iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement HowToFuelContinueButton;
	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Start fuelling now\"]")
	public MobileElement StartFuelingNow;
	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement NowFueling;
	@AndroidFindBy(id = "header_text")

	@iOSXCUITFindBy(id="Please set up Apple Pay, PayPal or manually add a Debit/Credit Card to pay with the Esso App.")
	public MobileElement AddPaymentScreen;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Terms and Conditions\"]")
	public MobileElement TransactionComplete;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Terms and Conditions\"]")
	public MobileElement TermsConditionHeader;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Transaction Complete\"]")
	public MobileElement TransactionCompleteHeader;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,\"IFSF Site\")]")
	public MobileElement SelectPumpScreenHeader;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	public MobileElement HeaderText;

	@AndroidFindBy(id = "safe_travel")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Safe travels!\"]")
	public MobileElement SafeTravels;
	@AndroidFindBy(id = "payment_confirmation_drive_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Your payment was successful.\"]")
	public MobileElement PaymentWasSuccessful;
	@AndroidFindBy(id = "regular_unleaded_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Supreme Unleaded\"]")
	public MobileElement FuelProductName;
	@AndroidFindBy(id = "regular_unleaded_points")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement TransactionAmount;
	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement TransactionLitres;
	@AndroidFindBy(id = "total_title")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement TransactionStatus;
	@AndroidFindBy(id = "total_points")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement TransactionCard;
	@AndroidFindBy(id = "total_lyt")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PaymentInfo;
	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Transaction Details\"]")
	public MobileElement TransactionDetailsLinK;
	@AndroidFindBy(id = "fuel_type_logo")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[1]/XCUIElementTypeImage['index=0'])[1]")
	public MobileElement FuelTypeEssoLogo;
	@AndroidFindBy(id = "full_receipt_address")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement StationAddress;

	@AndroidFindBy(id = "full_receipt_fueling_datetime")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText['index=2'])[3]")
	public MobileElement FuelingDateAndTime;

	@AndroidFindBy(id = "full_receipt_title")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PrdtnameinTranstnDtls;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public MobileElement TransactionDetailsHeaderText;

	@AndroidFindBy(id = "full_receipt_cost")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText['index=2'])[4]")
	public MobileElement TransactionAmountinTransactionDetails;

	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText['index=2'])[5]")
	public MobileElement TransactionLitresTransactionDetails;

	@AndroidFindBy(id = "paypal_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement CardInfo;
	@AndroidFindBy(id = "vat_receipt")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement VatReciept;
	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement VatRecieptView;
	@AndroidFindBy(id = "full_receipt_pump_number")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PumpNumber;
	@AndroidFindBy(id = "payment_confirmation_done_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PaymentConfirmationDone;
	@AndroidFindBy(id = "send_receipt_header_desc_textview")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement SendReciptHeaderDescp;
	@AndroidFindBy(id = "send_receipt_sub_header_desc_textview")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement SendReciptSubHeaderDescp;
	@AndroidFindBy(id = "gco_email_editText")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement EmailIDforSendReport;
	@AndroidFindBy(id = "news_letter_checkBox")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement SendingRecieptChceckBox;
	@AndroidFindBy(id = "news_letter_info_textview")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement MarkettingInfo;
	@AndroidFindBy(id = "send_receipt_button")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement SendMeTheReciept;
	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please indicate that you accept the Privacy Policy and Terms and Conditions.\"]")
	public MobileElement RecieptSentSuccessfully;
	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PopUpMessage;
	@AndroidFindBy(id = "app_logo")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement EssoLogo;
	@AndroidFindBy(id = "thank_you_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Thankyou;
	@AndroidFindBy(id = "thank_you_desc_top_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement DontmissLoyaltyPoint;
	@AndroidFindBy(id = "thank_you_desc_bottom_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ThankYouDescBottomView;
	@AndroidFindBy(id = "remind_later_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement RemindLaterTextView;
	@AndroidFindBy(id = "register_now_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement RegisterNowButton;
	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
	public MobileElement CloseButton;
	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select\"]")
	public MobileElement HeaderRightText;
	@AndroidFindBy(id = "gco_tc_header_desc_textview")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Your privacy is important\"]")
	public MobileElement YourprivacyisImportant;
	@AndroidFindBy(id = "gco_tc_sub_header_desc_textview")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please accept our Privacy Policy and Terms and Conditions before you continue with the fuelling!\"]")
	public MobileElement PleaseAcceptTermsandConditions;
	@AndroidFindBy(id = "privacy_policy_text_view")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextView[@name=\"I accept the Privacy Policy and Terms and Conditions.\"]")
	public MobileElement AccepttermsandConditions;
	@AndroidFindBy(accessibility ="Esso UK R4")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeButton['index=0'])[1]")
	public MobileElement EssoLogoimg;
	@AndroidFindBy(id = "location_setting_title")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement LocateYourStation;
	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement LocateYourStation_SubTitle;
	@AndroidFindBy(id = "permission_message")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement LocationPermissionMessage;

	@AndroidFindBy(id = "detail_message")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement LocationPermissionDetailedMessage;

	@AndroidFindBy(id = "scan_qrcode_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ScanQRCode;
	@AndroidFindBy(id = "qr_code_scan_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ScanQRCodebtn;
	@AndroidFindBy(id = "permission_allow_button")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement CameraPermissionAllow;
	@AndroidFindBy(id = "scan_cancel_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ScanCancelbtn;
	@AndroidFindBy(id = "scan_qrcode_bottom_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement TurnonLocationLink;

	@AndroidFindBy(accessibility ="Back")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement HeaderBackButton;

	@AndroidFindBy(id ="pump_selection_message")
	@iOSXCUITFindBy(id="//XCUIElementTypeStaticText[@name=\"Make sure you are parked at this pump and remain in your vehicle.\"]")
	public MobileElement PumpSelectionmessage;

	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='pump_select_adapter_pumpNumber_text']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"1\"]")
	public MobileElement Pump_Number;

	@AndroidFindBy(id ="action_more")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"More\"]")
	public MobileElement More;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Account;

	@AndroidFindBy(id ="picker")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Picker;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"£105\"))")
	public MobileElement SetMaximumFuellingAmount;
	@AndroidFindBy(id ="defaultpicket_ok_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement MaximumFuellingOkButton;
	@AndroidFindBy(id ="payment_card_details_title")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Payment_Details_Title;
	@AndroidFindBy(id ="payment_scan_tv")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
	public MobileElement ScanYourCard;
	@AndroidFindBy(id ="payment_billing_details_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Billing Details\"]")
	public MobileElement BillingDetails;
	@AndroidFindBy(accessibility ="Cancel")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
	public MobileElement Cancel;
	@AndroidFindBy(id ="payment_cvv_info_icon")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement CVVInfoiIcon;
	@AndroidFindBy(id ="payment_billing_info_icon")
	@iOSXCUITFindBy(id="info blue icon")
	public MobileElement BillingInfoiIcon;
	@AndroidFindBy(id ="search_icon")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Search\"]")
	public MobileElement SearchIcon;
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Privacy Policy']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeLink[@name=\"Privacy Policy\"]")
	public MobileElement PrivacyPolicy;
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Terms and Conditions.']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeLink[@name=\"Terms and Conditions.\"]")
	public MobileElement TermsAndConditions;
	@AndroidFindBy(id ="payment_name_validation_txt")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement InlineErrorNameOnCard;
	@AndroidFindBy(id ="payment_cardno_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter name on card\"]")
	public MobileElement InlineErrorCardNumber;
	@AndroidFindBy(id ="payment_expdt_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter expiry date\"]")
	public MobileElement InlineErrorExpiryDate;
	@AndroidFindBy(id ="payment_secCode_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter security code\"]")
	public MobileElement InlineErrorSecurityCode;
	@AndroidFindBy(id ="payment_posCode_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter postcode\"]")
	public MobileElement InlineErrorPostCode;
	@AndroidFindBy(id ="payment_streetAdr_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter address\"]")
	public MobileElement InlineErrorAddress1;
	@AndroidFindBy(id ="payment_city_validation_txt")
	@iOSXCUITFindBy(id="//XCUIElementTypeStaticText[@name=\"Please enter city\"]")
	public MobileElement InlineErrorCity;
	@AndroidFindBy(id ="payment_bill_address_country")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Country;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"DONE\"))")
	public MobileElement Done;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Flat 1, Henry House, Ringers Road\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
	public MobileElement SelectAddreess;
	@AndroidFindBy(id ="message")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Your billing details must match the exact address registered with the issuing bank.\"]")
	public MobileElement BillingMessage;
	@AndroidFindBy(id ="address_search_icon")
	@iOSXCUITFindBy(iOSNsPredicate="type == \"XCUIElementTypeSearchField\"")
	public MobileElement Address_SearchIcon;
	@AndroidFindBy(id ="close_img")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Clear text\"]")
	public MobileElement ClearSearch;
	@AndroidFindBy(id ="search_editText")
	@iOSXCUITFindBy(iOSNsPredicate="type == \"XCUIElementTypeSearchField\"")
	public MobileElement SearchEditText;
	@AndroidFindBy(id ="fuel_authorize_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Ready to start fuelling?\"]")
	public MobileElement ReadyToDStartFuelling;

	@AndroidFindBy(id ="fuel_authorize_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Ready to start fuelling?\"]")
	public List<MobileElement> ReadyToDStartFuellingSize;

	@AndroidFindBy(id ="fueling_counter_fuelingprice_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PleaseStartFuelling;
	@AndroidFindBy(id ="fueling_pump_cirle_layout")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Fuelling_Pump_Circle;
	@AndroidFindBy(id ="pumpNo_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PumpText;
	@AndroidFindBy(id ="fueling_counter_pumpno_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PumpNumberStartFuelling;
	@AndroidFindBy(id ="fueling_counter_fuellinginstruction_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement StartFuellingMessage;
	@AndroidFindBy(id ="authorising_sub_desc_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement AuthorisingYourPayment;
	@AndroidFindBy(id ="authorising_please_wait_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PleaseWaitText;
	@AndroidFindBy(id ="authorising_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement Authorising_Text;

	/* ****************************************************** Start iOS Objects ********************************************** */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"start\"]")
	public MobileElement StartFuelButton;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public MobileElement SelectPumpContinueButton;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment method: Paypal\" or @name=\"Payment method: MasterCard\"]")
	public MobileElement changePaymentMethod;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Details\"]")
	public MobileElement paymentDetailsHeader;

	@AndroidFindBy(id = "locatorNeeded")
	@iOSXCUITFindBy(id = "Please Setup Apple Pay or manually add a Debit/Credit card to pay with the Esso App")
	public MobileElement AddPaymentScreenMessage;

	@AndroidFindBy(id = "add_payment_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD DEBIT/CREDIT CARD\"]")
	public MobileElement AddCreditCardGCOButton;

	@iOSXCUITFindBy(id = "SetupApplePay")
	public MobileElement setUpApplePayGCOButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Debit/Credit Card\"]")
	public MobileElement AddDebitCreditCardHeader;

	@AndroidFindBy(id ="payment_scan_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
	public MobileElement scanQRCodelink;

	@AndroidFindBy(id ="payment_card_details_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Card Details\"]")
	public MobileElement EnterCardDetailsText;

	@AndroidFindBy(id = "payment_name_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Name on card\"]")
	public MobileElement enterCardName;

	@AndroidFindBy(id = "payment_cardno_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Card Number\"]")
	public  MobileElement EnterCardNumber;

	@AndroidFindBy(id = "payment_expdate_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Exp. MM/YY\"]")
	public MobileElement cardExpDate;

	@AndroidFindBy(id = "payment_security_code_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Security code\"]")
	public MobileElement securityCode;

	@AndroidFindBy(id = "payment_bill_address_postcode")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Postcode\"]")
	public MobileElement BillingAddress;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
	public MobileElement addressSearchIcon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
	public MobileElement AddressSearchButton;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@index=\"1\"])[2]")
	public MobileElement AddressSelect;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select\"]")
	public MobileElement selectAddressbutton;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"DONE\"]")
	public MobileElement doneButton;

	@AndroidFindBy(id ="authorising_please_wait_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please wait\"]")
	public MobileElement PleaseWaitScreen;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start fuelling now\"]")
	public MobileElement StartFuelingNowScreen;

	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Now fuelling\"]")
	public MobileElement nowFuelingScreen;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Transaction Complete\"]")
	public MobileElement transactionCompleteScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your payment was successful.\"]\n")
	public MobileElement paymentSuccessfulMessage;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public MobileElement skipButtonSendReceipt;

	@iOSXCUITFindBy(id = "Do you need the receipt?")
	public MobileElement DoYouNeedYourReceipt;

	@iOSXCUITFindBy(id = "What is the email address you want us to send the digital receipt to?")
	public MobileElement DoYouNeedYourReceiptSubTitle;

	@AndroidFindBy(id = "gco_email_editText")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[@value=\"Email\"])[1]")
	public MobileElement enterEmailAddress;

	@AndroidFindBy(id = "send_receipt_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SEND ME THE RECEIPT\"]")
	public MobileElement sendReceiptButton;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Receipt Sent Successfully\"]")
	public MobileElement ReceiptSentSuccess;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"OK\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public MobileElement okButton;

	@AndroidFindBy(xpath = "//android.view.View[@text='Thank you!']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you!\"]")
	public MobileElement thankYouHeader;

	@iOSXCUITFindBy(id = "Don’t miss out on your loyalty points")
	public MobileElement dontMissLoyaltyTextMesg;

	@AndroidFindBy(id = "remind_later_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Remind me later\"]")
	public MobileElement remindLaterButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please turn on notification permission in settings\"]")
	public MobileElement remindmeLaterCopyText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Settings\"]")
	public MobileElement SettingsButtonremindmeLater;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"REGISTER NOW\"]")
	public MobileElement RegNowButton;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "Close")
	public MobileElement CloseButtonThankYouScreen;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm payment\"]")
	public MobileElement ConfirmPaymentScreenHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PayPal\"]")
	public MobileElement PayWithPaypalButton;

	@AndroidFindBy(id = "pump_select_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select your pump\"]")
	public MobileElement selectYourPumpHeader;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[2]")
	public MobileElement editPaymentMethod;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Payment Details\"]")
	public MobileElement paymentDetailHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso Nectar\"]")
	public MobileElement NectarHeaderText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ Add Nectar Card\"]")
	public MobileElement AddNectarCardPaymentDetails;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"starImage\"]")
	public MobileElement starImageThankYouScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you don't want to save a receipt for this transaction? If you don't save it now, you won't be able to see this at a later date.\"]")
	public MobileElement SkipConfirmMessage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Skip\"])[2]")
	public MobileElement skipConfirmButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Collect receipt\"]")
	public MobileElement collectReceiptButton;

	@iOSXCUITFindBy(id = "PrivacyMobilePayment")
	public MobileElement mobileIconSendReceiptScreen;

	@iOSXCUITFindBy(id = "circleUnCheck")
	public MobileElement receiveEmailCBSendReceiptScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"circleUnCheck\"]")
	public MobileElement checkBoxSendReceiptScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please start fuelling\"]")
	public MobileElement PleaseStartFuelSubTitle;

	@AndroidFindBy(id = "LocatorNeeded")
	@iOSXCUITFindBy(id = "You can fuel up to £100.00 Do not use your mobile while dispensing fuel or when walking on the forecourt.")
	public MobileElement footerTextStartFuellingScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PUMP\"]")
	public MobileElement PumpTextFuelScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeProgressIndicator[@name=\"Progress\"]")
	public MobileElement topProgressLineStartFuel;

	@AndroidFindBy(id ="authorising_sub_desc_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Authorising your payment\"]")
	public MobileElement authorisingPaymentScreen;

	@AndroidFindBy(id ="button2")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement CollectReceipt;

	@AndroidFindBy(id ="button1")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement SKIP;

	@AndroidFindBy(id ="email_validation_txt")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement InlineErrorMessageEmailValidation;

	@AndroidFindBy(id ="content")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement ContentFrame;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"COLLECT RECEIPT\"))")
	public MobileElement Collect_Reciept;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText['index=0'])[1]")
	public MobileElement PleaseSetupApplePayDebitCardStaticText;

	@AndroidFindBy(id = "header_right_btn_cross")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"qrCodeReaderIcon\"]")
	public MobileElement ScanQRCodePumpScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter PIN\"]")
	public MobileElement EnterPinHeader;

	@AndroidFindBy(id = "security_pin_entry_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso PIN to unlock the app for fuelling.\"]")
	public MobileElement EnterPinFuelText;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
	public MobileElement KeyBoardDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The fuel price displayed on the pump will apply.\"]")
	public MobileElement fuelConfirmSubHeaderText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Selected pump\"]")
	public MobileElement selectPumpHeaderText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Method\"]")
	public MobileElement paymentMethodHeaderText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Maximum Fuelling Amount\"]")
	public MobileElement maxFuellingHeaderText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Reward\"]")
	public MobileElement rewardPaymentHeaderText;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit\"])[2]")
	public MobileElement EditPaymentMethodLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Details\"]")
	public MobileElement paymentDetailsHeaderText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Esso Nectar\"]")
	public MobileElement EssoNectarPaymentDetailsHeaderText;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Allow Location\"]")
	public List<MobileElement> AllowLocationHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let us locate your current station\"]")
	public MobileElement LocateCurrentStation;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Allow “Esso-QA” to use your location?\"]")
	public MobileElement useLocationPopupHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index=\"1\"]")
	public MobileElement useLocationPopupSubHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index=\"2\"]")
	public MobileElement readytoStartFuellingSubText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How to Fuel\"]")
	public MobileElement howToFuelHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@index=\"0\"]")
	public MobileElement clockImageReadyToStartFuelScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
	public MobileElement SelectAddressFromList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Welcome to\"]")
	public MobileElement LIDGreetingText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Save on fuel with points\"]")
	public List<MobileElement> OfferPopupInPaymentScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You could have earned loyalty points with this fuelling. Register now so next time you don’t miss out.\"]")
	public MobileElement loyalityTextThankYouScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField\n")
	public MobileElement PassPhrase;

	@AndroidFindBy(id = "submitButton")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
	public MobileElement PassPhraseSubmit;

	@AndroidFindBy(id = "challengeInformationHeaderTextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify by Password\"]")
	public MobileElement VerifyPwd;

	@AndroidFindBy(id = "challengeInformationLabelTextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password\"]")
	public MobileElement EnterPwd;

	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(id = "info blue icon")
	public MobileElement MaxFuelInfoIcon;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id = "This is the amount that will be reserved in your account. The pump will stop before this value. You will only be charged for the fuel dispensed.")
	public MobileElement MaxFuellingPopUp;

	public void appUninstallInstall(){
		Map<String, Object> params = new HashMap<>();
		params.put("bundleId", "com.exxonmobil.esso-uk-qa");
		driver.executeScript("mobile: removeApp", params);
	}
	public void appInstall(){
		Map<String, Object> params = new HashMap<>();
		params.put("app", "/Users/chandru_r/Downloads/Esso_UK_MR1_082_10030_Stage_R1_BUAT_Key (1).ipa");
		driver.executeScript("mobile: installApp", params);
		launchiOSApp();
	}

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"SKIP\"))")
	public MobileElement Skip_prompt;

	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText]")
	@iOSXCUITFindBy(id="LocatorNeed")
	public MobileElement PassphraseEntrerYourPwd;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Privacy Policy\"))")
	public MobileElement PrivacyandPolicy;
}
