package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

    @Test
    public void openFirefoxBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
        wd.quit();


    }
}
