$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Conversion/ProgressMonitor_Pm.feature");
formatter.feature({
  "name": "Conversion Progress Monitor functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Conversion Progress Monitoring in Pro Acc Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Progress Monitor page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select project,Instance fields from the project dropdown",
  "keyword": "When "
});
formatter.step({
  "name": "User can Download the tasks by click on Download Icon",
  "keyword": "And "
});
formatter.step({
  "name": "User can send mail to respective person by click on Mail Icon",
  "keyword": "And "
});
formatter.step({
  "name": "User can add activities by click on Add Activity\u003cActivity\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click on edit button to Update the Status",
  "keyword": "And "
});
formatter.step({
  "name": "User can edit Status,Planned Date,Est Hours fields",
  "keyword": "And "
});
formatter.step({
  "name": "User has successfully Updated the Progress Monitor Status\u003cActivity\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Activity"
      ]
    },
    {
      "cells": [
        "goks_Con"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Conversion Progress Monitoring in Pro Acc Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to Progress Monitor page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProgressMonitor.user_should_be_navigate_to_Progress_Monitor_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select project,Instance fields from the project dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "ProgressMonitor.user_has_to_select_project_Instance_fields_from_the_project_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can Download the tasks by click on Download Icon",
  "keyword": "And "
});
formatter.match({
  "location": "ProgressMonitor.user_can_Download_the_tasks_by_click_on_Download_Icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can send mail to respective person by click on Mail Icon",
  "keyword": "And "
});
formatter.match({
  "location": "ProgressMonitor.user_can_send_mail_to_respective_person_by_click_on_Mail_Icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can add activities by click on Add Activitygoks_Con",
  "keyword": "And "
});
formatter.match({
  "location": "ProgressMonitor.user_can_add_activities_by_click_on_Add_Activity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on edit button to Update the Status",
  "keyword": "And "
});
formatter.match({
  "location": "ProgressMonitor.user_has_to_click_on_edit_button_to_Update_the_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can edit Status,Planned Date,Est Hours fields",
  "keyword": "And "
});
formatter.match({
  "location": "ProgressMonitor.user_can_edit_Status_Planned_Date_Est_Hours_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully Updated the Progress Monitor Statusgoks_Con",
  "keyword": "Then "
});
formatter.match({
  "location": "ProgressMonitor.user_has_successfully_Updated_the_Progress_Monitor_Status(String)"
});
formatter.result({
  "status": "passed"
});
});