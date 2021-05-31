package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.HomepagePage;
import pages.OrderInfoPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class OrderInfoPageStepDefs {

    public WebDriver driver;

    @Given("The user is on the Order info page")
    public void the_user_is_on_the_order_info_page() {
 new HomepagePage().enterTravelingNotarizationPage();

        OrderInfoPage oip = new OrderInfoPage();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.addressField.sendKeys("11341 Crescent Dr, Fairfax, VA 22030, USA");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.hiddenAddressField.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.clickNextButton();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        String expectedTitle = "Traveling (mobile) notary services | DuoNotary";
//        Assert.assertTrue(driver.getTitle().equals(expectedTitle));
    }


    @When("The user clicks on Real Estate and Refinance")
    public void the_user_clicks_on_real_estate_and_refinance() {
        OrderInfoPage oip = new OrderInfoPage();
        oip.realEstateAndRefinance.click();
    }


    @Then("The user selects Home buyer\\/seller from the dropdown menu")
    public void the_user_selects_home_buyer_seller_from_the_dropdown_menu() {
        OrderInfoPage oip = new OrderInfoPage();
        new Select(oip.getRealEstateAndRefinanceRequestorSelect).selectByVisibleText("Home buyer/seller");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Then("In Additional Services increases Printing by five and decreasing by two and verifies the price")
    public void in_additional_services_increases_printing_by_and_decreasing_by_and_verifies_the_price() {
        OrderInfoPage oip = new OrderInfoPage();

        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal1 = "300.00";
//        Assert.assertTrue(driver.getPageSource().contains(expectedTotal1));
        String totalPrice = oip.totalPrice.getText();
        System.out.println(totalPrice);
//        Assert.assertTrue(totalPrice.equals(expectedTotal1));

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.getGetRealEstateAndRefinancePrintingDecrease.click();
        oip.getGetRealEstateAndRefinancePrintingDecrease.click();

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal2 = "250.00";
//        String totalPrice = oip.totalPrice.getText();
//        Assert.assertTrue(driver.getPageSource().contains(expectedTotal2));
        Assert.assertTrue(totalPrice.equals(expectedTotal2));
    }


    @Then("In Additional Services increases Drop off at post office by ten and decreases by three and verifies the price")
    public void in_additional_services_increases_drop_off_at_post_office_by_and_decreases_by_and_verifies_the_price() {


        OrderInfoPage oip = new OrderInfoPage();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal5 = "500.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal5));

        oip.getGetRealEstateAndRefinancePrintingDecrease.click();
        oip.getGetRealEstateAndRefinancePrintingDecrease.click();
        oip.getGetRealEstateAndRefinancePrintingDecrease.click();

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal6 = "425.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal6));

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Then("Uploads a document")
    public void uploads_a_document() {
        OrderInfoPage oip = new OrderInfoPage();
        oip.getRealEstateAndRefinanceUploadButton.sendKeys("C:\\Users\\honey\\Downloads\\Document 6.docx");
    }


    @Then("Clicks next and verifies that the user is on the Data\\/Info Page")
    public void clicks_next_and_verifies_that_the_user_is_on_the_data_info_page() {
        new OrderInfoPage().nextButton.click();
    }




}
