package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3Empty {

    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        WebElement empty = wd.findElement(By.className("ajax_cart_no_product"));
        empty.click();

        String expectedMessage = "Your shopping cart is empty.";
        WebElement actualMessage = wd.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
        Assert.assertEquals(expectedMessage, actualMessage.getText());//Comparing expected and actual

    }


    }
