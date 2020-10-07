package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesModelPage extends BasePage{

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement subTitleMessage;


}
