package com.sdl.lc.pages;

public class ProjectNavigationView {
    private static final String NEXT_BUTTON = "//a[@role='button']//span[text()='Next']";
    private static final String CREATE_AND_START = "//span[contains(@class, 'x-btn-inner') and text()='Create & Start']";
    private static final String SUCCESS_MESSAGE_BOX = ".msg-success";

    public String getNextButton() {
        return NEXT_BUTTON;
    }

    public String getCreateAndStart() {
        return CREATE_AND_START;
    }

    public String getSuccessMessageBox() {
        return SUCCESS_MESSAGE_BOX;
    }
}
