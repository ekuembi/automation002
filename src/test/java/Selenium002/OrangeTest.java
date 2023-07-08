//package Selenium002;
//
//
//import Pages.PIMPage;
//import Pages.LoginPage;
//import Setup.Setup;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class OrangeTest { extends Setup {
//        LoginPage dashboardPage;
//        LoginPage loginPage;
//
//        @Test(priority = 1)
//        public void doFailedLogin() throws InterruptedException {
//            loginPage = new LoginPage(driver);
//            driver.get("https://opensource-demo.orangehrmlive.com");
//            loginPage.doLogin("Admin", "wrongPassword");
//            String expectedText = "Invalid credentials";
//            String actualText = driver.findElement(By.className("oxd-alert-content-text")).getText();
//            Assert.assertTrue(actualText.contains(expectedText));
//            Thread.sleep(2000);
//        }
//        @Test(priority = 2)
//        public void doLogin() throws InterruptedException {
//            loginPage = new LoginPage(driver);
//            driver.get("https://opensource-demo.orangehrmlive.com");
//            loginPage.doLogin("Admin", "admin123");
//            Thread.sleep(5000);
//            String actualUrl = driver.getCurrentUrl();
//            String expectedUrl = "dashboard";
//            Assert.assertTrue(actualUrl.contains(expectedUrl));
//        }
//
//        @Test(priority = 3)
//        public void ifProfileImageExist() {
//            boolean imageExist = driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed();
//            Assert.assertTrue(imageExist);
//        }
//
//        @Test(priority = 4)
//        public void doLogout() {
//            dashboardPage = new PIMPage(driver);
//            dashboardPage.profileImage.click();
//            dashboardPage.logoutLink.click();
//        }
//    }
//}
