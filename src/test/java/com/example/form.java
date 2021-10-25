package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;


public class form {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement name = driver.findElement(By.cssSelector("#firstName"));
        name.sendKeys("piggy \t sherma");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("pp-poo-poo@yomail.com");
        driver.findElement(By.xpath("//label[contains(text(),'Other')]")).click();
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1231243475");
        driver.findElement(By.cssSelector("#dateOfBirthInput")).click();
        selectOption(driver,"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]","August");

        Thread.sleep(3000);
        driver.close();

    }

    
    public static void selectOption(WebDriver driver,String Xpath,String option) {
        List <WebElement> choice = driver.findElements(By.xpath(Xpath)); 
        for(WebElement e : choice){
            System.out.println(e.getText());
            if(e.getText().contains(option)){
                e.click();
                break;
            }
        }
    }
}
    

