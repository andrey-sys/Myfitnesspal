package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

/**
 * There is a class for web business work flows of the website myfitnesspal.com
 */
public class WebFlows extends CommonOps
{
    /**
     * There is a method for performing the login operation
     *
     * @param user     represents the username of the user
     * @param password represents the password of the user
     */
    @Step("Login to Myfitnesspal")
    public static void login(String user, String password)
    {
        UIActions.updateText(myFitnesspalLogin.txt_userName, user);
        UIActions.updateText(myFitnesspalLogin.txt_password, password);
        UIActions.click(myFitnesspalLogin.btn_login);
    }

    /**
     * There is a method for uploading images from a file location to the website
     *
     * @param fileLocation is representing the file location of the image on your device
     */
    @Step("Upload image from file")
    public static void uploadImage(String fileLocation)
    {
        UIActions.click(myHomePage.link_photo);
        UIActions.uploadPhoto(communityPage.file_photo, fileLocation);
        UIActions.click(communityPage.btn_commit);
    }

    /**
     * This is a method for deleting the image from the profile of the user
     */
    @Step("Delete loaded image")
    public static void deletePicture()
    {
        UIActions.click(myHomePage.link_myHome);
        UIActions.click(myHomePage.img_uploadedImage);
        UIActions.click(communityPage.btn_edit);
        UIActions.click(communityPage.btn_delete);
    }

    /**
     * This is a method for setting the number of the day to date picker
     *
     * @param day represents the number of the day, located in Configuration folder
     */
    @Step("Set Date in Date Picker")
    public static void setDate(String day)
    {
        UIActions.click(foodPage.btn_datepicker);
        UIActions.click(foodPage.btn_next);  // next month
        UIActions.setDatePicker(foodPage.date_widget, day);
    }

}
