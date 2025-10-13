package Handling_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class Handling_StaticTables
{
    @Test
    public void Static_Tables() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Select frompikcer = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        frompikcer.selectByVisibleText("Boston");
        Thread.sleep(2000);
        Select Topicker = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        Topicker.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        // Find total number of Rows and Columns from the Table

        int Rows_1 = driver.findElements(By.xpath("//table [@class = 'table']//tr")).size();
        int Cols_1 = driver.findElements(By.xpath("//table [@class = 'table']//th")).size();
        System.out.println("Number of Rows in Table:" +Rows_1);
        System.out.println("Number of Columns in Table:" +Cols_1);


        // Instead of writing the above xpath, We can also write the tag name
        int Rows = driver.findElements(By.tagName("tr")).size();
        int Cols = driver.findElements(By.tagName("th")).size();
        System.out.println("Number of Rows in Table:" +Rows);
        System.out.println("Number of Columns in Table:" +Cols);

        // Print 5th row and 2nd column data from the table

        String specificdata = driver.findElement(By.xpath("//table [@class = 'table']//tr[5]//td[2]")).getText();
        System.out.println("Specific data from Table eg - 5th row and 2nd column : " +specificdata);

        //For printing the table header
        System.out.println("Flight #" + "Airline" + "Departs: Portland" + "Arrives: Rome" + "Price");

        // Read all data from the Table
        for (int r = 1; r<Rows; r++)
        {
            for (int c = 1; c<=Cols; c++)
            {
            String AllData = driver.findElement(By.xpath("//table [@class = 'table']//tr["+r+"]//td["+c+"]")).getText();
            System.out.print(AllData+ "\t");
            }
            System.out.println();
        }


        // Chose the Lowset price flight

        for(int i = 1; i<Cols; i++)
        {
            String price = driver.findElement(By.xpath("//table//tr["+i+"]//td[6]")).getText();

            if (price.equals("$200.98"))
            {
                driver.findElement(By.xpath("//table//tr[3]//td[1]")).click();
                break;
            }


        }

        String Label1 =  driver.findElement(By.xpath("//h2")).getText();
        Assert.assertEquals(Label1, "Your flight from TLV to SFO has been reserved.");
        driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

        String Label2 =  driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(Label2, "Thank you for your purchase today!", "❌ Purchase confirmation message did not match!");

        }



    }
