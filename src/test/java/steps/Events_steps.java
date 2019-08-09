package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LeavesPage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Events_steps {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    LeavesPage leavesPage=new LeavesPage();

    @Given("user opens the Url of the web page")
    public void user_opens_the_Url_of_the_web_page() {
        Driver.getDriver().get(Config.getProperty("url"));
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String string, String string2) {
        loginPage.ERPLogin(string, string2);
    }

    @When("user clicks on leaves button")
    public void user_clicks_on_leaves_button(){
    homePage.leavesButton.click();
    }



    @When("user clicks on add search filter")
    public void user_clicks_on_add_search_filter() throws Exception {
        leavesPage.addSearchFilter.click();
    }

    @When("user clicks on filter button to search")
    public void user_clicks_on_filter_button_to_search()throws Exception{
        Thread.sleep(1000);
        leavesPage.filterButton.click();
    }

    @When("user adds approved as a filter")
    public void user_adds_approved_as_a_filter() {
        leavesPage.approvedLeavesFilter.click();
    }

    @Then("user should see approved as part of the filter")
    public void user_should_see_approved_as_part_of_the_filter() {

        Assert.assertTrue(leavesPage.approvedLeavesFilter.isDisplayed());
    }

    @Then("user should see Create button")
    public void user_should_see_Create_button() {
        leavesPage.createVerification.click();
        String Expected="Create";
        String actual= Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(actual));
    }

    @Then("user clicks on leaves summery button")
    public void user_clicks_on_leaves_summery_button() {
        Assert.assertTrue(leavesPage.leavesSummaryText.isDisplayed());
    }

    @When("user clicks on leaves request button")
    public void user_clicks_on_leaves_request_button() {
        leavesPage.leaveRequestButton.click();
    }

    @Then("user should see the calender visibly")
    public void user_should_see_the_calender_visibly() {
        Assert.assertTrue("Calendar is not displayed" ,leavesPage.calendar.isDisplayed());
    }

    @When("user clicks on one date")
    public void user_clicks_on_one_date() {
       leavesPage.explicitlyWaitUntilVisisble(leavesPage.july31);
        leavesPage.july31.click();
    }

    @Then("user should see leaves request menu")
    public void user_should_see_leaves_request_menu() {
        Assert.assertTrue("Leaves request menu verification failed", leavesPage.leavesRequestMenu.isDisplayed());
    }

    @When("user clicks on date button")
    public void user_clicks_on_date_button() {
        leavesPage.dateButton.click();
    }

    @When("user enters {string} on description box")
    public void user_enters_on_description_box(String string) {

        leavesPage.descriptionInput.sendKeys(string);

    }

    @When("user selects the first option of leaves type")
    public void user_selects_the_first_option_of_leaves_type() {
        leavesPage.leaveTypeInput.click();

      leavesPage.legalLeave2018.click();


    }

    @When("user enters {string} on days box")
    public void user_enters_on_days_box(String str) {
        leavesPage.daysNumInput.sendKeys(str);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        leavesPage.saveButton.click();
    }

    @Then("user should see warning message displayed")
    public void user_should_see_warning_message_displayed() {
        Assert.assertTrue("Validation Error message is not displayed", leavesPage.warningMessage.isDisplayed());

    }

    @When("user adds current year as a filter")
    public void user_adds_current_year_as_a_filter() {
        leavesPage.currentYearFilter.click();
    }

    @Then("user should see current year as part of the search filter")
    public void user_should_see_current_year_as_part_of_the_search_filter() {
         Assert.assertTrue(leavesPage.currentYearFilter.isDisplayed());
    }

    @When("user clicks on discard button")
    public void user_clicks_on_discard_button() {
        leavesPage.discardButton.click();

    }

    @Then("user should see message displayed")
    public void user_should_see_message_displayed() {
        String expected="The record has been modified, your changes will be discarded. Do you want to proceed?";
       leavesPage.explicitlyWaitUntilVisisble(leavesPage.messageText);
        Assert.assertEquals(leavesPage.messageText.getText(), expected);
        Assert.assertTrue("Message is not displayed", leavesPage.messageText.isDisplayed());
        leavesPage.okButton.click();
    }
}
