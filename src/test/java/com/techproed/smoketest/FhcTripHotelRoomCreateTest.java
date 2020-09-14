package com.techproed.smoketest;

import com.techproed.pages.FhcTripHotelRoomCreatePage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FhcTripHotelRoomCreateTest extends Testbase {
    public void giris() {

        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);}

    @Test
    public void test01() throws InterruptedException {
        // ConfigurationReader class'ına diyoruzki, .properties dosyasının içerisindeki
        // room_create_url (anahtarının) değerini al.
        //room_create_url = http://fhctrip-qa.com/admin/HotelroomAdmin/Create
        driver.get(ConfigurationReader.getProperty("room_create_url"));
        giris();
        FhcTripHotelRoomCreatePage page = new FhcTripHotelRoomCreatePage(driver);
        Select select = new Select(page.idHotelDropDown);
        select.selectByIndex(3);
        page.codeKutusu.sendKeys("1234");
        page.nameKutusu.sendKeys("Hamza Yılmaz");
        page.locationKutusu.sendKeys("Almanya");
        page.descKutusu.sendKeys("Day 20'den selamlar..");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(page.price500, page.priceKutusu).perform();
        Select select1 = new Select(page.idGroupRoomTypeDropDown);
        select1.selectByIndex(2);
        page.maxAdultCountKutusu.sendKeys("2");
        page.maxChildCountKutusu.sendKeys("5");
        page.saveButonu.click();

        Thread.sleep(3000);

        boolean basariliMi = page.basariliYazisi.isDisplayed();
        Assert.assertTrue(basariliMi);


        System.out.println(page);









     }



}
