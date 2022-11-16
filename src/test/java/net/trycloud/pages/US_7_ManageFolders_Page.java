package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_7_ManageFolders_Page {

    public US_7_ManageFolders_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy( xpath = "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy( xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy( xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;





    @FindBy (xpath = "//span[.='Files']")
    public WebElement filesModulesButton;


    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;


    @FindBy (xpath = "//span[.='New folder']")
    public WebElement newFolderButton;


    @FindBy (xpath = "//input[@id='view13-input-folder']")
    public WebElement inputFolderName;


    @FindBy (xpath = "//div[@role='tooltip']")
    public WebElement submitIcon;

    @FindBy (xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement folderNameOnPage;


    @FindBy (xpath = "//span[@class='nametext']/span[.='My Folder']")
    public WebElement chooseFolder;


    @FindBy (xpath = "//a[@class='button new']")
    public WebElement addIconButton2;


    @FindBy (xpath = "//span[.='Upload file']")
    public WebElement uploadButton;


   @FindBy (xpath = "//span[@class='nametext']")
    public WebElement folderUploaded;














}








