package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks clean up");
        System.out.println(scenario.getName() +"  "+ scenario.getStatus());

        if(scenario.isFailed()){
            byte[] screenShot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image/png");
        }
        Driver.closeDriver();
    }
}
