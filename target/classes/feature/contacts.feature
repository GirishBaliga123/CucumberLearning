Feature: Free CRM create contacts

Scenario: Free CRM outline contacts scenario

Given user is on Login page
When title of login page Free CRM
Then user enters username and password
  | username | password |
  | GirishBaliga | test@123 |
Then user clicking on login button
Then user to moves Home page
Then moves to new contacts page
Then user enters firstname and lastname and position
   | firstname | lastname | position |
   | che | chong | google |
   | ching | chong | yahoo |
   | khong | phoo | ebay |
Then user closing the browser