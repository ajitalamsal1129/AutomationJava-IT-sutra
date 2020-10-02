package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();

       // WebElement email=wd.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        WebElement email=wd.findElement(By.id("identifierId"));//try not to use div
        email.sendKeys("ajitalamsal1129@gmail.com");

//It you get error,try to check locator in real time
        //WebElement nextbutton=wd.findElement(By.xpath("//*[@id='identifierNext']"));
       WebElement nextbutton=wd.findElement(By.id("identifierNext"));
        nextbutton.click();
        //or, since click is an action webElement is not required
        // wd.findElement(By.id("identifierNext")).click();

        WebElement password=wd.findElement(By.name("password"));
        password.sendKeys("Purplecandy01");

        WebElement loginbutton=wd.findElement(By.id("passwordNext"));
        loginbutton.click();






    }
}


