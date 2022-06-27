@Smoke
Feature: HomePage

  Scenario Outline: As a User I want to search terms
    Given I am on Homepage
    When I click on Search link
    And I enter "<Terms>" in search bar
    And I click on search icon Or press Enter key
    Then I can see the result "<Result>"

    Examples:
      | Terms | Result                |
      | Music | BBC Music Introducing |
      | Food  | The Food Chain        |


