package com.yusupova.tests.pages;

import com.codeborne.selenide.SelenideElement;
import com.yusupova.tests.pages.components.CalendarComponent;
import com.yusupova.tests.pages.components.SelectorComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    private SelenideElement formTitle = $(".practice-form-wrapper");
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement userEmailInput = $("#userEmail");
    private SelenideElement userNumberInput = $("#userNumber");
    private SelenideElement subjectsInput = $("#subjectsInput");
    private SelenideElement  genderRadio = $("#genterWrapper");
    private SelenideElement  uploadPictureInput = $("#uploadPicture");
    private SelenideElement  currentAddressInput = $("#currentAddress");
    private SelenideElement  hobbiesRadio = $("#hobbiesWrapper");

    public CalendarComponent calendar = new CalendarComponent();
    public SelectorComponent selector = new SelectorComponent();

    public void openPage () {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public PracticeFormPage typeFirstName (String firstNameValue) {
        firstNameInput.setValue(firstNameValue);
        return this;
    }

    public void typeLastName (String lastNameValue) {
        lastNameInput.setValue(lastNameValue);
    }

    public void typeUserEmail (String userEmailValue) {
        userEmailInput.setValue(userEmailValue);
    }

    public void chooseGender (String genderValue) {
        genderRadio.$(byText(genderValue)).click();
    }

    public void typeSubject (String subjectValue) {
        subjectsInput.setValue(subjectValue).pressEnter();
    }

    public void chooseHobby (String hobbyValue) {
        hobbiesRadio.$(byText(hobbyValue)).click();
    }

    public void typeUserNumber (String userNumberValue) {
        userNumberInput.setValue(userNumberValue);
    }

    public void uploadFile (File fileToUpload) {
        uploadPictureInput.uploadFile(fileToUpload);
    }

    public void setCurrentAddress (String currentAddressInputValue) {
        currentAddressInput.setValue(currentAddressInputValue);
    }

    public void checkResultsValue(String key, String value) {
        $x("//td[text()='" + key + "']").parent()
                .shouldHave(text(value));
    }
}
