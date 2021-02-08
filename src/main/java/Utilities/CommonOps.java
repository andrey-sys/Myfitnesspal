package Utilities;

import Extensions.UIActions;
import WorkFlows.WebFlows;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * The CommonOps class is dedicated for initialization of the objects and definition of the main operation
 * in this project, that occur during the sequence of the main methods,
 * like @BeforeMethod, @AfterMethod, @BeforeClass and @AfterClass
 */
public class CommonOps extends Base
{

    /**
     * The class created for collaboration DataConfig.xml with the project, the
     * file which contains some auxiliary data, and stored as external source Strings in XML file
     *
     * @param nodeName is a string that represents some date from external file
     */
    public static String getData(String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try
        {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        } catch (Exception e)
        {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();

    }

    /**
     * This is a class for choosing which browser to be initialized for web driver
     *
     * @param browserType represent browser type
     */
    public void initBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFireFoxDriver();
        else if (browserType.equalsIgnoreCase("ie"))
            driver = initIExplorerDriver();
        else
            throw new RuntimeException(("Invalid Browser Type Name"));

        driver.manage().window().maximize();
        driver.get(getData("url"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);

    }

    /**
     * This is a class for initialization of ChromeDriver
     */
    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    /**
     * This is a class for initialization of FireFoxDriver
     */
    public static WebDriver initFireFoxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    /**
     * This is a class for initialization of IExplorerDriver
     */
    public static WebDriver initIExplorerDriver()
    {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    /**
     * This is a class for initialization of mobile RemoteDriver that collaborate with Appium Studio
     * Another words, there is a connection to mobile phone
     */
    public static void initMobile() throws MalformedURLException
    {
        dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.UDID, "52007779b4f55507");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.myfitnesspal.android");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".login.Welcome");

        driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), dc);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @BeforeMethod
    public void login()
    {

        if (Platform.equalsIgnoreCase("web"))
        {
            driver.get(getData("loginUrl"));
            try
            {
                UIActions.click(myFitnesspalLogin.btn_closeUpdateBanner);
            } catch (Exception e)
            {
                System.out.println("Exceptiom is: " + e);
            }
            WebFlows.login("andrewscottt", "123456");
            try
            {
                myHomePage.btn_container.click();
            } catch (Exception e)
            {
                System.out.println("Exception is: " + e);
            }
        }

    }

    /*initialization of platforms*/
    @Parameters({"PlatformName"})
    @BeforeClass
    public void startSession(String PlatformName) throws MalformedURLException
    {
        Platform = PlatformName;

        if (Platform.equalsIgnoreCase("web"))
        {
            initBrowser(getData("BrowserName"));
        } else if (Platform.equalsIgnoreCase("mobile"))
            initMobile();
        else
            throw new RuntimeException(("Invalid Platform Type Name"));
        ManagePages.init();

    }

    @AfterMethod
    public void afterMethod()
    {

    }

    @AfterClass
    public void closeSession()
    {
        driver.quit();
    }
}
