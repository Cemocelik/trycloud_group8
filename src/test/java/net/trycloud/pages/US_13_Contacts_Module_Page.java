package net.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_13_Contacts_Module_Page extends BasePage{

    @FindBy (xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactsModuleLink;

    @FindBy (xpath = "//div[@id='contacts-list']/div/div/div")
    public List<WebElement> listOfContacts;

}
