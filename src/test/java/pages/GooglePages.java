package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePages {

    public GooglePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[.='Accept all']")
    public WebElement acceptCookies;

    @FindBy (xpath = "//textarea[@name='q']")
    public WebElement searchBox;

    @FindBy (id = "hdtb-tls")
    public WebElement toolsButton;

    @FindBy (id = "result-stats")
    public WebElement result;





}
