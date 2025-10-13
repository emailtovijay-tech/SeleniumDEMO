package BTTLoginPKG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.Locale;

public class BTTLogin {
    WebDriver driver;
    WebElement Close_btn, Usericon, Logoutoption, elementlink;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br)
    {
        switch (br.toLowerCase(Locale.ROOT))
        {
            case "chrome" : driver = new ChromeDriver(); break;
            //case "firefox" : driver = new FirefoxDriver(); break;
            //  case "edge" : driver = new EdgeDriver(); break;
            // default : System.out.println("Invalid browser"); return;

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test (dataProvider = "dp")
    void testlogin(String email, String pwd) throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://portal.bluetriangletech.com/btportal/web/index.php?r=overview-dashboard/overview");
        driver.manage().window().maximize();
        driver.findElement(By.id("loginform-username")).sendKeys(email);
        driver.findElement(By.id("loginform-password")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[@name='login-button']")).click();
        Thread.sleep(2000);
        Close_btn = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@class='modal-header flex']//*[name()='svg']"))));
        Close_btn.click();
        Thread.sleep(3000);
        Usericon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toggle-user")));
        Usericon.click();
        Logoutoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
        Logoutoption.click();
        Thread.sleep(5000);
        elementlink = driver.findElement(By.xpath("//a[text()=\"Don't have an account?\"]"));
        Assert.assertTrue(elementlink.isDisplayed(), "Element is not displayed!");
    }

    @AfterClass
    void tearDown()
        {
            driver.close();
        }
  @DataProvider (name = "dp")
   Object [][] logindata ()
        {
            Object data[][] =
                    {
                            {"aloha_kamal", "0A4n74euSEE!7b&3"},
                    };
            return data;
        }

    }



