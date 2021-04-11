package com.sdl.lc.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.sdl.lc.helpers.DriverHelper.retryActionOnStaleElement;
import static com.sdl.lc.helpers.LocatorHelper.getLocatorForCurrentDropdownOpenButton;
import static com.sdl.lc.helpers.LocatorHelper.getLocatorForDropdownItem;

public class DropdownSelectionHelper {
    private final WebDriver driver;
    private final By dropdownLocator;

    public DropdownSelectionHelper(WebDriver driver, By dropdownLocator) {
        this.driver = driver;
        this.dropdownLocator = dropdownLocator;
    }

    public void setValueInDropdown(String value) {
        final WebElement dropdownElement = driver.findElement(dropdownLocator);
        dropdownElement.sendKeys(value);
        dropdownElement.sendKeys(Keys.ESCAPE);
        dropdownElement.sendKeys(Keys.TAB);
    }

    public void selectOptionInDropdown(String option) {
        openDropdown();
        //still no waits :D
        retryActionOnStaleElement(() ->
        driver.findElement(getLocatorForDropdownItem(option)).click());
    }

    private void openDropdown() {
        //still no waits :D
        retryActionOnStaleElement(() ->
        driver.findElement(dropdownLocator)
                .findElement(getLocatorForCurrentDropdownOpenButton())
                .click());
    }
}
