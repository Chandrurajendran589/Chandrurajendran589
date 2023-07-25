package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesSample {

    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        Properties prp= new Properties();
        FileInputStream ss= new FileInputStream("/Users/chandru.r/Downloads/SeleniumOne/" +
                "src/test/java/org/example/config.properties");
        prp.load(ss);
     String url=   prp.getProperty("URL");
        String name=prp.getProperty("name");
        System.out.println(name);
String browser=prp.getProperty("browser");

if(browser.equals("chrome"))
{
    System.setProperty("webdriver.chrome.driver","/Users/chandru.r/Downloads/SeleniumOne/target/classes/Drivers/chromedriver");
    driver=new ChromeDriver();
}else if(browser.equals("firefox"))
{
    driver=new FirefoxDriver();
} else if (browser.equals("IE")) {
    driver=new InternetExplorerDriver();
}
        driver.get(url);
driver.findElement(By.xpath(prp.getProperty("userId"))).sendKeys(prp.getProperty("name"));
driver.findElement(By.xpath(prp.getProperty("password"))).sendKeys(prp.getProperty("password"));
driver.findElement(By.xpath(prp.getProperty("login"))).click();
    }

}
