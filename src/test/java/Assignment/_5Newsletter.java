package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5Newsletter {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        WebElement newsletter = wd.findElement(By.id("newsletter-input"));
        newsletter.sendKeys("ajital.0424@gmail.com");

        WebElement submit = wd.findElement(By.name("submitNewsletter"));
        submit.click();

        String expectedMessage = "Newsletter : You have successfully subscribed to this newsletter.";
        WebElement actualMessage = wd.findElement(By.xpath("//*[@id=\"columns\"]/p"));
        Assert.assertEquals(expectedMessage, actualMessage.getText());//Comparing expected and actual

    }
}