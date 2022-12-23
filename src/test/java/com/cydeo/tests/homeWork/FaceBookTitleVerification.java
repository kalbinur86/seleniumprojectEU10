package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTitleVerification {
    public static void main(String[] args) {

        //TC #1: Facebook title verification
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up "
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification is PASSED! actual : " + actualTitle);
        } else {
            System.out.println("Title verification is FAILED! actual :" + actualTitle);
        }

        driver.close();

    }

}
