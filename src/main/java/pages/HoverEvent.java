package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverEvent {
    private WebDriver driver;
    private By hoverableItems = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items");



    public HoverEvent(WebDriver driver) {
        this.driver = driver;
    }

    public String hoverOverItem(int index){
        WebElement item = driver.findElements(hoverableItems).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(item).perform();
        return item.getCssValue("background-color");
    }


}
