package com.sdl.lc.pages;

import org.openqa.selenium.By;

public class ProjectTabPricingModelView {
    private static final String PRICING_MODEL = "input[name='pricingModelId']";

    public String getPricingModel() {
        return PRICING_MODEL;
    }

    public By getAnchor() {
        return By.cssSelector("input[name='currency']");
    }
}
