import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="/html/body/div/form/div/button")
    public WebElement login;

    @FindBy(xpath="/html/body/div/form/div/input[1]")
    public WebElement loginUsername;

    @FindBy(xpath = "/html/body/div/form/div/input[2]")
    public WebElement loginPassword;

    void loginUsernameMethod(String value) {
        loginUsername.sendKeys(value);
    }

    void loginPasswordMethod(String value) {
        loginPassword.sendKeys(value);
    }

    void toLoginMethod() {
        login.click();}


}