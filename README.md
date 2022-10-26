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
    Feature: automationExerciseCucumber
        Background:
            Given Navigate to Web Site
            Then Verify that home page is visible successfully

    Scenario: Test Case 1_Register User
    Scenario: Test Case 2_Login User with correct email and password
    Scenario: Test Case 3_Test Case 3: Login User with incorrect email and password
    Scenario: Test Case 4_Logout User
    Scenario: Test Case 5_Register User with existing email
    Scenario: Test Case 6_Contact Us Form
    Scenario: Test Case 7_Verify Test Cases Page
