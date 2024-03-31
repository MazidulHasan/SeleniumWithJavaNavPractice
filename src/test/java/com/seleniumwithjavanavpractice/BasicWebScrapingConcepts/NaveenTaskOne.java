package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumwithjavanavpractice.Locator.ElementUtil;

public class NaveenTaskOne {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By allRightSideLinks = By.id("column-right");

        ElementUtil elementUtil = new ElementUtil(driver);
        WebElement targetData = elementUtil.getElement(allRightSideLinks);
        List<WebElement> linksOfPage = targetData.findElements(By.tagName("a"));
        
        for (WebElement link : linksOfPage) {
            System.out.println(link.getAttribute("href"));
        }
        
    }
}
