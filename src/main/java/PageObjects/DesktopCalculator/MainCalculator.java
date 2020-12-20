package PageObjects.DesktopCalculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainCalculator
{
    @FindBy(how = How.NAME, using = "Clear")
    public WebElement btn_clear;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num1Button']")
    public WebElement btn_one;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num4Button']")
    public WebElement btn_four;
    @FindBy(how = How.NAME, using = "Plus")
    public WebElement btn_plus;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num9Button']")
    public WebElement btn_nine;
    @FindBy(how = How.NAME, using = "Equals")
    public WebElement btn_equals;
    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement txt_display;
    @FindBy(how = How.XPATH,using = "//*[@AutomationId='squareRootButton']")
    public WebElement btn_root;


}
