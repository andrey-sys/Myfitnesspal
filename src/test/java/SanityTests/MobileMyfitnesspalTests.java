package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.MobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author Andrew
 * @version 1.0
 * @since <p>
 * This is main Mobile class of Sanity tests
 * Here I execute tests with TestNG for mobile version myfitnesspal.com
 */
@Listeners(Utilities.Listeners.class)
public class MobileMyfitnesspalTests extends CommonOps
{
    /**
     * In this test I verify text, that title is: Calories Remaining
     */
    @Test(description = "Verify Title")
    @Description("Test description: verify that title is: Calories Remaining")
    public void test01_verifyTitle()
    {
        Verifications.expectedText(mainPage.txt_title, "Calories Remaining");
        mainPage.btn_home.click();
    }

    /**
     * In this test I verify quick add of breakfast, and calories must be 300
     */
    @Test(description = "Add food in Diary Page")
    @Description("Test description: quick add of breakfast, 300 calories")
    public void test02_addBreakfast()
    {
        mainPage.btn_diary.click();
        MobileFlows.quickAddBreakfast("300");
        Verifications.expectedText(diaryPage.txt_food, "300");
        mainPage.btn_home.click();

    }

    /**
     * In this test I verify the formula for counting the calories
     */
    @Test(description = "Delete food Breakfast")
    @Description("Test description: quick add of breakfast 50 calories and delete breakfast")
    public void test03_deleteBreakfast()
    {
        mainPage.btn_diary.click();
        MobileFlows.quickAddBreakfast("50");
        MobileFlows.deleteFood();
        Verifications.expectedText(diaryPage.txt_food, "0");
        mainPage.btn_home.click();
    }
}
