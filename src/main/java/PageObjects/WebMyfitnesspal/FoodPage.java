package PageObjects.WebMyfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * There is a class for storing the page objects of the web site
 */
public class FoodPage
{
    @FindBy(how = How.ID, using = "datepicker-trigger")
    public WebElement btn_datepicker;
    @FindBy(how = How.XPATH, using = "//*[@id='ui-datepicker-div']//*[contains(text(),'Next')]")
    public WebElement btn_next;
    @FindBy(how = How.XPATH, using = "//*[@id='ui-datepicker-div']//*[contains(text(),'Prev')]")
    public WebElement btn_prev;
    @FindBy(how = How.ID, using = "ui-datepicker-div")
    public WebElement date_widget;
    @FindBy(how = How.TAG_NAME, using = "td")
    public List<WebElement> columns;
    @FindBy(how = How.XPATH, using = "//*[@class='date']//time[text()]")
    public WebElement txt_date;

}
