package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8AddtoCart {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

       // WebElement product = wd.findElement(By.xpath("//*[@id='homefeatured']/li[3]/div/div[1]/div/a[1]/img"));
       // product.click();
       // Thread.sleep(8000);

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1000)");

        WebElement add = wd.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img"));
        add.click();

        JavascriptExecutor jss = (JavascriptExecutor) wd;
        jss.executeScript("window.scrollBy(0,1000)");

        WebElement cart = wd.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        cart.click();
        Thread.sleep(8000);

        String expectedMessage = "There is 1 item in your cart.";
        WebElement actualMessage = wd.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]"));
        Assert.assertEquals(expectedMessage, actualMessage.getText());//Comparing expected and actual

        WebElement cross = wd.findElement(By.className("cross"));
        cross.click();




    }
}




