package com.seleniumwithjavanavpractice.BrowserWindowHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandeling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);
        
        String parentWindowID = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

        // fetch window ids
        Set<String> handels = driver.getWindowHandles();
        Iterator<String> iterator = handels.iterator();

        while (iterator.hasNext()) {
            String windowID = iterator.next();
            driver.switchTo().window(windowID);
            System.out.println("Child window URL" + driver.getCurrentUrl());
            if (!windowID.equals(parentWindowID)) {
                driver.close();
            }
            Thread.sleep(3000);
        }

        driver.switchTo().window(parentWindowID);
        System.out.println("At last it is on:"+driver.getCurrentUrl()+ " And title is"+ driver.getTitle());

        driver.quit();
    }
}
