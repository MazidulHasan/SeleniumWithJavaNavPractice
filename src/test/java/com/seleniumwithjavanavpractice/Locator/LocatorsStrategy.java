package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        // id (id can not be duplicate)
        // By emailBy = By.id("input-email");
        // By passBy = By.id("input-password");

        //name (Name my be duplicate)
        By firstName = By.name("firstname");
        By lastNmae = By.name("lastname");

        // className (It is not an unique attribute so can be duplicate)
        By email = By.className("form-control");

        //xpath (Not an attribute , it is address of the webelement in HTML DOM)
        By telephone = By.xpath("//*[@id='input-telephone']");

        //css (Not an attribure)
        By passWord = By.cssSelector("#input-password");

        //linkText: Only for links on the webpage: works for the text of the link
        By linkText = By.linkText("Login");

        //partital link text : only for link, if the text of that link is very long then can use this
        //always try to avoid this
        By partialLinkText = By.partialLinkText("Recurring pay");

        //tagName:Html tag name
        By header = By.tagName("h2");

        ElementUtil elementUtil = new ElementUtil(driver);
        elementUtil.doSenKeys(firstName, "Fname");
        elementUtil.doSenKeys(lastNmae, "LastName");
        elementUtil.doSenKeys(email, "email");
        elementUtil.doSenKeys(telephone, "telephone");
        elementUtil.doSenKeys(passWord, "passWithCssSelector");
        elementUtil.doClick(linkText);
        elementUtil.doClick(partialLinkText);
        System.out.println(elementUtil.doGetElementText(header));
    }
}
