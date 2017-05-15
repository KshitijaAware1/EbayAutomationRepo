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
  "name": "I open Ebay website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Ebay should exist",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I search for sony tv",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Check search result",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Select random product",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click AddToCart",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click Proceed Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Continue As Guest",
  "keyword": "Then "
});
formatter.match({
  "location": "Annotation.openBrowser()"
});
formatter.result({
  "duration": 3611350140,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.goToFacebook()"
});
formatter.result({
  "duration": 7040816112,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.ebay_should_exist()"
});
formatter.result({
  "duration": 26074,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.search_For_Sony_TV()"
});
formatter.result({
  "duration": 5755487534,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.check_search_result()"
});
formatter.result({
  "duration": 3429248703,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.select_random_product()"
});
formatter.result({
  "duration": 9536675509,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.click_AddToCart()"
});
formatter.result({
  "duration": 5812303125,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.click_Proceed_Checkout()"
});
formatter.result({
  "duration": 3746392477,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.continue_As_Guest()"
});
formatter.result({
  "duration": 5790277213,
  "status": "passed"
});
});