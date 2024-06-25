package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        
        Actions act = new Actions(driver);
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        

        act.sendKeys(firstName,"Fname")
            .sendKeys(Keys.TAB)
            .pause(200)
            .sendKeys("Lname")
            .pause(200)
            .sendKeys(Keys.TAB)
            .pause(200)
            .sendKeys("Email")
            .sendKeys(Keys.TAB)
            .pause(200)
            .sendKeys("Telephone")
            .pause(200)
            .build()
            .perform();
        
        Thread.sleep(5000);
        driver.quit();
    }
}
