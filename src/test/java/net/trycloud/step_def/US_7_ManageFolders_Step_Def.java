package net.trycloud.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.pages.US_7_ManageFolders_Page;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;

public class US_7_ManageFolders_Step_Def {



    US_7_ManageFolders_Page us_7_manageFolders_page = new US_7_ManageFolders_Page();
    US_1_Login_Page us_1_login_page = new US_1_Login_Page();



    @Given("the user should be at the dashboard page")
    public void theUserShouldBeAtTheDashboardPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us_1_login_page.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));



    }


    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {

        us_7_manageFolders_page.filesModulesButton.click();

    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {

        us_7_manageFolders_page.addIcon.click();
    }



    @When("user clicks New Folder")
    public void user_clicks_new_folder() {

        us_7_manageFolders_page.newFolderButton.click();

    }



    @When("user writes a folder name {string}")
    public void user_writes_a_folder_name(String folderName) {

        us_7_manageFolders_page.inputFolderName.sendKeys(folderName);

    }



    @When("the user clicks the submit icon")
    public void the_user_clicks_the_submit_icon() {

        us_7_manageFolders_page.submitIcon.click();


    }


    @Then("verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

        us_7_manageFolders_page.folderNameOnPage.isDisplayed();


    }


}
