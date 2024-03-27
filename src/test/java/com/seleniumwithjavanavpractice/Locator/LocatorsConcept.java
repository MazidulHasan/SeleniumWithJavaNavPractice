package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        // process 1 (worst way)
        // driver.findElement(By.id("input-email")).sendKeys("test@gmai.com");
        // driver.findElement(By.id("input-password")).sendKeys("test123");




        // process 2
        // WebElement emailID = driver.findElement(By.id("input-email"));
        // WebElement password = driver.findElement(By.id("input-password"));

        // emailID.sendKeys("test@gmai.com");
        // password.sendKeys("test123");




        // process 3 (better than 2)
        //here By is locators, also known as OR-Object Repository
        // By emailBy = By.id("input-email");
        // By passBy = By.id("input-password");

        // WebElement emailWE = driver.findElement(emailBy);
        // WebElement passWE = driver.findElement(passBy);

        // emailWE.sendKeys("test@gmai.com");
        // passWE.sendKeys("test123");


        //process 4 (better than 3) -> done with new function for find element
        // By emailBy = By.id("input-email");
        // By passBy = By.id("input-password");

        // WebElement emailFN = gElement(emailBy); 
        // WebElement passFN = gElement(passBy);

        // emailFN.sendKeys("test@gmai.com");
        // passFN.sendKeys("test123");

        


        // process 5 (better than 4) -> generic method for sendkeys (actions)
        // By emailBy = By.id("input-email");
        // By passBy = By.id("input-password");

        // doSenKeys(emailBy, "test@gmai.com");
        // doSenKeys(passBy, "test123");


        // process 6 (By locator and create a common utility class) -> ElementUtil.java
        // By emailBy = By.id("input-email");
        // By passBy = By.id("input-password");

        // ElementUtil elementUtil = new ElementUtil(driver);
        // elementUtil.doSenKeys(emailBy, "test@gmai.com");
        // elementUtil.doSenKeys(passBy, "test123");

        // process 7 ->String locator
        String emailString = "input-email";
        String passString = "input-password";

        ElementUtil elementUtil = new ElementUtil(driver);
        elementUtil.doSenKeys("id", emailString, "test@gmai.com");
        elementUtil.doSenKeys("id", passString, "test123");



        // driver.quit();
    }

    //created for process 4
    public static WebElement gElement(By locator){
        return driver.findElement(locator);
    }

    //created for process 5
    public static void doSenKeys(By locator, String value){
        gElement(locator).sendKeys(value);
    }
}
