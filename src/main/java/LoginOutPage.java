import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOutPage extends BasePage {

    public LoginOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/nav/div/ul[2]/a")
    public WebElement logOut;

    void logOutMethod() {
        logOut.click();
    }
}
