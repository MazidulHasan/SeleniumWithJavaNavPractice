package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
      static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

        // for sendkys it accepts string, string builder,string buffer, character
        StringBuilder sb = new StringBuilder("String builder");
        StringBuffer sbuf = new StringBuffer("String buffer");
        
        driver.findElement(By.id("fname")).sendKeys(sb,sbuf,"test");

        // driver.quit();
        
    }
}
