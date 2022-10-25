Feature: automationExerciseCucum

  Scenario: Test Case 1_Register User
    Given Navigate to Web Site
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and email address
    And Click Signup button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Click Create Button
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button