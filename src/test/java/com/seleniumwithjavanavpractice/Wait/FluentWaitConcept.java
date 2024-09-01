package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitConcept {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/appointment-form-template/");

        By image = By.cssSelector("div#imageTemplateContainer img");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                                .withTimeout(Duration.ofSeconds(10))
                                .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchFieldException.class)
                                .withMessage("time out, element is not present.");
        WebElement imageEle = wait.until(ExpectedConditions.visibilityOfElementLocated(image));
        imageEle.click();
    }
}
