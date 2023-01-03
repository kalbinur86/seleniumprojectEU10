package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
       //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
       // 1- Open a Chrome browser
       // 2- Go to: https://login1.nextbasecrm.com/
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://login1.nextbasecrm.com/");


       // 3- Verify “remember me” label text is as expected:ü
       // Expected: Remember me on this computer
       WebElement rememberMeLabel = drive.findElement(By.className("login-item-checkbox-label"));

       String expectedRememberMeLabel = " Remember me on this computer";
       String actualRememberMeLabel = rememberMeLabel.getText();

       // 4- Verify “forgot password” link text is as expected:
       // Expected: Forgot your password?
       // 5- Verify “forgot password” href attribute’s value contains expected:
       // Expected: forgot_password=yes











    }
}
