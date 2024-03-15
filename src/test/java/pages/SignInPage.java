package pages;

import objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends  BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordInput;

    @FindBy(id = "enterbtn")
    private WebElement pageEnter;

    @FindBy(id = "errormsg")
    private WebElement errorMessageElement;

    public void loginInvalid(LoginObject loginObject){
        pageMethod.validateTitlePage(loginObject.getSignInTitle());
        elementMethods.fillElement(emailInput, loginObject.getEmailInput());
        elementMethods.fillElement(passwordInput, loginObject.getPasswordInput());
        elementMethods.clickElement(pageEnter);
        elementMethods.validateElementMessage(errorMessageElement, loginObject.getErrorMessageElement());
    }

}
