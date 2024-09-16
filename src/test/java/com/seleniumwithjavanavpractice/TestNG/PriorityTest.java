package com.seleniumwithjavanavpractice.TestNG;

import org.testng.annotations.Test;

public class PriorityTest {

    // default priority is 0
    //  that means if no priority is given then it will run first and 
    // it will be in alphabetical order
    
    // we can give priority count only for @Test

    @Test(priority = 2)
    public void eTest(){
        System.out.println("e test");
    }

    @Test(priority = 5)
    public void dTest(){
        System.out.println("d test");
    }

    @Test(priority = 1)
    public void cTest(){
        System.out.println("c test");
    }

    @Test(priority = 3)
    public void aTest(){
        System.out.println("a test");
    }

    @Test(priority = 4)
    public void bTest(){
        System.out.println("b test");
    }
}
