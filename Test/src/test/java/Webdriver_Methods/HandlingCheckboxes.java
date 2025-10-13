package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandlingCheckboxes {

    @Test
    public void handling_checkboxes() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox']"));

        /*

        Selecting all the checkboxes With Normal For loop
        for(int i=0; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }


        // Selecting all the checkboxes With For Each loop
        for (WebElement checkbox:checkboxes)

        {
            checkbox.click();
        }

        Thread.sleep(5000);
        // DeSelecting all the checkboxes With For Each loop
        for (WebElement checkbox:checkboxes)
        {
            checkbox.click();
        }



        // Selecting first 3 checkboxes With Normal For loop
       for (int i=0; i<3; i++)
        {
            checkboxes.get(i).click();
        }

       */

        // Selecting  and deselecting last 3 checkboxes With Normal For loop,  Formula - Starting index = total checkboxes - 3

        for (int i=4; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }

            Thread.sleep(3000);
            for (int i=4; i<checkboxes.size(); i++)
            {
            if (checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }

        }

        driver.close();

        }

    }

