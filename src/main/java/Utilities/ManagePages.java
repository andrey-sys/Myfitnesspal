package Utilities;

import PageObjects.MobileFitnesspal.DiaryPage;
import PageObjects.MobileFitnesspal.MainPage;
import PageObjects.WebMyfitnesspal.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    // initialization of elements of each page
    public static void init()
    {
        //Web pages initialization
        myFitnesspalLogin = PageFactory.initElements(driver, LoginPage.class);
        myHomePage = PageFactory.initElements(driver, MyHomePage.class);
        goalsPage = PageFactory.initElements(driver, GoalsPage.class);
        communityPage = PageFactory.initElements(driver, CommunityPage.class);
        foodPage = PageFactory.initElements(driver, FoodPage.class);
        reportsPage = PageFactory.initElements(driver, ReportsPage.class);

        //Mobile pages initialization
        mainPage = PageFactory.initElements(driver, MainPage.class);
        diaryPage = PageFactory.initElements(driver, DiaryPage.class);


    }


}


