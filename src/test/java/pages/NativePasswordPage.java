package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

public class NativePasswordPage extends GenericWrappers {

	public NativePasswordPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirmation")
	@iOSXCUITFindBy(id = "Save Password")
	public MobileElement LoginSavePwd;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_reject")
	@iOSXCUITFindBy(id = "Not Now")
	public MobileElement LoginSaveNever;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(id = "NeedLocator")
	public MobileElement LoginSave;

	@AndroidFindBy(id = "Locator need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Would you like to save this password in your Keychain to use with apps and websites?\"]")
	public MobileElement SavePwdQuest;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(id = "You can view and remove saved passwords in Passwords settings.")
	public MobileElement PasswordSettingTxt;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement LoginEmailTab;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"suggestion\"])[1]")
	public MobileElement EmailSuggestion;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField\n")
	public MobileElement PasswordPrompt;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'CONTINUE'")
	public static MobileElement RegstrContinue;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
	public MobileElement CancelButtonBioMetricsPrompt;
}
