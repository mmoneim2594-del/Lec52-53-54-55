package Login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getText().contains("You logged into a secure area!"),"The message is incorrect");
    }
}
