package PageObjects.Myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReportsPage
{
    @FindBy (how = How.XPATH,using = "//*[@id='report_chzn']//span[contains(text(),Weight)]")
    public WebElement btn_dropDown;
    @FindBy(how = How.XPATH,using = "//*[@id='report']//*[@value]")
    public WebElement dropDown;

}
