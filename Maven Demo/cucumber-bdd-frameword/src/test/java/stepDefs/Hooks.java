package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterMethod;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setupScenario() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();


    }

    @After
    public void tearDownDriver() {
        Driver.quitDriver();
    }


}
