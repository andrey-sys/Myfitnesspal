package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class ElectronFlows extends CommonOps
{
    @Step("Find Element with Text")
    public static void goToElement()
    {
        UIActions.click(mainPageElectron.btn_tray);
        UIActions.click(mainPageElectron.btn_demo);
    }
}
