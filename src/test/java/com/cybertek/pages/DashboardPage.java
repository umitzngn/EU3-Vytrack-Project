package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

@FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement permissionMessage;

}
