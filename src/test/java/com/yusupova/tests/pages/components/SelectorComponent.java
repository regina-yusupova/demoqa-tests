package com.yusupova.tests.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelectorComponent {

    private SelenideElement stateSelector = $("#state");
    private SelenideElement citySelector = $("#city");

    public void setStateSelectorValue(String stateValue) {
        stateSelector.click();
        $("#stateCity-wrapper").$(byText(stateValue)).click();
    }

    public void setCitySelectorValue(String cityValue) {
        citySelector.click();
        $("#stateCity-wrapper").$(byText(cityValue)).click();
    }
}
