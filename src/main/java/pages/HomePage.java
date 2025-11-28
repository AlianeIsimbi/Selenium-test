package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginLink = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    private By HoverItems = By.className("col-sm-4");

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public LoginPage clickLogin(){
            driver.findElement(loginLink).click();
            return new LoginPage(driver);
        }

        public HoverEvent hoverEvents(){
            driver.findElement(HoverItems);
            return new HoverEvent(driver);
        }

}
