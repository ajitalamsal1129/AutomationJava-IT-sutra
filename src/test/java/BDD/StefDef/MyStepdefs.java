package BDD.StefDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver wd;
    @Given("^User is in gmail login page$")
    public void userIsInGmailLoginPage() {
        WebDriverManager.chromedriver().setup();
         wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
    }

    @When("^Enters valid user in their field$")
    public void entersValidUserInTheirField() {
        WebElement email = wd.findElement(By.id("identifierId"));
        email.sendKeys("ajitalamsal1129@gmail.com");
    }


        @And("^Click next button$")
    public void clickNextButton() throws InterruptedException {
            WebElement nextbutton=wd.findElement(By.id("identifierNext"));
            nextbutton.click();
            Thread.sleep(5000);


        }

    @And("^Enters valid password in password field$")
    public void entersValidPasswordInPasswordField() {
        WebElement password=wd.findElement(By.name("password"));
        password.sendKeys("Purplecandy01");

    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        WebElement loginbutton=wd.findElement(By.id("passwordNext"));
        loginbutton.click();

    }

    @Then("^Verify user is on email profile page$")
    public void verifyUserIsOnEmailProfilePage() {
    }
}
