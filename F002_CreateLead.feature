Feature: CreateLead functionality of leaftaps application

#Background: 
#Given Open the chrome browser
#And Load the application url

Scenario: CreateLead with manadatory information
Given Enter the username as 'DemosalesManager' 
And Enter the password as 'crmsfa'
When Click on the login button
Then Homepage should be displayed
When Click on the 'CRM/SFA' link
Then 'My Home' page should be displayed 
When Click on the 'Leads' link
Then 'My Leads' page should be displayed 
When Click on the 'Create Lead' link
Then 'Create Lead' page should be displayed 






