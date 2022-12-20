package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of the Selenium Webdriver
        WebDriver driver = new ChromeDriver();

        //3-go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().refresh();


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        System.out.println("driver.getTitle()= " + driver.getTitle());

        // String currentTitle=driver.getTitle();
        // System.out.println("currentTitle="+currentTitle);


        // get the current URL using selenium
        String currentURL = driver.getCurrentUrl();

        //this will close the currently opened window
        driver.close();


        //this will close all of the opened windows
        driver.quit();



    }
}
