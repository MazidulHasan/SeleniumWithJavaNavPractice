package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");
        
        // // Casting WebDriver instance to JavascriptExecutor
        // JavascriptExecutor js = (JavascriptExecutor) driver;

        // String title = js.executeScript("return document.title;").toString();
        // System.out.println(title);

        // working with Util class
        JavaScriptUtil jScriptUtil = new JavaScriptUtil(driver);
        String title = jScriptUtil.getTitleByJs();
        System.out.println("Title::"+ title);

        driver.quit();
    }
}
