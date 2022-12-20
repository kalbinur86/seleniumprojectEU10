package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {


        // TC #1: Yahoo Title verification
        // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        // 1. open Chrome browser
        WebDriver driver = new ChromeDriver();

        // make our page fullscreen
        driver.manage().window().maximize();

        // 2. go to https:// www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. verify title:

        //Expected : Yahoo
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports&Videos";

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification Passed!");
        } else {
            System.out.println("Title is Not as expected. Verification FAILED!");
        }




    }
}
