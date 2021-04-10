@screen
@logs
Feature: Create project

  Scenario: Login
    Given I open url "https://uat-languagecloud.sdl.com/lc/login"
    When I login with "admin.test.uat@sdl.testinator.com" and "Weaver123"

  Scenario: Create project
    And I open Projects page
    And I click on 'New Project' button
    And I set random Project name
    And I set Project location "HP"
    And I set Project source language "English (United States)"
    And I set Project target language "Urdu (India)"
    And I set Project file type configuration "Default File Type Configuration"
    And I upload the default file
    And I move to next tab
    And I select translation engine "TEForGoogle"
    And I move to next tab
    And I select pricing model "pricing_model_HP"
    And I move to next tab
    And I select workflow "WF1"
    And I choose to Create and Start
    Then the randomly created project appears in the project list
    And I stop the test
#    Continue to write steps


  Scenario: Logout
    And I logout from LC
