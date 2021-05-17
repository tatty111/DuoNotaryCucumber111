package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LocationForAnAppointment extends TestBase{


    @Test
    public void positiveTestZipcode() {

        driver.findElement(By.xpath("//h4[.='Traveling notarization']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='zip-code-input']")).sendKeys("11341 Crescent Dr, Fairfax, VA 22030");
        driver.findElement(By.xpath("//li[@class='address-li']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(("//button[@class = 'btn myBtn nextColor']"))).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTitle = "Select our service";

             if (driver.getTitle().contains(expectedTitle)) {
         System.out.println("pass");
     }else {
         System.out.println("fail");

     }
        driver.findElement(By.xpath("//div[@class='TitleOfOrder2'][.='Apostille Service']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='documentType']")).sendKeys("Document" + Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='col-md-6 d-flex align-items-center']//i[@class='fas fa-plus']")).click();
        driver.findElement(By.xpath("//div[@class='labelBlockReal']")).click();
        driver.findElement(By.xpath("//input[@name='requesterFirstName']")).sendKeys("Harry" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='requesterLastName']")).sendKeys("Potter" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='requesterPhoneNumber']")).sendKeys("1112223333" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='requesterEmail']")).sendKeys("harrypotter@hogwarts.com" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='pickUpAddress']")).sendKeys("4 Privet Drive, Little Whinging, Surrey, 77777" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("btn myBtn nextColor")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }

        @Test
    public void NegativeTestZipcode() {

        driver.findElement(By.xpath("//h4[.='Traveling notarization']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='zip-code-input']")).sendKeys("20 W 34th St, New York, NY 10001");
        driver.findElement(By.xpath("//li[@class='address-li']")).click();
        driver.findElement(By.xpath(("//button[@class = 'btn myBtn nextColor']"))).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            String expectedMessage = "Oops, our service doesn't exist in this location.";
            WebElement errorMessage = driver.findElement(By.xpath("//p[@color='warning']"));

            assertTrue(errorMessage.isDisplayed());
            assertEquals(errorMessage.getText(), expectedMessage);

        }


}
















