package net.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US8_DeleteFolderPage extends BasePage {

    @FindBy(xpath = "//ul[@id='appmenu']//li[2]")
    public WebElement filesBtn;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    List<WebElement> actionIconList;

    @FindBy(xpath = "//li[@class=' action-delete-container']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deleteFiles;

    @FindBy(id = "filestable")
    List<WebElement> deletedFolderTable;

    public void filesBtnClick() {
        filesBtn.click();
    }

    public WebElement getFirstElementFromList() {
        return actionIconList.get(0);
    }

    public boolean isDeletedFolderPresent() {
        for (int i = 0; i < deletedFolderTable.size(); i++){
           deletedFolderTable.get(i).getText().equals(getFirstElementFromList().getText());
        }
        return true;

    }
}