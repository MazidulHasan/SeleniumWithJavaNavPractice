package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropdown {
    public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         driver.get("https://html.com/attributes/select-multiple/");

         WebElement dropwoElement = driver.findElement(By.xpath("//select[@multiple]"));
         Select select = new Select(dropwoElement);

         System.out.println("Is it multipel?:"+select.isMultiple()); //it will ony work if there is a selector and it has multiple in it

         if (select.isMultiple()) {
            select.selectByVisibleText("American flamingo");
            select.selectByVisibleText("Chilean flamingo");
         }

         driver.quit();
    }
}
