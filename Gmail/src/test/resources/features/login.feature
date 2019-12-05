
Feature: login feature

  @login
  Scenario: login site for book a ticket
    Given open broswerand enter url
    When Enter username and password and click on sigin
    Then user login into application
    When user click on signoff
    Then user logout from application

  