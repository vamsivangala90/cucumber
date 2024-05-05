package Tests.stepdefs;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageStepDef {

    private WebDriver driver;
    private LoginPage loginpage;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginpage = new LoginPage(driver);
    }

    @After
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }


    @Given("user is on login page")
    public void user_is_on_login_page(){
       driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password(){
        loginpage.enteremail("qatestertest@gmail.com");
        loginpage.enterpassword("Test@123");
    }

    @When("clicks on login button")
    public void clicks_on_login_button(){
        loginpage.clicklogin();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page(){
        loginpage.myaccountvisible();
    }



}
