package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
            Set<String> handels = driver.getWindowHandles();
            Iterator<String> iterator = handels.iterator();
            String parentWindowID = iterator.next();
            System.out.println("Parent window id : " + parentWindowID);
    
            String childWindowID = iterator.next();
            System.out.println("Child window id : "+ childWindowID);
    
    
            //2nd switching work:
            driver.switchTo().window(childWindowID);
            System.out.println("Child window URL:"+ driver.getCurrentUrl());
        }
        
    }
}
