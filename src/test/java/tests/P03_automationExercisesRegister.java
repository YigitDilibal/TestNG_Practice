package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.aEpages;
import utilities.ConfigReader;
import utilities.Driver;

public class P03_automationExercisesRegister {


    @Test
    public void aEregister() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("aEUrl"));
        aEpages aEpages=new aEpages();
        Faker faker=new Faker();
        aEpages.acceptCookies.click();
        aEpages.signUpButton.click();
        aEpages.fullName.sendKeys(faker.name().fullName());
        aEpages.email.sendKeys(faker.internet().emailAddress()+ Keys.ENTER);
        aEpages.gender.click();
        aEpages.password.sendKeys(faker.internet().password());
        aEpages.newsletter.click();
        aEpages.offers.click();
        aEpages.firstName.sendKeys(faker.name().firstName());
        aEpages.lastName.sendKeys(faker.name().lastName());
        aEpages.address1.sendKeys(faker.address().fullAddress());
        aEpages.state.sendKeys(faker.address().state());
        aEpages.city.sendKeys(faker.address().cityName());
        aEpages.zipcode.sendKeys(faker.address().zipCode());
        aEpages.mobile_number.sendKeys(faker.phoneNumber().phoneNumber());
        aEpages.createButton.click();
        aEpages.continueButton.click();
        aEpages.deleteButton.click();
        String expDeletedMessage="Account Deleted!";
        String actDeleteMessage=aEpages.deleteMessage.getText();
        Assert.assertEquals(actDeleteMessage.toUpperCase(),expDeletedMessage.toUpperCase());
        aEpages.continueButton.click();
        Thread.sleep(1000);
        Driver.quitDriver();


    }
}