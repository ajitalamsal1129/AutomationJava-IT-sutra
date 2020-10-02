package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _7ImageHandling {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        WebElement dress = wd.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
        dress.click();

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1500)");

        WebElement list = wd.findElement(By.className("icon-th-list"));
        list.click();
        Thread.sleep(8000);

        WebElement fourth = wd.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div/div[1]/div/a[1]/img"));
        fourth.click();
       Thread.sleep(8000);







    }
}
