@signup
Feature: SignUp Action

Background: 
Given User is on Home Page
When user Nevigate to Login Page
Given User is on SignUp Page
When User Nevigate to SignUP 

@valid_SignUp
Scenario: Successful SignUp with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
Given User is on SignUp Page
When User Nevigate to SignUP 
And User have enters Mobile Number
And User have to enters OTP
And User have to enters Name
And User have to enters Email Address
And User have to slect State Residence
And User have to agree Unacademy Term's and Privacy Policy
Then Message displayed SignUp Successfully



