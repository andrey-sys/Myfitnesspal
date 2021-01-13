## MyFitnessPall Automation Project

***

**Project overview**

In this project, I'm testing the main functionality of
 the website https://www.myfitnesspal.com/ and his mobile application 
 MyFitnessPal.
  The main purpose of the project to obtain common and optimal 
 infrastructure for Web and Mobile platforms.
  Thus, I decided to use Bottom-up approach for this project. This kind of
 architecture uses separate small parts of the system and linked to
  form larger components, which are in turn linked to a complete
  system is formed.
  There is also many advantages to use OOP language like Java in this 
  architecture:
  
   - In this approach we focus on breaking up the problem into smaller parts.
   	In bottom up approach, we solve smaller problems and integrate it as whole
   	 and complete the solution.
   - Each part is programmed separately therefore contain redundancy.
   	Redundancy is minimized by using data encapsulation and data hiding.
   - This approach widely used in debugging, module documentation, etc.	It is 
   basically used in testing.
   - In the Bottom-up architecture composition takes place, and
    in this kind of implementation details may differ.
    
   Also, there is one major problem with Android architecture,
    this term has no canonical definition. Therefore I will try to involve it 
    to project like any other parts of code with common classes of Page Objects.
## Tools
 
 ***
 - Maven
 - Java
 - Selenium 
 - TestNG 
 - Appium 
 - Allure report
 - Javadoc
 - Jenkins
 
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
 - Make clone of the code from the repository 
 - Save project on your device locally
 - Cell phone(SAMSUNG Galaxy A8 2018 SM-A530F)or any other Android device,
      cable DATA
 - Download Jenkins.war file
  
  **Check the proper installation of all requirements**
      
 ## Usage
 
  ***
   This project have two main executable Classes MobileMyfitnesspalTests and
   WebMyfitnesspalTests. To run all those tests with Maven, I'm using XML files
   ExecuteMobile.xml & ExecuteWeb.xml. For executing ExecuteMobile.xml file
   you must install Appium Studio first, also download and install the application
    from Play Store MyFitnessPal App.
    initiate the Developer mode on your cellphone device. 
   Ensure the right connection to the Appium Studio with your phone, the 
   Appium Studio must be open all the time, when you performing the execution
   of mobile app. So after this preparation, you are ready to full execution
    of the tests.
    For starting execution of the ExecuteWeb.xml file, you need to create your
    account on the website, and change part of code: 
    
     Utilities package => CommonOps class => Line 118 =>
      WebFlows.login("username", "password");
      
   Set your own username and password, and do some manual manipulations to ensure
   that you are valid member of this website.   
  
   For executing ExecuteWeb.xml file, and after it, ExecuteMobile.xml, or 
   on the contrary with XML files, you can do next:
       
     Hold mouse on one of this files and click rigth mouse button,
     in the list choose:
     Run 'C:/Your/Path/ExecuteWeb.xml
     and hit enter button and you will see the execution has begun.
   
    
   I integrate ***Jenkins*** in my project, it is a free source that can handle
    any kind of build or continuous integration. So to launch with Jenkins
    you must download it, and install it locally with special key.
    After proper installing you need to launch it locally next way:
    
       Open your folder that contain Jenkins file with CMD and type:
       C:\Automation> java -jar jenkins.war --httpPort=9090
       *you can choose any free port you want, and hit enter button.
       
   After a few seconds you will see that Jenkins is started. 
   In your browser type:
   
     localhost:9090
     and hit enter button
     
  If you are already using Jenkins, just enter with you credentials, if not
  you need to use some Jenkins key to enter for a first time,
   and create your own username and password.
    You can find a lot of documentation on Web, how to perform it.
  
  **Be sure of
   proper cloning of the code to right location, to avoid of mistakes.**  
  
 The Web part of the project have an option to launch tests in Chrome,
  Edge or FireFox browser. For using this option,
   you need change part of code by following command: 
   
     go to folder on your IDE and get to the next folder:
     
     Configuration => DataConfig.xml  
     in line 7: type browser name (Chrome, Firefox or IE)
     <BrowserName>Chrome</BrowserName>
    
 
   You can execute those tests if you have this browsers installed on your PC. 
   You can type by uppercase or lowercase letters, It's does not matter.
   
## Reporting

***

I'm using ***JavaDoc*** without installing the specific plugin. To create
 javadoc you need create new folder in your project package and follow
 next steps:
 
 >- in Intellij go to Tools
 >- find Generate JavaDoc 
 >- adjust your Output directory with correct path for your javadoc's folder
 >- hit OK button after all preparations
 >- open javadoc folder and find the index.html file,
 >- open it in you browser.  
 
    
  In addition way, I'm using ***Allure*** report. You will see
  next folders after first execution:
  
     allure-report
     allure-results 
     
   folders in left corner, under project name. The next step is
   opening your terminal or shell, and typing after direction: 
   
     C:\YourPath\Project>allure serve - allure-results
     
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
     
  You can feel free to change or to add any report you wish. If you have  
  updates for improving this project, I will glad to know about it. 
You can mail me: andreyyershov424@gmail.com any suggestions would appreciated.