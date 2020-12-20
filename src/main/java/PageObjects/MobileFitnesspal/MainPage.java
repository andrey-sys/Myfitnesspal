package PageObjects.MobileFitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//mobile
public class MainPage
{
    @FindBy(how = How.ID,using = "title")
    public WebElement txt_title;
    @FindBy(how = How.ID,using = "goal")
    public WebElement txt_goal;
    @FindBy(how = How.ID,using = "food")
    public WebElement txt_food;
    @FindBy(how = How.ID,using = "exercise")
    public WebElement txt_exercize;
    @FindBy(how = How.ID,using = "remaining")
    public WebElement txt_remaining;
    @FindBy(how = How.ID,using = "action_diary")
    public WebElement btn_diary;
    @FindBy(how = How.XPATH,using = "//*[@text='Home']")
    public WebElement btn_home;

}
