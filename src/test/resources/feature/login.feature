Feature: Login into Mixcloud website
  Existing user should be able to login into account using correct credentials

  Scenario Outline: Login into account with correct credentials
    Given User navigates to mixcloud website
    When User clicks on the login button on homepage
    And User enters a valid username "<username>"
    And User enters a valid password "<password>"
    When User clicks on the login button
    Then User should be logged in
    And User enters searchkey
    When User find searchkey and click on it
    When User use Play all
    When User Follow it
    Then User check that searchkey add to favorite in profile
    When User delete searchkey from favorite

    Examples:
      | username              | password  |
      | kozjemyaka@gmail.com  | dariod13 |

