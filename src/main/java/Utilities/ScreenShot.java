package Utilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;

import javax.imageio.ImageIO;
import java.io.File;

/**
 * There is a class for making a screenshot of the page
 * */
public class ScreenShot extends CommonOps
{

    public static void takeScreenShot(WebElement imageElement, String imageName)
    {
        try
        {
            imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
            ImageIO.write(imageScreenShot.getImage(), "png"
                    , new File(getData("ImageRepository") + imageName + ".png"));
        } catch (Exception e)
        {
            System.out.println("Error copy image file: " + e);
        }
    }
}
