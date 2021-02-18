package Utilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;

import javax.imageio.ImageIO;
import java.io.File;

/**
 * There is a class for making a screenshot of the page
 */
public class ScreenShot extends CommonOps
{

    /**
     * There is a method takeScreenShot allows to make a screen shot of uploaded image
     *
     * @param imageElement is an element of the uploaded image
     * @param imageName    is a name of the image
     */
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
