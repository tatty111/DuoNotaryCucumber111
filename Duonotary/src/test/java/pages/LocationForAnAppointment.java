package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LocationForAnAppointment {

    public LocationForAnAppointment() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//input[@id='zip-code-input']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@class = 'btn myBtn']")
    public WebElement backButton;

    @FindBy (xpath = "//button[@class = 'btn myBtn nextColor']")
    public WebElement nextButton;

















}
