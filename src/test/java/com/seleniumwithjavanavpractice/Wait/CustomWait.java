package com.seleniumwithjavanavpractice.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumwithjavanavpractice.BasicWebScrapingConcepts.EleException;

public class CustomWait {
    public static WebDriver driver;
    public static void main(String[] args){
        // Thread.sleep -> static wait , we can convert it to dynamic wait

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By emailId = By.id("input-email11");
        retryingElement(emailId, 10,5).sendKeys("test@gmail.com");

    }

    public static WebElement retryingElement(By locator, int timeOut, int intervalTimeInMiliSeconds){
        WebElement element = null;
        int attempts = 0;

        while (attempts < timeOut) {
            try {
                element = driver.findElement(locator);
                System.out.println("element is found"+locator+" in attempt "+ attempts);
                break;
            } catch (Exception e) {
                System.out.println("element is not found in attemots"+ attempts);
                TimeUtil.applyWait(2);
            }
            attempts++;
        }

        if (element == null) {
            System.err.println("element is not found here, tried for "+ timeOut + " With the interval of "+ 500+ " miliseconds");
            throw new EleException("No such element");
        }
        return element;
    }
}
