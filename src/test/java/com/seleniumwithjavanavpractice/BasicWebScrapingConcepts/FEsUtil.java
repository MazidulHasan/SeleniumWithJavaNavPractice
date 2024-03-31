package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        By links = By.tagName("a");
        By images = By.tagName("ing");

        System.out.println("total links:"+getElementsCount(links));
        System.out.println("total links:"+getElementsCount(images));

        ArrayList<String> eletexts = getElementsTextList(links);
        System.out.println(eletexts);

        ArrayList<String> eleAtts = getElementAttributeList(images, "alt");
        System.out.println(eleAtts);
    }

    public static List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public static int getElementsCount(By locator){
        return getElements(locator).size();
    }

    public static ArrayList<String> getElementsTextList(By locator){
        List<WebElement> elelist = getElements(locator);
        ArrayList<String> eleTextlist = new ArrayList<String>();

        for (WebElement e : elelist) {
            String text = e.getText();
            if (text.length()!=0) {
                eleTextlist.add(text);
            }
        }
        return eleTextlist;
    }

    public static ArrayList<String> getElementAttributeList(By locator, String attributeValue){
        List<WebElement> elelist = getElements(locator);
        ArrayList<String> eleAttlist = new ArrayList<String>();

        for (WebElement e : elelist) {
            String text = e.getAttribute(attributeValue);
            if (text.length()!=0) {
                eleAttlist.add(text);
            }
        }
        return eleAttlist;
    }
}
