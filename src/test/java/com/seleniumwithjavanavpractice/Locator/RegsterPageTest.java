package com.seleniumwithjavanavpractice.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumwithjavanavpractice.BrowserUtil;

public class RegsterPageTest {
    public static void main(String[] args) {
        BrowserUtil browserUtil = new BrowserUtil();
        WebDriver driver = browserUtil.launchBrowser("chrome");

        browserUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By fname = By.id("input-firstname");
        By lname = By.id("input-lastname");
        By email = By.id("input-email");
        By telephpone = By.id("input-telephone");
        By password = By.id("input-password");
        By confPass = By.id("input-confirm");

        By isSubscribeYes = By.xpath("//*[@id='content']/form/fieldset[3]/div/div/label[1]/input");
        By policyCheckBox = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
        By continueButton = By.cssSelector("#content > form > div > div > input.btn.btn-primary");

        By successMsg = By.tagName("h1");

        ElementUtil elementUtil = new ElementUtil(driver);
        elementUtil.doSendKeys(fname, "test01F");
        elementUtil.doSendKeys(lname, "test01L");
        elementUtil.doSendKeys(email, getRandomEamil());
        elementUtil.doSendKeys(telephpone, "37378237287");
        elementUtil.doSendKeys(password, "test01");
        elementUtil.doSendKeys(confPass, "test01");
        elementUtil.doClick(isSubscribeYes);
        elementUtil.doClick(policyCheckBox);
        elementUtil.doClick(continueButton);

        String ackSuccessMessage = elementUtil.doGetElementText(successMsg);
        if (ackSuccessMessage.equals("Your Account Has Been Created!")) {
            System.out.println("User reg passed");
        }
        else{
            System.out.println("user reg failed");
        }
    }

    public static String getRandomEamil(){
        return "automation"+System.currentTimeMillis()+"@"+"opencat.com";
    }
}
