package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.Testbase;
import org.testng.annotations.Test;

public class AmazonTest extends Testbase {
    @Test
    public void searchTest(){
        driver.get("http://amazon.com");
        AmazonPage amazonPage= new AmazonPage(driver);

        amazonPage.searchBox.sendKeys("SamsungPhone");
    }
}
