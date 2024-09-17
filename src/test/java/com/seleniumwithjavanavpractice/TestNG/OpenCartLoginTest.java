package com.seleniumwithjavanavpractice.TestNG;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest{
    
    @Test(priority = 1)
    public void titleTest(){
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Account Login", "Title did not match");
    }

    @Test(priority = 2)
    public void imageTest(){
        boolean imageFlag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
        Assert.assertTrue(imageFlag);
    }

    @Test(priority = 3)
    public void urlTest(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains("account/login"));
    }
}
