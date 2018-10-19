Feature: Login
  This test is for login page

  Scenario: Valid login
    Given I navigate to giftrete.com
    When I click on the login link
    And I enter email
    And I enter password
    And I click on secure sign in
    Then I should be logged in
    Then I close the window


  Scenario: Invalid login
    Given I navigate to giftrete.com
    When I click on the login link
    And I enter email
    And I enter invalid password
    And I click on secure sign in
    Then I should not be logged in
    Then I close the window