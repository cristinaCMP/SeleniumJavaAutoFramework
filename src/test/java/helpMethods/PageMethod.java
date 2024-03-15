package helpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethod {

    WebDriver driver;

    public PageMethod(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToURL(String URL){
        driver.navigate().to(URL);
    }

    public void validateTitlePage(String expected){
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

}
