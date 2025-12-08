package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private WebDriver driver;
    private By alertLink1 = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By popUp = By.cssSelector("#result");

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }
    
    public void clickJsAlert(){
        driver.findElement(alertLink1).click();
    }

    public void clickOk(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText(){
        return driver.findElement(popUp).getText();
    }
}
