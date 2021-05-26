package org.example;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterPageSucessfully registerPageSuccessfully = new RegisterPageSucessfully();
    SearchPage searchPage = new SearchPage();
    CurrencyChangePage currencyChangePage = new CurrencyChangePage();
    ComputerSoftwarePage computerSoftwarePage = new ComputerSoftwarePage();
    FaceBook faceBook = new FaceBook();
    AlertPage alertPage = new AlertPage();

    @Test
    public void userShouldBeAbleToLoginInSuccessfully(){
        homePage.clickOnRegisterButton();
        registerPage.userOpenRegisterPageSuccessfully();
        registerPageSuccessfully.verifyRegisterMessage();
    }
    @Test
    public void userShouldBeAbleToSearch(){
        homePage.navigateToHomePage();
        searchPage.searchForItem();

        Assert.assertEquals(searchPage.searchItemsReturned(), searchPage.getExpectedCount());
    }
    @Test
    public void userShouldBeAbleToSearchForNike(){
        homePage.navigateToHomePage();
        searchPage.searchForNike();

        Assert.assertEquals(searchPage.searchItemsReturned(),3);
    }
    @Test
    public void userShouldBeAbleToChangeCurrency(){
        homePage.navigateToHomePage();
        Assert.assertEquals(currencyChangePage.getCurrency(),"US Dollar");

        currencyChangePage.changeCurrencyToEuro();

        Assert.assertEquals(currencyChangePage.getCurrency(),"Euro");
    }
    @Test
    public void userShouldBeAbleToGoToSoftwarePage(){
        homePage.navigateToHomePage();
        computerSoftwarePage.goToSoftwarePage();
        Assert.assertEquals(computerSoftwarePage.getAddToCartButtonCount(),3);
    }
    @Test
    public void userShouldBeAbleToGoToComputerMenuPage(){
        homePage.navigateToHomePage();
        computerSoftwarePage.goToComputerMenuPage();
        Assert.assertEquals(computerSoftwarePage.getAddToCartButtonCount(),computerSoftwarePage.getExpectedComputerMenuItemCount());
    }
    @Test
    public void userShouldBeAbleToGoToFaceBookPage(){
        faceBook.gotoFaceBookPage();
        String url = faceBook.currentPage();
        System.out.println(url);
        Assert.assertTrue(url.contains("facebook.com"));
    }
    @Test
    public void userShouldBeAbleToOpenAlertPage(){
        alertPage.openAlert();

    }
    @Test
    public void userExploreTestData(){
        computerSoftwarePage.goToSoftwarePage();
        try {
            computerSoftwarePage.takeScreenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
