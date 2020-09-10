package com.techproed.tests;

import com.techproed.pages.GooglePage;
import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleTest extends Testbase {
    @Test
    public void searchTest(){
        driver.get("http://google.com");
        //GooglePage classindan bir tane nesne olusturduk
        //parametre olarak su an kullandigimiz  driver i gonderdik.
         GooglePage googlePage= new GooglePage(driver);

         googlePage.searchBox.sendKeys("selamlar");


    }
}
