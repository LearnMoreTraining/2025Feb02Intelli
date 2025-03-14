Feature: wiki page automation

  @Wiki01
  Scenario: Key to value pair validation for Fortune table
    Given user extracts the year and Fortune column values
    Then validate the mapping of year to fortune values

    @lm01
  Scenario: waits
    Given Validate the text