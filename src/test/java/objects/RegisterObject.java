package objects;

import java.util.HashMap;

public class RegisterObject {

    private String firstNameValue;

    private String lastNameValue;
    private String emailAddressValue;
    private String yearDropdown;
    private String monthDropdown;
    private String dayDropdown;
    private String selectCountryInput;
    private String languageValue;

    public RegisterObject(HashMap<String, String> testData) {
        prepareData(testData);
    }

    public void prepareData(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "emailAddressValue":
                    setEmailAddressValue(testData.get(key));
                    break;
                case "yearDropdown":
                    setYearDropdown(testData.get(key));
                    break;
                case "monthDropdown":
                    setMonthDropdown(testData.get(key));
                    break;
                case "dayDropdown":
                    setDayDropdown(testData.get(key));
                    break;
                case "selectCountryInput":
                    setSelectCountryInput(testData.get(key));
                    break;
                case "languageValue":
                    setLanguageValue(testData.get(key));
                    break;
            }
        }

    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailAddressValue() {
        return emailAddressValue;
    }

    public void setEmailAddressValue(String emailAddressValue) {
        this.emailAddressValue = emailAddressValue;
    }

    public String getYearDropdown() {
        return yearDropdown;
    }

    public void setYearDropdown(String yearDropdown) {
        this.yearDropdown = yearDropdown;
    }

    public String getMonthDropdown() {
        return monthDropdown;
    }

    public void setMonthDropdown(String monthDropdown) {
        this.monthDropdown = monthDropdown;
    }

    public String getDayDropdown() {
        return dayDropdown;
    }

    public void setDayDropdown(String dayDropdown) {
        this.dayDropdown = dayDropdown;
    }

    public String getSelectCountryInput() {
        return selectCountryInput;
    }

    public void setSelectCountryInput(String selectCountryInput) {
        this.selectCountryInput = selectCountryInput;
    }

    public String getLanguageValue() {
        return languageValue;
    }

    public void setLanguageValue(String languageValue) {
        this.languageValue = languageValue;
    }
}
