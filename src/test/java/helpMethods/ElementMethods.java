package helpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver){
        this.driver = driver;
    }
    public void clickElement(WebElement element){
        element.click();
    }
    public void hooverElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void fillElement(WebElement element, String value){
        element.sendKeys(value);
    }

    public void validateElementMessage(WebElement element, String message){
        String actual = element.getText();
        Assert.assertEquals(message, actual);

    }

    public void selectElementByValue(WebElement element, String value){
        Select monthSelect = new Select(element);
        monthSelect.selectByValue(value);
    }

    public void selectElementByText(WebElement element, String value){
        Select monthSelect = new Select(element);
        monthSelect.selectByValue(value);
    }

}
