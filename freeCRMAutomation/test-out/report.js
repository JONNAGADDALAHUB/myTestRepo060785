$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Deals feature",
  "description": "",
  "id": "free-crm-deals-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Deals test scenario",
  "description": "",
  "id": "free-crm-deals-feature;free-crm-deals-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is displayed with login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page title is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "users lands on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user navigates to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user provides deal details",
  "rows": [
    {
      "cells": [
        "TestdealTitle",
        "500",
        "10",
        "12"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "free-crm-deals-feature;free-crm-deals-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "free-crm-deals-feature;free-crm-deals-test-scenario;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 17,
      "id": "free-crm-deals-feature;free-crm-deals-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Free CRM Deals test scenario",
  "description": "",
  "id": "free-crm-deals-feature;free-crm-deals-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is displayed with login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page title is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "users lands on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user navigates to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user provides deal details",
  "rows": [
    {
      "cells": [
        "TestdealTitle",
        "500",
        "10",
        "12"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Stepdefinitions.user_is_displayed_with_login_page()"
});
formatter.result({
  "duration": 9051568539,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefinitions.login_page_title_is_free_CRM()"
});
formatter.result({
  "duration": 20579711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "Login_Stepdefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 444110308,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefinitions.user_clicks_on_login_Button()"
});
formatter.result({
  "duration": 206770732,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefinitions.users_lands_on_home_page()"
});
formatter.result({
  "duration": 16465208,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinitions.user_navigates_to_new_deal_page()"
});
formatter.result({
  "duration": 1097018270,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinitions.user_provides_deal_details(DataTable)"
});
formatter.result({
  "duration": 1838227659,
  "status": "passed"
});
formatter.match({
  "location": "Login_Stepdefinitions.close_the_browser()"
});
formatter.result({
  "duration": 894930073,
  "status": "passed"
});
});