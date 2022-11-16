package net.trycloud.step_def;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.BasePage;
import net.trycloud.pages.DashboardPage;
import org.junit.Assert;

public class TC14_SearchBox {
    BasePage basePage = new BasePage();
    DashboardPage dashboardPage =new DashboardPage();

    String file = dashboardPage.recommendedFiles.get(0).getText();

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        basePage.magnifierIcon.click();
    }

    @When("users search any existing file_folder_user name")
    public void users_search_any_existing_file_folder_user_name() {
        basePage.searchBoxInput.sendKeys(file);
    }

    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {
        Assert.assertTrue( basePage.displayFileInSearchBox.getText().contains(file));
    }

}
