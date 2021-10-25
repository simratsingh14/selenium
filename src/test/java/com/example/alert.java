package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;


import io.github.bonigarcia.wdm.WebDriverManager;


public class alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js  = (JavascriptExecutor) driver;
        driver.manage().window().maximize();  
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.cssSelector("#promtButton")).click();
       
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        alert.sendKeys("Hello Frans");
        alert.accept();
        Thread.sleep(3000);
        
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(200);
        driver.get("https://demoqa.com/browser-windows");
        // driver.findElement(By.cssSelector("#item-0"));
        // driver.findElement(By.xpath("//button[@id='windowButton']"));
        driver.findElement(By.cssSelector("#messageWindowButton")).click();
       
        Robot robot;
        try {
            robot = new Robot();
            robot.mouseMove(500, 5);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(200);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(2000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]/div[1]")).click();
        js.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.cssSelector("#item-2")).click();


        

        

        




              
        // js.executeScript("window.scrollBy(0,300)");

        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // driver.close();






    }
    
}
