package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WomenSearch {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(8000);

        WebElement women = wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        women.click();

        //JavascriptExecutor js=(JavascriptExecutor) wd;
        JavascriptExecutor js=(JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1500)");

        WebElement slider= wd.findElement(By.id("layered_price_slider"));//slider
        Actions act=new Actions(wd);
        act.dragAndDropBy(slider,300,0).release().perform();
        Thread.sleep(8000);





    }
}


