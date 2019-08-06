package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberReport",
        features = "/Users/smavziutov/Matrix_smoke_Suit",
        glue = "steps",
        tags = "@Gula"
)
public class Runner {
}
