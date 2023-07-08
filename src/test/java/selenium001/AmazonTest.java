package selenium001;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.FluentWait;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

        import java.security.Key;
        import java.time.Duration;
        import java.util.List;

public class AmazonTest {
    //google
    // navigate to amazon
    // wait for amazon.com to load
    // assert if you are on amazon.com
    // search for socks, shoes, books, hats on amazon
    // count how many socks are displayed on the page
    // assert the expected with actual number
    // do all this with xpath and creating WebElements..
    private WebDriver driver;


        @BeforeMethod
        public void SetUP() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void AmazonSearch() {

            //get to URL
            driver.get("https://www.google.com");
            //Navigate to Amazon.com
            driver.navigate().to("https://www.amazon.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Assert if we are on the correct URL
            String url = driver.getCurrentUrl();
            String expectedURL = "https://www.amazon.com/";
            Assert.assertEquals(url, expectedURL);
//Assert the title of the page
            String Title = driver.getTitle();
            String amazonTitle = "Amazon.com. Spend less. Smile more.";
            Assert.assertEquals(amazonTitle, Title);

            //Store WebElements

            WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

            //search for socks

            searchBar.click();
            searchBar.sendKeys("socks");
            searchBar.sendKeys(Keys.ENTER);

            //wait until the socks are displayed
            FluentWait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofMillis(500));

            //Assert is socks are displayed
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[3]"), "socks"));

            String actual = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
            String result = "\"socks\"";
            Assert.assertEquals(actual, result);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            List<WebElement>SockElement=driver.findElements(By.cssSelector(".s-result-item"));
            int total =SockElement.size();
            System.out.println(total);

        }
private static int countSocks(List<WebElement> SockElement){
            int count =0;
            for (WebElement item: SockElement){
                if (item.getText().contains("sock")){
                    count++;
                }
            }return count;
}

        @AfterMethod
        public void Clean() {
            driver.quit();

        }

    }

