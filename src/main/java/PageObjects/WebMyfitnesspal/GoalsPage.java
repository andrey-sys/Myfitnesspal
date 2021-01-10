package PageObjects.WebMyfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoalsPage
{
    @FindBy(how = How.XPATH,using = "//*[@class='col right' and text()='1890']")
    public WebElement txt_calories;
}
