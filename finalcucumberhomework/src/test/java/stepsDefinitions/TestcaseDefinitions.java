package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.PageObject;

import javax.swing.*;
import java.util.List;
import java.util.Random;

public class TestcaseDefinitions {
    WebDriver driver;
    PageObject pageObject;

    public TestcaseDefinitions() {
        this.driver = Hooks.driver;
        this.pageObject = new PageObject(driver);
    }

    //    Test case 1
    @Given("^Open web testmaster.vn$")
    public void open_web_testmastervn() throws Throwable {
        this.pageObject.openWeb();
    }

    @When("^input email don't matching format (.+) on the textbox$")
    public void input_email_dont_matching_format_on_the_textbox(String inputtext) throws Throwable {
        this.pageObject.TxtEmail.sendKeys("inputtext");
        this.pageObject.TxtEmail.sendKeys(Keys.ENTER);
    }

    @Then("^Message \"([^\"]*)\"$")
    public void message_something(String Messageemailerror) throws Throwable {
        WebDriverWait wait = new WebDriverWait(this.driver, 15);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.TxtMessageErorrEmail));
        Assert.assertEquals(Messageemailerror, this.pageObject.TxtMessageErorrEmail.getText());

    }

    @And("^Show color of bold text error \"([^\"]*)\" is show$")
    public void show_color_of_bold_text_error_something_is_show(String ColorOfBorder) throws Throwable {
        Assert.assertEquals(ColorOfBorder, this.pageObject.TxtEmail.getCssValue("border-color"));
    }

    /*Testcase 2 */
    @Given("Open web page")
    public void open_web_page() {
        // Write code here that turns the phrase above into concrete actions
        this.pageObject.openWeb();
    }


    @When("^input email exists  \"([^\"]*)\" on the textbox$")
    public void input_email_exists_something_on_the_textbox(String Emailvalid) throws Throwable {
        this.pageObject.TxtEmail.sendKeys("khanh.tx@live.com");
        this.pageObject.TxtEmail.sendKeys(Keys.ENTER);
    }

    @Then("^Message \"([^\"]*)\" is show$")
    public void message_something_is_show(String Mesageexists) throws Throwable {
        WebDriverWait wait = new WebDriverWait(this.driver, 15);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.BtnAccept));
        Assert.assertEquals(Mesageexists, this.pageObject.TextPU.getText());

    }

    // focus vào filed email sau khi click vào button " Dong y "
    @When("^click on button accept$")
    public void click_on_button_accept() throws Throwable {
        this.pageObject.BtnAccept.click();
    }

    @Then("focus set on the filed Email")
    public void focus_set_on_the_filed_email() {
        WebDriverWait wait = new WebDriverWait(this.driver, 15);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.TxtEmail));
        Assert.assertEquals(this.driver.switchTo().activeElement(), this.pageObject.TxtEmail);
    }


    @Then("Text of email will clear")
    public void text_of_email_will_clear() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(this.pageObject.TxtEmail.getText().isEmpty());
    }

    /*   Testcase 3 */

    @Given("^Open web page master$")
    public void open_web_page_master() throws Throwable {
        this.pageObject.openWeb();
    }


    @When("^input email valid  \"([^\"]*)\" on the textbox$")
    public void input_email_valid_something_on_the_textbox(String inputemailvalid) throws Throwable {
        this.pageObject.TxtEmail.sendKeys(inputemailvalid);
        this.pageObject.TxtEmail.sendKeys(Keys.ENTER);
    }

    @Then("^informantion screen is display \"([^\"]*)\"$")
    public void informantion_screen_is_display_something(String Screeninformation) throws Throwable {
        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.ScreenInformation));
        Assert.assertEquals(this.pageObject.ScreenInformation.getAttribute("textContent"), Screeninformation);

    }

    @And("^default vaule is focus on the \"([^\"]*)\" of gender textbox$")
    public void default_vaule_is_focus_on_the_something_of_gender_textbox(String Txtgender) throws Throwable {
        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.Textgender));
        Assert.assertEquals(this.pageObject.Textgender.getText(), Txtgender);
    }

    @And("^default vaule is focus on the \"([^\"]*)\" of field Fullname$")
    public void default_vaule_is_focus_on_the_something_of_field_fullname(String Choosetextoption) throws Throwable {
        Assert.assertEquals(this.pageObject.TextChooseOption.getText(), Choosetextoption);
    }

    @And("^default vaule is focus mouse on the Fullname fields$")
    public void default_vaule_is_focus_mouse_on_the_fullname_fields() throws Throwable {
        Assert.assertEquals(this.pageObject.FocusFullname, this.driver.switchTo().activeElement());
    }
    /*testcase 4*/

    @When("^don't input email and click on button Accpect screen information$")
    public void dont_input_email_and_click_on_button_accpect_screen_information() throws Throwable {
        this.pageObject.AcceptScreen.click();
    }

    @Then("^Message error screen  \"([^\"]*)\" is show$")
    public void message_error_screen_something_is_show(String TxtMessagErrorscreen) throws Throwable {
        Assert.assertEquals(this.pageObject.TxtMessagErrorscreen.getAttribute("textContent"), TxtMessagErrorscreen);

    }

    @And("^highlight color on the Fullname fields$")
    public void highlight_color_on_the_fullname_fields() throws Throwable {
        String Colortextbox = "rgba(255, 255, 0, 1)";
        Assert.assertEquals(this.pageObject.FocusFullname.getCssValue("background-color"), Colortextbox);
    }

    /*Testcase 5*/
    @When("^Click button Escape will pupop close$")
    public void click_button_escape_will_pupop_close() throws Throwable {
        this.pageObject.FocusFullname.sendKeys(Keys.ESCAPE);
    }

    @Then("Focus mouse on the register textbox")
    public void focus_mouse_on_the_register_textbox() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotEquals(this.pageObject.TxtEmail, this.driver.switchTo().activeElement());
    }

    /*Testcase 6 */
    @Given("^open testmaster to register account valid$")
    public void open_testmaster_to_register_account_valid() throws Throwable {
        this.pageObject.openWeb();
    }

    @When("^input email valid on the register fields and click button register$")
    public void input_email_valid_on_the_register_fields_and_click_button_register() throws Throwable {
        Random rdnt=new Random();
        int characters=rdnt.nextInt(1000);
        this.pageObject.TxtEmail.sendKeys("Thuonglv"+characters+"@gmail.con");
        this.pageObject.BtnLogin.click();

    }

    @When("Input text Fullname\" Le van Thuong\" on the textbox and choose option random and click button accecpt")
    public void input_text_fullname_le_van_thuong_on_the_textbox_and_choose_option_random_and_click_button_accecpt() {
        // Write code here that turns the phrase above into concrete actions

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.ScreenInformation));
        this.pageObject.FocusFullname.sendKeys("Le Van Thuong");
        // chon random gender
        Actions mouseaction = new Actions(this.driver);
        mouseaction.moveToElement(this.pageObject.Textgender).click().perform();
        List<WebElement> LsGenders = this.driver.findElements(By.cssSelector("ul[aria-labelledby=\"ddlGender\"] li"));
        Random rdn = new Random();
        int rdnIndex = rdn.nextInt(LsGenders.size());
        mouseaction.moveToElement(LsGenders.get(rdnIndex)).click().perform();
//        Chọn random loi muon nhan
        mouseaction.moveToElement(this.pageObject.TextChooseOption).click().perform();
        List<WebElement> LsChoose = this.driver.findElements(By.cssSelector("[aria-labelledby=\"ddlNewsType\"] li"));
        int choose=rdn.nextInt(LsChoose.size());
        mouseaction.moveToElement(LsChoose.get(choose)).click().perform();
        this.pageObject.AcceptScreen.click();


    }

    @Then("^show screen \"([^\"]*)\"$")
    public void show_screen_something(String MessagePU) throws Throwable {
        WebDriverWait wait=new WebDriverWait(this.driver,20);
        wait.until(ExpectedConditions.visibilityOf(this.pageObject.TextMessageScreenPU));
        Assert.assertEquals(this.pageObject.TextMessageScreenPU.getAttribute("textContent"),MessagePU);

    }
}
