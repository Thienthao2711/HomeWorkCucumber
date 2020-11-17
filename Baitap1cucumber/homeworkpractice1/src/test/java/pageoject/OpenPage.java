package pageoject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenPage {
    WebDriver driver;
    @FindBy(name = "login-email")
    public WebElement TxtEmail;
    @FindBy(name = "login-pwd")
    public WebElement TxtPassword;
    @FindBy(className = "login-email-tip")
    public WebElement TxtMessageUserError;

    @FindBy(className = "login-pwd-tip")
    public WebElement TxtMessagePasswordError;
    @FindBy(name = "login-submit")
    public WebElement BtnLogin;
    public List<WebElement> listsuggestemail;

    public OpenPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openBrowser() {
        this.driver.get("https://www.banggood.com/login.html");
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);

    }


    public List<WebElement> getListsuggestemail() {
        WebDriverWait waitlist = new WebDriverWait(this.driver, 15);
        waitlist.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.cssSelector("label.login-email ul.list li"))));
        this.listsuggestemail = this.driver.findElements(By.cssSelector("label.login-email ul.list li"));
        return listsuggestemail;


    }
}
