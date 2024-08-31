package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        By ele = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement fullEle = wait.until(ExpectedConditions.presenceOfElementLocated(ele));
        // fullEle.sendKeys("test");

        waitForElemetnVisible(ele, 10).sendKeys("Test");;
    }

    
    // public static WebElement waitForElementPresence(By locator, int timeOut){
    //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    //     return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    // }

    public static WebElement waitForElemetnVisible(By locator, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
