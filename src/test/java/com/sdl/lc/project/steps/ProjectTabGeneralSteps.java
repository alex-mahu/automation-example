package com.sdl.lc.project.steps;

import com.sdl.lc.helpers.DropdownSelectionHelper;
import com.sdl.lc.pages.ProjectTabGeneralView;
import com.sdl.lc.project.TestBase;
import filesHelper.FileHelper;
import io.cucumber.java.en.And;

import static com.sdl.lc.helpers.RandomProjectNameGenerator.RANDOM_PROJECT_NAME;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.name;

public class ProjectTabGeneralSteps extends TestBase {
    private static final ProjectTabGeneralView VIEW = new ProjectTabGeneralView();

    @And("I set random Project name")
    public void iSetRandomProjectName() {
        driver.findElement(name(VIEW.getProjectName())).sendKeys(RANDOM_PROJECT_NAME);
    }

    @And("I set Project location {string}")
    public void iSetProjectLocation(String location) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getProjectLocation()))
                .setValueInDropdown(location);
    }

    @And("I set Project source language {string}")
    public void iSetProjectSourceLanguage(String sourceLanguage) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getProjectSourceLanguage()))
                .setValueInDropdown(sourceLanguage);
    }

    @And("I set Project target language {string}")
    public void iSetProjectTargetLanguage(String targetLanguage) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getProjectTargetLanguage()))
                .setValueInDropdown(targetLanguage);
    }

    @And("I set Project file type configuration {string}")
    public void iSetProjectFileTypeConfiguration(String projectFileConfiguration) {
        new DropdownSelectionHelper(driver, cssSelector(VIEW.getProjectFileConfiguration()))
                .selectOptionInDropdown(projectFileConfiguration);
    }

    @And("I upload the default file")
    public void iUploadTheDefaultFile() {
        driver.findElement(cssSelector(VIEW.getUploadFile())).sendKeys(FileHelper.getDefaultFilePath());
    }
}
