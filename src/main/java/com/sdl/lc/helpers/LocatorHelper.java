package com.sdl.lc.helpers;

import org.openqa.selenium.By;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class LocatorHelper {
    public static By getLocatorForDropdownItem(String item) {
        return xpath(format("//ul[@aria-hidden=\"false\"]/li/div/text()[normalize-space()=\"%s\"]/ancestor::li", item));
    }

    public static By getLocatorForCurrentDropdownOpenButton() {
        return xpath("./ancestor::div[@data-ref=\"bodyEl\"]//div[contains(@class,\"x-form-arrow-trigger\")]");
    }
}
