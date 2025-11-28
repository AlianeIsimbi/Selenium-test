package login;

import baseTests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {

    @Test
    public void loginTest(){
        var clickLogin = homePage.clickLogin();
        clickLogin.setEmailField("aliane.isimbi2023@kepler.org");
        clickLogin.setPasswordField("TheGym!");
        clickLogin.clickLoginButton();
        assertEquals(clickLogin.getLoggedInNavbar(), 10);
    }
}
