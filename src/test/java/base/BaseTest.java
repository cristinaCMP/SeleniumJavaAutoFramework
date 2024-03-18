package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public WebDriver driver;

    public void setup() {

        // run with your browser locally
        // System.setProperty("webdriver.firefox.driver","src/test/resources/Firefox.exe");
        // driver = new FirefoxDriver();

        // setup for ci/cd running
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--windows-size=1920,1880");
        chromeOptions.addArguments("--no-sandbox");

        WebDriverManager.chromedriver().setup(); // search in the computer if the driver exists and auto download it
        driver = new ChromeDriver(chromeOptions); //send the chromeOptions as paramether for running in ci/cd

        driver.manage().window().maximize();

        // access browser
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    public void clearEnvironment() {
        driver.quit();
    }

}
