package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {

     // Practice check boxes
     //1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

      // We have to locate checkboxes
        WebElement checkboxes1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkboxes2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

     //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkboxes1.isSelected() = " + checkboxes1.isSelected()); // false means not selected

     //3. Confirm checkboxes #2 is SELECTED by default
        System.out.println("checkboxes2.isSelected() = " + checkboxes2.isSelected()); // true

     //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkboxes1.click();


     //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkboxes2.click();

     //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkboxes1.isSelected(),expected ture = " + checkboxes1.isSelected());

     //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkboxes2.isSelected(),expected false = " + checkboxes2.isSelected());


    }
}
