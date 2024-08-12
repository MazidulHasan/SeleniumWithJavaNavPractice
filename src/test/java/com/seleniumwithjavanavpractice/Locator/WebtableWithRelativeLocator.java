package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
public class WebtableWithRelativeLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(4000);

        WebElement playerEle = driver.findElement(By.linkText("Joe.Root"));
        driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playerEle)).click();

        List<WebElement> playData = driver.findElements(with(By.tagName("//table[@id='resultTable']")).toRightOf(playerEle));
        for (WebElement ele : playData) {
            System.out.println(ele.getText());
        }

        driver.quit();
    }
}
