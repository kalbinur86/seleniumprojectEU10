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

       if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
           System.out.println("Label verificatin PASSED!");
       }else {
           System.out.println("Label verification FAILED!");
       }

       // 4- Verify “forgot password” link text is as expected:
       // Expected: Forgot your password?
       WebElement forgetPasswordLinkText = drive.findElement(By.className("login-link-forgot-pass"));

       String expectedForgetPasswordLinkText = "Forget your password?";
       String actuallyForgetPasswordLinkText = forgetPasswordLinkText.getText();

       if (actuallyForgetPasswordLinkText.equals(expectedForgetPasswordLinkText)){
           System.out.println("Forget password link verification PASSED!");
       }else {
           System.out.println("Forget password link verification FAILED!");
       }


       // 5- Verify “forgot password” href attribute’s value contains expected:
       // Expected: forgot_password=yes
       String expectedInHref = " forgot_password=yes";
       String actualHrefAttributeValue = forgetPasswordLinkText.getAttribute("href");

       System.out.println("actualHrefAttributeValue"+actualHrefAttributeValue);


      if (actualHrefAttributeValue.contains(expectedInHref)){
          System.out.println("HREF attribute value verification PASSED!");
      }else {
          System.out.println("HREF attribute value verification FAILED!");
      }







    }
}
