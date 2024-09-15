package co.uam.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    public By addToCart =
            By.xpath("//a[text()='Add to cart']");
    public By cartOption =
            By.linkText("Cart");
    //public By productCart =
            //By.xpath("//td[text()='Samsung galaxy s6']");
    public By placeButton =
            By.xpath("//button[text()='Place Order']");
    public By name = By.id("name");
    public By country = By.id("country");
    public By city = By.id("city");
    public By card = By.id("card");
    public By month = By.id("month");
    public By year = By.id("year");
    public By purchaseButton =
            By.xpath("//button[text()='Purchase']");
    public By thanksMessage =
           By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addProduct(String name, String country, String city,
                           String card, String month, String year)     throws InterruptedException    {

       click(addToCart);
       Thread.sleep(2000);
       alertClick();
       Thread.sleep(2000);
       click(cartOption);

       //existProduct(productCart);

       click(placeButton);
       type(name, this.name);
       type(country, this.country);
       type(city, this.city);
       type(card, this.card);
       type(month, this.month);
       type(year, this.year);
       Thread.sleep(2000);

       click(purchaseButton);
       verifyPurchase(thanksMessage);
    }
}