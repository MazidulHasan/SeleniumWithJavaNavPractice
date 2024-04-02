package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/register/");


        // isDisplayed = elemet is present on the page
        // isEnabled = elelent is obviously present on the page but is it enable or not

        boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
        boolean check_flag = driver.findElement(By.name("agreeTerms")).isSelected();
        System.out.println("isEnabled : "+flag); //false
        System.out.println("is Selected: "+ check_flag); //false

        driver.findElement(By.name("agreeTerms")).click();

        flag = driver.findElement(By.id("submitButton")).isEnabled();
        check_flag = driver.findElement(By.name("agreeTerms")).isSelected();
        System.out.println("isEnabled: "+flag); //true
        System.out.println("is Selected : "+ check_flag);//true

        driver.quit();
    }
}
