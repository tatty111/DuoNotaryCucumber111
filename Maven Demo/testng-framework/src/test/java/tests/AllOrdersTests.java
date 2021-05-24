package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllOrdersPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllOrdersTests extends TestBase{

    @BeforeMethod (alwaysRun = true)
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }



    @Test (groups = "smoke")

    public void verifyCheckAllButton(){

        AllOrdersPage allOrdersPage = new AllOrdersPage();

        allOrdersPage.checkAllCheckboxes();

        for (WebElement checkbox: allOrdersPage.checkboxes) {
            Assert.assertTrue(checkbox.isSelected());
        }


    }

    @Test
    public void verifyUncheckAllButton(){

       AllOrdersPage allOrdersPage = new AllOrdersPage();
        allOrdersPage.checkAllButton.click();
        allOrdersPage.uncheckAllButton.click();

        for (WebElement checkbox: allOrdersPage.checkboxes
             ) {
            Assert.assertTrue(!checkbox.isSelected());
        }


    }


    @Test
    public void verifyDeleteButton(){
        // Login to the app


        AllOrdersPage allOrdersPage = new AllOrdersPage();

        allOrdersPage.checkAllCheckboxes();
        allOrdersPage.deleteButton.click();

        String actual = allOrdersPage.message.getText();

        String expected = "List of orders is empty. In order to add new order use this link.";

        Assert.assertEquals(actual, expected);


    }


}
