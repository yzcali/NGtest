package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest extends Testbase {


    public void entry() {
        driver.get("http://www.fhctrip-qa.com/admin/HotelRoomAdmin");
        WebElement uN = driver.findElement(By.id("UserName"));
        uN.sendKeys("manager2");
        WebElement pW = driver.findElement(By.id("Password"));
        pW.sendKeys("Man1ager2!" + Keys.ENTER);

    }

    @Test
    public void table() throws InterruptedException {
        entry();
        Thread.sleep(3000);

        WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());

        // tum basliklari yazdirdik
        List<WebElement> titles = driver.findElements(By.xpath("//thead/tr/th"));
        for (WebElement tlt : titles) {
            System.out.println(tlt.getText());


        }
    }

    @Test
    public void allRows() throws InterruptedException {
        entry();
        Thread.sleep(3000);
        //tablodaki tum satiri nasil yazdirabiliriz

        List<WebElement> titles01 = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement tlt01 : titles01) {
            System.out.println(tlt01.getText());
        }
    }

    @Test
    public void alltd() throws InterruptedException {
        entry();
        Thread.sleep(3000);
        List<WebElement> titles01 = driver.findElements(By.xpath("//tbody/tr/td"));
        for (WebElement tlt01 : titles01) {
            System.out.println(tlt01.getText());

        }

    }

    @Test
    public void simpletd() throws InterruptedException {
        entry();
        Thread.sleep(3000);
        // burada 4. sutundaki hucreleri yazdiriyoruz.
        List<WebElement> titles01 = driver.findElements(By.xpath("//tbody/tr/td[4]"));
        for (WebElement tlt01 : titles01) {
            System.out.println(tlt01.getText());
        }
    }

    @Test
    public void std() throws InterruptedException {
        entry();
        Thread.sleep(3000);
        // burada 4. sutundaki hucreleri yazdiriyoruz.
        List<WebElement> titles01 = driver.findElements(By.xpath("//tbody/tr[4]/td[6]"));
        for (WebElement tlt01 : titles01) {
            System.out.println(tlt01.getText());
        }
    }
    @Test
    public void bul(){
        entry();
        hucreYazdir(5,5);
    }

    public void hucreYazdir(int satir,  int sutun){
        //tbody/tr[3]/td[2]
        String xpathDegerim = "//tbody/tr["+  satir  +"]/td["+  sutun  +"]";
        WebElement hucre = driver.findElement(By.xpath(xpathDegerim));
        System.out.println(hucre.getText());
    }

}



















