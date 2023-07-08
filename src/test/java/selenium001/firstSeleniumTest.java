package selenium001;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class firstSeleniumTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testGoogleSearch() {
        //open the browser and navigate to the Google website
        driver.get("https://www.google.com");

        //find the  search input element and enter a search query
        driver.findElement(By.name("q")).sendKeys("yahoo");

        //press Enter to perform the search
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);



        //wait for the results to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Yahoo"));

        // Click on the first search result
        driver.findElement(By.className("LC20lb")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("_yb_hwn0z")).click();
      //  driver.findElement(By.className ("_yb_6k8xk")).click();
                driver.findElement(By.className ("Pure-button")).click();


        //Assert the results
        String ExpectedTitle = "yahoo ";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, ExpectedTitle);

        driver.findElement(By.xpath("/html/body/div[6]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();


        //Assert the results
        ExpectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, ExpectedTitle);

      //  public void tearDown() {
            //close the browser
         //   driver.close();
        }

    }



