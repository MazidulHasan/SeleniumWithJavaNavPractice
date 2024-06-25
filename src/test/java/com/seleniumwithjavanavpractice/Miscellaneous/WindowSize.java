package com.seleniumwithjavanavpractice.Miscellaneous;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        // driver.manage().window().fullscreen();
        // driver.manage().window().maximize();
        // driver.manage().window().minimize();
        Dimension dimension = new Dimension(414, 896);
        driver.manage().window().setSize(dimension);

        driver.get("https://signaturegenerator.com/draw");
        
        Thread.sleep(5000);
        driver.quit();
    }
}
