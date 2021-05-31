package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomepagePage {

    public  HomepagePage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement acceptButton;

    @FindBy (xpath = "//h4[.='Traveling notarization']")
    public WebElement travelingNotarizationClick;


    public void enterTravelingNotarizationPage(){
        travelingNotarizationClick.click();
    }


    public void homepageEntry() {
        acceptButton.click();
    }
}
