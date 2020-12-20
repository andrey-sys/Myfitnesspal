package PageObjects.Myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage
{
    @FindBy(how = How.XPATH,using = "//a[@href='/account/login']")
    public WebElement btn_preLogin;


}
