$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Reports/Assessment_Report.feature");
formatter.feature({
  "name": "Assessment report Functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Generating Assessment Report in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Reports page",
  "keyword": "Given "
});
formatter.match({
  "location": "Assessment_Report.user_should_navigate_to_Reports_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the project,instance from the respective dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "Assessment_Report.user_should_select_the_project_instance_from_the_respective_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see Comprehensive Assesssment and Readiness check Report, Landscape and System Management, Custom Code Analysis and License Optimization Reports",
  "keyword": "Then "
});
formatter.match({
  "location": "Assessment_Report.user_should_be_able_to_see_Comprehensive_Assesssment_and_Readiness_check_Report_Landscape_and_System_Management_Custom_Code_Analysis_and_License_Optimization_Reports()"
});
formatter.result({
  "status": "passed"
});
});