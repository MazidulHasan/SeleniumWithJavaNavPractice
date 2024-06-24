package com.seleniumwithjavanavpractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        Actions act = new Actions(driver);
        WebElement search = driver.findElement(By.name("search"));
        String value = "Mackbook";
        // i want to write one character and then give pause before entering next character
        char val[] = value.toCharArray();
        for (char c : val) {
            act.sendKeys(search,String.valueOf(c)).pause(500).build().perform(); //here it will pause for 2 sec after entereing a character
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
