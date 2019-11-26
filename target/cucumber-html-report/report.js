$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/arief/eclipse-workspace/MyProject/src/test/java/SKECCollege.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Mohammed Arief"
    }
  ],
  "line": 4,
  "name": "Sri Krishna college Application",
  "description": "",
  "id": "sri-krishna-college-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@College"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Logging into college Application",
  "description": "",
  "id": "sri-krishna-college-application;logging-into-college-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@LoginPage"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Select the college name and Login Authority",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the UserName and Password and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.open_the_browser()"
});
formatter.result({
  "duration": 8840301343,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.select_the_college_name_and_Login_Authority()"
});
formatter.result({
  "duration": 418279670,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_the_UserName_and_Password_and_click_login_button()"
});
formatter.result({
  "duration": 6443975097,
  "status": "passed"
});
});