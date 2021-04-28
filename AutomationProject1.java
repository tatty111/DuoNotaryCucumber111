import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class AutomationProject1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();

        int num = 1 + (int)(Math.random()*100);

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(num + "");

        String randomFirst = "";
        for (int i = 0; i < 5; i++) {
            //    randomS += (char)(97 + (int)(Math.random() * 26));
            char lower = (char) (97 + (int) (Math.random() * 26));
            char upper = (char) (65 + (int) (Math.random() * 26));

            if (i % 2 == 0) {
                randomFirst += lower;
            } else {
                randomFirst += upper;
            }}
        String randomLast = "";
        for (int i = 0; i < 5; i++) {
            //    randomS += (char)(97 + (int)(Math.random() * 26));
            char lower = (char) (97 + (int) (Math.random() * 26));
            char upper = (char) (65 + (int) (Math.random() * 26));

            if (i % 2 == 0) {
                randomLast += lower;
            } else {
                randomLast += upper;
            }}

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")). sendKeys(randomFirst + " " + randomLast);

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("8607 Westwood Center Dr");

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Vienna");

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");

        int zipcode = 1 + (int)(Math.random()*100000);

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys("" + zipcode);

        WebElement element = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_2"));

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        if(Math.random()>0.33){
            radioButtons.get(0).click();
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < 16; i++) {
                num1 = (int)(Math.random() * 99999999);
                num2 =   (int) (Math.random() * 9999999);
            }
            String str1 = Integer.toString(num1);
            String str2 = Integer.toString(num2);
            String visa = "4" + str1 + str2;

            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("" + visa);

        }else if(Math.random()>0.66){
            radioButtons.get(1).click();

            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < 16; i++) {
                num1 = (int)(Math.random() * 99999999);
                num2 =   (int) (Math.random() * 9999999);
            }
            String str1 = Integer.toString(num1);
            String str2 = Integer.toString(num2);
            String mastercard = "5" + str1 + str2;

            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("" + mastercard);
        }else{
            radioButtons.get(2).click();

            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < 16; i++) {
                num1 = (int)(Math.random() * 99999999);
                num2 =   (int) (Math.random() * 999999);
            }
            String str1 = Integer.toString(num1);
            String str2 = Integer.toString(num2);
            String amex = "3" + str1 + str2;

            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("" + amex);
        }

            driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("07/2027");

            driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

        String expectedTitle = "New order has been successfully added.";


        if (driver.getPageSource().contains(expectedTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }





    }
}
