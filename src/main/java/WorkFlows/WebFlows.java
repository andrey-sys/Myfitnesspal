package WorkFlows;

/*import Extensions.DBActions;*/

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class WebFlows extends CommonOps
{

    @Step("Login to Myfitnesspal")
    public static void login(String user, String password)
    {
        UIActions.updateText(myFitnesspalLogin.txt_userName, user);
        UIActions.updateText(myFitnesspalLogin.txt_password, password);
        UIActions.click(myFitnesspalLogin.btn_login);
    }

    @Step("Upload picture from file")
    public static void upload(String fileLocation)
    {
        UIActions.click(myHomePage.link_photo);
        UIActions.uploadPhoto(communityPage.file_photo, fileLocation);
        UIActions.click(communityPage.btn_commit);
    }

    @Step("Delete loaded picture")
    public static void deletePicture()
    {
        UIActions.click(myHomePage.link_myHome);
        UIActions.click(myHomePage.img_uploadedImage);
        UIActions.click(communityPage.btn_edit);
        UIActions.click(communityPage.btn_delete);
    }

    @Step("Set Data in Date Picker")
    public static void setDate(String day)
    {
        UIActions.click(foodPage.btn_datepicker);
        UIActions.click(foodPage.btn_next);  // next month
        UIActions.setDatePicker(foodPage.date_widget, day);
    }

}
