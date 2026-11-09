Feature: LOgin in Orange HRM
  Navigate to the dashboard
  Create employee

  Scenario Outline: Login with invalid credentials
    Given the user is on the login page
    When the user enters incorrect username as <"username"> and incorrect password as <"password">
    And the user clicks on login button
    Then the user should get error message <"errorMessage">

    Examples:
      | username | password | errorMessage        |
      | admin    | 123      | invalid credentials |
      | qwert    | admin123 | invalid credentials |
      |          |          | Required            |

  Scenario: Login to the Orange HRM
    Given the user is on the login page
    When the user enters username as "Admin" and password as "admin123"
    And the user clicks on login button
    Then the user should be directed to the dashboard


Scenario: Successful login

  Scenario: Create a new system administrator account
    Given the user navigates to the Admin menu screen
    When the user clicks on the Add button
    And the user fills the form to create a new admin user with username "AutomationUser156"
    Then the account creation process should complete successfully

