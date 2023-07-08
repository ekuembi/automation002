package Selenium002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.Set;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("txtUsername");

    private By PasswordField = By.id("txtPassword");

    private By LoginButton = By.id("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys();
         By userNameField = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");

    }

    public void setPassword(String password) {
        driver.findElement(PasswordField).sendKeys("admin123");
    }
    public void clickLoginButton() {
        driver.findElement(LoginButton).click();
    }
public void login(String username,String password){
    setUsername(username);
    setPassword(password);
    clickLoginButton();
}

    }
