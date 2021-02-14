package Utilities;

import PageObjects.MobileFitnesspal.DiaryPage;
import PageObjects.MobileFitnesspal.MainPage;
import PageObjects.WebMyfitnesspal.*;
import org.openqa.selenium.support.PageFactory;

/**
 * The class ManagePages supports initialization of each page element in this project
 */
public class ManagePages extends Base
{
    /**
     * There is a class for initializing of all page objects in both parts of the
     * project, mobile and web.
     */
    public static void init()
    {
        //Web pages initialization
        myFitnesspalLogin = PageFactory.initElements(driver, LoginPage.class);
        myHomePage = PageFactory.initElements(driver, MyHomePage.class);
        goalsPage = PageFactory.initElements(driver, GoalsPage.class);
        communityPage = PageFactory.initElements(driver, CommunityPage.class);
        foodPage = PageFactory.initElements(driver, FoodPage.class);

        //Mobile pages initialization
        mainPage = PageFactory.initElements(driver, MainPage.class);
        diaryPage = PageFactory.initElements(driver, DiaryPage.class);

    }

}


