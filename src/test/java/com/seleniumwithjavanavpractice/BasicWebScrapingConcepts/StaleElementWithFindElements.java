package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementWithFindElements {
     public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        List<WebElement> footerList = driver.findElements(By.cssSelector("footer a"));
        
        for (int i = 0; i < footerList.size(); i++) {
            footerList.get(i).click();
            driver.navigate().back();
            footerList = driver.findElements(By.cssSelector("footer a"));
        }

        //for foeach loop may not work all the time. works for index based loop

        driver.quit();
    }
}
