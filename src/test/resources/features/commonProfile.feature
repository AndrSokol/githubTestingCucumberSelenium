Feature: Profile pages Feature

  @1
  Scenario: Verify project list
    Given I open site
    And I login to site
    When I open menu item "Your repositories"
    Then I see on list page projects:
    |TestProject              |
    |diceTest                 |
    |apiTestingLearning       |
    |TodoMVCTasks             |
    |CalculatorJUnit          |
    |AutomationTestingCourses |
    |Calculator               |
    |com.testau               |

  @2
  Scenario: Verify stars page
    Given I open site
    And I login to site
    When I open menu item "Your stars"
    Then I see text "You don’t have any starred repositories yet." on stars page