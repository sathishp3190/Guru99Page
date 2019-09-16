$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Addcustomer.feature");
formatter.feature({
  "name": "Validate the Guru99 Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate AddCustomer Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.user_is_in_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the Details",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.user_Enter_the_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the Customer Id",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.user_verify_the_Customer_Id()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.resources.BaseClass.Click(BaseClass.java:20)\r\n\tat com.stepdefinition.AddCustomer.user_verify_the_Customer_Id(AddCustomer.java:40)\r\n\tat ✽.User verify the Customer Id(src/test/resources/Feature/Addcustomer.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});