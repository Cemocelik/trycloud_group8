package net.trycloud.step_def;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US11_Talks_Module_Page;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;

public class US11_Talks_Module_StepDef {

  US11_Talks_Module_Page talksModulePage = new US11_Talks_Module_Page();
  US_1_Login_Page loginPage = new US_1_Login_Page();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("env"));
      loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));




    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
      talksModulePage.talkBtn.click();



    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
      BrowserUtils.verifyTitle(Driver.getDriver(),expectedTitle);

    }

    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
      //talksModulePage.searchBtn.click();
      talksModulePage.searchBtn.sendKeys(ConfigurationReader.getProperty("users"));
     talksModulePage.user.click();


    }

    @And("user write a message")
    public void userWriteAMessage() {
      talksModulePage.writeMsg.click();
      talksModulePage.writeMsg.sendKeys(ConfigurationReader.getProperty("message"));


    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
      talksModulePage.submitBtn.click();


    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog() {
      talksModulePage.display.isDisplayed();


    }
}
