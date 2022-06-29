import org.junit.jupiter.api.Test;

public class CreateAccountTest extends BaseTest {

    CreateAccountPage createTheAccount = new CreateAccountPage(driver);

    LoginOutPage outButton = new LoginOutPage(driver);

    @Test
    void createAccount() {

        createTheAccount.fillAccountForm();
        createTheAccount.userNameMethod("Jurgita3");
        createTheAccount.passwordMethod("01234567");
        createTheAccount.confirmPasswordMethod("01234567");
        createTheAccount.toRegisterMethod();
        outButton.logOutMethod();


    }


}
