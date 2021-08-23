package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProfilePage extends AbstractPage{

    @FindBy(id = "usernameOrEmail")
    public WebElement usernameTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(css = "[class='login__form-action']")
    public WebElement continueButton;

    @FindBy(css = "[class='login__form-action']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),\"Log In\")]")
    public WebElement loginLink;

    @FindBy(css = "[class*='signout']")
    public WebElement logoutButton;

    @FindBy(id = "first_name")
    public WebElement firstNameTextbox;

    @FindBy(id = "last_name")
    public WebElement lastNameTextbox;

    @FindBy(id = "display_name")
    public WebElement displayNameTextbox;

    @FindBy(id = "description")
    public WebElement descriptionTextbox;

    @FindBy(id = "inspector-toggle-control-0")
    public WebElement toggleButton;

    @FindBy(css = "[class*='form-button']")
    public WebElement saveProfileButton;

    @FindBy(xpath = "//*[contains(text(),\"Add\")]")
    public WebElement addButton;

    @FindBy(xpath = "//*[contains(text(),\"Add URL\")]")
    public WebElement addURLButton;

    @FindBy(xpath = "//*[contains(text(),\"Add WordPress\")]")
    public WebElement addWordPressButton;

    @FindBy(xpath = "//*[contains(text(),\"Create Site\")]")
    public WebElement createSiteButton;

    @FindBy(css = "[placeholder=\"Enter a URL\"]")
    public WebElement enterURLTextbox;

    @FindBy(css = "[placeholder=\"Enter a description\"]")
    public WebElement descriptionURLTextbox;

    @FindBy(xpath = "//*[contains(text(),\"Add Site\")]")
    public WebElement addSiteButton;

    @FindBy(xpath = "//*[contains(text(),\"Cancel\")]")
    public WebElement cancelButton;

    @FindBy(css = "[class=\"profile-link\"]")
    public WebElement profileLinkResult;

    @FindBy(css = "[class*=\"profile-link__remove\"]")
    public WebElement profileLinkRemove;

    @FindBy(css = "[data-tip-target=\"me\"] img")
    public WebElement myProfileButton;

    @FindBy(css = "[class*='user-display-name']")
    public WebElement displayNameLabel;

    @FindBy(css = "[class*=\"notice__content\"]")
    public WebElement statusNotification;

    @FindBy(css = "[class*=\"profile-links\"]")
    public WebElement profileLinks;


    

    

    

    
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public WebDriver getdriver(){
        return driver;
    }

    public void open_myprofile(){
        waitForElementToBeClickable(myProfileButton);
        myProfileButton.click();
    }

    public void login (String username, String password) {
        waitForElementToAppear(loginLink);
        loginLink.click();
        waitForElementToBeClickable(usernameTextbox);
        usernameTextbox.clear();
        usernameTextbox.sendKeys(username);
        continueButton.click();
        passwordTextbox.sendKeys(password);
        loginButton.click();
    }

    public void updateProfileDetails(String firstName, String lastName, String displayName, String description){
    waitForElementToBeClickable(firstNameTextbox);
        firstNameTextbox.clear();
        firstNameTextbox.sendKeys(firstName);
        lastNameTextbox.clear();
        lastNameTextbox.sendKeys(lastName);
        displayNameTextbox.clear();
        displayNameTextbox.sendKeys(displayName);
        descriptionTextbox.clear();
        descriptionTextbox.sendKeys(description);
        saveProfileButton.click();
     }

    
     public void updateProfileLink(String url, String description){
        waitForElementToBeClickable(addButton);
            addButton.click();
            waitForElementToBeClickable(addURLButton);
            addURLButton.click();
            waitForElementToBeClickable(enterURLTextbox);
            enterURLTextbox.sendKeys(url);
            descriptionURLTextbox.sendKeys(description);
            addSiteButton.click();

         }


    }