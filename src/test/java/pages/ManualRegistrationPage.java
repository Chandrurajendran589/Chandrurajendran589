package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ManualRegistrationPage extends GenericWrappers {
    public ManualRegistrationPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "validations_tick1_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeImage[1]")
    public MobileElement Tick1ManualRegistration;
    @AndroidFindBy(id = "validations_tick2_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")
    public MobileElement Tick2ManualRegistration;
    @AndroidFindBy(id = "validations_tick3_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeImage[3]")
    public MobileElement Tick3ManualRegistration;
    @AndroidFindBy(id = "validations1")
    @iOSXCUITFindBy(id = "At least 8 characters")
    public MobileElement PassValidation1ManualRegistration;
    @AndroidFindBy(id = "validations2")
    @iOSXCUITFindBy(id = "Contains upper and lower case letters")
    public MobileElement PassValidation2ManualRegistration;
    @AndroidFindBy(id = "validations3")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Contains a number'")
    public MobileElement PassValidation3ManualRegistration;
    @AndroidFindBy(id = "password_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Password must contain'")
    public MobileElement PasswordInlineErrorMessage;
    @AndroidFindBy(id = "confirm_password_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'The passwords entered do not match'")
    public MobileElement ConfirmPasswordInlineErrorMessage;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please Accept'")
    public MobileElement PleaseAcceptPPTitle;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please indicate'")
    public MobileElement PleaseAcceptPPContent;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Done'")
    public MobileElement DoneKeypadRegistration;
    @AndroidFindBy(id = "email_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Oops! We already'")
    public MobileElement MultipleMailIdPopup;
    @AndroidFindBy(id = "email_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Incorrect email format'")
    public MobileElement InlineEmailErrorRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"circleUnCheck\"]")
    public MobileElement EssoCheckboxUncheckedRegistration;
    @AndroidFindBy(id = "newsletter_tv1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'I’d like to receive'")
    public MobileElement EssoCheckboxContentRegistration;
    @AndroidFindBy(id = "firstname_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter first name'")
    public MobileElement InlineErrorEmptyFirstName;
    @AndroidFindBy(id = "lastName_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter last name'")
    public MobileElement InlineErrorEmptyLastName;
    @AndroidFindBy(id = "email_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter email address'")
    public MobileElement InlineErrorEmptyEmail;
    @AndroidFindBy(id = "password_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter password'")
    public MobileElement InlineErrorless8charPassword;
    @AndroidFindBy(id = "password_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter password'")
    public MobileElement InlineErrorEmptyPassword;
    @AndroidFindBy(id = "confirm_password_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please enter confirm password'")
    public MobileElement InlineErrorEmptyConfirmPassword;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' and name == 'Privacy Policy'")
    public MobileElement PpLinkRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' and name == 'Terms and Conditions.'")
    public MobileElement TcLinkRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'NavBack'")
    public MobileElement BackPpLinkRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Privacy Policy'")
    public MobileElement PpLinkRegistrationTitle;
    @AndroidFindBy(id = "password_showHide_btn")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Info\"])[1]")
    public MobileElement ShowToggleButtonPwd;
    @AndroidFindBy(id = "confirm_password_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Touch ID'")
    public MobileElement TouchIdContent;
    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public MobileElement BiometricsCheckboxRegistration;
    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement PpTcCheckboxWithBiometricsRegistration;
    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[3]")
    public MobileElement EssoCheckboxWithBiometricsRegistration;
    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public MobileElement PpTcCheckboxWithoutBiometricsRegistration;
    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement EssoCheckboxWithoutBiometricsRegistration;
    @AndroidFindBy(id = "privacy_policy_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'I accept the Privacy'")
    public MobileElement PpTcCheckboxContentRegistration;
    @AndroidFindBy(id = "mobile_county_code_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == '+44(0)'")
    public MobileElement CountryCodeRegisterScreen;
    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement MobileNumberTextBoxManualRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value == 'Done'")
    public static MobileElement HideKeyPadMobileRegistration;
    @AndroidFindBy(id = "mobile_info_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"info blue icon\"])[1]")
    public MobileElement InfoButtonMobileRegistration;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please provide your'")
    public MobileElement InfoContentMobileRegistration;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'OK'")
    public MobileElement InfoPopupOkMobileRegistration;
    @AndroidFindBy(id = "mobile_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter a valid mobile number'")
    public MobileElement InlineErrorMessageMobileRegistration;
    @AndroidFindBy(id = "account_user_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number'")
    public MobileElement MobileNumberTitleAccount;
    @AndroidFindBy(id = "add_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Add Mobile Number'")
    public MobileElement MobileNumberButtonAccount;
    @AndroidFindBy(id = "mobile_county_code_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH '+44(0)'")
    public MobileElement MobileNumberButtonAccountWithButton;
    @AndroidFindBy(id = "delete_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Delete Mobile Number'")
    public MobileElement MobileNumberDeleteButtonAccount;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Delete'")
    public MobileElement MobileDeleteButtonPopupAccount;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'OK'")
    public MobileElement MobileDeleteOkPopupSuccessAccount;
    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Add Mobile Number'")
    public MobileElement AddMobileNumberTitleEditAccount;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Please provide your'")
    public MobileElement AddMobileNumberSubtitleAccount;
    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement MobileTextBoxAddMobileAccount;
    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
    public MobileElement CancelButtonAddMobileNumberAccount;
    @AndroidFindBy(id = "mobile_done_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'DONE'")
    public MobileElement DoneButtonAddMobileNumberAccount;
    @AndroidFindBy(id = "account_mobile_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public MobileElement MobileNumberEditAccountWithButton;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'We have resent'")
    public MobileElement MailResentSubtitle;
    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Before logging into'")
    public MobileElement MailResentSubtitle1;
    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'OK'")
    public MobileElement OkButtonMailSentPopup;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Resend Email'")
    public MobileElement ResendMailButtonMailSentPopup;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number added successfully'")
    public MobileElement MobileNumberAddedSuccessfullyPopup;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'It seems you have'")
    public MobileElement ReinstalledAppPopupContent;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'It seems you have'")
    public MobileElement Mobileok;
    @AndroidFindBy(id = "mobile_value")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH '+44'")
    public MobileElement Mobilenumberverifies;
    @AndroidFindBy(id = "account_mobile_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public MobileElement EditMobilenumber;
    @AndroidFindBy(id = "delete_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Delete Mobile Number'")
    public MobileElement DeleteMobilenumber;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Are you sure you want to delete'")
    public MobileElement MobileNumberDeletePopupContent;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Delete'")
    public MobileElement DeleteMobileButtonPopup;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number deleted successfully.'")
    public MobileElement DeleteMobileSuccessPopup;
    @AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Login Notification'")
	public static MobileElement Alertitle;
    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'CONTINUE'")
	public static MobileElement MobileNumberaddedContiuebutton;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement add_Moble_Num_Btn;
    @AndroidFindBy(id = "firstName_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_FirstName;
    @AndroidFindBy(id = "lastName_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_LastName;
    @AndroidFindBy(id = "lastName_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_Email;
    @AndroidFindBy(id = "password_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_Password;
    @AndroidFindBy(id = "confirm_password_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_ConfirmPassword;
    @AndroidFindBy(id = "confirm_password_showHide_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_Show;
    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_Mobile;
    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_Iaccept;
    @AndroidFindBy(id = "	newsletter_checkBox")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public MobileElement Reg_ilike;
    @AndroidFindBy(id = "header_back_image_btn")
    @iOSXCUITFindBy(id = "NavBack")
    public MobileElement Reg_Back;
    @AndroidFindBy(id = "password_EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static MobileElement RegstrPass;
    @AndroidFindBy(id = "privacy_policy_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Privacy'")
	public MobileElement PrivacyPolicyLink;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Conditions.']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Terms and Conditions.'")
	public MobileElement TermsAConditionLink;
    @AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Terms and Conditions.'")
	public MobileElement Emailcheckbox;
    @AndroidFindBy(id = "preauth_amount")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Terms and Conditions.'")
	public MobileElement Preauthamt;
    @AndroidFindBy(id="header_txt")
	@iOSXCUITFindBy(id = "Done")
	public MobileElement mfpop;
    @AndroidFindBy(id="selected_amount")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public MobileElement MaximumFueling;
    @AndroidFindBy(id="defaultpicket_cancel_btn")
	@iOSXCUITFindBy(id = "Cancel")
	public MobileElement cancelpop;
    @AndroidFindBy(xpath="(//android.widget.ImageView[@content-desc=\"Complete your profile\"])[6]")
	@iOSXCUITFindBy(id = "OK")
	public MobileElement tickmark;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Please update your'")
    public MobileElement EditMobileNumberSubtitleAccount;
    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Edit Mobile Number'")
    public MobileElement EditMobileNumberTitleEditAccount;
    @AndroidFindBy(id ="android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public MobileElement OkButton;
    @AndroidFindBy(id ="android:id/button1")
    @iOSXCUITFindBy(id = "Mobile number updated successfully")
    public MobileElement MobileNumberUpdatedPopup;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
    public MobileElement CancelMobileButtonPopup;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter a mobile number'")
    public MobileElement InlineErrorNoNumberMobileRegistration;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number added'")
    public MobileElement MobileNumberAddedScreenTitle;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'The Esso App will'")
    public MobileElement MobileNumberAddedScreenSubtitle;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Skip'")
    public MobileElement SkipButtonMfa;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'back Icon'")
    public MobileElement BackButtonCompleteYourProfile;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'circleUnCheck'")
    public MobileElement MailsCheckboxRegisterNoBiometrics;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public MobileElement MailsCheckboxRegisterWithBiometrics;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(id = "titleLabel")
    public MobileElement MfaPickerTitle;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(id = "Loyalty Points")
    public MobileElement LoyaltyPointsFaq;
    @AndroidFindBy(id = "locator needed")
//    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Will I still earn Nectar points'")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"3\"]")
    public MobileElement NectarPintsFaq;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(id = "FAQs")
    public MobileElement FaqLinkLoyaltyPointsFaqs;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"URL\"]")
    public MobileElement EssoBrowserLink;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"URL\"]")
    public MobileElement UrlFaqLinkHelp;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Don't have Nectar card'")
    public MobileElement NectarCardSignUpCtOffers;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'After adding your card'")
    public MobileElement AfterAddingYourCtOffers;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Add your Nectar card to'")
    public MobileElement AddYourNectarCardCtOffers;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(id = "Sign Up")
    public MobileElement SignUpLinkOffers;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"URL\"]")
    public MobileElement SignUpLinkBrowser;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"URL\"]")
    public MobileElement NectarSignUpFaqLinkOffers;
}
