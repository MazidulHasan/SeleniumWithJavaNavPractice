package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplay {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
        //if the class name is not correct then no such element exception will be thrown
        
        if (flag) {
            System.out.println("logo is Displayed");
        }
        else{
            System.out.println("Logo is not Displayed");
        }

        //another way
        By logo = By.className("img-responsive");
        if (isElementDisplayed(logo)) {
            System.out.println("Logo - displayed");
        }

        //another way
        List<WebElement> logoList = driver.findElements(By.className("img-responsive"));
        if (logoList.size()==1) {
            System.out.println("logo is displayed");
        }else{
            System.out.println("No logo");
        }

        //another way
        if (isElementExist(logo)) {
            System.out.println("logo displayed");
        }
        else{
            System.err.println("Fail");
        }

    }

    public static boolean isElementExist(By locator){
        if (getElements(locator).size()==1) {
            return true;
        }
        return false;
    }

    public static List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static boolean isElementDisplayed(By locator){
        return getElement(locator).isDisplayed();
    }
}
