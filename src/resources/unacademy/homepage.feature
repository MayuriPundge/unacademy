@Homepage 
Feature: Find a live class

Scenario: Find a live class
	Given User is on homepage of Unacademy application
	When user clicks on view all live classes on home page of Unacademy
	When user clicks on a live class on Unacademy
	Then live class should open on Unacademy
