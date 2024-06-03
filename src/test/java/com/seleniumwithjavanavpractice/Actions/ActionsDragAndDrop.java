package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        // drag and drop happens ele to ele on the page
        // Drag and drop external file to the web page -> Not possible
        // for this we need to click and hold, then drag then drop

        WebElement srcEle = driver.findElement(By.id("draggable"));
        WebElement targetEle = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        // act
        //     .clickAndHold(srcEle)
        //     .moveToElement(targetEle)
        //     .release()
        //     .build().perform();

        // or

        Action localAction =  act
                            .clickAndHold(srcEle)
                            .moveToElement(targetEle)
                            .release()
                            .build();
        localAction.perform();

        // or

        // act.dragAndDrop(srcEle, targetEle).perform();
        driver.quit();
    }
}
