package co.uam.automation.pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class LoginTest {
    private WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;

    @BeforeMethod
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.visit("https://www.demoblaze.com/");;
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void loginUser() throws InterruptedException {
        loginPage.login("username", "password");
        Thread.sleep(2000);
        loginPage.selectProduct();
        Thread.sleep(2000);

        productPage = new ProductPage(driver);

        productPage.addProduct("Isabel", "Colombia",
                "Manizales", "0000", "Septiembre", "2024");
        Thread.sleep(2000);
    }
}
