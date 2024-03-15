package tests;

import base.Hooks;
import objects.LoginObject;
import org.junit.Test;
import pages.IndexPage;
import pages.SignInPage;

public class LoginTest extends Hooks {

    @Test
    public void loginMethod() {
        LoginObject loginObject = new LoginObject(testData);
        IndexPage indexPage = new IndexPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        indexPage.clickSignIn();
        signInPage.loginInvalid(loginObject);
    }
}
