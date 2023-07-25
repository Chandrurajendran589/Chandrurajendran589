package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitFacebook {

  static  WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/chandru.r/Downloads/SeleniumOne/target/classes/Drivers/chromedriver");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.get("https://www.facebook.com/");
       WebElement we= driver.findElement(By.cssSelector("#u_0_5_31"));
        System.out.println(we.getText());
        clickable(driver, we,30);

    }
    public static void clickable(WebDriver driver, WebElement locator,int timouts)
    {
        new WebDriverWait(driver,timouts).ignoring(StaleElementReferenceException.class).
                until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }
}
