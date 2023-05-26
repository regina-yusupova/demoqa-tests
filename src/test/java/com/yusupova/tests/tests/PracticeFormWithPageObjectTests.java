package com.yusupova.tests.tests;

import com.yusupova.tests.pages.PracticeFormPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.yusupova.tests.tests.TestData.*;


public class PracticeFormWithPageObjectTests extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillFormTest() {
        practiceFormPage.openPage();
        practiceFormPage.typeFirstName(firstName)
                        .typeLastName(lastName);
        practiceFormPage.typeUserEmail(userEmail);
        practiceFormPage.chooseGender(gender);
        practiceFormPage.typeUserNumber(userNumber);
        practiceFormPage.calendar.setDate("July", "1990", "05");
        practiceFormPage.typeSubject(subject);
        practiceFormPage.chooseHobby(hobby);
        practiceFormPage.uploadFile(picture);
        practiceFormPage.setCurrentAddress(currentAddress);
        practiceFormPage.selector.setStateSelectorValue(state);
        practiceFormPage.selector.setCitySelectorValue(city);
        $("#submit").click();

        practiceFormPage.checkResultsValue("Student Name", firstName + " " + lastName); // сделать перебор?
        practiceFormPage.checkResultsValue("Student Email", userEmail);
        practiceFormPage.checkResultsValue("Gender", gender);
        practiceFormPage.checkResultsValue("Mobile", userNumber);
        practiceFormPage.checkResultsValue("Date of Birth", "05 July,1990");
        practiceFormPage.checkResultsValue("Subjects", subject);
        practiceFormPage.checkResultsValue("Hobbies", hobby);
        practiceFormPage.checkResultsValue("Picture", "logo.png");
        practiceFormPage.checkResultsValue("Address", currentAddress);
        practiceFormPage.checkResultsValue("State and City", state + " " + city);
    }
}
