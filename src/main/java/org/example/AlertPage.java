package org.example;

import org.openqa.selenium.By;

public class AlertPage extends Utils{
    By searchButton = By.xpath("//button[@class='button-1 search-box-button']");
    public void openAlert(){
        clickOnElement(searchButton);


    }

}
