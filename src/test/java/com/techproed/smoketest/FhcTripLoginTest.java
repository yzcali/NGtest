package com.techproed.smoketest;

import com.techproed.pages.FacebookLoginPage;
import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Testbase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends Testbase {
    @Test( groups={"fhcTrip", "login"})
    public void girisTest() {
        driver.get(ConfigurationReader.getProperty("fhc_login"));
        FhcTripLoginPage loginPage = new FhcTripLoginPage(driver);
        loginPage.userBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passBox.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);
        //loginPage.loginBox.click(); enter yaptik yukarda
    }
}
