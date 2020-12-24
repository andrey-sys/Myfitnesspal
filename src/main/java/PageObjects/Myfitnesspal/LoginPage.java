package PageObjects.Myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-thin fa-2x close']")
    public WebElement btn_closeUpdateBanner;

    @FindBy(how = How.XPATH,using = "//input[@id='username']")
    public WebElement txt_userName;

    @FindBy(how = How.XPATH,using = "//input[@id='password']")
    public WebElement txt_password;

    @FindBy(how = How.CLASS_NAME,using = "submit")
    public WebElement btn_login;


}
