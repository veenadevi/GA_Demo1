package com.qualitrix.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetQuoteTest {



    @Test

    public void doSetup(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://qualitrix.com/get-a-quote/");

        System.out.println("Current Title "+driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("qualitrix.com"));


    }

}
