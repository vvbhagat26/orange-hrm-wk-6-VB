Feature: User Test

  As a user
  I want to verify admin can execute different actions on users.

  Background:I am on Login page

  @sanity @smoke @regression
  Scenario: Admin should add user successfully
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text
    And I click on Add button
    And I should see the Add User text
    And I select User Role as Admin
    And I enter Employee Name "Ranga  Akunuri"
    And I enter User Name "soni92"
    And I select Status as Disable
    And I enter Password "test@123" in create user
    And I enter Confirm Password "test@123" in create User
    And I click on Save button
    Then I should see the message "Successfully Saved"


  @smoke @regression
  Scenario: User created successfully and verify it
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text
    And I enter user name "soni92" in system users page
    And I select user role as Admin in system users page
    And I select status as disable in system users page
    And I click on search button
    Then I should verify the user name "soni92" in result list

  @regression
  Scenario: Admin should delete the user successfully
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text
    And I enter user name "soni92" in system users page
    And I select user role as Admin in system users page
    And I select status as disable in system users page
    And I click on search button
    And I should verify the user name "soni92" in result list
    And I click on check box against the user name
    And I click on delete button against the user name
    And I click on ok button on popup
    Then I should get successfully deleted message "Successfully Deleted"

  @regression
  Scenario Outline: User should search and verify the message record found
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text
    And I enter user name "<username>" in system users page
    And I select user role "<userrole>" in system users page
    And I select status "<status>" in system users page
    And I click on search button
    And I see the one record found "(1) Record Found" message
    And I should verify the username "<username>"
    Then I click on reset button
    Examples:
      | username     |  | userrole  |  | status |
      | Admin        |  | Admin     |  | Enable |
      | Nina.Patel   |  | ESS       |  | Enable |
      | Cassidy.Hope |  | ESS Cassi |  | Enable |
      | Odis.Adalwin |  | Admin     |  | Enable |

