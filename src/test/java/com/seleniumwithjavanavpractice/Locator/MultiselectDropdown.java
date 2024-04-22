package com.seleniumwithjavanavpractice.Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiselectDropdown {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        Thread.sleep(3000); 

        By dropdown = By.id("justAnInputBox");
        By choices = By.xpath("//span[@class='comboTreeItemTitle']");

        //single selection
        // selectChoice(dropdown, choices, "choice 1");

        //multi selection 
        // selectChoice(dropdown, choices, "choice 1","choice 3");

        //all select
        selectChoice(dropdown, choices, "all");
    }

    public static void selectChoice(By drowpDownLocator, By choices, String... value) throws InterruptedException{
        driver.findElement(drowpDownLocator).click();
        Thread.sleep(2000);
        List<WebElement> choicelist = driver.findElements(choices);

        if (!value[0].equals("all")) {
            
            System.out.println(choicelist.size());

            for (WebElement webElement : choicelist) {
                String text = webElement.getText();
                for (String val : value) {
                    if (text.equals(val)) {
                        webElement.click();
                        break;
                    }    
                }
                
            }  
        }
        else{
            //all selection logic
            for (WebElement webElement : choicelist) {
                try {
                    webElement.click();    
                } catch (Exception e) {
                    break;
                }
                
            }
        }

              
    }
}
