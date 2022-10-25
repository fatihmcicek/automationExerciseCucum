<h2  align="center" > Automation Exercise Test Cases</h2>

![App Screenshot](https://user-images.githubusercontent.com/50528457/197885512-a78cd142-7626-4ef3-8f1c-9035102ffb69.PNG)

### Used technologies

**Java:** The programming language in which the project is written

**TestNG:** Test Authoring Tool used for writing Test Cases and controlling outputs.

**Selenium:** Test Automation Tool used to test Website

**Page Object Model:** It is the architectural structure used in the project.

**Maven:** Automation and build tool that is usually used during the compilation of commands on the Java platform.

**Cucumber:**(Cucumber is a test automation approach supported by BDD (Behavior Driven Development))

**Gherkin:** Gherkin is a plain-text language. Designed to be learned by non-programmers

**Faker:** This library is a port of Ruby's faker gem (as well as Perl's Data::Faker library) that generates fake data.
It's useful when you're developing a new project and need some pretty data for showcase.

----

### Test Scenarios

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
