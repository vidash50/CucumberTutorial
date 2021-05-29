package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "prependedInput")
        private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String usernameInput, String passwordInput){
        username.sendKeys(usernameInput);
        password.sendKeys(passwordInput, Keys.ENTER);
    }

}
