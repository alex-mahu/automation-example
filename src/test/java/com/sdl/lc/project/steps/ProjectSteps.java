package com.sdl.lc.project.steps;

import com.sdl.lc.pages.ProjectsView;
import com.sdl.lc.project.TestBase;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.table.Table;
import com.sdl.selenium.web.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.sdl.lc.helpers.RandomProjectNameGenerator.RANDOM_PROJECT_NAME;
import static org.junit.Assert.assertTrue;

public class ProjectSteps extends TestBase {
    private static final ProjectsView VIEW = new ProjectsView();

    @And("I open Projects page")
    public void iOpenProjectsPage() {
        driver.findElement(By.xpath(VIEW.getProjects())).click();
    }

    @And("I click on 'New Project' button")
    public void iClickOnNewProjectButton() {
        driver.findElement(By.xpath(VIEW.getNewProject())).click();
    }

    @Then("the randomly created project appears in the project list")
    public void appearsInTheProjectList() {
        final boolean projectAppearsInProjects = new Table().isRowPresent(RANDOM_PROJECT_NAME);
        assertTrue(projectAppearsInProjects);
    }
}
