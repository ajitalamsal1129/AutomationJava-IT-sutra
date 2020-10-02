package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    @Test
      public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager. chromedriver().setup();
        WebDriver wd= new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
        wd.quit();

    }
}
