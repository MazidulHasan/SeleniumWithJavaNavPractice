package com.seleniumwithjavanavpractice.Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uiData {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        WebElement fn = driver.findElement(By.id("input-firstname"));
        int ht = fn.getSize().getHeight();
        int wd = fn.getSize().getWidth();
        System.out.println("height is : "+ ht);
        System.out.println("weight is : "+ wd);

        int x = fn.getLocation().getX();
        int y = fn.getLocation().getY();

        System.out.println("X positon : "+x);
        System.out.println("X positon : "+y);

        System.out.println(fn.getCssValue("font-size"));

        WebElement contBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
        String bgClorOfContBtn = contBtn.getCssValue("background-color");
        System.out.println("Color of Cont Button is : "+ bgClorOfContBtn);
        

        Thread.sleep(5000);
        driver.quit();
    }
}
