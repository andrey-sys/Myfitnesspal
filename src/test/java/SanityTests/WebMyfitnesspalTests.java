package SanityTests;

import Extensions.UIActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import Utilities.ScreenShot;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.Listeners.class)  //https://www.guru99.com/listeners-selenium-webdriver.html
public class WebMyfitnesspalTests extends CommonOps
{

    @Test(description = "Verify Login to myfitnesspal")
    @Description("Test description: verify the username on Home page")
    public void test01_login()
    {
        Verifications.testElement(myHomePage.txt_myUserName, "andrewscottt");
    }

    @Test(description = "Verify Calories")
    @Description("Test description: verify calories remaining on Home page")
    public void test02_caloriesRemaining()
    {
        Verifications.testElement(myHomePage.txt_calories_remaining, "1890");
    }

    @Test(description = "Click on Goals")
    @Description("Test description: click on goals page and verify calories remaining ")
    public void test03_clickGoals()
    {
        myHomePage.link_myGoals.click();
        Verifications.testElement(goalsPage.txt_calories, "1890");
    }

    @Test(description = "Uploaded Picture")
    @Description("Test description: upload picture from Gallery on Community page," +
            " ensure that element(button) appear and delete the picture ")
    public void test04_uploadImage()
    {
        WebFlows.upload(getData("FileLocation"));
        Verifications.testElement(communityPage.btn_delete, "Delete");
        communityPage.btn_delete.click();
    }


    @Test(description = "Verify Picture")
    @Description("Test description: verifying uploaded image element with Ashot on Home page")
    public void test05_verifyPicture()
    {
        WebFlows.upload(getData("FileLocation"));
        myHomePage.link_myHome.click();
        ScreenShot.takeScreenShot(myHomePage.img_uploadedImage, "code");
        Verifications.visualElement(myHomePage.img_uploadedImage, "code");
        WebFlows.deletePicture();
    }

    @Test(description = "Set Date")
    @Description("Setting date: 2 August 2020 in Food page")
    public void test06_setDate()
    {
        myHomePage.link_food.click();
        WebFlows.setDate(getData("DateDayPicker"));
        Verifications.testElementDisplayed(foodPage.txt_date);
        Verifications.testDateDay(foodPage.txt_date, "2");
    }

    @Test(description = "Test DropDown List")
    @Description("Test dropdown list on Community page: select \"русский\" in the list")
    public void test07_dropDown()
    {
        myHomePage.link_community.click();
        UIActions.languageDropDownList(communityPage.list_onchange,"русский");
        Verifications.testElement(communityPage.href_ruSearch,"Поиск");
    }


}
