package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/automation");

        By parent = By.xpath("//ul[@id='menu-main-menu']//li[@id='menu-item-218225']//a[@href='#'][normalize-space()='Education']");
        By submenu = By.linkText("Free Courses");

        handelMenuSubMenu(parent, submenu);

        driver.get("https://www.spicejet.com/");
        Thread.sleep(3000);
        By parentLocator = By.xpath("//div[text()='Add-ons']");
        By subMenuLocator = By.xpath("//div[text()='Visa Services']");
        handelMenuSubMenu(parentLocator, subMenuLocator);


        
        driver.quit();
    }


    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static void handelMenuSubMenu(By perentMenuLocator, By subMenuLocator) throws InterruptedException{
        Actions act = new Actions(driver);
        act.moveToElement(getElement(perentMenuLocator)).perform();
        // or
        // act.moveToElement(education).perform();
        // act.moveToElement(education).build().perform(); -> both are same
        // here build is collecting all the actions togather and then performing the action
        
        Thread.sleep(1500);
        getElement(subMenuLocator).click();
    }
}
