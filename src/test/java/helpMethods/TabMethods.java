package helpMethods;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class TabMethods {

    WebDriver driver;

    public TabMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToSpecificTabWindows(Integer index) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
    }

    public void closeSpecificTabWindow() {
        driver.close();
    }
}
