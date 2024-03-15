package objects;

import java.util.HashMap;

public class LoginObject {

    private String SignInTitle;

    private String emailInput;

    private String passwordInput;
    private String errorMessageElement;

    public LoginObject(HashMap<String, String> testData) {
        prepareData(testData);
    }

    public void prepareData(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "SignInTitle":
                    setSignInTitle(testData.get(key));
                    break;
                case "emailInput":
                    setEmailInput(testData.get(key));
                    break;
                case "passwordInput":
                    setPasswordInput(testData.get(key));
                    break;
                case "errorMessageElement":
                    setErrorMessageElement(testData.get(key));
                    break;
            }
        }
    }

    public String getSignInTitle() {
        return SignInTitle;
    }

    public void setSignInTitle(String signInTitle) {
        SignInTitle = signInTitle;
    }

    public String getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String emailInput) {
        this.emailInput = emailInput;
    }

    public String getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(String passwordInput) {
        this.passwordInput = passwordInput;
    }

    public String getErrorMessageElement() {
        return errorMessageElement;
    }

    public void setErrorMessageElement(String errorMessageElement) {
        this.errorMessageElement = errorMessageElement;
    }
}
