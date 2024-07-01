package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUpHandel {
    public static void main(String[] args) throws InterruptedException {
        ///alert, prompt and confirmation popup are all js alert
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1. Simple alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        String text =  alert.getText();
        System.out.println(text);
        alert.accept();

        // 2. Confirm
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        String textConfirm = alert2.getText();
        System.out.println(textConfirm);
        alert2.accept();

        // 3. Prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        String textrompt = alert3.getText();
        System.out.println(textrompt);
        alert3.sendKeys("Test Data");
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);
        driver.quit();
    }
}
