package Panda;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Panda {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.google.com/?client=safari");
        wd.manage().window().maximize();
        Thread.sleep(5000);


        WebElement searchbox = wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        searchbox.sendKeys("Panda", Keys.ENTER);
        Thread.sleep(5000);

        List<WebElement> links=wd.findElements(By.cssSelector(".LC20lb.DKV0Md"));
       for (WebElement w: links) {
           //System.out.println(w.getText()+"\n");
           if(w.getText().contains("|")) {  //filtersout and adds to arraylist
               String[] s=w.getText().split("\\|"); //ref to | , array create
               System.out.println(s[1]); //after first |
                if(s[1].contains("Zoo"))
                   System.out.println("1");
                else
                   System.out.println("0");
           }
        }
   }







        ;




}

