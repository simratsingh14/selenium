package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        driver.manage().window().maximize();
        // driver.findElement(By.name("q")).sendKeys("Selenium");
        // driver.findElement(By.name("btnK")).click();
        JavascriptExecutor js  = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Pillows");
        driver.findElement(By.cssSelector("#gh-btn")).click();
        js.executeScript("window.scrollBy(0,300)");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        
    }
    
}
