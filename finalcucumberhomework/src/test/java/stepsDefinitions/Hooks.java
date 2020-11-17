package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void initTest()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        this.driver=new ChromeDriver();
        this.driver.manage().window().maximize();

    }
    @After
    public void AfterTest(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)this.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","error");

        }

        this.driver.quit();

    }
}
