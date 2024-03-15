package helpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {

    public WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptAllert() {
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }

    public void dismissAlert() {
        Alert alertOK = driver.switchTo().alert();
        alertOK.dismiss();
    }

    public void acceptFillAllert(String fillValue) {
        Alert alertText = driver.switchTo().alert();
        alertText.sendKeys(fillValue);
        alertText.accept();
    }
}
