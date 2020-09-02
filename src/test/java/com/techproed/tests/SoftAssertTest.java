package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

    }
     @Test
    public void test1(){

         SoftAssert softAssert= new SoftAssert();
         driver.get("http://amazon.com");
         String baslik= driver.getTitle();
         softAssert.assertFalse(baslik.contains("Amazon"));
         softAssert.assertTrue(baslik.contains("Car"));
         softAssert.assertEquals("Online", baslik);
         softAssert.assertAll(); // yukarıdaki yaptığımız tüm doğrulamalar
         // başarılı ise testimiz başarılı, değilse
         // testimiz başarısız.
         // HardAssert gibi

     }
     @Test
    public void test02(){
        driver.get("http://a.testaddressbook.com/sign_in");

         SoftAssert softAssert= new SoftAssert();

         WebElement emailB= driver.findElement(By.id("session_email"));
         emailB.sendKeys("testtechproed@gmail.com");

         softAssert.assertTrue(emailB.getText().equals("testtechproed@gmail.com"));

         WebElement passB= driver.findElement(By.id("session_password"));
         passB.sendKeys("Test1234!");

         softAssert.assertTrue(passB.getText().equals("testtechproed@gmail.com"));

         WebElement sgn= driver.findElement(By.name("commit"));
         sgn.click();

          WebElement signOutLinki= driver.findElement(By.partialLinkText("Sign out"));
          boolean gorunuyorMu= signOutLinki.isDisplayed();



          softAssert.assertAll();

     }
}
