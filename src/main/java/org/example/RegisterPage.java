package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Utils{
    By _registrationButton = By.name("register-button");


    LoadProperty loadProperty = new LoadProperty();
    public void userOpenRegisterPageSuccessfully(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement genderElement = waitFor(By.id("gender-female"));
        genderElement.click();
        // findElement(By.id("gender-female")).click();
        clickOnElement(By.id("gender-female"));//type gender
        enterText(By.name("FirstName"), loadProperty.firstName);
        // enterText(By.id("FirstName"), "Rabia"); //user type first name
        enterText(By.id("LastName"), loadProperty. lastName);// user types last name
        // User type date of Birth
        selectFromDropdownByVisibleIndex(By.xpath("//select[@name=\"DateOfBirthDay\"]"), loadProperty.dateOfBirthDay);
        //user type date of manth
        selectFromDropdownByVisibleIndex(By.xpath("//select[@name=\"DateOfBirthMonth\"]"),loadProperty.dateOfBirthMonth);
        // user type date of year
        selectFromDropdownByValue(By.xpath("//select[@name=\"DateOfBirthYear\"]"),loadProperty.dateOfBirthYear);
        // user type Email
        enterText(By.id("Email"),loadProperty.email);
        //user enters password
        enterText(By.name("Password"),loadProperty.password);
        // user enters confirm password
        enterText(By.id("ConfirmPassword"),loadProperty.confirmPassword);
        // user clicks register button

        clickOnElement(By.id("register-button"));
    }

    }
