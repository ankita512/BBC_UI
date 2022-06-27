@Smoke
Feature: Programme Information Page

  Scenario Outline: As a User I want to test Programme Information page
    Given I am on Programme information page
    When I click on Search PI button
    And I select medium from "<Medium>" Dropdown menu
    And I select channel from "<Channel>" Dropdown menu
    And I select genre from "<Genre>" Dropdown menu
    And I select option from "<Week/Year>" Dropdown menu
    And I select day from "<Day>" Dropdown menu
    And I click on Submit button
    Then I can see the result "<Result>" according to filter.

    Examples:
      | Medium         | Channel   | Genre         | Week/Year | Day      | Result                                              |
      | TV and iPlayer | BBC One   | Entertainment | 27-2022   | Monday   | No programmes were found using the selected filters |
      | TV and iPlayer | BBC Three | News          | 30-2022   | Thursday | No programmes were found using the selected filters |

  Scenario Outline: As a User I want to test Programme Information page
    Given I am on Programme information page
    When I click on Search PI button
    And I select medium from "<Medium>" Dropdown menu
    And I select network from "<Network>" Dropdown menu
    And I select genre from "<Genre>" Dropdown menu
    And I select option from "<Week/Year>" Dropdown menu
    And I select day from "<Day>" Dropdown menu
    And I click on Submit button
    Then I can see the result "<Result>" according to filter.

    Examples:
      | Medium           | Network          | Genre         | Week/Year | Day     | Result                                              |
      | Radio and Sounds | BBC Radio 2      | Daytime       | 29-2022   | Tuesday | No programmes were found using the selected filters |
      | Radio and Sounds | BBC Radio 5 Live | Entertainment | 31-2022   | Friday  | No programmes were found using the selected filters |