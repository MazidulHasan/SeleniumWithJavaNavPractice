package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.seleniumwithjavanavpractice.BrowserException;

public class PageloadTimeOut {
    private static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        

        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        // driver.manage().timeouts().getPageLoadTimeout().getSeconds();

        driver.get("https://classic.crmpro.com/");

        boolean flag = isPageLoaded(10);
        if (!flag) {
            throw new BrowserException("Page is not loaded");
        }

        driver.quit();
    }

    public static boolean  isPageLoaded(int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == completed"))
                        .toString();
        return Boolean.parseBoolean(flag);
    }
}
