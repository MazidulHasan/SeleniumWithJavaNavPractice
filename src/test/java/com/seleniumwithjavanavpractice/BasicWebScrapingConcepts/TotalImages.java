package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println("Total images are: "+imageList.size());

        for (WebElement image : imageList) {
            String altValue = image.getAttribute("alt");
            String srcValue = image.getAttribute("src");
            System.out.println("alt Value "+ altValue);
            System.out.println("src Value "+ srcValue);
            System.out.println();
        }

        driver.quit();
    }
}
