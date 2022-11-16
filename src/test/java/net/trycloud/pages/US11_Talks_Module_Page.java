package net.trycloud.pages;


import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_Talks_Module_Page {

    public US11_Talks_Module_Page() {
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//ul[@id='appmenu']//li[5]")
    public WebElement talkBtn;

    @FindBy (xpath = "//input[@class='app-navigation-search__input']")
    public WebElement searchBtn;

    @FindBy (xpath = "(//div[@class='icon-more'])[1]")
    public WebElement user;

    @FindBy (xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement writeMsg;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy (xpath = "(//div[@class='messages'])[2]")
    public WebElement display;


}

