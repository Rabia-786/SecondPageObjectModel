package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utils extends BasePage{
    public static WebDriver getDriver(){
        return driver;
    }
    public static WebElement findElement(By by){

        return driver.findElement(by);
    }
    public static List<WebElement> getElements(By by){
        return driver.findElements(by);
    }
    public static WebElement waitFor(By by){
        //   ExpectedConditions.visibilityOfElementLocated(by);
        return ( new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(findElement(by)));
    }
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void selectFromDropdownByVisibleIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void selectFromDropdownByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropdownByValue(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String getSelectedDropdownValue(By by){
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();

    }
    public String currentPage(){
        return driver.getCurrentUrl();

    }
}
