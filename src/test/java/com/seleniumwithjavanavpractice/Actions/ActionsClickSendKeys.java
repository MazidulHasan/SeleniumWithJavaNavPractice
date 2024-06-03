package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");
        By password = By.id("input-password");
        By login = By.xpath("//input[@value='Login']");

        Actions act = new Actions(driver);
        act.sendKeys(driver.findElement(email),"test@gmail.com").perform();
        act.sendKeys(driver.findElement(password),"123").perform();
        act.sendKeys(driver.findElement(login)).perform();

        // When to use Actions class
        // if normal send key is not working then we can use actions class
        // If one element is hidden by another element like modal, then 
        // selenium can through an exception like element is not interactable exception
        // or similar exception
        // then we can actions class
    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static void doActionsClick(By locator){
        Actions act = new Actions(driver);
        act.click(getElement(locator)).perform();
    }

    public static void doActionsSendKeys(By locator, String value){
        Actions act = new Actions(driver);
        act.sendKeys(getElement(locator),value).perform();
    }
}
