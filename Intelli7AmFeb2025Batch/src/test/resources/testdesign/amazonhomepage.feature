Feature: Key function of HomePage

  @sc01 @smoke @regession
  Scenario: Search function
    Given user navigate to amazon homepage
    When user enter the search keyword "iphone"
    And user clicks the search icon
    Then validate the title of the page

  @sc02 @smoke
  Scenario: Drop down values
   # Given user navigate to amazon homepage
    When user extracts the dropdown values
    And user select the value from the dropdown
    Then user validates the dropdown values

    @sc05
  Scenario: Mouse Handling
    Given user navigate to amazon homepage
    When user clicks on baby wishlist
    Then user validate the field name

    @sc03
  Scenario Outline: Search function with multiple test data
    Given user navigate to amazon homepage
    When user enter the search keyword "<SearchInput>"
    And user clicks the search icon
    Then validate the title of the page
    Examples:
      | SearchInput |  |
      | iphone      |  |
      | mouse       |  |
      | table       |  |