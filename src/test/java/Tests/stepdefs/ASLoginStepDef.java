package Tests.stepdefs;

import Pages.ASLoginPage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ASLoginStepDef {
    private WebDriver driver;
    private ASLoginPage asloginpage;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        asloginpage = new ASLoginPage(driver);
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("user is on login page of AS")
    public void user_is_on_login_page_of_AS(){
        driver.get("https://cdn.budgy.elastic.snaplogicdev.com/sl/login.html");
    }

    @When("user enters username and password of AS")
    public void user_enters_username_and_password_of_AS(){
        asloginpage.asusernamemeth("vkrishna@snaplogic.com");
        asloginpage.aspasswordmeth("Vvvrmvvk5.6");
    }

    @When("clicks on login button of AS")
    public void clicks_on_login_button_of_AS(){
        asloginpage.submitleth();
        int waitTime = 20;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slc-header-tab-Designer']")));
    }

    @Then("user is navigated to home page of AS")
    public void user_is_navigated_to_home_page_of_AS(){
        asloginpage.loginvalidate();
    }

}
