package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "StepDefinitions",tags="@signup",dryRun=false,
        plugin = {"pretty",
                "html:target/cucmber-reports.html"},
        monochrome = true)
public class TestRunner {

}
