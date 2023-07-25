package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Takescreenshot1 {
   public static WebDriver driver;

    public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","/Users/chandru.r/Downloads/SeleniumOne/src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        takescreenAbout("Chadnrutackescreen");
    }
       public static void takescreenAbout(String fileName) throws IOException {
            File ls=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(ls,new File("/Users/chandru.r/Downloads/SeleniumOne/src/main/java/org/example/"+fileName+".jpg"));
        }
    }

