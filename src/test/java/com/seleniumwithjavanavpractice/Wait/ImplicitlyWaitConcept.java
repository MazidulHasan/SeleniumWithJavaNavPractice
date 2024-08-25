package com.seleniumwithjavanavpractice.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // sel 4.x
        
        // implecitly wait :: Global wait: Applied to all the elements by default
        // it will wait for an elemet 10s max for an element
        // if the element is found before 10 sec then it will take action and go to the
        // next thing

        // so in any place i use this driver it will wait for that max time
        // if there are multiple class, and if i use this driver then it will beahave same

        // case study 1
        // what if home page is very slow and we want to wait longer like 15s
        // then we need to define the same thing again by over writer
        // so after this it will again work for recent updated time 15s
        // in another page if the page takes less time and want to configure it
        // we need to overright it again
        // so it becomes a problem

        // case study 2
        // login page : 10s time out


        // case 3
        // its only for webelement
        // not applicable for non web element: alerts, title, urls, browser window

        // need to avoid implicit wait in your framework


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Test");

    }
}
