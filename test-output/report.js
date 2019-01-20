$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/SundayFW/BDDAutomation/src/main/java/feature/contacts.feature");
formatter.feature({
  "name": "Free CRM create contacts",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Free CRM outline contacts scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactsStepDefinition.user_is_already_on_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page Free CRM",
  "keyword": "When "
});
formatter.match({
  "location": "ContactsStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "GirishBaliga",
        "test@123"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.ClassCastException: java.lang.String cannot be cast to [Ljava.lang.CharSequence;\r\n\tat stepDefinition.ContactsStepDefinition.user_enters_username_and_password(ContactsStepDefinition.java:43)\r\n\tat ✽.user enters username and password(C:/SundayFW/BDDAutomation/src/main/java/feature/contacts.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicking on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.user_clicking_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user to moves Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.user_to_moves_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "moves to new contacts page",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.create_contacts()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters firstname and lastname and position",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position"
      ]
    },
    {
      "cells": [
        "che",
        "chong",
        "google"
      ]
    },
    {
      "cells": [
        "ching",
        "chong",
        "yahoo"
      ]
    },
    {
      "cells": [
        "khong",
        "phoo",
        "ebay"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});