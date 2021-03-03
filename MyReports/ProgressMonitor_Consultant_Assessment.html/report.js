$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Consultant/ProgressMonitor_Consultant.feature");
formatter.feature({
  "name": "Progress Monitor functionality for Consultant in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Progress Monitor for Consultant in ProAcc Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to ProAcc Consultant login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should select Consultant Customername,Project Name,Consultant Instance Name,phase\u003cPhases\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User should successfully complete pm Monitor task",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Phases"
      ]
    },
    {
      "cells": [
        "Assessment"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Progress Monitor for Consultant in ProAcc Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to ProAcc Consultant login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.User_should_navigate_to_ProAcc_Consultant_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Consultant Customername,Project Name,Consultant Instance Name,phaseAssessment",
  "keyword": "When "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.User_should_select_Consultant_Customername_Project_Name_Consultant_Instance_Name_phase(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully complete pm Monitor task",
  "keyword": "Then "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.User_should_successfully_complete_pm_Monitor_task()"
});
formatter.result({
  "status": "passed"
});
});