package com.techproed.tests;

import com.techproed.pages.AmazonNewPage;
import com.techproed.pages.AmazonPage;
import com.techproed.utilities.Driver;
import com.techproed.utilities.JSExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
● Bazen web kontrolleri selenium komutlarına tepki vermez.
● Bu tur durumlarda JavascriptExecutor interface’i kullanılır.
● JavascriptExecutor Selenium WebDriver üzerinden yürütme (execute) işlemi yapabilir.
● JavascriptExecutor seçili olan sekmede (frame) veya
 pencerede (window) JavaScript’i çalıştırmak için executeScript()
 metodunu kullanır.
 */

public class JSExecutorTest {
    @Test
    public void amazonArama() throws InterruptedException {
        Driver.getDriver().get("http://amazon.com");
 // JS ile bir websayfasinin basligini alabiliyormuyuz
     String title = JSExecutor.getTitleByJS();
        System.out.println(title);

        AmazonNewPage amazonNewPage= new AmazonNewPage();
        amazonNewPage.aramaKutusu.sendKeys("samsung");
        JSExecutor.clickElementByJS(amazonNewPage.search_button);

          Thread.sleep(2000);
        JSExecutor.scrollDownByJS();
        Thread.sleep(2000);

        WebElement fiyatlar = Driver.getDriver()
                .findElement(By.xpath("//span[.='Phone Color']"));
        JSExecutor.scrollInToViewJS(fiyatlar);

        WebElement colors = Driver.getDriver()
                .findElement(By.xpath("//span[.='Phone Color']"));


        JSExecutor.scrollInToViewJS(colors);
        // JS ile bir webelementin arkaplan rengini değiştirebiliyoruz..(DEĞİŞKEN)
        JSExecutor.flash(colors);

        WebElement condition =Driver.getDriver().findElement(By.xpath("//*[.='Condition']"));
        JSExecutor.changeColor("red", condition);

        //JS ile isterseniz websayfasinda JSAlert uretebilirsiniz

        JSExecutor.generateAlert("Test BİTTİ ! Eyvah, selenium dersleri de bitti.. Selenium derslerinin son satırının kodu benim: )");

    }
}
