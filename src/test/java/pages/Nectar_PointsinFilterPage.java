package pages;

import io.appium.java_client.*;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import stepLibrary.GenericWrappers;

public class Nectar_PointsinFilterPage extends GenericWrappers {
	
	public Nectar_PointsinFilterPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "dashboard_already_registered")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login!\"]")
	public MobileElement DashboardLoginlink;
	
	@AndroidFindBy(id = "login_email_editText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
	public MobileElement userName;

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	@iOSXCUITFindBy(id = "com.google.android.gms:id/cancel")
	public MobileElement clickOnCancelbutton;

	@AndroidFindBy(id = "login_passWord_editText")
	@iOSXCUITFindBy(xpath = "///XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
	public MobileElement password;
	
	@AndroidFindBy(id = "login_Btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOGIN\"]")
	public MobileElement loginButton;
	
	@AndroidFindBy(id="action_station")
	public MobileElement stations;
	
	@AndroidFindBy(id="location_continue_btn")
	public MobileElement continueButton;
	
	@AndroidFindBy(id="edtSearch")
	public MobileElement searchBox;
	
	@AndroidFindBy(id="permission_allow_foreground_only_button")
	public MobileElement locationPermission;
	
	@AndroidFindBy(id="header_filter")
	public MobileElement filterButton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView")
	public MobileElement nectarPointlink;
	
	@AndroidFindBy(id="serv_fac_apply_filter_btn")
	public MobileElement applyFilter;

	@AndroidFindBy(xpath = "//*[@text=\"Nectar Points\"]")
	public MobileElement NectarPoint;

	@AndroidFindBy(xpath = "//*[@text=\"Mobile Payment Enabled\"]")
	public MobileElement FromElement;

	

public void nectarPointsLinkVarification(){
	MobileElement element = (MobileElement) driver.findElementByXPath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView"));
	boolean NectorDisplayed = element.isDisplayed();
}
	public void nectarPointsLinkClick(){
		MobileElement element = (MobileElement) driver.findElementByXPath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView"));
		boolean NectorDisplayed = element.isDisplayed();
		element.click();
	}
	public void NectarPointScroll(){
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"services_filter_categories_tv\")).setMaxSearchSwipes(5).scrollIntoView("
						+ "new UiSelector().descriptionContains(\"Nectar Points\"))"));

		//Perform the action on the element
		System.out.println(element.getText()+"Nectar Point is displayed");
	}

}