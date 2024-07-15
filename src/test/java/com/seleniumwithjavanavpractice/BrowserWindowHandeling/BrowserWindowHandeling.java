package com.seleniumwithjavanavpractice.BrowserWindowHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandeling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        
        //1st: fetch the window ids
        Set<String> handels = driver.getWindowHandles();
        Iterator<String> iterator = handels.iterator();

        String parentWindowID = iterator.next();
        System.out.println("Parent window id : " + parentWindowID);

        String childWindowID = iterator.next();
        System.out.println("Child window id : "+ childWindowID);


        //2nd switching work:
        driver.switchTo().window(childWindowID);
        System.out.println("Child window URL:"+ driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(parentWindowID);
        System.out.println("Parent window URL:"+ driver.getCurrentUrl());

        driver.quit();
    }
}
