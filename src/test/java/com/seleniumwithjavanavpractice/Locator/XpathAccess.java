package com.seleniumwithjavanavpractice.Locator;

public class XpathAccess {
    public static void main(String[] args) {
        //parent to direct child -> /
        //form/div/input

        //parent to direct + indirect child -> //
        //div[@id='content']/img

        //direct previous parent -> /..
        //div[@id='content']/img/..

        // or -> parent::
        //div[@id='content']/img/parent::div

        // or got to grand parent -> ancestor
        //div[@id='content']/img/ancestor::form

        //got to the next sibling
        //a[text()='Dummy Data']/preceding-sibling::a[text()='Downloads']
        // and
        //a[text()='Dummy Data']/following-sibling::a[text()='Returns']

        //a[text()='Dummy Text']//ancestor::tr/td/input[@type='checkbox']

        //span[text()='Robine Rijke']/ancestor::td/following-sibling::td[2]
    }
}
