package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ElectronFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*Electron app*/
@Listeners(Utilities.Listeners.class)
public class ElectronDemoTests extends CommonOps
{
    @Test(description = "Verify Text")
    @Description("Test description: verify text of the element is -Click demo again to remove.-")
    public static void test01_verifyText()
    {
        ElectronFlows.goToElement();
        Verifications.testElement(mainPageElectron.txt_click_demo_again,"Click demo again to remove.");

    }
}
