Feature: Free CRM Login feature 

Scenario Outline: Free CRM login test scenario 

	Given user is displayed with login page 
	When login page title is free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login Button 
	Then users lands on home page 
	And close the browser 
	
	Examples: 
		| username	| password		|
		| ravikumarj| Loginpwd369@	|
		
		
