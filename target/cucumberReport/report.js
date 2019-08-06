$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/smavziutov/Matrix_smoke_Suit/target/test-classes/features/Events.feature");
formatter.feature({
  "name": "Events functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Log in to the web site",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user opens the Url of the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "Events_steps.user_opens_the_Url_of_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in using \"EventsCRM_Manager9@info.com\" and \"Ugh45wQ20\"",
  "keyword": "When "
});
formatter.match({
  "location": "Events_steps.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on leaves button",
  "keyword": "And "
});
formatter.match({
  "location": "Events_steps.user_clicks_on_leaves_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "save button verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Gula"
    },
    {
      "name": "@smokeSuit"
    }
  ]
});
formatter.step({
  "name": "user clicks on leaves request button",
  "keyword": "When "
});
formatter.match({
  "location": "Events_steps.user_clicks_on_leaves_request_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on date button",
  "keyword": "And "
});
formatter.match({
  "location": "Events_steps.user_clicks_on_date_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"vacation\" on description box",
  "keyword": "And "
});
formatter.match({
  "location": "Events_steps.user_enters_on_description_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the first option of leaves type",
  "keyword": "When "
});
formatter.match({
  "location": "Events_steps.user_selects_the_first_option_of_leaves_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"3\" on days box",
  "keyword": "And "
});
formatter.match({
  "location": "Events_steps.user_enters_on_days_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "When "
});
formatter.match({
  "location": "Events_steps.user_clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see warning message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Events_steps.user_should_see_warning_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});