@e2e
Feature: Verify the functionalities of the advantage online shopping page
  I, as a functional user of the advantage online shopping application
  I want to test the functionalities: user registration, user login, contact form registration and addition of any product from the Speaker section of the portal.

  Scenario: user registration
    Given "brandon" you need to enter the advantage online shopping page to register
    When he enters the necessary information to create the registration
    Then it is verified that you have been able to register

  Scenario: user login
    Given "brandon" you need to enter the advantage online shopping page to log in
    When you enter the necessary information to log in
      | user     | pass    |
      | bquevedo | Bq12345 |
    Then verify that you have successfully logged in

  Scenario: contact form registration
    Given "brandon" you need to enter the online shopping advantage page to perform the contact form registration
    When you enter the necessary information from the contact form
      | category | product                         | email                | subject                                                        |
      | Speakers | Bose SoundLink Wireless Speaker | funezneyer@gmail.com | I need more information about the product and payment methods. |
    Then verify that you have successfully submitted the information with the message "Thank you for contacting Advantage support."

  Scenario:addition of any product from the Speaker section of the portal
    Given "brandon" you need to enter the online shopping advantage page
    When he adds any product from the Speaker section "Bose SoundLink Wireless Speaker"
    Then he verifies that he has added the product from the Speaker section