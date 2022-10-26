Feature: automationExerciseCucumber

  Background:
    Given Navigate to Web Site
    Then Verify that home page is visible successfully

  Scenario: Test Case 1_Register User
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

  Scenario: Test Case 2_Login User with correct email and password
    And Click on Signup Login button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that "Logged in as" text
    #And Click Delete Account button
    #Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 3_Test Case 3: Login User with incorrect email and password
    And Click on Signup Login button
    Then Verify Login to your account is visible
    And  Enter incorrect email address and password
    And Click login button
    Then Verify error 'Your email or password is incorrect!' is visible

  Scenario: Test Case 4_Logout User
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
    And Click Logout Button
    Then Verify that user is navigated to login page

  Scenario: Test Case 5_Register User with existing email
    And Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and already registered email address
    And Click Signup button
    Then Verify errorr 'Email Address already exist!' is visible

  Scenario: Test Case 6_Contact Us Form
    And Click on Contact Us button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    #And Upload file
    And Click Submit button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click Home button and verify that landed to home page successfully

  Scenario: Test Case 7_Verify Test Cases Page
    And Click on Test Cases button
    Then Verify user is navigated to test cases page successfully
