package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class PageObject {
    WebDriver driver;
    @FindBy(css = "input[type=\"email\"]")
    public WebElement TxtEmail;
    @FindBy(css = ".next-btn-primary")
    public WebElement BtnLogin;
    @FindBy(css = ".mod-input span")
    public WebElement TxtMessageErorrEmail;
    @FindBy(id = "allow-button")
    public WebElement BtnAccept;
    @FindBy(css = ".body-message")
    public WebElement TextPU;
    @FindBy(css = ".popover-body p b")
    public WebElement ScreenInformation;
    @FindBy(id = "ddlGender")
    public WebElement Textgender;
    @FindBy(id = "ddlNewsType")
    public WebElement TextChooseOption;

    @FindBy(css = ".form-control")
    public WebElement FocusFullname;
    @FindBy(css = "div.error")
    public WebElement TxtMessagErrorscreen;
    @FindBy(css = "button#allow-button")
    public WebElement AcceptScreen;
    @FindBy(css = "ul[aria-labelledby=\"ddlGender\"] li")
    public WebElement Listgender;
    @FindBy(css = "[aria-labelledby=\"ddlNewsType\"] li")
    public WebElement ListChoose;
    @FindBy(css = ".body-message")
    public WebElement TextMessageScreenPU;


    public PageObject(WebDriver driver) {

        this.driver = driver;
    }

    public void openWeb() {
        this.driver.get("http://testmaster.vn/");
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);


    }
}
