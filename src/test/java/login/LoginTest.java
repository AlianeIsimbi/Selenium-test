package login;

import BaseTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        var loginPage = homePage.clickToLogin();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var securePage = loginPage.clickSecureArea();
        String result = securePage.successfulLogin();
        assertTrue(result.contains("You logged into a secure area!"), "Login failed");
    }
}
