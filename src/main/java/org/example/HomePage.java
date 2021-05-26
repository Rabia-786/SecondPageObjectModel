package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    public void clickOnRegisterButton() {
// user will be select register button
        clickOnElement(By.linkText("Register"));
    }
    public void navigateToHomePage(){

        driver.get("https://demo.nopcommerce.com/");

    }

}
