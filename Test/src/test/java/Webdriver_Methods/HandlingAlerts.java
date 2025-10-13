package Webdriver_Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

@Test
public class HandlingAlerts {

    public void Handling_Alerts() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

      /*
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        // Handling Simple alert with OK button only

        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Thread.sleep(3000);
        Alert normalAlert =  driver.switchTo().alert();
        System.out.println(normalAlert.getText());
        normalAlert.accept();
        driver.close();

        // Handling confirmation alert with OK and Cancel buttons

        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        Thread.sleep(3000);
        Alert normalAlert =  driver.switchTo().alert();
        System.out.println(normalAlert.getText());
        normalAlert.accept();
        normalAlert.dismiss();
        driver.close();

       // Handling Prompt alert with OK and Cancel and Text field

        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Thread.sleep(3000);
        Alert normalAlert =  driver.switchTo().alert();
        System.out.println(normalAlert.getText());
        normalAlert.sendKeys("Vijay");
        normalAlert.accept();
        driver.close();

        // Handling alert with explicit wait

        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert promptlaert = mywait.until(ExpectedConditions.alertIsPresent());
        promptlaert.accept();

        */

       // Handling Authentication alert with injecting the username and password with the URL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }



}
