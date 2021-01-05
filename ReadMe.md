## MyFitnessPall Automation Project

***

**Project overview**

In this project, I'm testing the main functionality of
 the website https://www.myfitnesspal.com/ and his mobile application
 on this site. The main purpose of this project to obtain common and optimal 
 infrastructure for Web and Mobile platforms.
  Thus, I decided to use Bottom-up approach for this project. This kind of
 architecture uses separate small parts of the system and linked to
  form larger components, which are in turn linked to a complete
  system is formed.
  There is also many advantages to use OOP language like Java in this 
  architecture:
  
   
## Tools
 
 ***
 - Maven
 - Java
 - Selenium webDriver
 - TestNG framework
 - Allure report
 - Javadoc
 
 ## Requirements
 
 ***
In order to execute those tests you need to
 have the following installed environments locally.
 - Windows OS
 - IDE IntelliJ IDEA
 - Maven 3.6.3 
 - Java 1.8
 - Chrome browser 
 - FireFox browser 
 - Edge browser latest version
 - Make clone from the repository
  
  After getting of the all stuff, check your installation by CMD, 
  
  for example:
     
     C:\Users\Andrew>allure  --version
     2.13.0
     
     C:\Users\Andrew>java -version
     java version "1.8.0_211"
      
 ## Usage
 
  ***
  To run all those tests with maven, after cloning this
   repo on your device, navigate to your directory folder 
  and open it in powerShell or CMD or in terminal of 
   your IDE, than type in command line:
   
     mvn compile 
    
   and hit enter, and then type in command line 
   
     mvn test 
      
  and hit enter. Now you can see the execution of those tests.
  You also can perform next command in your cmd:
  
     mvn clean install
    
  The command also will give you the same result. Be sure of
   proper cloning of the code to right location, to avoid of mistakes.  
  
 This exercise have an option to launch tests in Chrome,
  Edge or FireFox browser. For using this option,
   you need change part of code by following command: 
    go to folder on your IDE and get to the next class,
     TodosMVCUtilities--> InitBrowserDriver--> and
 in line 14,
 
     private static String browserType = "chrome"; 
    
 you need to change browser type that you wish. You can
  type "Firefox" or change it to "Edge",choose one of them,
   of course if you have this browser installed on your PC. 
   You can type by uppercase or lowercase letters, it's don't matter.
   
## Reporting

***
The configuration section for the maven-javadoc-plugin is optional. 
I'm using javadoc without installing the specific plugin, so
 after proper cloning and running this code, you can see a new folder
 named javadoc.
  
 > open javadoc folder and find the index.html file,
 > and open it in you browser.  
  
    
  In addition way, I'm using Allure report. First of all you must to see the
  next folders after first execution:
  
  ![alt text](C:\Dev\MyFitnessPall\v.png)
  
     allure-report
     allure-results 
     
   folders in left corner, under project name. The next step is
   opening your terminal, and typing after direction: 
   
     C:\Dev\MyFitnessPall>allure serve - allure-results
     
   and hit enter button, and after few seconds, you will see 
   in your default browser, new tab with Allure report.
   There is a lot of information about execution those tests, methods, 
   elements that was found and another additional information,
    that you can reach easily, by click on any topics.
   In case of test failures, the screenshot of the UI 
   at this point of failure will appear immediately
    under the next topic:
    
     Listeners CLASS: Screen shot in case of test is failed 1 sub-step1s 091ms
     Page Screen Shot                                             38 KB
     
     
 
