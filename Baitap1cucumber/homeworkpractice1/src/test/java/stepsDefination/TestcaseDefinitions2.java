package stepsDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageoject.OpenPage;

import static org.junit.Assert.*;

public class TestcaseDefinitions2 {
    WebDriver driver;

    public TestcaseDefinitions2() {
        this.driver = Hooks.driver;
    }

    @Given("^Goto Banggood login page$")
    public void goto_banggood_login_page() throws Throwable {
        Hooks.openPage=new OpenPage(this.driver);
        Hooks.openPage.openBrowser();
    }

    @When("^the user attempt login with user blank and passowrd blank$")
    public void the_user_attempt_login_with_user_blank_and_passowrd_blank() throws Throwable {
        Hooks.openPage.BtnLogin.click();
        WebDriverWait wait=new WebDriverWait(this.driver,15);
        wait.until(ExpectedConditions.visibilityOf(Hooks.openPage.TxtMessagePasswordError));

    }


    @Then("^The message \"([^\"]*)\"  user$")
    public void the_message_something_user(String Messageuserblanklank) throws Throwable {
        String Actualusererror = Hooks.openPage.TxtMessageUserError.getText();
        Assert.assertEquals(Actualusererror, Messageuserblanklank);
    }



    @And("^The message \"([^\"]*)\" pw$")
    public void the_message_something_pw(String MessagePwBlank) throws Throwable {

        String Actualpwerror = Hooks.openPage.TxtMessagePasswordError.getText();
        System.out.println(Actualpwerror);
        Assert.assertEquals(Actualpwerror, MessagePwBlank);
    }


}
