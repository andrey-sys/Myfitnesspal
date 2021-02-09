package Utilities;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static Utilities.Base.driver;

/**
 * I am using the Listeners class to extend my TestNG report and Allure report.
 */

public class Listeners implements ITestListener
{
    @Step("Listeners CLASS: Starting execution of the tests")
    public void onStart(ITestContext execution)
    {
        System.out.println("------------------- Starting execution ------------------");
    }

    @Step("Listeners CLASS: Test is finished")
    public void onFinish(ITestContext execution)
    {
        System.out.println("------------------- Ending execution ------------------");
    }

    @Step("Listeners CLASS: Test failed but with in success percentage")
    public void onTestFailedButWithinSuccessPercentage(ITestResult test)
    {
        System.out.println();
    }

    @Step("Listeners CLASS: Test is skipped")
    public void onTestSkipped(ITestResult test)
    {
        System.out.println("------------- Skipping Test: " + test.getName() + " -------------");
    }
    @Step("Listeners CLASS: Test is started")
    public void onTestStart(ITestResult test)
    {
        System.out.println("------------- Starting Test: " + test.getName() + " -------------");
    }

    @Step("Listeners CLASS: Test is succeeded")
    public void onTestSuccess(ITestResult test)
    {
        System.out.println("------------- Test: " + test.getName() + " Passed ---------------");
    }

    @Step("Listeners CLASS: Test is failed and screen shot is done")
    public void onTestFailure(ITestResult test)
    {

        System.out.println("------------- Test: " + test.getName() + " Failed ---------------");
        saveScreenshot();
    }

    /**
     * This method is designed to take a screenshot if the test fails.
     */
    @Step("Listeners CLASS: Screen shot in case of test is failed")
    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenshot()
    {

        byte[] screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

}
