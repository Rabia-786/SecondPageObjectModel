package org.example;

import org.openqa.selenium.By;

public class FaceBook extends Utils{
    By facebookButton = By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    By loginButton = By.xpath("//input[@value='Log In']");


    public void gotoFaceBookPage(){
        clickOnElement(facebookButton);
      // waitFor(loginButton);
       //clickOnElement(loginButton);


    }



}
