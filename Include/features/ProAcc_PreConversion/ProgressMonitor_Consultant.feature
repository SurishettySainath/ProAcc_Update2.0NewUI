#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath Surishetty						  																							Reviewed By: Kamal
# Date   :   03/02/2021                                                                    Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Task Monitor for Consultant
# Feature Description: To add the details for Task Monitor for Consultant
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Pre Conversion Monitor for Consultant

 
  @SmokeTest
  Scenario Outline: Pre Conversion Monitor functionality for Consultant
    Given User should navigate to ProAcc Consultant login page
    When User should select Consultant Customername,Project Name,Consultant Instance Name,phase<Phases>
    Then User should successfully complete pm Monitor task

    Examples: 
      | Phases     |
      | Pre Conversion |

