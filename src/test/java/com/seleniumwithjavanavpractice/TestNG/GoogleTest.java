package com.seleniumwithjavanavpractice.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void titleTest(){
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void imageTest(){
        driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
    }

    @Test(priority = 2)
    public void urlTest(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
