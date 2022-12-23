package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {

    public static void main(String[] args) throws InterruptedException {


        // TC #1: Etsy Title Verification
        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        Thread.sleep(1500);
        // 3. Search for “wooden spoon”
        //WebElement searchBox = driver.findElement(By.name("search_query"));
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);


        Thread.sleep(1500);
        // 4. Verify title:
        // Expected: “Wooden spoon | Etsy
        String expectedTitle = "Wooden spoon | Etsy";
        String actuallyTitle= driver.getTitle();

        if (expectedTitle.equals(actuallyTitle)){
            System.out.println("Title verification PASSED!");
        } else{
            System.out.println("Title verification FAILED!");
        }

      driver.close();
    }
}
