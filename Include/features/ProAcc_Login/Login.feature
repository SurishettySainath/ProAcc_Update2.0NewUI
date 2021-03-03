#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																					    		Reviewed By:
# Date   :   30/10/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: ProAcc Login functionality
# Feature Description: User can Login over the ProAcc Application
#---------------------------------------------------------------------------------------------------------------------------------
Feature: ProAcc Login functionality

  @Smoketest
  Scenario Outline: Login to ProAcc application
    Given User should navigate to proacc login page
    When User has to enter the username<Username> and password<Password>
    And User has to click on Login button
    Then User has sucessfully logged into proacc application

    Examples: 
      | Username | Password |
      | admin    | admin@12 |
