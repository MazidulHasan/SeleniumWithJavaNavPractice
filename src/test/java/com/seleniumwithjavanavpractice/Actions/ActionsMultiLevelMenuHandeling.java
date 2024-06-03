package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultiLevelMenuHandeling {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");

        By menu = By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']");
        By beverages = By.linkText("Beverages");
        By tea = By.linkText("Tea"); 
        By greenTea = By.linkText("Green Tea"); 

        handelMenuSubMenu(menu, beverages, tea, greenTea);

        driver.quit();
    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }


    public static void handelMenuSubMenu(By menuButton, By level1, By level2, By level3) throws InterruptedException{
        getElement(menuButton).click();
        Thread.sleep(1500);

        Actions act = new Actions(driver);
        act.moveToElement(getElement(level1)).perform();
        Thread.sleep(1500);
        act.moveToElement(getElement(level2)).perform();
        Thread.sleep(1500);
        getElement(level3).click();
    }
}
