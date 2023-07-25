package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class Base {
    public static WebDriver driver;

   public void startUp()
    {
        System.setProperty("webdriver.chrome.driver",
                "/Users/chandru.r/Downloads/SeleniumOne/src/main/resources/Drivers/chromedriver");

        ChromeOptions ss= new ChromeOptions();
        ss.addArguments("window-siz=1400,800");
        ss.addArguments("headless");
        driver = new ChromeDriver(ss);
        driver.get("https://www.google.com/");
    }
    public  void failed(String methodName) throws IOException {
       File fs= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fs,new File("/Users/chandru.r/Downloads/SeleniumOne/target/Screenshot/"+methodName+"jpg"));

    }
}
