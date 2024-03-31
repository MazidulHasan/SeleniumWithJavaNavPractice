package com.seleniumwithjavanavpractice.Locator;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
    private WebDriver driver;         //private so that no one can access this and using it will get null pointer exception, so to prevent it we declare it as private

    public ElementUtil(WebDriver driver){
        this.driver = driver;
    }

    public By getBy(String locatorType, String locatorValue){
        By locator = null;
        switch (locatorType.toLowerCase().trim()) {
            case "id":
                locator = By.id(locatorValue);
                break;
            case "name":
                locator = By.name(locatorValue);
                break;
            case "classname":
                locator = By.className(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            case "cssselector":
                locator = By.cssSelector(locatorValue);
                break;
            case "linktext":
                locator = By.linkText(locatorValue);
                break;
            default:
                break;
        }
        return locator;
    }

    //this is for string locators
    public WebElement getElement(String locatorType, String locatorVlaString){
        return driver.findElement(getBy(locatorType, locatorVlaString));
    }

    //this is for string locators
    public void doSenKeys(String locatorType, String locatorVlaString,String value){
        getElement(locatorType,locatorVlaString).sendKeys(value);
    }

    //this is for by locators
    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    //this is for by locators
    public void doSenKeys(By locator, String value){
        getElement(locator).sendKeys(value);
    }

    //this is for by locators
    public void doClick(By locator){
        getElement(locator).click();
    }

    //this is for by locators
    public String doGetElementText(By locator){
        return getElement(locator).getText();
    }

    public String doElementGetAttribute(By locator, String attribute){
        return getElement(locator).getAttribute(attribute);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public int getElementsCount(By locator){
        return getElements(locator).size();
    }

    public ArrayList<String> getElementsTextList(By locator){
        List<WebElement> elelist = getElements(locator);
        ArrayList<String> eleTextlist = new ArrayList<String>();

        for (WebElement e : elelist) {
            String text = e.getText();
            if (text.length()!=0) {
                eleTextlist.add(text);
            }
        }
        return eleTextlist;
    }

    public ArrayList<String> getElementAttributeList(By locator, String attributeValue){
        List<WebElement> elelist = getElements(locator);
        ArrayList<String> eleAttlist = new ArrayList<String>();

        for (WebElement e : elelist) {
            String text = e.getAttribute(attributeValue);
            if (text.length()!=0) {
                eleAttlist.add(text);
            }
        }
        return eleAttlist;
    }
}
