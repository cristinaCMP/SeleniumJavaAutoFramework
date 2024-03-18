package tests;

import base.Hooks;
import helpMethods.ElementMethods;
import objects.AlertObject;
import org.junit.Test;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod() {

        IndexPage indexPage = new IndexPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        AlertPage alertPage = new AlertPage(driver);
        AlertObject alertObject = new AlertObject(testData);

        indexPage.clickSkipSignIn();
        registerPage.goToAlertPage();
        alertPage.dealAlertOK();
        alertPage.dealAlertOKCancel();
        alertPage.dealAlertSendKeys(alertObject);
    }

}
