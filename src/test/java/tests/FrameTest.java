package tests;

import base.Hooks;
import helpMethods.ElementMethods;
import pages.FramePage;
import objects.FrameObject;
import org.junit.Test;
import pages.IndexPage;
import pages.RegisterPage;

public class FrameTest extends Hooks {

    @Test
    public void frameMethod() {
        FrameObject frameObject = new FrameObject(testData);
        IndexPage indexPage = new IndexPage(driver);
        ElementMethods elementMethods = new ElementMethods(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        FramePage framePage = new FramePage(driver);
        indexPage.clickSkipSignIn();

        registerPage.goToFramePage();
        framePage.dealSingleFrame(frameObject);
        framePage.dealMultipleFrame(frameObject);
    }
}
