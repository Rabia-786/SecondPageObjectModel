package org.example;

import org.openqa.selenium.By;

public class SearchPage extends Utils{ private String _search = "Nike";
    LoadProperty loadProperty;

    public SearchPage(){

        this.loadProperty = new LoadProperty();
    }
    public void searchForNike() {
        enterText(By.id("small-searchterms"), this._search);
        clickOnElement(By.xpath("//button[@class='button-1 search-box-button']"));

    }
    public void searchForItem() {
        enterText(By.id("small-searchterms"), loadProperty.search);
        clickOnElement(By.xpath("//button[@class='button-1 search-box-button']"));

    }
    public int getExpectedCount(){
        return loadProperty.searchCount;
    }
    public int searchItemsReturned() {
        return getElements(By.className("product-item")).size();
    }
}
