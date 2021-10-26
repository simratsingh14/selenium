package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;


public class form {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js  = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement name = driver.findElement(By.cssSelector("#firstName"));
        name.sendKeys("piggy \t sharma");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("koko@yomail.com");
        driver.findElement(By.xpath("//label[contains(text(),'Other')]")).click();
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1231243475");
        // driver.findElement(By.cssSelector("#dateOfBirthInput")).click();
        // Select month = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")));
        // month.selectByValue("4");  // Selects may
        // Select year = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
        // year.selectByValue("2017");
        // WebElement date = driver.findElement(By.cssSelector("//input[@id='dateOfBirthInput']"));
        // date.clear();
        // date.sendKeys("12 Nov 1936");
        driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("1313,Ataffa,fadasda,Sec-133,Kyoshi Island");
        
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
        Thread.sleep(5000);
        driver.close();

    }

    
    public static void selectOption(WebDriver driver,String Xpath,String option) {
        List <WebElement> choice = driver.findElements(By.xpath(Xpath)); 
        for(WebElement e : choice){
            // System.out.println(e.getText());
            if(e.getText().contains(option)){
                // System.out.println(e.getText());
                e.click();
                break;
            }
        }
    }
}
    

