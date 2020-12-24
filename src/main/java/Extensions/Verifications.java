package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.testng.Assert.*;

public class Verifications extends CommonOps
{
    @Step("Verify Text in Element")
    public static void testElement(WebElement elem, String expectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        else
            assertEquals(elem.getText(), expectedValue);
    }

    @Step("Verify Text in Element")
    public static void testDateDay(WebElement elem, String expectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        String Date = elem.getText();
        String[] newDate = Date.split("\\W+");
        assertEquals(newDate[2], expectedValue);

    }

    @Step("Verify Text Part in Element")
    public static void testElementDisplayed(WebElement elem)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify image")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("ImageRepository") + expectedImageName + ".png"));
        } catch (Exception e)
        {
            System.out.println("Error reading image file: " + e);
        }

        Screenshot imageScreenshot = new AShot().takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenshot.getImage();
        diff = imageDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(), "Image not same!!!");
    }


}
