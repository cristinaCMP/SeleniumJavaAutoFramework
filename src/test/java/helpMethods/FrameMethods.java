package helpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {

    WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToFrame(String locator) {
        driver.switchTo().frame(locator);
    }
    public void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }
    public void switchToBaseFrame(){
        driver.switchTo().defaultContent();
    }
}
