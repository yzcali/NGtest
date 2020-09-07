package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassTest extends Testbase {
    @Test
    public void rightClick(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));
        Actions actions= new Actions(driver);

        // bir webelemente sag tiklamak icin bu kodu kullaniriz
        // Actions class ile islem yapinca her seferinde perform kullanmalisiniz

        actions.contextClick(element).perform();
    }

    @Test
    public void doubleClick(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

       WebElement button= driver.findElement(By.xpath("//*[@id='authentication']/button"));

        Actions actions= new Actions(driver);

        actions.doubleClick(button).perform();

    }
    @Test
    public void hoverOver(){
        driver.get("https://amazon.com");
       // mouse u istedigimiz bi element uzerine goturmek istiyorsak bu actions i kullanacagiz
        WebElement btn = driver.findElement(By.id("nav-link-accountList"));
        Actions actions= new Actions(driver);
        actions.moveToElement(btn).perform();
    }
    @Test
    public void keysUpDown(){
        driver.get("https://amazon.com");
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.END).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.ARROW_UP).perform();
    }
      @Test
    public void GSWriting(){
         driver.get("http://google.com");
         WebElement searchB=driver.findElement(By.name("q"));
         //searchB.sendKeys("merhaba"); bu standart yazma methodumuz

          //searchB.sendKeys(Keys.SHIFT+"merhaba"); bu sekilde her harfi buyuk yazar

          Actions actions = new Actions(driver);
          actions.moveToElement(searchB).click()
                  .keyDown(Keys.SHIFT)
                  .sendKeys("merhaba")
                  .keyUp(Keys.SHIFT)
                  .sendKeys(" nasilsiniz")
                  .perform();

      }
    @Test
    public void Writing() {
        driver.get("http://google.com");
        WebElement searchB = driver.findElement(By.name("q"));
        WebElement logo = driver.findElement(By.id("hplogo"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(logo, searchB).perform();
    }

}
