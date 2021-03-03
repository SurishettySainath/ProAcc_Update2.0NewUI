#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath Surishetty						  																					    		Reviewed By:
# Date   :                                                                                    Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name:Task Monitoring functionality
# Feature Description: Task Monitoring over the pro acc application.
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Pm File Upload functionality in ProAcc

  @SmokeTest
  Scenario: Pm File Uploading in Pro Acc Application
    Given User should be navigate to PM File Upload page
    When User has to select project and Instance from the Pm File dropdown 
    And User has to Upload Comprehensive,Landscape,Custom code,License Optimization files
    Then User has successfully uploaded the pm files
    
