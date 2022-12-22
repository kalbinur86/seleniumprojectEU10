package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankForceNavigations {
    public static void main(String[] args) {


        // TC #3: Back and forth navigation
        WebDriverManager.chromedriver().setup();


        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.className("gb_j"));
        gmail.click();

        // 4- Verify title contains:
        // Expected: Gmail
        String expectedTitle = "Gmail";
        String actuallyTitle = driver.getTitle();

        if (actuallyTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

        // 5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Google

        String expectedTitle1 = "Google";
        String actuallyTitle1 = driver.getTitle();

        if (actuallyTitle1.equals(expectedTitle1)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

        driver.quit();
    }
}