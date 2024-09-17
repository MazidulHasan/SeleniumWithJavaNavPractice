package com.seleniumwithjavanavpractice.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
    @Test(priority = 1)
    public void titleTest(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "OrangeHRM", "Title did not match");
    }

    @Test(priority = 2)
    public void urlTest(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains("/auth/login"));
    }
}
