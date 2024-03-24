package com.seleniumwithjavanavpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
    static WebDriver driver;

    public WebDriver launchBrowser(String browserName){
        System.out.println("Browser Name: "+ browserName);
        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver(); 
                break;
            
            case "firefox":
                driver = new FirefoxDriver(); 
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            
            default:
                System.out.println("PLZ pass the right browser ..."+ browserName);
                break;
        }
        return driver;
    }
}
