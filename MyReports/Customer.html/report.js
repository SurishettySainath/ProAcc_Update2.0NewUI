$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ProAcc_Admin/UserSettings/Customer.feature");
formatter.feature({
  "name": "Customer functionality in ProAcc",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer Creation in Pro Acc Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate to customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "Customer.user_should_be_navigate_to_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Add Customer button",
  "keyword": "When "
});
formatter.match({
  "location": "Customer.user_has_to_click_on_Add_Customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Industrysector,ContactName,emailid,phone",
  "keyword": "And "
});
formatter.match({
  "location": "Customer.user_has_to_fill_the_fields_like_Industrysector_ContactName_emailid_phone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on save button for creating customer",
  "keyword": "And "
});
formatter.match({
  "location": "Customer.user_has_to_click_on_save_button_for_creating_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can verify the created customer in the search list",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer.user_can_verify_the_created_customer_in_the_search_list()"
});
formatter.result({
  "status": "passed"
});
});