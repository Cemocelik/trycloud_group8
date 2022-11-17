package net.trycloud.step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US_1_Login_Page;
import net.trycloud.pages.US_3_DashboardPage;
import net.trycloud.utilities.ConfigurationReader;
import org.junit.Assert;

import java.util.List;

public class US_3_Access_main_modules {

    US_1_Login_Page loginPage = new US_1_Login_Page();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        loginPage.login(ConfigurationReader.getProperty("username38"), ConfigurationReader.getProperty("password"));
    }


    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModulesNames) {
        List<String> actualModulesNames = new US_3_DashboardPage().getModulesText();
        Assert.assertEquals(expectedModulesNames, actualModulesNames);

    }


}
