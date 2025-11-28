package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginLink = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public LoginPage clickLogin(){
            driver.findElement(loginLink).click();
            return new LoginPage(driver);
        }

}
