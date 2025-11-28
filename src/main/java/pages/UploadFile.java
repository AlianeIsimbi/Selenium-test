package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {
    private WebDriver driver;
    public By nameField = By.name("name");
    public By emailField = By.name("email");
    public By subjectField = By.name("subject");
    public By messageField = By.name("message");
    public By submitButton = By.name("submit");

    public UploadFile(WebDriver driver) {
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

    public AlertPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new AlertPage(driver);
    }
}
