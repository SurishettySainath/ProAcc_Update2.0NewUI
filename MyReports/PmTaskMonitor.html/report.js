$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Pm/PM/PmTaskMonitor.feature");
formatter.feature({
  "name": "Task Monitoring functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "PmTaskMonitor in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to PM Task Monitor page",
  "keyword": "Given "
});
formatter.match({
  "location": "PmTaskMonitor.user_should_be_navigate_to_PM_Task_Monitor_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select project name from the Projects dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "PmTaskMonitor.user_has_to_select_project_name_from_the_Projects_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on edit button to Update the PM Task",
  "keyword": "And "
});
formatter.match({
  "location": "PmTaskMonitor.user_has_to_click_on_edit_button_to_Update_the_PM_Task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can edit Status,Planned and Actual Date fields",
  "keyword": "And "
});
formatter.match({
  "location": "PmTaskMonitor.user_can_edit_Status_Planned_and_Actual_Date_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully updated the pm task",
  "keyword": "Then "
});
formatter.match({
  "location": "PmTaskMonitor.user_has_successfully_updated_the_pm_task()"
});
formatter.result({
  "status": "passed"
});
});