package tests;

import base.Hooks;
import objects.RegisterObject;
import org.junit.Test;
import pages.IndexPage;
import pages.RegisterPage;


public class RegisterTest extends Hooks {

    @Test
    public void registerMethod() {

        IndexPage indexPage = new IndexPage(driver);
        RegisterObject registerObject = new RegisterObject(testData);
        RegisterPage registerPage = new RegisterPage(driver);

        indexPage.clickSkipSignIn();
        registerPage.registerProcess(registerObject);

    }

}
