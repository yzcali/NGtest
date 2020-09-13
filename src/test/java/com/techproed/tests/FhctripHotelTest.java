package com.techproed.tests;

import com.techproed.pages.FhcTripHotelPage;
import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhctripHotelTest extends Testbase {
    public void giris() {
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);}
    @Test
    public void createTest(){
            FhcTripHotelPage fhcTripHotelPage= new FhcTripHotelPage(driver);
            giris();

            fhcTripHotelPage.codeB.sendKeys("15426");
            fhcTripHotelPage.nameB.sendKeys("jack");
            fhcTripHotelPage.addressB.sendKeys("15Rue");
            fhcTripHotelPage.emailB.sendKeys("jack@mail");
            fhcTripHotelPage.phoneB.sendKeys("02523552");

        Select select = new Select(fhcTripHotelPage.selectKutusu);
        select.selectByIndex(2);
        fhcTripHotelPage.saveButonu.click();



    }
}