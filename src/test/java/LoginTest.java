import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{

    LoginPage loginToPage = new LoginPage(driver);

    LoginOutPage outButton = new LoginOutPage(driver);

    @Test
    void loginPage() {
        loginToPage.loginUsernameMethod("Jurgita1");
        loginToPage.loginPasswordMethod("01234567");
        loginToPage.toLoginMethod();
        outButton.logOutMethod();
    }


}
