package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.HomepagePage;
import pages.OrderInfoPage;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;

    @Before
    public void setupScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        BrowserUtilities.jsClick(Driver.getDriver().findElement(By.xpath("//button [contains(text(), 'Accept')]")));


    }

//    @Before ("@db")  // this before hook will run only before the scenarios that are tagged with @db
//    public void setupDB(){
//        System.out.println("Setting up the DB");
//
//    }


    @After
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failed_scenario");
        }

//        Driver.quitDriver();
    }



}
