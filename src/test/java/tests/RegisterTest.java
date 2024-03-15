package tests;

import base.Hooks;
import helpMethods.ElementMethods;
import objects.RegisterObject;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.IndexPage;
import pages.RegisterPage;


public class RegisterTest extends Hooks {

    @Test
    public void registerMethod() {

        ElementMethods elementMethods = new ElementMethods(driver);
        IndexPage indexPage = new IndexPage(driver);
        RegisterObject registerObject = new RegisterObject(testData);
        RegisterPage registerPage = new RegisterPage(driver);

        indexPage.clickSkipSignIn();

        WebElement consentPersonalDataButton = driver.findElement(By.className("fc-button-label"));
        if (consentPersonalDataButton.isDisplayed()) {
           elementMethods.clickElement(consentPersonalDataButton);
        }
        registerPage.registerProcess(registerObject);

    }

}
