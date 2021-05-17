package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    WebDriver driver;


    @BeforeMethod
    @Parameters ("browser")
    public void setUpMethod(@Optional String browser){

        driver = Driver.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
    }




//    @AfterMethod
//    public void tearDownMethod(){
//        Driver.quitDriver();
//    }
}