package com.sdl.lc.pages;

import org.openqa.selenium.By;

public class ProjectTabWorkflowView {
    private static final String WORKFLOW = "input[name='workflowId']";

    public String getWorkflow() {
        return WORKFLOW;
    }

    public By getAnchor() {
        return By.cssSelector(".sdl-workflow-phase--title");
    }
}
