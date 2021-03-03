$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Reports/Detail_Report.feature");
formatter.feature({
  "name": "Detail Report functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Generating Detail Report in proAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Detail Report page",
  "keyword": "Given "
});
formatter.match({
  "location": "Detail_Report.User_should_navigate_to_Detail_Report_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the project and instance from the respective dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "Detail_Report.User_has_to_select_the_project_and_instance_from_the_respective_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on download button to download the report",
  "keyword": "And "
});
formatter.match({
  "location": "Detail_Report.User_has_to_click_on_download_button_to_download_the_report()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully downloaded the detail report",
  "keyword": "Then "
});
formatter.match({
  "location": "Detail_Report.User_has_successfully_downloaded_the_detail_report()"
});
formatter.result({
  "status": "passed"
});
});