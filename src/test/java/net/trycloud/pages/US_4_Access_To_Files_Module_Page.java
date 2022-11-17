package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_4_Access_To_Files_Module_Page {

    public US_4_Access_To_Files_Module_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement filesButton;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllFilesCheckbox;

    @FindBy(xpath = "//label[contains(@for,'select-files')]/../input")
    public List<WebElement> allFilesCheckboxes;


}
