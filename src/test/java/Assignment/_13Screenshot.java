package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class _13Screenshot {
    static WebDriver wd;

    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();

        WebElement email = wd.findElement(By.id("identifierId"));//try not to use div
        email.sendKeys("ajitalamsal1129@gmail.com");
        Thread.sleep(5000);

        WebElement nextbutton = wd.findElement(By.id("identifierNext"));
        nextbutton.click();
        Thread.sleep(5000);

        WebElement password = wd.findElement(By.name("password"));
        password.sendKeys("Purplecandy01");
        Thread.sleep(5000);

        WebElement loginbutton=wd.findElement(By.id("passwordNext"));
        loginbutton.click();

        takescreenshot("Gmail_EmailPage.");
        takescreenshot("Gmail_PasswordPage.");
        takescreenshot("Gmail_HomePage");

    }

    public static void takescreenshot(String filename) throws IOException {

        File file = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("/Users/ajitalamsal/AutomationJava/src/test/java/Assignment/Screenshot/" + filename + ".jpg"));


    }


}
