package net.trycloud.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.pages.US_7_ManageFolders_Page;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;

public class US_7_ManageFolders2_Step_Def {


    US_1_Login_Page us_1_login_page = new US_1_Login_Page();
    US_7_ManageFolders_Page us_7_manageFolders_page = new US_7_ManageFolders_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us_1_login_page.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));


    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {

        us_7_manageFolders_page.filesModulesButton.click();

    }
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

        us_7_manageFolders_page.chooseFolder.click();


    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

        us_7_manageFolders_page.addIconButton2.click();

    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

        us_7_manageFolders_page.uploadButton.click();

        us_7_manageFolders_page.uploadButton.sendKeys("/Users/shivaniharjani/Desktop/Synchronization - pdf.pdf");


    }



    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

        us_7_manageFolders_page.folderUploaded.isDisplayed();



    }

}
