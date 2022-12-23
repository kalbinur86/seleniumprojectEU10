package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLoginVerification {
    public static void main(String[] args) {

        //TC #2: Facebook incorrect login title verification
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement usernameBox = driver.findElement(By.id("email"));
        usernameBox.sendKeys("incorrect username");

        //4. Enter incorrect password
        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("incorrect password");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        //5. Verify title changed to:
        //Expected: “Log into Facebook "
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

       if (expectedTitle.equals(actualTitle)){
            System.out.println(" Title verification is PASSED!" + " actualTitle is " + actualTitle);
        }else {
            System.out.println("Title verification is FAILED" + " actualTitle is " + actualTitle);
        }

       driver.close();

    }
}
