package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;

    static ExtentReports reporter;
    static ExtentSparkReporter htmlReporter;
    static ExtentTest logger;


    @BeforeSuite (alwaysRun = true)
    public void setupSuite() {
        reporter = new ExtentReports();
        htmlReporter = new ExtentSparkReporter();
        }


    @BeforeMethod (alwaysRun = true)
    @Parameters ("browser")
    public void setUpMethod(@Optional String browser){

        driver = Driver.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(){
        Driver.quitDriver();
    }
}
