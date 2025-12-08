package alerts;

import BaseTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void alertTest(){
        var alertPage = homePage.clickAlert();
        alertPage.clickJsAlert();
        alertPage.clickOk();
        assertEquals(alertPage.getAlertText(),"You successfully clicked an alert", "Wrong alert message");

    }
}
