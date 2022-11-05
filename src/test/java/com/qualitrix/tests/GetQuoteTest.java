package com.qualitrix.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.datatype.Duration;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class GetQuoteTest {

    WebDriver driver;

    @Test

    public void checkQuoteTitle(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        driver.get("https://qualitrix.com/get-a-quote/");

        System.out.println("Current Title "+driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("qualitrix.com"));


    }

    @Test

    public void getQuote(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        // driver= new ChromeDriver();

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
