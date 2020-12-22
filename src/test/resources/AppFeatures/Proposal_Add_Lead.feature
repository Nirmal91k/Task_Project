Feature: Adding NEW LEAD feature

Scenario: Proposing build and adding NEW LEAD feature
Given user is on login page
When user enters username
And user enters password
And user clicks on Login button
When user clicks on Build proposal through Sales Tools from Menu icon
Then user clicks SELECT LEAD proposal
Then user clicks on ADD LEAD button
Then user enters First Name
And user enters Last Name
And user enters Email address
And user enters Phone Number
And user enters Scheduling Request Input Date
And user enters Scheduling Request Input Time
And user Uploads Document
And user Uploads Images
Then user click on SAVE LEAD button
