package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribureConcept {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By firstName = By.id("input-firstname");
        By registerLink = By.linkText("Register");

        String fn_placeholder = doElementGetAttribute(firstName, "placeholder");
        String registerLinkhref = doElementGetAttribute(registerLink, "href");

        System.out.println(fn_placeholder);
        System.out.println(registerLinkhref);
    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static String doElementGetAttribute(By locator, String attribute){
        return getElement(locator).getAttribute(attribute);
    }
}
