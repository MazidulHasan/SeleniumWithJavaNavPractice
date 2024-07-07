package com.seleniumwithjavanavpractice.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandeling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://classic.crmpro.com/login.cfm");
        Thread.sleep(4000);

        driver.findElement(By.name("username")).sendKeys("apiautomation");
        driver.findElement(By.name("password")).sendKeys("Selenium@12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Thread.sleep(4000);

        driver.switchTo().frame("mainpanel");
        driver.findElement(By.linkText("CONTACTS")).click();

        // We should always use iframe insted of frame 

        Thread.sleep(5000);
        driver.quit();

    }
}
