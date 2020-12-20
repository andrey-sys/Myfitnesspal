package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UIActions extends CommonOps
{

    @Step("Click Web Element")
    public static void click(WebElement elem)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Set Text to Text-Field")
    public static void updateText(WebElement elem, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("Upload Photo")
    public static void uploadPhoto(WebElement elem, String location)
    {

        wait.until(ExpectedConditions.visibilityOf(elem)).sendKeys(location);
    }

   /* @Step("Mouse Hover")
    public static void mouseHoverElement(WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();

    }*/

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

    @Step("Click Next button on Calendar to select next month")
    public static void clickNext(WebElement elem)
    {

    }

    @Step("Click Prev button on Calendar to select previous month")
    public static void clickPrev(WebElement elem)
    {

    }

}
