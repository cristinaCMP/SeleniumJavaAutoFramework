package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    public List<WebElement> tabsList;

    @FindBy(css = "#Tabbed button")
    private WebElement newTabWindows;

    @FindBy(css = "#Seperate button")
    private WebElement newSeparateWindows;

    @FindBy(css = "#Multiple button")
    private WebElement newMultipleWindows;

    public void dealTab() {
        elementMethods.clickElement(tabsList.get(0));
        elementMethods.clickElement(newTabWindows);
        tabMethods.switchToSpecificTabWindows(1);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchToSpecificTabWindows(0);
    }

    public void dealWindow() {
        elementMethods.clickElement(tabsList.get(1));
        elementMethods.clickElement(newSeparateWindows);
        tabMethods.switchToSpecificTabWindows(1);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchToSpecificTabWindows(0);
    }

    public void dealTabs(){
        elementMethods.clickElement(tabsList.get(2));
        elementMethods.clickElement(newMultipleWindows);
        tabMethods.switchToSpecificTabWindows(2);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchToSpecificTabWindows(1);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchToSpecificTabWindows(0);

    }
}
