package Helpers;

import Utilities.CommonOps;
import Utilities.HelperMethods;
import org.testng.annotations.Test;

public class VisualTests extends CommonOps
{

    @Test
    public void createScreenShot()
    {
        HelperMethods.takeElementScreenShot(myHomePage.img_uploadedImage, "code");
    }
}