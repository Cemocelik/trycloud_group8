package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_1_Login_Page {
    public US_1_Login_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy( xpath = "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy( xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy( xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
}}
