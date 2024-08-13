package com.seleniumwithjavanavpractice.Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMapHandel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://petdiseasealerts.org/forecast-map/#/");
        Thread.sleep(4000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
        String map_xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g']";
        List<WebElement> statList = driver.findElements(By.xpath(map_xpath));

        Actions act = new Actions(driver);
        for (WebElement webElement : statList) {
            act.moveToElement(webElement).perform();
            String stateid = webElement.getAttribute("id");
            System.out.println(stateid);
            Thread.sleep(500);
        }
        
    }
}
