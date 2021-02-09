package PageObjects.WebMyfitnesspal;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * There is a class for storing the page objects of the web site
 */
public class MyHomePage
{

    @FindBy(how = How.XPATH, using = "//*[text()='My Home']")
    public WebElement link_myHome;

    @FindBy(how = How.XPATH, using = "//*[@class='energy-remaining-number ']")
    public WebElement txt_calories_remaining;

    @FindBy(how = How.CLASS_NAME, using = "close-btn")
    public WebElement btn_container;

    @FindBy(how = How.XPATH, using = "//*[@title='andrewscottt']")
    public WebElement txt_myUserName;

    @FindBy(how = How.XPATH, using = "//*[@class='sub-nav']//*[@href='/account/my_goals']")
    public WebElement link_myGoals;

    @FindBy(how = How.XPATH, using = "//*[@class='no-image']//*[@href='/photos/edit']")
    public WebElement link_photo;

    @FindBy(how = How.XPATH, using = "//*[@class='ember-view']/img")
    public WebElement img_uploadedImage;

    @FindBy(how = How.XPATH, using = "//*[@class='top-nav']//*[@href='/food/diary']")
    public WebElement link_food;

    @FindBy(how = How.XPATH, using = "//*[@class='top-nav']//*[@href='/forums']")
    public WebElement link_community;
}
