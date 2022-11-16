package net.trycloud.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.BasePage;
import net.trycloud.pages.US8_DeleteFolderPage;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;

public class US8_DeleteFolder_StepDef extends BasePage {
    US_1_Login_Page us_1_login_page= new US_1_Login_Page();
    US8_DeleteFolderPage us8_deleteFolderPage = new US8_DeleteFolderPage();

    @Given("user enter username {string} and passcode {string}")
    public void userEnterUsernameAndPasscode(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us_1_login_page.login(username,password);
    }

    @When("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        BrowserUtils.verifyTitle(Driver.getDriver(),"Dashboard - Trycloud");
    }
    @Then("hen the user clicks the {string} module")
    public void hen_the_user_clicks_the_module(String string) {
        us8_deleteFolderPage.filesBtnClick();

    }
    @Then("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
      us8_deleteFolderPage.getFirstElementFromList().click();

    }
    @Then("user choose the {string} option")
    public void user_choose_the_option(String string) {
        us8_deleteFolderPage.deleteBtn.click();
    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
       us8_deleteFolderPage.deleteFiles.click();
        BrowserUtils.sleep(3);
    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        us8_deleteFolderPage.isDeletedFolderPresent();
    }

}
