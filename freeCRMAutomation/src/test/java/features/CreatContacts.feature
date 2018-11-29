Feature: Free CRM Create Contacts feature

Scenario Outline: Free CRM Create Contacts test scenario

Given user is displayed with login page
When login page title is free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login Button
Then users lands on home page
Then user navigates to new contact page
Then user provides contact details as "<firstname>" and "<lastname>" and "<position>"
And close the browser

Examples:
| username 		| password 		| firstname | lastname     | position          			|
| ravikumarj  	| Loginpwd369@ 	| Ravikumar | Jonnagaddala | Senior Automation Engineer |