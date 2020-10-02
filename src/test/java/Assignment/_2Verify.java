package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2Verify {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        WebElement searchbox = wd.findElement(By.id("search_query_top"));
        searchbox.sendKeys("saree");

        WebElement searchbutton = wd.findElement(By.name("submit_search"));
        searchbutton.click();
        Thread.sleep(8000);

        String expectedMessage = ("No results were found for your search \"saree\"");
        WebElement actualMessage = wd.findElement(By.xpath("//*[@id='center_column']/p"));
        Assert.assertEquals(expectedMessage, actualMessage.getText());
        Thread.sleep(8000);


    }
}


