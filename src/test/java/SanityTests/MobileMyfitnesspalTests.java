package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.MobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*to launch mobile tests have to start appium studio*/
@Listeners(Utilities.Listeners.class)
public class MobileMyfitnesspalTests extends CommonOps
{
    @Test(description = "Verify Title")
    @Description("Test description: verify that title is -Calories Remaining-")
    public void test01_verifyTitle()
    {
        Verifications.testElement(mainPage.txt_title, "Calories Remaining");
        mainPage.btn_home.click();
    }


    @Test(description = "Add food in Diary Page")
    @Description("Test description: quick add of breakfast, 300 calories")
    public void test02_addBreakfast()
    {
        mainPage.btn_diary.click();
        MobileFlows.quickAddBreakfast("300");
        Verifications.testElement(diaryPage.txt_food,"300");
        mainPage.btn_home.click();

    }
    @Test(description = "Delete food Breakfast")
    @Description("Test description: quick add of breakfast 50 calories and delete breakfast")
    public void test03_deleteBreakfast()
    {
        mainPage.btn_diary.click();
        MobileFlows.quickAddBreakfast("50");
        MobileFlows.deleteFood();
        Verifications.testElement(diaryPage.txt_food,"0");
        mainPage.btn_home.click();
    }
}
