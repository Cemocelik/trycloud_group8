package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesOptionOnLeft;

    @FindBy (xpath = "//a[@class='button new']/span[1]")
    public WebElement addIcon;



}