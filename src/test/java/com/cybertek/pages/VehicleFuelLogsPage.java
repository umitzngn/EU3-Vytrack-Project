package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class VehicleFuelLogsPage extends BasePage{

    @FindBy(tagName = "thead")
    public WebElement fuelLogInformation;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement vehicleFuelLogsMessage;

}
