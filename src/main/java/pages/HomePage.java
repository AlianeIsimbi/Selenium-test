package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginLink = By.cssSelector("#content > ul > li:nth-child(21) > a");
    private By alertLink = By.cssSelector("#content > ul > li:nth-child(29) > a");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickToLogin(){
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }
    public AlertPage clickAlert(){
        driver.findElement(alertLink).click();
        return new AlertPage(driver);
    }
}
