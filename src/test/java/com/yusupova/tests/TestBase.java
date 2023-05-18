package com.yusupova.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "2100x1080";
        Configuration.pageLoadTimeout = 600000;
    }
}
