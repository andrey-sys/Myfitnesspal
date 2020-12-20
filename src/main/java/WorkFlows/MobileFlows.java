package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class MobileFlows extends CommonOps
{
    @Step("Quick Add Breakfast")
    public static void quickAddBreakfast(String calories)
    {
        diaryPage.btn_containerBreakfast.click();
        diaryPage.btn_quickAdd.click();
        UIActions.updateText(diaryPage.txt_quickCalories, calories);
        diaryPage.btn_done.click();

    }


    @Step("Quick Add Lunch")
    public static void quickAddLunch(String calories)
    {
        diaryPage.btn_containerLunch.click();
    }


    @Step("Quick Add Dinner")
    public static void quickAddDinner(String calories)
    {
        diaryPage.btn_containerDinner.click();
    }


    @Step("Delete Food from list")
    public static void deleteFood()
    {
        diaryPage.btn_edit.click();
        diaryPage.box_breakfast.click();
        diaryPage.btn_delete.click();
    }

}
