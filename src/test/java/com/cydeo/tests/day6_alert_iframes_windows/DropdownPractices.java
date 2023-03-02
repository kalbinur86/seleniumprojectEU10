package com.cydeo.tests.day6_alert_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    @Test
    public void dropdown_task5() throws InterruptedException {

      //  1. Open Chrome browser
      //  2. Go to http://practice.cybertekschool.com/dropdown
        WebDriver drive = WebDriverFactory.getDriver("chrome");
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        drive.get("http://practice.cybertekschool.com/dropdown");

        // we locate the dropdown and it is ready to use
        Select stateDropdown = new Select(drive.findElement(By.xpath("//select[@id='state']")));

      //  3. Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

      //  4. Select Virginia
        stateDropdown.selectByValue("VA");

      //  5. Select California
        stateDropdown.selectByIndex(5);

      //  6. Verify final selected option is California.

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);



      //  Use all Select options. (visible text, value, index)


    }
}
