package Parallelexe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class Parellel {

    WebDriver driver;

    @BeforeClass
    @Parameters ({"browser"})
    void setup(String br) throws InterruptedException
    {
        switch (br.toLowerCase(Locale.ROOT))
        {
            case "chrome" : driver = new ChromeDriver(); break;
            case "firefox" : driver = new FirefoxDriver(); break;
            case "edge" : driver = new EdgeDriver(); break;
            default : System.out.println("Invalid browser"); return;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.orangehrm.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    void title()
    {
        Assert.assertEquals(driver.getTitle(),"Human Resources Management Software | HRMS | OrangeHRM");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }


}
