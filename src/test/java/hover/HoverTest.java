package hover;

import baseTests.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverEvent;

import static org.testng.Assert.assertEquals;

public class HoverTest extends BaseTests {

    @Test
    public void HoverTest() {
        var hoverEvent = homePage.hoverEvents();
        assertEquals(hoverEvent.hoverOverItem(1), "rgba(0, 0, 0, 0)", "Hovering unsuccessful");
    }
}
