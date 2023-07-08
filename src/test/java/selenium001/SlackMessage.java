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



public class SlackMessage {
    private WebDriver driver;
    private ChromeOptions ChromeOptions;
    private org.openqa.selenium.chrome.ChromeOptions Options;


    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions = new ChromeOptions();
       // WebDriver.Options.addPreference("dom.webnotifications.enabled",
         //       false);  // Disable desktop notifications

        driver = new ChromeDriver(Options);
    }

    @Test
    public void loginToSlack() {

        driver.get("https://slack.com/signin#/signin");


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        wait.until(ExpectedConditions.titleContains("Login | Slack"));

        String title = driver.getTitle();
        String Expected = "Login | Slack";
        Assert.assertEquals(title,Expected);


        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/span"),"sign in manually instead."));

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/span/a")).click();
        driver.findElement(By.xpath("//*[@id=\"domain\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"domain\"]")).sendKeys("creativecodingcollect");
        driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"page_contents\"]/div/div/div[2]/div[3]/div[4]/span/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ekuyesweet5@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("june2323");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"signin_btn\"]")).click();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/p/a")).click();


        driver.findElement(By.xpath("//*[@id=\"C058KJYKP24\"]/div/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]")).click();

        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]"));

        element.click();
        element.sendKeys("Hello this is automated message: DID YOU GUYS FINISH HOMEWORK?");
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}




//            public class class1 {
//                public static void main(String[] args) throws InterruptedException {
//                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\name\\Desktop\\chromedriver.exe");
//                    ChromeDriver driver = new ChromeDriver();
//                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//                    driver.get("https://accounts.Gmail.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.Gmail.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//                    driver.findElement(By.id("identifierId")).sendKeys("ekuyesweet5@gmail.com");
//                    driver.findElement(By.id("identifierNext")).click();
//                    driver.findElement(By.xpath("//input[@aria-label='*********' and @name='password']")).sendKeys("********");
//                    Thread.sleep(200);
//                    driver.findElement(By.id("passwordNext")).click();




