package com.seleniumwithjavanavpractice.BasicWebScrapingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDomElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("chrome://settings/");

        // shadow root should be set as open
        String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchBoxElement = (WebElement)js.executeScript(search_script);
        searchBoxElement.sendKeys("Temp Test");


        // another one
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        Thread.sleep(3000);

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/section/div/div[1]/div/div[2]/div/h1"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
        
        String enterPizzaName = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
        WebElement pizzaName = (WebElement)js.executeScript(enterPizzaName);
        pizzaName.sendKeys("Test Pizza");

        // iframe scenario
        // Browser -> page -> ShadowDom(open)->iframe -> element
        // if shadow dom in before iframe then first need to select that element 
        // then need to switch to that fram
        // then we can select our expected input field

    }
}
