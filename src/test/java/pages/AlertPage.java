package pages;

import objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    List<WebElement> alertOptions;

    @FindBy(css = ".btn.btn-danger")
    private WebElement alertOKpop;

    @FindBy(css = ".btn.btn-primary")
    private WebElement alertCancel;

    @FindBy(css = ".btn-info")
    private WebElement alertTextbox;

    public void dealAlertOK() {
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(alertOKpop);
        alertMethods.acceptAllert();
    }

    public void dealAlertOKCancel() {
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(alertCancel);
        alertMethods.dismissAlert();
    }

    public void dealAlertSendKeys(AlertObject alertObject) {
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(alertTextbox);
        alertMethods.acceptFillAllert(alertObject.getAlertValue());
    }

}
