**TestNG / Maven Test that is runnable from the command line, instead of via IDE (needed for Jenkins build)**

1. create testng.xml suite runner at project path to run the test classes

2. add `<suiteXmlFile>testng.xml</suiteXmlFile>` to properties section of pom.xml to specify the test suite to be run by Maven

3. update the pom.xml with the following build related plugins for executing the Maven project:
- maven-compiler-plugin</artifactId>
- maven-surefire-plugin</artifactId> - this produces a test result report, which an automated build can be dependent upon

4. right-click project and select Maven > Build, it will validate the project and download the new Maven dependencies 

5. right-click project and click on Run as > Maven test to execute the tests that are included i the testng.xml runner on the console

6. Surefire reports can be viewed by opening index.html in /target/surefire-reports

7. To run from command line:</br>

~ download Maven binaries (eg: 'apache-maven-3.6.0-bin.zip') and unzip to /programFiles</br>
~ add `MAVEN_HOME` to environment variables</br>
~ add `%MAVEN_HOME%/bin` to path</br>
~ you can validate the installation by running `> mvn --version`</br>
~ to run the tests on the command line -> in directory where POM.xml for project is located, run `> mvn test` </br>
**NOTE** normally, you would want to run headless tests using headless browser from the command line / as part of an automated build (as they run more quickly)

