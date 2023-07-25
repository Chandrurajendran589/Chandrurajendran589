package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class ModalPopupPage extends GenericWrappers {
    public ModalPopupPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "btnClose")
    @iOSXCUITFindBy(xpath = "btnClose")
    public MobileElement NectarCloseButton;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Station\"]")
    @iOSXCUITFindBy(xpath = "//android.widget.TextView[@text=\"Station\"]")
    public MobileElement StationTabLID;

    @AndroidFindBy(id = "location_continue_btn")
    @iOSXCUITFindBy(id = "location_continue_btn")
    public MobileElement locationAccessContinueButton;

    @AndroidFindBy(id="btnViewStations")
    @iOSXCUITFindBy(id = "btnViewStations")
    public MobileElement listStations;

    @AndroidFindBy(id = "rvStationInfo")
    @iOSXCUITFindBy(id = "rvStationInfo")
    public MobileElement stationInfoLink;

    @AndroidFindBy(id = "dismiss_button")
    @iOSXCUITFindBy(id = "dismiss_button")
    public MobileElement viewDetailsPopup;

    @AndroidFindBy(id = "dismiss_button")
    public List<MobileElement> enterViewDetailsPopup;

    @AndroidFindBy(id = "header_back_btn")
    public MobileElement bcakButtonInStationDetails;

    @AndroidFindBy(id = "terms_and_conditions_txt")
    @iOSXCUITFindBy(id = "terms_and_conditions_txt")
    public MobileElement termsConditionLink;

    @AndroidFindBy(id = "terms_and_conditions_txt")
    @iOSXCUITFindBy(id = "terms_and_conditions_txt")
    public MobileElement termsConditionText;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(id = "close_img")
    public MobileElement CloseButton;

    @AndroidFindBy(id = "edtSearch")
    @iOSXCUITFindBy(id = "edtSearch")
    public MobileElement stationSearchBox;

    @AndroidFindBy(id = "load_btn")
    @iOSXCUITFindBy(id = "load_btn")
    public MobileElement loadToCardButton;

    @AndroidFindBy(id = "title_text_view")
    @iOSXCUITFindBy(id = "title_text_view")
    public MobileElement ModalPopupHeader;

    @AndroidFindBy(id = "pop_up_imageview")
    @iOSXCUITFindBy(id = "pop_up_imageview")
    public MobileElement modalImagePopup;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(id = "header_back_btn")
    public MobileElement stationBackButton;

    @AndroidFindBy(id = "default_layout")
    public MobileElement stationModalPopup;

    @AndroidFindBy(id = "default_layout")
    public List<MobileElement> StationPopupScreen;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"action_fuel\"]")
    public MobileElement FuelTab;

    @AndroidFindBy(id = "tick_mark_image")
    public MobileElement OfferAppliedTickMark;

    @AndroidFindBy(id = "btnClose")
    public MobileElement closeModalPopup;



}
