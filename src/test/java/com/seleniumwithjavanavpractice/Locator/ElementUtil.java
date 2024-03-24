package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
    private WebDriver driver;         //private so that no one can access this and using it will get null pointer exception, so to prevent it we declare it as private

    public ElementUtil(WebDriver driver){
        this.driver = driver;
    }

    public WebElement gElement(By locator){
        return driver.findElement(locator);
    }

    public void doSenKeys(By locator, String value){
        gElement(locator).sendKeys(value);
    }
}
