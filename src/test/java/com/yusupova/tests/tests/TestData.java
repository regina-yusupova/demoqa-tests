package com.yusupova.tests.tests;

import com.github.javafaker.Faker;

import java.io.File;

public class TestData {

    static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String userEmail = faker.internet().emailAddress();
    public static String userNumber = faker.phoneNumber().subscriberNumber(10);
    public static String subject = faker.options().nextElement(new String[]{"Math", "English", "Chemistry"});
    public static File picture = new File("src/test/resources/img/logo.png");
    public static String currentAddress = faker.address().fullAddress();
    public static String gender = faker.options().nextElement(new String[]{"Male", "Female", "Other"});
    public static String hobby = faker.options().nextElement(new String[]{"Sports", "Reading", "Music"});
    public static String state = "NCR";
    public static String city= faker.options().option("Delhi", "Gurgaon", "Noida");
}
