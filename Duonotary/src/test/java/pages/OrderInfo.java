package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderInfo {


    public OrderInfo() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//div[@class='TitleOfOrder2'][.='Apostille Service']")
    public WebElement apostilleService;

    @FindBy (xpath = "//div[@class='TitleOfOrder2'][.='Real Estate & Refinance']")
    public WebElement realEstateAndRefinance;

    @FindBy (xpath = "//div[@class='TitleOfOrder2'][.='Notary Public']")
    public WebElement notaryPublic;

    @FindBy (xpath = "//div[@class='TitleOfOrder2'][.='I-9 Verification']")
    public WebElement i9Verification;

    @FindBy (xpath = "//div[@class='TitleOfOrder2'][.='Embassy Legalization']")
    public WebElement embassyLegalization;

    @FindBy (xpath = "//button[@class = 'btn myBtn nextColor']")
    public WebElement nextButton;






















}
