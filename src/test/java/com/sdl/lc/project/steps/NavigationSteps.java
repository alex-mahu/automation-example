package com.sdl.lc.project.steps;

import com.sdl.lc.pages.ProjectNavigationView;
import com.sdl.lc.project.TestBase;
import io.cucumber.java.en.And;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class NavigationSteps extends TestBase {

    private static final ProjectNavigationView VIEW = new ProjectNavigationView();

    @And("^I move to next tab")
    public void iMoveToNextTab() {
        driver.findElement(xpath(VIEW.getNextButton())).click();
    }

    @And("I choose to Create and Start")
    public void iChooseToCreateAndStart() {
        driver.findElement(xpath(VIEW.getCreateAndStart())).click();
        driver.findElement(cssSelector(VIEW.getSuccessMessageBox()));
    }
}
