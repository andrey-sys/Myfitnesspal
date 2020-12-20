package PageObjects.ElectronApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPageElectron
{
    @FindBy(how = How.ID,using = "button-tray")
    public WebElement btn_tray;
    @FindBy(how = How.XPATH,using = "//*[@class='demo-button' and @id='put-in-tray']")
    public WebElement btn_demo;
    @FindBy(how = How.XPATH,using = "//*[@class='demo-response' and @id='tray-countdown']")
    public WebElement txt_click_demo_again;


}
