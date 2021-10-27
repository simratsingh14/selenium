package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {
    public String baseUrl = "https://demoqa.com/automation-practice-form";
    public WebDriver driver;
    
    @Test
    public void verifyHomepageTitle() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Launching Chrome Browser");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "ToolsQA";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
    }





}
