$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Deletion/Customer_Delete.feature");
formatter.feature({
  "name": "Customer deletion functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer deletion in ProAcc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Customerlist page",
  "keyword": "Given "
});
formatter.match({
  "location": "Customer_Delete.user_should_navigate_to_Customerlist_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter customername in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Customer_Delete.user_has_to_enter_customername_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for customer",
  "keyword": "And "
});
formatter.match({
  "location": "Customer_Delete.user_has_to_click_on_delete_button_for_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted customer",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Delete.user_has_successfully_deleted_customer()"
});
formatter.result({
  "status": "passed"
});
});