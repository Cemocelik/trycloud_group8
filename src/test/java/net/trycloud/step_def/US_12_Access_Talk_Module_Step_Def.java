package net.trycloud.step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US_12_Talk_Module_Page;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;

public class US_12_Access_Talk_Module_Step_Def {

    US_12_Talk_Module_Page us_12_talk_module_page = new US_12_Talk_Module_Page();

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_talk_module(String str) {
        BrowserUtils.hover(us_12_talk_module_page.mainModules.get(0));
        US_12_Talk_Module_Page.clickMainModule(str);
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

}
