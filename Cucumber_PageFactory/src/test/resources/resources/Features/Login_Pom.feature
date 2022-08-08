Feature: login

Scenario: login with valid credentials

Given open browser
When enter URL "https://www.saucedemo.com/"
Then enter username as "standard_user" and password as "secret_sauce"
And click on login button
When user clicks on React button
Then user log out
And close browser