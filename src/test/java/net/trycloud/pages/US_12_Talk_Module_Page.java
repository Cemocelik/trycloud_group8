package net.trycloud.pages;

import net.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_12_Talk_Module_Page extends BasePage{

    @FindBy (xpath = "//ul[@id='appmenu']/li[@tabindex='-1']/a")
    public List<WebElement> mainModules;


    /**
     * Click module by visible text
     * @param name
     */
    public static void clickMainModule(String name){
        BrowserUtils.hover(new US_12_Talk_Module_Page().mainModules.get(0));
        for (WebElement module : new US_12_Talk_Module_Page().mainModules) {
            if (module.getText().equals(name)){
                module.click();
                break;
            }
        }
    }
}
