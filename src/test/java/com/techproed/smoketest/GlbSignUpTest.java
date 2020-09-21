package com.techproed.smoketest;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.Testbase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GlbSignUpTest {
   /* @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite çalıştı");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest çalıştı"); }*/

    @Test
    public void test()  {

        /*
         * 1. Adım : https://www.glbtrader.com/register-verified.html adresine gidelim
         * 2. Adım : GlbSignUpPage class'ından nesne üretip, webelementleri kullanalım.
         * 3. Adım : İçerisine ekleyeceğimiz bilgileri (name, email, phone vs) yine
         *           ConfigurationReader kullanarak, properties file'dan alalım.
         * 4. Adım : Sign-Up butonuna tıklayalım.
         * 5. Adım : Success yazısını görüp görmediğimi Assert ile doğrulayalım.
         */

        Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));

        GlbSignUpPage element = new GlbSignUpPage();

        element.emailBox.sendKeys(ConfigurationReader.getProperty("glb_email"));
        element.nameBox.sendKeys(ConfigurationReader.getProperty("glb_name"));
        element.mobileBox.sendKeys(ConfigurationReader.getProperty("glb_phone"));
        element.passwordBox.sendKeys(ConfigurationReader.getProperty("glb_pass"));
        element.rePasswordBox.sendKeys(ConfigurationReader.getProperty("glb_pass"));
        element.signUp.click();





        // signUp butonuna tıkladıktan sonra, Success!! yazısını hemen alabilir miyim ?
        System.out.println(element.basariliYazisi.getText());
        boolean dogruMu = element.basariliYazisi.getText().contains("Success");
        Assert.assertTrue(dogruMu);


    }
    @AfterClass
    public void tearDown(){
        // Driver class'ının içerisindeki closeDriver methodunu çağırmamız yeterli.
        // Driver'ı kapattık ve hafızadan sildik.
        Driver.closeDriver();}
}

