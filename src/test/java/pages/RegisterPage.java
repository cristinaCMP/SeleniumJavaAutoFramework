package pages;

import objects.RegisterObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchToDropdown;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertsDropdown;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement framesDropdown;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowsDropdown;

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameValue;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastNameValue;

    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private WebElement emailAddressValue;

    @FindBy(id = "yearbox")
    private WebElement yearDropdown;

    @FindBy(xpath = "//select[@placeholder='Month']")
    private WebElement monthDropdown;

    @FindBy(xpath = "//select[@ng-model='yearbox']")
    private WebElement dayDropdown;

    @FindBy(className = "select2-selection--single")
    private WebElement selectCountry;

    @FindBy(className = "select2-search__field")
    private WebElement selectCountryInput;

    @FindBy(id = "msdd")
    private WebElement languageDropdown;

    @FindBy(css = ".ui-front>li>a")
    public List<WebElement> languageOptions;

    public void goToAlertPage() {
        elementMethods.hooverElement(switchToDropdown);
        elementMethods.clickElement(alertsDropdown);
    }

    public void goToFramePage() {
        elementMethods.hooverElement(switchToDropdown);
        elementMethods.clickElement(framesDropdown);
    }

    public void goToWindowsPage() {
        elementMethods.hooverElement(switchToDropdown);
        elementMethods.clickElement(windowsDropdown);
    }

    public void registerProcess(RegisterObject registerObject) {
        elementMethods.fillElement(firstNameValue, registerObject.getFirstNameValue());
        elementMethods.fillElement(lastNameValue, registerObject.getLastNameValue());
        elementMethods.fillElement(emailAddressValue, registerObject.getEmailAddressValue());
        elementMethods.fillElement(dayDropdown, registerObject.getDayDropdown());
        elementMethods.fillElement(monthDropdown, registerObject.getMonthDropdown());
        elementMethods.fillElement(yearDropdown, registerObject.getYearDropdown());
        languageProcess(registerObject.getLanguageValue());
        countryProcess(registerObject.getSelectCountryInput());

    }

    public void languageProcess(String languages){
elementMethods.clickElement(languageDropdown);
        for (int index = 0; index < languageOptions.size(); index++) {
            if (languageOptions.get(index).getText().equals(languages)) {
                languageOptions.get(index).click();
            }
        }
        elementMethods.clickElement(firstNameValue);
    }

    public void countryProcess(String country){
        elementMethods.clickElement(selectCountry);
        elementMethods.fillElement(selectCountryInput, country);
        selectCountryInput.sendKeys(Keys.ENTER);
    }
}
