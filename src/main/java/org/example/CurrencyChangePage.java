package org.example;

import org.openqa.selenium.By;

public class CurrencyChangePage extends Utils {
    public void changeCurrencyToEuro(){
        selectFromDropdownByText(By.id("customerCurrency"),"Euro");

    }

    public String getCurrency(){
        return getSelectedDropdownValue(By.id("customerCurrency"));

    }
}
