Feature: LoginFeature
 This feature deals with the login functionality of the application

 Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for login
		And I click login button
		Then I should see the userform page
		
 Scenario Outline: Login with correct username and password
    Given I navigate to the login page
    And I enter <Username> and <Password> and <Email>
		And I click login button
		Then I should see the userform page
		
	Examples:
	    	 |Username | Password| Email|
    		 |admin1	 | admin1	 | admin1@gmail.com|
    		 |admin2	 | admin2	 | admin2@gmail.com|