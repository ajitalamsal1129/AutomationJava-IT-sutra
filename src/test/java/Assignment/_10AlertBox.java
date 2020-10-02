package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10AlertBox {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        wd.manage().window().maximize();
        Thread.sleep(5000);

        JavascriptExecutor jss = (JavascriptExecutor) wd;
        jss.executeScript("window.scrollBy(0,1000)");

        WebElement simple = wd.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
        simple.click();
        // Switching to Alert
        Alert alert = wd.switchTo().alert();

        // Capturing alert message.
        String alertMessage= wd.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();
        Thread.sleep(5000);

        WebElement Confirmpop= wd.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button"));
        Confirmpop.click();
        Thread.sleep(5000);
        wd.switchTo().alert().dismiss();//To click on the 'Cancel' button of the alert.

        WebElement prompt= wd.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button"));
        prompt.click();
        // Switching to Alert
        Alert alerts = wd.switchTo().alert();

        // Capturing alert message.
        String alertMessages= wd.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessages);
        Thread.sleep(5000);

        // Accepting alert
        alerts.accept();
        Thread.sleep(5000);








    }
}
