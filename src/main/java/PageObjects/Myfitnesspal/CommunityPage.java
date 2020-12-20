package PageObjects.Myfitnesspal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommunityPage
{
    @FindBy(how = How.XPATH, using = "//*[@type='file']")
    public WebElement file_photo;
    @FindBy(how = How.XPATH, using = "//*[@name='commit']")
    public WebElement btn_commit;
    @FindBy(how = How.XPATH,using = "//*[text()='Delete']")
    public WebElement btn_delete;
    @FindBy(how = How.XPATH,using = "//*[@href='/photos/edit']")
    public WebElement btn_edit;
    @FindBy(how = How.XPATH,using = "//*[contains(@onchange,'window')]")
    public WebElement list_onchange;
    @FindBy(how = How.XPATH,using = "//*[@href='/ru/search']")
    public WebElement href_ruSearch;


}
