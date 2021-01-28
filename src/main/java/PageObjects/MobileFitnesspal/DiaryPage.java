package PageObjects.MobileFitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * There is a class for storing the page objects of the mobile application
 */
public class DiaryPage
{

    @FindBy(how = How.XPATH, using = "(//*[@id='more' and @class='android.widget.ImageButton'])[1]")
    public WebElement btn_containerBreakfast;
    @FindBy(how = How.XPATH, using = "(//*[@id='more' and @class='android.widget.ImageButton'])[2]")
    public WebElement btn_containerLunch;
    @FindBy(how = How.XPATH, using = "(//*[@id='more' and @class='android.widget.ImageButton'])[3]")
    public WebElement btn_containerDinner;
    @FindBy(how = How.XPATH, using = "//*[@text='Quick Add']")
    public WebElement btn_quickAdd;
    @FindBy(how = How.ID, using = "tvQuickCalories")
    public WebElement txt_quickCalories;
    @FindBy(how = How.XPATH, using = "//*[@contentDescription='Done']")
    public WebElement btn_done;
    @FindBy(how = How.ID, using = "food")
    public WebElement txt_food;
    @FindBy(how = How.XPATH, using = "//*[@contentDescription='Edit']")
    public WebElement btn_edit;
    @FindBy(how = How.XPATH, using = "//*[@id='meal_select_all']")
    public WebElement box_breakfast;
    @FindBy(how = How.XPATH, using = "//*[@contentDescription='Delete']")
    public WebElement btn_delete;
    @FindBy(how = How.XPATH, using = "//*[@id='dont_ask']")
    public WebElement box_dontAskMeAgain;
    @FindBy(how = How.XPATH, using = "//*[@id='button1']")
    public WebElement btn_deleteCompletely;

}
