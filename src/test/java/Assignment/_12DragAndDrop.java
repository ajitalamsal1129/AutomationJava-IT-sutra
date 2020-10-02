package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _12DragAndDrop {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get(" http://demo.guru99.com/test/drag_drop.html");
        wd.manage().window().maximize();
        Thread.sleep(5000);

        JavascriptExecutor jss = (JavascriptExecutor) wd;
        jss.executeScript("window.scrollBy(0,1000)");

        //Element which needs to drag.
        WebElement From=wd.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement To=wd.findElement(By.xpath("//*[@id='bank']/li"));

        //Using Action class for drag and drop.
        Actions act=new Actions(wd);

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();
        Thread.sleep(5000);

        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"t7\"]")).getText(),"0");
        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"t8\"]")).getText(), "0");

        WebElement Fromm=wd.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement Too=wd.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        Actions actt=new Actions(wd);
        actt.dragAndDrop(Fromm, Too).build().perform();
        Thread.sleep(5000);

        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"t7\"]")).getText(),"5000");
        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"t8\"]")).getText(), "0");

        WebElement Frommm=wd.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement Tooo=wd.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        Actions acttt=new Actions(wd);
        acttt.dragAndDrop(Frommm, Tooo).build().perform();
        Thread.sleep(5000);

        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"t7\"]")).getText(),"5000");
        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"bal3\"]/table/tbody/tr/td[4]")).getText(), "0");

        WebElement Frommmm=wd.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement Toooo=wd.findElement(By.xpath("//*[@id=\"amt8\"]"));
        Actions actttt=new Actions(wd);
        actttt.dragAndDrop(Frommmm, Toooo).build().perform();
        Thread.sleep(5000);

        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText(),"Perfect!");















    }
}

