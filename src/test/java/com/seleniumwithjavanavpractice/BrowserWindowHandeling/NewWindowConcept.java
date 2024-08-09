package com.seleniumwithjavanavpractice.BrowserWindowHandeling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String pWindId = driver.getWindowHandle();

        //selenium 4 feature
        // driver.switchTo().newWindow(WindowType.TAB); // opens in new tab 
        driver.switchTo().newWindow(WindowType.WINDOW); // opens in new tab 
        driver.get("http://google.com/");
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(pWindId);
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
        // Thread.sleep(3000);
    }
}
