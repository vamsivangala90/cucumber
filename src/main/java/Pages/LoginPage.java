package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    private WebDriver driver;

    @FindBy(xpath = "//input[@name = \"email\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@type = \"password\"]")
    private WebElement pass;

    @FindBy(xpath = "//input[@value = \"Login\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//h2[text() = 'My Account']")
    private WebElement myaccountdisplayed;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enteremail(String username){
        email.sendKeys(username);
    }

    public void enterpassword(String password){
        pass.sendKeys(password);
    }

    public void clicklogin(){
        loginButton.click();
    }

    public void myaccountvisible(){
        myaccountdisplayed.isDisplayed();
    }

    public void login(String username, String password){
        email.sendKeys(username);
        pass.sendKeys(password);
        loginButton.click();
    }




}
