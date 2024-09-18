package com.seleniumwithjavanavpractice.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.seleniumwithjavanavpractice.BasicWebScrapingConcepts.EleException;

public class GoogleTest extends BaseTest{

    @Parameters({"url", "browser"})
    @Test(priority = 1)
    public void titleTest(String url, String browser){
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Please write the proper browser name instead of : "+ browser);
                throw new EleException("Browser Not found");
        }
        driver.get(url);
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google", "Title did not match");
    }

    @Test(priority = 2)
    public void imageTest(){
        boolean imageFlag = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
        // Assert.assertEquals(imageFlag, true);
        // or
        Assert.assertTrue(imageFlag);
    }

    @Test(priority = 3)
    public void urlTest(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains("google"));
    }
}
