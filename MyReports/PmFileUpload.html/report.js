$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Pm/PM/PmFileUpload.feature");
formatter.feature({
  "name": "Pm File Upload functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Pm File Uploading in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to PM File Upload page",
  "keyword": "Given "
});
formatter.match({
  "location": "PmFileUpload.user_should_be_navigate_to_PM_File_Upload_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select project and Instance from the Pm File dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "PmFileUpload.User_has_to_select_project_and_Instance_from_the_Pm_File_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to Upload Comprehensive,Landscape,Custom code,License Optimization files",
  "keyword": "And "
});
formatter.match({
  "location": "PmFileUpload.user_has_to_Upload_Comprehensive_Landscape_Custom_code_License_Optimization_files()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully uploaded the pm files",
  "keyword": "Then "
});
formatter.match({
  "location": "PmFileUpload.user_has_successfully_uploaded_the_pm_files()"
});
formatter.result({
  "status": "passed"
});
});