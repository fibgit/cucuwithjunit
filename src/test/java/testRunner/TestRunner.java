package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue = {"steps"},
        plugin = {"pretty", "html:Reports/Report1.html"},
        dryRun = true,
        publish = true

)
public class TestRunner {

}
