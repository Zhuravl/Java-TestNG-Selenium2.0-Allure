## My example of framework on Java, TestNG, Selenium2.0, Allure and Maven.

To start UI tests run next commands from the project root directory:
```
$ mvn clean test site
```

To open Allure with results of tests run:
```
$ allure serve {Project location}\build\allure-results
```
NOTE: It's required to install and add to the PATH [Maven](https://maven.apache.org/download.cgi) and [Allure](https://bintray.com/qameta/generic/allure2).
