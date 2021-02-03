package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.testng.Assert.*;

/**
 * This class is for verifying methods
 *
 * @see Utilities.CommonOps have extend from one of the main classes
 */
public class Verifications extends CommonOps
{
    /**
     * Method testElement verify text of the element.
     * In this method, used if sentence to avoid executing of the mobile part of the tests.
     *
     * @param elem          is a web element that I perform click on it.
     * @param expectedValue there is a text of the element.
     */
    @Step("Verify text in element")
    public static void expectedText(WebElement elem, String expectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        else
            assertEquals(elem.getText(), expectedValue);
    }

    /**
     * Method verifyDateDay verify the day in the calendar.
     * In this method I also use the split method which separates the number of the day from data row.
     * In this method, used if sentence to avoid executing of the mobile part of the tests.
     *
     * @param elem          is a web element of the data.
     * @param expectedValue there is a number of the day.
     */
    @Step("Verify date of the day")
    public static void verifyDateDay(WebElement elem, String expectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        String Date = elem.getText();
        String[] newDate = Date.split("\\W+");
        assertEquals(newDate[2], expectedValue);

    }


    /**
     * Method expectedElementDisplayed verify the date element if displayed.
     * In this method, used if sentence to avoid executing of the mobile part of the tests.
     *
     * @param elem          is a web element of the data.
     */
    @Step("Verify text element if displayed")
    public static void expectedElementDisplayed(WebElement elem)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }

    /**
     * This method takes screenshot in a 3 Step process:
     * Take the image from a web page for comparing as expectedImage.
     * Convert web driver element object to screenshot.
     * Called getImage method to create actualImage from web page
     * and methods makeDiff and hasDiff finds the difference between actual and expected images.
     *
     * @param imageElement      is a image element on the web page.
     * @param expectedImageName is a image in the file after screenshot.
     * @throws Exception in case of image wouldn't cached from source file ImageRepository.
     */
    @Step("Verify image on web page")
    public static void expectedImage(WebElement imageElement, String expectedImageName)
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
        imageDiff = new ImageDiffer();
        diff = imageDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(), "Image not same!!!");
    }

}
