package com.sdl.lc.project.steps;

import com.sdl.lc.helpers.DropdownSelectionHelper;
import com.sdl.lc.pages.ProjectTabTranslationEngineView;
import com.sdl.lc.project.TestBase;
import io.cucumber.java.en.And;

import static com.sdl.lc.helpers.DriverHelper.waitForElementOnPage;
import static org.openqa.selenium.By.cssSelector;

public class ProjectTabTranslationEngineSteps extends TestBase {

    private static final ProjectTabTranslationEngineView VIEW = new ProjectTabTranslationEngineView();

    @And("I select translation engine {string}")
    public void iSelectTranslationEngine(String translationEngine) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getTranslationEngine()))
                .selectOptionInDropdown(translationEngine);
        waitForElementOnPage(driver, VIEW.getAnchor());
    }
}
