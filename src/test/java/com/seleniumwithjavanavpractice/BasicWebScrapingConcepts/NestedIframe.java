package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-scenario/");
        Thread.sleep(3000);

        driver.switchTo().frame("pact1");
        driver.findElement(By.id("inp_val")).sendKeys("testing");

        driver.switchTo().frame("pact2");
        driver.findElement(By.id("jex")).sendKeys("Automation");

        driver.switchTo().frame("pact3");
        driver.findElement(By.id("glaf")).sendKeys("Automation 2");

        // driver.switchTo().defaultContent(); //driver will go to main page
        // String header = driver.findElement(By.tagName("h3")).getText();
        // System.out.println(header);

        // sele 4.X
        driver.switchTo().parentFrame(); // driver will go to pact2
        driver.findElement(By.id("jex")).sendKeys("Automation with fun");
        // driver.quit();
    }
}
