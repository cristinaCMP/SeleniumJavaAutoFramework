package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup() {
        // set the driver for browser
        System.setProperty("webdriver.firefox.driver", "src/test/resources/Firefox.exe");
        // create a new chrome instance
        driver = new FirefoxDriver();

        //set browser to open maximize and on the second monitor
        driver.manage().window().setPosition(new org.openqa.selenium.Point(2000, 0));
        driver.manage().window().maximize();

        // access browser
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    @After
    public void clearEnvironment() {
        driver.quit();
    }

}
