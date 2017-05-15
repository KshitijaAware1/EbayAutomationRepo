$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/automation/EbayAutomation/EbayFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber Report",
  "description": "",
  "id": "cucumber-report",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#This is to check test result for Pass test case"
    }
  ],
  "line": 5,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumber-report;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Login button should exist",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Annotation.goToFacebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});