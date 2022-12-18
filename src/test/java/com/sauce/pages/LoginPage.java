package com.sauce.pages;

import com.sauce.pages.BasePage;
import com.sauce.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    public WebElement inputUserName_loc;

    @FindBy(id = "password")
    public WebElement inputPassword_loc;

    @FindBy(id = "login-button")
    public WebElement loginBttn_loc;



    public void loginUser(String username, String password){


        inputUserName_loc.sendKeys(username);
        inputPassword_loc.sendKeys(password);
        loginBttn_loc.click();
    }


}
