package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcTripHotelPage {
    WebDriver driver;
    public FhcTripHotelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="Code")
    public WebElement codeB;

    @FindBy(id="Name")
    public WebElement nameB;

    @FindBy(id="Address")
    public WebElement addressB;

    @FindBy(id="Phone")
    public WebElement phoneB;

    @FindBy(id="Email")
    public WebElement emailB;

    @FindBy (id = "IDGroup")
    public WebElement selectKutusu;

    @FindBy (id = "btnSubmit")
    public WebElement saveButonu;



}
