Feature: Login Functions

  Background:
    Given I am on HomePage

  @sanity @smoke @regression
  Scenario: User should log in successfully with valid credentials
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should login successfully and verify the text "Dashboard"

  @smoke @regression
  Scenario: User should see the OrangeHRM logo on the Homepage
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should see the OrangeHRM logo

  @regression
  Scenario: User should logout successfully
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on user profile logo
    And I mouse hover and click on Logout
    Then I should navigate to login page and verify "Login" text

  @regression
  Scenario Outline: : User should get error message with invalid credentials
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I should get error message "<errorMessage>" depends on username "<username>" and password "<password>"
    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |