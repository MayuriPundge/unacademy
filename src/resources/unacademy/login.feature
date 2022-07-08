@Login
Feature: Validate Login functionality of Unacademy application


  Scenario: Login into Unacademy application
    Given User is on Login Page of Unacademy application
    When I Click on the Login button on Login Page of Unacademy application
    When I enter the "Mobile no." as "9112957937" on Login Page of Unacademy application
    #When I enter the "Password" as "<password>" on Login Page of Unacademy application
    And I Click on the Login button after input on Unacademy application
    #When I enter the "OTP" on enter OTP page of Unacademy application
    When I click on "Verify OTP" after entering OTP on Unacademy application 
    Then User should navigate to the Home page of Unacademy application

   # Scenario: Validate input fields with Valid inputs
    #Scenario: Validate input fields with Invalid inputs

