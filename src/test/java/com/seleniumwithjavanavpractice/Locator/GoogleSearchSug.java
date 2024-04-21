package com.seleniumwithjavanavpractice.Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSug {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/"); 

         By searchField = By.name("q");
         By suggestions = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']//span");
        doSearch(searchField, suggestions, "selenium","python");
    }

    public static void doSearch(By searchlocator,By searchSuggestion, String searchKey, String value) throws InterruptedException{
        driver.findElement(searchlocator).sendKeys(searchKey);

        Thread.sleep(3000);

        List<WebElement> suggList = driver.findElements(searchSuggestion);
        System.out.println("Total size is::"+suggList.size());

        for (WebElement webElement : suggList) {
           String text = webElement.getText();
           System.out.println(text);
           if (text.contains(value)) {
               webElement.click();
               break;
           }
        }
    }
}
