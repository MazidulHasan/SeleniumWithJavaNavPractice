package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
     static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
        String email = driver.findElement(By.id("input-email")).getText();
        System.out.println("The entered data is :"+email); //here no data will be printed
        //because for the input text getText() do not work

        //we need to get the value after setting the data
        String emialId = driver.findElement(By.id("input-email")).getAttribute("value");
        System.out.println("The entered data is: "+emialId);
    }
}
