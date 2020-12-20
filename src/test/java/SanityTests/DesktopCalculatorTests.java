package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.DesktopAppFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*Before execution of those tests, have to cancel experitest/appium dependencies and launch
     WinAppDriver from location: C:\Program Files (x86)\Windows Application Driver
     also must open Object Spy and launch inspect in next location
      C:\Program Files (x86)\Windows Kits\10\bin\10.0.19041.0\x86 */
@Listeners(Utilities.Listeners.class)
public class DesktopCalculatorTests extends CommonOps

{
    @Test(description = "Verify Addition Result")
    @Description("Verify result of addition on calculator desktop app, 1+9=10")
    public static void test01_Addition()
    {
        DesktopAppFlows.getAdditionResult();
        Verifications.testElement(mainCalculator.txt_display, "10");
    }

    @Test(description = "Verify Root Result")
    @Description("Verify result of Root of 144 (12) on calculator desktop app")
    public static void test02_Root()
    {
        DesktopAppFlows.getRootResult();
        Verifications.testElement(mainCalculator.txt_display,"12");
    }
}
