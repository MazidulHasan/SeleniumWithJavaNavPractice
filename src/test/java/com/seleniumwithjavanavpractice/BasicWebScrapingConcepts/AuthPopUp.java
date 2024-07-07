package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // basic auth
        // driver.get("https://the-internet.herokuapp.com/basic_auth"); //this will block because we need to provide 
        // the user name and password
        // In this case we can use inline username and password

        // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        // it has limitations, what if username and the password has @ symbol. In that case this solution will not work.
        // solution for this

        String userName = "admin";
        String password = "admin";
        // driver.get("https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

        // In sel 4 there is an update of this
        // HasAuthentication
        ((HasAuthentication)driver).register(() -> new UsernameAndPassword(userName, password));
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        Thread.sleep(5000);
        driver.quit();
    }
}
