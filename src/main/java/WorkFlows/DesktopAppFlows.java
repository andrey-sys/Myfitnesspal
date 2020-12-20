package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class DesktopAppFlows extends CommonOps
{
    @Step("Addition Action")
    public static void getAdditionResult()
    {
        UIActions.click(mainCalculator.btn_clear);
        UIActions.click(mainCalculator.btn_one);
        UIActions.click(mainCalculator.btn_plus);
        UIActions.click(mainCalculator.btn_nine);
        UIActions.click(mainCalculator.btn_equals);
    }

    @Step("Root Action")
    public static void getRootResult()
    {
        UIActions.click(mainCalculator.btn_clear);
        UIActions.click(mainCalculator.btn_one);
        UIActions.click(mainCalculator.btn_four);
        UIActions.click(mainCalculator.btn_four);
        UIActions.click(mainCalculator.btn_root);



    }
}
