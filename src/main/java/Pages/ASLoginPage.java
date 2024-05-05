package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//https://cdn.budgy.elastic.snaplogicdev.com/sl/login.html

public class ASLoginPage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@type='email']")
    private WebElement asusername;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement aspassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement assubmit;

    @FindBy(xpath = "//div[@id='slc-header-tab-Designer']")
    private WebElement designerheader;

    public ASLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void asusernamemeth(String username){
        asusername.sendKeys(username);
    }

    public void aspasswordmeth(String password){
        aspassword.sendKeys(password);
    }

    public void submitleth(){
        assubmit.click();
    }

    public void loginvalidate(){
        designerheader.isDisplayed();
    }

    public void login(String username, String password){
        asusername.sendKeys(username);
        asusername.sendKeys(password);
    }

}
