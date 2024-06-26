package com.seleniumwithjavanavpractice.Locator;

public class CustomXpath {
    public static void main(String[] args) {

        //1. using single attribure 
        //tagnaem[@attriName='value']
        // example
        //input[@name]
        //input[@name='Fname']

        // 2. Using multiple attribure
        //tagnaem[@attriName='value' and @att2='value2']
        //tagnaem[@attriName='value' or @att2='value2']

        //tagnaem[@attri1 or @att2='value2']
        // this is also valid, it is saying that i need an attribute called attri1 
        // and also another attribute called att2 but i know the value of att2

        //3. text()
        // tagnaem[text()='value']
        //a[text()='Contact Us ']

        // 4. text() and attribute
        //tagname[@attr='value' and text()='value']

        // 5 contains() with attr:
        // tagname[contains(@arrName,'value')]
        //input[contains(@placeholder,'E-Mail Address')]

        // tagname[contains(@arrName1,'value') and @attr2='value']
        //input[contains(@placeholder,'E-Mail Address') and @name='email'] 

        // 6. contains() with text():
        // tagname[contains(text(),'value')]

        // 7. contains() with text() and attr:
        //tagname[contains(text(),'value') and contains(@attr,'value')]
        //a[contains(text(),'Notebooks') and contains(@href,'category&path')]

        //8. starts with():
        //tagname[starts-with(@att,'value')]
        //input[starts-with(@placeholder,'E-Mail')]

        // 9.Starts-with() with text()
        //tagname[starts-with(text(),'value')]

        //11. index based xpath
        // (//a[text()='Forgotten Pass'])[1]
        // here we have made a group with () for the first part and after that we have selected the first data with [1]
        // the grouping is called captured group
        // also another alternative is available for the same thing
        // (//a[text()='Forgotten Pass'])[position()=4]
        // or
        // (//a[text()='Forgotten Pass'])[last()-1]
        // ((//div[@class='aksldjfhlsd'])[last()]//a)[last()]

        // 12. Without any tag
        // //input[@class='form-control']

        // odd and even in xpath
        // (//select[@id='from_getForm']/option) [position() mod 2 = 1] --> gives all the odd position value of a table
        // (//select[@id='from_getForm']/option) [position() mod 2 = 0] --> gives all the even position value of a table

        //if we want to match with a text having space in the text then need to use this
        // label[normalize-space()='Yes']
        // here the actual text were ' Yes' that why it was not capturing with text()
        
    }
}
