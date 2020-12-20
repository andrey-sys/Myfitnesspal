package Helpers;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.MobileFlows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
public class RawTests extends CommonOps
{
//web
    @Test
    public  void setDate()
    {
        driver.findElement(By.xpath("//*[@class='top-nav']//*[@href='/food/diary']")).click();

        String Date = driver.findElement(By.xpath("//*[@class='date']//time[text()]")).getText();
        String[] newDate = Date.split("\\W+");   //separate all that non letter  "\\W+"  or "[ \n\t\r.,;:!?(){]"
        System.out.println(newDate.length);
        System.out.println("The day is: "+newDate[0]);
        System.out.println("The month is: "+newDate[1]);
        System.out.println("The date day is: "+newDate[2]);
        System.out.println("The year is: "+newDate[3]);

        driver.findElement(By.id("datepicker-trigger")).click();

        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//*[contains(text(),'Next')]")).click();

        WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        for (WebElement cell : columns)
        {
            if (cell.getText().equals("2"))
            {
                cell.click();
                break;
            }
        }
    }
    //web
    @Test
    public void dropDown() throws InterruptedException
    {
        driver.findElement(By.xpath("//*[@class='top-nav']//*[@href='/forums']")).click();
        Select report = new Select(driver.findElement(By.xpath("//*[contains(@onchange,'window')]")));
        report.selectByVisibleText("русский");
        Thread.sleep(3000);
//        List<WebElement> category = report.getOptions();
//        for (WebElement option: category)
//        {
//            if (option.getText().equals("Deutsch"))
//                option.click();
//            Thread.sleep(5000);
//        }
    }


    //mobile
    @Test
    public void delete0()
    {
        mainPage.btn_diary.click();
        MobileFlows.deleteFood();
        Verifications.testElement(diaryPage.txt_food,"0");
    }


    //electronDemoApp
        public WebDriver driver;
        public ChromeOptions opt;
        public DesiredCapabilities capabilities;

        @BeforeClass
        public void startSession()
        {
            System.setProperty("webdriver.chrome.driver", getData("DriverElectronPath"));
            opt = new ChromeOptions();
            opt.setBinary(getData("ElectronAppPath"));
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("chromeOptions", opt);
            capabilities.setBrowserName("chrome");
            driver = new ChromeDriver(capabilities);
        }

        @Test()
        public void Test01()
        {
            driver.findElement(By.id("button-windows")).click();
            driver.findElement(By.id("button-crash-hang")).click();
            driver.findElement(By.id("button-menus")).click();
            driver.findElement(By.id("button-tray")).click();
            System.out.println(driver.findElement(By.id("tray-demo-toggle")).getText());

        }

        @AfterClass
        public void closeSession()
        {
            driver.quit();
        }
    }




