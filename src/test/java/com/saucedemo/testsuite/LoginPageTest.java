package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test

    public void userShouldLoginSuccessfullyWithValid() {
        loginPage.sendTextToUserNameField();
        loginPage.sendTextToPasswordField();
        loginPage.clickOnLoginButton();

        String expectedMessage = "Products";
        String actualMessage = getTextFromElement(By.xpath("//span[@class = 'title']"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.sendTextToUserNameField();
        loginPage.sendTextToPasswordField();
        loginPage.clickOnLoginButton();
        String expectedMessage = "Products";
    }
}
