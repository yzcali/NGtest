package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BeklemeTest extends Testbase {
    @Test
    public void implicityWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement removeButonu = driver.findElement(By.xpath("//*[.='Remove']"));
        removeButonu.click();
        WebElement element = driver.findElement(By.xpath("//*[.='Add']"));
    }

    @Test
    public void explicitWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
     // Explicit wait kullanmak icin WebDriverWait class indan nesne uretmemiz lazim.
       WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement removeButton = driver.findElement(By.xpath("//*[.='Remove']"));
        removeButton.click();

        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        System.out.println(element.getText());

    }
}
