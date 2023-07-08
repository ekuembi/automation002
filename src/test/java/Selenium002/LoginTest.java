package Selenium002;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage =new LoginPage(driver);
    }
    @Test
    public  void testLogin(){
        loginPage.login("Admin","admin123");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
