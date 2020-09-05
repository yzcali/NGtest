package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends Testbase {

    @Test
    public void coklupencereTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
           String ph= driver.getWindowHandle();
        System.out.println(ph);//CD window-A29C0F8031D2E535117966EE4022BA03

        driver.findElement(By.linkText("Click Here")).click();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       Set<String>allP= driver.getWindowHandles();
         // elinizdeki tum pencerelerin windowhandles i bu sekilde yapilir forloopla
        //for (String handle : allP){
           // System.out.println(handle);
       // }
        Object [] array = (Object[]) allP.toArray();// bu bolumu ezberlemek lazim
        String ikinciSayfaHandle = (String)((allP.toArray())[allP.size()-1]);
        System.out.println(ikinciSayfaHandle);
        driver.switchTo().window(ph);




    }
}
