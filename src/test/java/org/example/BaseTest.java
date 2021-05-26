package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class BaseTest extends BrowserSelector{
    BrowserSelector browserSelector = new BrowserSelector();
    @BeforeMethod
    public void openBrowser(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
        //driver = new ChromeDriver();
       // this.openBrowser();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.get("https://demo.nopcommerce.com/");
        browserSelector.openBrowser();
        // get Url
        driver.get("https://demo.nopcommerce.com/");

    }
    @AfterMethod
    public void closeBrowser(){
    //    if(!result.isSuccess()){
      //      captureScreenShot(result.);
        }
        // driver.quit();
    }

