package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{
    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");
    public void openBrowser(){
        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src/test/resources/Browser/msedgedriver.exe");
             driver = new EdgeDriver();
        }

        else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver","src/test/resources/Browser/geckodriver.exe");
              driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }
}
