package net.trycloud.pages;

import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US_3_DashboardPage {

    public US_3_DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li") //list of modules
    public List<WebElement> listOfModules;

    public List<String> getModulesText() {

        List<String> modulesText = new ArrayList<>();

        for (int i = 0; i < listOfModules.size() - 1; i++) {

            BrowserUtils.hover(listOfModules.get(i));
            BrowserUtils.sleep(1);
            modulesText.add(listOfModules.get(i).getText());
        }

        return modulesText;
    }

//    @FindBy (xpath = "(//a[@aria-label='Dashboard'])[1]")
//    public WebElement dashboard;
//
//    @FindBy (xpath = "(//a[@aria-label='Files'])[1]")
//    public WebElement files;
//
//    @FindBy (xpath = "(//a[@aria-label='Photos'])[1]")
//    public WebElement photos;
//
//    @FindBy (xpath = "(//a[@aria-label='Activity'])[1]")
//    public WebElement activity;
//
//    @FindBy (xpath = "(//a[@aria-label='Talk'])[1]")
//    public WebElement talk;
//
//    @FindBy (xpath = "(//a[@aria-label='Contacts'])[1]")
//    public WebElement contacts;
//
//    @FindBy (xpath = "(//a[@aria-label='Circles'])[1]")
//    public WebElement circles;
//
//    @FindBy (xpath = "(//a[@aria-label='Calendar'])[1]")
//    public WebElement calendar;
//
//    @FindBy (xpath = "(//a[@aria-label='Deck'])[1]")
//    public WebElement deck;


}
