package com.qualitrix.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetQuoteTest {

    WebDriver driver;

    @Test

    public void checkQuoteTitle(){
        WebDriverManager.chromedriver().setup();

         driver= new ChromeDriver();

        driver.get("https://qualitrix.com/get-a-quote/");

        System.out.println("Current Title "+driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("qualitrix.com"));


    }

    @Test

    public void getQuote(){
        WebDriverManager.chromedriver().setup();

         driver= new ChromeDriver();

        driver.get("https://qualitrix.com/get-a-quote/");

        driver.findElement(By.cssSelector("#fullname")).sendKeys("veena");

        System.out.println("Current Title "+driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("qualitrix.com"));


    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
