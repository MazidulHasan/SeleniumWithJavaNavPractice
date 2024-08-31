package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumwithjavanavpractice.BrowserUtil;

public class OpenCartLoginTest {
    public static void main(String[] args) {
        BrowserUtil browserUtil = new BrowserUtil();
        WebDriver driver = browserUtil.launchBrowser("chrome");
        
        browserUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        String title = browserUtil.getPageTitle();
        System.out.println(title);

        By emailBy = By.id("input-email");
        By passBy = By.id("input-password");

        ElementUtil elementUtil = new ElementUtil(driver);
        elementUtil.doSendKeys(emailBy, "test@gmai.com");
        elementUtil.doSendKeys(passBy, "test123");

        // browserUtil.closeBrowser();
    }
}
