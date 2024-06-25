package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithDrawing {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://signaturegenerator.com/draw");
        
        Actions act = new Actions(driver);
        WebElement canvas = driver.findElement(By.cssSelector(".canvas__inner"));

        Action signature = act.click(canvas)
                                .moveToElement(canvas, 30, 10)
                                .clickAndHold(canvas)
                                .moveToElement(canvas, -200, -50)
                                .release(canvas)
                                .build();
        signature.perform();

        Thread.sleep(5000);
        driver.quit();
    }
}
