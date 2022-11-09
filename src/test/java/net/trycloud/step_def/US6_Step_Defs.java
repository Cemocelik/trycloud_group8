package net.trycloud.step_def;

import net.trycloud.pages.BasePage;
import net.trycloud.pages.US6Page;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US6_Step_Defs {


    BasePage basePage = new BasePage();

    US6Page us6Page = new US6Page();

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us6Page.username.sendKeys("User8");
        us6Page.password.sendKeys("Userpass123");
        us6Page.loginButton.click();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        us6Page.filesModuleButton.click();
    }
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        us6Page.actionIconOption.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        us6Page.removeFromFavorites.click();
    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
       basePage.favoritesOptionOnLeft.click();
    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        System.out.println("verify");
    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        basePage.addIcon.click();
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {
        
        us6Page.uploadOption.sendKeys("/Users/max/Desktop/HTML/html file .html");
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        System.out.println("verify display");
    }


}
