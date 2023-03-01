package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //Do browser driver setup
        //Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Maximize the page
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get "https://google.com"

        driver.get("https://google.com");

    }

    @Test
    public void selenium_test(){


        //Assert: title is "Google"

        Assert.assertEquals(driver.getTitle(),"Google");


       /* String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle,expectedTitle,"Title is not matching here."); */

      driver.close();

    }


}
