package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

        By userName = By.id("user-name");
        By password = By.id("password");
        By clickOnLogin = By.id("login-button");

        public void sendTextToUserNameField() {
            sentTextToElement(userName, "standard_user");
        }

        public void sendTextToPasswordField() {
            sentTextToElement(password, "secret_sauce");
        }

        public void clickOnLoginButton() {
            clickOnElement(clickOnLogin);
        }
    }

