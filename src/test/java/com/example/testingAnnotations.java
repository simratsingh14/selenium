package com.example;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testingAnnotations {

    @Test
    public void testCase1() {
        System.out.println(" Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
        
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
        
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
        
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before Class");
        
    }
  
    @BeforeTest
    public void beforetest() {
        System.out.println("Before Test");
        
    }

    @AfterTest
    public void aftertest() {
        System.out.println("After Test");
    }

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Before Suite");
        
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("After Suite");
        
    }

}
