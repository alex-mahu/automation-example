package com.sdl.lc.project.steps;

import com.sdl.lc.helpers.DropdownSelectionHelper;
import com.sdl.lc.pages.ProjectTabPricingModelView;
import com.sdl.lc.project.TestBase;
import io.cucumber.java.en.And;

import static com.sdl.lc.helpers.DriverHelper.waitForElementOnPage;
import static org.openqa.selenium.By.cssSelector;

public class ProjectTabPricingModelSteps extends TestBase {

    private static final ProjectTabPricingModelView VIEW = new ProjectTabPricingModelView();

    @And("I select pricing model {string}")
    public void iSelectPricingModel(String pricingModel) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getPricingModel()))
                .selectOptionInDropdown(pricingModel);
        waitForElementOnPage(driver, VIEW.getAnchor());
    }
}
