$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/automationFeature.feature");
formatter.feature({
  "name": "Check the basic working of AUT",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "  Given: Open the required URL",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Order T-shirt(and verify in order History)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Home Page of the AUT",
  "keyword": "Given "
});
formatter.match({
  "location": "Tshirt.user_is_on_the_Home_Page_of_the_AUT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Selects the T-shirt",
  "keyword": "When "
});
formatter.match({
  "location": "Tshirt.user_Selects_the_T_shirt()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat pages.TshrtLink.TShirtClick(TshrtLink.java:21)\r\n\tat step_definations.Tshirt.user_Selects_the_T_shirt(Tshirt.java:62)\r\n\tat ✽.User Selects the T-shirt(src/test/java/features/automationFeature.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enters the required details",
  "keyword": "And "
});
formatter.match({
  "location": "Tshirt.enters_the_required_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The order is displayed in the order History",
  "keyword": "Then "
});
formatter.match({
  "location": "Tshirt.the_order_is_displayed_in_the_order_History()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "  Given: Open the required URL",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Update Personal Information (First Name) in My Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SecondTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Home Page of the AUT",
  "keyword": "Given "
});
formatter.match({
  "location": "Tshirt.user_is_on_the_Home_Page_of_the_AUT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the T-shirt",
  "keyword": "When "
});
formatter.match({
  "location": "Tshirt.user_selects_the_T_shirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirms the address",
  "keyword": "And "
});
formatter.match({
  "location": "Tshirt.confirms_the_address()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Objects.java:203)\r\n\tat org.openqa.selenium.interactions.Actions.\u003cinit\u003e(Actions.java:66)\r\n\tat pages.TshrtLink.hover(TshrtLink.java:26)\r\n\tat step_definations.Tshirt.confirms_the_address(Tshirt.java:98)\r\n\tat ✽.confirms the address(src/test/java/features/automationFeature.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User updates the first name",
  "keyword": "Then "
});
formatter.match({
  "location": "Tshirt.user_updates_the_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});