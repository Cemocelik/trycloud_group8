package net.trycloud.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.BasePage;
import net.trycloud.pages.FilesPage;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US9_Comments {

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    FilesPage filesPage = new FilesPage();
    US_1_Login_Page us1login = new US_1_Login_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get( ConfigurationReader.getProperty("env") );
        us1login.login( ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
        for (int i = 0; i < basePage.modules.size(); i++) {
            actions.moveToElement(basePage.modules.get(i)).perform();
            if (basePage.moduleText.get(i).getText().contains(module)) {
                basePage.modules.get(i).click();
                break;
            }
        }
    }

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actionIcon.click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        for (WebElement menu : filesPage.actionMenu) {
            if (menu.getText().contains(string)) {
                menu.click();
                break;
            }
        }
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        filesPage.comments.click();
        String msg = "my day was great!";
        filesPage.commentsInput.sendKeys(msg);

    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.postComment.click();
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        Assert.assertTrue(filesPage.commentMsg.isDisplayed());
    }



}
