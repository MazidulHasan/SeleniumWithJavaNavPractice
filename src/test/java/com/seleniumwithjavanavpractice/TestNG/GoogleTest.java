package com.seleniumwithjavanavpractice.TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
    @Test(priority = 1)
    public void titleTest(){
        driver.get("https://www.google.com/");
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
