package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepage extends TestBase{

    @Test
    public void test1() {


        String expected = "TRAVELING NOTARIZATION";

//     if (driver.getTitle().contains(expected)) {
//         System.out.println("pass");
//     }else {
//         System.out.println("fail");
//     }
    Assert.assertTrue(driver.getTitle().contains(expected));
        driver.findElement(By.xpath("//h4[.='Traveling notarization']")).click();


    }


    }
