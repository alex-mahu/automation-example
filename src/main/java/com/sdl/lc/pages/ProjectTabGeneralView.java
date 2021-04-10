package com.sdl.lc.pages;

public class ProjectTabGeneralView {

    private static final String PROJECT_NAME = "name";
    private static final String PROJECT_LOCATION = "input[name='location'].x-form-required-field";
    private static final String PROJECT_SOURCE_LANGUAGE = "input[name='projectSourceLanguage'].x-form-required-field";
    private static final String PROJECT_TARGET_LANGUAGE = "input[name='projectTargetLanguages']";
    private static final String PROJECT_FILE_CONFIGURATION = "input[name='configurationId'].x-form-required-field";
    private static final String UPLOAD_FILE = "input[type='file']";

    public String getProjectName() {
        return PROJECT_NAME;
    }

    public String getProjectLocation() {
        return PROJECT_LOCATION;
    }

    public String getProjectSourceLanguage() {
        return PROJECT_SOURCE_LANGUAGE;
    }

    public String getProjectTargetLanguage() {
        return PROJECT_TARGET_LANGUAGE;
    }

    public String getProjectFileConfiguration() {
        return PROJECT_FILE_CONFIGURATION;
    }

    public String getUploadFile() {
        return UPLOAD_FILE;
    }
}
