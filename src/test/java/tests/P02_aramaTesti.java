package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.GooglePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P02_aramaTesti {

    /*
    https://www.google.com/ncr adresine gidin ilgili aramayı yapıp cikan sonuc sayisini yazdirin
    1-arama kutusuna "12 Angry Men" yazip aratın
    2-arama kutusuna "Vizontele" yazip aratın
    3-arama kutusuna "Saving Private Ryan" yazip aratın

 */
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        GooglePages googlePages = new GooglePages();
        googlePages.acceptCookies.click();

        googlePages.searchBox.sendKeys("12 Angry man" + Keys.ENTER);
        ReusableMethods.bekle(2);
        googlePages.toolsButton.click();
        System.out.println(googlePages.result.getText());

        googlePages.searchBox.clear();
        googlePages.searchBox.sendKeys("Vizontele" + Keys.ENTER);
        googlePages.toolsButton.click();
        System.out.println(googlePages.result.getText());

        googlePages.searchBox.clear();
        googlePages.searchBox.sendKeys("Saving Private Ryan" + Keys.ENTER);
        googlePages.toolsButton.click();
        System.out.println(googlePages.result.getText());

        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }

}
