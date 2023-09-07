Feature: Login Customer applications

  Background: Login Customer Applications

  Scenario Outline: Verify the Homepage when user login to applications
    Given when user enter RegisterdMobileNumber "<RegisterdMobileNumber>"
    When Click on Login With PasswordButton
    Then User should navigate to PasswordPage
    When User enter Password "<password>"
    And Click on Login button

    Examples: 
      | RegisterdMobileNumber | password |
      |            1232344556 | password |

  Scenario Outline: verify user can able to raise a query
    Given User should navigate to HomePage
    And Click on More Section
    And Click on Queries
    Then user should navigate to queries page
    And User select AppId From Application ID dropdown
    And User should click Raise a query button
    And User should select "<ApplicatioID>" "<ChooseTopic>" "<Choosesubtopic>" "<Description>"
    And Click on Submit button
    Then validate the query is created by "<ResolutionStatus>" status

    Examples: 
      | ApplicatioID | ChooseTopic | Choosesubtopic               | Description | ResolutionStatus |
      |      1003138 | Settlement  | Discount/Settlement Updation | issue       | avsaj            |
