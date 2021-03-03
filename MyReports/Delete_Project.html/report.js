$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Deletion/Prj_Delete.feature");
formatter.feature({
  "name": "Project deletion functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Project deletion in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Project Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Project_Delete.user_should_navigate_to_Project_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Projectname in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Project_Delete.user_has_to_enter_Projectname_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for project",
  "keyword": "And "
});
formatter.match({
  "location": "Project_Delete.user_has_to_click_on_delete_button_for_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted Project",
  "keyword": "Then "
});
formatter.match({
  "location": "Project_Delete.user_has_successfully_deleted_Project()"
});
formatter.result({
  "status": "passed"
});
});