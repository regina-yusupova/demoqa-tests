package com.yusupova.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    @BeforeAll
    public static void pageLoadTimeout () {
        Configuration.pageLoadTimeout = 600000;
    }
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2100x1080";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Tom");
        $("#lastName").setValue("Lenon");
        $("#userEmail").setValue("qwe@asd.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("1234567891");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day--026").click();
        $("#subjectsInput").setValue("m").pressEnter();
        $("[for=hobbies-checkbox-2]").click();
        $("#uploadPicture").uploadFile(new File("src/test/data/logo.png"));
        $("#currentAddress").setValue("adress 1");
        $("#react-select-3-input").setValue("N").pressEnter();
        $("#react-select-4-input").setValue("de").pressEnter();
        $("#submit").click();
        $("tbody").shouldHave(text("Student Name Tom Lenon\n" +
                "Student Email qwe@asd.com\n" +
                "Gender Male\n" +
                "Mobile 1234567891\n" +
                "Date of Birth 26 March,2023\n" +
                "Subjects Maths\n" +
                "Hobbies Reading\n" +
                "Picture logo.png\n" +
                "Address adress 1\n" +
                "State and City NCR Delhi"));
    }


}
