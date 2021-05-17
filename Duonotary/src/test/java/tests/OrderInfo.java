package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrderInfo extends TestBase{

@Test

public void apostilleServicePositiveTest() {


    driver.findElement(By.xpath("//h4[.='Traveling notarization']")).click();
   LocationForAnAppointment location = new LocationForAnAppointment();
   location.positiveTestZipcode();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   driver.findElement(By.xpath("//div[@class='TitleOfOrder2'][.='Apostille Service']")).click();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   WebElement element = driver.findElement(By.id("countryId"));
    Select select = new Select(element);
    select.selectByValue("Select country");

}



}
