package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlingWindows
{
    @Test
    public void methods()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> WindowsIDs = driver.getWindowHandles();  // Storing windows id in a set

        List <String> WindowsList = new ArrayList<>(WindowsIDs);  // converting set into collection because there is no get command in set and we can extract each window id from get
        String Parentid = WindowsList.get(0);
        String childid = WindowsList.get(1);

        driver.switchTo().window(childid);  // Used switchto().window() for switching between the tabs
        System.out.println(driver.getTitle());

        driver.switchTo().window(Parentid);
        System.out.println(driver.getTitle());

        driver.quit();

        // Handling multiple windows so we can use for each loop
        for (String winid : WindowsList)
        {
            String title =  driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if (title.equals("Human Resources Management Software | HRMS | OrangeHRM"))
            {
                driver.close();
            }
        }


        // // Open new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.TimesofIndia.com");

        // For new browser window:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com");









    }
}
