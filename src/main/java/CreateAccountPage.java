import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver) {
        super(driver); }

    @FindBy(xpath="/html/body/div/form/div/h4/a")
    public WebElement createAccountButton;

    @FindBy(xpath="//*[@id=\"username\"]")
    public WebElement userName;



    @FindBy(xpath="//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"passwordConfirm\"]")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    public WebElement submitRegistrationButton;


    void fillAccountForm() {
        createAccountButton.click();}

    void userNameMethod(String value) {
        userName.sendKeys(value);}

    void passwordMethod(String value) {
        password.sendKeys(value);}

    void confirmPasswordMethod(String value) {
        passwordConfirm.sendKeys(value);}

    void toRegisterMethod() {
        submitRegistrationButton.click();}


}

