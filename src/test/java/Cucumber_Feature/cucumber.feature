Feature: checking login functionality
  Scenario: Check Login
    Given user is on the login page
    When user enters username and password
    And user click on login button
    Then user lands on landing page

    Scenario Outline: checking login again
      Given user again click on login button
      When user again enters <username> and <password>
      And user comes on the login page again
      Then user again lands on landing page

      Examples:
      |Srivastava |Sri@1997   |
      |Srikanth232|WhiteBox123|
