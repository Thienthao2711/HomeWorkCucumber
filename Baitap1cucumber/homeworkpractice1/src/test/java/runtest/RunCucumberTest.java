package runtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/report.html"},
glue = "stepsDefination",
        features = "src/test/resources/login/login.feature"
)
public class RunCucumberTest {

}
