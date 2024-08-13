package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(4000);

        // we can not use any id or other selector functions for SVG tag
        //*[local-name()='svg' and .....]
        // example :: 
        // //*[local-name()='svg' and @fill='none']
        // //button//*[local-name()='svg']

        driver.findElement(By.name("q")).sendKeys("mackbook");
        driver.findElement(By.xpath("//button//*[local-name()='svg']")).click();
    }
}
