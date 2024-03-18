package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

    public WebDriver driver;

    public void setup() {

        // run with your browser
        // System.setProperty("webdriver.firefox.driver","src/test/resources/Firefox.exe");
        // driver = new FirefoxDriver();

        // setup for ci/cd running
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--disable-gpu");
//        chromeOptions.addArguments("--windows-size=1920,1880");
//        chromeOptions.addArguments("--no-sandbox");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--disable-gpu");
        firefoxOptions.addArguments("--windows-size=1920,1880");
        firefoxOptions.addArguments("--no-sandbox");

        WebDriverManager.chromedriver().setup(); // search in the computer if the driver exists and if not found it will download for us and running
//        driver = new ChromeDriver(chromeOptions); //send the chromeOptions as paramether for running in ci/cd
        driver = new FirefoxDriver(firefoxOptions); //send the chromeOptions as paramether for running in ci/cd

        driver.manage().window().maximize();

        // access browser
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    public void clearEnvironment() {
        driver.quit();
    }

}
