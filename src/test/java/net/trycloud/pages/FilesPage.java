package net.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{


    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIcon ;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement comments ;

    @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li/a/span[2]")
    public List<WebElement> actionMenu;

    @FindBy (xpath = "//div[@class='message']")
    public WebElement commentsInput ;

    @FindBy (css = "input[class='submit icon-confirm has-tooltip']")
    public WebElement postComment;

    @FindBy (xpath = "(//div[@class='message'])[2]")
public WebElement commentMsg ;





}
