package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForiFrame {
    static WebDriver driver;
    public static void main(String[] args) {
        driver =  new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/appointment-form-template/");

        driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
        By framelocator = By.xpath("//iframe[contains(@id,'frame-one')]");

        wairForFrameAdnSwitchToIt(framelocator, 10);

        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("NameCheck");
    }

    public static void wairForFrameAdnSwitchToIt(By framelocator, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
    }
}
