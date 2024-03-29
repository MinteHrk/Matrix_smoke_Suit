package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    WebDriver driver;

    public HomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy (xpath = "/html/body/nav/div[2]/ul[1]/li[12]/a")
    public WebElement leavesButton;

}
