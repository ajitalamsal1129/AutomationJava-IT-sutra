package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _9CartFunctionality {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(5000);

        WebElement dress = wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        dress.click();
        Thread.sleep(5000);

        JavascriptExecutor jss = (JavascriptExecutor) wd;
        jss.executeScript("window.scrollBy(0,1000)");

        WebElement image = wd.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img"));
        image.click();
        Thread.sleep(5000);

        JavascriptExecutor jsss = (JavascriptExecutor) wd;
        jsss.executeScript("window.scrollBy(0,500)");

        WebElement view = wd.findElement(By.xpath("//*[@id=\"view_full_size\"]/span"));
        view.click();
        Thread.sleep(5000);

        WebElement cross = wd.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/a"));
        cross.click();

        WebElement plus = wd.findElement(By.className("icon-plus"));
        plus.click();
        plus.click();
        Thread.sleep(5000);

//        WebElement size = wd.findElement(By.xpath("//*[@id=\"attributes\"]/fieldset[1]"));
//        Select act=new Select(size);
//        act.selectByIndex(2);

        WebElement add = wd.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        add.click();
        Thread.sleep(5000);

        Assert.assertEquals(wd.findElement(By.id("layer_cart_product_quantity")).getText(),"3");
        Thread.sleep(5000);

        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"layer_cart_product_price\"]")).getText(),"$49.20");
        Thread.sleep(5000);

        WebElement exit = wd.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
        exit.click();
        wd.quit();













    }
}