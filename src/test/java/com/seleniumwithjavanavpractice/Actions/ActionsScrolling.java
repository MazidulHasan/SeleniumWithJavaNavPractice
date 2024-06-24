package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);

        driver.get("https://naveenautomationlabs.com/opencart/");

        //New features added in selenium 4.X
        Actions act = new Actions(driver);
        
        //With default features
        // act.sendKeys(Keys.PAGE_DOWN).perform();
        // Thread.sleep(2000);
        // act.sendKeys(Keys.PAGE_UP).perform();
        // Thread.sleep(2000);

        //with keyboard keys
        // act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
        // Thread.sleep(2000);
        // act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();

        //Scroll to element
        WebElement deliveryInfoLin = driver.findElement(By.xpath("//a[text()='Delivery Information']"));
        act.scrollToElement(deliveryInfoLin)
            .click(deliveryInfoLin)
            .build()
            .perform();
        
        
        Thread.sleep(5000);
        driver.quit();
    }
}
