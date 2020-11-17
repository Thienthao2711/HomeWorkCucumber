package stepsDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestcaseDefinitions3 {
    WebDriver driver;
    List<WebElement> listsuggestemail=null;

    public TestcaseDefinitions3(){
        this.driver=Hooks.driver;
    }
    @Given("^keep home page of banggood$")
    public void keep_home_page_of_banggood() throws Throwable {

    }

    @When("input username  on the textbox")
    public void input_username_on_the_textbox()throws Throwable {
        Hooks.openPage.TxtEmail.sendKeys("Thuonglv");
    }

    @Then("^the suggestion is shown correct$")
    public void the_suggestion_is_shown_correct() throws Throwable {
        String Inputtextmail="Thuonglv";
        listsuggestemail=Hooks.openPage.getListsuggestemail();
                for(int j=0;j<listsuggestemail.size();j++){
                    Assert.assertTrue(listsuggestemail.get(j).getAttribute("textContent").contains(Inputtextmail));
                }
    }

    @And("^Can choose item matched with suggestion$")
    public void can_choose_item_matched_with_suggestion() throws Throwable {

    }

}