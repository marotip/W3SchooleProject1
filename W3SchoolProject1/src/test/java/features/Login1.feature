Feature: Login+

  Scenario: Login with correct crediantials
    Given Naviagte to URL
    When Enter userame and password and click on login button
    Then user should land on homepage
