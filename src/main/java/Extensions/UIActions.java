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
     * In this method, used if sentence to separate executing of mobile and web parts of the tests.
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
     * In this method, used if sentence to separate executing of mobile and web parts of the tests.
     *
     * @param elem  is a web element that I perform setting on it.
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
     * Method uploadPhoto perform uploading the image file into the web element.
     * Method uploadPhoto has WebDriverWait instance.
     *
     * @param elem     is a web element that I perform uploading on it.
     * @param location is a path of the image file.
     */
    @Step("Upload Photo")
    public static void uploadPhoto(WebElement elem, String location)
    {
        wait.until(ExpectedConditions.visibilityOf(elem)).sendKeys(location);
    }

    /**
     * Method languageDropDownList perform language drop down list.
     * Method languageDropDownList has Select instance class.
     * Also I use  method selectByVisibleText, it's check matching option of
     * elements that are found
     * In this method, used if sentence to separate executing of mobile and web parts of the tests.
     *
     * @param elem  is a web element of dropdown list.
     * @param value is a text of the list(any languages).
     */
    @Step("Set Text to DropDown List")
    public static void languageDropDownList(WebElement elem, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        Select onchange = new Select(elem);
        onchange.selectByVisibleText(value);
    }

    /**
     * Method setDatePicker perform setting of date picker.
     * Method setDatePicker has WebElement interface instance class.
     * In this method, used if sentence to separate executing of mobile and web parts of the tests.
     *
     * @param elem  is a web element of the date widget.
     * @param day is a number of the day in any month.
     */
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

}
