package com.techproed.tests;

import com.techproed.utilities.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends Testbase {
    @Test
    public void dosyaVarMi(){
        System.out.println( System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        String userFilePath=System.getProperty("user.dir");
        String pomXmlPath=userFilePath+ "/pom.xml";

        boolean varMi= Files.exists(Paths.get(pomXmlPath));

        Assert.assertTrue(varMi);


    }
    @Test
    public void test01(){
        driver.get("http://the-internet.herokuapp.com/upload");
        // C:\Users\yzc\Desktop/logo.png
        WebElement chFile= driver.findElement(By.id("file-upload"));
        chFile.sendKeys("C:/Users/yzc/Desktop/logo.png");
        WebElement upL= driver.findElement(By.id("file-submit"));
        upL.click();
        WebElement fpL= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fpL.isDisplayed());
    }
    @Test
    public void fileDownload() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
        //C:\Users\yzc\Desktop
        WebElement amsLink = driver.findElement(By.partialLinkText("Amsterdam.jpg"));
          amsLink.click();
        Thread.sleep(3000);

        boolean varMi = Files.exists(Paths.get("C:\\Users\\yzc\\Desktop\\Amsterdam.jpg"));
        Assert.assertTrue(varMi);


    }





















}
