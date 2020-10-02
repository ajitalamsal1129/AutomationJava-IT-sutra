package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4Footer {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        boolean isEnabled=wd.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div")).isEnabled();
        boolean isDisplayed=wd.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div")).isDisplayed();
        if (isEnabled){
            System.out.println("footer is enabled");
        }else{
            System.out.println("footer is not enabled");

        }
        if (isDisplayed){
            System.out.println("footer is displayed");
        }else{
            System.out.println("footer is not displayed");



        }

        }




    }
