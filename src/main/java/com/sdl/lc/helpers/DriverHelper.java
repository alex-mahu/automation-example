package com.sdl.lc.helpers;

import com.sdl.selenium.web.utils.RetryUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.openqa.selenium.By.xpath;

public class DriverHelper {
    private static final int MAX_RETRY = 10;
    private static final int MAX_WAIT_SECONDS = 10;

    public static void retryActionOnStaleElement(IRetriableAction action) {
        StaleElementReferenceException exception;
        int tries = 0;
        do {
            try {
                action.apply();
                return;
            } catch (StaleElementReferenceException ex) {
                tries++;
                exception = ex;
            }
        } while (tries != MAX_RETRY);
        throw exception;
    }

    public static void waitForElementOnPage(WebDriver driver, By locator) {
        new WebDriverWait(driver, MAX_WAIT_SECONDS).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForExactNumberOfElements(WebDriver driver, By locator, int numberOfElements) {
        RetryUtils.retry(Duration.of(MAX_WAIT_SECONDS, ChronoUnit.SECONDS), () -> driver.findElements(locator).size() == numberOfElements);
    }
}
