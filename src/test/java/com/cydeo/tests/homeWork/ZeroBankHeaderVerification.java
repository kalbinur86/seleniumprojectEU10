package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        // driver.get("http://zero.webappsecurity.com/login.html");
        driver.navigate().to("http://zero.webappsecurity.com/login.html");


        //3. Verify header text
        //Expected: “Log in to ZeroBank "
        String actualHeaderText = driver.findElement(By.className("page-header")).getText();
        String expectedHeaderText = "Log in to ZeroBank";


        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Test verification is PASSED! actual : "+actualHeaderText);
        }else {
            System.out.println("Test verification is FAILED! actual : "+actualHeaderText);
        }

        driver.close();







    }
}
