package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");

        // driver.findElement(By.name("search111")).sendKeys("test");
        //If the element is not found then No such element found exception

        List<WebElement> elements = driver.findElements(By.tagName("test"));
        //this will return an array list and if no data is found then retur empty arraylist
        System.out.println(elements);
        
    }
}
