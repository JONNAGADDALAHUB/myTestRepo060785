Feature: Free CRM Deals feature

Scenario Outline: Free CRM Deals test scenario

Given user is displayed with login page
When login page title is free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login Button
Then users lands on home page
Then user navigates to new deal page
Then user provides deal details
|DealTitle		|DealAmount	|Probability|Commission	|
|TestDealTitle	|500		|10			|5			|
And close the browser

Examples:
| username 	| password 		|
| ravikumarj| Loginpwd369@ 	| 