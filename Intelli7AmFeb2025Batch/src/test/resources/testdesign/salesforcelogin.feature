Feature: Login Function
  @salesforce
  Scenario Outline: error message validation
    #Given user navigate to the salesforce login page
    When user enter the username "<UserName>" and password "<Password>"
    And user clicks the login button
    Then verify the error message "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
    Examples:
      | UserName | Password |
      | abc      | 123      |
     # | xyz      | ooo      |

