package com.seleniumwithjavanavpractice.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
    // before annotations
    // all methods should not be static
    // we can have duplicate annotations but we do not need it
    
    // if there is only annotations and no test annotations then it will not
    // give any error and run

    @BeforeSuite
    public void dbConnection(){
        System.out.println("Before Suite -- DB connection");
    }

    @BeforeTest
    public void createUser(){
        System.out.println("Before Test - create user");
    }

    @BeforeClass
    public void launchBrowser(){
        System.out.println("Before Class - launch Browser");
    }

    @BeforeMethod
    public void login(){
        System.out.println("Before Method - login to app");
    }

    // if there are multiple test then it will run alphabatically
    // for this if we run the full file then headerTest will run first then others

    @Test
    public void titleTest(){
        System.out.println("Title test");
    }

    @Test
    public void headerTest(){
        System.out.println("Header test");
    }

    @Test
    public void urlTest(){
        System.out.println("url test");
    }

    @AfterMethod
    public void logOut(){
        System.out.println("After Method - logOut");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("After Class - close Browser");
    }

    @AfterTest
    public void deleteUser(){
        System.out.println("After Test - delete user");
    }

    @AfterSuite
    public void disconectDB(){
        System.out.println("After Suite -- disconectDB");
    }
}
