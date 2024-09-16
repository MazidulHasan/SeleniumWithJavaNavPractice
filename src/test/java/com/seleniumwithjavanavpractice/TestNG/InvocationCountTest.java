package com.seleniumwithjavanavpractice.TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
    
    //invocation count means execution count
    // that mean it will run how many time
    // we can only give the invocation count to the @Test
    
    @Test(invocationCount = 10, priority = 2)
    public void tempTest(){
        System.out.println("tempTest");
    }

    @Test(priority = 1)
    public void payTest(){
        System.out.println("payTest");
    }
}
