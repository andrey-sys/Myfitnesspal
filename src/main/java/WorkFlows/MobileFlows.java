package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

/**
 * There is a class for mobile business work flows of the mobile version of the app myfitnesspal
 */
public class MobileFlows extends CommonOps
{

    /**
     * This is a method for quick add the calories in Breakfast field
     *
     * @param calories represents a quantity of calories
     */
    @Step("Quick Add a calories for the Breakfast")
    public static void quickAddBreakfast(String calories)
    {
        diaryPage.btn_containerBreakfast.click();
        diaryPage.btn_quickAdd.click();
        UIActions.updateText(diaryPage.txt_quickCalories, calories);
        diaryPage.btn_done.click();

    }

    /**
     * This is a method for deleting the Food from the Calories Remaining
     */
    @Step("Delete Food from the the Calories Remaining")
    public static void deleteFood()
    {
        diaryPage.btn_edit.click();
        diaryPage.box_breakfast.click();
        diaryPage.btn_delete.click();
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


}
