package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import utilities.Driver;

public class SearchStepDefs {


    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {


        Driver.getDriver().get("http://automationpractice.com/index.php");

    }
    @When("The user enters a term Blouse to the search bar")
    public void the_user_enters_a_term_blouse_to_the_search_bar() {

        Driver.getDriver().findElement(By.id("search_query_top")).
                sendKeys("Blouse" + Keys.ENTER);

    }
    @Then("The search result should contain the term Blouse")
    public void the_search_result_should_contain_the_term_blouse() {

        String actual =  Driver.getDriver().findElement(By.xpath("(//a[@title='Blouse'])[2]")).getText();
        Assert.assertTrue(actual.equals("Blouse"));
    }

    @When("user eneters a term Blouse on a search bar")
    public void user_eneters_a_term_blouse_on_a_search_bar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the search result should contain the term Blouse")
    public void the_search_result_should_contain_the_term_blouse() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }







}
