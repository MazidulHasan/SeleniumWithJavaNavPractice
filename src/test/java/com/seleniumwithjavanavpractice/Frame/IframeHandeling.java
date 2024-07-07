package com.seleniumwithjavanavpractice.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandeling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/appointment-form-template/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//img[@title='Appointment-Forms-and-Examples']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("NameCheck");

        driver.switchTo().defaultContent();
        String data = driver.findElement(By.xpath("//h3[@class='details__form-preview-title']")).getText();
        System.out.println(data);

        Thread.sleep(5000);
        driver.quit();
    }
}
