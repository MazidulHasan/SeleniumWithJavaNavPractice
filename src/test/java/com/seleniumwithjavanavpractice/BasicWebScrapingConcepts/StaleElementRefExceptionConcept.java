package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.seleniumwithjavanavpractice.Wait.TimeUtil;

public class StaleElementRefExceptionConcept {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        WebElement emailId = driver.findElement(By.id("input-email"));
        emailId.sendKeys("test@gmail.com");
        TimeUtil.shortTime();

        driver.navigate().refresh();

        // emailId.sendKeys("test2@gmail.com"); //-- this will give error as the dom got refreshed
        // To resolve this prolem we can do 2 thigs
        // 1. Again initialize the element 
        //     emailId = driver.findElement(By.id("input-email"));
        // 2. use fluent wait, and tell it to ignore the stale exception. 
        //     After this it will wait and then again reinitialize the locator
        //     automatically and take action

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class)
                .withMessage("element not found.");
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("NewGmail.com");
    }
}
