package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * This class is for Actions methods
 *
 * @see Utilities.CommonOps have extend from one of the main classes
 */
public class UIActions extends CommonOps
{
    /**
     * Method click perform click on the element.
     * Method click has extended from Selenium method and have WebDriverWait instance.
     * In this method, used if sentence to avoid executing of a wait.until function on mobile tests.
     *
     * @param elem is a web element that I perform click on it.
     */
    @Step("Click Web Element")
    public static void click(WebElement elem)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    /**
     * Method updateText perform setting text into the text field.
     * Method updateText has extended from Selenium method and have WebDriverWait instance.
     * In this method, used if sentence to avoid executing of a wait.until function on mobile tests.
     *
     * @param elem is a web element that I perform setting on it.
     * @param value is a text that I set in the text field.
     */
    @Step("Set Text to Text-Field")
    public static void updateText(WebElement elem, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    /**
     *
     * */
    @Step("Upload Photo")
    public static void uploadPhoto(WebElement elem, String location)
    {
        wait.until(ExpectedConditions.visibilityOf(elem)).sendKeys(location);
    }


    @Step("Set Text to DropDown List")
    public static void updateDropDown(WebElement elem, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        Select onchange = new Select(elem);
        onchange.selectByVisibleText(value);
    }

    @Step("Set Date Picker ")
    public static void setDatePicker(WebElement elem, String day)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        List<WebElement> calendar = elem.findElements(By.tagName("td"));
        for (WebElement cell : calendar)
        {
            if (cell.getText().equals(day))
            {
                cell.click();
                break;
            }
        }
    }


     @Step("Mouse Hover")
    public static void mouseHoverElement(WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();

    }

}
