package org.example;
import javax.imageio.ImageIO;

import okio.Buffer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.image.BufferedImage;
import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.util.List;

public class ComputerSoftwarePage extends Utils {

    private LoadProperty loadProperty;

    public ComputerSoftwarePage(){

        this.loadProperty = new LoadProperty();
    }
    public void goToSoftwarePage(){
        WebElement element = findElement(By.cssSelector("ul.top-menu li a[href='/computers']"));

        Actions actions = new Actions(getDriver());

        WebElement softwareElement = findElement(By.cssSelector("ul.top-menu li a[href='/software']"));
        actions.moveToElement(element).click(softwareElement).build().perform();
    }

    public void goToComputerMenuPage(){
        WebElement element = findElement(By.cssSelector("ul.top-menu li a[href='/computers']"));

        Actions actions = new Actions(getDriver());

        WebElement softwareElement = findElement(By.cssSelector("ul.top-menu li a[href='/"+loadProperty.computerMenuItem+"']"));
        actions.moveToElement(element).click(softwareElement).build().perform();
    }
    public int getAddToCartButtonCount(){
        List<WebElement> buttons = getElements(By.className("product-box-add-to-cart-button"));
        return buttons.size();

    }
    public int getExpectedComputerMenuItemCount(){
        return loadProperty.computerMenuItemCount;
    }

    public void takeScreenShot() throws IOException {
        File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage image = ImageIO.read(s);

        ImageIO.write(image, "png", new File("src/test/resources/TestData/screenshots/computer.png"));
    }}