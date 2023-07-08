package selenium001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SurveyTest {

    private WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }@Test
    public void testGoogleSearch() {
        //open the browser and get to url for Google
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Ekuye");
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Embiale");
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("2022803556");
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("USA");
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Woodbridge");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("ekuyesweet5@gmail.com");
        driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']")).click();
        driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_1']")).click();
        driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_3']")).click();
        driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_5']")).click();
        driver.findElement(By.xpath("//select [@class='drop_down']")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//option [@value='Radio-0']")).click();
//        driver.findElement(By.id("FSsubmit")).click();
    }@AfterMethod
    public void clean(){
        driver.close();
        driver.quit();
    }
}









