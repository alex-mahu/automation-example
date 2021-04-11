package com.sdl.lc.project.steps;

import com.sdl.lc.helpers.DropdownSelectionHelper;
import com.sdl.lc.pages.ProjectTabWorkflowView;
import com.sdl.lc.project.TestBase;
import io.cucumber.java.en.And;

import static com.sdl.lc.helpers.DriverHelper.waitForElementOnPage;
import static org.openqa.selenium.By.cssSelector;

public class ProjectTabWorkflowSteps extends TestBase {

    private static final ProjectTabWorkflowView VIEW = new ProjectTabWorkflowView();

    @And("I select workflow {string}")
    public void iSelectWorkflow(String workflow) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getWorkflow()))
                .setValueInDropdown(workflow);
        waitForElementOnPage(driver, VIEW.getAnchor());
    }
}
