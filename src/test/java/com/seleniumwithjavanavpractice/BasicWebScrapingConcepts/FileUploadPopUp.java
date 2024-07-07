package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

        //first check the type of file
        // type  = file -> this is mendatory

        driver.findElement(By.name("upfile")).sendKeys("E:\\Chrome Download/best (1).pt");

    }
}
