package tests;

import base.Hooks;
import helpMethods.ElementMethods;
import objects.AlertObject;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod() {

        ElementMethods elementMethods = new ElementMethods(driver);
        IndexPage indexPage = new IndexPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        AlertPage alertPage = new AlertPage(driver);
        AlertObject alertObject = new AlertObject(testData);

        indexPage.clickSkipSignIn();

//        WebElement consentPersonalDataButton = driver.findElement(By.className("fc-button-label"));
//        if (consentPersonalDataButton.isDisplayed()) {
//            elementMethods.clickElement(consentPersonalDataButton);
//        }

        registerPage.goToAlertPage();

        alertPage.dealAlertOK();
        alertPage.dealAlertOKCancel();
        alertPage.dealAlertSendKeys(alertObject);
    }

}
