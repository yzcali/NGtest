package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BeklemeTest extends Testbase {
    @Test
    public void implicityWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement removeButonu = driver.findElement(By.xpath("//*[.='Remove']"));
        removeButonu.click();
        WebElement element = driver.findElement(By.xpath("//*[.='Add']"));
    }
}
