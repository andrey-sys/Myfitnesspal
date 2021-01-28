package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;


/*Initiation of the global variables, objects, classes*/
public class Base
{
    public static String Platform;

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imageDiff = new ImageDiffer();
    public static ImageDiff diff;

    //Mobile
    public static DesiredCapabilities dc = new DesiredCapabilities();

    //Web pages
    public static PageObjects.WebMyfitnesspal.LoginPage myFitnesspalLogin;
    public static PageObjects.WebMyfitnesspal.MyHomePage myHomePage;
    public static PageObjects.WebMyfitnesspal.GoalsPage goalsPage;
    public static PageObjects.WebMyfitnesspal.CommunityPage communityPage;
    public static PageObjects.WebMyfitnesspal.FoodPage foodPage;

    //Mobile pages
    public static PageObjects.MobileFitnesspal.MainPage mainPage;
    public static PageObjects.MobileFitnesspal.DiaryPage diaryPage;


}
