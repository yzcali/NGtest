package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Ornek_WebTable extends Testbase {

    public void entry() {
        driver.get("http://www.fhctrip-qa.com/admin/HotelRoomAdmin");
        WebElement uN = driver.findElement(By.id("UserName"));
        uN.sendKeys("manager2");
        WebElement pW = driver.findElement(By.id("Password"));
        pW.sendKeys("Man1ager2!" + Keys.ENTER);
    }
    @Test
    public void test() throws InterruptedException {
       entry();
       Thread.sleep(300);
       //tum satirlari bulduk satir sayisini yazdirdik .
        List<WebElement> titles = driver.findElements(By.xpath("//tbody/tr"));

        System.out.println(titles.size());
        //ucuncu satirdaki elemanlari bulduk.
        WebElement ucuncuSatir = driver.findElement(By.xpath("//tbody/tr[3]"));
        System.out.println(ucuncuSatir.getText());

    }



}