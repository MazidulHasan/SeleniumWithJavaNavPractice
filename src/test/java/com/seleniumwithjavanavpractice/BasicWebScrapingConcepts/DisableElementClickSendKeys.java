package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys {
     static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

        driver.findElement(By.id("pass")).click();//no exception as element is disabled and can be clickable
        driver.findElement(By.id("pass")).sendKeys("test");
        //for send keys error -> ElementNotInteractableException 
        //element not interactable
        // driver.findElement(By.id("pass")).sendKeys(null); //illigal argument exception


        driver.quit();
    }
}
