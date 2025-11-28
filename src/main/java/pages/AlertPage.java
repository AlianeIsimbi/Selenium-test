package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage{
    private WebDriver driver;
    protected By nameField = By.name("name");
    protected By emailField = By.name("email");
    protected By subjectField = By.name("subject");
    protected By messageField = By.name("message");
    protected By submitButton = By.name("submit");
    private By result = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void setNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setSubjectField(String subject){
        driver.findElement(subjectField).sendKeys(subject);
    }
    public void setMessageField(String message){
        driver.findElement(messageField).sendKeys(message);
    }

    public void getAlert(){
        driver.findElement(submitButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(result).getText();

    }
}
