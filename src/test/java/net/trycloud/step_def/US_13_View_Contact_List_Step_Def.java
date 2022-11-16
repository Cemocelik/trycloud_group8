package net.trycloud.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US_13_Contacts_Module_Page;
import net.trycloud.utilities.Driver;
import org.junit.Assert;

public class US_13_View_Contact_List_Step_Def {

    US_13_Contacts_Module_Page us_12_contacts_modulePage = new US_13_Contacts_Module_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard - Trycloud"));
    }

    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        us_12_contacts_modulePage.contactsModuleLink.click();
    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        Assert.assertTrue(us_12_contacts_modulePage.listOfContacts.size() >= 2);
        us_12_contacts_modulePage.listOfContacts.forEach(e -> {
            Assert.assertTrue(e.isDisplayed());
        });
    }

}
