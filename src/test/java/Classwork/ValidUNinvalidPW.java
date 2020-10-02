package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidUNinvalidPW {
    //valid email id and invalid password
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();

        // WebElement email=wd.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        WebElement email = wd.findElement(By.id("identifierId"));//try not to use div
        email.sendKeys("ajitalamsal1129@gmail.com");

      //It you get error,try to check locator in real time
        //WebElement nextbutton=wd.findElement(By.xpath("//*[@id='identifierNext']"));
        WebElement nextbutton = wd.findElement(By.id("identifierNext"));
        nextbutton.click();
        Thread.sleep(8000);

        WebElement password=wd.findElement(By.name("password"));
        password.sendKeys("Ajita123");

        WebElement loginbutton=wd.findElement(By.id("passwordNext"));
        loginbutton.click();
        Thread.sleep(8000);

        String expectedMessage = "Wrong password. Try again or click Forgot password to reset it.";
        WebElement actualMessage = wd.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        Assert.assertEquals(expectedMessage, actualMessage.getText());//Comparing expected and actual

    }
}