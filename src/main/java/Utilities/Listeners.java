package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static Utilities.Base.Platform;
import static Utilities.Base.driver;

public class Listeners implements ITestListener
{
    public void onStart(ITestContext execution)
    {
        System.out.println("------------------- Starting execution ------------------");
    }

    public void onFinish(ITestContext execution)
    {
        System.out.println("------------------- Ending execution ------------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test)
    {
        System.out.println();
    }


    public void onTestSkipped(ITestResult test)
    {
        System.out.println("------------- Skipping Test: " + test.getName() + " -------------");
    }

    public void onTestStart(ITestResult test)
    {
        System.out.println("------------- Starting Test: " + test.getName() + " -------------");
    }

    public void onTestSuccess(ITestResult test)
    {
        System.out.println("------------- Test: " + test.getName() + " Passed ---------------");
    }

    public void onTestFailure(ITestResult test)
    {

        System.out.println("------------- Test: " + test.getName() + " Failed ---------------");
        if (!Platform.equalsIgnoreCase("api")&&!Platform.equalsIgnoreCase("api_students"))
        saveScreenshot();
    }

    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenshot()
    {

        byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

}
