import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class MyStepdefs_signupGoogle {
    WebDriver driverObj;

    @Given("I launch Firefox browser for Google")
    public void iLaunchFirefoxBrowserForGoogle() {
        System.setProperty("webdriver.gecko.driver", "/Users/Triin/IdeaProjects/signupGoogle/geckodriver");
        driverObj = new FirefoxDriver();
    }

    @When("I open Google sign up page")
    public void iOpenGoogleSignUpPage() {
        driverObj.get("https://accounts.google.com/SignUp");

    }

    @Then("I enter user data and press next button")
    public void iEnterUserDataAndPressNextButton() {
        driverObj.manage().deleteAllCookies();
        driverObj.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driverObj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driverObj.findElement(By.name("firstName")).sendKeys("Triin");
        driverObj.findElement(By.name("lastName")).sendKeys("Evard");
        driverObj.findElement(By.name("Username")).sendKeys("TriinEvardTesting23");
        driverObj.findElement(By.name("Passwd")).sendKeys("eibDBLwosnj123!");
        driverObj.findElement(By.name("ConfirmPasswd")).sendKeys("eibDBLwosnj123!");
        driverObj.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driverObj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
        driverObj.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @And("Close browser")
    public void closeBrowser() {
        driverObj.quit();

    }
}
