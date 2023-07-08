package selenium001;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.List;
import org.testng.annotations.BeforeMethod;
    public class ParallelTest {
        private WebDriver driver;

        @BeforeMethod
        @Parameters("browser")
        public void setup(String browser) {
            switch (browser) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                }
//                case "firefox" -> {
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                    driver.manage().window().maximize();
               // }
                case "Edge" ->{
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                }

                default -> throw new IllegalArgumentException("Invalid browser specified: " + browser);
            }
        }

        @Test
        public void FillMyForm() {

            driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
            String pageTitle = driver.getTitle();
            Assert.assertEquals("Selenium Practice Form", pageTitle);

            ElementRepository repo = new ElementRepository(driver);

            repo.getFirstNameField().sendKeys("Ekuye");
            repo.getLastNameField().sendKeys("Embiale");
            repo.getPhoneField().sendKeys("202-280-3556");
            repo.getCountryField().sendKeys("USA");
            repo.getCityField().sendKeys("Woodbridge");
            repo.getEmailField().sendKeys("ekuyesweet5@gmail.com");
            WebElement genderRadioButton = repo.getGender();


            Actions actions = new Actions(driver);
            actions.moveToElement(genderRadioButton).click().perform();

           // JavascriptExecutor js =(JavascriptExecutor)driver;
           // js.executeScript(Script:"Window.scrollBy(0,document.body.scrollHeight)");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"q15\"]/table/tbody")));

            WebElement checkboxesContainer = driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr"));
            List<WebElement> checkboxes = checkboxesContainer.findElements(By.tagName("input"));

            for (WebElement checkbox : checkboxes) {
                String labelText = checkbox.getAttribute("value");
                if (!labelText.equalsIgnoreCase("CheckBox-0") && !labelText.equalsIgnoreCase("CheckBox-6")) {
                    checkbox.click();
                }
            }
            checkboxesContainer = driver.findElement(By.xpath("//tbody"));
            checkboxes = checkboxesContainer.findElements(By.tagName("input"));
            for (WebElement checkbox : checkboxes) {
                String labelText = checkbox.getAttribute("value");
                if (!labelText.equalsIgnoreCase("RESULT_CheckBox-8_0") && !labelText.equalsIgnoreCase("RESULT_CheckBox-8_6")) {
                    checkbox.click();
                }
            }

            WebElement dropdown = driver.findElement(By.id("RESULT_RadioButton-9"));
            Select select = new Select(dropdown);
            select.selectByValue("Radio-1");

            repo.FileUpload().sendKeys("C:/Users/12022/Desktop");

            repo.submitButton().click();

            String title = driver.getTitle();
            String ExpectedTitle = "Error";
            Assert.assertEquals(title,ExpectedTitle);
            System.out.println(title);

            String expectedTitle = null;

            String browserName = (( RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase();
            switch (browserName) {
                case "chrome":
                case "safari":
                    expectedTitle = "Selenium Practice Form";
                    break;
                case "firefox":
                    expectedTitle = "Error";
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported Browser: " + browserName);
            }

            Assert.assertEquals(title, expectedTitle);
        }


        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

    }

