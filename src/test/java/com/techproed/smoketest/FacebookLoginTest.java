package com.techproed.smoketest;

import com.techproed.pages.FacebookLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Testbase;
import org.testng.annotations.Test;

public class FacebookLoginTest extends Testbase  {
    @Test
    public void girisTest(){
        driver.get("http://facebook.com");
        FacebookLoginPage loginPage= new FacebookLoginPage(driver);
       loginPage.emailB.sendKeys(ConfigurationReader.getProperty("fb_email"));
       loginPage.passB.sendKeys(ConfigurationReader.getProperty("fb_pass"));

    }












}
