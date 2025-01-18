package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class aEpages {

    public aEpages(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//p[.='Consent']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement fullName;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement email;

    @FindBy (id = "id_gender1")
    public WebElement gender;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (id = "newsletter")
    public WebElement newsletter;

    @FindBy (id = "optin")
    public WebElement offers;

    @FindBy (id = "first_name")
    public WebElement firstName;

    @FindBy (id = "last_name")
    public WebElement lastName;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "state")
    public WebElement state;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy (id = "zipcode")
    public WebElement zipcode;

    @FindBy (id = "mobile_number")
    public WebElement mobile_number;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@data-qa='account-deleted']")
    public WebElement deleteMessage;

}