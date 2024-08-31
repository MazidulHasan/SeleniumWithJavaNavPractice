package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/");
        System.out.println(waitForTitleContains("Free CRM software for",5));
    }

    public static String waitForTitleContains(String titleFractionValue, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if(wait.until(ExpectedConditions.titleContains(titleFractionValue))){
                return driver.getTitle();
            }    
        } catch (Exception e) {
            System.out.println("Title is not found timeout: "+ timeOut);
        }
        return null;
    }

    public static String waitForTitleIs(String title, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if(wait.until(ExpectedConditions.titleIs(title))){
                return driver.getTitle();
            }    
        } catch (Exception e) {
            System.out.println("Title is not found within the timeout: "+ timeOut);
        }
        return null;
    }

    public static String waitForURLContains(String urlFractionValue, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if(wait.until(ExpectedConditions.urlContains(urlFractionValue))){
                return driver.getCurrentUrl();
            }    
        } catch (Exception e) {
            System.out.println("URL is not found within the timeout: "+ timeOut);
        }
        return null;
    }

    public static String waitForURLIs(String url, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if(wait.until(ExpectedConditions.titleIs(url))){
                return driver.getCurrentUrl();
            }    
        } catch (Exception e) {
            System.out.println("URL is not found within the timeout: "+ timeOut);
        }
        return null;
    }
}
