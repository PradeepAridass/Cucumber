Feature: Hotel Booking Functionality

Background: Verify the user is able to login the application
 Given User launch the application
 When User enter the valid "PradeepStar" in the username field
 And user enter the valid "123456789" in the password field
 And user is able to click the login button
 Then user verify the navigate to search hotel page
 
 Scenario Outline: Verify the user is able to login the application
 Given User launch the application
 When User enter the valid "<username>" in the username field
 And user enter the valid "<password>" in the password field
 And user is able to click the login button
 Then user verify the navigate to search hotel page
 
 Examples:
 		|username|password|
 		|AAA|111|
 		|PradeepStar|123456789|
 
 
 @LoginPage
 Scenario: Verify the user is able to login the application
 Given User launch the application
 When User enter the valid "PradeepStar" in the username field
 And user enter the valid "123456789" in the password field
 And user is able to click the login button
 Then user verify the navigate to search hotel page
 	
 	
 
 @SearchHotelPage
 Scenario: Verify the user is able to search the hotel
 When user search and select the location of the hotel in the dropdown of location field
 And user is able to choose the hotel in the dropdown of hotels field
 And user is able to choose the room type in the dropdown of room type field 
 And user is able to select the number of rooms in the dropdown of number of rooms field
 And user enter the valid check in date in the check in date field
 And user enter the valid check out date in the check out date filed
 And user is able to select the adults per room in the adults per room field
 And user is able to select the children per room in the children per room field
 Then user verify the navigate to select the chosen hotel page
 
 
 Scenario: Verify the user is able to choose the select hotel in the field
 When user is able to click the chosen hotel in the select hotel field
 And user is able to click the continue button
 Then user verify the navigate to book a hotel page
 
 Scenario: verify the user is able to book a hotel
 When user enter the valid first name in the first name field
 And user enter the valid last name in the last name field
 And user enter the valid billing address in the billing address field
 And user enter the valid credit card number in the credit card no field
 And user is able to select the credit card type in the dropdown of credit card type field
 And user is able to select the valid month of the credit card validation in the expiry date
 And user is able to select the valid year of the credit card validation in the expiry date
 And user enter the valid cvv number in the cvv number field
 And user is able to click the book now button
 Then user verify the navigate to confirm the booking confirmation page
 
 Scenario:  verify the user is able to confirm the booking confirmation
 When user is able to click the logout button
 Then user verify the navigate to logout as a successful logout page
 
 Scenario: verify the user is able to confirm the successful logout
 When user is able to click the login again text
 Then user verify the navigate to login home page