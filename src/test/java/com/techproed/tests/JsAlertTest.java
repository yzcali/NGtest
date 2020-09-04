package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JsAlertTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

    }
    @Test
    public void jsatest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement button= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
          button.click();


          String msg= driver.switchTo().alert().getText();
        System.out.println(msg);//I am a JS Alert
        driver.switchTo().alert().accept();
    }

    @Test
    public void jsctest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
      button.click();

        String msg= driver.switchTo().alert().getText();
        System.out.println(msg);//I am a JS Confirm

      driver.switchTo().alert().dismiss();
    }

   @Test
    public void jsptest(){
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       WebElement button= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
       button.click();

       String msg= driver.switchTo().alert().getText();
       System.out.println(msg);//I am a JS prompt
       driver.switchTo().alert().sendKeys("Merhaba testng");
       driver.switchTo().alert().accept();


   }
      @AfterClass
    public void teardown(){
        driver.quit();
      }


}
