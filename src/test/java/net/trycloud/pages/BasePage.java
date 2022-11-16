package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> modules ;

    @FindBy(xpath = "//ul[@id='appmenu']/li//span")
    public List<WebElement> moduleText;

    @FindBy (css = "svg[class='material-design-icon__svg']")
    public WebElement magnifierIcon;


    @FindBy (css = "input[class='unified-search__form-input']")
    public WebElement searchBoxInput ;

    @FindBy (xpath = "//span[@class='unified-search__result-content']//strong")
    public WebElement displayFileInSearchBox;




}