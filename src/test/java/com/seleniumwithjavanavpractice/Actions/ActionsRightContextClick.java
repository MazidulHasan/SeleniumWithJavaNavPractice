package com.seleniumwithjavanavpractice.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightContextClick {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClickEle = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act = new Actions(driver);
        act.contextClick(rightClickEle).perform();

        // getting the options of right click
        List<WebElement> rightEles = driver.findElements(By.cssSelector("ul.context-menu-list > li:not(.context-menu-separator)"));
        for(WebElement e : rightEles){
            String text = e.getText();
            System.out.println(text);
            if (text.equals("Copy")) {
                e.click();
                break;
            }
        }

        
        // click on a sigle value
        // driver.findElement(By.xpath("//span[text()='Cut']")).click();
    }
}
