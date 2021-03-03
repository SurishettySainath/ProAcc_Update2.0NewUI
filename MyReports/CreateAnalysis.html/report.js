$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Consultant/CreateAnalysis.feature");
formatter.feature({
  "name": "Create Analysis functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create Analysis in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has to navigate to create analysis page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAnalysis.user_has_to_navigate_to_create_analysis_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Customer Name, Project Name and Instance Name from the dropdown List",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAnalysis.user_has_to_select_Customer_Name_Project_Name_and_Instance_Name_from_the_dropdown_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to upload SAP READINESS CHECK FILES for Activities, BWExtractors, CustomCode, HANADatabase, FioriApps, RelevantSimplification, SAPReadiness",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnalysis.user_has_to_upload_SAP_READINESS_CHECK_FILES_for_Activities_BWExtractors_CustomCode_HANADatabase_FioriApps_RelevantSimplification_SAPReadiness()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on the term of use and acknowldge checkboxes",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnalysis.user_has_to_click_on_the_term_of_use_and_acknowldge_checkboxes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on start analysis button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnalysis.user_has_to_click_on_start_analysis_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully navigate to readinesscheck",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAnalysis.user_should_successfully_navigate_to_readinesscheck()"
});
formatter.result({
  "status": "passed"
});
});