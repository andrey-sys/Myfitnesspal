package Utilities;

import PageObjects.DesktopCalculator.MainCalculator;
import PageObjects.ElectronApp.MainPageElectron;
import PageObjects.MobileFitnesspal.DiaryPage;
import PageObjects.MobileFitnesspal.MainPage;
import PageObjects.Myfitnesspal.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    // initialization of elements of each page
    public static void init()
    {
        //Web pages initialization
        preLoginButton = PageFactory.initElements(driver, PageObjects.Myfitnesspal.HomePage.class);
        myFitnesspalLogin = PageFactory.initElements(driver, LoginPage.class);
        myHomePage = PageFactory.initElements(driver, MyHomePage.class);
        goalsPage = PageFactory.initElements(driver, GoalsPage.class);
        communityPage = PageFactory.initElements(driver, CommunityPage.class);
        foodPage = PageFactory.initElements(driver, FoodPage.class);
        reportsPage = PageFactory.initElements(driver, ReportsPage.class);

        //Mobile pages initialization
        mainPage = PageFactory.initElements(driver, MainPage.class);
        diaryPage = PageFactory.initElements(driver, DiaryPage.class);

        //Electron pages initialization
        mainPageElectron = PageFactory.initElements(driver, MainPageElectron.class);

        //Desktop Calculator App initialization
        mainCalculator= PageFactory.initElements(driver, MainCalculator.class);
    }


}


