package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        // what it is:: After hitting save with out filling out the required fields
        // there is an asteric beside thoes filelds. In order to get that star
        // if we do get text then it may not available. So here we need to use this
        // approach.

        // after inspecting there is an option called ::before or ::after
        // after clicking on thoes fiel if we go to style then we will be
        // able to view the star

        // for this we need to use window.getComputerStyle)()
        
        String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content')";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String mand_text = js.executeScript(script).toString();
        System.out.println("mand_text is::"+ mand_text);

        if (mand_text.contains("*")) {
            System.out.println("First Name is a mandatory field");
        }

        driver.quit();
    }
}
