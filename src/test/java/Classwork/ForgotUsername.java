package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotUsername {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F%3F.src%3Dfp%26guce_referrer%3DaHR0cHM6Ly93d3cueWFob28uY29tLw%26guce_referrer_sig%3DAQAAAEdXj8UEz01udKtR-NRS7NLK2OzZ0RTuK2XhZT8g783X-1Cg5wL8KAqiOuke58PNI-C_cGUgImTPW6zmsnkUBh6p6d2Pm5VrHJ50fl_zPtYMLcbWIzAKQ0cR378OU8GShuMgkJqKqDUy6HikIOvHiNo2k39dns8g94r_ttuXc21n");
        wd.manage().window().maximize();
        Thread.sleep(8000);


        WebElement forgot = wd.findElement(By.id("mbr-forgot-link"));
        forgot.click();
    }
}