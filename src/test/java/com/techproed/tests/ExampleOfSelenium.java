package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOfSelenium extends Testbase {

    @Test
    public void test01() {
        driver.get("http://amazon.com");
        WebElement btn = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(btn).perform();
        WebElement sb = driver.findElement(By.partialLinkText("Start here"));
        sb.click();

        String title = driver.getTitle();
        System.out.println(title);//Amazon Registration
        Assert.assertEquals("Amazon Registration", title);
    }
        @Test (dependsOnMethods="test01")
        public void test2(){
         WebElement  name= driver.findElement(By.id("ap_customer_name"));
         name.sendKeys("ali");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement  mailB= driver.findElement(By.id("ap_email"));
            mailB.sendKeys("ayazici@mail.com");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement  passB= driver.findElement(By.id("ap_password"));
            passB.sendKeys("test1234");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement  passr= driver.findElement(By.id("ap_password_check"));
            passr.sendKeys("test1234");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement  btnc= driver.findElement(By.id("continue"));
            btnc.click();

            //kisayol
           /*
              WebElement isim = driver.findElement(By.id("ap_customer_name"));
    isim.sendKeys("Hamza Yılmaz");
    driver.findElement(By.id("ap_email")).sendKeys("hamzayilmaz2020@protonmail.com");
    driver.findElement(By.id("ap_password")).sendKeys("Amazon06.");
    driver.findElement(By.id("ap_password_check")).sendKeys("Amazon06.");
    driver.findElement(By.id("continue")).click();
            */
        }


    }

