package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLink {
    public static void main(String[] args) {
        
        // avoid blank links
        // borken links

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.freshworks.com/");

        //find total links
        // print the text of each link
        List<WebElement> elements =  driver.findElements(By.tagName("a"));
        System.out.println("Total links are: "+ elements.size());
        for (int i = 0; i < elements.size(); i++) {
            String text = elements.get(i).getText();
            if (text.length()!=0) {
                System.out.println(text);   
            }
        }

        //total text fields on the page
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        List<WebElement> allTextFields = driver.findElements(By.className("form-control"));
        for (WebElement webElement : allTextFields) {
            webElement.sendKeys("testing");
        }

        // driver.quit();
    }
}
