Feature: Login functionality of leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

Scenario: TC0001_Login with positive credential

Given Enter the username as 'DemosalesManager' 
And Enter the password as 'crmsfa'
When Click on the login button
Then Homepage should be displayed


Scenario: TC0002_Login with invalid credential

Given Enter the username as 'Demo'  
And Enter the password as 'crmsfa'
When Click on the login button
But Error message should be displayed





