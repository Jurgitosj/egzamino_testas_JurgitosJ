import org.junit.jupiter.api.Test;

public class NegativeCreateAccountTest extends BaseTest{

    CreateAccountPage createNegativeAccount = new CreateAccountPage(driver);


    LoginOutPage outButton = new LoginOutPage(driver);


    @Test
    void createNegativeAccountTest() {

        createNegativeAccount.fillAccountForm();
        createNegativeAccount.userNameMethod("1");
        createNegativeAccount.passwordMethod("012");
        createNegativeAccount.confirmPasswordMethod("012");
        createNegativeAccount.toRegisterMethod();
        outButton.logOutMethod();


    }




}
