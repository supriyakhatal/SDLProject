Feature: Create SDL test

 Scenario: SDL Login
 
 Given user is open login page
 When user enter  username and password
 Then user open projects page
 Then user click on the new project button
 Then user select general details 
 Then user select translate engine
 Then user select the pricing model
 Then user select the workflow
 And user stop the test
 