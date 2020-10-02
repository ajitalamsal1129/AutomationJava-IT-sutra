package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    ChromeDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
    }

    @Test
    public void ShowAlert() throws InterruptedException {

        WebElement cusId = driver.findElement(By.name("cusid"));
        cusId.sendKeys("53928");
        Thread.sleep(8000);

        WebElement button = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        button.click();

        //driver.switchTo().alert().getText();//to capture text
        //driver.switchTo().alert().accept();//to click ok

        //Switching to alert
        Thread.sleep(8000);
      //  Alert alert = driver.switchTo().alert();
       // Assert.assertEquals(alert.getText(),"Do you really want to delete this Customer?");
        driver.switchTo().alert().accept();
    }

    @After
    public void close(){
        driver.quit();
    }










    }


