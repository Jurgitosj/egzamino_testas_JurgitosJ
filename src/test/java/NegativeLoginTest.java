import org.junit.jupiter.api.Test;

public class NegativeLoginTest extends BaseTest {

    LoginPage loginNegativePage = new LoginPage(driver);

    LoginOutPage outButton = new LoginOutPage(driver);


    @Test
    void negativeLoginTest() {
        loginNegativePage.loginUsernameMethod("Jurgita");
        loginNegativePage.loginPasswordMethod("000");
        loginNegativePage.toLoginMethod();
        outButton.logOutMethod();
    }



}
