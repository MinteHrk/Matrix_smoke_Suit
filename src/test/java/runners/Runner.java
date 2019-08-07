package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberReport",
        features = "C:\\Users\\minte\\chicago11cucumberjunit\\src\\test\\resources\\features",
        glue = "steps",
        tags = "@smokeSuit"
)
public class Runner {
}
