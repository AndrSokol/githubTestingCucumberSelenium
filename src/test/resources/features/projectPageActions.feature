Feature: Project page feature

  Scenario: Verify project list
    Given I open login page and sign in
    And I open project "TestProject"
    When I start edit project description by button Edit
    And I cancel editing
    Then button Cancel is not visible
    And button Edit description is visible