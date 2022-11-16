package net.trycloud.step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.pages.US_4_Access_To_Files_Module_Page;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US4FilesModuleStepDefs {

    US_1_Login_Page us_1_login_page = new US_1_Login_Page();
    US_4_Access_To_Files_Module_Page us_4_access_to_files_module_page = new US_4_Access_To_Files_Module_Page();

    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us_1_login_page.login("User8", "Userpass123");
    }

    @When("user clicks {string} module")
    public void userClicksModule(String arg0) {
        us_4_access_to_files_module_page.filesButton.click();

    }

    @Then("verify the page title is {string}.")
    public void verifyThePageTitleIs(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        us_4_access_to_files_module_page.selectAllFilesCheckbox.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {

        for(WebElement allFilesButtons : us_4_access_to_files_module_page.allFilesCheckboxes){
            Assert.assertTrue(allFilesButtons.isSelected());
        }

        }


    }

