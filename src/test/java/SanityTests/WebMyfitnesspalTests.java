package SanityTests;

import Extensions.UIActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import Utilities.ScreenShot;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author Andrew
 * @version 1.0
 * @since <p>
 * This is main Web class of Sanity tests
 * Here I execute tests with TestNG for website myfitnesspal.com
 */

@Listeners(Utilities.Listeners.class)
public class WebMyfitnesspalTests extends CommonOps
{


    /**
     * In this test I verify username on Home page
     */
    @Test(description = "Verify username on Home page")
    @Description("Test description: verify the username on Home page")
    public void test01_username()
    {
        Verifications.expectedText(myHomePage.txt_myUserName, "andrewscottt");
    }

    /**
     * In this test I verify calories remaining on Home page
     */
    @Test(description = "Verify Calories")
    @Description("Test description: verify calories remaining on Home page")
    public void test02_caloriesRemaining()
    {
        Verifications.expectedText(myHomePage.txt_calories_remaining, "1890");
    }

    /**
     * In this test I verify that on Goals page also have the same quantity of calories remaining
     */
    @Test(description = "Click on Goals")
    @Description("Test description: click on goals page and verify calories remaining ")
    public void test03_clickGoals()
    {
        myHomePage.link_myGoals.click();
        Verifications.expectedText(goalsPage.txt_calories, "1890");
    }

    /**
     *
     */
    @Test(description = "Uploaded Picture")
    @Description("Test description: upload picture from Gallery on Community page," +
            " ensure that element(button) appear and delete the picture ")
    public void test04_uploadImage()
    {
        WebFlows.uploadImage(getData("FileLocation"));
        Verifications.expectedText(communityPage.btn_delete, "Delete");
        communityPage.btn_delete.click();
    }

    /**
     *
     */
    @Test(description = "Verify Picture")
    @Description("Test description: verifying uploaded image element with Ashot on Home page")
    public void test05_verifyPicture()
    {
        WebFlows.uploadImage(getData("FileLocation"));
        myHomePage.link_myHome.click();
        ScreenShot.takeScreenShot(myHomePage.img_uploadedImage, "code");
        Verifications.expectedImage(myHomePage.img_uploadedImage, "code");
        WebFlows.deletePicture();
    }

    /**
     *
     */
    @Test(description = "Set Date")
    @Description("Setting date: 2 August 2020 in Food page")
    public void test06_setDate()
    {
        myHomePage.link_food.click();
        WebFlows.setDate(getData("DateDayPicker"));
        Verifications.expectedElementDisplayed(foodPage.txt_date);
        Verifications.verifyDateDay(foodPage.txt_date, "2");
    }

    /**
     *
     */
    @Test(description = "Test DropDown List")
    @Description("Test dropdown list on Community page: select Deutsch in the list")
    public void test07_dropDown()
    {
        myHomePage.link_community.click();
        UIActions.languageDropDownList(communityPage.list_onchange, "Deutsch");
        Verifications.expectedText(communityPage.href_ruSearch, "Suchen");
    }

}
