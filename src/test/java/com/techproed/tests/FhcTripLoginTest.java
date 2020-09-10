package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.Testbase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends Testbase {
    @Test
    public void searchTest() {
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage(driver);
        fhcTripLoginPage.userBox.sendKeys("manager2");
        fhcTripLoginPage.passBox.sendKeys("Man1ager2!");
        fhcTripLoginPage.loginBox.click();

    }
}