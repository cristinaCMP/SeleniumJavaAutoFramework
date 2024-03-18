package tests;

import base.Hooks;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowsPage;

public class TabTest extends Hooks {

    @Test
    public void tabTestMethod() {

        IndexPage indexPage = new IndexPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        WindowsPage windowsPage = new WindowsPage(driver);

        indexPage.clickSkipSignIn();

        registerPage.goToWindowsPage();
        windowsPage.dealTab();
        windowsPage.dealWindow();
        windowsPage.dealTabs();
    }

}
