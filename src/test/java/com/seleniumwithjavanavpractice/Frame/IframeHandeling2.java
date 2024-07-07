package com.seleniumwithjavanavpractice.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandeling2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.londonfreelance.org/courses/frames/index.html");

        // using frame indexing
        // Do not use it, beacuse if frame adds then the count will also change
        driver.switchTo().frame(2);
        String header = driver.findElement(By.tagName("h2")).getText();
        System.out.println(header);
    }
}
