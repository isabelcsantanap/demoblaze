package co.uam.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage {
    public By loginOption = By.linkText("Log in");
    public By nameofuser = By.id("nameofuser");
    public By username = By.id("loginusername");
    public By password = By.id("loginpassword");
    public By loginButton =
            By.xpath("//button[text()='Log in']");
    public By product =
            By.xpath("//a[text()='Samsung galaxy s6']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password)
            throws InterruptedException {
        click(loginOption);
        Thread.sleep(2000);
        type(username, this.username);
        type(password, this.password);
        click(loginButton);
    }

    public String loginSuccessfulText() {
        return getText(nameofuser);
    }

    public void selectProduct()
    {
        click(product);
    }
}
