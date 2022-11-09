package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US6Page {

    public US6Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@aria-label='Files']")
    public WebElement filesModuleButton;

    @FindBy (xpath = "//a[@data-action='menu']/span[@class='icon icon-more']")
    public WebElement actionIconOption;

    @FindBy (xpath = "//a[@class='menuitem action action-favorite permanent']//span[2]")
    public WebElement removeFromFavorites;


    @FindBy (xpath = "//label[@data-action='upload']/span[2]")
    public WebElement uploadOption; 
}
