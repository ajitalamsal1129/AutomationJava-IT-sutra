package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singlecheckbox {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        WebElement checkbox = wd.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
        checkbox.click();

        String expectedMessage = ("Success - Check box is checked");
        WebElement actualMessage = wd.findElement(By.xpath("//*[@id=\"txtAge\"]"));
        Assert.assertEquals(expectedMessage, actualMessage.getText());
        Thread.sleep(8000);

        WebElement box = wd.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
        box.click();

        Boolean result= wd.findElement(By.xpath("//*[@id=\"txtAge\"]")).isDisplayed();
        System.out.println("Message is not displayed");






    }
}
