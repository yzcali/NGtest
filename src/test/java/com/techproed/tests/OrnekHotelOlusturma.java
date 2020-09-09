package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrnekHotelOlusturma extends Testbase {
    @BeforeMethod
    public void entryTest(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        WebElement uN= driver.findElement(By.id("UserName"));
        uN.sendKeys("manager2");
        WebElement pW= driver.findElement(By.id("Password"));
        pW.sendKeys("Man1ager2!"+ Keys.ENTER);

    }
    @Test
    public void HotelCreateTest() throws InterruptedException {
        WebElement code= driver.findElement(By.id("Code"));
        code.sendKeys("158962");
        WebElement name= driver.findElement(By.id("Name"));
        name.sendKeys("jack");


        WebElement add= driver.findElement(By.id("Address"));
        add.sendKeys("15Rue");
        Thread.sleep(3000);

        WebElement phone= driver.findElement(By.id("Phone"));
        phone.sendKeys("0666060605");


        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("jack@mail.com");


        WebElement hotelB= driver.findElement(By.id("IDGroup"));
        Select select=new Select(hotelB);
        select.selectByIndex(2);

        driver.findElement(By.id("btnSubmit")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bootbox-body']")));
        System.out.println(message.getText());



    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

}
