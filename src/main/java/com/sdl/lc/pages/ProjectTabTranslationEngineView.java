package com.sdl.lc.pages;

import org.openqa.selenium.By;

public class ProjectTabTranslationEngineView {
    private static final String TRANSLATION_ENGINE = "input[name='translationProfileId']";

    public String getTranslationEngine() {
        return TRANSLATION_ENGINE;
    }

    public By getAnchor() {
        return By.xpath("//span[@class='x-column-header-text-inner' and text()='Source Language']");
    }
}
